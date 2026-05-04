package zp;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102782d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f102783e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f102784f = 10;

    public d(kp.a aVar) {
        super(aVar);
    }

    @Override // zp.j
    public String d() throws NotFoundException, FormatException {
        if (c().m() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 8);
        int f11 = b().f(48, 2);
        sb2.append("(393");
        sb2.append(f11);
        sb2.append(')');
        int f12 = b().f(50, 10);
        if (f12 / 100 == 0) {
            sb2.append('0');
        }
        if (f12 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(f12);
        sb2.append(b().c(60, null).b());
        return sb2.toString();
    }
}
