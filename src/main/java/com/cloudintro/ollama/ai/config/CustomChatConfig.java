package com.cloudintro.ollama.ai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomChatConfig {

    @Bean(name = "deepSeekChatClient")
    public ChatClient deepSeekChatClient(OllamaChatModel model) {
        return ChatClient.builder(model).build();
    }

    @Bean(name = "openAiChatClient")
    public ChatClient openAiChatClient(OpenAiChatModel model) {
        return ChatClient.builder(model).build();
    }
}
