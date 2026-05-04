package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n34#2,6:450\n34#2,6:456\n34#2,6:462\n34#2,6:468\n34#2,6:474\n34#2,6:480\n34#2,6:486\n87#2,2:492\n34#2,6:494\n89#2:500\n87#2,2:501\n34#2,6:503\n89#2:509\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n136#1:450,6\n166#1:456,6\n191#1:462,6\n248#1:468,6\n329#1:474,6\n364#1:480,6\n392#1:486,6\n431#1:492,2\n431#1:494,6\n431#1:500\n448#1:501,2\n448#1:503,6\n448#1:509\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    private static final int STATIC_KEY = 8675309;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, j00.c<? super androidx.compose.ui.input.pointer.PointerEvent> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.e.n(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.e.n(r8)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r2 = r8.getChanges()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L53:
            if (r5 >= r4) goto L65
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r6)
            if (r6 != 0) goto L62
            goto L38
        L62:
            int r5 = r5 + 1
            goto L53
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean distanceIsTolerable(ViewConfiguration viewConfiguration, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return Offset.m2266getDistanceimpl(Offset.m2272minusMKHz9U(pointerInputChange.m3732getPositionF1C5BW0(), pointerInputChange2.m3732getPositionF1C5BW0())) < DragGestureDetectorKt.m436pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.m3735getTypeT8wyACA());
    }

    public static final boolean isPrecisePointer(@k PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!PointerType.m3803equalsimpl0(changes.get(i11).m3735getTypeT8wyACA(), PointerType.Companion.m3808getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0131 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:12:0x0035, B:13:0x0114, B:15:0x011c, B:17:0x0120, B:19:0x0131, B:21:0x013d, B:62:0x00e5), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:34:0x004e, B:35:0x008b, B:37:0x0093, B:39:0x00a4, B:41:0x00b0, B:52:0x0071), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.selection.MouseSelectionObserver r9, androidx.compose.foundation.text.selection.ClicksCounter r10, androidx.compose.ui.input.pointer.PointerEvent r11, j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelectionBtf2(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, j00.c):java.lang.Object");
    }

    @k
    public static final Modifier selectionGestureInput(@k Modifier modifier, @k final MouseSelectionObserver mouseSelectionObserver, @k final TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {107, 113, 115}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
            @u0({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,449:1\n87#2,2:450\n34#2,6:452\n89#2:458\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$selectionGestureInput$1$1\n*L\n111#1:450,2\n111#1:452,6\n111#1:458\n*E\n"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
                final /* synthetic */ ClicksCounter $clicksCounter;
                final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
                final /* synthetic */ TextDragObserver $textDragObserver;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(MouseSelectionObserver mouseSelectionObserver, ClicksCounter clicksCounter, TextDragObserver textDragObserver, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$mouseSelectionObserver = mouseSelectionObserver;
                    this.$clicksCounter = clicksCounter;
                    this.$textDragObserver = textDragObserver;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mouseSelectionObserver, this.$clicksCounter, this.$textDragObserver, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
                
                    if (r10 == r0) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
                
                    if (r10 == r0) goto L32;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0037, code lost:
                
                    if (r10 == r0) goto L32;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r9.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r4) goto L1f
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L12
                        goto L1a
                    L12:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L1a:
                        kotlin.e.n(r10)
                        goto L8d
                    L1f:
                        java.lang.Object r1 = r9.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.e.n(r10)
                        goto L3a
                    L27:
                        kotlin.e.n(r10)
                        java.lang.Object r10 = r9.L$0
                        r1 = r10
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        r9.L$0 = r1
                        r9.label = r4
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(r1, r9)
                        if (r10 != r0) goto L3a
                        goto L8c
                    L3a:
                        androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                        boolean r4 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        r5 = 0
                        if (r4 == 0) goto L7a
                        int r4 = r10.m3672getButtonsry648PA()
                        boolean r4 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m3705isPrimaryPressedaHzCxE(r4)
                        if (r4 == 0) goto L7a
                        java.util.List r4 = r10.getChanges()
                        r6 = r4
                        java.util.Collection r6 = (java.util.Collection) r6
                        int r6 = r6.size()
                        r7 = 0
                    L59:
                        if (r7 >= r6) goto L6b
                        java.lang.Object r8 = r4.get(r7)
                        androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                        boolean r8 = r8.isConsumed()
                        if (r8 == 0) goto L68
                        goto L7a
                    L68:
                        int r7 = r7 + 1
                        goto L59
                    L6b:
                        androidx.compose.foundation.text.selection.MouseSelectionObserver r2 = r9.$mouseSelectionObserver
                        androidx.compose.foundation.text.selection.ClicksCounter r4 = r9.$clicksCounter
                        r9.L$0 = r5
                        r9.label = r3
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$mouseSelection(r1, r2, r4, r10, r9)
                        if (r10 != r0) goto L8d
                        goto L8c
                    L7a:
                        boolean r3 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r10)
                        if (r3 != 0) goto L8d
                        androidx.compose.foundation.text.TextDragObserver r3 = r9.$textDragObserver
                        r9.L$0 = r5
                        r9.label = r2
                        java.lang.Object r10 = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$touchSelection(r1, r3, r10, r9)
                        if (r10 != r0) goto L8d
                    L8c:
                        return r0
                    L8d:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(MouseSelectionObserver.this, new ClicksCounter(pointerInputScope.getViewConfiguration()), textDragObserver, null), cVar);
                return awaitEachGesture == kotlin.coroutines.intrinsics.b.l() ? awaitEachGesture : g2.f100423a;
            }
        });
    }

    @l
    public static final Object selectionGesturePointerInputBtf2(@k PointerInputScope pointerInputScope, @k MouseSelectionObserver mouseSelectionObserver, @k TextDragObserver textDragObserver, @k j00.c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionGesturesKt$selectionGesturePointerInputBtf2$2(new ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), cVar);
        return awaitEachGesture == kotlin.coroutines.intrinsics.b.l() ? awaitEachGesture : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, j00.c<? super yz.g2> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.e.n(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld7
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.e.n(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            kotlin.e.n(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = a00.r0.G2(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.m3730getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m423awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            goto La0
        L73:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld4
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld4
            long r4 = r11.m3732getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.mo1134onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.m3730getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m433dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb9:
            if (r11 >= r10) goto Lcd
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lca
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L35
        Lca:
            int r11 = r11 + 1
            goto Lb9
        Lcd:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld4
        Ld1:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld4:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        Ld7:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r11 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, final androidx.compose.foundation.text.TextDragObserver r9, androidx.compose.ui.input.pointer.PointerEvent r10, j00.c<? super yz.g2> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.L$1
            r9 = r8
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.e.n(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld7
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            java.lang.Object r9 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r9 = (androidx.compose.foundation.text.TextDragObserver) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            kotlin.e.n(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            kotlin.e.n(r11)
            java.util.List r10 = r10.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = a00.r0.G2(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.m3730getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$2 = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m423awaitLongPressOrCancellationrnUCldI(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            goto La0
        L73:
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld4
            androidx.compose.ui.platform.ViewConfiguration r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = distanceIsTolerable(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld4
            long r4 = r11.m3732getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.mo1134onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.m3730getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$dragCompletedWithUp$1     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m433dragjO51t88(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
        La0:
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            androidx.compose.ui.input.pointer.PointerEvent r8 = r8.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.getChanges()     // Catch: java.util.concurrent.CancellationException -> L35
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb9:
            if (r11 >= r10) goto Lcd
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lca
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> L35
        Lca:
            int r11 = r11 + 1
            goto Lb9
        Lcd:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld4
        Ld1:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld4:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        Ld7:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        if (r15 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[Catch: CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00df, B:15:0x00e7, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a2, B:37:0x00a6, B:38:0x00a8, B:40:0x00ac, B:42:0x00af, B:44:0x00ba, B:46:0x00c0, B:48:0x00c4, B:49:0x00c9, B:58:0x0066), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00df, B:15:0x00e7, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a2, B:37:0x00a6, B:38:0x00a8, B:40:0x00ac, B:42:0x00af, B:44:0x00ba, B:46:0x00c0, B:48:0x00c4, B:49:0x00c9, B:58:0x0066), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[Catch: CancellationException -> 0x0037, TryCatch #1 {CancellationException -> 0x0037, blocks: (B:12:0x0032, B:13:0x00df, B:15:0x00e7, B:17:0x00f9, B:19:0x0105, B:21:0x0108, B:24:0x010b, B:28:0x010f, B:35:0x00a2, B:37:0x00a6, B:38:0x00a8, B:40:0x00ac, B:42:0x00af, B:44:0x00ba, B:46:0x00c0, B:48:0x00c4, B:49:0x00c9, B:58:0x0066), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, final androidx.compose.foundation.text.TextDragObserver r13, androidx.compose.ui.input.pointer.PointerEvent r14, j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionSubsequentPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, j00.c):java.lang.Object");
    }

    @k
    public static final Modifier updateSelectionTouchMode(@k Modifier modifier, @k final x00.l<? super Boolean, g2> lVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
                final /* synthetic */ x00.l<Boolean, g2> $updateTouchMode;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(x00.l<? super Boolean, g2> lVar, j00.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$updateTouchMode = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$updateTouchMode, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // x00.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002f A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.e.n(r5)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.e.n(r5)
                        java.lang.Object r5 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                        x00.l<java.lang.Boolean, yz.g2> r3 = r4.$updateTouchMode
                        boolean r5 = androidx.compose.foundation.text.selection.SelectionGesturesKt.isPrecisePointer(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = l00.a.a(r5)
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(lVar, null), cVar);
                return awaitPointerEventScope == kotlin.coroutines.intrinsics.b.l() ? awaitPointerEventScope : g2.f100423a;
            }
        });
    }
}
