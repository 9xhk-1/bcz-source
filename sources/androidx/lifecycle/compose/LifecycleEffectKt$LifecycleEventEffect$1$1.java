package androidx.lifecycle.compose;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,745:1\n64#2,5:746\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt$LifecycleEventEffect$1$1\n*L\n76#1:746,5\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleEffectKt$LifecycleEventEffect$1$1 extends Lambda implements l<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ State<x00.a<g2>> $currentOnEvent$delegate;
    final /* synthetic */ Lifecycle.Event $event;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleEffectKt$LifecycleEventEffect$1$1(LifecycleOwner lifecycleOwner, Lifecycle.Event event, State<? extends x00.a<g2>> state) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$event = event;
        this.$currentOnEvent$delegate = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Lifecycle.Event event, State state, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        x00.a LifecycleEventEffect$lambda$0;
        if (event2 == event) {
            LifecycleEventEffect$lambda$0 = LifecycleEffectKt.LifecycleEventEffect$lambda$0(state);
            LifecycleEventEffect$lambda$0.invoke();
        }
    }

    @Override // x00.l
    @k
    public final DisposableEffectResult invoke(@k DisposableEffectScope disposableEffectScope) {
        final Lifecycle.Event event = this.$event;
        final State<x00.a<g2>> state = this.$currentOnEvent$delegate;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.compose.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
                LifecycleEffectKt$LifecycleEventEffect$1$1.invoke$lambda$0(Lifecycle.Event.this, state, lifecycleOwner, event2);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }
}
