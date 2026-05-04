package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import j00.c;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,255:1\n133#2,3:256\n34#2,6:259\n136#2:265\n34#2,6:266\n34#2,6:277\n34#2,6:283\n65#3:272\n69#3:275\n60#4:273\n70#4:276\n22#5:274\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,6\n116#1:265\n131#1:266,6\n217#1:277,6\n242#1:283,6\n162#1:272\n162#1:275\n162#1:273\n162#1:276\n162#1:274\n*E\n"})
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt {
    /* renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m526anglek4lQ0M(long j11) {
        if (Float.intBitsToFloat((int) (j11 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j11 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j11 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(@k PointerEvent pointerEvent, boolean z11) {
        long m2284getZeroF1C5BW0 = Offset.Companion.m2284getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            PointerInputChange pointerInputChange = changes.get(i12);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                m2284getZeroF1C5BW0 = Offset.m2273plusMKHz9U(m2284getZeroF1C5BW0, z11 ? pointerInputChange.m3732getPositionF1C5BW0() : pointerInputChange.m3733getPreviousPositionF1C5BW0());
                i11++;
            }
        }
        return i11 == 0 ? Offset.Companion.m2283getUnspecifiedF1C5BW0() : Offset.m2263divtuRUvjQ(m2284getZeroF1C5BW0, i11);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return calculateCentroid(pointerEvent, z11);
    }

    public static final float calculateCentroidSize(@k PointerEvent pointerEvent, boolean z11) {
        long calculateCentroid = calculateCentroid(pointerEvent, z11);
        float f11 = 0.0f;
        if (Offset.m2265equalsimpl0(calculateCentroid, Offset.Companion.m2283getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            PointerInputChange pointerInputChange = changes.get(i12);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                f11 += Offset.m2266getDistanceimpl(Offset.m2272minusMKHz9U(z11 ? pointerInputChange.m3732getPositionF1C5BW0() : pointerInputChange.m3733getPreviousPositionF1C5BW0(), calculateCentroid));
                i11++;
            }
        }
        return f11 / i11;
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return calculateCentroidSize(pointerEvent, z11);
    }

    public static final long calculatePan(@k PointerEvent pointerEvent) {
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        return Offset.m2265equalsimpl0(calculateCentroid, companion.m2283getUnspecifiedF1C5BW0()) ? companion.m2284getZeroF1C5BW0() : Offset.m2272minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(@k PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = 1;
            if (i11 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i11);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i13 = 0;
            }
            i12 += i13;
            i11++;
        }
        if (i12 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i14 = 0; i14 < size2; i14++) {
            PointerInputChange pointerInputChange2 = changes2.get(i14);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long m3732getPositionF1C5BW0 = pointerInputChange2.m3732getPositionF1C5BW0();
                long m2272minusMKHz9U = Offset.m2272minusMKHz9U(pointerInputChange2.m3733getPreviousPositionF1C5BW0(), calculateCentroid2);
                long m2272minusMKHz9U2 = Offset.m2272minusMKHz9U(m3732getPositionF1C5BW0, calculateCentroid);
                float m526anglek4lQ0M = m526anglek4lQ0M(m2272minusMKHz9U2) - m526anglek4lQ0M(m2272minusMKHz9U);
                float m2266getDistanceimpl = Offset.m2266getDistanceimpl(Offset.m2273plusMKHz9U(m2272minusMKHz9U2, m2272minusMKHz9U)) / 2.0f;
                if (m526anglek4lQ0M > 180.0f) {
                    m526anglek4lQ0M -= 360.0f;
                } else if (m526anglek4lQ0M < -180.0f) {
                    m526anglek4lQ0M += 360.0f;
                }
                f12 += m526anglek4lQ0M * m2266getDistanceimpl;
                f11 += m2266getDistanceimpl;
            }
        }
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f12 / f11;
    }

    public static final float calculateZoom(@k PointerEvent pointerEvent) {
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f || calculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    @l
    public static final Object detectTransformGestures(@k PointerInputScope pointerInputScope, boolean z11, @k r<? super Offset, ? super Offset, ? super Float, ? super Float, g2> rVar, @k c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TransformGestureDetectorKt$detectTransformGestures$2(z11, rVar, null), cVar);
        return awaitEachGesture == b.l() ? awaitEachGesture : g2.f100423a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z11, r rVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return detectTransformGestures(pointerInputScope, z11, rVar, cVar);
    }
}
