package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,96:1\n52#2:97\n53#2,4:107\n117#3,2:98\n34#3,6:100\n119#3:106\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n44#1:97\n44#1:107,4\n44#1:98,2\n44#1:100,6\n44#1:106\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final <T extends ViewAdapter> T getOrAddAdapter(@k View view, int i11, @k x00.a<? extends T> aVar) {
        ViewAdapter viewAdapter;
        MergedViewAdapter viewAdapter2 = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter2.getAdapters();
        int size = adapters.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                viewAdapter = null;
                break;
            }
            viewAdapter = adapters.get(i12);
            if (viewAdapter.getId() == i11) {
                break;
            }
            i12++;
        }
        T t11 = viewAdapter instanceof ViewAdapter ? (T) viewAdapter : null;
        if (t11 != null) {
            return t11;
        }
        T invoke = aVar.invoke();
        viewAdapter2.getAdapters().add(invoke);
        return invoke;
    }

    @k
    public static final MergedViewAdapter getViewAdapter(@k View view) {
        int i11 = viewAdaptersKey;
        Object tag = view.getTag(i11);
        MergedViewAdapter mergedViewAdapter = tag instanceof MergedViewAdapter ? (MergedViewAdapter) tag : null;
        if (mergedViewAdapter != null) {
            return mergedViewAdapter;
        }
        MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
        view.setTag(i11, mergedViewAdapter2);
        return mergedViewAdapter2;
    }

    @l
    public static final MergedViewAdapter getViewAdapterIfExists(@k View view) {
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(@k String str) {
        return str.hashCode() | 50331648;
    }
}
