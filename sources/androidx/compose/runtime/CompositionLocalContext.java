package androidx.compose.runtime;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class CompositionLocalContext {
    public static final int $stable = 0;

    @k
    private final PersistentCompositionLocalMap compositionLocals;

    public CompositionLocalContext(@k PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.compositionLocals = persistentCompositionLocalMap;
    }

    @k
    public final PersistentCompositionLocalMap getCompositionLocals$runtime_release() {
        return this.compositionLocals;
    }
}
