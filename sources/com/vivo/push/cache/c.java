package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.g;
import com.vivo.push.util.p;
import com.vivo.push.util.w;
import com.vivo.push.util.y;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class c<T> {

    /* renamed from: a, reason: collision with root package name */
    protected static final Object f44946a = new Object();

    /* renamed from: b, reason: collision with root package name */
    protected List<T> f44947b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    protected Context f44948c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f44949d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f44950e;

    public c(Context context) {
        this.f44948c = ContextDelegate.getContext(context);
        w b11 = w.b();
        b11.a(this.f44948c);
        this.f44949d = b11.c();
        this.f44950e = b11.d();
        c();
    }

    private String b() {
        return y.b(this.f44948c).a(a(), null);
    }

    private void d(String str) {
        y.b(this.f44948c).b(a(), str);
    }

    public abstract String a();

    public abstract List<T> a(String str);

    public abstract String b(String str) throws Exception;

    public final void c() {
        synchronized (f44946a) {
            g.a(a());
            this.f44947b.clear();
            c(b());
        }
    }

    public final byte[] e() {
        byte[] bArr = this.f44949d;
        return (bArr == null || bArr.length <= 0) ? w.b().c() : bArr;
    }

    public final byte[] f() {
        byte[] bArr = this.f44950e;
        return (bArr == null || bArr.length <= 0) ? w.b().d() : bArr;
    }

    public final void d() {
        synchronized (f44946a) {
            this.f44947b.clear();
            d("");
            p.d("CacheSettings", "clear " + a() + " strApps");
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            p.d("CacheSettings", "ClientManager init " + a() + " strApps empty.");
            return;
        }
        if (str.length() > 10000) {
            p.d("CacheSettings", "sync " + a() + " strApps lenght too large");
            d();
            return;
        }
        try {
            p.d("CacheSettings", "ClientManager init " + a() + " strApps : " + str);
            List<T> a11 = a(b(str));
            if (a11 != null) {
                this.f44947b.addAll(a11);
            }
        } catch (Exception e11) {
            d();
            p.d("CacheSettings", p.a(e11));
        }
    }
}
