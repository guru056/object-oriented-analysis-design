package com.playalong.Chess;

public class ChessPiece {

    private Enums.ChessPieceColor color;
    private Enums.ChessPieceType type;

    public ChessPiece(Enums.ChessPieceColor color, Enums.ChessPieceType type) {
        this.color = color;
        this.type = type;
    }

    public BoardCoordinate getNextPosition() {
        switch (type) {
            case KING:
                return null;
            case QUEEN:
                return null;
            case PAWN:
                return color == Enums.ChessPieceColor.WHITE ? new BoardCoordinate(1,0): new BoardCoordinate(-1,0);

            //..
        }
        return null;
    }
}
