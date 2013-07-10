// class <-> object
// :
// переменная
// массив
// [прост.]типы данных и строки
// for
// if-else

// тип и класс - синонимы

// в компании(название, адресс) работают сотрудники(имя, фамилия возраст, зарплата)
// из n заданных сотрудников найти сатрудника с макс. зарпл.
// 1. Разработка;
// 2. Компиляция;
// 3. Исполнение.
// Переменная.Операция  опер. сов. действ. над перем.
// обьект - это представитель класса (экземпляр)
public class C005 {
    public static final String SEPARATOR = " ";

    public static void main(String[] args) {
        String name1 = "Petro Ivan Nick Jakob";
        String[] names1 = name1.split(SEPARATOR);
        String name2 = "Petrovich Ivanovich Mickolajev Jakovenko";
        String[] names2 = name2.split(SEPARATOR);
        short[] ages = {129, 18, 96, 26};
        long[] salarys = {8000, 12000, 60000, 2600};
        long max = 0;
        short iMax = 0;
        for (short i = 0; i < salarys.length; i++) {
            if (max < salarys[i]) {
                max = salarys[i];
                iMax = i;
            }
        }
        System.out.print(names1[iMax] + " " + names2[iMax] + " " + ages[iMax] + " years old & salary:" + salarys[iMax] + ".");
    }
}

