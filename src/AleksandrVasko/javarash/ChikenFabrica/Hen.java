package AleksandrVasko.javarash.ChikenFabrica;

/**
 * The type Hen.
 */
public abstract class Hen {
    /**
     * Gets count of eggs peronth.
     *
     * @return the count of eggs peronth
     */
    abstract int getCountOfEggsPeronth();

    /**
     * Get description string.
     *
     * @return the string
     */
    public String getDescription(){
       return "Я - курица.";
   }
}
