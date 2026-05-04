package xi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import gs.cn;
import kotlin.jvm.internal.g0;
import xi.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class r extends li.e<com.baicizhan.main.wikiv2.study.model.b, a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f98104f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final wi.n f98105e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<cn> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r f98106e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k r rVar, cn binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f98106e = rVar;
        }

        public static final void k(r rVar, com.baicizhan.main.wikiv2.study.model.b bVar, View view) {
            rVar.f98105e.i().postValue(bVar);
        }

        public final void j(@m80.k final com.baicizhan.main.wikiv2.study.model.b error) {
            g0.p(error, "error");
            cn b11 = b();
            final r rVar = this.f98106e;
            cn cnVar = b11;
            cnVar.f54509b.setOnClickListener(new View.OnClickListener() { // from class: xi.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r.a.k(r.this, error, view);
                }
            });
            cnVar.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@m80.k LifecycleOwner lifecycleOwner, @m80.k wi.n viewModel) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f98105e = viewModel;
    }

    @Override // p50.e
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.study.model.b item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        holder.j(item);
        o(holder);
    }

    @Override // li.e
    @m80.k
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        return new a(this, (cn) wi.p.f96399a.b(cn.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(cn.class, holder.b());
    }
}
