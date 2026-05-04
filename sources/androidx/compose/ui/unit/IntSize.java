package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,122:1\n54#1:125\n59#1:127\n54#1:143\n59#1:145\n85#2:123\n90#2:124\n85#2:126\n90#2:128\n85#2,6:129\n80#2:135\n85#2,6:136\n80#2:142\n85#2:144\n90#2:146\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n61#1:125\n63#1:127\n75#1:143\n75#1:145\n54#1:123\n59#1:124\n61#1:126\n63#1:128\n68#1:129,6\n68#1:135\n73#1:136,6\n73#1:142\n75#1:144\n75#1:146\n*E\n"})
@Immutable
/* loaded from: classes2.dex */
public final class IntSize {

    @k
    public static final Companion Companion = new Companion(null);
    private static final long Zero = m5281constructorimpl(0);
    private final long packedValue;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m5291getZeroYbymL2g() {
            return IntSize.Zero;
        }

        private Companion() {
        }
    }

    @v0
    private /* synthetic */ IntSize(long j11) {
        this.packedValue = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m5278boximpl(long j11) {
        return new IntSize(j11);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m5279component1impl(long j11) {
        return (int) (j11 >> 32);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m5280component2impl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    @Stable
    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m5282divYEO4UFw(long j11, int i11) {
        return m5281constructorimpl(((((int) (j11 >> 32)) / i11) << 32) | ((((int) (j11 & 4294967295L)) / i11) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5283equalsimpl(long j11, Object obj) {
        return (obj instanceof IntSize) && j11 == ((IntSize) obj).m5290unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5284equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m5285getHeightimpl(long j11) {
        return (int) (j11 & 4294967295L);
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m5286getWidthimpl(long j11) {
        return (int) (j11 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5287hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @Stable
    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m5288timesYEO4UFw(long j11, int i11) {
        return m5281constructorimpl(((((int) (j11 >> 32)) * i11) << 32) | ((((int) (j11 & 4294967295L)) * i11) & 4294967295L));
    }

    @Stable
    @k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5289toStringimpl(long j11) {
        return ((int) (j11 >> 32)) + " x " + ((int) (j11 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m5283equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m5287hashCodeimpl(this.packedValue);
    }

    @Stable
    @k
    public String toString() {
        return m5289toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5290unboximpl() {
        return this.packedValue;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @v0
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5281constructorimpl(long j11) {
        return j11;
    }
}
