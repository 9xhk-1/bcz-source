package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1247#2,6:182\n1#3:188\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n*L\n171#1:182,6\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableLambdaN_jvmKt {
    @ComposeCompilerApi
    @k
    public static final ComposableLambdaN composableLambdaN(@k Composer composer, int i11, boolean z11, int i12, @k Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl;
        composer.startReplaceableGroup(i11);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaNImpl = new ComposableLambdaNImpl(i11, z11, i12);
            composer.updateRememberedValue(composableLambdaNImpl);
        } else {
            g0.n(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaNImpl = (ComposableLambdaNImpl) rememberedValue;
        }
        composableLambdaNImpl.update(obj);
        composer.endReplaceableGroup();
        return composableLambdaNImpl;
    }

    @ComposeCompilerApi
    @k
    public static final ComposableLambdaN composableLambdaNInstance(int i11, boolean z11, int i12, @k Object obj) {
        ComposableLambdaNImpl composableLambdaNImpl = new ComposableLambdaNImpl(i11, z11, i12);
        composableLambdaNImpl.update(obj);
        return composableLambdaNImpl;
    }

    @Composable
    @ComposeCompilerApi
    @k
    public static final ComposableLambdaN rememberComposableLambdaN(int i11, boolean z11, int i12, @k Object obj, @l Composer composer, int i13) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-293456346, i13, -1, "androidx.compose.runtime.internal.rememberComposableLambdaN (ComposableLambdaN.jvm.kt:170)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ComposableLambdaNImpl(i11, z11, i12);
            composer.updateRememberedValue(rememberedValue);
        }
        ComposableLambdaNImpl composableLambdaNImpl = (ComposableLambdaNImpl) rememberedValue;
        composableLambdaNImpl.update(obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambdaNImpl;
    }
}
