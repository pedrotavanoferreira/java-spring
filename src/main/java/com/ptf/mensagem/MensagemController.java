package com.ptf.mensagem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemController {
   @RequestMapping
   public String geraMensagem(){
       return  "Olá mundo";
   }
}
