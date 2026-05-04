package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class LoaderManager {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface LoaderCallbacks<D> {
        @NonNull
        @MainThread
        Loader<D> onCreateLoader(int i11, @Nullable Bundle bundle);

        @MainThread
        void onLoadFinished(@NonNull Loader<D> loader, D d11);

        @MainThread
        void onLoaderReset(@NonNull Loader<D> loader);
    }

    public static void enableDebugLogging(boolean z11) {
        LoaderManagerImpl.DEBUG = z11;
    }

    @NonNull
    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager getInstance(@NonNull T t11) {
        return new LoaderManagerImpl(t11, t11.getViewModelStore());
    }

    @MainThread
    public abstract void destroyLoader(int i11);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @Nullable
    public abstract <D> Loader<D> getLoader(int i11);

    public boolean hasRunningLoaders() {
        return false;
    }

    @NonNull
    @MainThread
    public abstract <D> Loader<D> initLoader(int i11, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks);

    public abstract void markForRedelivery();

    @NonNull
    @MainThread
    public abstract <D> Loader<D> restartLoader(int i11, @Nullable Bundle bundle, @NonNull LoaderCallbacks<D> loaderCallbacks);
}
