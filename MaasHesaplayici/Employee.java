package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    short workHours;
    int hireYear;

    Employee(String name, int salary, short workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(int salary) {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus(short workHours) {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary(int hireYear, int salary) {
        int currentYear = 2021;
        int worksYear = currentYear - hireYear;
        if (worksYear < 10) {
            return salary * 0.05;

        } else if (worksYear > 9 && worksYear < 20) {
            return salary * 0.10;

        } else if (worksYear > 19) {
            return salary * 0.15;

        } else
            return 0;
    }

    public void toStringg() {
        System.out.println("Adi: " + name);
        System.out.println("Maasi: " + salary);
        System.out.println("Haftalik calisma saati: " + workHours);
        System.out.println("Ise baslama yili: " + hireYear);
        System.out.println("Vergi: " + tax(salary));
        System.out.println("Bonus: " + bonus(workHours));
        System.out.println("Maas artisi: " + raiseSalary(hireYear, salary));
        System.out.println("Vergi ve bonuslar ile maas " + (salary + bonus((short) workHours) - tax(salary)));

    }
}
