package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65721b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65722c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65723d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f65724e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f65725f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f65726g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f65727h;

    public y3(@m80.k String deviceId, int i11, @m80.k String name, @m80.k String image, @m80.k String model, @m80.k String serialNumber, @m80.k String version, boolean z11) {
        kotlin.jvm.internal.g0.p(deviceId, "deviceId");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(image, "image");
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(serialNumber, "serialNumber");
        kotlin.jvm.internal.g0.p(version, "version");
        this.f65720a = deviceId;
        this.f65721b = i11;
        this.f65722c = name;
        this.f65723d = image;
        this.f65724e = model;
        this.f65725f = serialNumber;
        this.f65726g = version;
        this.f65727h = z11;
    }

    public static /* synthetic */ y3 j(y3 y3Var, String str, int i11, String str2, String str3, String str4, String str5, String str6, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = y3Var.f65720a;
        }
        if ((i12 & 2) != 0) {
            i11 = y3Var.f65721b;
        }
        if ((i12 & 4) != 0) {
            str2 = y3Var.f65722c;
        }
        if ((i12 & 8) != 0) {
            str3 = y3Var.f65723d;
        }
        if ((i12 & 16) != 0) {
            str4 = y3Var.f65724e;
        }
        if ((i12 & 32) != 0) {
            str5 = y3Var.f65725f;
        }
        if ((i12 & 64) != 0) {
            str6 = y3Var.f65726g;
        }
        if ((i12 & 128) != 0) {
            z11 = y3Var.f65727h;
        }
        String str7 = str6;
        boolean z12 = z11;
        String str8 = str4;
        String str9 = str5;
        return y3Var.i(str, i11, str2, str3, str8, str9, str7, z12);
    }

    @m80.k
    public final String a() {
        return this.f65720a;
    }

    public final int b() {
        return this.f65721b;
    }

    @m80.k
    public final String c() {
        return this.f65722c;
    }

    @m80.k
    public final String d() {
        return this.f65723d;
    }

    @m80.k
    public final String e() {
        return this.f65724e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return kotlin.jvm.internal.g0.g(this.f65720a, y3Var.f65720a) && this.f65721b == y3Var.f65721b && kotlin.jvm.internal.g0.g(this.f65722c, y3Var.f65722c) && kotlin.jvm.internal.g0.g(this.f65723d, y3Var.f65723d) && kotlin.jvm.internal.g0.g(this.f65724e, y3Var.f65724e) && kotlin.jvm.internal.g0.g(this.f65725f, y3Var.f65725f) && kotlin.jvm.internal.g0.g(this.f65726g, y3Var.f65726g) && this.f65727h == y3Var.f65727h;
    }

    @m80.k
    public final String f() {
        return this.f65725f;
    }

    @m80.k
    public final String g() {
        return this.f65726g;
    }

    public final boolean h() {
        return this.f65727h;
    }

    public int hashCode() {
        return (((((((((((((this.f65720a.hashCode() * 31) + Integer.hashCode(this.f65721b)) * 31) + this.f65722c.hashCode()) * 31) + this.f65723d.hashCode()) * 31) + this.f65724e.hashCode()) * 31) + this.f65725f.hashCode()) * 31) + this.f65726g.hashCode()) * 31) + Boolean.hashCode(this.f65727h);
    }

    @m80.k
    public final y3 i(@m80.k String deviceId, int i11, @m80.k String name, @m80.k String image, @m80.k String model, @m80.k String serialNumber, @m80.k String version, boolean z11) {
        kotlin.jvm.internal.g0.p(deviceId, "deviceId");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(image, "image");
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(serialNumber, "serialNumber");
        kotlin.jvm.internal.g0.p(version, "version");
        return new y3(deviceId, i11, name, image, model, serialNumber, version, z11);
    }

    @m80.k
    public final String k() {
        return this.f65720a;
    }

    public final int l() {
        return this.f65721b;
    }

    @m80.k
    public final String m() {
        return this.f65723d;
    }

    @m80.k
    public final String n() {
        return this.f65724e;
    }

    @m80.k
    public final String o() {
        return this.f65722c;
    }

    public final boolean p() {
        return this.f65727h;
    }

    @m80.k
    public final String q() {
        return this.f65725f;
    }

    @m80.k
    public final String r() {
        return this.f65726g;
    }

    @m80.k
    public String toString() {
        return "VocabularyDeviceInfo(deviceId=" + this.f65720a + ", deviceType=" + this.f65721b + ", name=" + this.f65722c + ", image=" + this.f65723d + ", model=" + this.f65724e + ", serialNumber=" + this.f65725f + ", version=" + this.f65726g + ", online=" + this.f65727h + ')';
    }
}
