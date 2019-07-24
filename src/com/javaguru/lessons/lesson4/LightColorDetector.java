package com.javaguru.lessons.lesson4;

public class LightColorDetector {

    public String detect(int wavelength) {
        if (wavelength > 379 && wavelength < 450) {
            return "violet";

        } else if (wavelength >= 450 && wavelength <= 494) {
            return "blue";

        } else if (wavelength >= 495 && wavelength <= 569) {
            return "green";

        } else if (wavelength >= 570 && wavelength <= 589) {
            return "yellow";

        } else if (wavelength >= 590 && wavelength <= 619) {
            return "orange";

        } else if (wavelength > 620 && wavelength <= 750) {
            return "red";

        } else {
            return "Invisible light";
        }
    }
}
