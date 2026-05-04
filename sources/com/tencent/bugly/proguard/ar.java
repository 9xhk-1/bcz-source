package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ar implements Comparable<ar> {

    /* renamed from: a, reason: collision with root package name */
    public long f42323a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f42324b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f42325c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42326d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42327e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f42328f = 0;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ar arVar) {
        ar arVar2 = arVar;
        if (arVar2 == null) {
            return 1;
        }
        long j11 = this.f42324b - arVar2.f42324b;
        if (j11 <= 0) {
            return j11 < 0 ? -1 : 0;
        }
        return 1;
    }
}
