package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ViewModelStore {

    @k
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Iterator<ViewModel> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        this.map.clear();
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ViewModel get(@k String key) {
        g0.p(key, "key");
        return this.map.get(key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(@k String key, @k ViewModel viewModel) {
        g0.p(key, "key");
        g0.p(viewModel, "viewModel");
        ViewModel put = this.map.put(key, viewModel);
        if (put != null) {
            put.clear$lifecycle_viewmodel_release();
        }
    }
}
