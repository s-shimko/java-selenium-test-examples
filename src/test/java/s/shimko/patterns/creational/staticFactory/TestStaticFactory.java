package s.shimko.patterns.creational.staticFactory;

public class TestStaticFactory {

    public static void main(String[] args) {
        User defaultUser = StaticFactory.createDefaultUser();
        System.out.println(defaultUser);
        User ageModifiedUser = defaultUser.withAge(44);
        System.out.println(ageModifiedUser);
        User sergey = ageModifiedUser.withName("Sergey").withAge(33);
        System.out.println(sergey);

        System.out.println(StaticFactory.createUserFromName("Dima").withAge(3));

    }
}
