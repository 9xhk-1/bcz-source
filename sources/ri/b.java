package ri;

import a00.h0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.helper.SentenceTagHelper;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.jiongji.andriod.card.R;
import gs.ve;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l3.i0;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<C1049b> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f84076d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f84077e = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f84078f = "ExamSentenceAdapter";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f84079a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0 f84080b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<i0.w> f84081c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ri.b$b, reason: collision with other inner class name */
    public final class C1049b extends li.b<ve> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f84082e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1049b(@m80.k b bVar, ve binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f84082e = bVar;
        }

        @m80.k
        public final ve i() {
            return b();
        }
    }

    public b(@m80.k LifecycleOwner lifecycleOwner, @m80.k o0 viewModel) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f84079a = lifecycleOwner;
        this.f84080b = viewModel;
        this.f84081c = h0.J();
    }

    public static final g2 f(b bVar, String str, View it) {
        g0.p(it, "it");
        bVar.f84080b.V(str);
        o0.z(bVar.f84080b, "wiki_exam_sentence_play", null, 2, null);
        return g2.f100423a;
    }

    @m80.k
    public final List<i0.w> c() {
        return this.f84081c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k C1049b holder, int i11) {
        String str;
        g0.p(holder, "holder");
        i0.w wVar = this.f84081c.get(i11);
        ve i12 = holder.i();
        si.c value = this.f84080b.I().getValue();
        if (value == null || (str = value.t()) == null) {
            str = "";
        }
        String str2 = str;
        TextView sentenceEn = i12.f57170b;
        g0.o(sentenceEn, "sentenceEn");
        yi.b.f(sentenceEn, wVar.h0(), str2, wVar.N(), this.f84080b.K(), false, 16, null);
        i12.f57169a.setText(wVar.l0());
        i12.f57169a.setVisibility(0);
        i(i12, wVar);
        final String B = wVar.B().length() > 0 ? wVar.B() : wVar.z();
        if (B.length() > 0) {
            LottieAnimationView sentenceVoice = i12.f57174f;
            g0.o(sentenceVoice, "sentenceVoice");
            q.t(sentenceVoice, 0, new x00.l() { // from class: ri.a
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 f11;
                    f11 = b.f(b.this, B, (View) obj);
                    return f11;
                }
            }, 1, null);
            i12.f57174f.setTag(B);
        } else {
            i12.f57174f.setVisibility(8);
        }
        if (wVar.T().length() <= 0) {
            ImageView sentenceImg = i12.f57171c;
            g0.o(sentenceImg, "sentenceImg");
            q.z(sentenceImg, false);
            return;
        }
        ic.c f11 = hc.c.l(wVar.T()).j(R.drawable.ic_wiki_illustration_placeholder).f(R.drawable.ic_wiki_illustration_errorholder);
        ImageView sentenceImg2 = i12.f57171c;
        g0.o(sentenceImg2, "sentenceImg");
        f11.o(sentenceImg2);
        ImageView sentenceImg3 = i12.f57171c;
        g0.o(sentenceImg3, "sentenceImg");
        q.z(sentenceImg3, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1049b onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        ve e11 = ve.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new C1049b(this, e11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84081c.size();
    }

    public final void h(@m80.k List<i0.w> value) {
        g0.p(value, "value");
        this.f84081c = value;
        notifyDataSetChanged();
    }

    public final void i(ve veVar, i0.w wVar) {
        veVar.f57173e.removeAllViews();
        View inflate = LayoutInflater.from(veVar.getRoot().getContext()).inflate(R.layout.item_sentence_tag, (ViewGroup) veVar.f57173e, false);
        g0.n(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText("真题");
        veVar.f57173e.addView(textView);
        if (wVar.j0().length() > 0) {
            veVar.f57172d.setText(SentenceTagHelper.f25653a.a(wVar.j0()));
            TextView sentenceSource = veVar.f57172d;
            g0.o(sentenceSource, "sentenceSource");
            q.z(sentenceSource, true);
        } else {
            TextView sentenceSource2 = veVar.f57172d;
            g0.o(sentenceSource2, "sentenceSource");
            q.z(sentenceSource2, false);
        }
        LinearLayout tagSourceContainer = veVar.f57175g;
        g0.o(tagSourceContainer, "tagSourceContainer");
        q.z(tagSourceContainer, true);
    }

    public final void j(@m80.l String str) {
        for (int i11 = 0; i11 < getItemCount(); i11++) {
        }
    }

    public final void k(LottieAnimationView lottieAnimationView, boolean z11) {
        if (z11) {
            lottieAnimationView.A();
        } else {
            lottieAnimationView.m();
            lottieAnimationView.setProgress(0.0f);
        }
    }
}
