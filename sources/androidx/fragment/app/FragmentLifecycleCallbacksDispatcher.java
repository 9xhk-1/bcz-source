package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FragmentLifecycleCallbacksDispatcher {

    @m80.k
    private final FragmentManager fragmentManager;

    @m80.k
    private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> lifecycleCallbacks;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FragmentLifecycleCallbacksHolder {

        @m80.k
        private final FragmentManager.FragmentLifecycleCallbacks callback;
        private final boolean recursive;

        public FragmentLifecycleCallbacksHolder(@m80.k FragmentManager.FragmentLifecycleCallbacks callback, boolean z11) {
            g0.p(callback, "callback");
            this.callback = callback;
            this.recursive = z11;
        }

        @m80.k
        public final FragmentManager.FragmentLifecycleCallbacks getCallback() {
            return this.callback;
        }

        public final boolean getRecursive() {
            return this.recursive;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(@m80.k FragmentManager fragmentManager) {
        g0.p(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
    }

    public final void dispatchOnFragmentActivityCreated(@m80.k Fragment f11, @m80.l Bundle bundle, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentActivityCreated(f11, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentActivityCreated(this.fragmentManager, f11, bundle);
            }
        }
    }

    public final void dispatchOnFragmentAttached(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentAttached(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentAttached(this.fragmentManager, f11, context);
            }
        }
    }

    public final void dispatchOnFragmentCreated(@m80.k Fragment f11, @m80.l Bundle bundle, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentCreated(f11, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentCreated(this.fragmentManager, f11, bundle);
            }
        }
    }

    public final void dispatchOnFragmentDestroyed(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDestroyed(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentDestroyed(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentDetached(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentDetached(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentDetached(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentPaused(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPaused(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentPaused(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentPreAttached(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Context context = this.fragmentManager.getHost().getContext();
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreAttached(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentPreAttached(this.fragmentManager, f11, context);
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(@m80.k Fragment f11, @m80.l Bundle bundle, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentPreCreated(f11, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentPreCreated(this.fragmentManager, f11, bundle);
            }
        }
    }

    public final void dispatchOnFragmentResumed(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentResumed(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentResumed(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(@m80.k Fragment f11, @m80.k Bundle outState, boolean z11) {
        g0.p(f11, "f");
        g0.p(outState, "outState");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentSaveInstanceState(f11, outState, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentSaveInstanceState(this.fragmentManager, f11, outState);
            }
        }
    }

    public final void dispatchOnFragmentStarted(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStarted(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentStarted(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentStopped(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentStopped(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentStopped(this.fragmentManager, f11);
            }
        }
    }

    public final void dispatchOnFragmentViewCreated(@m80.k Fragment f11, @m80.k View v11, @m80.l Bundle bundle, boolean z11) {
        g0.p(f11, "f");
        g0.p(v11, "v");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewCreated(f11, v11, bundle, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentViewCreated(this.fragmentManager, f11, v11, bundle);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(@m80.k Fragment f11, boolean z11) {
        g0.p(f11, "f");
        Fragment parent = this.fragmentManager.getParent();
        if (parent != null) {
            FragmentManager parentFragmentManager = parent.getParentFragmentManager();
            g0.o(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.getLifecycleCallbacksDispatcher().dispatchOnFragmentViewDestroyed(f11, true);
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z11 || next.getRecursive()) {
                next.getCallback().onFragmentViewDestroyed(this.fragmentManager, f11);
            }
        }
    }

    public final void registerFragmentLifecycleCallbacks(@m80.k FragmentManager.FragmentLifecycleCallbacks cb2, boolean z11) {
        g0.p(cb2, "cb");
        this.lifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(cb2, z11));
    }

    public final void unregisterFragmentLifecycleCallbacks(@m80.k FragmentManager.FragmentLifecycleCallbacks cb2) {
        g0.p(cb2, "cb");
        synchronized (this.lifecycleCallbacks) {
            try {
                int size = this.lifecycleCallbacks.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (this.lifecycleCallbacks.get(i11).getCallback() == cb2) {
                        this.lifecycleCallbacks.remove(i11);
                        break;
                    }
                    i11++;
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
