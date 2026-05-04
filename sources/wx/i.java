package wx;

import io.ktor.network.tls.CipherType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import m80.k;
import ux.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f96961a = a.f96962a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f96962a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: wx.i$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1300a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96963a;

            static {
                int[] iArr = new int[CipherType.values().length];
                try {
                    iArr[CipherType.GCM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CipherType.CBC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f96963a = iArr;
            }
        }

        @k
        public final i a(@k ux.e suite, @k byte[] keyMaterial) {
            g0.p(suite, "suite");
            g0.p(keyMaterial, "keyMaterial");
            int i11 = C1300a.f96963a[suite.r().ordinal()];
            if (i11 == 1) {
                return new g(suite, keyMaterial);
            }
            if (i11 == 2) {
                return new b(suite, keyMaterial);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @k
    i0 a(@k i0 i0Var);

    @k
    i0 b(@k i0 i0Var);
}
