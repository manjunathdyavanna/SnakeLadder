package com.manj.lld.snakeladder.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Player {
    private String name;
    private char sign;
    private int position;
}
