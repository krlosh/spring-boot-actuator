package guru.springframework.actuator.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;
import org.springframework.stereotype.Component;

@Component
public class CustomGuruMVCEndpoint extends EndpointMvcAdapter {

    @Autowired
    public CustomGuruMVCEndpoint(CustomGuruEndpoint customGuruEndpoint) {
        super(customGuruEndpoint);
    }
}
