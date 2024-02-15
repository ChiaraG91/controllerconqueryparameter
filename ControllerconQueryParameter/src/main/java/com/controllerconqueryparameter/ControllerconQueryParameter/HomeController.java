package com.controllerconqueryparameter.ControllerconQueryParameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HomeController {

    @GetMapping("/ciao")
    public String question(
            @RequestParam(value = "nome", required = true) String nome,
            @RequestParam(value = "provincia", required = true) String provincia)
    {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
