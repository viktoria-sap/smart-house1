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
        radio.setNext(false);
        radio.setPrev(true);

        assertEquals(false, radio.isNext(false));
        assertEquals(true, radio.isPrev(true));
        assertEquals(6, radio.getNumberCurrentStation());
        radio.setNextStation(7);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldNextStation1() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(9);
        radio.setNext(true);
        radio.setPrev(false);

        assertEquals(true, radio.isNext(true));
        assertEquals(false, radio.isPrev(false));
        assertEquals(9, radio.getNumberCurrentStation());
        radio.setNextStation(10);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void shouldNextStation2() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(7);
        radio.setNext(true);
        radio.setPrev(false);

        assertEquals(true, radio.isNext(true));
        assertEquals(false, radio.isPrev(false));
        assertEquals(7, radio.getNumberCurrentStation());
        radio.setNextStation(8);
        assertEquals(8, radio.getNextStation());
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

    @Test
    public void shouldPrevStation1() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(0);
        radio.setNext(true);
        radio.setPrev(false);

        assertEquals(true, radio.isNext(true));
        assertEquals(false, radio.isPrev(false));
        assertEquals(0, radio.getNumberCurrentStation());
        radio.setPrevStation(9);
        assertEquals(0, radio.getPrevStation());
    }

    @Test
    public void shouldPrevStation2() {
        Radio radio = new Radio();

        radio.setMaxStation(9);
        radio.setMinStation(0);

        radio.setNumberCurrentStation(3);
        radio.setNext(false);
        radio.setPrev(true);

        assertEquals(false, radio.isNext(false));
        assertEquals(true, radio.isPrev(true));
        assertEquals(3, radio.getNumberCurrentStation());
        radio.setPrevStation(2);
        assertEquals(2, radio.getPrevStation());
    }
}