public class AirConditioner {
    private float roomTemp;
    private float chosenTemp;
    private State on;
    private State off;
    private State wait;
    private State currentState;

    public AirConditioner(){
        this.roomTemp = 25;
        this.chosenTemp = 25;
        this.on = new onState(this);
        this.off = new offState(this);
        this.wait = new waitState(this);
        this.setCurrentState(this.off);
    }

    public void setCurrentState(State s){
        this.currentState.handleExit();
        s.handleEntry();
        this.currentState = s;
    }

    public void on(){
        if (this.currentState == this.off){
            this.setCurrentState(this.wait);
            this.setCurrentState(this.on);
        }

    }
    public void off(){

    }
    public void setC_temp(int temp){
        this.chosenTemp = temp;

    }
    public void setR_temp(int temp){
        this.roomTemp = temp;
    }

    public float getCTemp() {
        return this.chosenTemp;
    }

    public float getRTemp() {
        return this.roomTemp;
    }

    public State getOnState() {
        return this.on;
    }
}
