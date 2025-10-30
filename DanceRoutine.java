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

    public String remixRoutine() {
        StringBuilder Routine = new StringBuilder();
        Routine.insert(0, "--- REMIX ---\n");
        Routine.append(buildRoutine());
        Routine.delete(Routine.length() - 1,Routine.length());
        Routine.append("\n(Backwards Boohbah Shuffle!)");
        Routine.reverse();

        return Routine.toString();
    }

}
