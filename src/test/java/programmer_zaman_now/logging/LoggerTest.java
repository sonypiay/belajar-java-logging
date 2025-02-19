package programmer_zaman_now.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {

    private static final Logger log = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    void testLog() {
        System.out.println("Selamat belajar java logging");

        log.info("Hello World");
        log.info("Selamat belajar java logging");
    }

    @Test
    void testLogFile() {
        for (int i = 0; i < 10000; i++) {
            log.info("info");
            log.warn("warn");
            log.debug("debug");
            log.error("error");
            log.trace("trace");
        }
    }
}
