package s.shimko.patterns.structural.composite;

public class Worker implements Employee {

    private String name;
    private Integer levelOfHappiness;

    public Worker(String name, int levelOfHappiness) {
        this.name = name;
        this.levelOfHappiness = levelOfHappiness;
    }

    @Override
    public void showHappiness() {
        System.out.printf("Worker %s has happiness: %d\n", name, levelOfHappiness);
    }
}
