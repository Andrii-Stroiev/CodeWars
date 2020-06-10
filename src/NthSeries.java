import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class NthSeries {

    public static String seriesSum(int n) {
        double sum = 0;
        double j = 1;
        for (int i = 1; i <=n ; i++) {
            sum = sum+1.00/j;
            j=j+3;
        }
        BigDecimal bd = new BigDecimal(Double.toString(sum));
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        return bd.toPlainString();
    }

    public static void main(String[] args) {
        System.out.println(seriesSum(1));
    }
}