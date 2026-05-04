package com.xiaomi.push;

import android.os.SystemClock;
import com.heytap.mcssdk.constant.Constants;
import com.xiaomi.push.fe;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bg;
import java.util.Hashtable;

/* loaded from: classes8.dex */
public class fi {

    /* renamed from: a, reason: collision with root package name */
    private static final int f45565a = ey.PING_RTT.a();

    /* renamed from: a, reason: collision with other field name */
    private static long f401a = 0;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        static Hashtable<Integer, Long> f45566a = new Hashtable<>();
    }

    public static void a() {
        if (f401a == 0 || SystemClock.elapsedRealtime() - f401a > Constants.MILLS_OF_WATCH_DOG) {
            f401a = SystemClock.elapsedRealtime();
            a(0, f45565a);
        }
    }

    public static void b() {
        a(0, f45565a, null, -1);
    }

    public static void a(int i11) {
        ez m5938a = fg.m5936a().m5938a();
        m5938a.a(ey.CHANNEL_STATS_COUNTER.a());
        m5938a.c(i11);
        fg.m5936a().a(m5938a);
    }

    public static void b(String str, Exception exc) {
        try {
            fe.a d11 = fe.d(exc);
            ez m5938a = fg.m5936a().m5938a();
            m5938a.a(d11.f45555a.a());
            m5938a.c(d11.f390a);
            m5938a.b(str);
            if (fg.a() != null && fg.a().f393a != null) {
                m5938a.c(bi.c(fg.a().f393a) ? 1 : 0);
            }
            fg.m5936a().a(m5938a);
        } catch (NullPointerException unused) {
        }
    }

    public static synchronized void a(int i11, int i12) {
        synchronized (fi.class) {
            try {
                if (i12 < 16777215) {
                    a.f45566a.put(Integer.valueOf((i11 << 24) | i12), Long.valueOf(System.currentTimeMillis()));
                } else {
                    com.xiaomi.channel.commonutils.logger.b.d("stats key should less than 16777215");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(int i11, int i12, int i13, String str, int i14) {
        ez m5938a = fg.m5936a().m5938a();
        m5938a.a((byte) i11);
        m5938a.a(i12);
        m5938a.b(i13);
        m5938a.b(str);
        m5938a.c(i14);
        fg.m5936a().a(m5938a);
    }

    public static synchronized void a(int i11, int i12, String str, int i13) {
        synchronized (fi.class) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                int i14 = (i11 << 24) | i12;
                if (a.f45566a.containsKey(Integer.valueOf(i14))) {
                    ez m5938a = fg.m5936a().m5938a();
                    m5938a.a(i12);
                    m5938a.b((int) (currentTimeMillis - a.f45566a.get(Integer.valueOf(i14)).longValue()));
                    m5938a.b(str);
                    if (i13 > -1) {
                        m5938a.c(i13);
                    }
                    fg.m5936a().a(m5938a);
                    a.f45566a.remove(Integer.valueOf(i12));
                } else {
                    com.xiaomi.channel.commonutils.logger.b.d("stats key not found");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(XMPushService xMPushService, bg.b bVar) {
        new fb(xMPushService, bVar).a();
    }

    public static void a(String str, int i11, Exception exc) {
        ez m5938a = fg.m5936a().m5938a();
        if (fg.a() != null && fg.a().f393a != null) {
            m5938a.c(bi.c(fg.a().f393a) ? 1 : 0);
        }
        if (i11 > 0) {
            m5938a.a(ey.GSLB_REQUEST_SUCCESS.a());
            m5938a.b(str);
            m5938a.b(i11);
            fg.m5936a().a(m5938a);
            return;
        }
        try {
            fe.a a11 = fe.a(exc);
            m5938a.a(a11.f45555a.a());
            m5938a.c(a11.f390a);
            m5938a.b(str);
            fg.m5936a().a(m5938a);
        } catch (NullPointerException unused) {
        }
    }

    public static void a(String str, Exception exc) {
        try {
            fe.a b11 = fe.b(exc);
            ez m5938a = fg.m5936a().m5938a();
            m5938a.a(b11.f45555a.a());
            m5938a.c(b11.f390a);
            m5938a.b(str);
            if (fg.a() != null && fg.a().f393a != null) {
                m5938a.c(bi.c(fg.a().f393a) ? 1 : 0);
            }
            fg.m5936a().a(m5938a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m5942a() {
        fa m5939a = fg.m5936a().m5939a();
        if (m5939a != null) {
            return ir.a(m5939a);
        }
        return null;
    }
}
