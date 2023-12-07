import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the output file name (e.g., RationalNumbersOutput.txt): ");
        String fileName = scanner.nextLine();

        int lowerBound = getUserInput("Enter the lower bound for x and y: ");
        int upperBound = getUserInput("Enter the upper bound for x and y: ");
        int step = getUserInput("Enter the step size for x and y: ");


        try (PrintStream printStream = new PrintStream(new FileOutputStream(fileName))) {
            // Call method to write to file
            writeHeader(printStream);
            writeRationalNumbers(printStream, lowerBound, upperBound, step);
            writeFooter(printStream, upperBound);

            System.out.println("Program executed successfully. Output written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    private static int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    private static void writeHeader(PrintStream printStream) {
        printStream.println("Name: Kaden");
        printStream.println("Section: Math 263-101");
        printStream.println("Project: #1");
        printStream.println("Programming Language Used: Java");
    }

    private static void writeRationalNumbers(PrintStream printStream, int lowerBound, int upperBound, int step) {
        printStream.println("lowerBound: " + lowerBound+ ", upperBound: " + upperBound + ", step: " + step);
        for (int y = upperBound; y >= lowerBound; y--) {
            for (int x = lowerBound; x <= upperBound; x++) {
                if (y != 0 && (x - lowerBound) % step == 0 && (y - lowerBound) % step == 0) {
                    printStream.println(x + "/" + y);
                }
            }
        }
    }

    private static void writeFooter(PrintStream printStream, int upperBound) {
        printStream.println(upperBound + "/" + upperBound);
    }
}
