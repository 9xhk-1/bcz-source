package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import c40.l2;
import c40.r0;
import c40.s0;
import j00.c;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,550:1\n34#2,6:551\n102#2,2:557\n34#2,6:559\n104#2:565\n87#2,2:566\n34#2,6:568\n89#2:574\n87#2,2:575\n34#2,6:577\n89#2:583\n87#2,2:584\n34#2,6:586\n89#2:592\n102#2,2:593\n34#2,6:595\n104#2:601\n102#2,2:602\n34#2,6:604\n104#2:610\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n210#1:551,6\n211#1:557,2\n211#1:559,6\n211#1:565\n321#1:566,2\n321#1:568,6\n321#1:574\n324#1:575,2\n324#1:577,6\n324#1:583\n353#1:584,2\n353#1:586,6\n353#1:592\n359#1:593,2\n359#1:595,6\n359#1:601\n367#1:602,2\n367#1:604,6\n367#1:610\n*E\n"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {

    @k
    private static final q<PressGestureScope, Offset, c<? super g2>, Object> NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z11, c cVar) {
        return awaitFirstDown(awaitPointerEventScope, z11, PointerEventPass.Main, cVar);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z11, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z11, cVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:10:0x0051). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitPrimaryFirstDown(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, boolean r6, @m80.k androidx.compose.ui.input.pointer.PointerEventPass r7, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r5 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.e.n(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L51
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.e.n(r8)
        L42:
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            boolean r2 = isChangedToDown(r8, r6, r3)
            if (r2 == 0) goto L42
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitPrimaryFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z11, PointerEventPass pointerEventPass, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPrimaryFirstDown(awaitPointerEventScope, z11, pointerEventPass, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, c<? super PointerInputChange> cVar) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[LOOP:0: B:11:0x0053->B:12:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.e.n(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.e.n(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L53:
            if (r6 >= r4) goto L61
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L53
        L61:
            java.util.List r9 = r9.getChanges()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L6c:
            if (r5 >= r2) goto L7e
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L7b
            goto L38
        L7b:
            int r5 = r5 + 1
            goto L6c
        L7e:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, j00.c):java.lang.Object");
    }

    @l
    public static final Object detectTapAndPress(@k PointerInputScope pointerInputScope, @k q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, @l x00.l<? super Offset, g2> lVar, @k c<? super g2> cVar) {
        Object g11 = s0.g(new TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, qVar, lVar, new PressGestureScopeImpl(pointerInputScope), null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, q qVar, x00.l lVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = NoPressGesture;
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        return detectTapAndPress(pointerInputScope, qVar, lVar, cVar);
    }

    @l
    public static final Object detectTapGestures(@k PointerInputScope pointerInputScope, @l x00.l<? super Offset, g2> lVar, @l x00.l<? super Offset, g2> lVar2, @k q<? super PressGestureScope, ? super Offset, ? super c<? super g2>, ? extends Object> qVar, @l x00.l<? super Offset, g2> lVar3, @k c<? super g2> cVar) {
        Object g11 = s0.g(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, qVar, lVar2, lVar, lVar3, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, x00.l lVar, x00.l lVar2, q qVar, x00.l lVar3, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        if ((i11 & 2) != 0) {
            lVar2 = null;
        }
        if ((i11 & 4) != 0) {
            qVar = NoPressGesture;
        }
        if ((i11 & 8) != 0) {
            lVar3 = null;
        }
        return detectTapGestures(pointerInputScope, lVar, lVar2, qVar, lVar3, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineStart getCoroutineStartForCurrentDispatchBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT;
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    public static final boolean getDetectTapGesturesEnableNewDispatchingBehavior() {
        return ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled;
    }

    private static final boolean isChangedToDown(PointerEvent pointerEvent, boolean z11, boolean z12) {
        if (z12) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (!PointerType.m3803equalsimpl0(changes.get(i11).m3735getTypeT8wyACA(), PointerType.Companion.m3808getMouseT8wyACA())) {
                        break;
                    }
                    i11++;
                } else if (!PointerEvent_androidKt.m3705isPrimaryPressedaHzCxE(pointerEvent.m3672getButtonsry648PA())) {
                    return false;
                }
            }
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            PointerInputChange pointerInputChange = changes2.get(i12);
            if (!(z11 ? PointerEventKt.changedToDown(pointerInputChange) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean isChangedToDown$default(PointerEvent pointerEvent, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = TapGestureDetector_androidKt.firstDownRefersToPrimaryMouseButtonOnly();
        }
        return isChangedToDown(pointerEvent, z11, z12);
    }

    private static final l2 launchAwaitingReset(r0 r0Var, l2 l2Var, CoroutineStart coroutineStart, p<? super r0, ? super c<? super g2>, ? extends Object> pVar) {
        l2 f11;
        f11 = c40.k.f(r0Var, null, coroutineStart, new TapGestureDetectorKt$launchAwaitingReset$1(l2Var, pVar, null), 1, null);
        return f11;
    }

    public static /* synthetic */ l2 launchAwaitingReset$default(r0 r0Var, l2 l2Var, CoroutineStart coroutineStart, p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            coroutineStart = getCoroutineStartForCurrentDispatchBehavior();
        }
        return launchAwaitingReset(r0Var, l2Var, coroutineStart, pVar);
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    public static final void setDetectTapGesturesEnableNewDispatchingBehavior(boolean z11) {
        ComposeFoundationFlags composeFoundationFlags = ComposeFoundationFlags.INSTANCE;
        ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForLongPress(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, @m80.k androidx.compose.ui.input.pointer.PointerEventPass r8, @m80.k j00.c<? super androidx.compose.foundation.gestures.LongPressResult> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            kotlin.e.n(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            goto L5b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            androidx.compose.foundation.gestures.LongPressResult$Canceled r2 = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE
            r9.element = r2
            androidx.compose.ui.platform.ViewConfiguration r2 = r7.getViewConfiguration()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            long r4 = r2.getLongPressTimeoutMillis()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.L$0 = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            java.lang.Object r7 = r7.withTimeout(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5e
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r7 = r9
        L5b:
            T r7 = r7.element
            return r7
        L5e:
            androidx.compose.foundation.gestures.LongPressResult$Success r7 = androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForLongPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object waitForLongPress$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, cVar);
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, cVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:10:0x0051). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstDown(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, boolean r8, @m80.k androidx.compose.ui.input.pointer.PointerEventPass r9, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.e.n(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L51
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.e.n(r10)
        L42:
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r10 = r7.awaitPointerEvent(r9, r0)
            if (r10 != r1) goto L51
            return r1
        L51:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = isChangedToDown$default(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L42
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z11, PointerEventPass pointerEventPass, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z11, pointerEventPass, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        if (r0 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:11:0x0037). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForUpOrCancellation(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, @m80.k androidx.compose.ui.input.pointer.PointerEventPass r18, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, j00.c):java.lang.Object");
    }

    private static /* synthetic */ void getCoroutineStartForCurrentDispatchBehavior$annotations() {
    }

    @ExperimentalTapGestureDetectorBehaviorApi
    @n(message = "This flag has been moved to ComposeFoundationFlags and renamed to isDetectTapGesturesImmediateCoroutineDispatchEnabled. For compatibility,  DetectTapGesturesEnableNewDispatchingBehavior controls the new flag (isDetectTapGesturesImmediateCoroutineDispatchEnabled). Please use  isDetectTapGesturesImmediateCoroutineDispatchEnabled instead.", replaceWith = @w0(expression = "isDetectTapGesturesImmediateCoroutineDispatchEnabled", imports = {"androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled"}))
    public static /* synthetic */ void getDetectTapGesturesEnableNewDispatchingBehavior$annotations() {
    }
}
