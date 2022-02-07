import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Milk {
    private String type;
    private String manufacture;
    private String date;
    private String composition;

    public Milk(String type, String manufacture, String date, String composition) {
        this.type = type;
        this.manufacture = manufacture;
        this.date = date;
        this.composition = composition;
    }

    static void palm() {
        for (Milk s :Main.products){
            Pattern pattern = Pattern.compile("[Пп]альмовое масло");
            Matcher matcher = pattern.matcher(s.composition);
            while (matcher.find()) {
                System.out.println(s.type + " " + s.manufacture + " с пальмовым маслом");
            }
        }

    }

}
