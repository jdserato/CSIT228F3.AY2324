package Bingo;

public class BingoCell {
    int num;
    public boolean isTrue;

    public BingoCell(int num) {
        this.num = num;
        isTrue = false;
    }

    @Override
    public String toString() {
        return num + "";
    }
}
