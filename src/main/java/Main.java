import ru.netology.javaqa.javaqamvn.service.VacationPlanner;

public class Main {
    public static void main(String[] args) {
        VacationPlanner service = new VacationPlanner();
        int vacationMonths = service.calculateVacationMonths(10_000, 3_000, 20_000);

        System.out.println("Количество месяцев отдыха: " + vacationMonths);
    }
}