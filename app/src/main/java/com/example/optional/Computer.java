package com.example.optional;

import java.util.Optional;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Computer {

    private final Optional<Soundcard> optionalSoundcard;
}
