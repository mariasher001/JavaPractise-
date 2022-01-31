
public class Main {
    public static void main(String[] args){

        Chessboard c = new Chessboard();

        try {
            System.out.println(c.colorDetector("b1"));
            System.out.println(c.colorDetectorV2("b1"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
