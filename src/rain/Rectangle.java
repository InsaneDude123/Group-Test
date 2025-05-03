package rain;

public class Rectangle {
    
    private int width;
    private int length;

    public Rectangle(int w, int l){
        width = w;
        length = l;
    }

    public boolean areaEven() {
        int area = width * length;
        if (area % 2 == 0) {
            return true;
        }
        return false;
    }

    public String toString(){
        return "Area: " + width*length;
    }
}
