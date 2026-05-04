package com.baicizhan.learning_strategy.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class L {
    public static Logger log = new Logger() { // from class: com.baicizhan.learning_strategy.util.L.1
        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void error(String str) {
        }

        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void error(String str, Throwable th2) {
        }

        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void debug(String str) {
        }

        @Override // com.baicizhan.learning_strategy.util.L.Logger
        public void info(String str) {
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Logger {
        void debug(String str);

        void error(String str);

        void error(String str, Throwable th2);

        void info(String str);
    }

    public static void setLog(Logger logger) {
        log = logger;
    }
}
