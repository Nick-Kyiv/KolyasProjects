import my.Gooddies;

//TODO: Название цена артикул вес - ТОВАР
//TODO: 5 товаров, макс. и мин. цена , поменять их местами
public class C005_2 {
    public static void main(String[] args) {
        Gooddies g1 = new Gooddies();
        g1.name = "Car";
        g1.article = "Ferrari";
        g1.weight = 2000;
        g1.value = 2000000;

        Gooddies g2 = new Gooddies();
        g2.name = "Phone";
        g2.article = "Sony Erricsson";
        g2.weight = 0.2;
        g2.value = 2125;

        Gooddies g3 = new Gooddies();
        g3.name = "Freezer";
        g3.article = "Samsung";
        g3.weight = 250.3;
        g3.value = 29000;

        Gooddies g4 = new Gooddies();
        g4.name = "Handle Freezer";
        g4.article = "Sony";
        g4.weight = 12.5;
        g4.value = 7499.99;

        Gooddies g5 = new Gooddies();
        g5.name = "Freezer";
        g5.article = "Samsoong";
        g5.weight = 285;
        g5.value = 10000;

        Gooddies[] gooddies = new Gooddies[6];
        gooddies[0] = g1;
        gooddies[1] = g2;
        gooddies[2] = g3;
        gooddies[3] = g4;
        gooddies[4] = g5;
        gooddies[5] = g5;
        int iMax = 0, iMin = 0;
        for (int i = 0; i < gooddies.length; i++) {
            if (gooddies[i].value > gooddies[iMax].value)
                iMax = i;
            if (gooddies[i].value < gooddies[iMin].value)
                iMin = i;
        }
        System.out.println("Max: \n" +
                gooddies[iMax].name + " weight is " +
                        gooddies[iMax].weight + "kg value is " +
                        gooddies[iMax].value + " hrivns article is \"" +
                        gooddies[iMax].article + "\"."
        );
        System.out.println("Min: \n" +
                gooddies[iMin].name + " weight is " +
                        gooddies[iMin].weight + "kg value is " +
                        gooddies[iMin].value + " hrivns article is \"" +
                        gooddies[iMin].article + "\"."
        );
        gooddies[5] = gooddies[iMin];
        gooddies[iMin] = gooddies[iMax];
        gooddies[iMax] = gooddies[5];
        for (int i = 0; i <gooddies.length ; i++) {
            /*for (int j = 0; j <gooddies.length - 1 ; j++) {
            if (gooddies[j].value > gooddies[j + 1].value)
                my.Gooddies temp = gooddies[j + 1];
                gooddies[j + 1] = gooddies[j];
                gooddies[j] = temp;
            }*/
        }


    }
}