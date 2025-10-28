public class DanceRoutine {
    private Boohbah[] boohbahs;

    DanceRoutine(Boohbah[] boohbahs) {
        this.boohbahs = boohbahs;
    }

    public Boohbah[] getBoohbahs() {
        return boohbahs;
    }

    public String buildRoutine() {
        StringBuilder Routine = new StringBuilder();
        for (Boohbah boohbah : boohbahs) {
            Routine.append(boohbah.performMove()).append("\n");
        }
        return Routine.toString();
    }

    public String modifyRoutine() {
        StringBuilder Routine = new StringBuilder();
        for (Boohbah boohbah : boohbahs) {
            Routine.append(boohbah.performMove()).append("\n");
        }
        String routineInString = Routine.toString();
        routineInString = routineInString.replaceAll("performs", "dances to"); // Used Google AI, got stuck

        return routineInString;
    }
}
