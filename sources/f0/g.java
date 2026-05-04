package f0;

import androidx.annotation.Px;
import coil.size.Scale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g f50287a = new g();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50288a;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50288a = iArr;
        }
    }

    @w00.o
    public static final int a(@Px int i11, @Px int i12, @Px int i13, @Px int i14, @m80.k Scale scale) {
        int min;
        int highestOneBit = Integer.highestOneBit(i11 / i13);
        int highestOneBit2 = Integer.highestOneBit(i12 / i14);
        int i15 = a.f50288a[scale.ordinal()];
        if (i15 == 1) {
            min = Math.min(highestOneBit, highestOneBit2);
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            min = Math.max(highestOneBit, highestOneBit2);
        }
        return g10.u.u(min, 1);
    }

    @w00.o
    public static final double b(@Px double d11, @Px double d12, @Px double d13, @Px double d14, @m80.k Scale scale) {
        double d15 = d13 / d11;
        double d16 = d14 / d12;
        int i11 = a.f50288a[scale.ordinal()];
        if (i11 == 1) {
            return Math.max(d15, d16);
        }
        if (i11 == 2) {
            return Math.min(d15, d16);
        }
        throw new NoWhenBranchMatchedException();
    }

    @w00.o
    public static final double c(@Px int i11, @Px int i12, @Px int i13, @Px int i14, @m80.k Scale scale) {
        double d11 = i13 / i11;
        double d12 = i14 / i12;
        int i15 = a.f50288a[scale.ordinal()];
        if (i15 == 1) {
            return Math.max(d11, d12);
        }
        if (i15 == 2) {
            return Math.min(d11, d12);
        }
        throw new NoWhenBranchMatchedException();
    }

    @w00.o
    public static final float d(@Px float f11, @Px float f12, @Px float f13, @Px float f14, @m80.k Scale scale) {
        float f15 = f13 / f11;
        float f16 = f14 / f12;
        int i11 = a.f50288a[scale.ordinal()];
        if (i11 == 1) {
            return Math.max(f15, f16);
        }
        if (i11 == 2) {
            return Math.min(f15, f16);
        }
        throw new NoWhenBranchMatchedException();
    }
}
