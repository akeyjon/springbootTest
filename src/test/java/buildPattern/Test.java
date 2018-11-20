package buildPattern;

public class Test {

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person createPerson = pd.createPerson(new ManBuilder());
        System.out.println(createPerson);
    }
}
