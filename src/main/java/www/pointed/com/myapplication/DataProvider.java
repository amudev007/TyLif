package www.pointed.com.myapplication;


import java.util.ArrayList;
import java.util.List;

public class DataProvider {

  //Returns a mock List of Person objects
  public static List<Person> getMockPeopleSet1() {
    List<Person> listPeople = new ArrayList<Person>();
    listPeople.add(new Person("Henry Blair", "07123456789", R.drawable.male1));
    listPeople.add(new Person("Malcolm Wilkins", "07123456789", R.drawable.male8));
    listPeople.add(new Person("Vincent Green", "07123456789", R.drawable.male2));
    listPeople.add(new Person("Oliver Bell", "07123456789", R.drawable.male9));

    listPeople.add(new Person("Daniel Erickson", "07123456789", R.drawable.male3));

    listPeople.add(new Person("Theodore Kelly", "07123456789", R.drawable.male10));

    listPeople.add(new Person("John Singleton", "07123456789", R.drawable.male4));
    listPeople.add(new Person("Marc Allen", "07123456789", R.drawable.male11));
    listPeople.add(new Person("Wesley Garner", "07123456789", R.drawable.male12));
    listPeople.add(new Person("Charlie Watson", "07123456789", R.drawable.male13));

    listPeople.add(new Person("Stephen Blair", "07123456789", R.drawable.male14));
    listPeople.add(new Person("Kevin Stokes", "07123456789", R.drawable.male5));

    listPeople.add(new Person("Johnny Sanders", "07123456789", R.drawable.male6));
    listPeople.add(new Person("Jim Ramirez", "07123456789", R.drawable.male7));



    return listPeople;
  }

  public static List<Person> getMockPeopleSet2() {
    List<Person> listPeople = new ArrayList<Person>();

    listPeople.add(new Person("Jenny Curtis", "07123456789", R.drawable.female1));
    listPeople.add(new Person("Helen Hudson", "07123456789", R.drawable.female8));
    listPeople.add(new Person("Maria Ramsey", "07123456789", R.drawable.female3));
    listPeople.add(new Person("Ada Underwood", "07123456789", R.drawable.female2));
    listPeople.add(new Person("Dorothy Page", "07123456789", R.drawable.female9));
    listPeople.add(new Person("Rosemary Munoz", "07123456789", R.drawable.female4));
    listPeople.add(new Person("Lorena Bowen", "07123456789", R.drawable.female5));
    listPeople.add(new Person("Verna Long", "07123456789", R.drawable.female10));
    listPeople.add(new Person("Darla Castro", "07123456789", R.drawable.female11));
    listPeople.add(new Person("Cassandra Hunter", "07123456789", R.drawable.female6));
    listPeople.add(new Person("Viola Guerrero", "07123456789", R.drawable.female7));

    listPeople.add(new Person("Andrea Pratt", "07123456789", R.drawable.female12));


    listPeople.add(new Person("Leah Kelly", "07123456789", R.drawable.female13));

    listPeople.add(new Person("Yvonne Johnston", "07123456789", R.drawable.female14));

    return listPeople;
  }
}