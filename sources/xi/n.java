package xi;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import gs.gn;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class n extends li.e<com.baicizhan.main.wikiv2.study.model.a, a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f98094f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final wi.n f98095e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<gn> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f98096e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k n nVar, gn binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f98096e = nVar;
        }

        public final void i(@m80.k com.baicizhan.main.wikiv2.study.model.a mean) {
            g0.p(mean, "mean");
            gn b11 = b();
            b11.f55110c.f56544a.setText(mean.a());
            TextView enMean = b11.f55108a;
            g0.o(enMean, "enMean");
            yi.b.d(enMean, mean.b(), mean.c(), null);
            b11.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k LifecycleOwner lifecycleOwner, @m80.k wi.n viewModel) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f98095e = viewModel;
    }

    @Override // p50.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.study.model.a item) {
        g0.p(holder, "holder");
        g0.p(item, "item");
        holder.i(item);
        o(holder);
    }

    @Override // li.e
    @m80.k
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public a q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        return new a(this, (gn) wi.p.f96399a.b(gn.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(gn.class, holder.b());
    }
}
