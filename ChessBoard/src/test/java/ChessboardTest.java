import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChessboardTest {

    Chessboard c = new Chessboard();

    @Test
    public void colorDetectorTest() {
        try {
            Assertions.assertEquals(ChessColor.WHITE,c.colorDetector("b1"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assertions.assertThrows(Exception.class,() -> c.colorDetector("b9"));
    }

    @Test
    public void colorDetectorTestV2() {
        try {
            Assertions.assertEquals(ChessColor.WHITE,c.colorDetectorV2("b1"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assertions.assertThrows(Exception.class,() -> c.colorDetectorV2("b9"));
    }
}