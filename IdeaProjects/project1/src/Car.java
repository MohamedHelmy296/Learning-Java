public class Car {
    private String name ;
    private int model ;
    private int maxSpeed;
    private float Price;

    public void setName(String n ){
        name = n ;
    }

    public String getName() {
        return name;
    }

    public void setModel(int m){
        if (m >= 2015)
            model = m ;
    }

    public int getModel() {
        return model;
    }

    public void setMaxSpeed(int M){
        maxSpeed = M ;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setPrice(float p){
        Price = p ;
    }

    public float getPrice(){
        return Price ;
    }


}
