package com.example.optional;

import java.util.Optional;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Soundcard {

    private final Optional<USB> optionalUsb;
}
