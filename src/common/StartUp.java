package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StartUp {
    public static void main(String[] args) {
        //LAB 2
        System.out.println("Lab 2: (Counter Loop)");
        List empList = new ArrayList();
        empList.add(new Employee("Sasha","Dopp","555-25-5555"));
        empList.add(new Employee("Mikey","Dopp","555-34-5555"));
        empList.add(new Employee("Cooper","Dopp","555-12-5555"));
        empList.add(new Employee("Piper","Lis","555-87-5555"));
        empList.add(new Employee("Lindsy","Word","555-55-5555"));
        
        for(int i=0; i<empList.size(); i++){
            Employee emp = (Employee) empList.get(i);
            System.out.println(emp.getLastName());
        }
        
        //Lab 3  
        System.out.println("\nLab 3: (For-Each Loop)");
        List<Employee> empList2 = new ArrayList<>();
        empList2.add(new Employee("Sasha","Dopp","555-25-5555"));
        empList2.add(new Employee("Mikey","Dopp","555-34-5555"));
        empList2.add(new Employee("Cooper","Dopp","555-12-5555"));
        empList2.add(new Employee("Piper","Lis","555-87-5555"));
        empList2.add(new Employee("Lindsy","Word","555-55-5555"));
        
        for(Employee e : empList2){
            System.out.println(e.getLastName());
        }
        
        //Lab 4
        System.out.println("\nLab 4: (Set With Duplicate)");
        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(new Dog("Sasha", 1254));
        dogSet.add(new Dog("Mikey", 1267));
        dogSet.add(new Dog("Cooper",1342));
        dogSet.add(new Dog("Amber", 1254));
        System.out.println("dogSet Size is: " + dogSet.size());
        
        //Lab 5
        System.out.println("\nLab 5: (List From Set Print Using toString())");
        List<Dog> dogList = new ArrayList<>(dogSet);
        
        for(Dog dog : dogList){
            System.out.println(dog);
        }
        
    }
}
