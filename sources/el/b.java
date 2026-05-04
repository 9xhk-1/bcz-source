package el;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f49873a = "AppVersionSignature";

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap<String, ik.b> f49874b = new ConcurrentHashMap();

    @Nullable
    public static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e(f49873a, "Cannot resolve info for" + context.getPackageName(), e11);
            return null;
        }
    }

    @NonNull
    public static String b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    public static ik.b c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, ik.b> concurrentMap = f49874b;
        ik.b bVar = concurrentMap.get(packageName);
        if (bVar != null) {
            return bVar;
        }
        ik.b d11 = d(context);
        ik.b putIfAbsent = concurrentMap.putIfAbsent(packageName, d11);
        return putIfAbsent == null ? d11 : putIfAbsent;
    }

    @NonNull
    public static ik.b d(@NonNull Context context) {
        return new e(b(a(context)));
    }

    @VisibleForTesting
    public static void e() {
        f49874b.clear();
    }
}
