import java.util.ArrayList;

public class ModeState extends SuperState{
    private onState on;
    private CoolState coolState;
    private HeatState heatState;

    public ModeState(onState on){
        this.on = on;
        this.coolState = new CoolState(this);
        this.heatState = new HeatState(this);
        this.currentState = this.coolState;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void handleEntry() {
        if (this.getCTemp() >= this.getRTemp()){
            this.setCurrentState(this.coolState);
        }
        else {
            this.setCurrentState(this.heatState);
        }
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

    private State getCoolState(){
        return this.innerStates.get(0);
    }

    private State getHeatState(){
        return this.innerStates.get(1);
    }
}
