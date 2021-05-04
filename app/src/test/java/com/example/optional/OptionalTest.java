package com.example.optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class OptionalTest {

    @Test
    void test() {

        // @formatter:off
        USB usb = USB.builder()
                .version("3.0")
                .build();
        Soundcard soundcard = Soundcard.builder()
                .optionalUsb(Optional.of(usb))
                .build();
        Computer computer = Computer.builder()
                .optionalSoundcard(Optional.of(soundcard))
                .build();

        final String version = computer.getOptionalSoundcard()
                .flatMap(Soundcard::getOptionalUsb)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
        // @formatter:on
        assertEquals("3.0", version);
    }

}
