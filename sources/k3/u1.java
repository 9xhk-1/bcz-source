package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t1[] f65634a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65635b;

    public u1(@m80.k t1[] meanings, int i11) {
        kotlin.jvm.internal.g0.p(meanings, "meanings");
        this.f65634a = meanings;
        this.f65635b = i11;
    }

    public static /* synthetic */ u1 d(u1 u1Var, t1[] t1VarArr, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            t1VarArr = u1Var.f65634a;
        }
        if ((i12 & 2) != 0) {
            i11 = u1Var.f65635b;
        }
        return u1Var.c(t1VarArr, i11);
    }

    @m80.k
    public final t1[] a() {
        return this.f65634a;
    }

    public final int b() {
        return this.f65635b;
    }

    @m80.k
    public final u1 c(@m80.k t1[] meanings, int i11) {
        kotlin.jvm.internal.g0.p(meanings, "meanings");
        return new u1(meanings, i11);
    }

    public final int e() {
        return this.f65635b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Arrays.equals(this.f65634a, u1Var.f65634a) && this.f65635b == u1Var.f65635b;
    }

    @m80.k
    public final t1[] f() {
        return this.f65634a;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f65634a) * 31) + this.f65635b;
    }

    @m80.k
    public String toString() {
        return "MeaningInfo(meanings=" + Arrays.toString(this.f65634a) + ", maxTypeLen=" + this.f65635b + ')';
    }
}
