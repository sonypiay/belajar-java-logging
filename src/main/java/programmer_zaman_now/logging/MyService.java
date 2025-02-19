package programmer_zaman_now.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);

    private MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void save() {
        log.info("Service save");
        this.myRepository.save();
    }
}
