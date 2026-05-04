package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import w00.j;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,465:1\n1247#2,6:466\n1247#2,6:472\n1247#2,6:478\n1247#2,6:484\n1247#2,6:490\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:466,6\n33#1:472,6\n47#1:478,6\n65#1:484,6\n85#1:490,6\n*E\n"})
/* loaded from: classes.dex */
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(x00.a<? extends T> aVar, l<? super Updater<T>, g2> lVar, Composer composer, int i11) {
        Applier<?> applier = composer.getApplier();
        g0.y(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1950boximpl(Updater.m1951constructorimpl(composer)));
        composer.endNode();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(x00.a<? extends T> aVar, l<? super Updater<T>, g2> lVar, Composer composer, int i11) {
        Applier<?> applier = composer.getApplier();
        g0.y(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1950boximpl(Updater.m1951constructorimpl(composer)));
        composer.endNode();
    }

    @Composable
    public static final void ReusableContent(@m80.l Object obj, @k p<? super Composer, ? super Integer, g2> pVar, @m80.l Composer composer, int i11) {
        composer.startReusableGroup(207, obj);
        pVar.invoke(composer, Integer.valueOf((i11 >> 3) & 14));
        composer.endReusableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z11, @k p<? super Composer, ? super Integer, g2> pVar, @m80.l Composer composer, int i11) {
        composer.startReusableGroup(207, Boolean.valueOf(z11));
        boolean changed = composer.changed(z11);
        if (z11) {
            pVar.invoke(composer, Integer.valueOf((i11 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(changed);
        }
        composer.endReusableGroup();
    }

    @j(name = "getCurrentComposer")
    @k
    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i11, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:172)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @j(name = "getCurrentCompositeKeyHash")
    @Composable
    public static final int getCurrentCompositeKeyHash(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i11, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:213)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @j(name = "getCurrentCompositionLocalContext")
    @Composable
    @k
    public static final CompositionLocalContext getCurrentCompositionLocalContext(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i11, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:199)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositionLocalContext;
    }

    @j(name = "getCurrentRecomposeScope")
    @k
    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i11, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:184)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    @v0
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(@k Object[] objArr, @k p<? super Composer, ? super Integer, ? extends T> pVar, @m80.l Composer composer, int i11) {
        return pVar.invoke(composer, Integer.valueOf((i11 >> 3) & 14));
    }

    @Composable
    public static final <T> T remember(@m80.l Object obj, @k x00.a<? extends T> aVar, @m80.l Composer composer, int i11) {
        boolean changed = composer.changed(obj);
        T t11 = (T) composer.rememberedValue();
        if (!changed && t11 != Composer.Companion.getEmpty()) {
            return t11;
        }
        T invoke = aVar.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    @Composable
    @k
    public static final CompositionContext rememberCompositionContext(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i11, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:461)");
        }
        CompositionContext buildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buildContext;
    }

    @Composable
    public static final <T> T remember(@m80.l Object obj, @m80.l Object obj2, @k x00.a<? extends T> aVar, @m80.l Composer composer, int i11) {
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        T t11 = (T) composer.rememberedValue();
        if (!changed && t11 != Composer.Companion.getEmpty()) {
            return t11;
        }
        T invoke = aVar.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(x00.a<? extends T> aVar, l<? super Updater<T>, g2> lVar, p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
        Applier<?> applier = composer.getApplier();
        g0.y(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1950boximpl(Updater.m1951constructorimpl(composer)));
        pVar.invoke(composer, Integer.valueOf((i11 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(x00.a<? extends T> aVar, l<? super Updater<T>, g2> lVar, p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
        Applier<?> applier = composer.getApplier();
        g0.y(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1950boximpl(Updater.m1951constructorimpl(composer)));
        pVar.invoke(composer, Integer.valueOf((i11 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(@m80.l Object obj, @m80.l Object obj2, @m80.l Object obj3, @k x00.a<? extends T> aVar, @m80.l Composer composer, int i11) {
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t11 = (T) composer.rememberedValue();
        if (!changed && t11 != Composer.Companion.getEmpty()) {
            return t11;
        }
        T invoke = aVar.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(x00.a<? extends T> aVar, l<? super Updater<T>, g2> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, g2> qVar, p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
        Applier<?> applier = composer.getApplier();
        g0.y(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1950boximpl(Updater.m1951constructorimpl(composer)));
        qVar.invoke(SkippableUpdater.m1924boximpl(SkippableUpdater.m1925constructorimpl(composer)), composer, Integer.valueOf((i11 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i11 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(x00.a<? extends T> aVar, l<? super Updater<T>, g2> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, g2> qVar, p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
        Applier<?> applier = composer.getApplier();
        g0.y(3, ExifInterface.LONGITUDE_EAST);
        if (applier == null) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(aVar);
        } else {
            composer.useNode();
        }
        lVar.invoke(Updater.m1950boximpl(Updater.m1951constructorimpl(composer)));
        qVar.invoke(SkippableUpdater.m1924boximpl(SkippableUpdater.m1925constructorimpl(composer)), composer, Integer.valueOf((i11 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(composer, Integer.valueOf((i11 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    public static final <T> T remember(@k Object[] objArr, @k x00.a<? extends T> aVar, @m80.l Composer composer, int i11) {
        boolean z11 = false;
        for (Object obj : objArr) {
            z11 |= composer.changed(obj);
        }
        T t11 = (T) composer.rememberedValue();
        if (!z11 && t11 != Composer.Companion.getEmpty()) {
            return t11;
        }
        T invoke = aVar.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    @Composable
    public static final <T> T remember(@k x00.a<? extends T> aVar, @m80.l Composer composer, int i11) {
        T t11 = (T) composer.rememberedValue();
        if (t11 != Composer.Companion.getEmpty()) {
            return t11;
        }
        T invoke = aVar.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }
}
