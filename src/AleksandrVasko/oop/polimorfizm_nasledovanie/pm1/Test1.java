package AleksandrVasko.oop.polimorfizm_nasledovanie.pm1;

/**
 * The type Test 1.
 */
public class Test1 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        emploee emp2 = new ticher("bil");
        emploee emp3 = new doctor("jo");

        emp2.sleep();
        System.out.println(((ticher)emp2).spec2);

        emp3.sleep();
    }
}

/**
 * The type Emploee.
 */
class emploee{
    /**
     * The Name.
     */
    String name;

    /**
     * Instantiates a new Emploee.
     *
     * @param name the name
     */
    emploee(String name){
        this.name = name;
    }

    /**
     * The Spec.
     */
    String spec = "objectWork/works";

    /**
     * Sleep.
     */
    void sleep(){
        System.out.println("emploee sleep");
  }

}

/**
 * The type Ticher.
 */
class ticher extends emploee{
    /**
     * Instantiates a new Ticher.
     *
     * @param name the name
     */
    ticher(String name){
        super(name);
    }

    /**
     * The Spec 2.
     */
    String spec2 = "fizic";
    void sleep(){
        System.out.println("titcher sleep");
    }
}

/**
 * The type Doctor.
 */
class doctor extends emploee{
    /**
     * Instantiates a new Doctor.
     *
     * @param name the name
     */
    doctor(String name) {
        super(name);
    }
    void sleep(){
        System.out.println("doctor sleep");
    }
}