import java.util.ArrayList;

public class OperationState extends SuperState {
    private onState on;
    private CoolingState coolingState;
    private HeatingState heatingState;
    private FanningState fanningState;
    private boolean isFanning;


    public OperationState(onState on){
        this.on = on;
        this.innerStates = new ArrayList<>();
        this.fanningState = new FanningState(this);
        this.coolingState = new CoolingState(this);
        this.heatingState = new HeatingState(this);
        this.currentState = this.fanningState;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void handleEntry() {
        this.isFanning = true;
        this.setCurrentState(this.fanningState);


    }

    @Override
    public void handleExit() {

    }

    @Override
    public void handleDo() {

    }


    public float getCTemp(){
        return this.on.getCTemp();
    }


    public float getRTemp(){
        return this.on.getRTemp();
    }
}
