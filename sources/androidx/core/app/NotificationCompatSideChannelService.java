package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.a;
import androidx.annotation.DeprecatedSinceApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class NotificationSideChannelStub extends a.b {
        public NotificationSideChannelStub() {
        }

        @Override // android.support.v4.app.a
        public void cancel(String str, int i11, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancel(str, i11, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.a
        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.a
        public void notify(String str, int i11, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.checkPermission(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.notify(str, i11, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void cancel(String str, int i11, String str2);

    public abstract void cancelAll(String str);

    public void checkPermission(int i11, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i11)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i11 + " is not authorized for package " + str);
    }

    public abstract void notify(String str, int i11, String str2, Notification notification);

    @Override // android.app.Service
    @DeprecatedSinceApi(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL);
        return null;
    }
}
