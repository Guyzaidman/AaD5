public class FanningState implements State {
    private SuperState operationState;
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
}
