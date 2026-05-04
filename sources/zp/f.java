package zp;

import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class f extends i {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102790d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f102791e = 15;

    public f(kp.a aVar) {
        super(aVar);
    }

    @Override // zp.j
    public String d() throws NotFoundException {
        if (c().m() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 5);
        j(sb2, 45, 15);
        return sb2.toString();
    }
}
