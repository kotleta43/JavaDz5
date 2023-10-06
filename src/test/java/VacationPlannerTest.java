import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.service.VacationPlanner;

public class VacationPlannerTest {

    @Test
    public void ShouldRest() {
        VacationPlanner service = new VacationPlanner();

        int expected = 3;
        int actual = service.calculateVacationMonths(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);

    }
}