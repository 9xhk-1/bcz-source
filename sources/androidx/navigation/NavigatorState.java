package androidx.navigation;

import a00.h0;
import a00.r0;
import a00.w1;
import a00.x1;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1#2:218\n1747#3,3:219\n1747#3,3:222\n959#3,7:225\n1747#3,3:232\n2624#3,3:235\n533#3,6:238\n378#3,7:244\n451#3,6:251\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n76#1:219,3\n77#1:222,3\n102#1:225,7\n123#1:232,3\n124#1:235,3\n130#1:238,6\n158#1:244,7\n181#1:251,6\n*E\n"})
/* loaded from: classes3.dex */
public abstract class NavigatorState {

    @k
    private final y<List<NavBackStackEntry>> _backStack;

    @k
    private final y<Set<NavBackStackEntry>> _transitionsInProgress;

    @k
    private final m0<List<NavBackStackEntry>> backStack;

    @k
    private final ReentrantLock backStackLock = new ReentrantLock(true);
    private boolean isNavigating;

    @k
    private final m0<Set<NavBackStackEntry>> transitionsInProgress;

    public NavigatorState() {
        y<List<NavBackStackEntry>> a11 = o0.a(h0.J());
        this._backStack = a11;
        y<Set<NavBackStackEntry>> a12 = o0.a(w1.k());
        this._transitionsInProgress = a12;
        this.backStack = kotlinx.coroutines.flow.k.n(a11);
        this.transitionsInProgress = kotlinx.coroutines.flow.k.n(a12);
    }

    @k
    public abstract NavBackStackEntry createBackStackEntry(@k NavDestination navDestination, @l Bundle bundle);

    @k
    public final m0<List<NavBackStackEntry>> getBackStack() {
        return this.backStack;
    }

    @k
    public final m0<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(@k NavBackStackEntry entry) {
        g0.p(entry, "entry");
        y<Set<NavBackStackEntry>> yVar = this._transitionsInProgress;
        yVar.setValue(x1.y(yVar.getValue(), entry));
    }

    @CallSuper
    public void onLaunchSingleTop(@k NavBackStackEntry backStackEntry) {
        int i11;
        g0.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            List<NavBackStackEntry> d62 = r0.d6(this.backStack.getValue());
            ListIterator<NavBackStackEntry> listIterator = d62.listIterator(d62.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i11 = -1;
                    break;
                } else if (g0.g(listIterator.previous().getId(), backStackEntry.getId())) {
                    i11 = listIterator.nextIndex();
                    break;
                }
            }
            d62.set(i11, backStackEntry);
            this._backStack.setValue(d62);
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(@k NavBackStackEntry backStackEntry) {
        g0.p(backStackEntry, "backStackEntry");
        List<NavBackStackEntry> value = this.backStack.getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry previous = listIterator.previous();
            if (g0.g(previous.getId(), backStackEntry.getId())) {
                y<Set<NavBackStackEntry>> yVar = this._transitionsInProgress;
                yVar.setValue(x1.D(x1.D(yVar.getValue(), previous), backStackEntry));
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(@k NavBackStackEntry popUpTo, boolean z11) {
        g0.p(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            y<List<NavBackStackEntry>> yVar = this._backStack;
            List<NavBackStackEntry> value = yVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (g0.g((NavBackStackEntry) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            yVar.setValue(arrayList);
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void popWithTransition(@k NavBackStackEntry popUpTo, boolean z11) {
        NavBackStackEntry navBackStackEntry;
        g0.p(popUpTo, "popUpTo");
        Set<NavBackStackEntry> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == popUpTo) {
                    List<NavBackStackEntry> value2 = this.backStack.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        y<Set<NavBackStackEntry>> yVar = this._transitionsInProgress;
        yVar.setValue(x1.D(yVar.getValue(), popUpTo));
        List<NavBackStackEntry> value3 = this.backStack.getValue();
        ListIterator<NavBackStackEntry> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry = null;
                break;
            }
            navBackStackEntry = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            if (!g0.g(navBackStackEntry2, popUpTo) && this.backStack.getValue().lastIndexOf(navBackStackEntry2) < this.backStack.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        if (navBackStackEntry3 != null) {
            y<Set<NavBackStackEntry>> yVar2 = this._transitionsInProgress;
            yVar2.setValue(x1.D(yVar2.getValue(), navBackStackEntry3));
        }
        pop(popUpTo, z11);
    }

    @CallSuper
    public void prepareForTransition(@k NavBackStackEntry entry) {
        g0.p(entry, "entry");
        y<Set<NavBackStackEntry>> yVar = this._transitionsInProgress;
        yVar.setValue(x1.D(yVar.getValue(), entry));
    }

    public void push(@k NavBackStackEntry backStackEntry) {
        g0.p(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            y<List<NavBackStackEntry>> yVar = this._backStack;
            yVar.setValue(r0.J4(yVar.getValue(), backStackEntry));
            g2 g2Var = g2.f100423a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void pushWithTransition(@k NavBackStackEntry backStackEntry) {
        g0.p(backStackEntry, "backStackEntry");
        Set<NavBackStackEntry> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == backStackEntry) {
                    List<NavBackStackEntry> value2 = this.backStack.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) r0.A3(this.backStack.getValue());
        if (navBackStackEntry != null) {
            y<Set<NavBackStackEntry>> yVar = this._transitionsInProgress;
            yVar.setValue(x1.D(yVar.getValue(), navBackStackEntry));
        }
        y<Set<NavBackStackEntry>> yVar2 = this._transitionsInProgress;
        yVar2.setValue(x1.D(yVar2.getValue(), backStackEntry));
        push(backStackEntry);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z11) {
        this.isNavigating = z11;
    }
}
