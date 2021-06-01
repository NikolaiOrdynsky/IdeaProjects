package ZaurTregulov.objectWork.objectWork1;



public class bankAccount {
    int id;
    String name;
    double balance;

void upToBalance (double x )
{
    balance += x;

}
    void downToBalance (double z  )
    {
        balance -= z;

    }
void infoClient (){
     System.out.println();
     System.out.println("id. "+ id );
     System.out.println("Имя. "+ name );
     System.out.println("Баланс . "+ balance );
}
    }

