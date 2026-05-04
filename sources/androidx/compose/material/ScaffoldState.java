package androidx.compose.material;

import androidx.compose.runtime.Stable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class ScaffoldState {
    public static final int $stable = 0;

    @k
    private final DrawerState drawerState;

    @k
    private final SnackbarHostState snackbarHostState;

    public ScaffoldState(@k DrawerState drawerState, @k SnackbarHostState snackbarHostState) {
        this.drawerState = drawerState;
        this.snackbarHostState = snackbarHostState;
    }

    @k
    public final DrawerState getDrawerState() {
        return this.drawerState;
    }

    @k
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
