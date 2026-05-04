package li;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import li.b;
import m80.k;
import xi.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class d<VH extends b<? extends ViewDataBinding>> extends RecyclerView.Adapter<VH> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f71397c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LifecycleOwner f71398a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList<VH> f71399b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLifecycleItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleItemAdapter.kt\ncom/baicizhan/main/wikiv2/LifecycleItemAdapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1869#2,2:71\n*S KotlinDebug\n*F\n+ 1 LifecycleItemAdapter.kt\ncom/baicizhan/main/wikiv2/LifecycleItemAdapter$1\n*L\n24#1:71,2\n*E\n"})
    public static final class a implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<VH> f71400a;

        public a(d<VH> dVar) {
            this.f71400a = dVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            g0.p(owner, "owner");
            super.onDestroy(owner);
            ArrayList<b> arrayList = this.f71400a.f71399b;
            d<VH> dVar = this.f71400a;
            for (b bVar : arrayList) {
                bVar.g();
                dVar.i(bVar);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(LifecycleOwner lifecycleOwner) {
            super.onResume(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
            super.onStart(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
            super.onStop(lifecycleOwner);
        }
    }

    public d(@k LifecycleOwner life) {
        g0.p(life, "life");
        this.f71398a = life;
        life.getLifecycle().addObserver(new a(this));
        this.f71399b = new ArrayList<>();
    }

    public final void c(@k VH holder) {
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
    public final LifecycleOwner d() {
        return this.f71398a;
    }

    @k
    public abstract VH f(@k LayoutInflater layoutInflater, @k ViewGroup viewGroup);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public VH onCreateViewHolder(@k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        g0.o(from, "from(...)");
        VH f11 = f(from, parent);
        this.f71399b.add(f11);
        f11.f();
        return f11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@k VH holder) {
        g0.p(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.e();
    }

    public void i(@k VH holder) {
        g0.p(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@k VH holder) {
        g0.p(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.h();
    }
}
