package AppCompra;

public class salmon extends producto {
    private double kilos_salmon;
    private double setKilos_salmon;

    public salmon() {
    }

    public int getkilos_salmon() { //método implementado
        return getkilos_salmon();
    }

    public void setKilos_salmon(double kilos_salmon) { //método implementado
        this.setKilos_salmon  = setKilos_salmon ;
    }

    public salmon(double gasto, double kilos_salmon) {
        super(gasto);
        this.kilos_salmon = kilos_salmon;
    }

    @Override
    public double gastoConIva() {
        return kilos_salmon*11.85 *1.08;
    }

}
