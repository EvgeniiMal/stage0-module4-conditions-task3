package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float floatSalary = salary;
        if (floatSalary < 1) {
            System.out.println("wrong input!");
        } else if (floatSalary <= 10000) {
            System.out.println(floatSalary - (floatSalary / 100 * 15));
        } else if (salary <= 20000) {
            System.out.println(floatSalary - (floatSalary / 100 * 18));
        } else {
            System.out.println(floatSalary - (floatSalary / 100 * 20));
        }
    }
}
