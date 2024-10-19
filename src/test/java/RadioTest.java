import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    Radio radio10 = new Radio(); // для стандартного числа радиостанций (10 штук)
    Radio radio = new Radio(20);
    int maxStation = radio.getCurrentStation();
    int minVolume = 0;
    int maxVolume = 100;

    @Test
    void maxToZeroStation() {
        radio.setCurrentStation(maxStation);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void zeroToMaxStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(maxStation, radio.getCurrentStation());
    }

    @Test
    void nextStation() {
        radio.setCurrentStation(7);
        radio.nextStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(8);
        radio.prevStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }


    @Test
    void hundredVolumeTest() {
        int currentVolume = maxVolume;
        int expectedVolume = maxVolume;

        int actual = radio.increaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }

    @Test
    void zeroVolumeTest() {
        int currentVolume = minVolume;
        int expectedVolume = minVolume;

        int actual = radio.decreaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }

    @Test
    void plusVolumeTest() {
        int currentVolume = 11;
        int expectedVolume = currentVolume + 1;

        int actual = radio.increaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }

    @Test
    void minusVolumeTest() {
        int currentVolume = 12;
        int expectedVolume = currentVolume - 1;

        int actual = radio.decreaseAudio(currentVolume);
        Assertions.assertEquals(expectedVolume, actual);
    }
}
