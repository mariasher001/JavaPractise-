
public class DecimalToBinary {

    int rem = 0;
    int p=1;
    public int  DecToBin(int Decimal) {

        while( Decimal > 0) {
            rem = rem+(Decimal % 2)*p;
            p=p*10;
            Decimal = Decimal / 2;
        }
        return rem;

    }
}
