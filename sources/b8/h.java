package b8;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f6381a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f6382b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6383c;

    public h(long j11, @m80.k String name, long j12) {
        g0.p(name, "name");
        this.f6381a = j11;
        this.f6382b = name;
        this.f6383c = j12;
    }

    public static /* synthetic */ h e(h hVar, long j11, String str, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = hVar.f6381a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            str = hVar.f6382b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            j12 = hVar.f6383c;
        }
        return hVar.d(j13, str2, j12);
    }

    public final long a() {
        return this.f6381a;
    }

    @m80.k
    public final String b() {
        return this.f6382b;
    }

    public final long c() {
        return this.f6383c;
    }

    @m80.k
    public final h d(long j11, @m80.k String name, long j12) {
        g0.p(name, "name");
        return new h(j11, name, j12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6381a == hVar.f6381a && g0.g(this.f6382b, hVar.f6382b) && this.f6383c == hVar.f6383c;
    }

    public final long f() {
        return this.f6383c;
    }

    public final long g() {
        return this.f6381a;
    }

    @m80.k
    public final String h() {
        return this.f6382b;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f6381a) * 31) + this.f6382b.hashCode()) * 31) + Long.hashCode(this.f6383c);
    }

    @m80.k
    public String toString() {
        return "TestStudent(id=" + this.f6381a + ", name=" + this.f6382b + ", age=" + this.f6383c + ')';
    }
}
