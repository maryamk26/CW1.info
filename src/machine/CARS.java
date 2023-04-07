package machine;
public class CARS {
    private SPECS specs;
    private String MODEL;
    private int PRICE;
    private int PASSNO;
    private int SPEED;
    private double FUEL;

    public CARS(SPECS specs, String MODEL, int PRICE, int PASSNO, int SPEED, double FUEL) {
        this.specs = specs;
        this.MODEL = MODEL;
        this.PRICE = PRICE;
        this.PASSNO = PASSNO;
        this.SPEED = SPEED;
        this.FUEL = FUEL;
    }

    public SPECS getSpecs() {
        return specs;
    }

    public String getMODEL() {
        return MODEL;
    }

    public int getPRICE() {
        return PRICE;
    }

    public int getPASSNO() {
        return PASSNO;
    }

    public int getSPEED() {
        return SPEED;
    }

    public double getFUEL() {
        return FUEL;
    }

    @Override
    public String toString() {
        return "THE CAR )" +
                "THE CARS SPECS : " + specs +
                ", THE MODEL : '" + MODEL +
                ", THE PRICE : " + PRICE +
                ", THE NO. OF PASSENGERS : " + PASSNO +
                ", THE MAX SPEED : " + SPEED +
                ", THE FUEL CONS. : " + FUEL +
                ')';
    }
}