package buildPattern;

public class PersonDirector {

    public Person createPerson(PersonBuilder pb){
        pb.buildBody();
        pb.buildFoot();
        pb.buildHead();
        Person buildPerson = pb.buildPerson();
        return buildPerson;
        
    }
}
