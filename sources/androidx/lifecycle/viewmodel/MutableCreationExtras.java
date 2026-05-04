package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MutableCreationExtras extends CreationExtras {
    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    @l
    public <T> T get(@k CreationExtras.Key<T> key) {
        g0.p(key, "key");
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(@k CreationExtras.Key<T> key, T t11) {
        g0.p(key, "key");
        getMap$lifecycle_viewmodel_release().put(key, t11);
    }

    public MutableCreationExtras(@k CreationExtras initialExtras) {
        g0.p(initialExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(initialExtras.getMap$lifecycle_viewmodel_release());
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i11, v vVar) {
        this((i11 & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}
