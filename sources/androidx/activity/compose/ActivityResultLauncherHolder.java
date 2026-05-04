package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;

    @l
    private ActivityResultLauncher<I> launcher;

    @l
    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i11, @l ActivityOptionsCompat activityOptionsCompat) {
        g2 g2Var;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(i11, activityOptionsCompat);
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void setLauncher(@l ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        g2 g2Var;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            g2Var = g2.f100423a;
        } else {
            g2Var = null;
        }
        if (g2Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
