package programmer_zaman_now.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {

    private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

    @Test
    void testLevel() {
        log.info("info");
        log.warn("warn");
        log.debug("debug");
        log.error("error");
        log.trace("trace");
    }
}
