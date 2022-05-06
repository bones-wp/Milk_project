abstract class Products{
    String date;
    String composition;
    String manufacture;
    String type;

    public Products(String date, String composition, String manufacture, String type) {
        this.date = date;
        this.composition = composition;
        this.manufacture = manufacture;
        this.type = type;
    }

    abstract public void find(Products s);

}
