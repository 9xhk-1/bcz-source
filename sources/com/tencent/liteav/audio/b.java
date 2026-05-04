package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Long, a> f42936a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private Method f42937b;

    /* renamed from: c, reason: collision with root package name */
    private Method f42938c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f42939a;

        /* renamed from: b, reason: collision with root package name */
        public String f42940b;

        /* renamed from: c, reason: collision with root package name */
        public String f42941c;

        /* renamed from: d, reason: collision with root package name */
        public long f42942d;

        public a(long j11, String str, String str2) {
            this.f42939a = j11;
            this.f42940b = str;
            this.f42941c = str2;
        }
    }

    public b() {
        try {
            Class<?> cls = Class.forName("com.tencent.txcopyrightedmedia.impl.utils.TXBGMUtils");
            this.f42937b = cls.getDeclaredMethod("getMusicURI", String.class);
            this.f42938c = cls.getDeclaredMethod("uploadMusicPlayInfo", String.class, String.class, Long.TYPE);
            this.f42937b.setAccessible(true);
            this.f42938c.setAccessible(true);
        } catch (Exception e11) {
            TXCLog.w("TXCopyrightedMediaProcessor", "init TXCopyrightedMediaProcessor failed. " + e11);
        }
    }

    public String a(String str) {
        if (this.f42937b != null && b(str)) {
            try {
                String str2 = (String) this.f42937b.invoke(null, str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                Monitor.a(3, "TXCopyrightedMediaProcessor: getCopyrightedMusicUri failed with empty result.", "", 0);
                return str2;
            } catch (Exception e11) {
                TXCLog.e("TXCopyrightedMediaProcessor", "getCopyrightedMusicUri failed. " + e11);
            }
        }
        return str;
    }

    public void b(long j11, long j12) {
        a(j11, "PausePlay", j12);
    }

    public void c(long j11, long j12) {
        a(j11, "ResumePlay", j12);
    }

    public void d(long j11, long j12) {
        a(j11, "SeekEvent", j12);
    }

    public void e(long j11, long j12) {
        a(j11, "FinishPlay", j12);
        a(j11, "StartPlay", 0L);
    }

    public void f(long j11, long j12) {
        a(j11, "FinishPlay", j12);
        this.f42936a.remove(Long.valueOf(j11));
    }

    private boolean b(String str) {
        return str != null && str.startsWith("CopyRightMusic://");
    }

    public void a(long j11, String str) {
        if (b(str)) {
            this.f42936a.put(Long.valueOf(j11), new a(j11, str, a(str)));
            a(j11, "StartPlay", 0L);
        }
    }

    public void a(long j11, long j12) {
        a aVar = this.f42936a.get(Long.valueOf(j11));
        if (aVar == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - aVar.f42942d < TimeUnit.SECONDS.toMillis(10L)) {
            return;
        }
        aVar.f42942d = currentTimeMillis;
        a(j11, "TimedEvent", j12);
    }

    private void a(long j11, String str, long j12) {
        a aVar;
        if (this.f42938c == null || (aVar = this.f42936a.get(Long.valueOf(j11))) == null || !b(aVar.f42940b)) {
            return;
        }
        TXCLog.i("TXCopyrightedMediaProcessor", "reportPlayInfo id:" + j11 + " action:" + str + " position:" + j12);
        try {
            this.f42938c.invoke(null, str, aVar.f42941c, Long.valueOf(j12));
        } catch (Exception e11) {
            TXCLog.e("TXCopyrightedMediaProcessor", "reportPlayInfo failed. " + e11);
        }
    }
}
