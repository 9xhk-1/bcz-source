package f60;

import a00.l1;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g0;
import t50.q;
import u30.k0;
import u30.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u50.c
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f51117b = 4000;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Map<String, String> f51119d;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e f51116a = new e();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final CopyOnWriteArraySet<Logger> f51118c = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = q.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = q.class.getName();
        g0.o(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = c60.b.class.getName();
        g0.o(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = y50.d.class.getName();
        g0.o(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f51119d = l1.D0(linkedHashMap);
    }

    public final void a(@m80.k String loggerName, int i11, @m80.k String message, @m80.l Throwable th2) {
        int min;
        g0.p(loggerName, "loggerName");
        g0.p(message, "message");
        String d11 = d(loggerName);
        if (Log.isLoggable(d11, i11)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            String str = message;
            int length = str.length();
            int i12 = 0;
            while (i12 < length) {
                int I3 = k0.I3(str, '\n', i12, false, 4, null);
                if (I3 == -1) {
                    I3 = length;
                }
                while (true) {
                    min = Math.min(I3, i12 + 4000);
                    String substring = str.substring(i12, min);
                    g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i11, d11, substring);
                    if (min >= I3) {
                        break;
                    } else {
                        i12 = min;
                    }
                }
                i12 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f51119d.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f51118c.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(f.f51120a);
        }
    }

    public final String d(String str) {
        String str2 = f51119d.get(str);
        return str2 == null ? r0.A9(str, 23) : str2;
    }
}
