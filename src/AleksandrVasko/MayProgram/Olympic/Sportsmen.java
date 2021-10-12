package AleksandrVasko.MayProgram.Olympic;

/**
 * The type Sportsmen.
 */
public  class Sportsmen implements Run,Jamp{
    /**
     * The Name.
     */
    public String name;
    /**
     * The National.
     */
    public String national;
    /**
     * The Type sport.
     */
    public TypeSport typeSport;
    /**
     * The Age.
     */
    public int age;
    /**
     * The Agility.
     */
    public int agility;
    /**
     * The Strength.
     */
    public int strength;
    /**
     * The Experience.
     */
    public int experience;

    /**
     * Instantiates a new Sportsmen.
     *
     * @param name       the name
     * @param national   the national
     * @param typeSport  the type sport
     * @param age        the age
     * @param agility    the agility
     * @param strength   the strength
     * @param experience the experience
     */
    public Sportsmen(String name, String national, TypeSport typeSport, int age, int agility, int strength, int experience) {
        this.name = name;
        this.national = national;
        this.typeSport = typeSport;
        this.age = age;
        this.agility = agility;
        this.strength = strength;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("%s %10s %10s %10d %10d %10d %10d \n",name,national,typeSport,age,agility,strength,experience);
    }
}
