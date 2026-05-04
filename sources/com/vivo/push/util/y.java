package com.vivo.push.util;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class y implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Integer> f45124a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, Long> f45125b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<String, String> f45126c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static y f45127d;

    /* renamed from: e, reason: collision with root package name */
    private Context f45128e;

    /* renamed from: f, reason: collision with root package name */
    private d f45129f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f45130g;

    private y(Context context) {
        this.f45130g = false;
        this.f45128e = context;
        this.f45130g = a(context);
        p.d("SystemCache", "init status is " + this.f45130g + ";  curCache is " + this.f45129f);
    }

    public static synchronized y b(Context context) {
        y yVar;
        synchronized (y.class) {
            try {
                if (f45127d == null) {
                    f45127d = new y(context.getApplicationContext());
                }
                yVar = f45127d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public final void a() {
        x xVar = new x();
        if (xVar.a(this.f45128e)) {
            xVar.a();
            p.d("SystemCache", "sp cache is cleared");
        }
    }

    @Override // com.vivo.push.util.d
    public final void b(String str, String str2) {
        d dVar;
        f45126c.put(str, str2);
        if (!this.f45130g || (dVar = this.f45129f) == null) {
            return;
        }
        dVar.b(str, str2);
    }

    @Override // com.vivo.push.util.d
    public final boolean a(Context context) {
        v vVar = new v();
        this.f45129f = vVar;
        boolean a11 = vVar.a(context);
        if (!a11) {
            x xVar = new x();
            this.f45129f = xVar;
            a11 = xVar.a(context);
        }
        if (!a11) {
            this.f45129f = null;
        }
        return a11;
    }

    @Override // com.vivo.push.util.d
    public final String a(String str, String str2) {
        d dVar;
        String str3 = f45126c.get(str);
        return (str3 != null || (dVar = this.f45129f) == null) ? str3 : dVar.a(str, str2);
    }
}
