package zk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f102770b = "ManifestParser";

    /* renamed from: c, reason: collision with root package name */
    public static final String f102771c = "GlideModule";

    /* renamed from: a, reason: collision with root package name */
    public final Context f102772a;

    public e(Context context) {
        this.f102772a = context;
    }

    public static c c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e11) {
                d(cls, e11);
            } catch (InstantiationException e12) {
                d(cls, e12);
            } catch (NoSuchMethodException e13) {
                d(cls, e13);
            } catch (InvocationTargetException e14) {
                d(cls, e14);
            }
            if (obj instanceof c) {
                return (c) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e15) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e15);
        }
    }

    public static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    @Nullable
    public final ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.f102772a.getPackageManager().getApplicationInfo(this.f102772a.getPackageName(), 128);
    }

    public List<c> b() {
        ApplicationInfo a11;
        if (Log.isLoggable(f102770b, 3)) {
            Log.d(f102770b, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            a11 = a();
        } catch (PackageManager.NameNotFoundException e11) {
            if (Log.isLoggable(f102770b, 6)) {
                Log.e(f102770b, "Failed to parse glide modules", e11);
            }
        }
        if (a11 != null && a11.metaData != null) {
            if (Log.isLoggable(f102770b, 2)) {
                Log.v(f102770b, "Got app info metadata: " + a11.metaData);
            }
            for (String str : a11.metaData.keySet()) {
                if (f102771c.equals(a11.metaData.get(str))) {
                    arrayList.add(c(str));
                    if (Log.isLoggable(f102770b, 3)) {
                        Log.d(f102770b, "Loaded Glide module: " + str);
                    }
                }
            }
            if (Log.isLoggable(f102770b, 3)) {
                Log.d(f102770b, "Finished loading Glide modules");
                return arrayList;
            }
            return arrayList;
        }
        if (Log.isLoggable(f102770b, 3)) {
            Log.d(f102770b, "Got null app info metadata");
            return arrayList;
        }
        return arrayList;
    }
}
