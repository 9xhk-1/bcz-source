package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import c40.r0;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ViewModel {

    @l
    private final ViewModelImpl impl;

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public final void addCloseable(@k String key, @k AutoCloseable closeable) {
        g0.p(key, "key");
        g0.p(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(key, closeable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    @l
    public final <T extends AutoCloseable> T getCloseable(@k String key) {
        g0.p(key, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(key);
        }
        return null;
    }

    public void addCloseable(@k AutoCloseable closeable) {
        g0.p(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(@k r0 viewModelScope) {
        g0.p(viewModelScope, "viewModelScope");
        this.impl = new ViewModelImpl(viewModelScope);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        g0.p(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(@k AutoCloseable... closeables) {
        g0.p(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public ViewModel(@k r0 viewModelScope, @k AutoCloseable... closeables) {
        g0.p(viewModelScope, "viewModelScope");
        g0.p(closeables, "closeables");
        this.impl = new ViewModelImpl(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ ViewModel(Closeable... closeables) {
        g0.p(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public void onCleared() {
    }
}
