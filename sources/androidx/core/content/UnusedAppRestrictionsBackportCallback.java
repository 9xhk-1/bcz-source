package androidx.core.content;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class UnusedAppRestrictionsBackportCallback {
    private IUnusedAppRestrictionsBackportCallback mCallback;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public UnusedAppRestrictionsBackportCallback(@NonNull IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        this.mCallback = iUnusedAppRestrictionsBackportCallback;
    }

    public void onResult(boolean z11, boolean z12) throws RemoteException {
        this.mCallback.onIsPermissionRevocationEnabledForAppResult(z11, z12);
    }
}
