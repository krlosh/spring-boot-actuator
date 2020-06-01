package guru.springframework.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomGuruEndpoint extends AbstractEndpoint<List<String>> {


    public CustomGuruEndpoint() {
        super("customGuruEndpoint", false);
    }

    @Override
    public List<String> invoke() {
        List<String> results = new ArrayList<>();
        results.add("Umphrey's");
        results.add("McGee");
        results.add("Zonkey Rocks!");
        return results;
    }
}
