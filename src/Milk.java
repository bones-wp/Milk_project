import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Milk extends Products{

    public Milk(String type, String manufacture, String date, String composition) {
        this.type = type;
        this.manufacture = manufacture;
        this.date = date;
        this.composition = composition;
    }

    @Override
    public void find(Products s) {
            Pattern pattern = Pattern.compile("[Пп]альмовое масло");
            Matcher matcher = pattern.matcher(s.composition);
            while (matcher.find()) {
                System.out.println(s.type + " " + s.manufacture + " с пальмовым маслом");
            }
    }

    @Override
    public String toString(){
        return "Молочное изделие: " + type + " " + manufacture ;
    }


}
