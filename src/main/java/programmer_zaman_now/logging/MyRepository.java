package programmer_zaman_now.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRepository {

    private static final Logger log = LoggerFactory.getLogger(MyRepository.class);

    public void save() {
        log.info("Repository save");
    }
}
