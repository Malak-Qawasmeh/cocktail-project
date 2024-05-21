


package cocktaill;


public class MyLogger implements Logger {
    
    private String attribute1;
    private String attribute2;

    public MyLogger(String attribute1, String attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }
    

    @Override
    public void log(String message){
        System.out.println("MyLogger: " + message);
    }}