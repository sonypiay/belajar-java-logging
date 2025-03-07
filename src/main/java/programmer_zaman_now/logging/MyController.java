package programmer_zaman_now.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyController {

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    private MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    public void save() {
        log.info("Controller save");
        this.service.save();
    }
}
