package com.cloudintro.ollama.ai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudintro.ollama.ai.service.DeepSeekChatService;

import jakarta.websocket.server.PathParam;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;

@Log4j2
@RestController
@RequestMapping("/api")
public class DeepSeekChatController {

    private final DeepSeekChatService deepSeekChatService;

    public DeepSeekChatController(DeepSeekChatService deepSeekChatService) {
        this.deepSeekChatService = deepSeekChatService;
    }

    @GetMapping("/chat")
    public String chat(@PathParam(value = "prompt") String prompt) {
        log.info("Received prompt: {}", prompt);
        try {
            // call the chat client to get the response
            return deepSeekChatService.getResponse(prompt);
        } catch (Exception e) {
            log.error("Error occurred while processing the prompt: {} {}", prompt, e.getMessage());
            return "Error occurred while processing the prompt" + e.getMessage();
        }
    }

    @GetMapping("/chat/stream")
    public Flux<String> chatStream(@PathParam(value = "prompt") String prompt) {
        log.info("Received prompt: {}", prompt);
        try {
            // call the chat client to get the response
            return deepSeekChatService.getResponseStream(prompt);
        } catch (Exception e) {
            log.error("Error occurred while processing the prompt: {} {}", prompt, e.getMessage());
            return Flux.just("Error occurred while processing the prompt" + e.getMessage());
        }
    }
   
}
