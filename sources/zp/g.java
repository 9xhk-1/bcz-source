package zp;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102792d = 4;

    public g(kp.a aVar) {
        super(aVar);
    }

    @Override // zp.j
    public String d() throws NotFoundException, FormatException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append(b().f(4, 4));
        g(sb2, 8, length);
        return b().a(sb2, 48);
    }
}
