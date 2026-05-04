package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.m0;
import m80.k;
import m80.l;
import x00.q;
import x00.r;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Navigator.Name(ComposeNavigator.NAME)
@u0({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n1855#2,2:141\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n55#1:141,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ComposeNavigator extends Navigator<Destination> {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    public static final String NAME = "composable";

    @k
    private final MutableState<Boolean> isPop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    @k
    public final m0<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    @k
    public final m0<Set<NavBackStackEntry>> getTransitionsInProgress$navigation_compose_release() {
        return getState().getTransitionsInProgress();
    }

    @k
    public final MutableState<Boolean> isPop$navigation_compose_release() {
        return this.isPop;
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@k List<NavBackStackEntry> list, @l NavOptions navOptions, @l Navigator.Extras extras) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    public final void onTransitionComplete(@k NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(@k NavBackStackEntry navBackStackEntry, boolean z11) {
        getState().popWithTransition(navBackStackEntry, z11);
        this.isPop.setValue(Boolean.TRUE);
    }

    public final void prepareForTransition(@k NavBackStackEntry navBackStackEntry) {
        getState().prepareForTransition(navBackStackEntry);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @NavDestination.ClassType(Composable.class)
    public static final class Destination extends NavDestination {
        public static final int $stable = 8;

        @k
        private final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, g2> content;

        @l
        private x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition;

        @l
        private x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition;

        @l
        private x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition;

        @l
        private x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition;

        @l
        private x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(@k ComposeNavigator composeNavigator, @k r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, g2> rVar) {
            super(composeNavigator);
            this.content = rVar;
        }

        @k
        public final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, g2> getContent$navigation_compose_release() {
            return this.content;
        }

        @l
        public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition$navigation_compose_release() {
            return this.enterTransition;
        }

        @l
        public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition$navigation_compose_release() {
            return this.exitTransition;
        }

        @l
        public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition$navigation_compose_release() {
            return this.popEnterTransition;
        }

        @l
        public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition$navigation_compose_release() {
            return this.popExitTransition;
        }

        @l
        public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> getSizeTransform$navigation_compose_release() {
            return this.sizeTransform;
        }

        public final void setEnterTransition$navigation_compose_release(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.enterTransition = lVar;
        }

        public final void setExitTransition$navigation_compose_release(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.exitTransition = lVar;
        }

        public final void setPopEnterTransition$navigation_compose_release(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
            this.popEnterTransition = lVar;
        }

        public final void setPopExitTransition$navigation_compose_release(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
            this.popExitTransition = lVar;
        }

        public final void setSizeTransform$navigation_compose_release(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar) {
            this.sizeTransform = lVar;
        }

        @n(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of Destination that supports AnimatedContent")
        public /* synthetic */ Destination(ComposeNavigator composeNavigator, final q qVar) {
            this(composeNavigator, (r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, g2>) ComposableLambdaKt.composableLambdaInstance(1587956030, true, new r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, g2>() { // from class: androidx.navigation.compose.ComposeNavigator.Destination.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // x00.r
                public /* bridge */ /* synthetic */ g2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                    invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                    return g2.f100423a;
                }

                @Composable
                public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i11) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1587956030, i11, -1, "androidx.navigation.compose.ComposeNavigator.Destination.<init>.<anonymous> (ComposeNavigator.kt:107)");
                    }
                    qVar.invoke(navBackStackEntry, composer, Integer.valueOf((i11 >> 3) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
    }

    @Override // androidx.navigation.Navigator
    @k
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$ComposeNavigatorKt.INSTANCE.m5615getLambda1$navigation_compose_release());
    }
}
