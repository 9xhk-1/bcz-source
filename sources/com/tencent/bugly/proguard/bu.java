package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bu extends m {

    /* renamed from: i, reason: collision with root package name */
    static Map<String, String> f42565i;

    /* renamed from: a, reason: collision with root package name */
    public long f42566a = 0;

    /* renamed from: b, reason: collision with root package name */
    public byte f42567b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f42568c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f42569d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f42570e = "";

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f42571f = null;

    /* renamed from: g, reason: collision with root package name */
    public String f42572g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f42573h = true;

    static {
        HashMap hashMap = new HashMap();
        f42565i = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42566a, 0);
        lVar.a(this.f42567b, 1);
        String str = this.f42568c;
        if (str != null) {
            lVar.a(str, 2);
        }
        String str2 = this.f42569d;
        if (str2 != null) {
            lVar.a(str2, 3);
        }
        String str3 = this.f42570e;
        if (str3 != null) {
            lVar.a(str3, 4);
        }
        Map<String, String> map = this.f42571f;
        if (map != null) {
            lVar.a((Map) map, 5);
        }
        String str4 = this.f42572g;
        if (str4 != null) {
            lVar.a(str4, 6);
        }
        lVar.a(this.f42573h, 7);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42566a = kVar.a(this.f42566a, 0, true);
        this.f42567b = kVar.a(this.f42567b, 1, true);
        this.f42568c = kVar.b(2, false);
        this.f42569d = kVar.b(3, false);
        this.f42570e = kVar.b(4, false);
        this.f42571f = (Map) kVar.a((k) f42565i, 5, false);
        this.f42572g = kVar.b(6, false);
        this.f42573h = kVar.a(7, false);
    }
}
