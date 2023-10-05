package fc.java.course1.part4;

import fc.java.course1.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board board = new Board();
        board.setTitle("게시글입니다.");
        System.out.println(board);
        System.out.println(board.getTitle());
    }
}
