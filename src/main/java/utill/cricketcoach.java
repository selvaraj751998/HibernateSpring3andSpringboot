package utill;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements Coach{
    public cricketcoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }

    @Override
    public String getdailyworkout() {
        return "Maintain the average strikerate";
    }
}
