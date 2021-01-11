public class offState implements State {
    private AirConditioner ac;
    public offState(AirConditioner ac){
        this.ac = ac;

    }

    @Override
    public String getName() {
        return "OFF";
    }

    @Override
    public void handleEntry() {
        System.out.println("OFF");
    }

    @Override
    public void handleExit() {
        this.ac.setC_temp(25);
    }

    @Override
    public void handleDo() {

    }

    @Override
    public void setCurrentState(State s) {

    }

    @Override
    public void notifyChange() {

    }
}
