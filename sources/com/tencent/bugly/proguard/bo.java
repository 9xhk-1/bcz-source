package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bo extends m {
    static ArrayList<bn> A;
    static Map<String, String> B;
    static Map<String, String> C;

    /* renamed from: v, reason: collision with root package name */
    static Map<String, String> f42484v;

    /* renamed from: w, reason: collision with root package name */
    static bm f42485w;

    /* renamed from: x, reason: collision with root package name */
    static bl f42486x;

    /* renamed from: y, reason: collision with root package name */
    static ArrayList<bl> f42487y;

    /* renamed from: z, reason: collision with root package name */
    static ArrayList<bl> f42488z;

    /* renamed from: a, reason: collision with root package name */
    public String f42489a = "";

    /* renamed from: b, reason: collision with root package name */
    public long f42490b = 0;

    /* renamed from: c, reason: collision with root package name */
    public String f42491c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f42492d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f42493e = "";

    /* renamed from: f, reason: collision with root package name */
    public String f42494f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f42495g = "";

    /* renamed from: h, reason: collision with root package name */
    public Map<String, String> f42496h = null;

    /* renamed from: i, reason: collision with root package name */
    public String f42497i = "";

    /* renamed from: j, reason: collision with root package name */
    public bm f42498j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f42499k = 0;

    /* renamed from: l, reason: collision with root package name */
    public String f42500l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f42501m = "";

    /* renamed from: n, reason: collision with root package name */
    public bl f42502n = null;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<bl> f42503o = null;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<bl> f42504p = null;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList<bn> f42505q = null;

    /* renamed from: r, reason: collision with root package name */
    public Map<String, String> f42506r = null;

    /* renamed from: s, reason: collision with root package name */
    public Map<String, String> f42507s = null;

    /* renamed from: t, reason: collision with root package name */
    public String f42508t = "";

    /* renamed from: u, reason: collision with root package name */
    public boolean f42509u = true;

    static {
        HashMap hashMap = new HashMap();
        f42484v = hashMap;
        hashMap.put("", "");
        f42485w = new bm();
        f42486x = new bl();
        f42487y = new ArrayList<>();
        f42487y.add(new bl());
        f42488z = new ArrayList<>();
        f42488z.add(new bl());
        A = new ArrayList<>();
        A.add(new bn());
        HashMap hashMap2 = new HashMap();
        B = hashMap2;
        hashMap2.put("", "");
        HashMap hashMap3 = new HashMap();
        C = hashMap3;
        hashMap3.put("", "");
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42489a, 0);
        lVar.a(this.f42490b, 1);
        lVar.a(this.f42491c, 2);
        String str = this.f42492d;
        if (str != null) {
            lVar.a(str, 3);
        }
        String str2 = this.f42493e;
        if (str2 != null) {
            lVar.a(str2, 4);
        }
        String str3 = this.f42494f;
        if (str3 != null) {
            lVar.a(str3, 5);
        }
        String str4 = this.f42495g;
        if (str4 != null) {
            lVar.a(str4, 6);
        }
        Map<String, String> map = this.f42496h;
        if (map != null) {
            lVar.a((Map) map, 7);
        }
        String str5 = this.f42497i;
        if (str5 != null) {
            lVar.a(str5, 8);
        }
        bm bmVar = this.f42498j;
        if (bmVar != null) {
            lVar.a((m) bmVar, 9);
        }
        lVar.a(this.f42499k, 10);
        String str6 = this.f42500l;
        if (str6 != null) {
            lVar.a(str6, 11);
        }
        String str7 = this.f42501m;
        if (str7 != null) {
            lVar.a(str7, 12);
        }
        bl blVar = this.f42502n;
        if (blVar != null) {
            lVar.a((m) blVar, 13);
        }
        ArrayList<bl> arrayList = this.f42503o;
        if (arrayList != null) {
            lVar.a((Collection) arrayList, 14);
        }
        ArrayList<bl> arrayList2 = this.f42504p;
        if (arrayList2 != null) {
            lVar.a((Collection) arrayList2, 15);
        }
        ArrayList<bn> arrayList3 = this.f42505q;
        if (arrayList3 != null) {
            lVar.a((Collection) arrayList3, 16);
        }
        Map<String, String> map2 = this.f42506r;
        if (map2 != null) {
            lVar.a((Map) map2, 17);
        }
        Map<String, String> map3 = this.f42507s;
        if (map3 != null) {
            lVar.a((Map) map3, 18);
        }
        String str8 = this.f42508t;
        if (str8 != null) {
            lVar.a(str8, 19);
        }
        lVar.a(this.f42509u, 20);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42489a = kVar.b(0, true);
        this.f42490b = kVar.a(this.f42490b, 1, true);
        this.f42491c = kVar.b(2, true);
        this.f42492d = kVar.b(3, false);
        this.f42493e = kVar.b(4, false);
        this.f42494f = kVar.b(5, false);
        this.f42495g = kVar.b(6, false);
        this.f42496h = (Map) kVar.a((k) f42484v, 7, false);
        this.f42497i = kVar.b(8, false);
        this.f42498j = (bm) kVar.a((m) f42485w, 9, false);
        this.f42499k = kVar.a(this.f42499k, 10, false);
        this.f42500l = kVar.b(11, false);
        this.f42501m = kVar.b(12, false);
        this.f42502n = (bl) kVar.a((m) f42486x, 13, false);
        this.f42503o = (ArrayList) kVar.a((k) f42487y, 14, false);
        this.f42504p = (ArrayList) kVar.a((k) f42488z, 15, false);
        this.f42505q = (ArrayList) kVar.a((k) A, 16, false);
        this.f42506r = (Map) kVar.a((k) B, 17, false);
        this.f42507s = (Map) kVar.a((k) C, 18, false);
        this.f42508t = kVar.b(19, false);
        this.f42509u = kVar.a(20, false);
    }
}
