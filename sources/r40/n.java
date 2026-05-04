package r40;

import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {
    @m80.k
    public static final l a(int i11, int i12, int i13, int i14, int i15, int i16, long j11) {
        return d(k(i11, i12), i13, l(i14, i15, i16, j11));
    }

    public static /* synthetic */ l b(int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = 0;
        }
        if ((i17 & 2) != 0) {
            i12 = 0;
        }
        if ((i17 & 4) != 0) {
            i13 = 0;
        }
        if ((i17 & 8) != 0) {
            i14 = 0;
        }
        if ((i17 & 16) != 0) {
            i15 = 0;
        }
        if ((i17 & 32) != 0) {
            i16 = 0;
        }
        if ((i17 & 64) != 0) {
            j11 = 0;
        }
        return a(i11, i12, i13, i14, i15, i16, j11);
    }

    @m80.k
    public static final l d(long j11, int i11, long j12) {
        return j12 != 0 ? new m(j11, i11, j12) : new k(j11, i11);
    }

    public static /* synthetic */ l e(long j11, int i11, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return d(j11, i11, j12);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Adding periods is not a well-defined operation. See https://github.com/Kotlin/kotlinx-datetime/issues/381")
    @m80.k
    public static final k f(@m80.k k kVar, @m80.k k other) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return new k(t40.e.b(kVar.h(), other.h()), t40.e.a(kVar.b(), other.b()));
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Adding periods is not a well-defined operation. See https://github.com/Kotlin/kotlinx-datetime/issues/381")
    @m80.k
    public static final l g(@m80.k l lVar, @m80.k l other) {
        kotlin.jvm.internal.g0.p(lVar, "<this>");
        kotlin.jvm.internal.g0.p(other, "other");
        return d(t40.e.b(lVar.h(), other.h()), t40.e.a(lVar.b(), other.b()), t40.e.b(lVar.i(), other.i()));
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @yz.w0(expression = "DatePeriod.parse(this)", imports = {}))
    @m80.k
    public static final k h(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return k.Companion.a(str);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Removed to support more idiomatic code. See https://github.com/Kotlin/kotlinx-datetime/issues/339", replaceWith = @yz.w0(expression = "DateTimePeriod.parse(this)", imports = {}))
    @m80.k
    public static final l i(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return l.Companion.a(str);
    }

    @m80.k
    public static final l j(long j11) {
        return e(0L, 0, kotlin.time.e.z(j11), 3, null);
    }

    public static final long k(int i11, int i12) {
        long j11 = 12;
        long j12 = (i11 * j11) + i12;
        long j13 = j12 / j11;
        if (SieveCacheKt.NodeMetaAndPreviousMask <= j13 && j13 <= SieveCacheKt.NodeLinkMask) {
            return j12;
        }
        throw new IllegalArgumentException(("The total number of years in " + i11 + " years and " + i12 + " months overflows an Int").toString());
    }

    public static final long l(int i11, int i12, int i13, long j11) {
        long j12 = 60;
        long j13 = ((i11 * j12) + i12) * j12;
        long j14 = 1000000000;
        try {
            return t40.f.i(j13 + (j11 / j14) + i13, C.NANOS_PER_SECOND, j11 % j14);
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("The total number of nanoseconds in " + i11 + " hours, " + i12 + " minutes, " + i13 + " seconds, and " + j11 + " nanoseconds overflows a Long");
        }
    }
}
