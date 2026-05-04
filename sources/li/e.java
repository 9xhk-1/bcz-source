package li;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import li.b;
import m80.k;
import xi.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class e<V, VH extends b<? extends ViewDataBinding>> extends p50.e<V, VH> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f71401d = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LifecycleOwner f71402b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList<VH> f71403c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLifecycleItemBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleItemBinder.kt\ncom/baicizhan/main/wikiv2/LifecycleItemBinder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1869#2,2:63\n*S KotlinDebug\n*F\n+ 1 LifecycleItemBinder.kt\ncom/baicizhan/main/wikiv2/LifecycleItemBinder$1\n*L\n20#1:63,2\n*E\n"})
    public static final class a implements LifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<V, VH> f71404a;

        public a(e<V, VH> eVar) {
            this.f71404a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void destroy() {
            ArrayList<b> arrayList = this.f71404a.f71403c;
            e<V, VH> eVar = this.f71404a;
            for (b bVar : arrayList) {
                bVar.g();
                eVar.t(bVar);
            }
        }
    }

    public e(@k LifecycleOwner life) {
        g0.p(life, "life");
        this.f71402b = life;
        life.getLifecycle().addObserver(new a(this));
        this.f71403c = new ArrayList<>();
    }

    public final void o(@k VH holder) {
        g0.p(holder, "holder");
        if (holder.itemView.getContext() != null) {
            Context context = holder.itemView.getContext();
            g0.o(context, "getContext(...)");
            if (com.baicizhan.base.a.a(context)) {
                s sVar = s.f98107a;
                View root = holder.b().getRoot();
                g0.o(root, "getRoot(...)");
                Context context2 = holder.itemView.getContext();
                g0.o(context2, "getContext(...)");
                sVar.a(holder, root, context2);
            }
        }
    }

    @k
    public final LifecycleOwner p() {
        return this.f71402b;
    }

    @k
    public abstract VH q(@k LayoutInflater layoutInflater, @k ViewGroup viewGroup);

    @Override // p50.e
    @k
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public VH i(@k LayoutInflater inflater, @k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        VH q11 = q(inflater, parent);
        this.f71403c.add(q11);
        q11.f();
        return q11;
    }

    @Override // p50.e
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(@k VH holder) {
        g0.p(holder, "holder");
        super.k(holder);
        holder.e();
    }

    public void t(@k VH holder) {
        g0.p(holder, "holder");
    }

    @Override // p50.e
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void l(@k VH holder) {
        g0.p(holder, "holder");
        super.l(holder);
        holder.h();
    }
}
