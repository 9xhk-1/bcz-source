package zp;

import com.google.zxing.FormatException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class p extends q {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102810d = 10;

    /* renamed from: b, reason: collision with root package name */
    public final int f102811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102812c;

    public p(int i11, int i12, int i13) throws FormatException {
        super(i11);
        if (i12 < 0 || i12 > 10 || i13 < 0 || i13 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f102811b = i12;
        this.f102812c = i13;
    }

    public int b() {
        return this.f102811b;
    }

    public int c() {
        return this.f102812c;
    }

    public int d() {
        return (this.f102811b * 10) + this.f102812c;
    }

    public boolean e() {
        return this.f102811b == 10 || this.f102812c == 10;
    }

    public boolean f() {
        return this.f102811b == 10;
    }

    public boolean g() {
        return this.f102812c == 10;
    }
}
