package com.getui.gtc.dim.e;

import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.log.Logger;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Logger f29964a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f29965a = new b(0);
    }

    private b() {
        Logger logger = new Logger(GtcProvider.context());
        this.f29964a = logger;
        logger.setGlobalTag("gtc.dim");
        logger.setFileEnableProperty("dim.fileLog");
        logger.setLogcatEnable(false);
        logger.setLogFileNameSuffix("gtc");
        logger.setStackOffset(1);
    }

    public static void a(String str) {
        a.f29965a.f29964a.d(str);
    }

    public static void b(String str) {
        a.f29965a.f29964a.w(str);
    }

    public /* synthetic */ b(byte b11) {
        this();
    }

    public static void a(String str, Throwable th2) {
        a.f29965a.f29964a.e(str, th2);
    }

    public static void b(Throwable th2) {
        a.f29965a.f29964a.e(th2);
    }

    public static void a(Throwable th2) {
        a.f29965a.f29964a.w(th2);
    }
}
