public class Clock {

    private int hours;
    private int minutes;
    private int seconds;


    //default constructor
    public Clock() {
        setHours(12);
        setHours(0);
        setHours(0);
    }

    //constructor HH:MM:SS
    public Clock(int defHours, int defMinutes, int defSeconds) {
        if (checkTime(defHours, defMinutes, defSeconds) == true) {
            setHours(defHours);
            setMinutes(defMinutes);
            setSeconds(defSeconds);
        } else {
            //throw new Exception("Time is not allowed. HH:mm:ss is the only accepted form.");
        }
    }

    //constructor seconds after midnight
    public Clock(int defSeconds){
        setHours(defSeconds/3600);
        setMinutes((defSeconds % 3600) / 60);
        setSeconds((defSeconds % 3600) % 60);
    }

    //mutator seconds after midnight
    public void setClock(int defSeconds){
        setHours(defSeconds/3600);
        setMinutes((defSeconds % 3600) / 60);
        setSeconds((defSeconds % 3600) % 60);
    }

    //accessor hours
    public int getHours() {
        return hours;
    }

    //accessor minutes
    public int getMinutes() {
        return minutes;
    }

    //accessor seconds
    public int getSeconds() {
        return seconds;
    }

    //mutator hours
    public void setHours(int newHours) {
        if (newHours >= 0 && newHours <= 12)
            hours = newHours;
        // else
            //throw new Exception("Set Hours between 0 and 23 ONLY");
    }

    //mutator minutes
    public void setMinutes(int newMinutes) {
        if (newMinutes >= 0 && newMinutes <= 59)
            minutes = newMinutes;
        //else
            //throw new Exception("Set Minutes between 0 and 59 ONLY");
    }

    //mutator seconds
    public void setSeconds(int newSeconds) {
        if (newSeconds >= 0 && newSeconds <= 59) {
            seconds = newSeconds;
        } else {
            System.out.println("Error: Seconds must be a value between 0 and 59 inclusive.");
            //System.exit();
        }
    }

    //mutator add one second
    public void tick() {
        seconds++;
    }

    //toString method - Output: hh:mm:ss
    public String toString() {
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
        // future: add 0s in the front so no: 3:2:34, need: 03:02:34
    }

    public void tickDown() {
        seconds--;
    }




    public static boolean checkTime (int checkHours, int checkMinutes, int checkSeconds) {
        if (checkHours >= 0 && checkHours <= 23
            && checkMinutes >= 0 && checkMinutes <= 59
            && checkSeconds >= 0 && checkSeconds <= 59) {
                return true;
            } else {
                return false;
            }
    }

}
