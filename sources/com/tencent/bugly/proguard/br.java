package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class br extends m {

    /* renamed from: i, reason: collision with root package name */
    static byte[] f42538i = {0};

    /* renamed from: j, reason: collision with root package name */
    static Map<String, String> f42539j;

    /* renamed from: a, reason: collision with root package name */
    public byte f42540a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f42541b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f42542c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f42543d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f42544e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f42545f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f42546g = "";

    /* renamed from: h, reason: collision with root package name */
    public Map<String, String> f42547h = null;

    static {
        HashMap hashMap = new HashMap();
        f42539j = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42540a, 0);
        lVar.a(this.f42541b, 1);
        byte[] bArr = this.f42542c;
        if (bArr != null) {
            lVar.a(bArr, 2);
        }
        String str = this.f42543d;
        if (str != null) {
            lVar.a(str, 3);
        }
        lVar.a(this.f42544e, 4);
        String str2 = this.f42545f;
        if (str2 != null) {
            lVar.a(str2, 5);
        }
        String str3 = this.f42546g;
        if (str3 != null) {
            lVar.a(str3, 6);
        }
        Map<String, String> map = this.f42547h;
        if (map != null) {
            lVar.a((Map) map, 7);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42540a = kVar.a(this.f42540a, 0, true);
        this.f42541b = kVar.a(this.f42541b, 1, true);
        this.f42542c = kVar.c(2, false);
        this.f42543d = kVar.b(3, false);
        this.f42544e = kVar.a(this.f42544e, 4, false);
        this.f42545f = kVar.b(5, false);
        this.f42546g = kVar.b(6, false);
        this.f42547h = (Map) kVar.a((k) f42539j, 7, false);
    }
}
