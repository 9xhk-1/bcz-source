package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ProcessCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Api19Impl {
        private static Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final Object sResolvedLock = new Object();

        private Api19Impl() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        public static boolean isApplicationUid(int i11) {
            try {
                synchronized (sResolvedLock) {
                    try {
                        if (!sResolved) {
                            sResolved = true;
                            sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = sMethodUserHandleIsAppMethod;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i11));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        public static boolean isApplicationUid(int i11) {
            return Process.isApplicationUid(i11);
        }
    }

    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int i11) {
        return Api24Impl.isApplicationUid(i11);
    }
}
