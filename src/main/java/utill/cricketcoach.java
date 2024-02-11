package utill;

import org.springframework.stereotype.Component;

@Component
public class cricketcoach implements Coach{
    @Override
    public String getdailyworkout() {
        return "Maintain the average strikerate";
    }
}
