//package timeConverter;
//
//import model.Time;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TimeList {
//    List<Time> timeList;
//
//    public TimeList(){
//        List<Time> timeList = new ArrayList<>();
//        this.timeList = timeList;
//        Time seconds = new Time(1,"Segundos", "s", BigDecimal.valueOf(1));
//        Time minutes = new Time(2,"Minutos", "m", BigDecimal.valueOf(60));
//        Time hours = new Time(3,"Horas", "h", BigDecimal.valueOf(3600));
//        Time day = new Time(3,"Dias", "d", BigDecimal.valueOf(86400));
//
//        timeList.add(seconds);
//        timeList.add(minutes);
//        timeList.add(hours);
//        timeList.add(day);
//    }
//
//    //RETORNA A REFERÊNCIA PARA A LISTA DE MOEDAS
//    public List getTimeListReference() {
//        return this.timeList;
//    }
//
//    public Time getTimePerIndex(int index) {
//        return this.timeList.get(index);
//    }
//
//    public String[] getTimeList() {
//        String[] allTime = new String[timeList.size()];
//        for (int i = 0; i < timeList.size(); i++) {
//            allTime[i] = timeList.get(i).getName();
//        }
//        return allTime;
//    }
//
//    public String getTimeListStringPerIndex(int index) {
//        String[] allTime = new String[timeList.size()];
//        for (int i = 0; i < timeList.size(); i++) {
//            allTime[i] = timeList.get(i).getName();
//        }
//        return allTime[index];
//    }
//}
