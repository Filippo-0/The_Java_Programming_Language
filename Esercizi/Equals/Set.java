import java.util.NoSuchElementException;

public class Set {

    private Punto2[] els; // tipo Object

    public void insert(Punto2 x) {
        if (els == null)
            els = new Punto2[] { x };
        else if (!this.contains(x)) {
            Punto2[] tmp = new Punto2[els.length + 1];
            for (int i = 0; i < els.length; i++)
                tmp[i] = els[i];
            tmp[els.length] = x;
            this.els = tmp;
        }
    }

    public boolean contains(Punto2 x) {
        for (Punto2 i : els)
            if (i.equals(x))
                return true;
        return false;
    }

    public Punto2 choose() {
        if (this.els == null)
            throw new NoSuchElementException(); // se vuoto
        return els[0]; // ritorna primo
    }

    public String toString() {
        String ret = "";
        for (Punto2 o : els)
            ret += o + " ";
        return ret;
    }
}
