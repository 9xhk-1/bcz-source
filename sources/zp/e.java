package zp;

import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e extends i {

    /* renamed from: f, reason: collision with root package name */
    public static final int f102785f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final int f102786g = 20;

    /* renamed from: h, reason: collision with root package name */
    public static final int f102787h = 16;

    /* renamed from: d, reason: collision with root package name */
    public final String f102788d;

    /* renamed from: e, reason: collision with root package name */
    public final String f102789e;

    public e(kp.a aVar, String str, String str2) {
        super(aVar);
        this.f102788d = str2;
        this.f102789e = str;
    }

    @Override // zp.j
    public String d() throws NotFoundException {
        if (c().m() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 8);
        j(sb2, 48, 20);
        k(sb2, 68);
        return sb2.toString();
    }

    @Override // zp.i
    public void h(StringBuilder sb2, int i11) {
        sb2.append('(');
        sb2.append(this.f102789e);
        sb2.append(i11 / 100000);
        sb2.append(')');
    }

    @Override // zp.i
    public int i(int i11) {
        return i11 % 100000;
    }

    public final void k(StringBuilder sb2, int i11) {
        int f11 = b().f(i11, 16);
        if (f11 == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f102788d);
        sb2.append(')');
        int i12 = f11 % 32;
        int i13 = f11 / 32;
        int i14 = (i13 % 12) + 1;
        int i15 = i13 / 12;
        if (i15 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i15);
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i12 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i12);
    }
}
