package ru.netology.javaqa.javaqamvn.service;
public class VacationPlanner {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int vacationMonths = 0;
        int savings = 0;

        for (int month = 1; month <= 12; month++) {
            savings += income - expenses;

            if (savings >= threshold) {
                vacationMonths++;
                savings = 0;
            } else {
                savings -= expenses / 3;
            }
        }

        return vacationMonths;
    }
}