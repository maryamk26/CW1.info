package machine;
public class SPECS {
    private String BODY;
    private String ENGINE;
    private String TRANS;
    private String COLOR;

    public SPECS(String body, String engine, String trans, String color) {
        this.BODY = body;
        this.ENGINE = engine;
        this.TRANS = trans;
        this.COLOR = color;
    }

    public String getBODY() {
        return BODY;
    }

    public void setBODY(String body) {
        this.BODY = body;
    }

    public String getENGINE() {
        return ENGINE;
    }

    public void setENGINE(String engine) {
        this.ENGINE = engine;
    }

    public String getTRANS() {
        return TRANS;
    }

    public void setTRANS(String trans) {
        this.TRANS = trans;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String color) {
        this.COLOR = color;
    }

    @Override
    public String toString() {
        return "THE CAR SPECS. : (" +
                " THE BODY TYPE : " + BODY +
                ", THE ENGINE TYPE : " + ENGINE +
                ", THE TRANS. : " + TRANS +
                ", THE COLOR : " + COLOR  +
                ')';
    }
    public boolean matches(SPECS searchSpecs) {
        return (searchSpecs.getBODY() == null || searchSpecs.getBODY().equals(BODY))
                && (searchSpecs.getENGINE() == null || searchSpecs.getENGINE().equals(ENGINE))
                && (searchSpecs.getTRANS() == null || searchSpecs.getTRANS().equals(TRANS))
                && (searchSpecs.getCOLOR() == null || searchSpecs.getCOLOR().equals(COLOR));
    }
}