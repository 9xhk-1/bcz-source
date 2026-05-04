package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import org.junit.jupiter.api.j2;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final ViewModelProvider.Factory FACTORY = new ViewModelProvider.Factory() { // from class: androidx.navigation.NavControllerViewModel$Companion$FACTORY$1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            g0.p(modelClass, "modelClass");
            return new NavControllerViewModel();
        }
    };

    @k
    private final Map<String, ViewModelStore> viewModelStores = new LinkedHashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavControllerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n+ 2 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProviderGetKt\n*L\n1#1,83:1\n374#2:84\n*S KotlinDebug\n*F\n+ 1 NavControllerViewModel.kt\nandroidx/navigation/NavControllerViewModel$Companion\n*L\n79#1:84\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @k
        public final NavControllerViewModel getInstance(@k ViewModelStore viewModelStore) {
            g0.p(viewModelStore, "viewModelStore");
            return (NavControllerViewModel) new ViewModelProvider(viewModelStore, NavControllerViewModel.FACTORY, null, 4, null).get(NavControllerViewModel.class);
        }

        private Companion() {
        }
    }

    @o
    @k
    public static final NavControllerViewModel getInstance(@k ViewModelStore viewModelStore) {
        return Companion.getInstance(viewModelStore);
    }

    public final void clear(@k String backStackEntryId) {
        g0.p(backStackEntryId, "backStackEntryId");
        ViewModelStore remove = this.viewModelStores.remove(backStackEntryId);
        if (remove != null) {
            remove.clear();
        }
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    @k
    public ViewModelStore getViewModelStore(@k String backStackEntryId) {
        g0.p(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = this.viewModelStores.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.viewModelStores.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Iterator<ViewModelStore> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.viewModelStores.clear();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(j2.O);
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }
}
