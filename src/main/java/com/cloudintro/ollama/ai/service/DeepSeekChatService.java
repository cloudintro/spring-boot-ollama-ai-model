package com.cloudintro.ollama.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

@Service
public class DeepSeekChatService {

    private ChatClient deepSeekChatClient;

    public DeepSeekChatService(@Qualifier("deepSeekChatClient") ChatClient deepSeekChatClient) {
        this.deepSeekChatClient = deepSeekChatClient;
    }
    

    public String getResponse(String prompt) {
        // call the chat client to get the response
        return deepSeekChatClient.prompt(prompt).call().content();
    }


    public Flux<String> getResponseStream(String prompt) {
        // call the chat client to get the response
        return deepSeekChatClient.prompt(prompt).stream().content();
    }

}
