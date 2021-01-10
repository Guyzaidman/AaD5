public interface State {
    public String getName();
    public void handleEntry();
    public void handleExit();
    public void handleDo();

    void setcurrentState(String cooling);
}
