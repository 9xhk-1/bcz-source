package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,147:1\n60#2:148\n70#2:150\n53#2,3:152\n60#2:155\n70#2:157\n60#2:158\n70#2:160\n53#2,3:162\n60#2:165\n70#2:167\n53#2,3:169\n60#2:172\n70#2:174\n53#2,3:175\n60#2:178\n70#2:180\n53#2,3:181\n60#2:184\n70#2:186\n53#2,3:187\n22#3:149\n22#3:151\n22#3:156\n22#3:159\n22#3:161\n22#3:166\n22#3:168\n22#3:173\n22#3:179\n22#3:185\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n42#1:148\n47#1:150\n57#1:152,3\n56#1:155\n56#1:157\n89#1:158\n90#1:160\n88#1:162,3\n104#1:165\n105#1:167\n103#1:169,3\n118#1:172\n118#1:174\n118#1:175,3\n130#1:178\n130#1:180\n130#1:181,3\n142#1:184\n142#1:186\n142#1:187,3\n42#1:149\n47#1:151\n56#1:156\n89#1:159\n90#1:161\n104#1:166\n105#1:168\n118#1:173\n130#1:179\n142#1:185\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class Velocity {

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m5347constructorimpl(0);
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getZero-9UxMQ8M, reason: not valid java name */
        public final long m5364getZero9UxMQ8M() {
            return Velocity.Zero;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getZero-9UxMQ8M$annotations, reason: not valid java name */
        public static /* synthetic */ void m5363getZero9UxMQ8M$annotations() {
        }
    }

    private /* synthetic */ Velocity(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Velocity m5344boximpl(long j11) {
        return new Velocity(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5345component1impl(long j11) {
        return m5353getXimpl(j11);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5346component2impl(long j11) {
        return m5354getYimpl(j11);
    }

    /* renamed from: copy-OhffZ5M, reason: not valid java name */
    public static final long m5348copyOhffZ5M(long j11, float f11, float f12) {
        return m5347constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
    }

    /* renamed from: copy-OhffZ5M$default, reason: not valid java name */
    public static /* synthetic */ long m5349copyOhffZ5M$default(long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j11 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (4294967295L & j11));
        }
        return m5348copyOhffZ5M(j11, f11, f12);
    }

    @Stable
    /* renamed from: div-adjELrA, reason: not valid java name */
    public static final long m5350divadjELrA(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) / f11;
        return m5347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5351equalsimpl(long j11, Object obj) {
        return (obj instanceof Velocity) && j11 == ((Velocity) obj).m5362unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5352equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getX-impl, reason: not valid java name */
    public static final float m5353getXimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* renamed from: getY-impl, reason: not valid java name */
    public static final float m5354getYimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5355hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: minus-AH228Gc, reason: not valid java name */
    public static final long m5356minusAH228Gc(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat((int) (j12 & 4294967295L));
        return m5347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-AH228Gc, reason: not valid java name */
    public static final long m5357plusAH228Gc(long j11, long j12) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j12 & 4294967295L));
        return m5347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: rem-adjELrA, reason: not valid java name */
    public static final long m5358remadjELrA(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) % f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) % f11;
        return m5347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: times-adjELrA, reason: not valid java name */
    public static final long m5359timesadjELrA(long j11, float f11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f11;
        return m5347constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5360toStringimpl(long j11) {
        return '(' + m5353getXimpl(j11) + j2.O + m5354getYimpl(j11) + ") px/sec";
    }

    @Stable
    /* renamed from: unaryMinus-9UxMQ8M, reason: not valid java name */
    public static final long m5361unaryMinus9UxMQ8M(long j11) {
        return m5347constructorimpl(j11 ^ (-9223372034707292160L));
    }

    public boolean equals(Object obj) {
        return m5351equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5355hashCodeimpl(this.packedValue);
    }

    @k
    public String toString() {
        return m5360toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5362unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5347constructorimpl(long j11) {
        return j11;
    }
}
