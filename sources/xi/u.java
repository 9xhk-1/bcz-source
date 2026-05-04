package xi;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import gs.in;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class u extends li.e<com.baicizhan.main.wikiv2.study.model.g, a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f98114f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final wi.n f98115e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<in> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u f98116e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k u uVar, in binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f98116e = uVar;
        }

        public final void i(@m80.k com.baicizhan.main.wikiv2.study.model.g wordRoot) {
            g0.p(wordRoot, "wordRoot");
            in b11 = b();
            b11.f55358b.f56544a.setText(wordRoot.a());
            b11.f55359c.setText(wordRoot.b());
            b11.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@m80.k LifecycleOwner lifecycleOwner, @m80.k wi.n viewModel) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f98115e = viewModel;
    }

    @Override // p50.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.study.model.g item) {
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
        return new a(this, (in) wi.p.f96399a.b(in.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(in.class, holder.b());
    }
}
