package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,309:1\n1#2:310\n1726#3,3:311\n1855#3,2:314\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n*L\n256#1:311,3\n265#1:314,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private LifecycleRegistry _lifecycle;

    @l
    private final Context context;

    @k
    private final c0 defaultFactory$delegate;

    @k
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;

    @k
    private NavDestination destination;

    @k
    private Lifecycle.State hostLifecycleState;

    /* renamed from: id, reason: collision with root package name */
    @k
    private final String f5290id;

    @l
    private final Bundle immutableArgs;

    @k
    private Lifecycle.State maxLifecycle;

    @l
    private final Bundle savedState;

    @k
    private final c0 savedStateHandle$delegate;
    private boolean savedStateRegistryAttached;

    @k
    private final SavedStateRegistryController savedStateRegistryController;

    @l
    private final NavViewModelStoreProvider viewModelStoreProvider;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bundle = null;
            }
            if ((i11 & 8) != 0) {
                state = Lifecycle.State.CREATED;
            }
            if ((i11 & 16) != 0) {
                navViewModelStoreProvider = null;
            }
            if ((i11 & 32) != 0) {
                str = UUID.randomUUID().toString();
                g0.o(str, "randomUUID().toString()");
            }
            if ((i11 & 64) != 0) {
                bundle2 = null;
            }
            return companion.create(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final NavBackStackEntry create(@l Context context, @k NavDestination destination, @l Bundle bundle, @k Lifecycle.State hostLifecycleState, @l NavViewModelStoreProvider navViewModelStoreProvider, @k String id2, @l Bundle bundle2) {
            g0.p(destination, "destination");
            g0.p(hostLifecycleState, "hostLifecycleState");
            g0.p(id2, "id");
            return new NavBackStackEntry(context, destination, bundle, hostLifecycleState, navViewModelStoreProvider, id2, bundle2, null);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavResultSavedStateFactory(@k SavedStateRegistryOwner owner) {
            super(owner, null);
            g0.p(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        @k
        public <T extends ViewModel> T create(@k String key, @k Class<T> modelClass, @k SavedStateHandle handle) {
            g0.p(key, "key");
            g0.p(modelClass, "modelClass");
            g0.p(handle, "handle");
            return new SavedStateViewModel(handle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SavedStateViewModel extends ViewModel {

        @k
        private final SavedStateHandle handle;

        public SavedStateViewModel(@k SavedStateHandle handle) {
            g0.p(handle, "handle");
            this.handle = handle;
        }

        @k
        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, v vVar) {
        this(context, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory$delegate.getValue();
    }

    public boolean equals(@l Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (g0.g(this.f5290id, navBackStackEntry.f5290id) && g0.g(this.destination, navBackStackEntry.destination) && g0.g(getLifecycle(), navBackStackEntry.getLifecycle()) && g0.g(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
                if (g0.g(this.immutableArgs, navBackStackEntry.immutableArgs)) {
                    return true;
                }
                Bundle bundle = this.immutableArgs;
                if (bundle != null && (keySet = bundle.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        Object obj2 = this.immutableArgs.get(str);
                        Bundle bundle2 = navBackStackEntry.immutableArgs;
                        if (!g0.g(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @l
    public final Bundle getArguments() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @k
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
        Context context = this.context;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @k
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    @k
    public final NavDestination getDestination() {
        return this.destination;
    }

    @k
    public final String getId() {
        return this.f5290id;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @k
    public Lifecycle getLifecycle() {
        return this._lifecycle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    @MainThread
    @k
    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @k
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @k
    public ViewModelStore getViewModelStore() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.viewModelStoreProvider;
        if (navViewModelStoreProvider != null) {
            return navViewModelStoreProvider.getViewModelStore(this.f5290id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void handleLifecycleEvent(@k Lifecycle.Event event) {
        g0.p(event, "event");
        this.hostLifecycleState = event.getTargetState();
        updateState();
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = (this.f5290id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i11 = hashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                hashCode = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((hashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState(@k Bundle outBundle) {
        g0.p(outBundle, "outBundle");
        this.savedStateRegistryController.performSave(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setDestination(@k NavDestination navDestination) {
        g0.p(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setMaxLifecycle(@k Lifecycle.State maxState) {
        g0.p(maxState, "maxState");
        this.maxLifecycle = maxState;
        updateState();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavBackStackEntry.class.getSimpleName());
        sb2.append('(' + this.f5290id + ')');
        sb2.append(" destination=");
        sb2.append(this.destination);
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this._lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this._lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.context = context;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navViewModelStoreProvider;
        this.f5290id = str;
        this.savedState = bundle2;
        this._lifecycle = new LifecycleRegistry(this);
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(this);
        this.defaultFactory$delegate = e0.c(new x00.a<SavedStateViewModelFactory>() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final SavedStateViewModelFactory invoke() {
                Context context2;
                context2 = NavBackStackEntry.this.context;
                Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
                return new SavedStateViewModelFactory(application, navBackStackEntry, navBackStackEntry.getArguments());
            }
        });
        this.savedStateHandle$delegate = e0.c(new x00.a<SavedStateHandle>() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final SavedStateHandle invoke() {
                boolean z11;
                z11 = NavBackStackEntry.this.savedStateRegistryAttached;
                if (!z11) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (NavBackStackEntry.this.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    return ((NavBackStackEntry.SavedStateViewModel) new ViewModelProvider(NavBackStackEntry.this, new NavBackStackEntry.NavResultSavedStateFactory(NavBackStackEntry.this)).get(NavBackStackEntry.SavedStateViewModel.class)).getHandle();
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            }
        });
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NavBackStackEntry(android.content.Context r2, androidx.navigation.NavDestination r3, android.os.Bundle r4, androidx.lifecycle.Lifecycle.State r5, androidx.navigation.NavViewModelStoreProvider r6, java.lang.String r7, android.os.Bundle r8, int r9, kotlin.jvm.internal.v r10) {
        /*
            r1 = this;
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L6
            r4 = r0
        L6:
            r10 = r9 & 8
            if (r10 == 0) goto Lc
            androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.CREATED
        Lc:
            r10 = r9 & 16
            if (r10 == 0) goto L11
            r6 = r0
        L11:
            r10 = r9 & 32
            if (r10 == 0) goto L22
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r7 = r7.toString()
            java.lang.String r10 = "randomUUID().toString()"
            kotlin.jvm.internal.g0.o(r7, r10)
        L22:
            r9 = r9 & 64
            if (r9 == 0) goto L2f
            r9 = r0
        L27:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L31
        L2f:
            r9 = r8
            goto L27
        L31:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.<init>(android.content.Context, androidx.navigation.NavDestination, android.os.Bundle, androidx.lifecycle.Lifecycle$State, androidx.navigation.NavViewModelStoreProvider, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.v):void");
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i11, v vVar) {
        this(navBackStackEntry, (i11 & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@k NavBackStackEntry entry, @l Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.f5290id, entry.savedState);
        g0.p(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        setMaxLifecycle(entry.maxLifecycle);
    }
}
