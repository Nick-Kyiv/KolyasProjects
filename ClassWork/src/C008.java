import my.Human;
import my.Worker;

import java.util.ArrayList;

// где дост. private
// c приватн. пол. мы работ. через методы
// todo поля всегда до-олжны быть приватными !!!
// инкапсуляция - это контроль доступа к данным с помощью public & private
public class C008 {
    public static void main(String[] args) {


        new ArrayList<>();
        Worker w0 = new Worker();
        w0.setName("G");
        w0.setSecondName("G0");
        w0.setAge((short)20);
        w0.setSalary(20000);
        w0.setAdress("2nd block");

        Worker w1 = new Worker();
        w1.setName("Gg");
        w1.setSecondName("G1");
        w1.setAge((short)21);
        w1.setSalary(2500000);
        w1.setAdress("2nd block");

        Worker w2 = new Worker();
        w2.setName("Gug");
        w2.setSecondName("G2");
        w2.setAge((short)200);
        w2.setSalary(2500);
        w2.setAdress("2nd block");

        workers.add(w1);
        workers.add(w1);
        workers.add(w2);
        for (Human human : humans) {
            System.out.println("До " + human);
            human.changeMinAndMax();
            System.out.println("После " + human);
        }

    }


    }
}
