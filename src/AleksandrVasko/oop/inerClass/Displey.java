package AleksandrVasko.oop.inerClass;

public class Displey {
    private static final int DISPLAY_HEIGHT=1920;
    private static final int DISPLAY_WIDTH=1280;

    public Displey() {
        Pixel pixel = new Pixel(1280,1920,Color.GREEN);
    }
    private class Pixel{
        private int x;
        private int y;
        private Color color;

        private Pixel(int x, int y, Color color) {
            if (x>=0&&x<=DISPLAY_WIDTH&&y>=0&&y<=DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Создан пиксель "+x +","+y+","+color);
            } else {
                throw new IllegalArgumentException("Координаты х - от 0 до 1080, координаты y - от 0 до 1920.");
            }
        }
    }
    public enum Color{
        RED,GREEN,YOLLOW,BLUE
    }
}
