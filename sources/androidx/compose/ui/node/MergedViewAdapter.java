package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,96:1\n117#2,2:97\n34#2,6:99\n119#2:105\n34#2,6:106\n34#2,6:112\n34#2,6:118\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n52#1:97,2\n52#1:99,6\n52#1:105\n60#1:106,6\n64#1:112,6\n68#1:118,6\n*E\n"})
/* loaded from: classes2.dex */
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;

    @k
    private final List<ViewAdapter> adapters = new ArrayList();

    /* renamed from: id, reason: collision with root package name */
    private final int f4209id;

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didInsert(@k View view, @k ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).didInsert(view, viewGroup);
        }
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(@k View view, @k ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).didUpdate(view, viewGroup);
        }
    }

    @k
    public final <T extends ViewAdapter> T get(int i11, @k x00.a<? extends T> aVar) {
        ViewAdapter viewAdapter;
        List<ViewAdapter> adapters = getAdapters();
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
        getAdapters().add(invoke);
        return invoke;
    }

    @k
    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return this.f4209id;
    }

    @Override // androidx.compose.ui.node.ViewAdapter
    public void willInsert(@k View view, @k ViewGroup viewGroup) {
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.get(i11).willInsert(view, viewGroup);
        }
    }
}
