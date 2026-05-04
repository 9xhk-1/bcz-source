package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import java.util.UUID;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,157:1\n1225#2,6:158\n1225#2,6:164\n1225#2,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:158,6\n98#1:164,6\n102#1:170,6\n*E\n"})
/* loaded from: classes.dex */
public final class ActivityResultRegistryKt {
    @Composable
    @k
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(@k ActivityResultContract<I, O> activityResultContract, @k l<? super O, g2> lVar, @m80.l Composer composer, int i11) {
        ActivityResultRegistry activityResultRegistry;
        String str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1408504823, i11, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, i11 & 14);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i11 >> 3) & 14);
        String str2 = (String) RememberSaveableKt.m2066rememberSaveable(new Object[0], (Saver) null, (String) null, (x00.a) new x00.a<String>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            @Override // x00.a
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }, composer, 3072, 6);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        ActivityResultRegistry activityResultRegistry2 = current.getActivityResultRegistry();
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new ActivityResultLauncherHolder();
            composer.updateRememberedValue(rememberedValue);
        }
        ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ManagedActivityResultLauncher(activityResultLauncherHolder, rememberUpdatedState);
            composer.updateRememberedValue(rememberedValue2);
        }
        ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (ManagedActivityResultLauncher) rememberedValue2;
        boolean changedInstance = composer.changedInstance(activityResultLauncherHolder) | composer.changedInstance(activityResultRegistry2) | composer.changed(str2) | composer.changedInstance(activityResultContract) | composer.changed(rememberUpdatedState2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            activityResultRegistry = activityResultRegistry2;
            Object activityResultRegistryKt$rememberLauncherForActivityResult$1$1 = new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(activityResultLauncherHolder, activityResultRegistry, str2, activityResultContract, rememberUpdatedState2);
            str = str2;
            composer.updateRememberedValue(activityResultRegistryKt$rememberLauncherForActivityResult$1$1);
            rememberedValue3 = activityResultRegistryKt$rememberLauncherForActivityResult$1$1;
        } else {
            str = str2;
            activityResultRegistry = activityResultRegistry2;
        }
        ActivityResultRegistry activityResultRegistry3 = activityResultRegistry;
        EffectsKt.DisposableEffect(activityResultRegistry3, str, activityResultContract, (l) rememberedValue3, composer, (i11 << 6) & 896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return managedActivityResultLauncher;
    }
}
