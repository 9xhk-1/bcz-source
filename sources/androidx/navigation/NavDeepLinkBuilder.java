package androidx.navigation;

import a00.m;
import a00.r0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import q30.k0;
import q30.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavDeepLinkBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkBuilder.kt\nandroidx/navigation/NavDeepLinkBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
/* loaded from: classes3.dex */
public final class NavDeepLinkBuilder {

    @l
    private final Activity activity;

    @k
    private final Context context;

    @k
    private final List<DeepLinkDestination> destinations;

    @l
    private Bundle globalArgs;

    @l
    private NavGraph graph;

    @k
    private final Intent intent;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DeepLinkDestination {

        @l
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int i11, @l Bundle bundle) {
            this.destinationId = i11;
            this.arguments = bundle;
        }

        @l
        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PermissiveNavigatorProvider extends NavigatorProvider {

        @k
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1
            @Override // androidx.navigation.Navigator
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination navigate(NavDestination destination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
                g0.p(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.NavigatorProvider
        @k
        public <T extends Navigator<? extends NavDestination>> T getNavigator(@k String name) {
            g0.p(name, "name");
            try {
                return (T) super.getNavigator(name);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.mDestNavigator;
                g0.n(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(@k Context context) {
        Intent launchIntentForPackage;
        g0.p(context, "context");
        this.context = context;
        Activity activity = (Activity) k0.i1(k0.S1(x.t(context, new x00.l<Context, Context>() { // from class: androidx.navigation.NavDeepLinkBuilder$activity$1
            @Override // x00.l
            public final Context invoke(Context it) {
                g0.p(it, "it");
                ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            }
        }), new x00.l<Context, Activity>() { // from class: androidx.navigation.NavDeepLinkBuilder$activity$2
            @Override // x00.l
            public final Activity invoke(Context it) {
                g0.p(it, "it");
                if (it instanceof Activity) {
                    return (Activity) it;
                }
                return null;
            }
        }));
        this.activity = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i11, Bundle bundle, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i11, bundle);
    }

    private final void fillInIntent() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            int destinationId = deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            NavDestination findDestination = findDestination(destinationId);
            if (findDestination == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
            for (int i11 : findDestination.buildDeepLinkIds(navDestination)) {
                arrayList.add(Integer.valueOf(i11));
                arrayList2.add(arguments);
            }
            navDestination = findDestination;
        }
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, r0.Z5(arrayList));
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, arrayList2);
    }

    private final NavDestination findDestination(@IdRes int i11) {
        m mVar = new m();
        NavGraph navGraph = this.graph;
        g0.m(navGraph);
        mVar.add(navGraph);
        while (!mVar.isEmpty()) {
            NavDestination navDestination = (NavDestination) mVar.removeFirst();
            if (navDestination.getId() == i11) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    mVar.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i11, Bundle bundle, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i11, bundle);
    }

    private final void verifyAllDestinations() {
        Iterator<DeepLinkDestination> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (findDestination(destinationId) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder addDestination(@IdRes int i11) {
        return addDestination$default(this, i11, (Bundle) null, 2, (Object) null);
    }

    @k
    public final PendingIntent createPendingIntent() {
        int i11;
        Bundle bundle = this.globalArgs;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            i11 = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                i11 = (i11 * 31) + (obj != null ? obj.hashCode() : 0);
            }
        } else {
            i11 = 0;
        }
        for (DeepLinkDestination deepLinkDestination : this.destinations) {
            i11 = (i11 * 31) + deepLinkDestination.getDestinationId();
            Bundle arguments = deepLinkDestination.getArguments();
            if (arguments != null) {
                Iterator<String> it2 = arguments.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = arguments.get(it2.next());
                    i11 = (i11 * 31) + (obj2 != null ? obj2.hashCode() : 0);
                }
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(i11, 201326592);
        g0.m(pendingIntent);
        return pendingIntent;
    }

    @k
    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.destinations.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        fillInIntent();
        TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(new Intent(this.intent));
        g0.o(addNextIntentWithParentStack, "create(context).addNextI…rentStack(Intent(intent))");
        int intentCount = addNextIntentWithParentStack.getIntentCount();
        for (int i11 = 0; i11 < intentCount; i11++) {
            Intent editIntentAt = addNextIntentWithParentStack.editIntentAt(i11);
            if (editIntentAt != null) {
                editIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
            }
        }
        return addNextIntentWithParentStack;
    }

    @k
    public final NavDeepLinkBuilder setArguments(@l Bundle bundle) {
        this.globalArgs = bundle;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, bundle);
        return this;
    }

    @k
    public final NavDeepLinkBuilder setComponentName(@k Class<? extends Activity> activityClass) {
        g0.p(activityClass, "activityClass");
        return setComponentName(new ComponentName(this.context, activityClass));
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder setDestination(@IdRes int i11) {
        return setDestination$default(this, i11, (Bundle) null, 2, (Object) null);
    }

    @k
    public final NavDeepLinkBuilder setGraph(@NavigationRes int i11) {
        return setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(i11));
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder addDestination(@k String route) {
        g0.p(route, "route");
        return addDestination$default(this, route, (Bundle) null, 2, (Object) null);
    }

    @k
    public final NavDeepLinkBuilder setComponentName(@k ComponentName componentName) {
        g0.p(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder setDestination(@k String destRoute) {
        g0.p(destRoute, "destRoute");
        return setDestination$default(this, destRoute, (Bundle) null, 2, (Object) null);
    }

    @k
    public final NavDeepLinkBuilder setGraph(@k NavGraph navGraph) {
        g0.p(navGraph, "navGraph");
        this.graph = navGraph;
        verifyAllDestinations();
        return this;
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder addDestination(@IdRes int i11, @l Bundle bundle) {
        this.destinations.add(new DeepLinkDestination(i11, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder setDestination(@IdRes int i11, @l Bundle bundle) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(i11, bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder addDestination(@k String route, @l Bundle bundle) {
        g0.p(route, "route");
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(route).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    @w00.k
    @k
    public final NavDeepLinkBuilder setDestination(@k String destRoute, @l Bundle bundle) {
        g0.p(destRoute, "destRoute");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(destRoute).hashCode(), bundle));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(@k NavController navController) {
        this(navController.getContext());
        g0.p(navController, "navController");
        this.graph = navController.getGraph();
    }
}
