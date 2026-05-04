package androidx.compose.runtime;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PausableCompositionKt {
    @k
    public static final PausableComposition PausableComposition(@k Applier<?> applier, @k CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }
}
