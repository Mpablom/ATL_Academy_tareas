import java.util.Scanner;

public abstract class Figura {
    private String colorFondo;

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }
    public abstract float calcularArea();
}
