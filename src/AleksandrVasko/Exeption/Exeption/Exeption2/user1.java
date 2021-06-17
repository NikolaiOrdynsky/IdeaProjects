package AleksandrVasko.Exeption.Exeption.Exeption2;
import AleksandrVasko.Exeption.Exeption.Exeption2.veloshop.*;

public class user1 {
    public static void main(String[] args) throws noSize {
        veloshop decatlon = new veloshop();
        try{
            decatlon.setGaraj("RockriderS520");
            decatlon.setGaraj("RockriderS620");
            decatlon.setGaraj("Cube3000");
            decatlon.setGaraj("Stels_Navigator900");
            decatlon.setGaraj("Stels_Navigator600");
            decatlon.getGaraj("Stels_Navigator900");
            decatlon.setGaraj("Stels_Navigator600");
        }
        catch(noSize e){
            System.out.println(e.getMessage());
        }

    }
}
