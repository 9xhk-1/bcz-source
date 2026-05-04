package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1368:1\n27#2:1369\n1247#3,6:1370\n1#4:1376\n*S KotlinDebug\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n*L\n1340#1:1369\n1367#1:1370,6\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableLambdaKt {
    private static final int BITS_PER_SLOT = 3;
    public static final int SLOTS_PER_INT = 10;

    @k
    private static final Object lambdaKey = new Object();

    public static final int bitsForSlot(int i11, int i12) {
        return i11 << (((i12 % 10) * 3) + 1);
    }

    @ComposeCompilerApi
    @k
    public static final ComposableLambda composableLambda(@k Composer composer, int i11, boolean z11, @k Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.startMovableGroup(Integer.rotateLeft(i11, 1), lambdaKey);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i11, z11, obj);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            g0.n(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) rememberedValue;
            composableLambdaImpl.update(obj);
        }
        composer.endMovableGroup();
        return composableLambdaImpl;
    }

    @ComposeCompilerApi
    @k
    public static final ComposableLambda composableLambdaInstance(int i11, boolean z11, @k Object obj) {
        return new ComposableLambdaImpl(i11, z11, obj);
    }

    public static final int differentBits(int i11) {
        return bitsForSlot(2, i11);
    }

    @Composable
    @ComposeCompilerApi
    @k
    public static final ComposableLambda rememberComposableLambda(int i11, boolean z11, @k Object obj, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1573003438, i12, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:1366)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ComposableLambdaImpl(i11, z11, obj);
            composer.updateRememberedValue(rememberedValue);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) rememberedValue;
        composableLambdaImpl.update(obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambdaImpl;
    }

    public static final boolean replacableWith(@l RecomposeScope recomposeScope, @k RecomposeScope recomposeScope2) {
        if (recomposeScope == null) {
            return true;
        }
        if (!(recomposeScope instanceof RecomposeScopeImpl) || !(recomposeScope2 instanceof RecomposeScopeImpl)) {
            return false;
        }
        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
        return !recomposeScopeImpl.getValid() || g0.g(recomposeScope, recomposeScope2) || g0.g(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) recomposeScope2).getAnchor());
    }

    public static final int sameBits(int i11) {
        return bitsForSlot(1, i11);
    }
}
