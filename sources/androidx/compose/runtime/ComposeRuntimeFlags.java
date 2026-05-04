package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalComposeApi
/* loaded from: classes.dex */
public final class ComposeRuntimeFlags {

    @k
    public static final ComposeRuntimeFlags INSTANCE = new ComposeRuntimeFlags();

    @g
    public static boolean isMovingNestedMovableContentEnabled = true;
    public static final int $stable = 8;

    private ComposeRuntimeFlags() {
    }

    public static /* synthetic */ void isMovingNestedMovableContentEnabled$annotations() {
    }
}
