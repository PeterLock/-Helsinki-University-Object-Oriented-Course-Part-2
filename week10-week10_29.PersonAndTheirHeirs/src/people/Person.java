package people;

/**
 * Created by home-folder on 6/20/17.
 */
public class Person {

    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString(){
        return this.name + '\n' + "  " + this.address;
    }
}