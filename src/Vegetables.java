import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vegetables extends Products implements Veganeble{

    public Vegetables(String date, String composition, String manufacture, String type) {
        super(date, composition, manufacture, type);
    }

    @Override
    public String toString(){
        return "Овощи: " + type + " " + manufacture ;
    }

    @Override
    public void vegan() {
        System.out.println(type + " " + manufacture + " "+ "Vegan Friendly");
    }

    @Override
    public void find(Products s) {
        Pattern pattern = Pattern.compile("[Гг]МО");
        Matcher matcher = pattern.matcher(s.composition);
        while (matcher.find()) {
            System.out.println(s.type + " " + s.manufacture + " с ГМО");
        }
    }


}
