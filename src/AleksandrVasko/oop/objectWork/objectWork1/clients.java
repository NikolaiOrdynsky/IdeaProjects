package AleksandrVasko.oop.objectWork.objectWork1;


public class clients {
    public static void main(String[] args) {
        bankAccount client1 = new bankAccount();

        client1.id = 1;
        client1.name = "mike";
        client1.upToBalance(120.0);
        client1.infoClient();

        bankAccount client2 = new bankAccount();
        client2.id = 2;
        client2.name = "jone";
        client2.downToBalance(20.5);
        client2.infoClient();

    }
}
