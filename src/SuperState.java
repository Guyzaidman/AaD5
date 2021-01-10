import java.util.ArrayList;

public abstract class SuperState implements State{
    public State currentState;
    public ArrayList<State> innerStates;

    public void insertState(State s){
        this.innerStates.add(s);
    }

    public void removeState(State s){
        this.innerStates.remove(s);
    }

    public void setCurrentState(State s) {
        if (this.currentState != null) {
            this.currentState.handleExit();
        }
        s.handleEntry();
        this.currentState = s;
    }
}


