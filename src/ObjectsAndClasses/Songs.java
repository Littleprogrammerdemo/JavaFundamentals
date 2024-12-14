package ObjectsAndClasses;
public class Songs {
    private String typeList;
    private String name;
    private String time;
    public Songs (String typeList, String name, String time) {
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }
    public String getName() {
        return name;
    }

    public String getTypeList() {
        return typeList;
    }
}
