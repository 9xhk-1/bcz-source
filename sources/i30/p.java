package i30;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60140a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60140a = iArr;
        }
    }

    @m80.k
    public static final TypeVariance a(@m80.k Variance variance) {
        g0.p(variance, "<this>");
        int i11 = a.f60140a[variance.ordinal()];
        if (i11 == 1) {
            return TypeVariance.INV;
        }
        if (i11 == 2) {
            return TypeVariance.IN;
        }
        if (i11 == 3) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
