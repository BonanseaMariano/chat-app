package com.marianobonansea.chat_app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.marianobonansea.chat_app.model.ChatMessage;

/**
 * Controller that handles chat-related operations.
 * Manages message sending and chat view rendering.
 * 
 * @author Mariano Bonansea
 * @version 1.0
 */
@Controller
public class ChatController {

    /**
     * Handles incoming messages and forwards them to all subscribed clients.
     * 
     * @param message The received chat message
     * @return The message to be sent to all clients
     */
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    /**
     * Returns the chat view.
     * 
     * @return The name of the chat view template
     */
    @GetMapping("chat")
    public String chat() {
        return "chat";
    }
}
