package AppCompra;

public class leche extends producto {
    private int litros_leche;

    public leche() {
    }

    public leche (int litros_leche, double gasto){
        super(gasto);
        this.litros_leche = litros_leche;

    }
    public int getlitros_leche() {
        return litros_leche;
    }

    public void setLitros_leche (int litros_leche) {
        this.litros_leche = litros_leche;
    }

    public leche(double gasto) {
        super(gasto);
    }

    @Override
    public double gastoConIva() { //método implementado
        return (double) (litros_leche*1.95*1.04);
    }

    private double litros_leche() {
        return (double) (litros_leche*1.95*1.04);
    }
}
