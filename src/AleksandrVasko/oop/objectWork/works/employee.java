package AleksandrVasko.oop.objectWork.works;


/**
 * The type Employee.
 */
class employee {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        works employee1 = new works(1, 2500.0, 27, "cnc", "ivanov");
        employee1.info();

        works employee2 = new works(2, 3000.0, 35, "asd", "petrov");
        employee2.info();


    }
}
