package com.playalong.Chess;

public class Board {

    final int SIZE = 8;

    ChessPiece[][] matrix ;

    public Board() {
        matrix = new ChessPiece[SIZE][SIZE];
    }

    private void resetBoard() {
        //set pawns
        for (int i = 0; i < SIZE; i++) {
            matrix[1][i] = new ChessPiece(Enums.ChessPieceColor.WHITE, Enums.ChessPieceType.PAWN);
        }
        for (int i = 0; i < SIZE; i++) {
            matrix[SIZE-2][i] = new ChessPiece(Enums.ChessPieceColor.BLACK, Enums.ChessPieceType.PAWN);
        }

        matrix[0][0] = new ChessPiece(Enums.ChessPieceColor.WHITE, Enums.ChessPieceType.BISHOP);
        matrix[0][1] = new ChessPiece(Enums.ChessPieceColor.WHITE, Enums.ChessPieceType.ROOK);
        //...
    }

    public boolean isPositionEmpty(int i, int j) {
        return areCoordinatesValid(i,j) && matrix[i][j] == null;
    }

    private boolean areCoordinatesValid(int i, int j) {
        return i >= 0 && i < SIZE && j >= 0 && j < SIZE;
    }

    public boolean changeChessPiecePosition(int srcPosI, int srcPosJ, int destPosI, int destPosJ) {
        if (!isPositionEmpty(destPosI, destPosJ) || !areCoordinatesValid(srcPosI, srcPosJ))
            return false;
        matrix[destPosI][destPosJ] = matrix[srcPosI][srcPosJ];
        matrix[srcPosI][srcPosJ] = null;

        return true;
    }
}
