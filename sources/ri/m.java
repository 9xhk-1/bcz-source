package ri;

import a00.h0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.lookup.wikiv2.helper.SentenceTagHelper;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.jiongji.andriod.card.R;
import gs.me;
import gs.ve;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLookupSentenceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookupSentenceAdapter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/adapter/WikiSceneSentenceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1869#2:318\n1870#2:320\n1869#2,2:321\n1#3:319\n*S KotlinDebug\n*F\n+ 1 LookupSentenceAdapter.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/adapter/WikiSceneSentenceAdapter\n*L\n74#1:318\n74#1:320\n207#1:321,2\n*E\n"})
/* loaded from: classes3.dex */
public final class m extends RecyclerView.Adapter<b> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f84145d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f84146e = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f84147f = "LookupSentenceAdapter";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f84148a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0 f84149b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<si.a> f84150c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends li.b<me> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m f84151e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k m mVar, me binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f84151e = mVar;
        }

        @m80.k
        public final me i() {
            return b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends cl.e<Drawable> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ve f84152d;

        public c(ve veVar) {
            this.f84152d = veVar;
        }

        @Override // cl.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void h(Drawable resource, dl.f<? super Drawable> fVar) {
            g0.p(resource, "resource");
            int intrinsicWidth = resource.getIntrinsicWidth();
            int intrinsicHeight = resource.getIntrinsicHeight();
            float f11 = intrinsicHeight > 0 ? intrinsicWidth / intrinsicHeight : 1.33f;
            this.f84152d.f57171c.setTag(new ri.c(f11, false));
            int dpPixels = KotlinExtKt.getDpPixels(90);
            ViewGroup.LayoutParams layoutParams = this.f84152d.f57171c.getLayoutParams();
            g0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) (dpPixels * f11);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = dpPixels;
            this.f84152d.f57171c.setLayoutParams(layoutParams2);
            this.f84152d.f57171c.setImageDrawable(resource);
        }

        @Override // cl.p
        public void i(Drawable drawable) {
            this.f84152d.f57171c.setImageDrawable(drawable);
        }
    }

    public m(@m80.k LifecycleOwner lifecycleOwner, @m80.k o0 viewModel) {
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(viewModel, "viewModel");
        this.f84148a = lifecycleOwner;
        this.f84149b = viewModel;
        this.f84150c = h0.J();
    }

    public static final g2 h(m mVar, String str, View it) {
        g0.p(it, "it");
        mVar.f84149b.V(str);
        o0.z(mVar.f84149b, ma.a.D4, null, 2, null);
        return g2.f100423a;
    }

    public static final void i(m mVar, ve veVar, View view) {
        Object tag = view.getTag();
        ri.c cVar = tag instanceof ri.c ? (ri.c) tag : null;
        if (cVar == null) {
            cVar = new ri.c(1.33f, false);
        }
        boolean z11 = !cVar.f();
        ImageView sentenceImg = veVar.f57171c;
        g0.o(sentenceImg, "sentenceImg");
        mVar.m(sentenceImg, z11, cVar.e());
        view.setTag(ri.c.d(cVar, 0.0f, z11, 1, null));
    }

    public static final void n(int i11, int i12, int i13, int i14, ConstraintLayout.LayoutParams layoutParams, ImageView imageView, ValueAnimator animation) {
        g0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) (i11 + ((i12 - i11) * floatValue));
        ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) (i13 + ((i14 - i13) * floatValue));
        imageView.setLayoutParams(layoutParams);
    }

    private final void p(LottieAnimationView lottieAnimationView, boolean z11) {
        if (z11) {
            lottieAnimationView.A();
        } else {
            lottieAnimationView.m();
            lottieAnimationView.setProgress(0.0f);
        }
    }

    @m80.k
    public final List<si.a> f() {
        return this.f84150c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@m80.k b holder, int i11) {
        String str;
        final String z11;
        g0.p(holder, "holder");
        si.a aVar = this.f84150c.get(i11);
        me i12 = holder.i();
        i12.f55901b.setText(aVar.e().F());
        i12.f55900a.setText(aVar.e().B());
        i12.f55902c.removeAllViews();
        si.c value = this.f84149b.I().getValue();
        if (value == null || (str = value.t()) == null) {
            str = "";
        }
        String str2 = str;
        LayoutInflater from = LayoutInflater.from(i12.getRoot().getContext());
        for (i0.w wVar : aVar.f()) {
            final ve e11 = ve.e(from, i12.f55902c, false);
            g0.o(e11, "inflate(...)");
            TextView sentenceEn = e11.f57170b;
            g0.o(sentenceEn, "sentenceEn");
            yi.b.f(sentenceEn, wVar.h0(), str2, wVar.N(), this.f84149b.K(), false, 16, null);
            e11.f57169a.setText(wVar.l0());
            e11.f57169a.setVisibility(0);
            l(e11, wVar);
            Boolean value2 = this.f84149b.O().getValue();
            boolean booleanValue = value2 != null ? value2.booleanValue() : true;
            if (wVar.B().length() <= 0 && wVar.z().length() <= 0) {
                z11 = wVar.b0();
            } else if (booleanValue) {
                z11 = wVar.B();
                if (z11.length() == 0) {
                    z11 = wVar.z();
                }
            } else {
                z11 = wVar.z();
                if (z11.length() == 0) {
                    z11 = wVar.B();
                }
            }
            if (z11.length() > 0) {
                LottieAnimationView sentenceVoice = e11.f57174f;
                g0.o(sentenceVoice, "sentenceVoice");
                q.t(sentenceVoice, 0, new x00.l() { // from class: ri.j
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 h11;
                        h11 = m.h(m.this, z11, (View) obj);
                        return h11;
                    }
                }, 1, null);
                e11.f57174f.setTag(z11);
            } else {
                e11.f57174f.setVisibility(8);
            }
            String F = wVar.F().length() > 0 ? wVar.F() : wVar.J().length() > 0 ? wVar.J() : wVar.T();
            if (F.length() > 0) {
                ImageView sentenceImg = e11.f57171c;
                g0.o(sentenceImg, "sentenceImg");
                q.z(sentenceImg, true);
                com.bumptech.glide.c.F(e11.getRoot().getContext()).load(F).placeholder(R.drawable.ic_wiki_illustration_placeholder).error(R.drawable.ic_wiki_illustration_errorholder).into((com.bumptech.glide.j) new c(e11));
                e11.f57171c.setOnClickListener(new View.OnClickListener() { // from class: ri.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        m.i(m.this, e11, view);
                    }
                });
            } else {
                ImageView sentenceImg2 = e11.f57171c;
                g0.o(sentenceImg2, "sentenceImg");
                q.z(sentenceImg2, false);
            }
            i12.f55902c.addView(e11.getRoot());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f84150c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@m80.k ViewGroup parent, int i11) {
        g0.p(parent, "parent");
        me e11 = me.e(LayoutInflater.from(parent.getContext()), parent, false);
        g0.o(e11, "inflate(...)");
        return new b(this, e11);
    }

    public final void k(@m80.k List<si.a> value) {
        g0.p(value, "value");
        this.f84150c = value;
        notifyDataSetChanged();
    }

    public final void l(ve veVar, i0.w wVar) {
        List<SentenceTagHelper.a> c11 = SentenceTagHelper.f25653a.c(wVar);
        veVar.f57173e.removeAllViews();
        List<SentenceTagHelper.a> list = c11;
        if (!list.isEmpty()) {
            LayoutInflater from = LayoutInflater.from(veVar.getRoot().getContext());
            for (SentenceTagHelper.a aVar : c11) {
                View inflate = from.inflate(R.layout.item_sentence_tag, (ViewGroup) veVar.f57173e, false);
                g0.n(inflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate;
                textView.setText(aVar.e());
                veVar.f57173e.addView(textView);
            }
        }
        boolean z11 = wVar.j0().length() > 0;
        if (z11) {
            veVar.f57172d.setText(SentenceTagHelper.f25653a.a(wVar.j0()));
            TextView sentenceSource = veVar.f57172d;
            g0.o(sentenceSource, "sentenceSource");
            q.z(sentenceSource, true);
            ViewGroup.LayoutParams layoutParams = veVar.f57172d.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(c11.isEmpty() ? 0 : KotlinExtKt.getDpPixels(8));
            }
            veVar.f57172d.setLayoutParams(marginLayoutParams);
        } else {
            TextView sentenceSource2 = veVar.f57172d;
            g0.o(sentenceSource2, "sentenceSource");
            q.z(sentenceSource2, false);
        }
        boolean z12 = !list.isEmpty() || z11;
        LinearLayout tagSourceContainer = veVar.f57175g;
        g0.o(tagSourceContainer, "tagSourceContainer");
        q.z(tagSourceContainer, z12);
    }

    public final void m(final ImageView imageView, boolean z11, float f11) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        g0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        final ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Object parent = imageView.getParent();
        View view = parent instanceof View ? (View) parent : null;
        int width = view != null ? view.getWidth() : 0;
        int dpPixels = KotlinExtKt.getDpPixels(90);
        final int i11 = (int) (dpPixels * f11);
        int dpPixels2 = width - KotlinExtKt.getDpPixels(2);
        int i12 = (int) (dpPixels2 / f11);
        if (!z11) {
            i11 = dpPixels2;
        }
        if (!z11) {
            dpPixels2 = i11;
        }
        final int i13 = z11 ? dpPixels : i12;
        final int i14 = z11 ? i12 : dpPixels;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = -1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        final int i15 = dpPixels2;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ri.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m.n(i11, i15, i13, i14, layoutParams2, imageView, valueAnimator);
            }
        });
        ofFloat.start();
    }

    public final void o(@m80.l String str) {
        for (int i11 = 0; i11 < getItemCount(); i11++) {
        }
    }
}
