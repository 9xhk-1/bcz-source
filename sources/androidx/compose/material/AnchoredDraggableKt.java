package androidx.compose.material;

import a00.l1;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import j00.c;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    @ExperimentalMaterialApi
    @k
    public static final <T> DraggableAnchors<T> DraggableAnchors(@k l<? super DraggableAnchorsConfig<T>, g2> lVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        lVar.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material_release());
    }

    @ExperimentalMaterialApi
    @k
    public static final <T> Modifier anchoredDraggable(@k Modifier modifier, @k AnchoredDraggableState<T> anchoredDraggableState, @k Orientation orientation, boolean z11, boolean z12, @m80.l MutableInteractionSource mutableInteractionSource, boolean z13) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState$material_release(), orientation, z11, mutableInteractionSource, z13, null, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z12, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z14 = z11;
        if ((i11 & 8) != 0) {
            z12 = false;
        }
        boolean z15 = z12;
        if ((i11 & 16) != 0) {
            mutableInteractionSource = null;
        }
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        if ((i11 & 32) != 0) {
            z13 = anchoredDraggableState.isAnimationRunning();
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z14, z15, mutableInteractionSource2, z13);
    }

    @m80.l
    @ExperimentalMaterialApi
    public static final <T> Object animateTo(@k AnchoredDraggableState<T> anchoredDraggableState, T t11, float f11, @k c<? super g2> cVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t11, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f11, null), cVar, 2, null);
        return anchoredDrag$default == b.l() ? anchoredDrag$default : g2.f100423a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f11, c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            f11 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f11, cVar);
    }

    @ExperimentalMaterialApi
    @k
    public static final <T> Modifier draggableAnchors(@k Modifier modifier, @k AnchoredDraggableState<T> anchoredDraggableState, @k Orientation orientation, @k p<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> pVar) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, pVar, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(l1.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(x00.a<? extends I> r4, x00.p<? super I, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r5, j00.c<? super yz.g2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            androidx.compose.material.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = c40.s0.g(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt.restartable(x00.a, x00.p, j00.c):java.lang.Object");
    }

    @m80.l
    @ExperimentalMaterialApi
    public static final <T> Object snapTo(@k AnchoredDraggableState<T> anchoredDraggableState, T t11, @k c<? super g2> cVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t11, null, new AnchoredDraggableKt$snapTo$2(null), cVar, 2, null);
        return anchoredDrag$default == b.l() ? anchoredDrag$default : g2.f100423a;
    }
}
