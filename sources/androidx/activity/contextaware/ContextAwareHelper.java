package androidx.activity.contextaware;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextAwareHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAwareHelper.kt\nandroidx/activity/contextaware/ContextAwareHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
/* loaded from: classes.dex */
public final class ContextAwareHelper {

    @l
    private volatile Context context;

    @k
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(@k OnContextAvailableListener listener) {
        g0.p(listener, "listener");
        Context context = this.context;
        if (context != null) {
            listener.onContextAvailable(context);
        }
        this.listeners.add(listener);
    }

    public final void clearAvailableContext() {
        this.context = null;
    }

    public final void dispatchOnContextAvailable(@k Context context) {
        g0.p(context, "context");
        this.context = context;
        Iterator<OnContextAvailableListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    @l
    public final Context peekAvailableContext() {
        return this.context;
    }

    public final void removeOnContextAvailableListener(@k OnContextAvailableListener listener) {
        g0.p(listener, "listener");
        this.listeners.remove(listener);
    }
}
