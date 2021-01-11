public interface State {
    String getName();
    void handleEntry();
    void handleExit();
    void handleDo();
    void setCurrentState(State s);
    void notifyChange();
}
