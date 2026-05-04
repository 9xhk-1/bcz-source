package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import androidx.media.MediaSessionManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes2.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = (android.media.session.MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        boolean isTrustedForMediaControl;
        if (!(remoteUserInfoImpl instanceof RemoteUserInfoImplApi28)) {
            return false;
        }
        isTrustedForMediaControl = this.mObject.isTrustedForMediaControl(((RemoteUserInfoImplApi28) remoteUserInfoImpl).mObject);
        return isTrustedForMediaControl;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class RemoteUserInfoImplApi28 implements MediaSessionManager.RemoteUserInfoImpl {
        final MediaSessionManager.RemoteUserInfo mObject;

        public RemoteUserInfoImplApi28(String str, int i11, int i12) {
            this.mObject = h.a(str, i11, i12);
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplApi28)) {
                return false;
            }
            equals = this.mObject.equals(((RemoteUserInfoImplApi28) obj).mObject);
            return equals;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public String getPackageName() {
            String packageName;
            packageName = this.mObject.getPackageName();
            return packageName;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
            int pid;
            pid = this.mObject.getPid();
            return pid;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
            int uid;
            uid = this.mObject.getUid();
            return uid;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mObject);
        }

        public RemoteUserInfoImplApi28(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.mObject = remoteUserInfo;
        }
    }
}
