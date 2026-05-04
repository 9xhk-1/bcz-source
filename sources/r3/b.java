package r3;

import com.baicizhan.app.api.service.Gender;
import k3.k2;
import k3.w3;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82892a;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.Boy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.Girl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f82892a = iArr;
        }
    }

    @k
    public static final Gender a(int i11) {
        return i11 != 1 ? i11 != 2 ? Gender.Unknown : Gender.Girl : Gender.Boy;
    }

    public static final int b(@k Gender gender) {
        g0.p(gender, "<this>");
        int i11 = a.f82892a[gender.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                return 3;
            }
        }
        return i12;
    }

    @k
    public static final w3 c(@k r3.a aVar) {
        g0.p(aVar, "<this>");
        String s11 = aVar.s();
        String w11 = aVar.w();
        String n11 = aVar.n();
        String v11 = aVar.v();
        return new w3(s11, w11, n11, a(aVar.o()), new k2(aVar.u(), aVar.p()), aVar.x(), v11);
    }
}
