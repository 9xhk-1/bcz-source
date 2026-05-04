package ju;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f64674a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64675b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f64676c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f64677d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f64678e;

    public q(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f64674a = z11;
        this.f64675b = z12;
        this.f64676c = z13;
        this.f64677d = z14;
        this.f64678e = z15;
    }

    public static q a() {
        return new q(false, false, false, true, true);
    }

    public static q b() {
        return new q(true, true, true, true, true);
    }

    public boolean c() {
        return this.f64675b;
    }

    public boolean d() {
        return this.f64676c;
    }

    public boolean e() {
        return this.f64677d;
    }

    public boolean f() {
        return this.f64674a;
    }

    public boolean g() {
        return this.f64678e;
    }

    public q h(boolean z11) {
        return z11 == this.f64675b ? this : new q(this.f64674a, z11, this.f64676c, this.f64677d, this.f64678e);
    }

    public q i(boolean z11) {
        return z11 == this.f64676c ? this : new q(this.f64674a, this.f64675b, z11, this.f64677d, this.f64678e);
    }

    public q j(boolean z11) {
        return z11 == this.f64677d ? this : new q(this.f64674a, this.f64675b, this.f64676c, z11, this.f64678e);
    }

    public q k(boolean z11) {
        return z11 == this.f64674a ? this : new q(z11, this.f64675b, this.f64676c, this.f64677d, this.f64678e);
    }

    public q l(boolean z11) {
        return z11 == this.f64678e ? this : new q(this.f64674a, this.f64675b, this.f64676c, this.f64677d, z11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigRenderOptions(");
        if (this.f64674a) {
            sb2.append("originComments,");
        }
        if (this.f64675b) {
            sb2.append("comments,");
        }
        if (this.f64676c) {
            sb2.append("formatted,");
        }
        if (this.f64677d) {
            sb2.append("json,");
        }
        if (this.f64678e) {
            sb2.append("showEnvVariableValues,");
        }
        if (sb2.charAt(sb2.length() - 1) == ',') {
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }
}
