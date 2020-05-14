public class Person {
    private String firsName;
    private String lastName;
    private int age;
    private String id;

    public Person(String firsName, String lastName, int age, String id) throws NameUndefinedException, IncorrectAgeException {
        checkNameAndAge(firsName,age);
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    private void checkNameAndAge(String firsName, int age) throws NameUndefinedException, IncorrectAgeException {
        if (firsName.equals(null) || (firsName.length() < 2))
            throw new NameUndefinedException("Nie podałeś imienie lub wpisałeś za mało liter");
        else if (age <1)
            throw new IncorrectAgeException("Nie podałeś prawidłowego wieku");
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return firsName + " " + lastName + ", wiek: " + age +
                " lat, pesel: " + id;
    }
}
