package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ActivityResultCaller {
    @k
    <I, O> ActivityResultLauncher<I> registerForActivityResult(@k ActivityResultContract<I, O> activityResultContract, @k ActivityResultCallback<O> activityResultCallback);

    @k
    <I, O> ActivityResultLauncher<I> registerForActivityResult(@k ActivityResultContract<I, O> activityResultContract, @k ActivityResultRegistry activityResultRegistry, @k ActivityResultCallback<O> activityResultCallback);
}
