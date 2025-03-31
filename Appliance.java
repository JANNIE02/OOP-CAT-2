
    abstract class Appliance {
        public abstract void turnOn();
    }

    class Fan extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("Fan is turning on...");
        }
    }

    class TV extends Appliance {
        @Override
        public void turnOn() {
            System.out.println("TV is turning on...");
        }


        public static void main(String[] args) {
            Appliance fan = new Fan();
            Appliance tv = new TV();
            fan.turnOn();
            tv.turnOn();
        }
    }