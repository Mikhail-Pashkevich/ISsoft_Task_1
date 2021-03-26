package logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLogger {

    private static final Logger logger = LoggerFactory.getLogger(SLF4JLogger.class);

    public void trace(String message) {
        logger.trace(message);
    }

    public void debug(String message) {
        logger.debug(message);
    }

    public void info(String message) {
        logger.info(message);
    }

    public void warn(String message) {
        logger.warn(message);
    }

    public void error(String message) {
        logger.error(message);
    }
}