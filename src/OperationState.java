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

    @Override
    public void notifyChange() {
        if(this.currentState == this.fanningState){
            if (this.on.getModeState() instanceof CoolState &&
                this.getRTemp() >= this.getCTemp() + 2 && this.isFanning){

                this.setCurrentState(this.coolingState);
            }
            else if (this.on.getModeState() instanceof HeatState &&
                    this.getRTemp() <= this.getCTemp() - 2 && this.isFanning){

                this.setCurrentState(this.heatingState);
            }
        }
        else if (this.currentState == this.coolingState){
            if (this.getRTemp() <= this.getCTemp() - 2){
                this.setCurrentState(this.fanningState);
            }
        }
        else { // this.currentState == this.heatingState
            if (this.getRTemp() >= this.getCTemp() + 2){
                this.setCurrentState(this.fanningState);
            }
        }
    }


    public float getCTemp(){
        return this.on.getCTemp();
    }


    public float getRTemp(){
        return this.on.getRTemp();
    }

    public void setFanning(boolean b){
        this.isFanning = b;
    }
}
