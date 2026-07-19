public class ChessBoard {

    char[][] board = new char[8][8];

    public void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '.';
            }
        }
    }

    public void displayBoard() {
        System.out.println("Chess Board:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placePiece(String piece, int row, int column) {

        if (piece.equalsIgnoreCase("Rook")) {
            board[row][column] = 'R';
        }
        else if (piece.equalsIgnoreCase("Bishop")) {
            board[row][column] = 'B';
        }
        else if (piece.equalsIgnoreCase("Knight")) {
            board[row][column] = 'K';
        }
        else {
            System.out.println("Invalid Piece");
        }
    }
}
