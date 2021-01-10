public class onState implements State {
    private AirConditioner ac;
    public onState(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public String getName() {
        return "ON";
    }

    @Override
    public void handleEntry() {

    }

    @Override
    public void handleExit() {

    }

    @Override
    public void handleDo() {

    }
}
