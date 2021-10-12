package AleksandrVasko.oop.objectWork.objectWork1;


/**
 * The type Bank account.
 */
public class bankAccount {
    /**
     * The Id.
     */
    int id;
    /**
     * The Name.
     */
    String name;
    /**
     * The Balance.
     */
    double balance;

    /**
     * Up to balance.
     *
     * @param x the x
     */
    void upToBalance (double x )
{
    balance += x;

}

    /**
     * Down to balance.
     *
     * @param z the z
     */
    void downToBalance (double z  )
    {
        balance -= z;

    }

    /**
     * Info client.
     */
    void infoClient (){
     System.out.println();
     System.out.println("id. "+ id );
     System.out.println("Имя. "+ name );
     System.out.println("Баланс . "+ balance );
}
    }

