import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Salary{

    // compute salary provided by a "normal" interface method declaration
    double salaryToPay(double hours, double rate);

    //default method, that provides a default implementation
    default double salaryForOvertime(double overtimeHours, double rate){
        return overtimeHours*rate;
    }

    //this is static interface method
    static int bonus(int yearsOfExperience){
        if(yearsOfExperience > 5){
            return 100;
        } else{
            return 0;
        }
    }
}

public class Person {
    String surname;
    String name;
    String street;
    String zipCode;
    String city;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Retrieving data about a person.");
        System.out.println("Enter your surname: ");
        surname = br.readLine();
        System.out.println("Enter your name: ");
        name = br.readLine();
        System.out.println("Enter the street: ");
        street = br.readLine();
        System.out.println("Enter your zip code: ");
        zipCode = br.readLine();
        System.out.println("Enter the city: ");
        city = br.readLine();
    }

    public void print(){
        System.out.println("Displaying the data.");
        System.out.println("====================");
        System.out.println("Surname: " + surname);
        System.out.println("Name: " + name);
        System.out.println("Street: " + street);
        System.out.println("Zip-Code: " + zipCode);
        System.out.println("City: " + city);
    }
}

class Staff extends Person implements Salary{
    String education;
    String position;

    public void initialize1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education: ");
        education = br.readLine();
        System.out.println("Enter your position: ");
        position = br.readLine();
    }

    public void print1(){
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

    @Override
    public double salaryToPay(double hours, double rate) {
        return hours * rate;
    }

    // we can override default method but we dont have to
    @Override
    public double salaryForOvertime(double overtimeHours, double rate) {
        return overtimeHours * (1.5 * rate);
    }
}

class HR{
    public static void main(String[] args) throws IOException {
        Staff employee = new Staff();

//        employee.initialize1();
//        employee.print1();

        double salary = employee.salaryToPay(180, 20);
        System.out.println("The employee received a salary in the amount of " + salary);

        double salaryForOvertime = employee.salaryForOvertime(10, 40);
        System.out.println("The employee received a salary for overtime in the amount of " + salaryForOvertime);

        int bonus = Salary.bonus(6);
        System.out.println("The employee received a bonus in the amount of " + bonus);

//        employee.initialize();
//        employee.print();
    }
}