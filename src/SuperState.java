import java.util.ArrayList;
import java.util.HashMap;

public abstract class SuperState implements State{
    public HashMap<String, State> innerStates;
//    public HashMap<State, State> currentStates;
//    public State getState(String name){
//
//    }

    public void insertState(State s){
        this.innerStates.add(s);
    }

    public void removeState(State s){
        this.innerStates.remove(s);
    }
}


