package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
/* loaded from: classes3.dex */
public final class ComposeNavGraphNavigator extends NavGraphNavigator {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class ComposeNavGraph extends NavGraph {
        public static final int $stable = 8;

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

        public ComposeNavGraph(@k Navigator<? extends NavGraph> navigator) {
            super(navigator);
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
    }

    public ComposeNavGraphNavigator(@k NavigatorProvider navigatorProvider) {
        super(navigatorProvider);
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
    @k
    public NavGraph createDestination() {
        return new ComposeNavGraph(this);
    }
}
