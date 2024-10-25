package Songs;

public class Song {
    //Type List, Name, and Time.
    private String typeList;
    private String name;
    private String time;

    public Song(String time, String typeList, String name) {
        this.time = time;
        this.typeList = typeList;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTime (){
        return time;
    }

}
