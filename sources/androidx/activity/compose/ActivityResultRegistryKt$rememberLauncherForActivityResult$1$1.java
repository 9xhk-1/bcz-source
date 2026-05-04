package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,157:1\n64#2,5:158\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1\n*L\n105#1:158,5\n*E\n"})
/* loaded from: classes.dex */
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 extends Lambda implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    final /* synthetic */ ActivityResultContract<I, O> $contract;
    final /* synthetic */ State<l<O, g2>> $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ ActivityResultLauncherHolder<I> $realLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(ActivityResultLauncherHolder<I> activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract<I, O> activityResultContract, State<? extends l<? super O, g2>> state) {
        super(1);
        this.$realLauncher = activityResultLauncherHolder;
        this.$activityResultRegistry = activityResultRegistry;
        this.$key = str;
        this.$contract = activityResultContract;
        this.$currentOnResult = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(State state, Object obj) {
        ((l) state.getValue()).invoke(obj);
    }

    @Override // x00.l
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        ActivityResultLauncherHolder<I> activityResultLauncherHolder = this.$realLauncher;
        ActivityResultRegistry activityResultRegistry = this.$activityResultRegistry;
        String str = this.$key;
        Object obj = this.$contract;
        final State<l<O, g2>> state = this.$currentOnResult;
        activityResultLauncherHolder.setLauncher(activityResultRegistry.register(str, obj, new ActivityResultCallback() { // from class: androidx.activity.compose.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj2) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1.invoke$lambda$0(State.this, obj2);
            }
        }));
        final ActivityResultLauncherHolder<I> activityResultLauncherHolder2 = this.$realLauncher;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ActivityResultLauncherHolder.this.unregister();
            }
        };
    }
}
