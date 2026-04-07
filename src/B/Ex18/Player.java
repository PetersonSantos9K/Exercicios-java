package B.Ex18;

public class Player implements Comparable<Player>{
    private String name;
    private Integer points;
    private Integer victory;

    public Player(String name, Integer points, Integer victory) {
        this.name = name;
        this.points = points;
        this.victory = victory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getVictory() {
        return victory;
    }

    public void setVictory(Integer victory) {
        this.victory = victory;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Points: %d, Victory: %d", getName(), getPoints(), getVictory());
    }


    @Override
    public int compareTo(Player o) {



        if(Integer.compare(getPoints(), o.getPoints()) != 0){
            return getPoints() - o.getPoints();
        }

        if(!getVictory().equals(o.getVictory())){
            return getVictory() - o.getVictory();
        }

        return getName().compareTo(o.getName());
    }
}
