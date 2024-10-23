import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void nineToZeroStation() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void zeroToNineStation() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void nextStation() {
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void prevStation() {
        radio.setCurrentStation(1);
        radio.prevStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void hundredVolumeTest() {
        radio.setCurrentVolume(100);
        radio.increaseAudio();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void zeroVolumeTest() {
        radio.setCurrentVolume(0);
        radio.decreaseAudio();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void plusVolumeTest() {
        radio.setCurrentVolume(0);
        radio.increaseAudio();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void minusVolumeTest() {
        radio.setCurrentVolume(1);
        radio.decreaseAudio();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
