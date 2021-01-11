public class HeatState implements State {
    private ModeState mode;


    public HeatState(ModeState mode) {
        this.mode = mode;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void handleEntry() {
        System.out.println("MODE-HEAT");
    }

    @Override
    public void handleExit() {

    }

    @Override
    public void handleDo() {

    }

    @Override
    public void setCurrentState(State s) {

    }

    public float getCTemp(){
        return this.mode.getCTemp();
    }


    public float getRTemp(){
        return this.mode.getRTemp();
    }
}
