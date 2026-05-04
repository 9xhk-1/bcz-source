package androidx.activity;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1855#2,2:106\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n60#1:106,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {

    @m80.k
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();

    @m80.l
    private x00.a<g2> enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z11) {
        this.isEnabled = z11;
    }

    @w00.j(name = "addCancellable")
    public final void addCancellable(@m80.k Cancellable cancellable) {
        g0.p(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @m80.l
    public final x00.a<g2> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public void handleOnBackProgressed(@m80.k BackEventCompat backEvent) {
        g0.p(backEvent, "backEvent");
    }

    @MainThread
    public void handleOnBackStarted(@m80.k BackEventCompat backEvent) {
        g0.p(backEvent, "backEvent");
    }

    @MainThread
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    @w00.j(name = "removeCancellable")
    public final void removeCancellable(@m80.k Cancellable cancellable) {
        g0.p(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z11) {
        this.isEnabled = z11;
        x00.a<g2> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@m80.l x00.a<g2> aVar) {
        this.enabledChangedCallback = aVar;
    }

    @MainThread
    public void handleOnBackCancelled() {
    }
}
