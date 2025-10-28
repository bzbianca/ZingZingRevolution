public class Boohbah {
    private String name;
    private String danceMove;

    public Boohbah(String name, String danceMove) {
        this.name = name;
        this.danceMove = danceMove;
    }

    public String getName() { // Used Google AI, got stuck
        return name;
    }
    public String getDanceMove() { // Used Google AI, got stuck
        return danceMove;
    }

    public String performMove() {
        return name + " performs " + danceMove;
    }
}