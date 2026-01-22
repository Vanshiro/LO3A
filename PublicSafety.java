public class PublicSafety {
    Station campus;
    Station city;
    public PublicSafety(String campus, String city){
        this.campus = new Station(campus);
        this.city = new Station(city);
        badgeNum = 0;
    }
    public void doHire(boolean hire){
        badgeNum ++;
        if(hire){
            city.hireDetective();
        }else{
            campus.hireDetective();
        }
    }

}
