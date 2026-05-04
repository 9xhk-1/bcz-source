package zp;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102780d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f102781e = 2;

    public c(kp.a aVar) {
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
        sb2.append("(392");
        sb2.append(f11);
        sb2.append(')');
        sb2.append(b().c(50, null).b());
        return sb2.toString();
    }
}
