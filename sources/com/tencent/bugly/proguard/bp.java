package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bp extends m implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    static ArrayList<bo> f42510b;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<bo> f42511a = null;

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a((Collection) this.f42511a, 0);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        if (f42510b == null) {
            f42510b = new ArrayList<>();
            f42510b.add(new bo());
        }
        this.f42511a = (ArrayList) kVar.a((k) f42510b, 0, true);
    }
}
