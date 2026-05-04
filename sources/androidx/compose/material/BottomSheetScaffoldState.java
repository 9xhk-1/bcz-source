package androidx.compose.material;

import androidx.compose.runtime.Stable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;

    @k
    private final BottomSheetState bottomSheetState;

    @k
    private final SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(@k BottomSheetState bottomSheetState, @k SnackbarHostState snackbarHostState) {
        this.bottomSheetState = bottomSheetState;
        this.snackbarHostState = snackbarHostState;
    }

    @k
    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    @k
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
