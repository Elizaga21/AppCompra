package AppCompra;

public class whisky extends producto{
    private int litros_whisky;

    public whisky(double v) {
    }

    public whisky(int litros_whisky, double gasto) {
        super(gasto);
        this.litros_whisky = litros_whisky;
    }

    public whisky() {

    }

    public int getLitros_whisky() {
        return litros_whisky;
    }

    public void setLitros_whisky(int litros_whisky) {
        this.litros_whisky = litros_whisky;
    }

    @Override
    public double gastoConIva() {
        return litros_whisky*11.90*1.21;
    }
}
