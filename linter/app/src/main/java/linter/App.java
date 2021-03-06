/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static int linterMessage (String path) throws IOException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)));
        int errorLine = 0;
        int error = 0;
        String curr = "";
            while (scanner.hasNext()) {
                curr = scanner.nextLine();
                if(!curr.endsWith(";") && !curr.isEmpty() &&
                        !curr.endsWith("{")
                        &&
                        !curr.endsWith("}") &&
                        !curr.contains("if") &&
                        !curr.contains("else")
                ) {
                    error++;

                    System.out.println(++errorLine + " Missing Semicolon.");
                }else{
                    errorLine++;
                }
            }
        return error;
    }
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js");
        new App().linterMessage(path.toString());
    }

}
