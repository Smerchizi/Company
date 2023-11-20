package telran.view;

import java.util.function.Function;

public interface InputOutput {
    String readString(String prompt);
    void write(String str);
    default void writeLine(String str){
        write(str + "\n");
    }
    default <T> T readObject(String prompt, String errorPromt, Function<String, T> mapper){
        boolean running = false;
        do {
            running = false;
            try {

            }
            catch (Exception e){
                running = true;
            }
        }while (running);
        return null;
    }
}
