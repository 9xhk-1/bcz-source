package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bs extends m implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public String f42548a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f42549b = "";

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42548a, 0);
        lVar.a(this.f42549b, 1);
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42548a = kVar.b(0, true);
        this.f42549b = kVar.b(1, true);
    }
}
