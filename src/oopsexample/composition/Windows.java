package oopsexample.composition;

public class Windows {

    private int windowCount;
    private String windowSize;

    public Windows(int windowCount, String windowSize) {
        this.windowCount = windowCount;
        this.windowSize = windowSize;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public String getWindowSize() {
        return windowSize;
    }

    public void windowStatus(){
        if(windowCount > 0){
            System.out.println(this.windowCount + "window/s is/are open");
        }else{
            System.out.println("All windows are closed");
        }
    }
}
