package com.chatbot.demo.controller;


import com.chatbot.demo.model.ChatRequest;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.Generation;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AIChatBotController {

    private final ChatClient chatClient;

    public AIChatBotController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }


    @PostMapping("/firstChat")
    public List<Generation> firstChat(@RequestBody ChatRequest chatRequest) {
        PromptTemplate promptTemplate = new PromptTemplate(chatRequest.getRequestNote());
        Prompt prompt = promptTemplate.create();
        ChatClient.ChatClientRequest.CallPromptResponseSpec responseSpec = chatClient.prompt(prompt).call();
        return responseSpec.chatResponse().getResults();
    }
}
