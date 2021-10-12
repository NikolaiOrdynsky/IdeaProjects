package AleksandrVasko.javarash.Test2;

import java.util.Date;

/**
 * The type Person.
 */
public class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * Gets birth date.
     *
     * @return the birth date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets birth date.
     *
     * @param birthDate the birth date
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Create male person.
     *
     * @param name      the name
     * @param birthDate the birth date
     * @return the person
     */
    public static Person createMale(String name, Date birthDate) {
        return new Person(name,Sex.MALE,birthDate);

    }

    /**
     * Create female person.
     *
     * @param name      the name
     * @param birthDate the birth date
     * @return the person
     */
    public static Person createFemale(String name, Date birthDate) {
        return new Person(name,Sex.FEMALE,birthDate);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                '}';
    }
}
