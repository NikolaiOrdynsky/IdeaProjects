package AleksandrVasko.javarash.InterfaceComparable;


public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

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

















