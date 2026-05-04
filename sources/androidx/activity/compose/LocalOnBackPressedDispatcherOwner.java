package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,109:1\n77#2:110\n77#2:111\n77#2:112\n23#3,8:113\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:110\n52#1:111\n53#1:112\n53#1:113,8\n*E\n"})
/* loaded from: classes.dex */
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable = 0;

    @k
    public static final LocalOnBackPressedDispatcherOwner INSTANCE = new LocalOnBackPressedDispatcherOwner();

    @k
    private static final ProvidableCompositionLocal<OnBackPressedDispatcherOwner> LocalOnBackPressedDispatcherOwner = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<OnBackPressedDispatcherOwner>() { // from class: androidx.activity.compose.LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final OnBackPressedDispatcherOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalOnBackPressedDispatcherOwner() {
    }

    @l
    @j(name = "getCurrent")
    @Composable
    public final OnBackPressedDispatcherOwner getCurrent(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2068013981, i11, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
        }
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) composer.consume(LocalOnBackPressedDispatcherOwner);
        if (onBackPressedDispatcherOwner == null) {
            composer.startReplaceGroup(544166745);
            onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(544164296);
            composer.endReplaceGroup();
        }
        if (onBackPressedDispatcherOwner == null) {
            composer.startReplaceGroup(544168748);
            Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof OnBackPressedDispatcherOwner) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) obj;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(544164377);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return onBackPressedDispatcherOwner;
    }

    @k
    public final ProvidedValue<OnBackPressedDispatcherOwner> provides(@k OnBackPressedDispatcherOwner onBackPressedDispatcherOwner) {
        return LocalOnBackPressedDispatcherOwner.provides(onBackPressedDispatcherOwner);
    }
}
