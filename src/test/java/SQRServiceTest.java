import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    void shouldBeNoNumbersInRange() {
        //подготавливаем данные
        int start = 200;
        int end = 200;
        int expected = 0;

        SQRService service = new SQRService();
        int actual = service.countNumbersInRange(start, end);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
    @Test
    void shouldBeOneNumberInRange() {
        //подготавливаем данные
        int start = 100;
        int end = 101;
        int expected = 1;

        SQRService service = new SQRService();
        int actual = service.countNumbersInRange(start, end);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldBe22NumbersInRange() {
        //подготавливаем данные
        int start = 0;
        int end = 1000;
        int expected = 22;

        SQRService service = new SQRService();
        int actual = service.countNumbersInRange(start, end);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

}
