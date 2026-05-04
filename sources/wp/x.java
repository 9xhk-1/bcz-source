package wp;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f96640c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public final v f96641a = new v();

    /* renamed from: b, reason: collision with root package name */
    public final w f96642b = new w();

    public com.google.zxing.k a(int i11, kp.a aVar, int i12) throws NotFoundException {
        int[] n11 = y.n(aVar, i12, false, f96640c);
        try {
            return this.f96642b.b(i11, aVar, n11);
        } catch (ReaderException unused) {
            return this.f96641a.b(i11, aVar, n11);
        }
    }
}
