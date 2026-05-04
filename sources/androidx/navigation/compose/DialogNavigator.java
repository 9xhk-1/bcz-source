package androidx.navigation.compose;

import a00.h0;
import a00.r0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.m0;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Navigator.Name(DialogNavigator.NAME)
@u0({"SMAP\nDialogNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n1864#2,3:92\n*S KotlinDebug\n*F\n+ 1 DialogNavigator.kt\nandroidx/navigation/compose/DialogNavigator\n*L\n55#1:90,2\n68#1:92,3\n*E\n"})
/* loaded from: classes3.dex */
public final class DialogNavigator extends Navigator<Destination> {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    public static final String NAME = "dialog";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void dismiss$navigation_compose_release(@k NavBackStackEntry navBackStackEntry) {
        popBackStack(navBackStackEntry, false);
    }

    @k
    public final m0<List<NavBackStackEntry>> getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    @k
    public final m0<Set<NavBackStackEntry>> getTransitionInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@k List<NavBackStackEntry> list, @l NavOptions navOptions, @l Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public final void onTransitionComplete$navigation_compose_release(@k NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@k NavBackStackEntry navBackStackEntry, boolean z11) {
        getState().popWithTransition(navBackStackEntry, z11);
        int h32 = r0.h3(getState().getTransitionsInProgress().getValue(), navBackStackEntry);
        int i11 = 0;
        for (Object obj : getState().getTransitionsInProgress().getValue()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj;
            if (i11 > h32) {
                onTransitionComplete$navigation_compose_release(navBackStackEntry2);
            }
            i11 = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @NavDestination.ClassType(Composable.class)
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 0;

        @k
        private final q<NavBackStackEntry, Composer, Integer, g2> content;

        @k
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, q qVar, int i11, v vVar) {
            this(dialogNavigator, (i11 & 2) != 0 ? new DialogProperties(false, false, false, 7, (v) null) : dialogProperties, qVar);
        }

        @k
        public final q<NavBackStackEntry, Composer, Integer, g2> getContent$navigation_compose_release() {
            return this.content;
        }

        @k
        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.dialogProperties;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(@k DialogNavigator dialogNavigator, @k DialogProperties dialogProperties, @k q<? super NavBackStackEntry, ? super Composer, ? super Integer, g2> qVar) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = qVar;
        }
    }

    @Override // androidx.navigation.Navigator
    @k
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m5616getLambda1$navigation_compose_release(), 2, null);
    }
}
