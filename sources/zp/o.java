package zp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    public final String f102807b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102808c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f102809d;

    public o(int i11, String str) {
        super(i11);
        this.f102807b = str;
        this.f102809d = false;
        this.f102808c = 0;
    }

    public String b() {
        return this.f102807b;
    }

    public int c() {
        return this.f102808c;
    }

    public boolean d() {
        return this.f102809d;
    }

    public o(int i11, String str, int i12) {
        super(i11);
        this.f102809d = true;
        this.f102808c = i12;
        this.f102807b = str;
    }
}
