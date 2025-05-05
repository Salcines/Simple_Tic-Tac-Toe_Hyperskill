class Army {

    public static void createArmy() {
        Unit Gwendolin = new Unit("Gwendolin");
        Unit Greyjoy = new Unit("Greyjoy");
        Unit Tully = new Unit("Tully");
        Unit Tyrant = new Unit("Tyrant");
        Unit Sabine = new Unit("Sabine");

        Knight knight = new Knight("Percival");
        Knight morgan = new Knight("Morgan");
        Knight jackson = new Knight("Jackson");


        General Arthur = new General("Arthur");

        Doctor merlin = new Doctor("Merlin");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}