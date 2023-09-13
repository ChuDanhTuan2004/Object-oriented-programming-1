package ChuongTrinhDienThoaiVaCuaHangDT;
public class Mobile {

    private String phoneCode;

    private String manufacturer;

    private String color;

    private int width;

    private int length;

    private int thickness;

    private int energy;

    public Mobile() {
        this.manufacturer = "Nokia";
        this.color = "xanh";
        this.width = 30;
        this.length = 60;
        this.thickness = 1;
        this.energy = 10;
    }

    public Mobile(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Mobile(String manufacturer, String color) {
        this.manufacturer = manufacturer;
        this.color = color;
    }


    public Mobile(String phoneCode, String manufacturer, String color, int width, int length, int thickness, int energy) {
        this.phoneCode = phoneCode;
        this.manufacturer = manufacturer;
        this.color = color;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.energy = energy;
    }


    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (this.energy >= 0 && this.energy <= 100) {
           this.energy = energy;
        }
    }

    public void display() {
        System.out.println("Mobile{" + "phoneCode='" + phoneCode + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", thickness=" + thickness +
                ", energy=" + energy +
                '}');
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "phoneCode='" + phoneCode + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", thickness=" + thickness +
                ", energy=" + energy +
                '}';
    }
}
