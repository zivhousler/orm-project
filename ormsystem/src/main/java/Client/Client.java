package Client;

import Entity.Animal;
import Sql.MysqlDatabase;
//import Utils.QueryBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {

        MysqlDatabase table = new MysqlDatabase();

//        table.createTable(Animal.class);
//        table.createMany(createListOfEntity());

        System.out.println(table.updateProperty(Animal.class, "numOfLegs", 5, "numOfLegs", 6));
//        System.out.println(table.findOne(Animal.class, "id", 2));
    }

//        table.createTable(Animal.class);

        //        Animal gato = new Animal();
//        gato.setId(1);
//        gato.setName("kitty");
//        table.createOne(gato);
//
//        String query = new QueryBuilder.Builder().insert(gato).build().toString();
//        System.out.println(query);
//    public static <T> List<T> createListOfEntity() {
//        Animal cat = new Animal();
//        cat.setName("kitty");
//        cat.setId(1);
//        cat.setSound("meow");
//        cat.setNumOfLegs(3);
//        Animal dog = new Animal();
//        dog.setName("doggo");
//        dog.setId(1);
//        dog.setSound("waff");
//        dog.setNumOfLegs(4);
//        Animal pig = new Animal();
//        pig.setName("piggy");
//        pig.setId(1);
//        pig.setSound("oink");
//        pig.setNumOfLegs(2);
//        List<Animal> animalsList = new ArrayList<>();
//        animalsList.add(cat);
//        animalsList.add(dog);
//        animalsList.add(pig);
//        return (List<T>) animalsList;
//    }
}

