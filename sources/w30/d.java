package w30;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f94773a = false;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ThreadLocal<DecimalFormat>[] f94774b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i11 = 0; i11 < 4; i11++) {
            threadLocalArr[i11] = new ThreadLocal<>();
        }
        f94774b = threadLocalArr;
    }

    public static final DecimalFormat a(int i11) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i11 > 0) {
            decimalFormat.setMinimumFractionDigits(i11);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @m80.k
    public static final String b(double d11, int i11) {
        DecimalFormat a11;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f94774b;
        if (i11 < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i11];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = a(i11);
                threadLocal.set(decimalFormat);
            }
            a11 = decimalFormat;
        } else {
            a11 = a(i11);
        }
        String format = a11.format(d11);
        g0.o(format, "format(...)");
        return format;
    }

    public static final boolean c() {
        return f94773a;
    }
}
