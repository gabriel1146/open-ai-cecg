package br.com.open.ai.cecg.OpenAi.http.impl;

import br.com.open.ai.cecg.OpenAi.http.Data.request.ScienceFictionRequestDTO;
import br.com.open.ai.cecg.OpenAi.http.OpenAIcontroller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/openai-cecg")
public class OpenAIControllerimpl implements OpenAIcontroller {


    @Override
    @PostMapping(value = "/science-fiction")
    @ResponseStatus(HttpStatus.OK)
    public String generateScienceFiction(ScienceFictionRequestDTO requestDTO) {
        return null;
    }
}
