package bai8_Lol.entities;

public class Champion {
    private String championName;
    private String position;

    public Champion(String name, String position) {
        this.championName = name;
        this.position = position;
    }

    public Champion() {
    }

    public String getName() {
        return championName;
    }

    public void setName(String name) {
        this.championName = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return
                "name='" + championName + '\'' +
                ", position='" + position + '\'' ;
    }


}
