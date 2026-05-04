package androidx.navigation;

import a00.r0;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import q30.k0;
import yz.g2;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,242:1\n1313#2,2:243\n*S KotlinDebug\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n*L\n136#1:243,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class Navigator<D extends NavDestination> {

    @l
    private NavigatorState _state;
    private boolean isAttached;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Extras {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @zz.c(AnnotationRetention.RUNTIME)
    @d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Name {
        String value();
    }

    @k
    public abstract D createDestination();

    @k
    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    @l
    public NavDestination navigate(@k D destination, @l Bundle bundle, @l NavOptions navOptions, @l Extras extras) {
        g0.p(destination, "destination");
        return destination;
    }

    @CallSuper
    public void onAttach(@k NavigatorState state) {
        g0.p(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLaunchSingleTop(@k NavBackStackEntry backStackEntry) {
        g0.p(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (destination == null) {
            destination = null;
        }
        if (destination == null) {
            return;
        }
        navigate(destination, null, NavOptionsBuilderKt.navOptions(new x00.l<NavOptionsBuilder, g2>() { // from class: androidx.navigation.Navigator$onLaunchSingleTop$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(NavOptionsBuilder navOptionsBuilder) {
                invoke2(navOptionsBuilder);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NavOptionsBuilder navOptions) {
                g0.p(navOptions, "$this$navOptions");
                navOptions.setLaunchSingleTop(true);
            }
        }), null);
        getState().onLaunchSingleTop(backStackEntry);
    }

    public void onRestoreState(@k Bundle savedState) {
        g0.p(savedState, "savedState");
    }

    @l
    public Bundle onSaveState() {
        return null;
    }

    public boolean popBackStack() {
        return true;
    }

    public void navigate(@k List<NavBackStackEntry> entries, @l final NavOptions navOptions, @l final Extras extras) {
        g0.p(entries, "entries");
        Iterator it = k0.X0(k0.N1(r0.E1(entries), new x00.l<NavBackStackEntry, NavBackStackEntry>(this) { // from class: androidx.navigation.Navigator$navigate$1
            final /* synthetic */ Navigator<D> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // x00.l
            public final NavBackStackEntry invoke(NavBackStackEntry backStackEntry) {
                NavDestination navigate;
                g0.p(backStackEntry, "backStackEntry");
                NavDestination destination = backStackEntry.getDestination();
                if (destination == null) {
                    destination = null;
                }
                if (destination == null || (navigate = this.this$0.navigate(destination, backStackEntry.getArguments(), navOptions, extras)) == null) {
                    return null;
                }
                return g0.g(navigate, destination) ? backStackEntry : this.this$0.getState().createBackStackEntry(navigate, navigate.addInDefaultArgs(backStackEntry.getArguments()));
            }
        })).iterator();
        while (it.hasNext()) {
            getState().push((NavBackStackEntry) it.next());
        }
    }

    public void popBackStack(@k NavBackStackEntry popUpTo, boolean z11) {
        g0.p(popUpTo, "popUpTo");
        List<NavBackStackEntry> value = getState().getBackStack().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        NavBackStackEntry navBackStackEntry = null;
        while (popBackStack()) {
            navBackStackEntry = listIterator.previous();
            if (g0.g(navBackStackEntry, popUpTo)) {
                break;
            }
        }
        if (navBackStackEntry != null) {
            getState().pop(navBackStackEntry, z11);
        }
    }
}
