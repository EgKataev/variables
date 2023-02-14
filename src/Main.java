public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();


        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);
        System.out.println();


        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend /= 7;
        System.out.println(friend);
        System.out.println();


        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;

        var boxersWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес двух боксёров = " + boxersWeight + " кг");

        var weightDifference1 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе двух бойцов = " + weightDifference1 + " кг");
        System.out.println();


        System.out.println("Задача 7");
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println(weightDifference2);


        var weightDifference3 = boxerWeight2 - boxerWeight1;
        System.out.println(weightDifference3);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 8");
        var totalHours = 640;
        var manShift = 8;
        var totalPerson = totalHours / manShift;
        System.out.println("Всего работников в компании — " + totalPerson + " человек");

        var extraHelp = totalPerson + 94;
        var finalTime = extraHelp * manShift;
        System.out.println("Если в компании работает " + extraHelp + " человек, то всего " + finalTime + " часа работы может быть поделено между сотрудниками");
    }
}