public class Park {
    private String name;
    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getAttractionName() {
            return attractionName;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getCost() {
            return price;
        }
    }
        public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Park park = new Park("Skytown");
        Park.Attraction bigShot = park.new Attraction("Big Shot", "08:00 - 20:00", 7.00);
        Park.Attraction formulaRossa = park.new Attraction("Formula Rossa", "09:00 - 20:00", 10.00);
    }
}