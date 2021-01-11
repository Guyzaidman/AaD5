public class CoolState implements State {
    private ModeState mode;

    public CoolState(ModeState mode) {
        this.mode = mode;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void handleEntry() {
        System.out.println("MODE-COOL");
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

    @Override
    public void notifyChange() {

    }

    public float getCTemp(){
        return this.mode.getCTemp();
    }


    public float getRTemp(){
        return this.mode.getRTemp();
    }
}
