package com.marianobonansea.chat_app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.marianobonansea.chat_app.model.ChatMessage;

/**
 * Controller that handles chat-related operations.
 * Manages message sending and chat view rendering.
 * This controller provides endpoints for both WebSocket messaging and HTTP
 * requests.
 * 
 * @author Mariano Bonansea
 * @version 1.0
 */
@Controller
public class ChatController {

    /**
     * Handles incoming messages and forwards them to all subscribed clients.
     * Messages are received through WebSocket connection and broadcast to all
     * subscribers.
     * 
     * @param message The received chat message containing sender and content
     * @return The message to be sent to all clients
     */
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    /**
     * Handles the root path and redirects to the chat interface.
     * This endpoint serves as the entry point of the application.
     * 
     * @return A redirect instruction to the chat endpoint
     */
    @GetMapping("/")
    public String redirectToChat() {
        return "redirect:/chat";
    }

    /**
     * Returns the chat view template.
     * This endpoint renders the main chat interface where users can exchange
     * messages.
     * 
     * @return The name of the chat view template to be rendered
     */
    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}
