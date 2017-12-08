import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("BEGINNING TEST PROGRAM. \n\n");

        System.out.println("Creating test Employee.\n");

        Employee test1 = new Employee();
        boolean stop = false;
        int count = 0;

        while(!stop){
            try{
                switch(count){
                    case 0:
                        count++;
                        System.out.println("Attempt to make test employee number -10.");
                        test1.setNumber((byte)-10);
                    case 1:
                        count++;
                        System.out.println("Attempt to make test employee number 51.");
                        test1.setNumber((byte)51);
                    case 2:
                        count++;
                        System.out.println("Setting test employee number to 1.");
                        test1.setNumber((byte)1);
                        System.out.println("Test employee number = " + test1.getNumber());
                        System.out.println("Attempt to change test employee number to 2.");
                        test1.setNumber((byte)2);
                    case 3:
                        count++;
                        System.out.println("Attempt to leave test name blank.");
                        test1.setName("");
                    case 4:
                        count++;
                        System.out.println("Attempt to make test name all spaces.");
                        test1.setName("      ");
                    case 5:
                        count++;
                        System.out.println("Setting test name to John");
                        test1.setName("John");
                        System.out.println("Test Employees name is: " + test1.getName() + "\n");
                    case 6:
                        count++;
                        System.out.println("Attempt to set test salary to $200,000.");
                        test1.setSalary(200000);
                    case 7:
                        count++;
                        System.out.println("Attempt to set test salary to 0");
                        test1.setSalary(0);
                    case 8:
                        count++;
                        System.out.println("Setting test salary to $199,999.99");
                        test1.setSalary(199999.99);
                        System.out.printf("Salary = $" + ("%.2f"),test1.getSalary());
                        System.out.println();
                    case 9:
                        System.out.println("\nPrinting toString method for test employee.");
                        System.out.println(test1.toString());
                    default:
                        stop = true;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n");
        System.out.println("Creating HashMap with 6 given employees information.\n");

        HashMap<Byte, Employee> Map = new HashMap<>();
        Set<Byte> keySet = Map.keySet();

        Employee e1;
        Employee e2;
        Employee e3;
        Employee e4;
        Employee e5;
        Employee e6;

        try{
            e1 = new Employee((byte) 1, "Jacob", 15800.00);     Map.put(e1.getNumber(), e1);
            e2 = new Employee((byte) 2, "Sarah", 172000.00);    Map.put(e2.getNumber(), e2);
            e3 = new Employee((byte) 3, "Jason", 95000.00);     Map.put(e3.getNumber(), e3);
            e4 = new Employee((byte) 4, "Dylan", 15000.00);     Map.put(e4.getNumber(), e4);
            e5 = new Employee((byte) 5, "Logan", 30000.00);     Map.put(e5.getNumber(), e5);
            e6 = new Employee((byte) 6, "Lydia", 60000.00);     Map.put(e6.getNumber(), e6);
        }catch(Exception e){
            e.getMessage();
        }


        byte a;
        System.out.println("Looking for Employee Number 1:");
        a = 1;
        if(Map.get(a) == null){
            System.out.println("Employee number " + a + " does not exist.\n");
        }else{
            System.out.println(Map.get(a) + "\n");
        }

        System.out.println("Looking for Employee Number 10:");
        a = 10;
        if(Map.get(a) == null){
            System.out.println("Employee number " + a + " does not exist.\n");
        }else{
            System.out.println(Map.get(a) + "\n");
        }

        System.out.println("Printing full Employee List:\n");

        for(Byte b: keySet){
            String print = Map.get(b).toString();
            System.out.println(print);
        }

        System.out.println();
        System.out.println("Printing Employees with salaries above $50,000\n");

        for(Byte b: keySet){
            if(Map.get(b).getSalary() > 50000){
                String print = Map.get(b).toString();
                System.out.println(print);
            }
        }

        System.out.println("\nEND OF TEST PROGRAM.");

    }
}
