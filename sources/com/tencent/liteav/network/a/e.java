package com.tencent.liteav.network.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f43729a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43730b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43731c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43732d;

    public e(String str, int i11, int i12, long j11) {
        this.f43729a = str;
        this.f43730b = i11;
        this.f43731c = i12 < 600 ? 600 : i12;
        this.f43732d = j11;
    }

    public boolean a() {
        return this.f43730b == 5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof e)) {
            e eVar = (e) obj;
            if (this.f43729a.equals(eVar.f43729a) && this.f43730b == eVar.f43730b && this.f43731c == eVar.f43731c && this.f43732d == eVar.f43732d) {
                return true;
            }
        }
        return false;
    }
}
