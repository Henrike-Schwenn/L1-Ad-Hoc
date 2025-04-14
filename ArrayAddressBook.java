
public class ArrayAddressBook {
    Person [] persons = new Person[]; //Default-Größe 1 wird verwendet, wenn im Konstruktor eine Größe kleiner 1 angegeben wird

    public ArrayAddressBook(Person [] persons) {
        this.persons.length = persons.length;
    }

    
}
