package pi;

import android.content.res.Resources;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;
import gs.sg;
import gs.wi;
import java.util.List;
import kotlin.Triple;
import pi.k;
import qi.b;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nBasicWordBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicWordBinder.kt\ncom/baicizhan/main/wikiv2/lookup/binder/BasicWordBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1869#2,2:156\n*S KotlinDebug\n*F\n+ 1 BasicWordBinder.kt\ncom/baicizhan/main/wikiv2/lookup/binder/BasicWordBinder\n*L\n123#1:156,2\n*E\n"})
/* loaded from: classes3.dex */
public final class k extends e0<d, a, wi> {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f80567g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f80568h = 8;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f80569i = "BasicWordBinder";

    /* renamed from: f, reason: collision with root package name */
    public int f80570f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Resources f80571a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final AppCompatTextView f80572b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final ImageView f80573c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final TextView f80574d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final LottieAnimationView f80575e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final LinearLayout f80576f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final TextView f80577g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final Space f80578h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final TextView f80579i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ k f80580j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k final k kVar, wi binding) {
            super(binding.getRoot());
            kotlin.jvm.internal.g0.p(binding, "binding");
            this.f80580j = kVar;
            Resources resources = binding.getRoot().getResources();
            kotlin.jvm.internal.g0.o(resources, "getResources(...)");
            this.f80571a = resources;
            AppCompatTextView word = binding.f57346k;
            kotlin.jvm.internal.g0.o(word, "word");
            this.f80572b = word;
            ImageView collect = binding.f57339d;
            kotlin.jvm.internal.g0.o(collect, "collect");
            this.f80573c = collect;
            TextView accentUsa = binding.f57337b;
            kotlin.jvm.internal.g0.o(accentUsa, "accentUsa");
            this.f80574d = accentUsa;
            LottieAnimationView accentVoiceUsa = binding.f57338c;
            kotlin.jvm.internal.g0.o(accentVoiceUsa, "accentVoiceUsa");
            this.f80575e = accentVoiceUsa;
            LinearLayout noproguardMeaningsContainer = binding.f57342g;
            kotlin.jvm.internal.g0.o(noproguardMeaningsContainer, "noproguardMeaningsContainer");
            this.f80576f = noproguardMeaningsContainer;
            TextView noproguardWordComparative = binding.f57343h;
            kotlin.jvm.internal.g0.o(noproguardWordComparative, "noproguardWordComparative");
            this.f80577g = noproguardWordComparative;
            Space noproguardWordComparativeBottomPadding = binding.f57344i;
            kotlin.jvm.internal.g0.o(noproguardWordComparativeBottomPadding, "noproguardWordComparativeBottomPadding");
            this.f80578h = noproguardWordComparativeBottomPadding;
            TextView examsDesc = binding.f57341f;
            kotlin.jvm.internal.g0.o(examsDesc, "examsDesc");
            this.f80579i = examsDesc;
            sa.q.v(new View[]{word, accentUsa, accentVoiceUsa}, 0, new x00.l() { // from class: pi.h
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 d11;
                    d11 = k.a.d(k.this, this, (View) obj);
                    return d11;
                }
            }, 1, null);
            LiveData<Triple<Integer, Integer, Boolean>> x11 = kVar.p().x();
            LifecycleOwner q11 = kVar.q();
            kotlin.jvm.internal.g0.m(q11);
            x11.observe(q11, new c(new x00.l() { // from class: pi.i
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 e11;
                    e11 = k.a.e(k.a.this, (Triple) obj);
                    return e11;
                }
            }));
            LiveData<Object> w11 = kVar.p().w();
            LifecycleOwner q12 = kVar.q();
            kotlin.jvm.internal.g0.m(q12);
            w11.observe(q12, new Observer() { // from class: pi.j
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    k.a.f(k.a.this, obj);
                }
            });
        }

        public static final g2 d(k kVar, a aVar, View it) {
            kotlin.jvm.internal.g0.p(it, "it");
            oi.b0.u(kVar.p(), ma.a.C4, null, 2, null);
            kVar.p().K(aVar.getAdapterPosition(), 0);
            return g2.f100423a;
        }

        public static final g2 e(a aVar, Triple triple) {
            if (triple != null && ((Number) triple.getFirst()).intValue() == aVar.getAdapterPosition() && ((Number) triple.getSecond()).intValue() == 0) {
                if (((Boolean) triple.getThird()).booleanValue()) {
                    aVar.f80575e.A();
                } else {
                    aVar.f80575e.m();
                    aVar.f80575e.setFrame(0);
                }
            }
            return g2.f100423a;
        }

        public static final void f(a aVar, Object obj) {
            if (obj instanceof Throwable) {
                va.g.j((Throwable) obj, 0);
            } else {
                if (obj == null || !(obj instanceof Boolean)) {
                    return;
                }
                Boolean bool = (Boolean) obj;
                va.g.g(bool.booleanValue() ? R.string.wiki_toast_collect_success : R.string.wiki_toast_uncollect_success, 0);
                aVar.f80573c.setSelected(bool.booleanValue());
            }
        }

        @m80.k
        public final TextView g() {
            return this.f80574d;
        }

        @m80.k
        public final LottieAnimationView h() {
            return this.f80575e;
        }

        @m80.k
        public final ImageView i() {
            return this.f80573c;
        }

        @m80.k
        public final TextView j() {
            return this.f80579i;
        }

        @m80.k
        public final LinearLayout k() {
            return this.f80576f;
        }

        @m80.k
        public final Resources l() {
            return this.f80571a;
        }

        @m80.k
        public final AppCompatTextView m() {
            return this.f80572b;
        }

        @m80.k
        public final TextView n() {
            return this.f80577g;
        }

        @m80.k
        public final Space o() {
            return this.f80578h;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f80581a;

        public c(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f80581a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f80581a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f80581a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k oi.b0 model, @m80.k LifecycleOwner owner) {
        super(model, owner);
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(owner, "owner");
        this.f80570f = -1;
    }

    public static final void A(a aVar, Boolean bool, long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<unused var>");
        if (bool != null) {
            aVar.i().setSelected(bool.booleanValue());
        }
    }

    public static final void y(a aVar, d dVar, List it) {
        kotlin.jvm.internal.g0.p(it, "it");
        aVar.i().setSelected(it.contains(Integer.valueOf(dVar.c().u())));
    }

    public static final g2 z(k kVar, d dVar, final a aVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        oi.b0.u(kVar.p(), ma.a.B4, null, 2, null);
        hj.m l02 = kVar.p().l0();
        if (l02 != null) {
            l02.r(nj.a.f75140b.a(dVar.c()), new hj.o() { // from class: pi.g
                @Override // hj.o
                public final void a(Boolean bool, long[] jArr) {
                    k.A(k.a.this, bool, jArr);
                }
            });
        }
        return g2.f100423a;
    }

    @Override // pi.e0
    @m80.k
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(@m80.k wi binding, @m80.k View v11) {
        kotlin.jvm.internal.g0.p(binding, "binding");
        kotlin.jvm.internal.g0.p(v11, "v");
        return new a(this, binding);
    }

    @Override // pi.e0
    @m80.k
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public wi s(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        wi d11 = wi.d(inflater, parent, false);
        kotlin.jvm.internal.g0.o(d11, "inflate(...)");
        return d11;
    }

    public final int w(int i11, Resources resources) {
        int i12 = this.f80570f;
        if (i12 > -1) {
            return i12;
        }
        if (i11 < 1) {
            return 0;
        }
        Paint paint = new Paint();
        paint.setTextSize(resources.getDimensionPixelSize(R.dimen.wiki_word_detail_meaning_size));
        return (int) paint.measureText(u30.f0.v2("m", i11 - 1) + ".");
    }

    @Override // pi.e0, p50.e
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k final a holder, @m80.k final d item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.m().setText(item.c().z());
        sa.q.p(holder.g(), item.c().x());
        LottieAnimationView h11 = holder.h();
        String y11 = item.c().y();
        sa.q.z(h11, !(y11 == null || y11.length() == 0));
        hj.m l02 = p().l0();
        if (l02 != null) {
            l02.D(new hj.a() { // from class: pi.e
                @Override // hj.a
                public final void onResult(Object obj) {
                    k.y(k.a.this, item, (List) obj);
                }
            });
        }
        sa.q.t(holder.i(), 0, new x00.l() { // from class: pi.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z11;
                z11 = k.z(k.this, item, holder, (View) obj);
                return z11;
            }
        }, 1, null);
        if (holder.k().getChildCount() == 0) {
            b.c r11 = item.c().r();
            if (r11 != null) {
                int e11 = r11.e();
                Resources resources = holder.itemView.getResources();
                kotlin.jvm.internal.g0.o(resources, "getResources(...)");
                int w11 = w(e11, resources);
                LayoutInflater from = LayoutInflater.from(holder.itemView.getContext());
                for (b.C1020b c1020b : r11.f()) {
                    sg c11 = sg.c(from);
                    kotlin.jvm.internal.g0.o(c11, "inflate(...)");
                    TextView typeDesc = c11.f56757c;
                    kotlin.jvm.internal.g0.o(typeDesc, "typeDesc");
                    sa.q.p(typeDesc, c1020b.h());
                    c11.f56756b.setText(c1020b.g());
                    c11.f56757c.getLayoutParams().width = Math.max(w11, c11.f56757c.getMinWidth());
                    if (c11.f56757c.getLayoutParams().width == c11.f56757c.getMinWidth()) {
                        ViewGroup.LayoutParams layoutParams = c11.f56757c.getLayoutParams();
                        kotlin.jvm.internal.g0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = xb.f.a(holder.itemView.getContext(), 8.0f);
                    }
                    holder.k().addView(c11.getRoot());
                }
            } else {
                String q11 = item.c().q();
                if (q11 != null) {
                    sg c12 = sg.c(LayoutInflater.from(holder.itemView.getContext()));
                    TextView typeDesc2 = c12.f56757c;
                    kotlin.jvm.internal.g0.o(typeDesc2, "typeDesc");
                    sa.q.z(typeDesc2, false);
                    c12.f56756b.setText(q11);
                    holder.k().addView(c12.getRoot());
                }
            }
        }
        sa.q.p(holder.n(), item.c().s());
        Space o11 = holder.o();
        String s11 = item.c().s();
        sa.q.z(o11, !(s11 == null || s11.length() == 0));
        sa.q.p(holder.j(), item.c().t());
        super.g(holder, item);
    }
}
