package androidx.compose.ui.input.pointer;

import a00.a0;
import a00.g0;
import a00.h0;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,147:1\n30#2:148\n30#2:152\n30#2:156\n30#2:165\n53#3,3:149\n53#3,3:153\n53#3,3:157\n60#3:161\n70#3:164\n53#3,3:166\n80#3:170\n80#3:172\n80#3:174\n80#3:183\n65#4:160\n69#4:163\n22#5:162\n30#6:169\n30#6:171\n30#6:173\n30#6:182\n1#7:175\n34#8,6:176\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n38#1:148\n42#1:152\n63#1:156\n76#1:165\n38#1:149,3\n42#1:153,3\n63#1:157,3\n76#1:161\n76#1:164\n76#1:166,3\n102#1:170\n119#1:172\n130#1:174\n141#1:183\n76#1:160\n76#1:163\n76#1:162\n102#1:169\n119#1:171\n130#1:173\n141#1:182\n145#1:176,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInputTestUtilKt {
    @k
    public static final PointerInputChange down(long j11, long j12, float f11, float f12, @l List<HistoricalChange> list) {
        PointerInputChange pointerInputChange = new PointerInputChange(PointerId.m3712constructorimpl(j11), j12, Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), true, 1.0f, j12, Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), false, false, 0, 0L, 1536, (v) null);
        List<HistoricalChange> list2 = list;
        return (list2 == null || list2.isEmpty()) ? pointerInputChange : PointerInputChange.m3721copyOHpmEuE$default(pointerInputChange, 0L, 0L, 0L, false, 0L, 0L, false, 0, list, 0L, 767, null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j11, long j12, float f11, float f12, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j12 = 0;
        }
        long j13 = j12;
        float f13 = (i11 & 4) != 0 ? 0.0f : f11;
        float f14 = (i11 & 8) != 0 ? 0.0f : f12;
        if ((i11 & 16) != 0) {
            list = null;
        }
        return down(j11, j13, f13, f14, list);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m3782invokeOverAllPassesH0pRuoY(@k q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, g2> qVar, @k PointerEvent pointerEvent, long j11) {
        m3786invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) h0.Q(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j11);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m3783invokeOverAllPassesH0pRuoY$default(q qVar, PointerEvent pointerEvent, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            long j12 = Integer.MAX_VALUE;
            j11 = IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
        }
        m3782invokeOverAllPassesH0pRuoY(qVar, pointerEvent, j11);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m3784invokeOverPasshUlJWOE(@k q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, g2> qVar, @k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        m3786invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) g0.l(pointerEventPass), j11);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3785invokeOverPasshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            long j12 = Integer.MAX_VALUE;
            j11 = IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
        }
        m3784invokeOverPasshUlJWOE(qVar, pointerEvent, pointerEventPass, j11);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m3787invokeOverPasseshUlJWOE(@k q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, g2> qVar, @k PointerEvent pointerEvent, @k PointerEventPass[] pointerEventPassArr, long j11) {
        m3786invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) a0.dz(pointerEventPassArr), j11);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3789invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            long j12 = Integer.MAX_VALUE;
            j11 = IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
        }
        m3787invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, g2>) qVar, pointerEvent, pointerEventPassArr, j11);
    }

    @k
    public static final PointerInputChange moveBy(@k PointerInputChange pointerInputChange, long j11, float f11, float f12) {
        long m3730getIdJ3iCeTQ = pointerInputChange.m3730getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        long m3732getPositionF1C5BW0 = pointerInputChange.m3732getPositionF1C5BW0();
        long uptimeMillis2 = pointerInputChange.getUptimeMillis() + j11;
        float intBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange.m3732getPositionF1C5BW0() >> 32)) + f11;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange.m3732getPositionF1C5BW0() & 4294967295L)) + f12;
        return new PointerInputChange(m3730getIdJ3iCeTQ, uptimeMillis2, Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), true, 1.0f, uptimeMillis, m3732getPositionF1C5BW0, pressed, false, 0, 0L, 1536, (v) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        return moveBy(pointerInputChange, j11, f11, f12);
    }

    @k
    public static final PointerInputChange moveTo(@k PointerInputChange pointerInputChange, long j11, float f11, float f12) {
        return new PointerInputChange(pointerInputChange.m3730getIdJ3iCeTQ(), j11, Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), true, 1.0f, pointerInputChange.getUptimeMillis(), pointerInputChange.m3732getPositionF1C5BW0(), pointerInputChange.getPressed(), false, 0, 0L, 1536, (v) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j11, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = 0.0f;
        }
        return moveTo(pointerInputChange, j11, f11, f12);
    }

    @k
    public static final PointerInputChange up(@k PointerInputChange pointerInputChange, long j11) {
        long m3730getIdJ3iCeTQ = pointerInputChange.m3730getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m3730getIdJ3iCeTQ, j11, pointerInputChange.m3732getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m3732getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (v) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m3786invokeOverPasseshUlJWOE(@k q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, g2> qVar, @k PointerEvent pointerEvent, @k List<? extends PointerEventPass> list, long j11) {
        if (pointerEvent.getChanges().isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no changes");
        }
        List<? extends PointerEventPass> list2 = list;
        if (list2.isEmpty()) {
            throw new IllegalArgumentException("invokeOverPasses called with no passes");
        }
        int size = list2.size();
        for (int i11 = 0; i11 < size; i11++) {
            qVar.invoke(pointerEvent, list.get(i11), IntSize.m5278boximpl(j11));
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m3788invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, List list, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            long j12 = Integer.MAX_VALUE;
            j11 = IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
        }
        m3786invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, g2>) qVar, pointerEvent, (List<? extends PointerEventPass>) list, j11);
    }
}
