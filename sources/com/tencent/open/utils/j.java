package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;
import java.lang.ref.WeakReference;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static j f44601a;

    /* renamed from: b, reason: collision with root package name */
    private volatile WeakReference<SharedPreferences> f44602b = null;

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f44601a == null) {
                    f44601a = new j();
                }
                jVar = f44601a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public String a(Context context, String str) {
        if (this.f44602b == null || this.f44602b.get() == null) {
            this.f44602b = new WeakReference<>(context.getSharedPreferences("ServerPrefs", 0));
        }
        try {
            String host = new URL(str).getHost();
            if (host == null) {
                SLog.e("openSDK_LOG.ServerSetting", "Get host error. url=" + str);
                return str;
            }
            String string = this.f44602b.get().getString(host, null);
            if (string != null && !host.equals(string)) {
                String replace = str.replace(host, string);
                SLog.v("openSDK_LOG.ServerSetting", "return environment url : " + replace);
                return replace;
            }
            SLog.v("openSDK_LOG.ServerSetting", "host=" + host + ", envHost=" + string);
            return str;
        } catch (Exception e11) {
            SLog.e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + str + "error.: " + e11.getMessage());
            return str;
        }
    }
}
