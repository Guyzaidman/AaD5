public class HeatingState implements State {
    private SuperState operationState;
    public HeatingState(OperationState operationState) {
        this.operationState = operationState;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void handleEntry() {
        System.out.println("OPERATION-HEATING");
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
