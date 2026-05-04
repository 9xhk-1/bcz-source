package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;
import k3.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bt extends m implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    static bs f42550m = new bs();

    /* renamed from: n, reason: collision with root package name */
    static Map<String, String> f42551n = null;

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f42552o = true;

    /* renamed from: a, reason: collision with root package name */
    public boolean f42553a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f42554b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f42555c = true;

    /* renamed from: d, reason: collision with root package name */
    public String f42556d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f42557e = "";

    /* renamed from: f, reason: collision with root package name */
    public bs f42558f = null;

    /* renamed from: g, reason: collision with root package name */
    public Map<String, String> f42559g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f42560h = 0;

    /* renamed from: i, reason: collision with root package name */
    public String f42561i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f42562j = "";

    /* renamed from: k, reason: collision with root package name */
    public int f42563k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f42564l = 0;

    static {
        HashMap hashMap = new HashMap();
        f42551n = hashMap;
        hashMap.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42553a, 0);
        lVar.a(this.f42554b, 1);
        lVar.a(this.f42555c, 2);
        String str = this.f42556d;
        if (str != null) {
            lVar.a(str, 3);
        }
        String str2 = this.f42557e;
        if (str2 != null) {
            lVar.a(str2, 4);
        }
        bs bsVar = this.f42558f;
        if (bsVar != null) {
            lVar.a((m) bsVar, 5);
        }
        Map<String, String> map = this.f42559g;
        if (map != null) {
            lVar.a((Map) map, 6);
        }
        lVar.a(this.f42560h, 7);
        String str3 = this.f42561i;
        if (str3 != null) {
            lVar.a(str3, 8);
        }
        String str4 = this.f42562j;
        if (str4 != null) {
            lVar.a(str4, 9);
        }
        lVar.a(this.f42563k, 10);
        lVar.a(this.f42564l, 11);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f42552o) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        bt btVar = (bt) obj;
        return n.a(this.f42553a, btVar.f42553a) && n.a(this.f42554b, btVar.f42554b) && n.a(this.f42555c, btVar.f42555c) && n.a(this.f42556d, btVar.f42556d) && n.a(this.f42557e, btVar.f42557e) && n.a(this.f42558f, btVar.f42558f) && n.a(this.f42559g, btVar.f42559g) && n.a(this.f42560h, btVar.f42560h) && n.a(this.f42561i, btVar.f42561i) && n.a(this.f42562j, btVar.f42562j) && n.a(this.f42563k, btVar.f42563k) && n.a(this.f42564l, btVar.f42564l);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42553a = kVar.a(0, true);
        this.f42554b = kVar.a(1, true);
        this.f42555c = kVar.a(2, true);
        this.f42556d = kVar.b(3, false);
        this.f42557e = kVar.b(4, false);
        this.f42558f = (bs) kVar.a((m) f42550m, 5, false);
        this.f42559g = (Map) kVar.a((k) f42551n, 6, false);
        this.f42560h = kVar.a(this.f42560h, 7, false);
        this.f42561i = kVar.b(8, false);
        this.f42562j = kVar.b(9, false);
        this.f42563k = kVar.a(this.f42563k, 10, false);
        this.f42564l = kVar.a(this.f42564l, 11, false);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
        i iVar = new i(sb2, i11);
        iVar.a(this.f42553a, u0.f65628b);
        iVar.a(this.f42554b, "enableUserInfo");
        iVar.a(this.f42555c, "enableQuery");
        iVar.a(this.f42556d, "url");
        iVar.a(this.f42557e, "expUrl");
        iVar.a((m) this.f42558f, "security");
        iVar.a((Map) this.f42559g, "valueMap");
        iVar.a(this.f42560h, "strategylastUpdateTime");
        iVar.a(this.f42561i, "httpsUrl");
        iVar.a(this.f42562j, "httpsExpUrl");
        iVar.a(this.f42563k, "eventRecordCount");
        iVar.a(this.f42564l, "eventTimeInterval");
    }
}
