package com.baicizhan.main.activity.setting.privatessetting.debug;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final int f19793e = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f19794a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19795b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19796c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f19797d;

    public p(@m80.k String name, long j11, long j12, @m80.k String path) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(path, "path");
        this.f19794a = name;
        this.f19795b = j11;
        this.f19796c = j12;
        this.f19797d = path;
    }

    public static /* synthetic */ p f(p pVar, String str, long j11, long j12, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pVar.f19794a;
        }
        if ((i11 & 2) != 0) {
            j11 = pVar.f19795b;
        }
        if ((i11 & 4) != 0) {
            j12 = pVar.f19796c;
        }
        if ((i11 & 8) != 0) {
            str2 = pVar.f19797d;
        }
        String str3 = str2;
        return pVar.e(str, j11, j12, str3);
    }

    @m80.k
    public final String a() {
        return this.f19794a;
    }

    public final long b() {
        return this.f19795b;
    }

    public final long c() {
        return this.f19796c;
    }

    @m80.k
    public final String d() {
        return this.f19797d;
    }

    @m80.k
    public final p e(@m80.k String name, long j11, long j12, @m80.k String path) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(path, "path");
        return new p(name, j11, j12, path);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.g0.g(this.f19794a, pVar.f19794a) && this.f19795b == pVar.f19795b && this.f19796c == pVar.f19796c && kotlin.jvm.internal.g0.g(this.f19797d, pVar.f19797d);
    }

    public final long g() {
        return this.f19796c;
    }

    @m80.k
    public final String h() {
        return this.f19794a;
    }

    public int hashCode() {
        return (((((this.f19794a.hashCode() * 31) + Long.hashCode(this.f19795b)) * 31) + Long.hashCode(this.f19796c)) * 31) + this.f19797d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f19797d;
    }

    public final long j() {
        return this.f19795b;
    }

    @m80.k
    public String toString() {
        return "AdCacheFile(name=" + this.f19794a + ", size=" + this.f19795b + ", lastModified=" + this.f19796c + ", path=" + this.f19797d + pn.j.f81007d;
    }
}
