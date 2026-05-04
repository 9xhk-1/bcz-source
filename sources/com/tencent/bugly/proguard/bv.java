package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bv extends m implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    static ArrayList<bu> f42574f;

    /* renamed from: g, reason: collision with root package name */
    static Map<String, String> f42575g;

    /* renamed from: a, reason: collision with root package name */
    public byte f42576a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f42577b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f42578c = "";

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<bu> f42579d = null;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f42580e = null;

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42576a, 0);
        String str = this.f42577b;
        if (str != null) {
            lVar.a(str, 1);
        }
        String str2 = this.f42578c;
        if (str2 != null) {
            lVar.a(str2, 2);
        }
        ArrayList<bu> arrayList = this.f42579d;
        if (arrayList != null) {
            lVar.a((Collection) arrayList, 3);
        }
        Map<String, String> map = this.f42580e;
        if (map != null) {
            lVar.a((Map) map, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42576a = kVar.a(this.f42576a, 0, true);
        this.f42577b = kVar.b(1, false);
        this.f42578c = kVar.b(2, false);
        if (f42574f == null) {
            f42574f = new ArrayList<>();
            f42574f.add(new bu());
        }
        this.f42579d = (ArrayList) kVar.a((k) f42574f, 3, false);
        if (f42575g == null) {
            HashMap hashMap = new HashMap();
            f42575g = hashMap;
            hashMap.put("", "");
        }
        this.f42580e = (Map) kVar.a((k) f42575g, 4, false);
    }
}
