package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import h10.d;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.b;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ViewModelInitializer<T extends ViewModel> {

    @k
    private final d<T> clazz;

    @k
    private final l<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(@k d<T> clazz, @k l<? super CreationExtras, ? extends T> initializer) {
        g0.p(clazz, "clazz");
        g0.p(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    @k
    public final d<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    @k
    public final l<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(@k Class<T> clazz, @k l<? super CreationExtras, ? extends T> initializer) {
        this(b.i(clazz), initializer);
        g0.p(clazz, "clazz");
        g0.p(initializer, "initializer");
    }
}
