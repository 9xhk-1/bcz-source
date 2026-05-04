package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {
    public static final int $stable = 8;

    @k
    private final State<ActivityResultContract<I, O>> currentContract;

    @k
    private final ActivityResultLauncherHolder<I> launcher;

    /* JADX WARN: Multi-variable type inference failed */
    public ManagedActivityResultLauncher(@k ActivityResultLauncherHolder<I> activityResultLauncherHolder, @k State<? extends ActivityResultContract<I, O>> state) {
        this.launcher = activityResultLauncherHolder;
        this.currentContract = state;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @k
    public ActivityResultContract<I, O> getContract() {
        return this.currentContract.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(I i11, @l ActivityOptionsCompat activityOptionsCompat) {
        this.launcher.launch(i11, activityOptionsCompat);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @n(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
