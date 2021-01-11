public class CoolingState implements State {
    private SuperState operationState;
    public CoolingState(OperationState operationState) {
        this.operationState = operationState;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void handleEntry() {
        System.out.println("OPERATION-COOLING");
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

    @Override
    public void notifyChange() {

    }
}
