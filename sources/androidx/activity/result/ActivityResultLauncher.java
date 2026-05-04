package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    @k
    public abstract ActivityResultContract<I, ?> getContract();

    public void launch(I i11) {
        launch(i11, null);
    }

    public abstract void launch(I i11, @l ActivityOptionsCompat activityOptionsCompat);

    @MainThread
    public abstract void unregister();
}
