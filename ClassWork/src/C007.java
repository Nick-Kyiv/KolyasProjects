// метод как цельная тамарная операция должна располагаться в том классе с состояниями котор. данный метод работает

import my.Human;

import java.util.ArrayList;

public class C007 {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<Human>();
        Human h0 = new Human();
        h0.student = false;
        h0.name = "Lucky";
        h0.secondName = "Luckely";
        h0.marks = new byte[]{12, 11, 15, 11, 0};
        Human h1 = new Human();
        h1.student = true;
        h1.name = "Good";
        h1.secondName = "Gooddy";
        h1.marks = new byte[]{11, 9, 12, 0};
        Human h2 = new Human();
        h2.student = true;
        h2.name = "Gug";
        h2.secondName = "Guggy";
        h2.marks = new byte[]{11, 10, 11, 12};
        humans.add(h0);
        humans.add(h1);
        humans.add(h2);
        for (Human human : humans) {
            System.out.println("До " + human);
            human.changeMinAndMax();
            System.out.println("После " + human);
        }

    }
    //TODO: HomeTask for tomorrow is "методы - читать"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // A-B jnhsdjr jw.

}
