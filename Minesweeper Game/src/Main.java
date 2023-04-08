import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rowNumber, columnNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of minefield rows: ");
        rowNumber = scan.nextInt();
        System.out.print("Enter the number of minefield columns: ");
        columnNumber = scan.nextInt();

        if(rowNumber > 1 && columnNumber > 1){
            MineSweeper mine = new MineSweeper(rowNumber,columnNumber);
            mine.run();
        }
        else{
            System.out.println("You entered an invalid number of rows and columns.");
        }
    }
}
