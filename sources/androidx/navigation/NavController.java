package androidx.navigation;

import a00.a0;
import a00.h0;
import a00.i0;
import a00.k1;
import a00.m;
import a00.n0;
import a00.r0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.flow.y;
import m80.k;
import m80.l;
import q30.k0;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2927:1\n537#1,10:3077\n179#2,2:2928\n1313#2,2:2938\n1313#2,2:2940\n179#2,2:3075\n1#3:2930\n146#4:2931\n533#5,6:2932\n1855#5,2:2942\n1855#5,2:2944\n1855#5,2:2946\n1855#5,2:2948\n1864#5,3:2950\n1774#5,4:2953\n1855#5:2957\n766#5:2958\n857#5,2:2959\n1856#5:2961\n766#5:2962\n857#5,2:2963\n766#5:2965\n857#5,2:2966\n1855#5,2:2968\n1855#5:2970\n1789#5,3:2971\n1856#5:2974\n819#5:2982\n847#5,2:2983\n1855#5:2985\n1856#5:2993\n1238#5,4:2996\n1855#5,2:3000\n1855#5,2:3002\n378#5,7:3004\n1549#5:3011\n1620#5,3:3012\n1855#5,2:3015\n1855#5,2:3017\n819#5:3019\n847#5,2:3020\n1855#5,2:3022\n1855#5,2:3024\n533#5,6:3026\n533#5,6:3032\n533#5,6:3038\n1855#5,2:3044\n1855#5,2:3046\n1864#5,3:3049\n1855#5,2:3055\n533#5,6:3057\n533#5,6:3063\n533#5,6:3069\n372#6,7:2975\n372#6,7:2986\n453#6:2994\n403#6:2995\n29#7:3048\n13404#8,3:3052\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n-1#1:3077,10\n86#1:2928,2\n724#1:2938,2\n745#1:2940,2\n2810#1:3075,2\n169#1:2931\n662#1:2932,6\n902#1:2942,2\n905#1:2944,2\n911#1:2946,2\n913#1:2948,2\n992#1:2950,3\n1054#1:2953,4\n1198#1:2957\n1200#1:2958\n1200#1:2959,2\n1198#1:2961\n1208#1:2962\n1208#1:2963,2\n1211#1:2965\n1211#1:2966,2\n1282#1:2968,2\n1296#1:2970\n1300#1:2971,3\n1296#1:2974\n1359#1:2982\n1359#1:2983,2\n1360#1:2985\n1360#1:2993\n1711#1:2996,4\n1991#1:3000,2\n2054#1:3002,2\n2064#1:3004,7\n2073#1:3011\n2073#1:3012,3\n2090#1:3015,2\n2100#1:3017,2\n2167#1:3019\n2167#1:3020,2\n2171#1:3022,2\n2215#1:3024,2\n2257#1:3026,6\n2289#1:3032,6\n2318#1:3038,6\n2332#1:3044,2\n2348#1:3046,2\n2563#1:3049,3\n2604#1:3055,2\n2704#1:3057,6\n2725#1:3063,6\n2751#1:3069,6\n1346#1:2975,7\n1362#1:2986,7\n1711#1:2994\n1711#1:2995\n2441#1:3048\n2601#1:3052,3\n*E\n"})
/* loaded from: classes3.dex */
public class NavController {

    @k
    private static final String KEY_BACK_STACK = "android-support-nav:controller:backStack";

    @k
    private static final String KEY_BACK_STACK_DEST_IDS = "android-support-nav:controller:backStackDestIds";

    @k
    private static final String KEY_BACK_STACK_IDS = "android-support-nav:controller:backStackIds";

    @k
    private static final String KEY_BACK_STACK_STATES_IDS = "android-support-nav:controller:backStackStates";

    @k
    private static final String KEY_BACK_STACK_STATES_PREFIX = "android-support-nav:controller:backStackStates:";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";

    @k
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";

    @k
    private static final String KEY_NAVIGATOR_STATE = "android-support-nav:controller:navigatorState";

    @k
    private static final String KEY_NAVIGATOR_STATE_NAMES = "android-support-nav:controller:navigatorState:names";

    @k
    private static final String TAG = "NavController";

    @k
    private final y<List<NavBackStackEntry>> _currentBackStack;

    @k
    private final x<NavBackStackEntry> _currentBackStackEntryFlow;

    @l
    private NavGraph _graph;

    @k
    private NavigatorProvider _navigatorProvider;

    @k
    private final y<List<NavBackStackEntry>> _visibleEntries;

    @l
    private Activity activity;

    @l
    private x00.l<? super NavBackStackEntry, g2> addToBackStackHandler;

    @k
    private final m<NavBackStackEntry> backQueue;

    @k
    private final List<NavBackStackEntry> backStackEntriesToDispatch;

    @k
    private final Map<Integer, String> backStackMap;

    @k
    private final Map<String, m<NavBackStackEntryState>> backStackStates;

    @l
    private Parcelable[] backStackToRestore;

    @k
    private final Map<NavBackStackEntry, NavBackStackEntry> childToParentEntries;

    @k
    private final Context context;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    private final m0<List<NavBackStackEntry>> currentBackStack;

    @k
    private final i<NavBackStackEntry> currentBackStackEntryFlow;
    private boolean deepLinkHandled;
    private int dispatchReentrantCount;
    private boolean enableOnBackPressedCallback;

    @k
    private final Map<NavBackStackEntry, Boolean> entrySavedState;

    @k
    private Lifecycle.State hostLifecycleState;

    @l
    private NavInflater inflater;

    @k
    private final LifecycleObserver lifecycleObserver;

    @l
    private LifecycleOwner lifecycleOwner;

    @k
    private final c0 navInflater$delegate;

    @k
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> navigatorState;

    @l
    private Bundle navigatorStateToRestore;

    @k
    private final OnBackPressedCallback onBackPressedCallback;

    @l
    private OnBackPressedDispatcher onBackPressedDispatcher;

    @k
    private final CopyOnWriteArrayList<OnDestinationChangedListener> onDestinationChangedListeners;

    @k
    private final Map<NavBackStackEntry, AtomicInteger> parentToChildCount;

    @l
    private x00.l<? super NavBackStackEntry, g2> popFromBackStackHandler;

    @l
    private NavControllerViewModel viewModel;

    @k
    private final m0<List<NavBackStackEntry>> visibleEntries;

