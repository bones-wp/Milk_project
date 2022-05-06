import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Meat extends Products{

    public Meat(String date, String composition, String manufacture, String type) {
        super(date, composition, manufacture, type);
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
