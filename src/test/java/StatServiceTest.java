import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import ru.netoligy.stats.StatsService;

public class StatServiceTest {
    @Test
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

    @Test
    //@CsvSource({"15,8,15,13,15,17,20,19,20,7,14,14,18"})

    public void AverageSummaSalesTest() {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = Service.AverageSummaSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //@CsvSource({"15,8,15,13,15,17,20,19,20,7,14,14,18"})

    public void MaxSummaSalesTest() {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        // вызываем целевой метод:
        int actual = Service.maxSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //@CsvSource({"15,8,15,13,15,17,20,19,20,7,14,14,18"})

    public void minSummsSalesTest() {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        // вызываем целевой метод:
        int actual = Service.minSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minAverageSalesTest() {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = Service.minAverageSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //@CsvSource({"15,8,15,13,15,17,20,19,20,7,14,14,18"})

    public void maxAverageSalesTest() {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = Service.maxAverageSales(sales);
        // производим проверку (сравниваем ожидаемый и фактический  результат):
        Assertions.assertEquals(expected, actual);
    }
}