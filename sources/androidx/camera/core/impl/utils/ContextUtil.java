package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContextUtil {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        @NonNull
        public static Context createAttributionContext(@NonNull Context context, @Nullable String str) {
            return context.createAttributionContext(str);
        }

        @Nullable
        public static String getAttributionTag(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        @NonNull
        public static Context createDeviceContext(@NonNull Context context, int i11) {
            return context.createDeviceContext(i11);
        }

        public static int getDeviceId(@NonNull Context context) {
            return context.getDeviceId();
        }
    }

    private ContextUtil() {
    }

    @NonNull
    public static Context getApplicationContext(@NonNull Context context) {
        int deviceId;
        Context applicationContext = context.getApplicationContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34 && (deviceId = Api34Impl.getDeviceId(context)) != Api34Impl.getDeviceId(applicationContext)) {
            applicationContext = Api34Impl.createDeviceContext(applicationContext, deviceId);
        }
        if (i11 >= 30) {
            String attributionTag = Api30Impl.getAttributionTag(context);
            if (!Objects.equals(attributionTag, Api30Impl.getAttributionTag(applicationContext))) {
                return Api30Impl.createAttributionContext(applicationContext, attributionTag);
            }
        }
        return applicationContext;
    }

    @Nullable
    public static Application getApplicationFromContext(@NonNull Context context) {
        for (Context applicationContext = getApplicationContext(context); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }
}
