import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void nineToZeroStation() {
        int currentStation = 0;
        int expectedStation = 9;

        int actual = radio.prevStation(currentStation);
        Assertions.assertEquals(expectedStation, actual);
    }

    @Test
    void zeroToNineStation() {
        int currentStation = 9;
        int expectedStation = 0;

        int actual = radio.nextStation(currentStation);
        Assertions.assertEquals(expectedStation, actual);
    }

    @Test
    void nextStation() {
        int currentStation = 7;
        int expectedStation = 8;

        int actual = radio.nextStation(currentStation);
        Assertions.assertEquals(expectedStation, actual);
    }

    @Test
    void prevStation() {
        int currentStation = 8;
        int expectedStation = 7;

        int actual = radio.prevStation(currentStation);
        Assertions.assertEquals(expectedStation, actual);
    }

    @Test
    void hundredVolumeTest() {
        int currentVolume = 100;
        int expectedVolume = 100;

        int actual = radio.increaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }

    @Test
    void zeroVolumeTest() {
        int currentVolume = 0;
        int expectedVolume = 0;

        int actual = radio.decreaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }

    @Test
    void plusVolumeTest() {
        int currentVolume = 11;
        int expectedVolume = 12;

        int actual = radio.increaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }

    @Test
    void minusVolumeTest() {
        int currentVolume = 12;
        int expectedVolume = 11;

        int actual = radio.decreaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }
}
