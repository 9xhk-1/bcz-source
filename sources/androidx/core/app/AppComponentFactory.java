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
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(28)
/* loaded from: classes2.dex */
public class AppComponentFactory extends android.app.AppComponentFactory {
    @NonNull
    public final Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.checkCompatWrapper(instantiateActivityCompat(classLoader, str, intent));
    }

    @NonNull
    public Activity instantiateActivityCompat(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e11) {
            throw new RuntimeException("Couldn't call constructor", e11);
        }
    }

    @NonNull
    public final Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.checkCompatWrapper(instantiateApplicationCompat(classLoader, str));
    }

    @NonNull
    public Application instantiateApplicationCompat(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e11) {
            throw new RuntimeException("Couldn't call constructor", e11);
        }
    }

    @NonNull
    public final ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.checkCompatWrapper(instantiateProviderCompat(classLoader, str));
    }

    @NonNull
    public ContentProvider instantiateProviderCompat(@NonNull ClassLoader classLoader, @NonNull String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e11) {
            throw new RuntimeException("Couldn't call constructor", e11);
        }
    }

    @NonNull
    public final BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.checkCompatWrapper(instantiateReceiverCompat(classLoader, str, intent));
    }

    @NonNull
    public BroadcastReceiver instantiateReceiverCompat(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e11) {
            throw new RuntimeException("Couldn't call constructor", e11);
        }
    }

    @NonNull
    public final Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.checkCompatWrapper(instantiateServiceCompat(classLoader, str, intent));
    }

    @NonNull
    public Service instantiateServiceCompat(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(null).newInstance(null);
        } catch (NoSuchMethodException | InvocationTargetException e11) {
            throw new RuntimeException("Couldn't call constructor", e11);
        }
    }
}
