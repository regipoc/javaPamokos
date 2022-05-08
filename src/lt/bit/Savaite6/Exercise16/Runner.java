package lt.bit.Savaite6.Exercise16;

public enum Runner {

//    Create an enum Runner class with constants BEGINNER, INTERMEDIATE, ADVANCED. Enum should have two
//    parameters:
//    minimum time of running a marathon in minutes
//    maximum running time of the marathon in minutes
//    In addition, the Runner enum should contain the static getFitnessLevel() method, which takes any time
//    result of a marathon run, and as a result should return a specific Runner object based on the given time.

    BEGGINER(1, 10),
    INTERMEDIATE(11, 40),
    ADVANCED(41, 100),
    UNDEFINED(0,0);

    private int minMinutes, maxMinutes;

    Runner(int minMinutes, int maxMinutes){
        this.maxMinutes = maxMinutes;
        this.minMinutes = minMinutes;
    }

    public static Runner getFitnessLevel(int minutes){
        if(BEGGINER.minMinutes <= minutes && minutes <= BEGGINER.maxMinutes){
            return BEGGINER;
        }

        if(INTERMEDIATE.minMinutes <= minutes && minutes <= INTERMEDIATE.maxMinutes){
            return INTERMEDIATE;
        }

        if(ADVANCED.minMinutes <= minutes && minutes <= ADVANCED.maxMinutes){
            return ADVANCED;
        }

        return UNDEFINED;
    }
}
