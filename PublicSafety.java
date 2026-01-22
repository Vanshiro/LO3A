public class PublicSafety {
    Station campus;
    Station city;
    //Create Stations with its name/role
    public PublicSafety(String campus, String city){
        this.campus = new Station(campus);
        this.city = new Station(city);
    }
    //Hire process with station specification
    public void doHire(boolean hire){
        if(hire){
            city.hireDetective();
        }else{
            campus.hireDetective();
        }
    }
    //Print out the office's detectives across its two station
    public void printDetectiveLists(){
        city.printDetectives();
        campus.printDetectives();
    }
}
