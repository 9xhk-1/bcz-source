package f4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f50585a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f50586b;

    public f0(@m80.k String configKey, @m80.k String configValue) {
        kotlin.jvm.internal.g0.p(configKey, "configKey");
        kotlin.jvm.internal.g0.p(configValue, "configValue");
        this.f50585a = configKey;
        this.f50586b = configValue;
    }

    public static /* synthetic */ f0 d(f0 f0Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f0Var.f50585a;
        }
        if ((i11 & 2) != 0) {
            str2 = f0Var.f50586b;
        }
        return f0Var.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f50585a;
    }

    @m80.k
    public final String b() {
        return this.f50586b;
    }

    @m80.k
    public final f0 c(@m80.k String configKey, @m80.k String configValue) {
        kotlin.jvm.internal.g0.p(configKey, "configKey");
        kotlin.jvm.internal.g0.p(configValue, "configValue");
        return new f0(configKey, configValue);
    }

    @m80.k
    public final String e() {
        return this.f50585a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.g0.g(this.f50585a, f0Var.f50585a) && kotlin.jvm.internal.g0.g(this.f50586b, f0Var.f50586b);
    }

    @m80.k
    public final String f() {
        return this.f50586b;
    }

    public int hashCode() {
        return (this.f50585a.hashCode() * 31) + this.f50586b.hashCode();
    }

    @m80.k
    public String toString() {
        return "ExperimentRecord(configKey=" + this.f50585a + ", configValue=" + this.f50586b + ')';
    }
}
