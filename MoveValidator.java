public class MoveValidator {

    public boolean validateRook(int startRow, int startColumn, int endRow, int endColumn) {

        if (startRow == endRow || startColumn == endColumn) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateBishop(int startRow, int startColumn, int endRow, int endColumn) {

        if (Math.abs(startRow - endRow) == Math.abs(startColumn - endColumn)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateKnight(int startRow, int startColumn, int endRow, int endColumn) {

        int rowDiff = Math.abs(startRow - endRow);
        int colDiff = Math.abs(startColumn - endColumn);

        if ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) {
            return true;
        } else {
            return false;
        }
    }
}
