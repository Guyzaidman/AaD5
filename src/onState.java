import java.util.ArrayList;

public class onState extends SuperState {
    private AirConditioner ac;
    private State modeState;
    private State operationState;

    public onState(AirConditioner ac) {
        this.ac = ac;
        this.modeState = new ModeState(this);
        this.operationState = new OperationState(this);
    }

    @Override
    public String getName() {
        return "ON";
    }

    @Override
    public void handleEntry() {
        System.out.println("ON");
        this.modeState.handleEntry();
        this.operationState.handleEntry();
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
        return this.ac.getCTemp();
    }


    public float getRTemp(){
        return this.ac.getRTemp();
    }
}
