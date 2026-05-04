package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65704a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65705b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f65707d;

    /* renamed from: e, reason: collision with root package name */
    public final int f65708e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f65709f;

    public y(@m80.k String title, @m80.k String icon, int i11, int i12, int i13, @m80.k String jumpUrl) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(jumpUrl, "jumpUrl");
        this.f65704a = title;
        this.f65705b = icon;
        this.f65706c = i11;
        this.f65707d = i12;
        this.f65708e = i13;
        this.f65709f = jumpUrl;
    }

    public static /* synthetic */ y h(y yVar, String str, String str2, int i11, int i12, int i13, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = yVar.f65704a;
        }
        if ((i14 & 2) != 0) {
            str2 = yVar.f65705b;
        }
        if ((i14 & 4) != 0) {
            i11 = yVar.f65706c;
        }
        if ((i14 & 8) != 0) {
            i12 = yVar.f65707d;
        }
        if ((i14 & 16) != 0) {
            i13 = yVar.f65708e;
        }
        if ((i14 & 32) != 0) {
            str3 = yVar.f65709f;
        }
        int i15 = i13;
        String str4 = str3;
        return yVar.g(str, str2, i11, i12, i15, str4);
    }

    @m80.k
    public final String a() {
        return this.f65704a;
    }

    @m80.k
    public final String b() {
        return this.f65705b;
    }

    public final int c() {
        return this.f65706c;
    }

    public final int d() {
        return this.f65707d;
    }

    public final int e() {
        return this.f65708e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.g0.g(this.f65704a, yVar.f65704a) && kotlin.jvm.internal.g0.g(this.f65705b, yVar.f65705b) && this.f65706c == yVar.f65706c && this.f65707d == yVar.f65707d && this.f65708e == yVar.f65708e && kotlin.jvm.internal.g0.g(this.f65709f, yVar.f65709f);
    }

    @m80.k
    public final String f() {
        return this.f65709f;
    }

    @m80.k
    public final y g(@m80.k String title, @m80.k String icon, int i11, int i12, int i13, @m80.k String jumpUrl) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(jumpUrl, "jumpUrl");
        return new y(title, icon, i11, i12, i13, jumpUrl);
    }

    public int hashCode() {
        return (((((((((this.f65704a.hashCode() * 31) + this.f65705b.hashCode()) * 31) + Integer.hashCode(this.f65706c)) * 31) + Integer.hashCode(this.f65707d)) * 31) + Integer.hashCode(this.f65708e)) * 31) + this.f65709f.hashCode();
    }

    public final int i() {
        return this.f65707d;
    }

    public final int j() {
        return this.f65708e;
    }

    public final int k() {
        return this.f65706c;
    }

    @m80.k
    public final String l() {
        return this.f65705b;
    }

    @m80.k
    public final String m() {
        return this.f65709f;
    }

    @m80.k
    public final String n() {
        return this.f65704a;
    }

    @m80.k
    public String toString() {
        return "CalendarResignInfo(title=" + this.f65704a + ", icon=" + this.f65705b + ", count=" + this.f65706c + ", copperCost=" + this.f65707d + ", copperHold=" + this.f65708e + ", jumpUrl=" + this.f65709f + ')';
    }
}
