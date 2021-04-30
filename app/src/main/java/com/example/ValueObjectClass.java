package com.example;

import javax.validation.constraints.Size;

import lombok.NonNull;
import lombok.Value;

@Value
public class ValueObjectClass {

    @NonNull
    @Size(min = 6, max = 8)
    private final String value;
}
