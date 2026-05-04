package com.igexin.push.core.d;

import java.util.Map;

/* loaded from: classes7.dex */
public class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37958a = "GTConfigProxy";

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f37959b;

    /* renamed from: c, reason: collision with root package name */
    private e f37960c = new a();

    private b() {
    }

    public static b d() {
        if (f37959b == null) {
            synchronized (b.class) {
                try {
                    if (f37959b == null) {
                        f37959b = new b();
                    }
                } finally {
                }
            }
        }
        return f37959b;
    }

    @Override // com.igexin.push.core.d.e
    public final Map<String, String> a() {
        e eVar = this.f37960c;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    @Override // com.igexin.push.core.d.e
    public final Map<String, String> b() {
        e eVar = this.f37960c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // com.igexin.push.core.d.e
    public final boolean c() {
        e eVar = this.f37960c;
        if (eVar != null) {
            return eVar.c();
        }
        return false;
    }

    private void a(e eVar) {
        this.f37960c = eVar;
    }

    @Override // com.igexin.push.core.d.e
    public final boolean a(Map<String, String> map) {
        e eVar = this.f37960c;
        if (eVar != null) {
            return eVar.a(map);
        }
        return false;
    }
}