    @k
    public static final Companion Companion = new Companion(null);
    private static boolean deepLinkSaveState = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @o
        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean z11) {
            NavController.deepLinkSaveState = z11;
        }

        private Companion() {
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2927:1\n146#2:2928\n146#2:2929\n2624#3,3:2930\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n*L\n297#1:2928\n330#1:2929\n360#1:2930,3\n*E\n"})
    public final class NavControllerNavigatorState extends NavigatorState {

        @k
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(@k NavController navController, Navigator<? extends NavDestination> navigator) {
            g0.p(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final void addInternal(@k NavBackStackEntry backStackEntry) {
            g0.p(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        @k
        public NavBackStackEntry createBackStackEntry(@k NavDestination destination, @l Bundle bundle) {
            g0.p(destination, "destination");
            return NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.this$0.getContext(), destination, bundle, this.this$0.getHostLifecycleState$navigation_runtime_release(), this.this$0.viewModel, null, null, 96, null);
        }

        @k
        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(@k NavBackStackEntry entry) {
            NavControllerViewModel navControllerViewModel;
            g0.p(entry, "entry");
            boolean g11 = g0.g(this.this$0.entrySavedState.get(entry), Boolean.TRUE);
            super.markTransitionComplete(entry);
            this.this$0.entrySavedState.remove(entry);
            if (this.this$0.backQueue.contains(entry)) {
                if (isNavigating()) {
                    return;
                }
                this.this$0.updateBackStackLifecycle$navigation_runtime_release();
                this.this$0._currentBackStack.d(r0.d6(this.this$0.backQueue));
                this.this$0._visibleEntries.d(this.this$0.populateVisibleEntries$navigation_runtime_release());
                return;
            }
            this.this$0.unlinkChildFromParent$navigation_runtime_release(entry);
            if (entry.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                entry.setMaxLifecycle(Lifecycle.State.DESTROYED);
            }
            m mVar = this.this$0.backQueue;
            if (mVar == null || !mVar.isEmpty()) {
                Iterator<E> it = mVar.iterator();
                while (it.hasNext()) {
                    if (g0.g(((NavBackStackEntry) it.next()).getId(), entry.getId())) {
                        break;
                    }
                }
            }
            if (!g11 && (navControllerViewModel = this.this$0.viewModel) != null) {
                navControllerViewModel.clear(entry.getId());
            }
            this.this$0.updateBackStackLifecycle$navigation_runtime_release();
            this.this$0._visibleEntries.d(this.this$0.populateVisibleEntries$navigation_runtime_release());
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(@k final NavBackStackEntry popUpTo, final boolean z11) {
            g0.p(popUpTo, "popUpTo");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(popUpTo.getDestination().getNavigatorName());
            this.this$0.entrySavedState.put(popUpTo, Boolean.valueOf(z11));
            if (!g0.g(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                g0.m(obj);
                ((NavControllerNavigatorState) obj).pop(popUpTo, z11);
            } else {
                x00.l lVar = this.this$0.popFromBackStackHandler;
                if (lVar == null) {
                    this.this$0.popBackStackFromNavigator$navigation_runtime_release(popUpTo, new x00.a<g2>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // x00.a
                        public /* bridge */ /* synthetic */ g2 invoke() {
                            invoke2();
                            return g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            super/*androidx.navigation.NavigatorState*/.pop(popUpTo, z11);
                        }
                    });
                } else {
                    lVar.invoke(popUpTo);
                    super.pop(popUpTo, z11);
                }
            }
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(@k NavBackStackEntry popUpTo, boolean z11) {
            g0.p(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, z11);
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(@k NavBackStackEntry entry) {
            g0.p(entry, "entry");
            super.prepareForTransition(entry);
            if (!this.this$0.backQueue.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.setMaxLifecycle(Lifecycle.State.STARTED);
        }

        @Override // androidx.navigation.NavigatorState
        public void push(@k NavBackStackEntry backStackEntry) {
            g0.p(backStackEntry, "backStackEntry");
            Navigator navigator = this.this$0._navigatorProvider.getNavigator(backStackEntry.getDestination().getNavigatorName());
            if (!g0.g(navigator, this.navigator)) {
                Object obj = this.this$0.navigatorState.get(navigator);
                if (obj != null) {
                    ((NavControllerNavigatorState) obj).push(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            x00.l lVar = this.this$0.addToBackStackHandler;
            if (lVar != null) {
                lVar.invoke(backStackEntry);
                addInternal(backStackEntry);
                return;
            }
            Log.i(NavController.TAG, "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@k NavController navController, @k NavDestination navDestination, @l Bundle bundle);
    }

    public NavController(@k Context context) {
        Object obj;
        g0.p(context, "context");
        this.context = context;
        Iterator it = q30.x.t(context, new x00.l<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // x00.l
            public final Context invoke(Context it2) {
                g0.p(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) obj;
        this.backQueue = new m<>();
        y<List<NavBackStackEntry>> a11 = o0.a(h0.J());
        this._currentBackStack = a11;
        this.currentBackStack = kotlinx.coroutines.flow.k.n(a11);
        y<List<NavBackStackEntry>> a12 = o0.a(h0.J());
        this._visibleEntries = a12;
        this.visibleEntries = kotlinx.coroutines.flow.k.n(a12);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.lifecycleObserver$lambda$2(NavController.this, lifecycleOwner, event);
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                NavController.this.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.addNavigator(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.addNavigator(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater$delegate = e0.c(new x00.a<NavInflater>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final NavInflater invoke() {
                NavInflater navInflater;
                navInflater = NavController.this.inflater;
                return navInflater == null ? new NavInflater(NavController.this.getContext(), NavController.this._navigatorProvider) : navInflater;
            }
        });
        x<NavBackStackEntry> b11 = kotlinx.coroutines.flow.e0.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = b11;
        this.currentBackStackEntryFlow = kotlinx.coroutines.flow.k.m(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEntryToBackStack(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        Bundle bundle2;
        m<NavBackStackEntry> mVar;
        NavDestination navDestination2;
        List<NavBackStackEntry> list2;
        NavBackStackEntry navBackStackEntry2;
        NavGraph navGraph;
        NavBackStackEntry navBackStackEntry3;
        NavBackStackEntry navBackStackEntry4;
        List<NavBackStackEntry> list3 = list;
        NavDestination destination = navBackStackEntry.getDestination();
        if (!(destination instanceof FloatingWindow)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof FloatingWindow) && popBackStackInternal$default(this, this.backQueue.last().getDestination().getId(), true, false, 4, (Object) null)) {
            }
        }
        m mVar2 = new m();
        NavBackStackEntry navBackStackEntry5 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination3 = destination;
            while (true) {
                g0.m(navDestination3);
                NavGraph parent = navDestination3.getParent();
                if (parent != null) {
                    ListIterator<NavBackStackEntry> listIterator = list3.listIterator(list3.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            navBackStackEntry4 = listIterator.previous();
                            if (g0.g(navBackStackEntry4.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            navBackStackEntry4 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntry6 = navBackStackEntry4;
                    if (navBackStackEntry6 == null) {
                        bundle2 = bundle;
                        navDestination2 = destination;
                        navBackStackEntry6 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.context, parent, bundle2, getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle2 = bundle;
                        navDestination2 = destination;
                    }
                    mVar2.addFirst(navBackStackEntry6);
                    if (this.backQueue.isEmpty() || this.backQueue.last().getDestination() != parent) {
                        navBackStackEntry2 = navBackStackEntry;
                        list2 = list;
                        mVar = mVar2;
                    } else {
                        list2 = list;
                        mVar = mVar2;
                        navBackStackEntry2 = navBackStackEntry;
                        popEntryFromBackStack$default(this, this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle2 = bundle;
                    mVar = mVar2;
                    navDestination2 = destination;
                    list2 = list3;
                    navBackStackEntry2 = navBackStackEntry;
                }
                if (parent == null || parent == navDestination) {
                    break;
                }
                list3 = list2;
                navDestination3 = parent;
                mVar2 = mVar;
                destination = navDestination2;
            }
        } else {
            bundle2 = bundle;
            mVar = mVar2;
            navDestination2 = destination;
            list2 = list3;
            navBackStackEntry2 = navBackStackEntry;
        }
        NavDestination destination2 = mVar.isEmpty() ? navDestination2 : ((NavBackStackEntry) mVar.first()).getDestination();
        while (destination2 != null && findDestination(destination2.getId(), destination2) != destination2) {
            NavGraph parent2 = destination2.getParent();
            if (parent2 != null) {
                Bundle bundle3 = (bundle2 == null || !bundle2.isEmpty()) ? bundle2 : null;
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        navBackStackEntry3 = listIterator2.previous();
                        if (g0.g(navBackStackEntry3.getDestination(), parent2)) {
                            break;
                        }
                    } else {
                        navBackStackEntry3 = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry7 = navBackStackEntry3;
                if (navBackStackEntry7 == null) {
                    navGraph = parent2;
                    navBackStackEntry7 = NavBackStackEntry.Companion.create$default(NavBackStackEntry.Companion, this.context, navGraph, parent2.addInDefaultArgs(bundle3), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
                } else {
                    navGraph = parent2;
                }
                mVar.addFirst(navBackStackEntry7);
            } else {
                navGraph = parent2;
            }
            destination2 = navGraph;
        }
        if (!mVar.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) mVar.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            NavDestination destination3 = this.backQueue.last().getDestination();
            g0.n(destination3, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) destination3).getNodes().get(navDestination2.getId()) != null) {
                break;
            } else {
                popEntryFromBackStack$default(this, this.backQueue.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry h11 = this.backQueue.h();
        if (h11 == null) {
            h11 = (NavBackStackEntry) mVar.h();
        }
        if (!g0.g(h11 != null ? h11.getDestination() : null, this._graph)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                NavBackStackEntry previous = listIterator3.previous();
                NavDestination destination4 = previous.getDestination();
                NavGraph navGraph2 = this._graph;
                g0.m(navGraph2);
                if (g0.g(destination4, navGraph2)) {
                    navBackStackEntry5 = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry8 = navBackStackEntry5;
            if (navBackStackEntry8 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.Companion;
                Context context = this.context;
                NavGraph navGraph3 = this._graph;
                g0.m(navGraph3);
                NavGraph navGraph4 = this._graph;
                g0.m(navGraph4);
                navBackStackEntry8 = NavBackStackEntry.Companion.create$default(companion, context, navGraph3, navGraph4.addInDefaultArgs(bundle2), getHostLifecycleState$navigation_runtime_release(), this.viewModel, null, null, 96, null);
            }
            mVar.addFirst(navBackStackEntry8);
        }
        for (NavBackStackEntry navBackStackEntry9 : mVar) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(navBackStackEntry9.getDestination().getNavigatorName()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.getNavigatorName() + " should already be created").toString());
            }
            navControllerNavigatorState.addInternal(navBackStackEntry9);
        }
        this.backQueue.addAll(mVar);
        this.backQueue.add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry10 : r0.J4(mVar, navBackStackEntry2)) {
            NavGraph parent3 = navBackStackEntry10.getDestination().getParent();
            if (parent3 != null) {
                linkChildToParent(navBackStackEntry10, getBackStackEntry(parent3.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEntryToBackStack$default(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i11 & 8) != 0) {
            list = h0.J();
        }
        navController.addEntryToBackStack(navDestination, bundle, navBackStackEntry, list);
    }

    @MainThread
    private final boolean clearBackStackInternal(@IdRes int i11) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(i11, null, NavOptionsBuilderKt.navOptions(new x00.l<NavOptionsBuilder, g2>() { // from class: androidx.navigation.NavController$clearBackStackInternal$restored$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(NavOptionsBuilder navOptionsBuilder) {
                invoke2(navOptionsBuilder);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NavOptionsBuilder navOptions) {
                g0.p(navOptions, "$this$navOptions");
                navOptions.setRestoreState(true);
            }
        }), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(i11, true, false);
    }

    private final boolean dispatchOnDestinationChanged() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof NavGraph)) {
            popEntryFromBackStack$default(this, this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry n11 = this.backQueue.n();
        if (n11 != null) {
            this.backStackEntriesToDispatch.add(n11);
        }
        this.dispatchReentrantCount++;
        updateBackStackLifecycle$navigation_runtime_release();
        int i11 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i11;
        if (i11 == 0) {
            List<NavBackStackEntry> d62 = r0.d6(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry : d62) {
                Iterator<OnDestinationChangedListener> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, navBackStackEntry.getDestination(), navBackStackEntry.getArguments());
                }
                this._currentBackStackEntryFlow.d(navBackStackEntry);
            }
            this._currentBackStack.d(r0.d6(this.backQueue));
            this._visibleEntries.d(populateVisibleEntries$navigation_runtime_release());
        }
        return n11 != null;
    }

    @o
    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z11) {
        Companion.enableDeepLinkSaveState(z11);
    }

    private final boolean executePopOperations(List<? extends Navigator<?>> list, NavDestination navDestination, boolean z11, boolean z12) {
        final NavController navController;
        final boolean z13;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final m<NavBackStackEntryState> mVar = new m<>();
        Iterator<? extends Navigator<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                navController = this;
                z13 = z12;
                break;
            }
            Navigator<? extends NavDestination> navigator = (Navigator) it.next();
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            navController = this;
            z13 = z12;
            popBackStackInternal(navigator, this.backQueue.last(), z13, new x00.l<NavBackStackEntry, g2>() { // from class: androidx.navigation.NavController$executePopOperations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(NavBackStackEntry navBackStackEntry) {
                    invoke2(navBackStackEntry);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry entry) {
                    g0.p(entry, "entry");
                    Ref.BooleanRef.this.element = true;
                    booleanRef.element = true;
                    navController.popEntryFromBackStack(entry, z13, mVar);
                }
            });
            if (!booleanRef2.element) {
                break;
            }
            z12 = z13;
        }
        if (z13) {
            if (!z11) {
                for (NavDestination navDestination2 : k0.F3(q30.x.t(navDestination, new x00.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$2
                    @Override // x00.l
                    public final NavDestination invoke(NavDestination destination) {
                        g0.p(destination, "destination");
                        NavGraph parent = destination.getParent();
                        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
                            return null;
                        }
                        return destination.getParent();
                    }
                }), new x00.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$3
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final Boolean invoke(NavDestination destination) {
                        Map map;
                        g0.p(destination, "destination");
                        map = NavController.this.backStackMap;
                        return Boolean.valueOf(!map.containsKey(Integer.valueOf(destination.getId())));
                    }
                })) {
                    Map<Integer, String> map = navController.backStackMap;
                    Integer valueOf = Integer.valueOf(navDestination2.getId());
                    NavBackStackEntryState h11 = mVar.h();
                    map.put(valueOf, h11 != null ? h11.getId() : null);
                }
            }
            if (!mVar.isEmpty()) {
                NavBackStackEntryState first = mVar.first();
                Iterator it2 = k0.F3(q30.x.t(findDestination$default(this, first.getDestinationId(), null, 2, null), new x00.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$5
                    @Override // x00.l
                    public final NavDestination invoke(NavDestination destination) {
                        g0.p(destination, "destination");
                        NavGraph parent = destination.getParent();
                        if (parent == null || parent.getStartDestinationId() != destination.getId()) {
                            return null;
                        }
                        return destination.getParent();
                    }
                }), new x00.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$6
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final Boolean invoke(NavDestination destination) {
                        Map map2;
                        g0.p(destination, "destination");
                        map2 = NavController.this.backStackMap;
                        return Boolean.valueOf(!map2.containsKey(Integer.valueOf(destination.getId())));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    navController.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), first.getId());
                }
                if (navController.backStackMap.values().contains(first.getId())) {
                    navController.backStackStates.put(first.getId(), mVar);
                }
            }
        }
        updateOnBackPressedCallbackEnabled();
        return booleanRef.element;
    }

    private final boolean executeRestoreState(final List<NavBackStackEntry> list, final Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list2 = (List) r0.A3(arrayList);
            if (g0.g((list2 == null || (navBackStackEntry = (NavBackStackEntry) r0.u3(list2)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list2.add(navBackStackEntry2);
            } else {
                arrayList.add(h0.U(navBackStackEntry2));
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<NavBackStackEntry> list3 : arrayList) {
            Navigator<? extends NavDestination> navigator = this._navigatorProvider.getNavigator(((NavBackStackEntry) r0.G2(list3)).getDestination().getNavigatorName());
            final Ref.IntRef intRef = new Ref.IntRef();
            navigateInternal(navigator, list3, navOptions, extras, new x00.l<NavBackStackEntry, g2>() { // from class: androidx.navigation.NavController$executeRestoreState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(NavBackStackEntry navBackStackEntry3) {
                    invoke2(navBackStackEntry3);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry entry) {
                    List<NavBackStackEntry> J;
                    g0.p(entry, "entry");
                    Ref.BooleanRef.this.element = true;
                    int indexOf = list.indexOf(entry);
                    if (indexOf != -1) {
                        int i11 = indexOf + 1;
                        J = list.subList(intRef.element, i11);
                        intRef.element = i11;
                    } else {
                        J = h0.J();
                    }
                    this.addEntryToBackStack(entry.getDestination(), bundle, entry, J);
                }
            });
        }
        return booleanRef.element;
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i11, NavDestination navDestination, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i12 & 2) != 0) {
            navDestination = null;
        }
        return navController.findDestination(i11, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$default(NavController navController, NavDestination navDestination, int i11, boolean z11, NavDestination navDestination2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i12 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.findDestinationComprehensive(navDestination, i11, z11, navDestination2);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            NavDestination navDestination = null;
            if (i11 >= length) {
                return null;
            }
            int i12 = iArr[i11];
            if (i11 == 0) {
                NavGraph navGraph3 = this._graph;
                g0.m(navGraph3);
                if (navGraph3.getId() == i12) {
                    navDestination = this._graph;
                }
            } else {
                g0.m(navGraph2);
                navDestination = navGraph2.findNode(i12);
            }
            if (navDestination == null) {
                return NavDestination.Companion.getDisplayName(this.context, i12);
            }
            if (i11 != iArr.length - 1 && (navDestination instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestination;
                    g0.m(navGraph);
                    if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestination = navGraph.findNode(navGraph.getStartDestinationId());
                }
                navGraph2 = navGraph;
            }
            i11++;
        }
    }

    private final <T> String generateRouteFilled(T t11) {
        NavDestination findDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), RouteSerializerKt.generateHashCode(f50.k0.h(kotlin.jvm.internal.o0.d(t11.getClass()))), true, null, 4, null);
        if (findDestinationComprehensive$default == null) {
            throw new IllegalArgumentException(("Destination with route " + kotlin.jvm.internal.o0.d(t11.getClass()).C() + " cannot be found in navigation graph " + this._graph).toString());
        }
        Map<String, NavArgument> arguments = findDestinationComprehensive$default.getArguments();
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(arguments.size()));
        Iterator<T> it = arguments.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(t11, linkedHashMap);
    }

    private final int getDestinationCountOnBackStack() {
        m<NavBackStackEntry> mVar = this.backQueue;
        int i11 = 0;
        if (mVar != null && mVar.isEmpty()) {
            return 0;
        }
        Iterator<NavBackStackEntry> it = mVar.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof NavGraph) && (i11 = i11 + 1) < 0) {
                h0.a0();
            }
        }
        return i11;
    }

    private final NavGraph getTopGraph(m<NavBackStackEntry> mVar) {
        NavDestination navDestination;
        NavBackStackEntry n11 = mVar.n();
        if (n11 == null || (navDestination = n11.getDestination()) == null) {
            navDestination = this._graph;
            g0.m(navDestination);
        }
        if (navDestination instanceof NavGraph) {
            return (NavGraph) navDestination;
        }
        NavGraph parent = navDestination.getParent();
        g0.m(parent);
        return parent;
    }

    private final List<NavBackStackEntry> instantiateBackStack(m<NavBackStackEntryState> mVar) {
        NavDestination graph;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry n11 = this.backQueue.n();
        if (n11 == null || (graph = n11.getDestination()) == null) {
            graph = getGraph();
        }
        if (mVar != null) {
            NavDestination navDestination = graph;
            for (NavBackStackEntryState navBackStackEntryState : mVar) {
                NavDestination findDestinationComprehensive$default = findDestinationComprehensive$default(this, navDestination, navBackStackEntryState.getDestinationId(), true, null, 4, null);
                if (findDestinationComprehensive$default == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + navDestination).toString());
                }
                arrayList.add(navBackStackEntryState.instantiate(this.context, findDestinationComprehensive$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel));
                navDestination = findDestinationComprehensive$default;
            }
        }
        return arrayList;
    }

    private final boolean launchSingleTopInternal(NavDestination navDestination, Bundle bundle) {
        int i11;
        NavDestination destination;
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        m<NavBackStackEntry> mVar = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            if (listIterator.previous().getDestination() == navDestination) {
                i11 = listIterator.nextIndex();
                break;
            }
        }
        if (i11 == -1) {
            return false;
        }
        if (navDestination instanceof NavGraph) {
            List I3 = k0.I3(k0.N1(NavGraph.Companion.childHierarchy((NavGraph) navDestination), new x00.l<NavDestination, Integer>() { // from class: androidx.navigation.NavController$launchSingleTopInternal$childHierarchyId$1
                @Override // x00.l
                public final Integer invoke(NavDestination it) {
                    g0.p(it, "it");
                    return Integer.valueOf(it.getId());
                }
            }));
            if (this.backQueue.size() - i11 != I3.size()) {
                return false;
            }
            m<NavBackStackEntry> mVar2 = this.backQueue;
            List<NavBackStackEntry> subList = mVar2.subList(i11, mVar2.size());
            ArrayList arrayList = new ArrayList(i0.d0(subList, 10));
            Iterator<T> it = subList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NavBackStackEntry) it.next()).getDestination().getId()));
            }
            if (!g0.g(arrayList, I3)) {
                return false;
            }
        } else if (currentBackStackEntry == null || (destination = currentBackStackEntry.getDestination()) == null || navDestination.getId() != destination.getId()) {
            return false;
        }
        m<NavBackStackEntry> mVar3 = new m();
        while (h0.L(this.backQueue) >= i11) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) a00.m0.Q0(this.backQueue);
            unlinkChildFromParent$navigation_runtime_release(navBackStackEntry);
            mVar3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().addInDefaultArgs(bundle)));
        }
        for (NavBackStackEntry navBackStackEntry2 : mVar3) {
            NavGraph parent = navBackStackEntry2.getDestination().getParent();
            if (parent != null) {
                linkChildToParent(navBackStackEntry2, getBackStackEntry(parent.getId()));
            }
            this.backQueue.add(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : mVar3) {
            this._navigatorProvider.getNavigator(navBackStackEntry3.getDestination().getNavigatorName()).onLaunchSingleTop(navBackStackEntry3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$2(NavController this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        g0.p(this$0, "this$0");
        g0.p(lifecycleOwner, "<anonymous parameter 0>");
        g0.p(event, "event");
        this$0.hostLifecycleState = event.getTargetState();
        if (this$0._graph != null) {
            Iterator it = r0.d6(this$0.backQueue).iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).handleLifecycleEvent(event);
            }
        }
    }

    private final void linkChildToParent(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.childToParentEntries.put(navBackStackEntry, navBackStackEntry2);
        if (this.parentToChildCount.get(navBackStackEntry2) == null) {
            this.parentToChildCount.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(navBackStackEntry2);
        g0.m(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i11 & 2) != 0) {
            navOptions = null;
        }
        if ((i11 & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    private final void navigateInternal(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras, x00.l<? super NavBackStackEntry, g2> lVar) {
        this.addToBackStackHandler = lVar;
        navigator.navigate(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    public static /* synthetic */ void navigateInternal$default(NavController navController, Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, x00.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l<NavBackStackEntry, g2>() { // from class: androidx.navigation.NavController$navigateInternal$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry it) {
                    g0.p(it, "it");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(NavBackStackEntry navBackStackEntry) {
                    invoke2(navBackStackEntry);
                    return g2.f100423a;
                }
            };
        }
        navController.navigateInternal(navigator, list, navOptions, extras, lVar);
    }

    @MainThread
    private final void onGraphCreated(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.navigatorStateToRestore;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(KEY_NAVIGATOR_STATE_NAMES)) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                g0.o(name, "name");
                Navigator navigator = navigatorProvider.getNavigator(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    navigator.onRestoreState(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                g0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination findDestination$default = findDestination$default(this, navBackStackEntryState.getDestinationId(), null, 2, null);
                if (findDestination$default == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.Companion.getDisplayName(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + getCurrentDestination());
                }
                NavBackStackEntry instantiate = navBackStackEntryState.instantiate(this.context, findDestination$default, getHostLifecycleState$navigation_runtime_release(), this.viewModel);
                Navigator<? extends NavDestination> navigator2 = this._navigatorProvider.getNavigator(findDestination$default.getNavigatorName());
                Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.navigatorState;
                NavControllerNavigatorState navControllerNavigatorState = map.get(navigator2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigator2);
                    map.put(navigator2, navControllerNavigatorState);
                }
                this.backQueue.add(instantiate);
                navControllerNavigatorState.addInternal(instantiate);
                NavGraph parent = instantiate.getDestination().getParent();
                if (parent != null) {
                    linkChildToParent(instantiate, getBackStackEntry(parent.getId()));
                }
            }
            updateOnBackPressedCallbackEnabled();
            this.backStackToRestore = null;
        }
        Collection<Navigator<? extends NavDestination>> values = this._navigatorProvider.getNavigators().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : values) {
            if (!((Navigator) obj).isAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator3 : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.navigatorState;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator3);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator3);
                map2.put(navigator3, navControllerNavigatorState2);
            }
            navigator3.onAttach(navControllerNavigatorState2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            dispatchOnDestinationChanged();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            g0.m(activity);
            if (handleDeepLink(activity.getIntent())) {
                return;
            }
        }
        NavGraph navGraph = this._graph;
        g0.m(navGraph);
        navigate(navGraph, bundle, (NavOptions) null, (Navigator.Extras) null);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return navController.popBackStack(str, z11, z12);
    }

    private final void popBackStackInternal(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z11, x00.l<? super NavBackStackEntry, g2> lVar) {
        this.popFromBackStackHandler = lVar;
        navigator.popBackStack(navBackStackEntry, z11);
        this.popFromBackStackHandler = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popBackStackInternal$default(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z11, x00.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            lVar = new x00.l<NavBackStackEntry, g2>() { // from class: androidx.navigation.NavController$popBackStackInternal$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavBackStackEntry it) {
                    g0.p(it, "it");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(NavBackStackEntry navBackStackEntry2) {
                    invoke2(navBackStackEntry2);
                    return g2.f100423a;
                }
            };
        }
        navController.popBackStackInternal(navigator, navBackStackEntry, z11, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void popEntryFromBackStack(NavBackStackEntry navBackStackEntry, boolean z11, m<NavBackStackEntryState> mVar) {
        NavControllerViewModel navControllerViewModel;
        m0<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        NavBackStackEntry last = this.backQueue.last();
        if (!g0.g(last, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.getDestination() + ", which is not the top of the back stack (" + last.getDestination() + ')').toString());
        }
        a00.m0.Q0(this.backQueue);
        NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(last.getDestination().getNavigatorName()));
        boolean z12 = true;
        if ((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (value = transitionsInProgress.getValue()) == null || !value.contains(last)) && !this.parentToChildCount.containsKey(last)) {
            z12 = false;
        }
        Lifecycle.State currentState = last.getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z11) {
                last.setMaxLifecycle(state);
                mVar.addFirst(new NavBackStackEntryState(last));
            }
            if (z12) {
                last.setMaxLifecycle(state);
            } else {
                last.setMaxLifecycle(Lifecycle.State.DESTROYED);
                unlinkChildFromParent$navigation_runtime_release(last);
            }
        }
        if (z11 || z12 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.clear(last.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void popEntryFromBackStack$default(NavController navController, NavBackStackEntry navBackStackEntry, boolean z11, m mVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            mVar = new m();
        }
        navController.popEntryFromBackStack(navBackStackEntry, z11, mVar);
    }

    private final boolean restoreStateInternal(int i11, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(i11))) {
            return false;
        }
        final String str = this.backStackMap.get(Integer.valueOf(i11));
        a00.m0.I0(this.backStackMap.values(), new x00.l<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(g0.g(str2, str));
            }
        });
        return executeRestoreState(instantiateBackStack((m) x0.k(this.backStackStates).remove(str)), bundle, navOptions, extras);
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        int i11 = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        g0.m(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        g0.m(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        g0.m(intArray);
        List<Integer> lz2 = a0.lz(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        if (lz2.size() < 2) {
            return false;
        }
        int intValue = ((Number) a00.m0.Q0(lz2)).intValue();
        if (parcelableArrayList != null) {
        }
        NavDestination findDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), intValue, false, null, 4, null);
        if (findDestinationComprehensive$default instanceof NavGraph) {
            intValue = NavGraph.Companion.findStartDestination((NavGraph) findDestinationComprehensive$default).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || intValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder createDeepLink = createDeepLink();
        Bundle bundleOf = BundleKt.bundleOf(h1.a(KEY_DEEP_LINK_INTENT, intent));
        Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle != null) {
            bundleOf.putAll(bundle);
        }
        createDeepLink.setArguments(bundleOf);
        for (Object obj : lz2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            createDeepLink.addDestination(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i11) : null);
            i11 = i12;
        }
        createDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        NavDestination currentDestination = getCurrentDestination();
        g0.m(currentDestination);
        int id2 = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id2) {
                Bundle bundle = new Bundle();
                Activity activity = this.activity;
                if (activity != null) {
                    g0.m(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        g0.m(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            g0.m(activity3);
                            bundle.putParcelable(KEY_DEEP_LINK_INTENT, activity3.getIntent());
                            NavGraph topGraph = getTopGraph(this.backQueue);
                            Activity activity4 = this.activity;
                            g0.m(activity4);
                            Intent intent = activity4.getIntent();
                            g0.o(intent, "activity!!.intent");
                            NavDestination.DeepLinkMatch matchDeepLinkComprehensive = topGraph.matchDeepLinkComprehensive(new NavDeepLinkRequest(intent), true, true, topGraph);
                            if ((matchDeepLinkComprehensive != null ? matchDeepLinkComprehensive.getMatchingArgs() : null) != null) {
                                bundle.putAll(matchDeepLinkComprehensive.getDestination().addInDefaultArgs(matchDeepLinkComprehensive.getMatchingArgs()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundle).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            id2 = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (getDestinationCountOnBackStack() > 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(@k OnDestinationChangedListener listener) {
        g0.p(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (this.backQueue.isEmpty()) {
            return;
        }
        NavBackStackEntry last = this.backQueue.last();
        listener.onDestinationChanged(this, last.getDestination(), last.getArguments());
    }

    @MainThread
    public final boolean clearBackStack(@k String route) {
        g0.p(route, "route");
        return clearBackStackInternal(route) && dispatchOnDestinationChanged();
    }

    @k
    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean z11) {
        this.enableOnBackPressedCallback = z11;
        updateOnBackPressedCallbackEnabled();
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@IdRes int i11, @l NavDestination navDestination) {
        NavDestination navDestination2;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        g0.m(navGraph);
        if (navGraph.getId() == i11) {
            if (navDestination == null) {
                return this._graph;
            }
            if (g0.g(this._graph, navDestination) && navDestination.getParent() == null) {
                return this._graph;
            }
        }
        NavBackStackEntry n11 = this.backQueue.n();
        if (n11 == null || (navDestination2 = n11.getDestination()) == null) {
            navDestination2 = this._graph;
            g0.m(navDestination2);
        }
        return findDestinationComprehensive(navDestination2, i11, false, navDestination);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestinationComprehensive(@k NavDestination navDestination, @IdRes int i11, boolean z11, @l NavDestination navDestination2) {
        NavGraph navGraph;
        g0.p(navDestination, "<this>");
        if (navDestination.getId() == i11 && (navDestination2 == null || (g0.g(navDestination, navDestination2) && g0.g(navDestination.getParent(), navDestination2.getParent())))) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            NavGraph parent = navDestination.getParent();
            g0.m(parent);
            navGraph = parent;
        }
        return navGraph.findNodeComprehensive(i11, navGraph, z11, navDestination2);
    }

    @k
    public NavBackStackEntry getBackStackEntry(@IdRes int i11) {
        NavBackStackEntry navBackStackEntry;
        m<NavBackStackEntry> mVar = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            if (navBackStackEntry.getDestination().getId() == i11) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i11 + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final m0<List<NavBackStackEntry>> getCurrentBackStack() {
        return this.currentBackStack;
    }

    @l
    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.backQueue.n();
    }

    @k
    public final i<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return this.currentBackStackEntryFlow;
    }

    @l
    public NavDestination getCurrentDestination() {
        NavBackStackEntry currentBackStackEntry = getCurrentBackStackEntry();
        if (currentBackStackEntry != null) {
            return currentBackStackEntry.getDestination();
        }
        return null;
    }

    @MainThread
    @k
    public NavGraph getGraph() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        g0.n(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    @k
    public final Lifecycle.State getHostLifecycleState$navigation_runtime_release() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    @k
    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater$delegate.getValue();
    }

    @k
    public NavigatorProvider getNavigatorProvider() {
        return this._navigatorProvider;
    }

    @l
    public NavBackStackEntry getPreviousBackStackEntry() {
        Object obj;
        Iterator it = r0.c5(this.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = q30.x.j(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                break;
            }
        }
        return (NavBackStackEntry) obj;
    }

    @k
    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int i11) {
        if (this.viewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().");
        }
        NavBackStackEntry backStackEntry = getBackStackEntry(i11);
        if (backStackEntry.getDestination() instanceof NavGraph) {
            return backStackEntry;
        }
        throw new IllegalArgumentException(("No NavGraph with ID " + i11 + " is on the NavController's back stack").toString());
    }

    @k
    public final m0<List<NavBackStackEntry>> getVisibleEntries() {
        return this.visibleEntries;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleDeepLink(@m80.l android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.handleDeepLink(android.content.Intent):boolean");
    }

    @w00.k
    @MainThread
    public final <T> void navigate(@k T route) {
        g0.p(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @MainThread
    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null ? tryRelaunchUpToExplicitStack() : tryRelaunchUpToGeneratedStack();
    }

    @w00.k
    @MainThread
    public final <T> boolean popBackStack(@k T route, boolean z11) {
        g0.p(route, "route");
        return popBackStack$default(this, (Object) route, z11, false, 4, (Object) null);
    }

    public final void popBackStackFromNavigator$navigation_runtime_release(@k NavBackStackEntry popUpTo, @k x00.a<g2> onComplete) {
        g0.p(popUpTo, "popUpTo");
        g0.p(onComplete, "onComplete");
        int indexOf = this.backQueue.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i(TAG, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i11 = indexOf + 1;
        if (i11 != this.backQueue.size()) {
            popBackStackInternal(this.backQueue.get(i11).getDestination().getId(), true, false);
        }
        popEntryFromBackStack$default(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        updateOnBackPressedCallbackEnabled();
        dispatchOnDestinationChanged();
    }

    @k
    public final List<NavBackStackEntry> populateVisibleEntries$navigation_runtime_release() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<NavBackStackEntry> value = ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            a00.m0.s0(arrayList, arrayList2);
        }
        m<NavBackStackEntry> mVar = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : mVar) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        a00.m0.s0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void removeOnDestinationChangedListener(@k OnDestinationChangedListener listener) {
        g0.p(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    @CallSuper
    public void restoreState(@l Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = bundle.getBundle(KEY_NAVIGATOR_STATE);
        this.backStackToRestore = bundle.getParcelableArray(KEY_BACK_STACK);
        this.backStackStates.clear();
        int[] intArray = bundle.getIntArray(KEY_BACK_STACK_DEST_IDS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_BACK_STACK_IDS);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i11]), stringArrayList.get(i12));
                i11++;
                i12++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(KEY_BACK_STACK_STATES_IDS);
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(KEY_BACK_STACK_STATES_PREFIX + id2);
                if (parcelableArray != null) {
                    Map<String, m<NavBackStackEntryState>> map = this.backStackStates;
                    g0.o(id2, "id");
                    m<NavBackStackEntryState> mVar = new m<>(parcelableArray.length);
                    Iterator a11 = h.a(parcelableArray);
                    while (a11.hasNext()) {
                        Parcelable parcelable = (Parcelable) a11.next();
                        g0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        mVar.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(id2, mVar);
                }
            }
        }
        this.deepLinkHandled = bundle.getBoolean(KEY_DEEP_LINK_HANDLED);
    }

    @l
    @CallSuper
    public Bundle saveState() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this._navigatorProvider.getNavigators().entrySet()) {
            String key = entry.getKey();
            Bundle onSaveState = entry.getValue().onSaveState();
            if (onSaveState != null) {
                arrayList.add(key);
                bundle2.putBundle(key, onSaveState);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList(KEY_NAVIGATOR_STATE_NAMES, arrayList);
            bundle.putBundle(KEY_NAVIGATOR_STATE, bundle2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<NavBackStackEntry> it = this.backQueue.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                parcelableArr[i11] = new NavBackStackEntryState(it.next());
                i11++;
            }
            bundle.putParcelableArray(KEY_BACK_STACK, parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i12 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int intValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i12] = intValue;
                arrayList2.add(value);
                i12++;
            }
            bundle.putIntArray(KEY_BACK_STACK_DEST_IDS, iArr);
            bundle.putStringArrayList(KEY_BACK_STACK_IDS, arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, m<NavBackStackEntryState>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                m<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i13 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        h0.b0();
                    }
                    parcelableArr2[i13] = navBackStackEntryState;
                    i13 = i14;
                }
                bundle.putParcelableArray(KEY_BACK_STACK_STATES_PREFIX + key2, parcelableArr2);
            }
            bundle.putStringArrayList(KEY_BACK_STACK_STATES_IDS, arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundle;
    }

    @CallSuper
    @MainThread
    public void setGraph(@k NavGraph graph) {
        g0.p(graph, "graph");
        setGraph(graph, (Bundle) null);
    }

    public final void setHostLifecycleState$navigation_runtime_release(@k Lifecycle.State state) {
        g0.p(state, "<set-?>");
        this.hostLifecycleState = state;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(@k LifecycleOwner owner) {
        Lifecycle lifecycle;
        g0.p(owner, "owner");
        if (g0.g(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(@k NavigatorProvider navigatorProvider) {
        g0.p(navigatorProvider, "navigatorProvider");
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call");
        }
        this._navigatorProvider = navigatorProvider;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(@k OnBackPressedDispatcher dispatcher) {
        g0.p(dispatcher, "dispatcher");
        if (g0.g(dispatcher, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = dispatcher;
        dispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.lifecycleObserver);
        lifecycle.addObserver(this.lifecycleObserver);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(@k ViewModelStore viewModelStore) {
        g0.p(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.Companion;
        if (g0.g(navControllerViewModel, companion.getInstance(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.getInstance(viewModelStore);
    }

    @l
    public final NavBackStackEntry unlinkChildFromParent$navigation_runtime_release(@k NavBackStackEntry child) {
        g0.p(child, "child");
        NavBackStackEntry remove = this.childToParentEntries.remove(child);
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(remove);
        Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(this._navigatorProvider.getNavigator(remove.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.markTransitionComplete(remove);
            }
            this.parentToChildCount.remove(remove);
        }
        return remove;
    }

    public final void updateBackStackLifecycle$navigation_runtime_release() {
        AtomicInteger atomicInteger;
        m0<Set<NavBackStackEntry>> transitionsInProgress;
        Set<NavBackStackEntry> value;
        List<NavBackStackEntry> d62 = r0.d6(this.backQueue);
        if (d62.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) r0.u3(d62)).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof FloatingWindow) {
            Iterator it = r0.c5(d62).iterator();
            while (it.hasNext()) {
                NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (NavBackStackEntry navBackStackEntry : r0.c5(d62)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination3 = navBackStackEntry.getDestination();
            if (destination != null && destination3.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = this.navigatorState.get(getNavigatorProvider().getNavigator(navBackStackEntry.getDestination().getNavigatorName()));
                    if (g0.g((navControllerNavigatorState == null || (transitionsInProgress = navControllerNavigatorState.getTransitionsInProgress()) == null || (value = transitionsInProgress.getValue()) == null) ? null : Boolean.valueOf(value.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInteger = this.parentToChildCount.get(navBackStackEntry)) != null && atomicInteger.get() == 0)) {
                        hashMap.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        hashMap.put(navBackStackEntry, state);
                    }
                }
                NavDestination navDestination = (NavDestination) r0.L2(arrayList);
                if (navDestination != null && navDestination.getId() == destination3.getId()) {
                    a00.m0.O0(arrayList);
                }
                destination = destination.getParent();
            } else if (arrayList.isEmpty() || destination3.getId() != ((NavDestination) r0.G2(arrayList)).getId()) {
                navBackStackEntry.setMaxLifecycle(Lifecycle.State.CREATED);
            } else {
                NavDestination navDestination2 = (NavDestination) a00.m0.O0(arrayList);
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    navBackStackEntry.setMaxLifecycle(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        hashMap.put(navBackStackEntry, state2);
                    }
                }
                NavGraph parent = navDestination2.getParent();
                if (parent != null && !arrayList.contains(parent)) {
                    arrayList.add(parent);
                }
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : d62) {
            Lifecycle.State state3 = (Lifecycle.State) hashMap.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.setMaxLifecycle(state3);
            } else {
                navBackStackEntry2.updateState();
            }
        }
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i11 & 2) != 0) {
            navOptions = null;
        }
        if ((i11 & 4) != 0) {
            extras = null;
        }
        navController.navigate((NavController) obj, navOptions, extras);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        int generateHashCode = RouteSerializerKt.generateHashCode(f50.k0.j(null));
        if (findDestinationComprehensive$default(navController, navController.getGraph(), generateHashCode, true, null, 4, null) != null) {
            return navController.popBackStack(generateHashCode, z11, z12);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Destination with route ");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(kotlin.jvm.internal.o0.d(Object.class).C());
        sb2.append(" cannot be found in navigation graph ");
        sb2.append(navController.getGraph());
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @w00.k
    @MainThread
    public final <T> void navigate(@k T route, @l NavOptions navOptions) {
        g0.p(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @w00.k
    @MainThread
    public final boolean popBackStack(@k String route, boolean z11) {
        g0.p(route, "route");
        return popBackStack$default(this, route, z11, false, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i11) {
        setGraph(getNavInflater().inflate(i11), (Bundle) null);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        return navController.popBackStackInternal(i11, z11, z12);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int i11) {
        return clearBackStackInternal(i11) && dispatchOnDestinationChanged();
    }

    @w00.k
    @MainThread
    public final void navigate(@k String route) {
        g0.p(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @MainThread
    public boolean popBackStack() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination currentDestination = getCurrentDestination();
        g0.m(currentDestination);
        return popBackStack(currentDestination.getId(), true);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int i11, @l Bundle bundle) {
        setGraph(getNavInflater().inflate(i11), bundle);
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int i11, boolean z11, boolean z12) {
        NavDestination navDestination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = r0.c5(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigator = this._navigatorProvider.getNavigator(navDestination.getNavigatorName());
            if (z11 || navDestination.getId() != i11) {
                arrayList.add(navigator);
            }
            if (navDestination.getId() == i11) {
                break;
            }
        }
        if (navDestination == null) {
            Log.i(TAG, "Ignoring popBackStack to destination " + NavDestination.Companion.getDisplayName(this.context, i11) + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, navDestination, z11, z12);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, Object obj, boolean z11, boolean z12, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return navController.popBackStackInternal((NavController) obj, z11, z12);
    }

    @w00.k
    @MainThread
    public final void navigate(@k String route, @l NavOptions navOptions) {
        g0.p(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@k NavGraph graph, @l Bundle bundle) {
        NavController navController;
        g0.p(graph, "graph");
        if (!this.backQueue.isEmpty() && getHostLifecycleState$navigation_runtime_release() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!g0.g(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                for (Integer id2 : new ArrayList(this.backStackMap.keySet())) {
                    g0.o(id2, "id");
                    clearBackStackInternal(id2.intValue());
                }
                navController = this;
                popBackStackInternal$default(navController, navGraph.getId(), true, false, 4, (Object) null);
            } else {
                navController = this;
            }
            navController._graph = graph;
            onGraphCreated(bundle);
            return;
        }
        int size = graph.getNodes().size();
        for (int i11 = 0; i11 < size; i11++) {
            NavDestination valueAt = graph.getNodes().valueAt(i11);
            NavGraph navGraph2 = this._graph;
            g0.m(navGraph2);
            int keyAt = navGraph2.getNodes().keyAt(i11);
            NavGraph navGraph3 = this._graph;
            g0.m(navGraph3);
            navGraph3.getNodes().replace(keyAt, valueAt);
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            List<NavDestination> c12 = n0.c1(k0.I3(NavDestination.Companion.getHierarchy(navBackStackEntry.getDestination())));
            NavDestination navDestination = this._graph;
            g0.m(navDestination);
            for (NavDestination navDestination2 : c12) {
                if (!g0.g(navDestination2, this._graph) || !g0.g(navDestination, graph)) {
                    if (navDestination instanceof NavGraph) {
                        navDestination = ((NavGraph) navDestination).findNode(navDestination2.getId());
                        g0.m(navDestination);
                    }
                }
            }
            navBackStackEntry.setDestination(navDestination);
        }
    }

    @MainThread
    public final /* synthetic */ <T> boolean clearBackStack() {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        return clearBackStack(RouteSerializerKt.generateHashCode(f50.k0.j(null)));
    }

    @MainThread
    public void navigate(@IdRes int i11) {
        navigate(i11, (Bundle) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i11, boolean z11) {
        return popBackStack(i11, z11, false);
    }

    @MainThread
    public final <T> boolean clearBackStack(@k T route) {
        g0.p(route, "route");
        return clearBackStackInternal(generateRouteFilled(route)) && dispatchOnDestinationChanged();
    }

    @MainThread
    public void navigate(@IdRes int i11, @l Bundle bundle) {
        navigate(i11, bundle, (NavOptions) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int i11, boolean z11, boolean z12) {
        return popBackStackInternal(i11, z11, z12) && dispatchOnDestinationChanged();
    }

    private final boolean restoreStateInternal(String str) {
        NavBackStackEntryState h11;
        int hashCode = NavDestination.Companion.createRoute(str).hashCode();
        if (this.backStackMap.containsKey(Integer.valueOf(hashCode))) {
            return restoreStateInternal(hashCode, null, null, null);
        }
        NavDestination findDestination = findDestination(str);
        if (findDestination != null) {
            final String str2 = this.backStackMap.get(Integer.valueOf(findDestination.getId()));
            a00.m0.I0(this.backStackMap.values(), new x00.l<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(String str3) {
                    return Boolean.valueOf(g0.g(str3, str2));
                }
            });
            m<NavBackStackEntryState> mVar = (m) x0.k(this.backStackStates).remove(str2);
            NavDestination.DeepLinkMatch matchRoute = findDestination.matchRoute(str);
            g0.m(matchRoute);
            if (matchRoute.hasMatchingArgs((mVar == null || (h11 = mVar.h()) == null) ? null : h11.getArgs())) {
                return executeRestoreState(instantiateBackStack(mVar), null, null, null);
            }
            return false;
        }
        throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + getCurrentDestination()).toString());
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findDestination(@k String route) {
        g0.p(route, "route");
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        g0.m(navGraph);
        if (!g0.g(navGraph.getRoute(), route)) {
            NavGraph navGraph2 = this._graph;
            g0.m(navGraph2);
            if (navGraph2.matchRoute(route) == null) {
                return getTopGraph(this.backQueue).findNode(route);
            }
        }
        return this._graph;
    }

    @MainThread
    public void navigate(@IdRes int i11, @l Bundle bundle, @l NavOptions navOptions) {
        navigate(i11, bundle, navOptions, (Navigator.Extras) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void navigate(@androidx.annotation.IdRes int r12, @m80.l android.os.Bundle r13, @m80.l androidx.navigation.NavOptions r14, @m80.l androidx.navigation.Navigator.Extras r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @w00.k
    @MainThread
    public final boolean popBackStack(@k String route, boolean z11, boolean z12) {
        g0.p(route, "route");
        return popBackStackInternal(route, z11, z12) && dispatchOnDestinationChanged();
    }

    @MainThread
    private final boolean clearBackStackInternal(String str) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).setNavigating(true);
        }
        boolean restoreStateInternal = restoreStateInternal(str);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).setNavigating(false);
        }
        return restoreStateInternal && popBackStackInternal(str, true, false);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z11, boolean z12, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return navController.popBackStack((NavController) obj, z11, z12);
    }

    @w00.k
    @MainThread
    public final /* synthetic */ <T> boolean popBackStack(boolean z11, boolean z12) {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        int generateHashCode = RouteSerializerKt.generateHashCode(f50.k0.j(null));
        if (findDestinationComprehensive$default(this, getGraph(), generateHashCode, true, null, 4, null) != null) {
            return popBackStack(generateHashCode, z11, z12);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Destination with route ");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(kotlin.jvm.internal.o0.d(Object.class).C());
        sb2.append(" cannot be found in navigation graph ");
        sb2.append(getGraph());
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @k
    public final NavBackStackEntry getBackStackEntry(@k String route) {
        NavBackStackEntry navBackStackEntry;
        g0.p(route, "route");
        m<NavBackStackEntry> mVar = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            if (navBackStackEntry2.getDestination().hasRoute(route, navBackStackEntry2.getArguments())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        if (navBackStackEntry3 != null) {
            return navBackStackEntry3;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + getCurrentDestination()).toString());
    }

    private final <T> boolean popBackStackInternal(T t11, boolean z11, boolean z12) {
        return popBackStackInternal(generateRouteFilled(t11), z11, z12);
    }

    @w00.k
    @MainThread
    public final <T> boolean popBackStack(@k T route, boolean z11, boolean z12) {
        g0.p(route, "route");
        return popBackStackInternal((NavController) route, z11, z12) && dispatchOnDestinationChanged();
    }

    private final boolean popBackStackInternal(String str, boolean z11, boolean z12) {
        NavBackStackEntry navBackStackEntry;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        m<NavBackStackEntry> mVar = this.backQueue;
        ListIterator<NavBackStackEntry> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            boolean hasRoute = navBackStackEntry2.getDestination().hasRoute(str, navBackStackEntry2.getArguments());
            if (z11 || !hasRoute) {
                arrayList.add(this._navigatorProvider.getNavigator(navBackStackEntry2.getDestination().getNavigatorName()));
            }
            if (hasRoute) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        NavDestination destination = navBackStackEntry3 != null ? navBackStackEntry3.getDestination() : null;
        if (destination == null) {
            Log.i(TAG, "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
            return false;
        }
        return executePopOperations(arrayList, destination, z11, z12);
    }

    @w00.k
    @MainThread
    public final /* synthetic */ <T> boolean popBackStack(boolean z11) {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        int generateHashCode = RouteSerializerKt.generateHashCode(f50.k0.j(null));
        if (findDestinationComprehensive$default(this, getGraph(), generateHashCode, true, null, 4, null) != null) {
            return popBackStack(generateHashCode, z11, false);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Destination with route ");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(kotlin.jvm.internal.o0.d(Object.class).C());
        sb2.append(" cannot be found in navigation graph ");
        sb2.append(getGraph());
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final /* synthetic */ <T> NavBackStackEntry getBackStackEntry() {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        NavBackStackEntry navBackStackEntry = null;
        int generateHashCode = RouteSerializerKt.generateHashCode(f50.k0.j(null));
        if (findDestinationComprehensive$default(this, getGraph(), generateHashCode, true, null, 4, null) != null) {
            List<NavBackStackEntry> value = getCurrentBackStack().getValue();
            ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                NavBackStackEntry previous = listIterator.previous();
                if (previous.getDestination().getId() == generateHashCode) {
                    navBackStackEntry = previous;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            if (navBackStackEntry2 != null) {
                return navBackStackEntry2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No destination with route ");
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            sb2.append(kotlin.jvm.internal.o0.d(Object.class).C());
            sb2.append(" is on the NavController's back stack. The current destination is ");
            sb2.append(getCurrentDestination());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Destination with route ");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb3.append(kotlin.jvm.internal.o0.d(Object.class).C());
        sb3.append(" cannot be found in navigation graph ");
        sb3.append(getGraph());
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    @k
    public final <T> NavBackStackEntry getBackStackEntry(@k T route) {
        g0.p(route, "route");
        return getBackStackEntry(generateRouteFilled(route));
    }

    @MainThread
    public void navigate(@k Uri deepLink) {
        g0.p(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(@k Uri deepLink, @l NavOptions navOptions) {
        g0.p(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@k Uri deepLink, @l NavOptions navOptions, @l Navigator.Extras extras) {
        g0.p(deepLink, "deepLink");
        navigate(new NavDeepLinkRequest(deepLink, null, null), navOptions, extras);
    }

    @MainThread
    public void navigate(@k NavDeepLinkRequest request) {
        g0.p(request, "request");
        navigate(request, (NavOptions) null);
    }

    @MainThread
    public void navigate(@k NavDeepLinkRequest request, @l NavOptions navOptions) {
        g0.p(request, "request");
        navigate(request, navOptions, (Navigator.Extras) null);
    }

    @MainThread
    public void navigate(@k NavDeepLinkRequest request, @l NavOptions navOptions, @l Navigator.Extras extras) {
        g0.p(request, "request");
        if (this._graph != null) {
            NavGraph topGraph = getTopGraph(this.backQueue);
            NavDestination.DeepLinkMatch matchDeepLinkComprehensive = topGraph.matchDeepLinkComprehensive(request, true, true, topGraph);
            if (matchDeepLinkComprehensive != null) {
                Bundle addInDefaultArgs = matchDeepLinkComprehensive.getDestination().addInDefaultArgs(matchDeepLinkComprehensive.getMatchingArgs());
                if (addInDefaultArgs == null) {
                    addInDefaultArgs = new Bundle();
                }
                NavDestination destination = matchDeepLinkComprehensive.getDestination();
                Intent intent = new Intent();
                intent.setDataAndType(request.getUri(), request.getMimeType());
                intent.setAction(request.getAction());
                addInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(destination, addInDefaultArgs, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0123 A[LOOP:1: B:20:0x011d->B:22:0x0123, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void navigate(final androidx.navigation.NavDestination r22, android.os.Bundle r23, androidx.navigation.NavOptions r24, androidx.navigation.Navigator.Extras r25) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @MainThread
    public void navigate(@k NavDirections directions) {
        g0.p(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(@k NavDirections directions, @l NavOptions navOptions) {
        g0.p(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(@k NavDirections directions, @k Navigator.Extras navigatorExtras) {
        g0.p(directions, "directions");
        g0.p(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    @MainThread
    public final void navigate(@k String route, @k x00.l<? super NavOptionsBuilder, g2> builder) {
        g0.p(route, "route");
        g0.p(builder, "builder");
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    @w00.k
    @MainThread
    public final void navigate(@k String route, @l NavOptions navOptions, @l Navigator.Extras extras) {
        g0.p(route, "route");
        if (this._graph != null) {
            NavGraph topGraph = getTopGraph(this.backQueue);
            NavDestination.DeepLinkMatch matchRouteComprehensive = topGraph.matchRouteComprehensive(route, true, true, topGraph);
            if (matchRouteComprehensive != null) {
                NavDestination destination = matchRouteComprehensive.getDestination();
                Bundle addInDefaultArgs = destination.addInDefaultArgs(matchRouteComprehensive.getMatchingArgs());
                if (addInDefaultArgs == null) {
                    addInDefaultArgs = new Bundle();
                }
                NavDestination destination2 = matchRouteComprehensive.getDestination();
                Intent intent = new Intent();
                Uri parse = Uri.parse(NavDestination.Companion.createRoute(destination.getRoute()));
                g0.h(parse, "Uri.parse(this)");
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                addInDefaultArgs.putParcelable(KEY_DEEP_LINK_INTENT, intent);
                navigate(destination2, addInDefaultArgs, navOptions, extras);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this._graph);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    @MainThread
    public final <T> void navigate(@k T route, @k x00.l<? super NavOptionsBuilder, g2> builder) {
        g0.p(route, "route");
        g0.p(builder, "builder");
        navigate$default(this, route, NavOptionsBuilderKt.navOptions(builder), (Navigator.Extras) null, 4, (Object) null);
    }

    @w00.k
    @MainThread
    public final <T> void navigate(@k T route, @l NavOptions navOptions, @l Navigator.Extras extras) {
        g0.p(route, "route");
        navigate(generateRouteFilled(route), navOptions, extras);
    }
}
