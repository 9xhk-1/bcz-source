package com.tencent.open.a;

import android.text.TextUtils;
import com.tencent.open.log.SLog;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.f;
import okhttp3.internal.Version;
import okhttp3.j;
import okhttp3.k;
import okhttp3.l;
import okhttp3.m;
import t50.n;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
class e implements com.tencent.open.a.a {

    /* renamed from: a, reason: collision with root package name */
    private q f44436a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f44437a;

        public a(String str) {
            this.f44437a = str;
        }

        @Override // t50.n
        public okhttp3.n intercept(n.a aVar) throws IOException {
            return aVar.c(aVar.request().n().n("User-Agent", this.f44437a).b());
        }
    }

    public e(String str) throws NoClassDefFoundError {
        a(str);
    }

    private void a(String str) {
        String userAgent = Version.userAgent();
        if (userAgent == null || !userAgent.startsWith("okhttp/3")) {
            throw new NoClassDefFoundError();
        }
        a aVar = new a(str);
        q.a n11 = new q.a().n(Arrays.asList(okhttp3.e.f77255i, okhttp3.e.f77256j));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        q.a c11 = n11.k(15000L, timeUnit).j0(30000L, timeUnit).R0(30000L, timeUnit).g(null).c(aVar);
        a(c11);
        this.f44436a = c11.f();
    }

    @Override // com.tencent.open.a.a
    public void a(long j11, long j12) {
        if (j11 <= 0 || j12 <= 0) {
            return;
        }
        if (this.f44436a.R() == j11 && this.f44436a.r0() == j12) {
            return;
        }
        SLog.i("OkHttpServiceImpl", "setTimeout changed.");
        q.a l02 = this.f44436a.l0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f44436a = l02.k(j11, timeUnit).j0(j12, timeUnit).R0(j12, timeUnit).f();
    }

    @Override // com.tencent.open.a.a
    public g a(String str, String str2) throws IOException {
        SLog.i("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int indexOf = str2.indexOf("?");
            if (indexOf == -1) {
                str = str + "?";
            } else if (indexOf != str.length() - 1) {
                str = str + "&";
            }
            str = str + str2;
        }
        return new d(this.f44436a.b(new l.a().B(str).g().b()).execute(), str2.length());
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map) throws IOException {
        SLog.i("OkHttpServiceImpl", "post data");
        f.a aVar = new f.a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                if (str3 != null) {
                    aVar.a(str2, str3);
                }
            }
        }
        okhttp3.f c11 = aVar.c();
        return new d(this.f44436a.b(new l.a().B(str).r(c11).b()).execute(), (int) c11.a());
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 != null && map2.size() != 0) {
            SLog.i("OkHttpServiceImpl", "post data, has byte data");
            k.a aVar = new k.a();
            if (map != null && map.size() > 0) {
                for (String str2 : map.keySet()) {
                    String str3 = map.get(str2);
                    if (str3 != null) {
                        aVar.a(str2, str3);
                    }
                }
            }
            for (String str4 : map2.keySet()) {
                byte[] bArr = map2.get(str4);
                if (bArr != null && bArr.length > 0) {
                    aVar.b(str4, str4, m.h(j.h("content/unknown"), bArr));
                    SLog.w("OkHttpServiceImpl", "post byte data.");
                }
            }
            k f11 = aVar.f();
            return new d(this.f44436a.b(new l.a().B(str).r(f11).b()).execute(), (int) f11.a());
        }
        return a(str, map);
    }

    private void a(q.a aVar) {
    }
}
