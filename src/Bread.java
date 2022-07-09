import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bread extends Products implements Veganeble{
    public Bread(String type, String manufacture, String date, String composition) {
        this.type = type;
        this.manufacture = manufacture;
        this.date = date;
        this.composition = composition;
    }

    @Override
    public void find(Products s) {
            Pattern pattern = Pattern.compile("[Гг]лютен");
            Matcher matcher = pattern.matcher(s.composition);
            while (matcher.find()) {
                System.out.println(s.type + " " + s.manufacture + " с глютеном");
            }
    }
    @Override
    public String toString(){
        return "Хлебобулочное изделие: " + type + " " + manufacture ;
    }

    @Override
    public void vegan() {
        System.out.println(type + " " + manufacture + " "+ "Vegan Friendly");
    }
}
