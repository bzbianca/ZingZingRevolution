public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah boohbah1 = new Boohbah("Zing Zing Zingbah", "Spin and Sparkle");
        Boohbah boohbah2 = new Boohbah("Humbah", "Wiggle Wiggle");
        Boohbah boohbah3 = new Boohbah("Jumbah", "Twirl of Joy");
        Boohbah[] boohbahList = {boohbah1, boohbah2, boohbah3};

        DanceRoutine danceRoutine = new DanceRoutine(boohbahList);

        System.out.println("Original Routine:");
        System.out.println(danceRoutine.buildRoutine());
        System.out.println("Modified Routine:");
        System.out.println(danceRoutine.modifyRoutine());
    }
}
