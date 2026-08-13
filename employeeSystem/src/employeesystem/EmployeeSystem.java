package employeesystem;
import java.util.Scanner;
public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee 1");
        System.out.print("Enter ID: ");
        int id1 = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        double basic1 = sc.nextDouble();
        System.out.print("Enter Working Hours: ");
        double work1 = sc.nextDouble();
        System.out.print("Enter Overtime Hours: ");
        double overtime1 = sc.nextDouble();
        System.out.print("Enter Tax Rate (%): ");
        double taxRate1 = sc.nextDouble();
        System.out.print("Enter Bonus Percentage (%): ");
        double bonusPercent1 = sc.nextDouble();
        System.out.print("Enter Insurance: ");
        double insurance1 = sc.nextDouble();
        double overtimePay1 = overtime1 * 500;
        double bonus1 = basic1 * bonusPercent1 / 100;
        double gross1 = basic1 + overtimePay1 + bonus1;
        double tax1 = gross1 * taxRate1 / 100;
        double pf1 = basic1 * 10 / 100;
        double net1 = gross1 - tax1 - insurance1 - pf1;
        System.out.println("\nEmployee 2");
        System.out.print("Enter ID: ");
        int id2 = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        double basic2 = sc.nextDouble();
        System.out.print("Enter Working Hours: ");
        double work2 = sc.nextDouble();
        System.out.print("Enter Overtime Hours: ");
        double overtime2 = sc.nextDouble();
        System.out.print("Enter Tax Rate (%): ");
        double taxRate2 = sc.nextDouble();
        System.out.print("Enter Bonus Percentage (%): ");
        double bonusPercent2 = sc.nextDouble();
        System.out.print("Enter Insurance: ");
        double insurance2 = sc.nextDouble();
        double overtimePay2 = overtime2 * 500;
        double bonus2 = basic2 * bonusPercent2 / 100;
        double gross2 = basic2 + overtimePay2 + bonus2;
        double tax2 = gross2 * taxRate2 / 100;
        double pf2 = basic2 * 10 / 100;
        double net2 = gross2 - tax2 - insurance2 - pf2;
        System.out.println("\nEmployee 3");
        System.out.print("Enter ID: ");
        int id3 = sc.nextInt();
        System.out.print("Enter Basic Salary: ");
        double basic3 = sc.nextDouble();
        System.out.print("Enter Working Hours: ");
        double work3 = sc.nextDouble();
        System.out.print("Enter Overtime Hours: ");
        double overtime3 = sc.nextDouble();
        System.out.print("Enter Tax Rate (%): ");
        double taxRate3 = sc.nextDouble();
        System.out.print("Enter Bonus Percentage (%): ");
        double bonusPercent3 = sc.nextDouble();
        System.out.print("Enter Insurance: ");
        double insurance3 = sc.nextDouble();
        double overtimePay3 = overtime3 * 500;
        double bonus3 = basic3 * bonusPercent3 / 100;
        double gross3 = basic3 + overtimePay3 + bonus3;
        double tax3 = gross3 * taxRate3 / 100;
        double pf3 = basic3 * 10 / 100;
        double net3 = gross3 - tax3 - insurance3 - pf3;
        System.out.println("\n EMPLOYEE 1 ");
        System.out.println("ID: " + id1);
        System.out.println("Overtime Pay: " + overtimePay1);
        System.out.println("Gross Salary: " + gross1);
        System.out.println("Tax: " + tax1);
        System.out.println("Insurance: " + insurance1);
        System.out.println("Provident Fund: " + pf1);
        System.out.println("Net Salary: " + net1);
        System.out.println("\n EMPLOYEE 2 ");
        System.out.println("ID: " + id2);
        System.out.println("Overtime Pay: " + overtimePay2);
        System.out.println("Gross Salary: " + gross2);
        System.out.println("Tax: " + tax2);
        System.out.println("Insurance: " + insurance2);
        System.out.println("Provident Fund: " + pf2);
        System.out.println("Net Salary: " + net2);
        System.out.println("\n EMPLOYEE 3 ");
        System.out.println("ID: " + id3);
        System.out.println("Overtime Pay: " + overtimePay3);
        System.out.println("Gross Salary: " + gross3);
        System.out.println("Tax: " + tax3);
        System.out.println("Insurance: " + insurance3);
        System.out.println("Provident Fund: " + pf3);
        System.out.println("Net Salary: " + net3);
        double highest = net1;
        int highestID = id1;
        if (net2 > highest) {
            highest = net2;
            highestID = id2;
        }
        if (net3 > highest) {
            highest = net3;
            highestID = id3;
        }
        double lowest = net1;
        int lowestID = id1;
        if (net2 < lowest) {
            lowest = net2;
            lowestID = id2;
        }
        if (net3 < lowest) {
            lowest = net3;
            lowestID = id3;
        }
        double totalSalary = net1 + net2 + net3;
        double averageSalary = totalSalary / 3;
        double totalTax = tax1 + tax2 + tax3;
        System.out.println("\n FINAL RESULT ");
        System.out.println("Highest Paid Employee: " + highestID);
        System.out.println("Highest Salary: " + highest);
        System.out.println("Lowest Paid Employee: " + lowestID);
        System.out.println("Lowest Salary: " + lowest);
        System.out.println("Average Salary: " + averageSalary);
        System.out.println("Total Salary Expense: " + totalSalary);
        System.out.println("Total Tax Collected: " + totalTax);
        sc.close();
    }
}