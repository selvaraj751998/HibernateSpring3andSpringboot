package utill;

import org.springframework.stereotype.Component;

@Component
public class baseballcoach implements Coach{

    public baseballcoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getdailyworkout() {
        return "Main the home run average";
    }
}
