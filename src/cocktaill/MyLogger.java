package cocktaill;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger implements MyLog {

    private String failStream;

    public MyLogger(String failStream) {
        this.failStream = failStream;
    }

    @Override
    public void log(String msg) {
        try {
            FileWriter MyFail = new FileWriter(this.failStream, true);

            MyFail.write(msg + "\n");
            MyFail.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
