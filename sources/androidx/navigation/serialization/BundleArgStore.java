package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
final class BundleArgStore extends ArgStore {

    @k
    private final Bundle bundle;

    @k
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public BundleArgStore(@k Bundle bundle, @k Map<String, ? extends NavType<?>> typeMap) {
        g0.p(bundle, "bundle");
        g0.p(typeMap, "typeMap");
        this.bundle = bundle;
        this.typeMap = typeMap;
    }

    @Override // androidx.navigation.serialization.ArgStore
    public boolean contains(@k String key) {
        g0.p(key, "key");
        return this.bundle.containsKey(key);
    }

    @Override // androidx.navigation.serialization.ArgStore
    @l
    public Object get(@k String key) {
        g0.p(key, "key");
        NavType<?> navType = this.typeMap.get(key);
        if (navType != null) {
            return navType.get(this.bundle, key);
        }
        return null;
    }
}
