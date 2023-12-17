import java.util.Scanner;
public class EmpTest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of Employee ");
        int n=scanner.nextInt();
        Employee []emp=new Employee[n];

        for(int i=0;i<n;i++){
        System.out.print("Employee Name: ");
        String empName = scanner.next();
        System.out.print("Employee Number: ");
        int empNo = scanner.nextInt();
        System.out.print("Employee's Number of Dependents: ");
        int dependentCnt = scanner.nextInt();

        emp[i] = new Employee(empName, empNo, dependentCnt);
        }
        System.out.println("\nDetails of employees with more than two dependents:");
             for(int i=0;i<n;i++){
                if(emp[i].depCount()>2){
                     emp[i].showEmpDetails();
            }
        }
    }
}

class Employee {
    private String empName;
    private int empNo;
    private int dependentCnt;

    Employee(String name, int eno, int dc) {
        this.empName = name;
        this.empNo = eno;
        this.dependentCnt= dc;
    }
    void showEmpDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Number: " + empNo);
    }
    int depCount() {
        return dependentCnt;
    }
}