package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class BasicTooltipDefaults {
    public static final int $stable = 0;
    public static final long TooltipDuration = 1500;

    @m80.k
    public static final BasicTooltipDefaults INSTANCE = new BasicTooltipDefaults();

    @m80.k
    private static final MutatorMutex GlobalMutatorMutex = new MutatorMutex();

    private BasicTooltipDefaults() {
    }

    @m80.k
    public final MutatorMutex getGlobalMutatorMutex() {
        return GlobalMutatorMutex;
    }
}
