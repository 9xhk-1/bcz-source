package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPointerInteropUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropUtils.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropUtils_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,79:1\n1#2:80\n65#3:81\n69#3:84\n65#3:86\n69#3:89\n60#4:82\n70#4:85\n60#4:87\n70#4:90\n22#5:83\n22#5:88\n*S KotlinDebug\n*F\n+ 1 PointerInteropUtils.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropUtils_androidKt\n*L\n70#1:81\n70#1:84\n74#1:86\n74#1:89\n70#1:82\n70#1:85\n74#1:87\n74#1:90\n70#1:83\n74#1:88\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInteropUtils_androidKt {
    public static final void emptyCancelMotionEventScope(long j11, @k l<? super MotionEvent, g2> lVar) {
        MotionEvent obtain = MotionEvent.obtain(j11, j11, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long j11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = SystemClock.uptimeMillis();
        }
        emptyCancelMotionEventScope(j11, lVar);
    }

    /* renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m3790toCancelMotionEventScoped4ec7I(@k PointerEvent pointerEvent, long j11, @k l<? super MotionEvent, g2> lVar) {
        m3792toMotionEventScopeubNVwUQ(pointerEvent, j11, lVar, true);
    }

    /* renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m3791toMotionEventScoped4ec7I(@k PointerEvent pointerEvent, long j11, @k l<? super MotionEvent, g2> lVar) {
        m3792toMotionEventScopeubNVwUQ(pointerEvent, j11, lVar, false);
    }

    /* renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m3792toMotionEventScopeubNVwUQ(PointerEvent pointerEvent, long j11, l<? super MotionEvent, g2> lVar, boolean z11) {
        MotionEvent motionEvent$ui_release = pointerEvent.getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent$ui_release.getAction();
        if (z11) {
            motionEvent$ui_release.setAction(3);
        }
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        motionEvent$ui_release.offsetLocation(-Float.intBitsToFloat(i11), -Float.intBitsToFloat(i12));
        lVar.invoke(motionEvent$ui_release);
        motionEvent$ui_release.offsetLocation(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
        motionEvent$ui_release.setAction(action);
    }
}
