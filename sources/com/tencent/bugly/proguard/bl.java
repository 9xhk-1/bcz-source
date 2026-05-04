package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bl extends m implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public String f42472a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f42473b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f42474c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f42475d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f42476e = "";

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42472a, 0);
        String str = this.f42473b;
        if (str != null) {
            lVar.a(str, 1);
        }
        String str2 = this.f42474c;
        if (str2 != null) {
            lVar.a(str2, 2);
        }
        String str3 = this.f42475d;
        if (str3 != null) {
            lVar.a(str3, 3);
        }
        String str4 = this.f42476e;
        if (str4 != null) {
            lVar.a(str4, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42472a = kVar.b(0, true);
        this.f42473b = kVar.b(1, false);
        this.f42474c = kVar.b(2, false);
        this.f42475d = kVar.b(3, false);
        this.f42476e = kVar.b(4, false);
    }
}
