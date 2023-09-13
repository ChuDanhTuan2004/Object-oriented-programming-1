package ChuongTrinhDienThoaiVaCuaHangDT;

import java.util.Arrays;

public class MobileStore {
    private Mobile[] mobiles;
    private int numberOfPhones;

    public MobileStore() {
        this.mobiles = new Mobile[100];
        this.numberOfPhones = 0;
    }

    public MobileStore(int storageLevel) {
        this.mobiles = new Mobile[storageLevel];
        this.numberOfPhones = 0;
    }

    public boolean addPhone(Mobile mobile) {
        if (this.numberOfPhones == this.mobiles.length) {
            return false;
        } else {
            this.mobiles[this.numberOfPhones] = mobile;
            this.numberOfPhones++;
            return true;
        }
    }

    public boolean sellPhone(String phoneCode) {
        for (int i = 0; i < this.numberOfPhones; i++) {
            if (this.mobiles[i].getPhoneCode() == phoneCode) {
                for (int j = i; j < this.numberOfPhones - 1; j++) {
                    this.mobiles[j] = this.mobiles[j + 1];
                }
                this.mobiles[this.numberOfPhones - 1] = null;
                this.numberOfPhones--;
                return true;
            }
        }
        return false;
    }

    public boolean updatePhoneInfo(String phoneCode, String manufacturer, String color, int width, int length, int thickness, int energy) {
        for (int i = 0; i < this.numberOfPhones; i++) {
            if (this.mobiles[i].getPhoneCode() == phoneCode) {
                this.mobiles[i].setManufacturer(manufacturer);
                this.mobiles[i].setColor(color);
                this.mobiles[i].setWidth(width);
                this.mobiles[i].setLength(length);
                this.mobiles[i].setThickness(thickness);
                this.mobiles[i].setEnergy(energy);
                return true;
            }
        }
        return false;
    }

    public void showPhoneInfo() {
        System.out.println("Danh sách điện thoại trong kho: ");
        for (int i = 0; i < mobiles.length; i++) {
            System.out.println("Điện thoại " + (i + 1) + ": " + this.mobiles[i]);
        }
    }
}
