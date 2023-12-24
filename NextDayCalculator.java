public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
//        neu thang 1-3-5-7-8-10-12->31
//        neu thang con lai 30
        int lastOfMonth = getLastOfMonth(monthTest);

        if (dayTest==lastOfMonth){
            monthTest++;
            dayTest=1;
        }
        else {
            dayTest++;
        }

        String result = dayTest+ CONCATENATION +monthTest+CONCATENATION+yearTest;
        return result;
    }

    private static int getLastOfMonth(int monthTest) {
        int lastOfMonth=0;
        switch (monthTest){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth=31;
                break;
            case 2:
                lastOfMonth=28;
                break;
            default:
                lastOfMonth=30;
        }
        return lastOfMonth;
    }
}

