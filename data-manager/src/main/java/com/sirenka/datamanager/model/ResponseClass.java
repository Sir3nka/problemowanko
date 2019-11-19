package com.sirenka.datamanager.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class ResponseClass implements IHandlePayload {
    @Getter
    private String content;
}
