package h5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58491a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58492b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58493c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58494d;

    public z(@m80.k String url, boolean z11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(url, "url");
        this.f58491a = url;
        this.f58492b = z11;
        this.f58493c = i11;
        this.f58494d = i12;
    }

    public static /* synthetic */ z f(z zVar, String str, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = zVar.f58491a;
        }
        if ((i13 & 2) != 0) {
            z11 = zVar.f58492b;
        }
        if ((i13 & 4) != 0) {
            i11 = zVar.f58493c;
        }
        if ((i13 & 8) != 0) {
            i12 = zVar.f58494d;
        }
        return zVar.e(str, z11, i11, i12);
    }

    @m80.k
    public final String a() {
        return this.f58491a;
    }

    public final boolean b() {
        return this.f58492b;
    }

    public final int c() {
        return this.f58493c;
    }

    public final int d() {
        return this.f58494d;
    }

    @m80.k
    public final z e(@m80.k String url, boolean z11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(url, "url");
        return new z(url, z11, i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.g0.g(this.f58491a, zVar.f58491a) && this.f58492b == zVar.f58492b && this.f58493c == zVar.f58493c && this.f58494d == zVar.f58494d;
    }

    public final boolean g() {
        return this.f58492b;
    }

    public final int h() {
        return this.f58493c;
    }

    public int hashCode() {
        return (((((this.f58491a.hashCode() * 31) + Boolean.hashCode(this.f58492b)) * 31) + Integer.hashCode(this.f58493c)) * 31) + Integer.hashCode(this.f58494d);
    }

    public final int i() {
        return this.f58494d;
    }

    @m80.k
    public final String j() {
        return this.f58491a;
    }

    @m80.k
    public String toString() {
        return "NotificationModel(url=" + this.f58491a + ", hasNew=" + this.f58492b + ", latestNotifyTimeSec=" + this.f58493c + ", unreadCount=" + this.f58494d + ')';
    }
}
