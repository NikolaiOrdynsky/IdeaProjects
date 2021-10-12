package AleksandrVasko.javarash.InterfaceComparable;


/**
 * The type Beach.
 */
public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    /**
     * Instantiates a new Beach.
     *
     * @param name     the name
     * @param distance the distance
     * @param quality  the quality
     */
    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public synchronized void setName(String name) {
        this.name = name;
    }

    /**
     * Gets distance.
     *
     * @return the distance
     */
    public synchronized float getDistance() {
        return distance;
    }

    /**
     * Sets distance.
     *
     * @param distance the distance
     */
    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    /**
     * Gets quality.
     *
     * @return the quality
     */
    public synchronized int getQuality() {
        return quality;
    }

    /**
     * Sets quality.
     *
     * @param quality the quality
     */
    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach o) {
        int current = 0;
        int next = 0;
        if (this.distance < o.getDistance()) {
            current++;
        } else if (this.distance > o.getDistance()) {
            next++;
        }
        if (this.quality > o.getQuality()) {
            current++;
        }else if (this.quality < o.getQuality()) {
            next++;
        }
        return current-next;
    }
}

















