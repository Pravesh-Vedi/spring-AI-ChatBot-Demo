package com.chatbot.demo.model;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatRequest {

    private String requestNote;
}
