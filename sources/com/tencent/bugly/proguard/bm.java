package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bm extends m implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<String> f42477c;

    /* renamed from: a, reason: collision with root package name */
    public String f42478a = "";

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<String> f42479b = null;

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42478a, 0);
        ArrayList<String> arrayList = this.f42479b;
        if (arrayList != null) {
            lVar.a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42478a = kVar.b(0, true);
        if (f42477c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f42477c = arrayList;
            arrayList.add("");
        }
        this.f42479b = (ArrayList) kVar.a((k) f42477c, 1, false);
    }
}
