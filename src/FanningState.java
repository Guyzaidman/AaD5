public class FanningState implements State {
    private OperationState operationState;
    public FanningState(OperationState operationState) {
        this.operationState = operationState;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void handleEntry() {
        System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
        this.operationState.setFanning(true);
    }

    @Override
    public void handleExit() {
        this.operationState.setFanning(false);

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
}
