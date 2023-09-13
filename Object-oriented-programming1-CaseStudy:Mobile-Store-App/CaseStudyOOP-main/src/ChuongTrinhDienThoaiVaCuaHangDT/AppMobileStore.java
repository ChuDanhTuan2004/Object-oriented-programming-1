package ChuongTrinhDienThoaiVaCuaHangDT;

public class AppMobileStore {
    public static void main(String[] args) {
        Mobile mobile001 = new Mobile("MS001","Nokia","Xanh",10,20,1,10);
        Mobile mobile002 = new Mobile("MS002","Apple","Xanh",10,20,1,100);
        Mobile mobile003 = new Mobile("MS003","Samsung","Xanh",10,20,1,100);
        Mobile mobile004 = new Mobile("MS004","Oppo","Xanh",10,20,1,100);
        Mobile mobile005 = new Mobile("MS005","Vivo","Xanh",10,20,2,100);
        Mobile mobile006 = new Mobile("MS006","RoG","Xanh",10,20,1,10);
        Mobile mobile007 = new Mobile("MS007","Nokia","Xanh",10,20,1,100);
        Mobile mobile008 = new Mobile("MS008","Apple","Xanh",10,20,1,10);
        Mobile mobile009 = new Mobile("MS009","Vsmart","Xanh",10,20,1,100);
        Mobile mobile010 = new Mobile("MS010","Nokia","Xanh",10,20,2,10);

        MobileStore objMobileStore = new MobileStore();

        objMobileStore.addPhone(mobile001);
        objMobileStore.addPhone(mobile002);
        objMobileStore.addPhone(mobile003);
        objMobileStore.addPhone(mobile004);
        objMobileStore.addPhone(mobile005);

        objMobileStore.addPhone(mobile006);
        objMobileStore.addPhone(mobile007);
        objMobileStore.addPhone(mobile008);
        objMobileStore.addPhone(mobile009);
        objMobileStore.addPhone(mobile010);

        objMobileStore.showPhoneInfo();
        objMobileStore.sellPhone("MS010");
        objMobileStore.showPhoneInfo();
        objMobileStore.updatePhoneInfo("MS003","Samsung","Vàng",11,22,3,100);
        objMobileStore.showPhoneInfo();
    }
}
