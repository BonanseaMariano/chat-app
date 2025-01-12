package com.marianobonansea.chat_app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class representing a chat message.
 * Contains basic message information: id, sender, and content.
 * 
 * @author Mariano Bonansea
 * @version 1.0
 */
@Data
@NoArgsConstructor
public class ChatMessage {
    /**
     * Unique identifier for the message
     */
    private Long id;
    
    /**
     * Name of the message sender
     */
    private String sender;
    
    /**
     * Content of the message
     */
    private String content;
}
