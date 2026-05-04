package com.tencent.open.a;

import android.os.Build;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static f f44438a;

    /* renamed from: b, reason: collision with root package name */
    private i f44439b;

    /* renamed from: c, reason: collision with root package name */
    private a f44440c;

    public f() {
        b();
    }

    public static f a() {
        if (f44438a == null) {
            synchronized (f.class) {
                try {
                    if (f44438a == null) {
                        f44438a = new f();
                    }
                } finally {
                }
            }
        }
        f44438a.c();
        return f44438a;
    }

    private void b() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + com.tencent.open.utils.f.a().b(com.tencent.open.utils.g.a()) + "_" + Build.VERSION.RELEASE;
        try {
            this.f44440c = new e(str);
        } catch (NoClassDefFoundError e11) {
            SLog.e("openSDK_LOG.OpenHttpService", "initClient okHttp catch error", e11);
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th2);
        }
        if (this.f44440c == null) {
            this.f44440c = new b(str);
        }
    }

    private void c() {
        i iVar = this.f44439b;
        if (iVar == null) {
            return;
        }
        int a11 = iVar.a("Common_HttpConnectionTimeout");
        if (a11 == 0) {
            a11 = 15000;
        }
        int a12 = this.f44439b.a("Common_SocketConnectionTimeout");
        if (a12 == 0) {
            a12 = 30000;
        }
        a(a11, a12);
    }

    public void a(i iVar) {
        this.f44439b = iVar;
        c();
    }

    public g b(String str, Map<String, String> map) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "post data");
        return this.f44440c.a(str, map);
    }

    public void a(long j11, long j12) {
        a aVar = this.f44440c;
        if (aVar != null) {
            aVar.a(j11, j12);
        }
    }

    public g a(String str, Map<String, String> map) throws IOException {
        if (map != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("");
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    sb2.append(URLEncoder.encode(str2, "UTF-8"));
                    sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb2.append(URLEncoder.encode(str3, "UTF-8"));
                    sb2.append("&");
                }
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return a(str, sb2.toString());
        }
        return a(str, "");
    }

    public g a(String str, String str2) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "get.");
        return this.f44440c.a(str, str2);
    }

    public g a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 != null && map2.size() != 0) {
            return this.f44440c.a(str, map, map2);
        }
        return b(str, map);
    }
}
