package utill;

import org.springframework.stereotype.Component;

@Component
public class baseballcoach implements Coach{
    @Override
    public String getdailyworkout() {
        return "Main the home run average";
    }
}
