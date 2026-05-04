package pi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.viewbinding.ViewBinding;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class e0<T, VH extends RecyclerView.ViewHolder, B extends ViewBinding> extends p50.e<T, VH> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f80547e = 8;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final oi.b0 f80548b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final LifecycleOwner f80549c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Boolean> f80550d;

    public e0(@m80.k oi.b0 model, @m80.l LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.g0.p(model, "model");
        this.f80548b = model;
        this.f80549c = lifecycleOwner;
        this.f80550d = new LinkedHashMap();
    }

    @Override // p50.e
    public void g(@m80.k VH holder, @m80.k T item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        n(holder);
    }

    @Override // p50.e
    @m80.k
    public final VH i(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        B s11 = s(inflater, parent);
        View root = s11.getRoot();
        kotlin.jvm.internal.g0.o(root, "getRoot(...)");
        return r(s11, root);
    }

    public void n(VH vh2) {
        if (vh2 != null) {
            Context context = vh2.itemView.getContext();
            kotlin.jvm.internal.g0.o(context, "getContext(...)");
            if (com.baicizhan.base.a.a(context)) {
                if (kotlin.jvm.internal.g0.g(this.f80550d.get(Integer.valueOf(vh2.hashCode())), Boolean.TRUE)) {
                    return;
                }
                f0 f0Var = f0.f80554a;
                Context context2 = vh2.itemView.getContext();
                kotlin.jvm.internal.g0.o(context2, "getContext(...)");
                f0Var.a(vh2, context2, this.f80550d);
            }
        }
    }

    @m80.k
    public final Map<Integer, Boolean> o() {
        return this.f80550d;
    }

    @m80.k
    public final oi.b0 p() {
        return this.f80548b;
    }

    @m80.l
    public final LifecycleOwner q() {
        return this.f80549c;
    }

    @m80.k
    public abstract VH r(@m80.k B b11, @m80.k View view);

    @m80.k
    public abstract B s(@m80.k LayoutInflater layoutInflater, @m80.k ViewGroup viewGroup);

    public /* synthetic */ e0(oi.b0 b0Var, LifecycleOwner lifecycleOwner, int i11, kotlin.jvm.internal.v vVar) {
        this(b0Var, (i11 & 2) != 0 ? null : lifecycleOwner);
    }
}
