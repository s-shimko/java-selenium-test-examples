package s.shimko.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Employee {

    private String name;
    private Integer levelOfHappiness;
    private List<Employee> employees = new ArrayList<>();

    public Boss(String name, Integer levelOfHappiness) {
        this.name = name;
        this.levelOfHappiness = levelOfHappiness;
    }

    public void addWorker(Employee employee){
        employees.add(employee);
    }

    @Override
    public void showHappiness() {
        System.out.printf("Boss %s has happiness: %d\n", name, levelOfHappiness);
        for(Employee employee : employees){
            employee.showHappiness();
        }
    }
}
