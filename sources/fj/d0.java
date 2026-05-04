package fj;

import a00.h0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.client.business.util.DSLKitKt;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.SpannableWrapper;
import com.baicizhan.main.wikiv2.studyv2.StudyWikiV2ViewModel;
import com.baicizhan.main.wikiv2.studyv2.data.m0;
import com.baicizhan.main.wikiv2.studyv2.data.x0;
import com.jiongji.andriod.card.R;
import gs.ug;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWikiWordInfoBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiWordInfoBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiWordInfoBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 4 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,234:1\n1878#2,3:235\n1869#2,2:238\n91#3,14:240\n35#4:254\n170#5,6:255\n*S KotlinDebug\n*F\n+ 1 WikiWordInfoBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiWordInfoBinder\n*L\n64#1:235,3\n180#1:238,2\n201#1:240,14\n135#1:254\n155#1:255,6\n*E\n"})
/* loaded from: classes3.dex */
public final class d0 extends li.e<x0, b> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f51899h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f51900i = 8;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final String f51901j = "WikiWordInfoBinder";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final StudyWikiV2ViewModel f51902e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<TextView> f51903f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51904g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends li.b<ug> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d0 f51905e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k d0 d0Var, ug mItemBinding) {
            super(mItemBinding);
            g0.p(mItemBinding, "mItemBinding");
            this.f51905e = d0Var;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f51906a;

