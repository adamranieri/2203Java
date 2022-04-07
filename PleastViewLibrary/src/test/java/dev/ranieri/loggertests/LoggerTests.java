package dev.ranieri.loggertests;

import dev.ranieri.utilities.LogLevel;
import dev.ranieri.utilities.Logger;
import org.junit.jupiter.api.Test;

public class LoggerTests {

    @Test
    void info_log_test(){
        Logger.log("Hello", LogLevel.INFO);
        Logger.log("Wassup", LogLevel.DEBUG);
    }
}
