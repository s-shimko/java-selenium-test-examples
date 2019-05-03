package s.shimko.patterns.structural.composite;

public class TestComposite {
    public static void main(String[] args) {
        Worker jim = new Worker("Jim", 3);
        Worker dan = new Worker("Dan", 5);

        Boss bossJim = new Boss("Jim's boss", 33);
        bossJim.addWorker(jim);

        Boss bossDan = new Boss("Dan's boss", 223);
        bossDan.addWorker(dan);

        Boss superBoss = new Boss("Supes boss", 1);
        superBoss.addWorker(bossJim);
        superBoss.addWorker(bossDan);
        superBoss.showHappiness();
    }
}