        public c(x00.l function) {
            g0.p(function, "function");
            this.f51906a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f51906a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51906a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(@m80.k LifecycleOwner lifecycleOwner, @m80.k StudyWikiV2ViewModel vm2) {
        super(lifecycleOwner);
        g0.p(lifecycleOwner, "lifecycleOwner");
        g0.p(vm2, "vm");
        this.f51902e = vm2;
        this.f51903f = new ArrayList();
    }

    public static final g2 J(x0 x0Var, ug ugVar, d0 d0Var, View it) {
        g0.p(it, "it");
        Uri l11 = x0Var.l();
        if (l11 != null) {
            d0Var.f51902e.t(x0Var, l11);
        }
        String p11 = x0Var.p();
        if (p11 == null || p11.length() == 0) {
            return g2.f100423a;
        }
        qb.c.b(f51901j, "word width:" + ugVar.f57015f.getWidth() + ", word parent width:" + ugVar.f57016g.getWidth(), new Object[0]);
        if (ugVar.f57015f.getWidth() >= ugVar.f57016g.getWidth() - ((d0Var.f51903f.size() > 0 ? d0Var.G(d0Var.f51903f.get(0)) : 0) * d0Var.f51903f.size())) {
            ugVar.f57015f.setText(d0Var.f51904g ? x0Var.r() : x0Var.p());
        } else {
            d0Var.U(ugVar, d0Var.f51903f, true);
        }
        return g2.f100423a;
    }

    public static final g2 K(x0 x0Var, d0 d0Var, ug ugVar, View it) {
        g0.p(it, "it");
        Uri l11 = x0Var.l();
        if (l11 != null) {
            d0Var.f51902e.t(x0Var, l11);
        }
        d0Var.U(ugVar, d0Var.f51903f, false);
        return g2.f100423a;
    }

    public static final g2 L(x0 x0Var, d0 d0Var, View it) {
        g0.p(it, "it");
        Uri l11 = x0Var.l();
        if (l11 != null) {
            d0Var.f51902e.t(x0Var, l11);
        }
        StudyWikiV2ViewModel.c(d0Var.f51902e, ma.a.C4, null, 2, null);
        return g2.f100423a;
    }

    public static final g2 M(ug ugVar, Boolean bool) {
        if (bool.booleanValue()) {
            ugVar.f57014e.A();
        } else {
            ugVar.f57014e.m();
            ugVar.f57014e.setFrame(0);
        }
        return g2.f100423a;
    }

    public static final void N(ug ugVar, x0 x0Var, List it) {
        g0.p(it, "it");
        ugVar.f57011b.setSelected(it.contains(Integer.valueOf(x0Var.q())));
    }

    public static final g2 O(d0 d0Var, x0 x0Var, final ug ugVar, View it) {
        g0.p(it, "it");
        hj.m l02 = d0Var.f51902e.l0();
        if (l02 != null) {
            l02.r(nj.a.f75140b.a(x0Var), new hj.o() { // from class: fj.v
                @Override // hj.o
                public final void a(Boolean bool, long[] jArr) {
                    d0.P(ug.this, bool, jArr);
                }
            });
        }
        StudyWikiV2ViewModel.c(d0Var.f51902e, ma.a.B4, null, 2, null);
        return g2.f100423a;
    }

    public static final void P(ug ugVar, Boolean bool, long[] jArr) {
        g0.p(jArr, "<unused var>");
        if (bool != null) {
            ugVar.f57011b.setSelected(bool.booleanValue());
        }
    }

    public static final g2 Q(String str, SpannableWrapper highLightDsl) {
        g0.p(highLightDsl, "$this$highLightDsl");
        highLightDsl.setContent(str);
        int i11 = -1;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (str.charAt(length) == 29616) {
                    i11 = length;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        highLightDsl.setStart(i11 + 1);
        highLightDsl.setEnd(str.length() - 1);
        highLightDsl.setTextColor(KotlinExtKt.getColorInt(R.color.color_high_light_red));
        return g2.f100423a;
    }

    public static final void V(TextView textView, ValueAnimator valueAnimator) {
        g0.p(valueAnimator, "valueAnimator");
        sa.q.z(textView, true);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Object animatedValue = valueAnimator.getAnimatedValue();
        g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        textView.setLayoutParams(layoutParams);
    }

    @m80.k
    public final List<TextView> E() {
        return this.f51903f;
    }

    public final TextView F(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, 32.0f);
        KotlinExtKt.setIsBold(textView, true);
        textView.setTextColor(context.getColor(R.color.main_color_word_822));
        textView.setText(str);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return textView;
    }

    public final int G(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    public final boolean H() {
        return this.f51904g;
    }

    @Override // p50.e
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void g(@m80.k b holder, @m80.k final x0 wordInfo) {
        g0.p(holder, "holder");
        g0.p(wordInfo, "wordInfo");
        final ug b11 = holder.b();
        b11.f57015f.setText(wordInfo.r());
        String p11 = wordInfo.p();
        List o52 = p11 != null ? k0.o5(p11, new String[]{"·"}, false, 0, 6, null) : null;
        if (b11.f57013d.getChildCount() == 0 && o52 != null) {
            int i11 = 0;
            for (Object obj : o52) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                LinearLayout linearLayout = b11.f57013d;
                Context context = b11.getRoot().getContext();
                g0.o(context, "getContext(...)");
                linearLayout.addView(F(context, (String) obj));
                if (i11 < o52.size() - 1) {
                    Context context2 = b11.getRoot().getContext();
                    g0.o(context2, "getContext(...)");
                    TextView F = F(context2, "·");
                    b11.f57013d.addView(F);
                    sa.q.z(F, false);
                    this.f51903f.add(F);
                }
                i11 = i12;
            }
        }
        AppCompatTextView word = b11.f57015f;
        g0.o(word, "word");
        sa.q.t(word, 0, new x00.l() { // from class: fj.w
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 J;
                J = d0.J(x0.this, b11, this, (View) obj2);
                return J;
            }
        }, 1, null);
        LinearLayout splitTextLayout = b11.f57013d;
        g0.o(splitTextLayout, "splitTextLayout");
        sa.q.t(splitTextLayout, 0, new x00.l() { // from class: fj.x
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 K;
                K = d0.K(x0.this, this, b11, (View) obj2);
                return K;
            }
        }, 1, null);
        LottieAnimationView voiceImg = b11.f57014e;
        g0.o(voiceImg, "voiceImg");
        sa.q.t(voiceImg, 0, new x00.l() { // from class: fj.y
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 L;
                L = d0.L(x0.this, this, (View) obj2);
                return L;
            }
        }, 1, null);
        LottieAnimationView voiceImg2 = b11.f57014e;
        g0.o(voiceImg2, "voiceImg");
        sa.q.z(voiceImg2, wordInfo.l() != null);
        wordInfo.a().observe(p(), new c(new x00.l() { // from class: fj.z
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 M;
                M = d0.M(ug.this, (Boolean) obj2);
                return M;
            }
        }));
        hj.m l02 = this.f51902e.l0();
        if (l02 != null) {
            l02.D(new hj.a() { // from class: fj.a0
                @Override // hj.a
                public final void onResult(Object obj2) {
                    d0.N(ug.this, wordInfo, (List) obj2);
                }
            });
        } else {
            b11.f57011b.setSelected(false);
        }
        ImageView imgCollect = b11.f57011b;
        g0.o(imgCollect, "imgCollect");
        sa.q.t(imgCollect, 0, new x00.l() { // from class: fj.b0
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 O;
                O = d0.O(d0.this, wordInfo, b11, (View) obj2);
                return O;
            }
        }, 1, null);
        b11.f57012c.setText(wordInfo.o());
        TextView textView = b11.f57010a;
        g0.m(textView);
        sa.q.z(textView, false);
        com.baicizhan.main.wikiv2.studyv2.data.w n11 = wordInfo.n();
        if (n11 != null) {
            com.baicizhan.main.wikiv2.studyv2.data.w wVar = m0.a(n11) ? n11 : null;
            if (wVar != null) {
                final String str = "在近" + wVar.h() + "年" + wVar.f() + "真题中出现 " + wVar.g() + " 次";
                sa.q.z(textView, true);
                DSLKitKt.highLightDsl(textView, new x00.l() { // from class: fj.c0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        g2 Q;
                        Q = d0.Q(str, (SpannableWrapper) obj2);
                        return Q;
                    }
                });
            }
        }
        o(holder);
    }

    @Override // li.e
    @m80.k
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b q(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        g0.p(inflater, "inflater");
        g0.p(parent, "parent");
        return new b(this, (ug) wi.p.f96399a.b(ug.class, inflater, parent));
    }

    @Override // li.e
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void t(@m80.k b holder) {
        g0.p(holder, "holder");
        super.t(holder);
        wi.p.f96399a.d(ug.class, holder.b());
    }

    public final void T(boolean z11) {
        this.f51904g = z11;
    }

    public final void U(ug ugVar, List<TextView> list, boolean z11) {
        if (z11) {
            AppCompatTextView word = ugVar.f57015f;
            g0.o(word, "word");
            sa.q.z(word, false);
            LinearLayout splitTextLayout = ugVar.f57013d;
            g0.o(splitTextLayout, "splitTextLayout");
            sa.q.z(splitTextLayout, true);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (final TextView textView : list) {
            int G = G(textView);
            ValueAnimator ofInt = z11 ? ValueAnimator.ofInt(0, G) : ValueAnimator.ofInt(G, 0);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fj.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d0.V(textView, valueAnimator);
                }
            });
            g0.m(ofInt);
            arrayList.add(ofInt);
        }
        animatorSet.playTogether(arrayList);
        if (z11) {
            AppCompatTextView word2 = ugVar.f57015f;
            g0.o(word2, "word");
            sa.q.z(word2, false);
            LinearLayout splitTextLayout2 = ugVar.f57013d;
            g0.o(splitTextLayout2, "splitTextLayout");
            sa.q.z(splitTextLayout2, true);
        } else {
            animatorSet.addListener(new d(ugVar));
        }
        animatorSet.start();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 WikiWordInfoBinder.kt\ncom/baicizhan/main/wikiv2/studyv2/binder/WikiWordInfoBinder\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n202#3,3:125\n94#4:128\n93#5:129\n*E\n"})
    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ug f51907a;

        public d(ug ugVar) {
            this.f51907a = ugVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@m80.k Animator animator) {
            AppCompatTextView word = this.f51907a.f57015f;
            g0.o(word, "word");
            sa.q.z(word, true);
            LinearLayout splitTextLayout = this.f51907a.f57013d;
            g0.o(splitTextLayout, "splitTextLayout");
            sa.q.z(splitTextLayout, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@m80.k Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@m80.k Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@m80.k Animator animator) {
        }
    }
}
