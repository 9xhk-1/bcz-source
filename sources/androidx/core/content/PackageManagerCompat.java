package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import com.google.common.util.concurrent.p1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PackageManagerCompat {

    @SuppressLint({"ActionValue"})
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String LOG_TAG = "PackageManagerCompat";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
        }

        public static boolean areUnusedAppRestrictionsEnabled(@NonNull Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean areUnusedAppRestrictionsAvailable(@NonNull PackageManager packageManager) {
        int i11 = Build.VERSION.SDK_INT;
        return (i11 >= 30) || ((i11 < 30) && (getPermissionRevocationVerifierApp(packageManager) != null));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static String getPermissionRevocationVerifierApp(@NonNull PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(ACTION_PERMISSION_REVOCATION_SETTINGS).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @NonNull
    public static p1<Integer> getUnusedAppRestrictionsStatus(@NonNull Context context) {
        ResolvableFuture<Integer> create = ResolvableFuture.create();
        if (!UserManagerCompat.isUserUnlocked(context)) {
            create.set(0);
            Log.e(LOG_TAG, "User is in locked direct boot mode");
            return create;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            create.set(1);
            return create;
        }
        int i11 = context.getApplicationInfo().targetSdkVersion;
        if (i11 < 30) {
            create.set(0);
            Log.e(LOG_TAG, "Target SDK version below API 30");
            return create;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                create.set(Integer.valueOf(i11 >= 31 ? 5 : 4));
                return create;
            }
            create.set(2);
            return create;
        }
        if (i12 == 30) {
            create.set(Integer.valueOf(Api30Impl.areUnusedAppRestrictionsEnabled(context) ? 4 : 2));
            return create;
        }
        final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
        create.addListener(new Runnable() { // from class: androidx.core.content.v
            @Override // java.lang.Runnable
            public final void run() {
                UnusedAppRestrictionsBackportServiceConnection.this.disconnectFromService();
            }
        }, Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(create);
        return create;
    }
}
