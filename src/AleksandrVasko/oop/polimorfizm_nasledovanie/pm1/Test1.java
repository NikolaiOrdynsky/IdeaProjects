package AleksandrVasko.oop.polimorfizm_nasledovanie.pm1;

public class Test1 {
    public static void main(String[] args) {

        emploee emp2 = new ticher("bil");
        emploee emp3 = new doctor("jo");

        emp2.sleep();
        System.out.println(((ticher)emp2).spec2);

        emp3.sleep();
    }
}

 class emploee{
    String name;
    emploee(String name){
        this.name = name;
    }
    String spec = "objectWork/works";
    void sleep(){
        System.out.println("emploee sleep");
  }

}
class ticher extends emploee{
    ticher(String name){
        super(name);
    }
    String spec2 = "fizic";
    void sleep(){
        System.out.println("titcher sleep");
    }
}
class doctor extends emploee{
    doctor(String name) {
        super(name);
    }
    void sleep(){
        System.out.println("doctor sleep");
    }
}