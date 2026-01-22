public class Detective {
    String name;
    int badgeNum;
    public Detective(String name, int badgeNum){
        this.name = name;
        this.badgeNum = badgeNum;
    }
    //Override Detective toString to return badge number and name of detective
    @Override
    public String toString(){
        return "Detective "+"[Badge="+badgeNum+", Name="+name+"]"+"\n";
    }
}
