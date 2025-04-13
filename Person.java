public class Person {
    String name;
    int birthday; //Form JJJJMMTT

    Person (String name, int birthday){
        this.name = name;
        this.birthday = birthday;
    }

    void print (){
        System.out.println("Name: " + this.name);
        System.out.println("Geburtsdatum: " + this.birthday);
    }
}