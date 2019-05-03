package s.shimko.patterns.creational.staticFactory;

import javax.jws.soap.SOAPBinding;

public class StaticFactory {

    public static User createDefaultUser(){
        User user = new User("Anton", 34);
        return user;
    }

    public static User createUserFromName(String name){
        return new User().withName(name);
    }
}
