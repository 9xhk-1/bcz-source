package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public abstract class Brush {

    @m80.k
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,658:1\n1#2:659\n30#3:660\n30#3:664\n30#3:668\n30#3:672\n30#3:676\n30#3:680\n53#4,3:661\n53#4,3:665\n53#4,3:669\n53#4,3:673\n53#4,3:677\n53#4,3:681\n*S KotlinDebug\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n*L\n149#1:660\n186#1:664\n187#1:668\n218#1:672\n255#1:676\n256#1:680\n149#1:661,3\n186#1:665,3\n187#1:669,3\n218#1:673,3\n255#1:677,3\n256#1:681,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2458horizontalGradient8A3gB4$default(Companion companion, List list, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2468horizontalGradient8A3gB4((List<Color>) list, f11, f12, i11);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m2461linearGradientmHitzGk$default(Companion companion, Pair[] pairArr, long j11, long j12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                j11 = Offset.Companion.m2284getZeroF1C5BW0();
            }
            long j13 = j11;
            if ((i12 & 4) != 0) {
                j12 = Offset.Companion.m2282getInfiniteF1C5BW0();
            }
            long j14 = j12;
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2471linearGradientmHitzGk((Pair<Float, Color>[]) pairArr, j13, j14, i11);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m2463radialGradientP_VxKs$default(Companion companion, Pair[] pairArr, long j11, float f11, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                j11 = Offset.Companion.m2283getUnspecifiedF1C5BW0();
            }
            long j12 = j11;
            if ((i12 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            float f12 = f11;
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2473radialGradientP_VxKs((Pair<Float, Color>[]) pairArr, j12, f12, i11);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m2465sweepGradientUv8p0NA$default(Companion companion, Pair[] pairArr, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = Offset.Companion.m2283getUnspecifiedF1C5BW0();
            }
            return companion.m2475sweepGradientUv8p0NA((Pair<Float, Color>[]) pairArr, j11);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2466verticalGradient8A3gB4$default(Companion companion, List list, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2476verticalGradient8A3gB4((List<Color>) list, f11, f12, i11);
        }

        @Stable
        @m80.k
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2469horizontalGradient8A3gB4(@m80.k Pair<Float, Color>[] pairArr, float f11, float f12, int i11) {
            return m2471linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), i11);
        }

        @Stable
        @m80.k
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m2471linearGradientmHitzGk(@m80.k Pair<Float, Color>[] pairArr, long j11, long j12, int i11) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m2499boximpl(pair.getSecond().m2519unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j11, j12, i11, null);
        }

        @Stable
        @m80.k
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m2473radialGradientP_VxKs(@m80.k Pair<Float, Color>[] pairArr, long j11, float f11, int i11) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m2499boximpl(pair.getSecond().m2519unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j11, f11, i11, null);
        }

        @Stable
        @m80.k
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m2475sweepGradientUv8p0NA(@m80.k Pair<Float, Color>[] pairArr, long j11) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair : pairArr) {
                arrayList.add(Color.m2499boximpl(pair.getSecond().m2519unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair<Float, Color> pair2 : pairArr) {
                arrayList2.add(Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new SweepGradient(j11, arrayList, arrayList2, null);
        }

        @Stable
        @m80.k
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2477verticalGradient8A3gB4(@m80.k Pair<Float, Color>[] pairArr, float f11, float f12, int i11) {
            return m2471linearGradientmHitzGk((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), i11);
        }

        private Companion() {
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2459horizontalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2469horizontalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f11, f12, i11);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m2464sweepGradientUv8p0NA$default(Companion companion, List list, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = Offset.Companion.m2283getUnspecifiedF1C5BW0();
            }
            return companion.m2474sweepGradientUv8p0NA((List<Color>) list, j11);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m2467verticalGradient8A3gB4$default(Companion companion, Pair[] pairArr, float f11, float f12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i12 & 4) != 0) {
                f12 = Float.POSITIVE_INFINITY;
            }
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2477verticalGradient8A3gB4((Pair<Float, Color>[]) pairArr, f11, f12, i11);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m2462radialGradientP_VxKs$default(Companion companion, List list, long j11, float f11, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                j11 = Offset.Companion.m2283getUnspecifiedF1C5BW0();
            }
            long j12 = j11;
            if ((i12 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            float f12 = f11;
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2472radialGradientP_VxKs((List<Color>) list, j12, f12, i11);
        }

        @Stable
        @m80.k
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m2470linearGradientmHitzGk(@m80.k List<Color> list, long j11, long j12, int i11) {
            return new LinearGradient(list, null, j11, j12, i11, null);
        }

        @Stable
        @m80.k
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m2472radialGradientP_VxKs(@m80.k List<Color> list, long j11, float f11, int i11) {
            return new RadialGradient(list, null, j11, f11, i11, null);
        }

        @Stable
        @m80.k
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m2474sweepGradientUv8p0NA(@m80.k List<Color> list, long j11) {
            return new SweepGradient(j11, list, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m2460linearGradientmHitzGk$default(Companion companion, List list, long j11, long j12, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                j11 = Offset.Companion.m2284getZeroF1C5BW0();
            }
            long j13 = j11;
            if ((i12 & 4) != 0) {
                j12 = Offset.Companion.m2282getInfiniteF1C5BW0();
            }
            long j14 = j12;
            if ((i12 & 8) != 0) {
                i11 = TileMode.Companion.m2882getClamp3opZhB0();
            }
            return companion.m2470linearGradientmHitzGk((List<Color>) list, j13, j14, i11);
        }

        @Stable
        @m80.k
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2468horizontalGradient8A3gB4(@m80.k List<Color> list, float f11, float f12, int i11) {
            return m2470linearGradientmHitzGk(list, Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m2260constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), i11);
        }

        @Stable
        @m80.k
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m2476verticalGradient8A3gB4(@m80.k List<Color> list, float f11, float f12, int i11) {
            return m2470linearGradientmHitzGk(list, Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), i11);
        }
    }

    public /* synthetic */ Brush(kotlin.jvm.internal.v vVar) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo2456applyToPq9zytI(long j11, @m80.k Paint paint, float f11);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo2457getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m2345getUnspecifiedNHjbRc();
    }
}
