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

        var boxerOne = 78.2;
        System.out.println(boxerOne + " кг");
        var boxerTwo = 82.7;
        System.out.println(boxerTwo + " кг");
        var generalboxerWeight = (boxerOne + boxerTwo);
        System.out.println(generalboxerWeight + " кг");
        var differencerboxerWeight = (boxerTwo - boxerOne);
        System.out.println("Весовая разница между боксёрами " + differencerboxerWeight + " кг");

        var divisionRemainder = (boxerTwo % boxerOne);
        System.out.println(divisionRemainder + " кг");

        var totalHours = 640;
        System.out.println(totalHours);
        var numberEmployees = ("Всего работников в компании -  " + totalHours / 8 + " человек");
        System.out.println(numberEmployees);

        var peopleWork = (totalHours / 8);
        System.out.println(peopleWork);
        var peopleworkNow = (peopleWork + 94);
        System.out.println(peopleworkNow);
        var peopleHoursall = (peopleworkNow * 8);
        System.out.println("Если в компании работает " + peopleworkNow + " человек, то всего " + peopleHoursall + " часов работы может быть поделено между сотрудниками");

    }
}