package ej;

import a00.k1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.d0;
import com.baicizhan.main.wikiv2.studyv2.data.e0;
import com.jiongji.andriod.card.R;
import ej.e;
import gs.og;
import gs.rk;
import i9.j;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import sa.q;
import x00.l;
import yz.g2;
import yz.h1;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class e extends li.d<b> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f49858g = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<e0> f49859d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final StudyWikiV2ViewModel f49860e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LifecycleOwner f49861f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSentencePageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentencePageAdapter.kt\ncom/baicizhan/main/wikiv2/studyv2/adapter/sentence/SentencePageAdapter$SentenceListAdapter\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,198:1\n35#2:199\n*S KotlinDebug\n*F\n+ 1 SentencePageAdapter.kt\ncom/baicizhan/main/wikiv2/studyv2/adapter/sentence/SentencePageAdapter$SentenceListAdapter\n*L\n135#1:199\n*E\n"})
    public final class a extends li.d<C0600a> {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<d0> f49862d;

        /* renamed from: e, reason: collision with root package name */
        public int f49863e;

        /* renamed from: f, reason: collision with root package name */
        public float f49864f;

        /* renamed from: g, reason: collision with root package name */
        public int f49865g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final boolean[] f49866h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e f49867i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: ej.e$a$a, reason: collision with other inner class name */
        public final class C0600a extends li.b<og> {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f49868e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0600a(@k a aVar, og binding) {
                super(binding);
                g0.p(binding, "binding");
                this.f49868e = aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k e eVar, @k List<d0> sentenceList, LifecycleOwner lifeOwner) {
            super(lifeOwner);
            g0.p(sentenceList, "sentenceList");
            g0.p(lifeOwner, "lifeOwner");
            this.f49867i = eVar;
            this.f49862d = sentenceList;
            this.f49863e = -1;
            this.f49864f = -1.0f;
            this.f49865g = -1;
            int size = sentenceList.size();
            boolean[] zArr = new boolean[size];
            for (int i11 = 0; i11 < size; i11++) {
                zArr[i11] = false;
            }
            this.f49866h = zArr;
        }

        public static final g2 q(e eVar, d0 d0Var, View it) {
            g0.p(it, "it");
            eVar.m().t(d0Var, d0Var.m());
            eVar.m().b(ma.a.D4, k1.k(h1.a(ma.b.f72935p1, Long.valueOf(d0Var.q()))));
            return g2.f100423a;
        }

        public static final g2 r(og ogVar, Boolean bool) {
            if (bool.booleanValue()) {
                ogVar.f56227e.A();
            } else {
                ogVar.f56227e.m();
                ogVar.f56227e.setFrame(0);
            }
            return g2.f100423a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v2, types: [T, android.view.ViewParent] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        public static final void s(final a aVar, final og ogVar, int i11, View view) {
            if (aVar.f49863e < 0) {
                aVar.f49863e = ogVar.f56225c.getWidth();
                aVar.f49864f = ogVar.f56225c.getHeight() / aVar.f49863e;
                aVar.f49865g = ogVar.getRoot().getMeasuredWidth();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(ogVar.f56225c.getWidth(), aVar.f49866h[i11] ? aVar.f49863e : aVar.f49865g);
            final int height = ogVar.f56225c.getHeight();
            ViewParent parent = view.getParent();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            for (?? r11 = parent; r11 != 0; r11 = r11.getParent()) {
                if (r11 instanceof ViewPager2) {
                    objectRef.element = r11;
                }
            }
            final Ref.IntRef intRef = new Ref.IntRef();
            T t11 = objectRef.element;
            if (t11 != 0) {
                intRef.element = ((ViewPager2) t11).getHeight();
            }
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ej.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    e.a.t(og.this, aVar, height, objectRef, intRef, valueAnimator);
                }
            });
            ofInt.start();
            aVar.f49866h[i11] = !r8[i11];
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void t(og ogVar, a aVar, int i11, Ref.ObjectRef objectRef, Ref.IntRef intRef, ValueAnimator it) {
            g0.p(it, "it");
            ViewGroup.LayoutParams layoutParams = ogVar.f56225c.getLayoutParams();
            Object animatedValue = it.getAnimatedValue();
            g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = ((Integer) animatedValue).intValue();
            g0.n(it.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = (int) (((Integer) r8).intValue() * aVar.f49864f);
            ogVar.f56225c.setLayoutParams(layoutParams);
            int i12 = layoutParams.height - i11;
            T t11 = objectRef.element;
            if (t11 != 0) {
                ViewPager2 viewPager2 = (ViewPager2) t11;
                ViewGroup.LayoutParams layoutParams2 = ((ViewPager2) t11).getLayoutParams();
                layoutParams2.height = intRef.element + i12;
                viewPager2.setLayoutParams(layoutParams2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f49862d.size();
        }

        @k
        public final List<d0> o() {
            return this.f49862d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@k C0600a holder, final int i11) {
            g0.p(holder, "holder");
            og b11 = holder.b();
            final e eVar = this.f49867i;
            final og ogVar = b11;
            final d0 d0Var = this.f49862d.get(i11);
            TextView sentenceEn = ogVar.f56224b;
            g0.o(sentenceEn, "sentenceEn");
            yi.b.f(sentenceEn, d0Var.r(), d0Var.t(), d0Var.p(), false, false, 8, null);
            ogVar.f56223a.setText(d0Var.s());
            ogVar.f56223a.setVisibility(j.c("show_sentence_translation", true) ? 0 : 8);
            ogVar.f56226d.setText(d0Var.o());
            TextView sentenceSource = ogVar.f56226d;
            g0.o(sentenceSource, "sentenceSource");
            String o11 = d0Var.o();
            q.z(sentenceSource, !(o11 == null || o11.length() == 0));
            LottieAnimationView sentenceVoice = ogVar.f56227e;
            g0.o(sentenceVoice, "sentenceVoice");
            q.t(sentenceVoice, 0, new l() { // from class: ej.b
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 q11;
                    q11 = e.a.q(e.this, d0Var, (View) obj);
                    return q11;
                }
            }, 1, null);
            d0Var.a().observe(eVar.k(), new c(new l() { // from class: ej.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 r11;
                    r11 = e.a.r(og.this, (Boolean) obj);
                    return r11;
                }
            }));
            ImageView sentenceImg = ogVar.f56225c;
            g0.o(sentenceImg, "sentenceImg");
            q.z(sentenceImg, false);
            Uri n11 = d0Var.n();
            if (n11 != null) {
                ic.c f11 = hc.c.j(n11).j(R.drawable.ic_wiki_illustration_placeholder).f(R.drawable.ic_wiki_illustration_errorholder);
                ImageView sentenceImg2 = ogVar.f56225c;
                g0.o(sentenceImg2, "sentenceImg");
                f11.o(sentenceImg2);
                ImageView sentenceImg3 = ogVar.f56225c;
                g0.o(sentenceImg3, "sentenceImg");
                q.z(sentenceImg3, true);
            }
            ogVar.f56225c.setOnClickListener(new View.OnClickListener() { // from class: ej.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.a.s(e.a.this, ogVar, i11, view);
                }
            });
            c(holder);
            qb.c.i("new_wiki_time", "wiki sentence end", new Object[0]);
        }

        @Override // li.d
        @k
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public C0600a f(@k LayoutInflater inflater, @k ViewGroup parent) {
            g0.p(inflater, "inflater");
            g0.p(parent, "parent");
            og e11 = og.e(inflater, parent, false);
            g0.o(e11, "inflate(...)");
            return new C0600a(this, e11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends li.b<rk> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f49869e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k e eVar, rk binding) {
            super(binding);
            g0.p(binding, "binding");
            this.f49869e = eVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f49870a;

        public c(l function) {
            g0.p(function, "function");
            this.f49870a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f49870a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49870a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@k List<e0> pageList, @k StudyWikiV2ViewModel vm2, @k LifecycleOwner lifeOwner) {
        super(lifeOwner);
        g0.p(pageList, "pageList");
        g0.p(vm2, "vm");
        g0.p(lifeOwner, "lifeOwner");
        this.f49859d = pageList;
        this.f49860e = vm2;
        this.f49861f = lifeOwner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f49859d.size();
    }

    @k
    public final LifecycleOwner k() {
        return this.f49861f;
    }

    @k
    public final List<e0> l() {
        return this.f49859d;
    }

    @k
    public final StudyWikiV2ViewModel m() {
        return this.f49860e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k b holder, int i11) {
        g0.p(holder, "holder");
        rk b11 = holder.b();
        e0 e0Var = this.f49859d.get(i11);
        b11.f56661b.setText(e0Var.g());
        b11.f56660a.setText(e0Var.f());
        Group noproguardTitleGroup = b11.f56662c;
        g0.o(noproguardTitleGroup, "noproguardTitleGroup");
        q.z(noproguardTitleGroup, e0Var.f().length() > 0 && e0Var.g().length() > 0);
        RecyclerView recyclerView = b11.f56663d;
        recyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        recyclerView.setAdapter(new a(this, this.f49859d.get(i11).h(), this.f49861f));
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i12 = 0; i12 < itemDecorationCount; i12++) {
            recyclerView.removeItemDecorationAt(i12);
        }
        Context context = recyclerView.getContext();
        g0.o(context, "getContext(...)");
        xl.c cVar = new xl.c(context, 1, 0, this.f49859d.get(i11).h().size() - 1, false, 16, null);
        Drawable drawable = KotlinExtKt.getDrawable(R.drawable.divider_transparent_16dp);
        g0.m(drawable);
        cVar.setDrawable(drawable);
        recyclerView.addItemDecoration(cVar);
    }

    @Override // li.d
    @k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b f(@k LayoutInflater inflater, @k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        rk e11 = rk.e(inflater, parent, false);
        g0.o(e11, "inflate(...)");
        return new b(this, e11);
    }
}
