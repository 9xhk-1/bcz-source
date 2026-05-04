package com.getui.gtc.i.c;

import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.log.Logger;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Logger f30104a;

    /* renamed from: com.getui.gtc.i.c.a$a, reason: collision with other inner class name */
    public static class C0359a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f30105a = new a(0);
    }

    private a() {
        Logger logger = new Logger(GtcProvider.context());
        this.f30104a = logger;
        logger.setGlobalTag("gtc");
        logger.setFileEnableProperty("gtc.fileLog");
        logger.setLogcatEnable(false);
        logger.setLogFileNameSuffix("gtc");
        logger.setStackOffset(1);
    }

    public static void a(String str) {
        C0359a.f30105a.f30104a.d(str);
    }

    public static void b(String str) {
        C0359a.f30105a.f30104a.w(str);
    }

    public static void c(String str) {
        C0359a.f30105a.f30104a.e(str);
    }

    public static void d(String str) {
        C0359a.f30105a.f30104a.filelog(2, null, str, null);
    }

    public /* synthetic */ a(byte b11) {
        this();
    }

    public static void a(String str, Throwable th2) {
        C0359a.f30105a.f30104a.e(str, th2);
    }

    public static void b(Throwable th2) {
        C0359a.f30105a.f30104a.w(th2);
    }

    public static void c(Throwable th2) {
        C0359a.f30105a.f30104a.e(th2);
    }

    public static void d(Throwable th2) {
        C0359a.f30105a.f30104a.filelog(2, null, null, th2);
    }

    public static void a(Throwable th2) {
        C0359a.f30105a.f30104a.d(th2);
    }
}
