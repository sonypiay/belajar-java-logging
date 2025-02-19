package programmer_zaman_now.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MyTest {

    @Test
    void testRequestid() throws InterruptedException {
        MyRepository repository = new MyRepository();
        MyService service = new MyService(repository);
        MyController controller = new MyController(service);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String requestId = UUID.randomUUID().toString();
                MDC.put("requestId", requestId);
                controller.save();
                MDC.remove("requestId");
            }).start();
        }

        Thread.sleep(1000L);
    }
}
