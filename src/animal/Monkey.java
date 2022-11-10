package animal;

import interfaceAnimal.Climbable;

public class Monkey implements Climbable {

    @Override
    public void climb() {
        System.out.println("Теперь я умею карабкаться");
    }

    @Override
    public void speak() {
        System.out.println("Теперь я умею говорить");
    }
}
