package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/SavedStateArgStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
/* loaded from: classes3.dex */
final class SavedStateArgStore extends ArgStore {

    @k
    private final SavedStateHandle handle;

    @k
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateArgStore(@k SavedStateHandle handle, @k Map<String, ? extends NavType<?>> typeMap) {
        g0.p(handle, "handle");
        g0.p(typeMap, "typeMap");
        this.handle = handle;
        this.typeMap = typeMap;
    }

    @Override // androidx.navigation.serialization.ArgStore
    public boolean contains(@k String key) {
        g0.p(key, "key");
        return this.handle.contains(key);
    }

    @Override // androidx.navigation.serialization.ArgStore
    @l
    public Object get(@k String key) {
        g0.p(key, "key");
        Bundle bundleOf = BundleKt.bundleOf(h1.a(key, this.handle.get(key)));
        NavType<?> navType = this.typeMap.get(key);
        if (navType != null) {
            return navType.get(bundleOf, key);
        }
        throw new IllegalStateException(("Failed to find type for " + key + " when decoding " + this.handle).toString());
    }
}
