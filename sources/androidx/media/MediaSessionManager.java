package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.MediaSessionManagerImplApi28;
import androidx.media.MediaSessionManagerImplBase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MediaSessionManager {
    private static volatile MediaSessionManager sSessionManager;
    MediaSessionManagerImpl mImpl;
    static final String TAG = "MediaSessionManager";
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final Object sLock = new Object();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MediaSessionManagerImpl {
        Context getContext();

        boolean isTrustedForMediaControl(RemoteUserInfoImpl remoteUserInfoImpl);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface RemoteUserInfoImpl {
        String getPackageName();

        int getPid();

        int getUid();
    }

    private MediaSessionManager(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new MediaSessionManagerImplApi28(context);
        } else {
            this.mImpl = new MediaSessionManagerImplApi21(context);
        }
    }

    @NonNull
    public static MediaSessionManager getSessionManager(@NonNull Context context) {
        MediaSessionManager mediaSessionManager;
        MediaSessionManager mediaSessionManager2 = sSessionManager;
        if (mediaSessionManager2 != null) {
            return mediaSessionManager2;
        }
        synchronized (sLock) {
            try {
                mediaSessionManager = sSessionManager;
                if (mediaSessionManager == null) {
                    sSessionManager = new MediaSessionManager(context.getApplicationContext());
                    mediaSessionManager = sSessionManager;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaSessionManager;
    }

    public Context getContext() {
        return this.mImpl.getContext();
    }

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfo remoteUserInfo) {
        if (remoteUserInfo != null) {
            return this.mImpl.isTrustedForMediaControl(remoteUserInfo.mImpl);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class RemoteUserInfo {
        public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
        RemoteUserInfoImpl mImpl;

        public RemoteUserInfo(@NonNull String str, int i11, int i12) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i11, i12);
            } else {
                this.mImpl = new MediaSessionManagerImplBase.RemoteUserInfoImplBase(str, i11, i12);
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfo) {
                return this.mImpl.equals(((RemoteUserInfo) obj).mImpl);
            }
            return false;
        }

        @NonNull
        public String getPackageName() {
            return this.mImpl.getPackageName();
        }

        public int getPid() {
            return this.mImpl.getPid();
        }

        public int getUid() {
            return this.mImpl.getUid();
        }

        public int hashCode() {
            return this.mImpl.hashCode();
        }

        @RequiresApi(28)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public RemoteUserInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.mImpl = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(remoteUserInfo);
        }
    }
}
