package androidx.core.content;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    @SuppressLint({"ActionValue"})
    public static final String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private IUnusedAppRestrictionsBackportService.Stub mBinder = new IUnusedAppRestrictionsBackportService.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportService.1
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(@Nullable IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException {
            if (iUnusedAppRestrictionsBackportCallback == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.isPermissionRevocationEnabled(new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback));
        }
    };

    public abstract void isPermissionRevocationEnabled(@NonNull UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
