package Bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoCard {
    BingoCell[][] nums = new BingoCell[5][5];
    int id;

    public BingoCard(int id) {
        this.id = id;
        Random random = new Random();
        List<Integer> nakuha = new ArrayList<>();
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                int num;
                do {
                    num = (col*15) + random.nextInt(15)+1;
                } while (nakuha.contains(num));
                nakuha.add(num);
                nums[row][col] = BingoGame.result[num];
            }
        }
        nums[2][2] = BingoGame.result[0];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                sb.append(nums[row][col]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
