package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,391:1\n557#2:392\n554#2,6:393\n1247#3,3:399\n1250#3,3:403\n1247#3,6:408\n555#4:402\n75#5:406\n75#5:407\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n89#1:392\n89#1:393,6\n89#1:399,3\n89#1:403,3\n188#1:408,6\n89#1:402\n90#1:406\n91#1:407\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0342  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyList(@m80.k final androidx.compose.ui.Modifier r29, @m80.k final androidx.compose.foundation.lazy.LazyListState r30, @m80.k final androidx.compose.foundation.layout.PaddingValues r31, final boolean r32, final boolean r33, @m80.k final androidx.compose.foundation.gestures.FlingBehavior r34, final boolean r35, @m80.l final androidx.compose.foundation.OverscrollEffect r36, int r37, @m80.l androidx.compose.ui.Alignment.Horizontal r38, @m80.l androidx.compose.foundation.layout.Arrangement.Vertical r39, @m80.l androidx.compose.ui.Alignment.Vertical r40, @m80.l androidx.compose.foundation.layout.Arrangement.Horizontal r41, @m80.k final x00.l<? super androidx.compose.foundation.lazy.LazyListScope, yz.g2> r42, @m80.l androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.OverscrollEffect, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r34.changed(r4) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r34.changed(r9) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r34.changed(r12) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r34.changed(r13) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        if (r34.changed(r14) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
    
        if (r34.changed(r5) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008c  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final x00.p<androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> rememberLazyListMeasurePolicy(final x00.a<? extends androidx.compose.foundation.lazy.LazyListItemProvider> r21, final androidx.compose.foundation.lazy.LazyListState r22, final androidx.compose.foundation.layout.PaddingValues r23, final boolean r24, boolean r25, final int r26, androidx.compose.ui.Alignment.Horizontal r27, androidx.compose.ui.Alignment.Vertical r28, androidx.compose.foundation.layout.Arrangement.Horizontal r29, androidx.compose.foundation.layout.Arrangement.Vertical r30, final c40.r0 r31, final androidx.compose.ui.graphics.GraphicsContext r32, androidx.compose.foundation.lazy.layout.StickyItemsPlacement r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListKt.rememberLazyListMeasurePolicy(x00.a, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, int, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, c40.r0, androidx.compose.ui.graphics.GraphicsContext, androidx.compose.foundation.lazy.layout.StickyItemsPlacement, androidx.compose.runtime.Composer, int, int):x00.p");
    }
}
