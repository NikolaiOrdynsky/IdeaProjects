package AleksandrVasko.MayProgram.Olympic;

public  class Sportsmen implements Run,Jamp{
    public String name;
    public String national;
    public TypeSport typeSport;
    public int age;
    public int agility;
    public int strength;
    public int experience;

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
