package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.u0;
import l80.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMotionScene.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionScene.kt\nandroidx/constraintlayout/compose/MotionSceneKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,132:1\n1225#2,6:133\n*S KotlinDebug\n*F\n+ 1 MotionScene.kt\nandroidx/constraintlayout/compose/MotionSceneKt\n*L\n52#1:133,6\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionSceneKt {
    @ExperimentalMotionApi
    @SuppressLint({"ComposableNaming"})
    @k
    @Composable
    public static final MotionScene MotionScene(@d("json5") @k String str, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1620042625, i11, -1, "androidx.constraintlayout.compose.MotionScene (MotionScene.kt:48)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(str)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new JSONMotionScene(str);
            composer.updateRememberedValue(rememberedValue);
        }
        JSONMotionScene jSONMotionScene = (JSONMotionScene) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jSONMotionScene;
    }
}
