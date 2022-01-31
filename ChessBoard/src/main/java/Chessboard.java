
public class Chessboard {
    /**
     * Algorithm:
     * 1)given the co ordinates of the tile, take two loops i and j
     * 2) in jth loop change color
     * 3)check if the i and jth loop match s1 and s2
     * 4)if yes then stop and check if 0 then return ChessColor.WHITE else ChessColor.BLACK
     *
     * @param input
     * @return
     */
    public ChessColor colorDetector(String input) throws Exception {
        char s1 = input.charAt(0);
        char s2 = input.charAt(1);
        int color = 0;
        int flag = 0;



        for (char i = 'a'; i <= 'h';  i++) {
            for (char j = '1'; j <= '8'; j++) {
                color = 1 - color;
                if (i == s1 && j == s2) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1){
                break;
            }

            color = 1-color;
        }

        if (flag == 1) {
            if (color == 0)
                return ChessColor.WHITE;
            else
                return ChessColor.BLACK;
        }
        else
            throw new Exception("Please enter the correct Co-ordinates for an 8x8 matrix of chess!");
    }

    public ChessColor colorDetectorV2(String input) throws Exception {
        char s1 = input.charAt(0); //97-104
        char s2 = input.charAt(1); //49-56

        if (s1 >= 97 && s1 <= 104 && s2 >= 49 && s2 <= 56) {
            int sum = s1 + s2;
            if (sum % 2 == 0) {
                return ChessColor.BLACK;
            } else {
                return ChessColor.WHITE;
            }
        } else {
            throw new Exception("Please enter the correct Co-ordinates for an 8x8 matrix of chess!");
        }
    }

}
