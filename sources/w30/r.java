package w30;

import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.9")
@u0({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,210:1\n80#2:211\n80#2:212\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n184#1:211\n191#1:212\n*E\n"})
@j2(markerClass = {h.class})
/* loaded from: classes8.dex */
public final class r extends kotlin.time.b {

    /* renamed from: d, reason: collision with root package name */
    public long f94778d;

    public r() {
        super(DurationUnit.NANOSECONDS);
        a();
    }

    @Override // kotlin.time.b
    public long g() {
        return this.f94778d;
    }

    public final void i(long j11) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f94778d + g.h(e()) + " is advanced by " + ((Object) kotlin.time.e.f0(j11)) + '.');
    }

    public final void j(long j11) {
        long e02 = kotlin.time.e.e0(j11, e());
        if (((e02 - 1) | 1) != Long.MAX_VALUE) {
            long j12 = this.f94778d;
            long j13 = j12 + e02;
            if ((e02 ^ j12) >= 0 && (j12 ^ j13) < 0) {
                i(j11);
            }
            this.f94778d = j13;
            return;
        }
        long o11 = kotlin.time.e.o(j11, 2);
        if ((1 | (kotlin.time.e.e0(o11, e()) - 1)) == Long.MAX_VALUE) {
            i(j11);
            return;
        }
        long j14 = this.f94778d;
        try {
            j(o11);
            j(kotlin.time.e.S(j11, o11));
        } catch (IllegalStateException e11) {
            this.f94778d = j14;
            throw e11;
        }
    }
}
