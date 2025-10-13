//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer_1 = 78.2;
        System.out.println(boxer_1 + " кг");
        var boxer_2 = 82.7;
        System.out.println(boxer_2 + " кг");
        var generalboxerweight = (boxer_1 + boxer_2);
        System.out.println(generalboxerweight + " кг");
        var differencerboxerweight = (boxer_2 - boxer_1);
        System.out.println("Весовая разница между боксёрами " + differencerboxerweight + " кг");

        var divisionremainder = (boxer_2 % boxer_1);
        System.out.println(divisionremainder + " кг");

        var totalhours = 640;
        System.out.println(totalhours);
        var numberemployees = ("Всего работников в компании -  " + totalhours / 8 + " человек");
        System.out.println(numberemployees);

        var peoplework = (totalhours / 8);
        System.out.println(peoplework);
        var peopleworknow = (peoplework + 94);
        System.out.println(peopleworknow);
        var peoplehoursall = (peopleworknow * 8);
        System.out.println("Если в компании работает " + peopleworknow + " человек, то всего " + peoplehoursall + " часов работы может быть поделено между сотрудниками");

    }
}