package main.java.ua.lviv.iot.models;

public class GoodsInfo {

    private String material;
    private int weight;
    private String colour;


    public GoodsInfo(String material, int weight, String colour) {
        this.material = material;
        this.weight = weight;
        this.colour = colour;

    }

    public String getMaterialType() {

        return material;
    }


    public void setMaterialType(String material) {
        this.material = material;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


}