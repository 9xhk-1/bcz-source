package xi;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.ZPackUtils;
import com.jiongji.andriod.card.R;
import gs.en;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class t extends li.e<com.baicizhan.main.wikiv2.study.model.f, a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f98110f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final wi.n f98111e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<en> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f98112e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: xi.t$a$a, reason: collision with other inner class name */
        public static final class C1324a implements hc.d {
            public C1324a() {
            }

            @Override // hc.d
            public void a(Exception exc) {
                a.this.b().f54831b.setBackground(a.this.b().f54831b.getResources().getDrawable(R.drawable.bg_wiki_deformation));
            }

            @Override // hc.d
            public void onSuccess() {
                a.this.b().f54831b.setBackground(a.this.b().f54831b.getResources().getDrawable(R.drawable.bg_wiki_deformation));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k t tVar, en binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f98112e = tVar;
        }

        public final void i(@m80.k com.baicizhan.main.wikiv2.study.model.f wordDeformation) {
            g0.p(wordDeformation, "wordDeformation");
            en b11 = b();
            b11.f54832c.f56544a.setText(wordDeformation.a());
            b().f54831b.setBackground(b().f54831b.getResources().getDrawable(R.drawable.bg_wiki_deformation_loading));
            ic.c f11 = ZPackUtils.loadImageCompat(wordDeformation.i(), wordDeformation.b()).j(R.drawable.ic_wiki_illustration_placeholder).f(R.drawable.ic_wiki_illustration_errorholder);
            ImageView pictogram = b11.f54831b;
            g0.o(pictogram, "pictogram");
            f11.g(pictogram, new C1324a());
            b11.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k LifecycleOwner lifecycleOwner, @m80.k wi.n viewModel) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f98111e = viewModel;
    }

    @Override // p50.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.study.model.f item) {
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
        return new a(this, (en) wi.p.f96399a.b(en.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(en.class, holder.b());
    }
}
