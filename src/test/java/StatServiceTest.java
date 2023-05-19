import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netoligy.stats.StatsService;

public class StatServiceTest {
    @Test
    // @ParameterizedTest
    //@CsvFileSource(files = "src/test/resources/Massiv.csv")

    public void summaSalesTest() {//(int expected, int[] sales) {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        // вызываем целевой метод:
        int actual = Service.SummaSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    //@CsvFileSource(files = "src/test/resources/Massiv.csv")

    public void AverageSummaSalesTest() {// (int expected, int[] sales) {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = Service.AverageSummaSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }
}

