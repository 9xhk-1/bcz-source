package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0[] f65395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65396b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65397c;

    public k0(@m80.k m0[] templateInfos, int i11, @m80.k String activityUrl) {
        kotlin.jvm.internal.g0.p(templateInfos, "templateInfos");
        kotlin.jvm.internal.g0.p(activityUrl, "activityUrl");
        this.f65395a = templateInfos;
        this.f65396b = i11;
        this.f65397c = activityUrl;
    }

    public static /* synthetic */ k0 e(k0 k0Var, m0[] m0VarArr, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            m0VarArr = k0Var.f65395a;
        }
        if ((i12 & 2) != 0) {
            i11 = k0Var.f65396b;
        }
        if ((i12 & 4) != 0) {
            str = k0Var.f65397c;
        }
        return k0Var.d(m0VarArr, i11, str);
    }

    @m80.k
    public final m0[] a() {
        return this.f65395a;
    }

    public final int b() {
        return this.f65396b;
    }

    @m80.k
    public final String c() {
        return this.f65397c;
    }

    @m80.k
    public final k0 d(@m80.k m0[] templateInfos, int i11, @m80.k String activityUrl) {
        kotlin.jvm.internal.g0.p(templateInfos, "templateInfos");
        kotlin.jvm.internal.g0.p(activityUrl, "activityUrl");
        return new k0(templateInfos, i11, activityUrl);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Arrays.equals(this.f65395a, k0Var.f65395a) && this.f65396b == k0Var.f65396b && kotlin.jvm.internal.g0.g(this.f65397c, k0Var.f65397c);
    }

    @m80.k
    public final String f() {
        return this.f65397c;
    }

    public final int g() {
        return this.f65396b;
    }

    @m80.k
    public final m0[] h() {
        return this.f65395a;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f65395a) * 31) + this.f65396b) * 31) + this.f65397c.hashCode();
    }

    @m80.k
    public String toString() {
        return "ExportInfo(templateInfos=" + Arrays.toString(this.f65395a) + ", balance=" + this.f65396b + ", activityUrl=" + this.f65397c + ')';
    }
}
