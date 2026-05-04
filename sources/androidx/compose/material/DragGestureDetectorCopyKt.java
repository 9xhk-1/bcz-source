package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import j00.c;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,116:1\n54#1,10:117\n64#1,4:136\n68#1,29:147\n116#2,2:127\n33#2,6:129\n118#2:135\n33#2,6:140\n118#2:146\n116#2,2:176\n33#2,6:178\n118#2:184\n116#2,2:185\n33#2,6:187\n118#2:193\n116#2,2:194\n33#2,6:196\n118#2:202\n159#3:203\n149#3:204\n78#4:205\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n*L\n41#1:117,10\n41#1:136,4\n41#1:147,29\n41#1:127,2\n41#1:129,6\n41#1:135\n41#1:140,6\n41#1:146\n63#1:176,2\n63#1:178,6\n63#1:184\n67#1:185,2\n67#1:187,6\n67#1:193\n104#1:194,2\n104#1:196,6\n104#1:202\n106#1:203\n107#1:204\n108#1:205\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m5115constructorimpl = Dp.m5115constructorimpl((float) 0.125d);
        mouseSlop = m5115constructorimpl;
        float m5115constructorimpl2 = Dp.m5115constructorimpl(18);
        defaultTouchSlop = m5115constructorimpl2;
        mouseToTouchSlopRatio = m5115constructorimpl / m5115constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0123 -> B:13:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0163 -> B:11:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0180 -> B:13:0x012b). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1644awaitHorizontalPointerSlopOrCancellationgDDlDlE(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, @m80.k x00.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, yz.g2> r24, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopyKt.m1644awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, x00.p, j00.c):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m1645awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j11, int i11, p<? super PointerInputChange, ? super Float, g2> pVar, l<? super Offset, Float> lVar, c<? super PointerInputChange> cVar) {
        float f11;
        int i12;
        int i13;
        PointerInputChange pointerInputChange;
        float f12;
        PointerInputChange pointerInputChange2;
        if (m1646isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j11)) {
            return null;
        }
        float m1647pointerSlopE8SPZFQ = m1647pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i11);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j11;
        float f13 = 0.0f;
        while (true) {
            int i14 = 0;
            d0.e(0);
            int i15 = 1;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, cVar, 1, null);
            d0.e(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size) {
                    f11 = f13;
                    i12 = i14;
                    i13 = i15;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i16);
                f11 = f13;
                i12 = i14;
                i13 = i15;
                if (Boolean.valueOf(PointerId.m3714equalsimpl0(pointerInputChange.m3730getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i16++;
                f13 = f11;
                i14 = i12;
                i15 = i13;
            }
            g0.m(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i17 = i12;
                while (true) {
                    if (i17 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i17);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i17++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.m3730getIdJ3iCeTQ();
                f12 = f11;
            } else {
                float floatValue = f11 + (lVar.invoke(Offset.m2257boximpl(pointerInputChange3.m3732getPositionF1C5BW0())).floatValue() - lVar.invoke(Offset.m2257boximpl(pointerInputChange3.m3733getPreviousPositionF1C5BW0())).floatValue());
                if (Math.abs(floatValue) < m1647pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    d0.e(i12);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, cVar);
                    d0.e(i13);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f12 = floatValue;
                } else {
                    pVar.invoke(pointerInputChange3, Float.valueOf(floatValue - (Math.signum(floatValue) * m1647pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f12 = 0.0f;
                    f13 = f12;
                }
            }
            f13 = f12;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m1646isPointerUpDmW0f2w(PointerEvent pointerEvent, long j11) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i11);
            if (PointerId.m3714equalsimpl0(pointerInputChange.m3730getIdJ3iCeTQ(), j11)) {
                break;
            }
            i11++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z11 = true;
        }
        return true ^ z11;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m1647pointerSlopE8SPZFQ(@k ViewConfiguration viewConfiguration, int i11) {
        return PointerType.m3803equalsimpl0(i11, PointerType.Companion.m3808getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }
}
