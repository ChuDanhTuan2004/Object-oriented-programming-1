import java.util.ArrayList;

public class ChuongTrinhDienThoai {
    public static void main(String[] args) {
        Mobile nokia = new Mobile();
        Mobile iPhone = new Mobile();

        nokia.turnOn();
        iPhone.turnOn();

        nokia.composeMessage("Hello from Nokia");
        nokia.sendMessage(iPhone);

        iPhone.viewInbox();
    }

    public static class Mobile {
        private int batteryLevel;
        private String draftMessage;
        private ArrayList<String> inbox;
        private ArrayList<String> sentMessages;
        private boolean isOn;

        public Mobile() {
            batteryLevel = 100;
            draftMessage = "";
            inbox = new ArrayList<>();
            sentMessages = new ArrayList<>();
            isOn = false;
        }

        public void turnOn() {
            if (!isOn) {
                isOn = true;
                batteryLevel--;
                System.out.println("Mobile is on.");
            } else {
                System.out.println("Mobile is already on.");
            }
        }

        public void turnOff() {
            if (isOn) {
                isOn = false;
                batteryLevel--;
                System.out.println("Mobile is off.");
            } else {
                System.out.println("Mobile is already off.");
            }
        }

        public void chargeBattery() {
            if (batteryLevel < 100) {
                batteryLevel++;
                System.out.println("Battery level is now " + batteryLevel + "%.");
            } else {
                System.out.println("Battery is already fully charged.");
            }
        }

        public void composeMessage(String message) {
            if (isOn) {
                draftMessage = message;
                batteryLevel--;
                System.out.println("Message has been composed.");
            } else {
                System.out.println("Mobile is off, cannot compose message.");
            }
        }

        public void receiveMessage(String message) {
            if (isOn) {
                inbox.add(message);
                batteryLevel--;
                System.out.println("Message received.");
            } else {
                System.out.println("Mobile is off, cannot receive message.");
            }
        }

        public void sendMessage(Mobile recipient) {
            if (isOn) {
                if (!draftMessage.equals("")) {
                    recipient.receiveMessage(draftMessage);
                    sentMessages.add(draftMessage);
                    draftMessage = "";
                    batteryLevel--;
                    System.out.println("Message sent.");
                } else {
                    System.out.println("No message drafted.");
                }
            } else {
                System.out.println("Mobile is off, cannot send message.");
            }
        }

        public void viewInbox() {
            if (isOn) {
                if (inbox.size() > 0) {
                    System.out.println("Inbox:");
                    for (String message : inbox) {
                        System.out.println("- " + message);
                    }
                    batteryLevel--;
                } else {
                    System.out.println("Inbox is empty.");
                }
            } else {
                System.out.println("Mobile is off, cannot view inbox.");
            }
        }

        public void viewSentMessages() {
            if (isOn) {
                if (sentMessages.size() > 0) {
                    System.out.println("Sent messages:");
                    for (String message : sentMessages) {
                        System.out.println("- " + message);
                    }
                    batteryLevel--;
                } else {
                    System.out.println("No messages have been sent.");
                }
            } else {
                System.out.println("Mobile is off, cannot view sent messages.");
            }
        }

        public boolean isOn() {
            return isOn;
        }
    }
}
