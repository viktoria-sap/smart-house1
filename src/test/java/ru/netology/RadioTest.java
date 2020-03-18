package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class RadioTest {

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(6);
        radio.setNext(true);
        radio.setPrev(false);

        assertEquals(true, radio.isNext(true));
        assertEquals(false, radio.isPrev(false));
        assertEquals(6, radio.getNumberCurrentStation());
        radio.setNextStation(7);
        assertEquals(7, radio.getNextStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(0);
        radio.setNext(false);
        radio.setPrev(true);

        assertEquals(false, radio.isNext(false));
        assertEquals(true, radio.isPrev(true));
        assertEquals(0, radio.getNumberCurrentStation());
        radio.setPrevStation(9);
        assertEquals(9, radio.getPrevStation());
    }

}