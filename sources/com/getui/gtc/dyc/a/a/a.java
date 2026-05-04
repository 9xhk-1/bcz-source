package com.getui.gtc.dyc.a.a;

import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.log.Logger;

/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Logger f29978a;

    /* renamed from: com.getui.gtc.dyc.a.a.a$a, reason: collision with other inner class name */
    public static class C0356a {

        /* renamed from: a, reason: collision with root package name */
        private static a f29979a = new a();
    }

    private a() {
        Logger logger = new Logger(GtcProvider.context());
        this.f29978a = logger;
        logger.setGlobalTag("gtc.dyc");
        this.f29978a.setFileEnableProperty("dyc.fileLog");
        this.f29978a.setLogcatEnable(false);
        this.f29978a.setLogFileNameSuffix("gtc");
        this.f29978a.setStackOffset(1);
    }

    public static Logger a() {
        return C0356a.f29979a.f29978a;
    }

    public static void c(Throwable th2) {
        C0356a.f29979a.f29978a.e(th2);
    }

    public static void a(String str) {
        C0356a.f29979a.f29978a.e(str);
    }

    public static void a(Throwable th2) {
        C0356a.f29979a.f29978a.w(th2);
    }
}
