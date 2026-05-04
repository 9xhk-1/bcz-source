package xi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.ZPackUtils;
import com.jiongji.andriod.card.R;
import gs.an;
import kotlin.jvm.internal.g0;
import xi.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class p extends li.e<com.baicizhan.main.wikiv2.study.model.d, a> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f98099f = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final wi.n f98100e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends li.b<an> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p f98101e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k p pVar, an binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f98101e = pVar;
        }

        public static final void k(p pVar, com.baicizhan.main.wikiv2.study.model.d dVar, View view) {
            pVar.f98100e.s(dVar);
            wi.n.f(pVar.f98100e, ma.a.D4, null, 2, null);
        }

        public final void j(@m80.k final com.baicizhan.main.wikiv2.study.model.d imageSentence) {
            g0.p(imageSentence, "imageSentence");
            an b11 = b();
            final p pVar = this.f98101e;
            an anVar = b11;
            anVar.f54207e.f56544a.setText(imageSentence.a());
            TextView sentence = anVar.f54204b;
            g0.o(sentence, "sentence");
            yi.b.f(sentence, imageSentence.d(), imageSentence.j(), imageSentence.e(), false, false, 8, null);
            anVar.f54206d.setText(imageSentence.f());
            anVar.f54206d.setVisibility(i9.j.c("show_sentence_translation", true) ? 0 : 8);
            ic.c f11 = ZPackUtils.loadImageCompat(imageSentence.i(), imageSentence.b()).j(R.drawable.ic_wiki_illustration_placeholder).f(R.drawable.ic_wiki_illustration_errorholder);
            ImageView sentenceImg = anVar.f54205c;
            g0.o(sentenceImg, "sentenceImg");
            f11.o(sentenceImg);
            anVar.f54208f.setOnClickListener(new View.OnClickListener() { // from class: xi.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.k(p.this, imageSentence, view);
                }
            });
            ImageView voice = anVar.f54208f;
            g0.o(voice, "voice");
            yi.b.b(voice, this, imageSentence.h());
            anVar.executePendingBindings();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@m80.k LifecycleOwner lifecycleOwner, @m80.k wi.n viewModel) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f98100e = viewModel;
    }

    @Override // p50.e
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k a holder, @m80.k com.baicizhan.main.wikiv2.study.model.d item) {
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
        return new a(this, (an) wi.p.f96399a.b(an.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k a holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(an.class, holder.b());
    }
}
