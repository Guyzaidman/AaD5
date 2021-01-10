public class waitState implements State {
    private AirConditioner ac;
    public waitState(AirConditioner ac) {
        this.ac = ac;

    }

    @Override
    public String getName() {
        return "WAIT";
    }

    @Override
    public void handleEntry() {

    }

    @Override
    public void handleExit() {
        System.out.println("WAITING 30 SECONDS");
        if (ac.getCTemp() >= ac.getRTemp()){
            this.ac.getOnState().setcurrentState("cooling");
        }

    }

    @Override
    public void handleDo() {

    }
}
