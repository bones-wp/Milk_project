import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bread extends Products{
    public Bread(String type, String manufacture, String date, String composition) {
        super(type, manufacture, date, composition);
    }

    @Override
    public void find(Products s) {
            Pattern pattern = Pattern.compile("[Гг]лютен");
            Matcher matcher = pattern.matcher(s.composition);
            while (matcher.find()) {
                System.out.println(s.type + " " + s.manufacture + " с глютеном");
            }
    }

}
