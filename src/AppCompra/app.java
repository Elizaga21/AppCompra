package AppCompra;

public class app {

    public static void main(String[] args) {
        producto obj = new producto() {
            double result = getgasto();

            @Override
            public double gastoConIva() {
                return gastoConIva();
            }
        };

        producto p1 = new leche(5,1.95*1.04);
        producto p2 = new salmon(11.85 *1.08,4);
        producto p3 = new whisky(11,11.90 * 1.21);


        System.out.println("Leche:" + p1.gastoConIva() + " euros");

        System.out.println("Salmón:" + p2.gastoConIva() + " euros");

        System.out.println("Whisky:" + p3.gastoConIva() + " euros");




    }
}
