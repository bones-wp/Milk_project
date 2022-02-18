abstract class Products{
    String date;
    String composition;
    String manufacture;
    String type;

    public Products (String type, String manufacture, String date, String composition) {
        this.type = type;
        this.manufacture = manufacture;
        this.date = date;
        this.composition = composition;
    }


    abstract public void find(Products s);

}
