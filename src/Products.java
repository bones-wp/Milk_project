abstract class Products{
    String date;
    String composition;
    String manufacture;
    String type;

    public Products (String type) {
        this.type = type;
    }


    abstract public void find(Products s);

}
