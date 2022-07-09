import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Meat extends Products{

    public Meat(String type, String manufacture, String date, String composition) {
        this.type = type;
        this.manufacture = manufacture;
        this.date = date;
        this.composition = composition;
    }

    @Override
    public void find(Products s) {
            Pattern pattern = Pattern.compile("[Сс]оевый белок");
            Matcher matcher = pattern.matcher(s.composition);
            while (matcher.find()) {
                System.out.println(s.type + " " + s.manufacture + " с соей");
            }
    }

    @Override
    public String toString(){
        return "Мясное изделие: " + type + " " + manufacture ;
    }


}
