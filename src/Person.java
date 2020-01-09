public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;
    public  Person (boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (person.man != man) {
            if (person.spouse != null) {
                person.divorce();
            }
            if (spouse != null) {
                spouse.divorce();
            }
            return true;
        }
        else {
            return false;
        }
    }

    public boolean divorce() {
        if (this.spouse != null) {
            return true;
        }
        else {
            return false;
        }
    }


}
