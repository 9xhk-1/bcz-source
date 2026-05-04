package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavigator;
import h10.d;
import java.util.Map;
import m80.k;
import m80.l;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class ComposeNavigatorDestinationBuilder extends NavDestinationBuilder<ComposeNavigator.Destination> {
    public static final int $stable = 8;

    @k
    private final ComposeNavigator composeNavigator;

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
    public ComposeNavigatorDestinationBuilder(@k ComposeNavigator composeNavigator, @k String str, @k r<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, g2> rVar) {
        super(composeNavigator, str);
        this.composeNavigator = composeNavigator;
        this.content = rVar;
    }

    @l
    public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getEnterTransition() {
        return this.enterTransition;
    }

    @l
    public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getExitTransition() {
        return this.exitTransition;
    }

    @l
    public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> getPopEnterTransition() {
        return this.popEnterTransition;
    }

    @l
    public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> getPopExitTransition() {
        return this.popExitTransition;
    }

    @l
    public final x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> getSizeTransform() {
        return this.sizeTransform;
    }

    public final void setEnterTransition(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
        this.enterTransition = lVar;
    }

    public final void setExitTransition(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
        this.exitTransition = lVar;
    }

    public final void setPopEnterTransition(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar) {
        this.popEnterTransition = lVar;
    }

    public final void setPopExitTransition(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar) {
        this.popExitTransition = lVar;
    }

    public final void setSizeTransform(@l x00.l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar) {
        this.sizeTransform = lVar;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @k
    public ComposeNavigator.Destination build() {
        ComposeNavigator.Destination destination = (ComposeNavigator.Destination) super.build();
        destination.setEnterTransition$navigation_compose_release(this.enterTransition);
        destination.setExitTransition$navigation_compose_release(this.exitTransition);
        destination.setPopEnterTransition$navigation_compose_release(this.popEnterTransition);
        destination.setPopExitTransition$navigation_compose_release(this.popExitTransition);
        destination.setSizeTransform$navigation_compose_release(this.sizeTransform);
        return destination;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @k
    public ComposeNavigator.Destination instantiateDestination() {
        return new ComposeNavigator.Destination(this.composeNavigator, this.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigatorDestinationBuilder(@k ComposeNavigator composeNavigator, @k d<?> dVar, @k Map<h10.r, NavType<?>> map, @k r<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, g2> rVar) {
        super(composeNavigator, dVar, map);
        this.composeNavigator = composeNavigator;
        this.content = rVar;
    }
}
