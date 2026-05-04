package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(api = 28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface CompatWrapped {
        Object getWrapper();
    }

    public static <T> T checkCompatWrapper(T t11) {
        T t12;
        return (!(t11 instanceof CompatWrapped) || (t12 = (T) ((CompatWrapped) t11).getWrapper()) == null) ? t11 : t12;
    }

    @NonNull
    public Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    @NonNull
    public Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    @NonNull
    public ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    @NonNull
    public BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    @NonNull
    public Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }
}
