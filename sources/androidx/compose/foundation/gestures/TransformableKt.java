package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import e40.o;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n329#2:400\n1#3:401\n34#4,6:402\n102#4,2:408\n34#4,6:410\n104#4:416\n34#4,6:417\n102#4,2:423\n34#4,6:425\n104#4:431\n102#4,2:432\n34#4,6:434\n104#4:440\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n268#1:400\n322#1:402,6\n340#1:408,2\n340#1:410,6\n340#1:416\n376#1:417,6\n387#1:423,2\n387#1:425,6\n387#1:431\n388#1:432,2\n388#1:434,6\n388#1:440\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitCtrlMouseScrollOrNull(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, j00.c<? super androidx.compose.ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.gestures.ScrollConfig r6 = (androidx.compose.foundation.gestures.ScrollConfig) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.e.n(r7)
            goto L4b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e.n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r5, r3, r0, r4, r3)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            int r0 = r7.m3673getKeyboardModifiersk7X9c1A()
            boolean r0 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m3699isCtrlPressed5xRPYO0(r0)
            if (r0 == 0) goto L9c
            int r0 = r7.m3674getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r1 = androidx.compose.ui.input.pointer.PointerEventType.Companion
            int r1 = r1.m3690getScroll7fucELk()
            boolean r0 = androidx.compose.ui.input.pointer.PointerEventType.m3681equalsimpl0(r0, r1)
            if (r0 != 0) goto L68
            goto L9c
        L68:
            long r0 = r5.mo3641getSizeYbymL2g()
            long r5 = r6.mo399calculateMouseWheelScroll8xgXZGE(r5, r7, r0)
            androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
            long r0 = r0.m2284getZeroF1C5BW0()
            boolean r0 = androidx.compose.ui.geometry.Offset.m2265equalsimpl0(r5, r0)
            if (r0 == 0) goto L7d
            return r3
        L7d:
            java.util.List r7 = r7.getChanges()
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
        L89:
            if (r1 >= r0) goto L97
            java.lang.Object r2 = r7.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
            r2.consume()
            int r1 = r1 + 1
            goto L89
        L97:
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m2257boximpl(r5)
            return r5
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitCtrlMouseScrollOrNull(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, j00.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0049 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, j00.c<? super androidx.compose.ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.L$1
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.e.n(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L4c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.e.n(r7)
        L3f:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = awaitCtrlMouseScrollOrNull(r5, r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            if (r7 == 0) goto L3f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.awaitFirstCtrlMouseScroll(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02c0, code lost:
    
        if (r6 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02c2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020e, code lost:
    
        if (r13.invoke(androidx.compose.ui.geometry.Offset.m2257boximpl(r9)).booleanValue() != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c7 A[EDGE_INSN: B:99:0x02c7->B:98:0x02c7 BREAK  A[LOOP:0: B:14:0x02b2->B:17:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0294 -> B:13:0x02a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r29, boolean r30, e40.o<androidx.compose.foundation.gestures.TransformEvent> r31, x00.l<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> r32, j00.c<? super yz.g2> r33) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, e40.o, x00.l, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectZoomByCtrlMouseScroll(PointerInputScope pointerInputScope, o<TransformEvent> oVar, ScrollConfig scrollConfig, c<? super g2> cVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new TransformableKt$detectZoomByCtrlMouseScroll$2(cVar.getContext(), scrollConfig, oVar, null), cVar);
        return awaitPointerEventScope == b.l() ? awaitPointerEventScope : g2.f100423a;
    }

    @k
    public static final Modifier transformable(@k Modifier modifier, @k TransformableState transformableState, boolean z11, boolean z12) {
        return transformable(modifier, transformableState, new l<Offset, Boolean>() { // from class: androidx.compose.foundation.gestures.TransformableKt$transformable$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Offset offset) {
                return m529invokek4lQ0M(offset.m2278unboximpl());
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final Boolean m529invokek4lQ0M(long j11) {
                return Boolean.TRUE;
            }
        }, z11, z12);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return transformable(modifier, transformableState, z11, z12);
    }

    @k
    public static final Modifier transformable(@k Modifier modifier, @k TransformableState transformableState, @k l<? super Offset, Boolean> lVar, boolean z11, boolean z12) {
        return modifier.then(new TransformableElement(transformableState, lVar, z11, z12));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, l lVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return transformable(modifier, transformableState, lVar, z11, z12);
    }
}
