
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        ChessBoard chessBoard=new ChessBoard();
        MoveValidator validator=new MoveValidator();

        
       

        
        chessBoard.initializeBoard();

        
        chessBoard.displayBoard();
        System.out.print("Enter Piece(Rook/Bishop/knight):");
        String Piece=sc.nextLine();
        System.out.println("Enter Start Row(0-7):");
        int startRow=sc.nextInt();
        System.out.println("Enter Start Column(0-7):");
        int startColumn=sc.nextInt();
        System.out.println("Enter End row(0-7):");
        int endRow=sc.nextInt();
        System.out.println("Enter End Column(0-7:");
        int endColumn=sc.nextInt();
        chessBoard.placePiece(Piece,startRow,startColumn);
        System.out.println("Updated Chess Board:");
        chessBoard.displayBoard();






       
        if(Piece.equalsIgnoreCase("Rook")){
            boolean result=validator.validateRook(startRow,startColumn,endRow,endColumn);
            if(result){
                System.out.println("Valid Rook Move");
            }else{
                System.out.print("Invalid Rook Move");
            }
        }
        if(Piece.equalsIgnoreCase("Bishop")){
            boolean result=validator.validateBishop(startRow,startColumn,endRow,endColumn);
            if(result){
                System.out.println("Valid Bishop Move");
            }
            else{
                System.out.println("Invalid Bishop Move");
            }
        }
        if(Piece.equalsIgnoreCase("Knight")){
            boolean result=validator.validateKnight(startRow,startColumn,endRow,endColumn);
            if(result){
                System.out.println("Valid Knight Move");
            }else{
                System.out.println("Invalid Knight Move");
            }
        }

        
        sc.close();
    }
    
    
 
}