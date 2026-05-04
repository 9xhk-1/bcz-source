package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "PoolingContainer")
/* loaded from: classes2.dex */
public final class PoolingContainer {
    private static final int PoolingContainerListenerHolderTag = R.id.pooling_container_listener_holder_tag;
    private static final int IsPoolingContainerTag = R.id.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(@k View view, @k PoolingContainerListener listener) {
        g0.p(view, "<this>");
        g0.p(listener, "listener");
        getPoolingContainerListenerHolder(view).addListener(listener);
    }

    public static final void callPoolingContainerOnRelease(@k View view) {
        g0.p(view, "<this>");
        Iterator<View> it = ViewKt.getAllViews(view).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(@k ViewGroup viewGroup) {
        g0.p(viewGroup, "<this>");
        Iterator<View> it = ViewGroupKt.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    private static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        int i11 = PoolingContainerListenerHolderTag;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i11);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(i11, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }

    public static final boolean isPoolingContainer(@k View view) {
        g0.p(view, "<this>");
        Object tag = view.getTag(IsPoolingContainerTag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(@k View view) {
        g0.p(view, "<this>");
        for (Object obj : ViewKt.getAncestors(view)) {
            if ((obj instanceof View) && isPoolingContainer((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(@k View view, @k PoolingContainerListener listener) {
        g0.p(view, "<this>");
        g0.p(listener, "listener");
        getPoolingContainerListenerHolder(view).removeListener(listener);
    }

    public static final void setPoolingContainer(@k View view, boolean z11) {
        g0.p(view, "<this>");
        view.setTag(IsPoolingContainerTag, Boolean.valueOf(z11));
    }
}
