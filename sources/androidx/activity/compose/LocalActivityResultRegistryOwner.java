package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistryOwner;
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
@u0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,157:1\n77#2:158\n23#3,8:159\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n49#1:158\n49#1:159,8\n*E\n"})
/* loaded from: classes.dex */
public final class LocalActivityResultRegistryOwner {
    public static final int $stable = 0;

    @k
    public static final LocalActivityResultRegistryOwner INSTANCE = new LocalActivityResultRegistryOwner();

    @k
    private static final ProvidableCompositionLocal<ActivityResultRegistryOwner> LocalComposition = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<ActivityResultRegistryOwner>() { // from class: androidx.activity.compose.LocalActivityResultRegistryOwner$LocalComposition$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ActivityResultRegistryOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalActivityResultRegistryOwner() {
    }

    @l
    @j(name = "getCurrent")
    @Composable
    public final ActivityResultRegistryOwner getCurrent(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1418020823, i11, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        ActivityResultRegistryOwner activityResultRegistryOwner = (ActivityResultRegistryOwner) composer.consume(LocalComposition);
        if (activityResultRegistryOwner == null) {
            composer.startReplaceGroup(1006590171);
            Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof ActivityResultRegistryOwner) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            activityResultRegistryOwner = (ActivityResultRegistryOwner) obj;
        } else {
            composer.startReplaceGroup(1006589303);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return activityResultRegistryOwner;
    }

    @k
    public final ProvidedValue<ActivityResultRegistryOwner> provides(@k ActivityResultRegistryOwner activityResultRegistryOwner) {
        return LocalComposition.provides(activityResultRegistryOwner);
    }
}
