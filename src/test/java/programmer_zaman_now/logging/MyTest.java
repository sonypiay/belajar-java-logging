package programmer_zaman_now.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MyTest {

    @Test
    void testRequestid() {
        String requestId = UUID.randomUUID().toString();

        MyRepository repository = new MyRepository();
        MyService service = new MyService(repository);
        MyController controller = new MyController(service);

        MDC.put("requestId", requestId);
        controller.save();
        MDC.remove("requestId");
    }
}
