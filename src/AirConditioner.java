public class AirConditioner {
    private float roomTemp;
    private float chosenTemp;
    private State on;
    private State off;
    private State wait;
    private State currentState;

    public AirConditioner(){
        this.roomTemp = 25;
//        this.chosenTemp = 25;
        this.on = new onState(this);
        this.off = new offState(this);
        this.wait = new waitState(this);
        this.setCurrentState(this.off);
    }

    public void setCurrentState(State s){
        if (this.currentState != null) {
            this.currentState.handleExit();
        }
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
        if (this.currentState == this.on){
            this.setCurrentState(this.off);
        }
    }

    public void setC_temp(int temp){
        System.out.println("set c_temp to " + temp);
        this.chosenTemp = temp;
        if (this.currentState == this.on){
            this.currentState.notifyChange();
        }
    }

    public void setR_temp(int temp){
        System.out.println("set r_temp to " + temp);
        this.roomTemp = temp;
        if (this.currentState == this.on){
            this.currentState.notifyChange();
        }
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
