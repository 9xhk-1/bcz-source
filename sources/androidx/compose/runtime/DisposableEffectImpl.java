package androidx.compose.runtime;

import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DisposableEffectImpl implements RememberObserver {

    @k
    private final l<DisposableEffectScope, DisposableEffectResult> effect;

    @m80.l
    private DisposableEffectResult onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public DisposableEffectImpl(@k l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar) {
        this.effect = lVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        DisposableEffectResult disposableEffectResult = this.onDispose;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.onDispose = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        DisposableEffectScope disposableEffectScope;
        l<DisposableEffectScope, DisposableEffectResult> lVar = this.effect;
        disposableEffectScope = EffectsKt.InternalDisposableEffectScope;
        this.onDispose = lVar.invoke(disposableEffectScope);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }
}
