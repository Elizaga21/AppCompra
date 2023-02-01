package AppCompra;

abstract class producto {
    protected double gasto;
    public producto() {
    }
    public producto (double gasto){
        this.gasto = gasto;
    }

    public double getgasto() {
        return gasto;}
    public void setgasto (double gasto) {
        this.gasto = gasto;}

    public abstract double gastoConIva();
}


