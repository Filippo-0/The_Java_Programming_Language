public class Punto2{
    
    private int x, y;

    public Punto2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Primo equals: getClass()
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Punto2 other = (Punto2) obj;
    //     if (x != other.x)
    //         return false;
    //     if (y != other.y)
    //         return false;
    //     return true;
    // }

    //Secondo equals: instanceof
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Punto2))
            return false;
        Punto2 other = (Punto2) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Punto2 [x=" + x + ", y=" + y + "]";
    }

    


}
