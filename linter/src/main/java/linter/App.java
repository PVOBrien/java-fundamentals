/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    }

    public String linterWorker(String testFile) {
//        testFile = "src/main/resources/gates.js";
        Scanner file;
        try {
            file = new Scanner(new File(testFile)); // "src/main/resources/gates.js"
        } catch (FileNotFoundException e) {
            System.out.println("We couldn't find that file.");
            return "We couldn't find that file";
        }

        int counter = 0;
        String errorMessage = "";

        while (file.hasNextLine()) {
            counter++;
            String currentString = file.nextLine();
            if (!currentString.isBlank()) { // https://stackoverflow.com/questions/14690169/check-if-line-is-empty-in-java
//              counter++;
                char endChar = currentString.charAt(currentString.length() - 1);
                if (!(endChar == ';' || endChar == '{' || endChar == '}' || currentString.contains("if") || currentString.contains("else"))) {
                    errorMessage += "Line " + counter + ": Missing semicolon.\n";
                }
            }
        }
        System.out.println(errorMessage);
        return errorMessage;
    }
}
