public class Car{
    
    private String lic;
    private String brand;
    private double w;
    private String color;
    
    public Car(String lic, String brand, double w, String color){
        setLic(lic);
        setBrand(brand);
        setWeight(w);
        setColor(color);
    }

    public String getLicensePlateNumber(){
        return lic.toUpperCase();
    }

    public void setLic(String lic){
        this.lic = lic.toUpperCase();
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public double getWeight(){
        return w;
    }

    public void setWeight(double w){
        this.w = w;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isLighterThan(Car other){
        if (this.w >= other.w){
            return false;
        }
        return true;
    }

    public boolean requiresCLicense() {
        if(this.w > 3.5){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("Car(%s(%s), %s, %.2ft)",this.brand,this.lic,this.color,this.w);
    }
}