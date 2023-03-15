public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Artem","M").setCounty("Russia").setAge(33).build();
        System.out.println(person);
    }
}
