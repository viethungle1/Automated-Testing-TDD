import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2018")
    public void testDay1Month1Year2018(){
//        chuan bi du lieu
        int dayTest=1;
        int monthTest=1;
        int yearTest=2018;
        String expected = "2/1/2018";
//        thuc goi ham can test
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
//        so sanh: ket qua thuc te voi ket qua mong muon
        assertEquals(result, expected);
    }

    @Test
    @DisplayName("case 31/1/2018")
    public void testDay31Month1Year2018(){
        //        chuan bi du lieu
        int dayTest=31;
        int monthTest=1;
        int yearTest=2018;
        String expected = "1/2/2018";
//        thuc goi ham can test
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
//        so sanh: ket qua thuc te voi ket qua mong muon
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("case 30/4/2018")
    public void testDay30Month4Year2018(){
        //        chuan bi du lieu
        int dayTest=30;
        int monthTest=4;
        int yearTest=2018;
        String expected = "1/5/2018";
//        thuc goi ham can test
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
//        so sanh: ket qua thuc te voi ket qua mong muon
        assertEquals(result, expected);
    }
    @Test
    @DisplayName("case 28/2/2018")
    public void testDay28Month2Year2018() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.getNextDay(dayTest, monthTest, yearTest);
        assertEquals(result, expected);
    }

}
