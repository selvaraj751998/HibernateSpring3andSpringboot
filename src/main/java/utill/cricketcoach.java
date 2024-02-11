package utill;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class cricketcoach implements Coach{
    public cricketcoach(){
        System.out.println("In constructor : "+getClass().getSimpleName());
    }

    @Override
    public String getdailyworkout() {
        return "Maintain the average strikerate";
    }
}
