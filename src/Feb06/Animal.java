package Feb06;

public class Animal {
    String name;
    String breed;
    String species;
    String latin_name;
    int age;

    public void setAge(int age) throws InvalidAgeException{
        if (age < 0) {
            throw new InvalidAgeException();
        }
        this.age = age;
    }

    void birthday() {
        int prevAge = age;
        age++;
//        age = 0;
        System.out.println("Happy bday prevage" +prevAge + "agetoday" + age);
        System.out.println(age > prevAge);
        assert age > prevAge;
    }
}
