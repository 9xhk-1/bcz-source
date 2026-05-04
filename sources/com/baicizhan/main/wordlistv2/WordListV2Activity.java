package com.baicizhan.main.wordlistv2;

import a00.k1;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wordlistv2.WordListV2Activity;
import com.baicizhan.main.wordlistv2.repo.OrderType;
import com.baicizhan.main.wordlistv2.repo.WordListType;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.jiongji.andriod.card.R;
import gs.d3;
import gs.em;
import java.util.ArrayList;
import java.util.List;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListV2Activity.kt\ncom/baicizhan/main/wordlistv2/WordListV2Activity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,258:1\n70#2,11:259\n*S KotlinDebug\n*F\n+ 1 WordListV2Activity.kt\ncom/baicizhan/main/wordlistv2/WordListV2Activity\n*L\n54#1:259,11\n*E\n"})
@qu.b
/* loaded from: classes5.dex */
public final class WordListV2Activity extends Hilt_WordListV2Activity {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final a f27829j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f27830k = 8;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final yz.c0 f27832f;

    /* renamed from: i, reason: collision with root package name */
    public int f27835i;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final yz.c0 f27831e = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wordlistv2.u
        @Override // x00.a
        public final Object invoke() {
            d3 J1;
            J1 = WordListV2Activity.J1(WordListV2Activity.this);
            return J1;
        }
    });

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f27833g = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wordlistv2.f0
        @Override // x00.a
        public final Object invoke() {
            List P1;
            P1 = WordListV2Activity.P1();
            return P1;
        }
    });

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public WordListContentFragment f27834h = l1().get(0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) WordListV2Activity.class));
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d3 f27836a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WordListV2Activity f27837b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f27838c;

        public b(d3 d3Var, WordListV2Activity wordListV2Activity, List<String> list) {
            this.f27836a = d3Var;
            this.f27837b = wordListV2Activity;
            this.f27838c = list;
        }

        public static final g2 d(WordListV2Activity wordListV2Activity, d3 d3Var, int i11, List list, Integer num) {
            ImageView imageView = wordListV2Activity.j1().f54563f.f54088d;
            imageView.setEnabled(i11 == a00.h0.L(list) && num.intValue() > 0);
            imageView.setAlpha(!imageView.isEnabled() ? 0.38f : 1.0f);
            d3Var.f54573p.setText("共" + num + "词");
            d3Var.f54567j.setEnabled(num.intValue() > 0);
            d3Var.f54569l.setEnabled(num.intValue() > 0 || i11 == 0);
            return g2.f100423a;
        }

        public static final g2 e(WordListV2Activity wordListV2Activity, Boolean bool) {
            kotlin.jvm.internal.g0.m(bool);
            wordListV2Activity.O1(bool.booleanValue());
            return g2.f100423a;
        }

        public static final g2 f(WordListV2Activity wordListV2Activity, Integer num) {
            MutableLiveData<Integer> d11;
            wordListV2Activity.j1().f54566i.setEnabled(num.intValue() > 0);
            wordListV2Activity.j1().f54572o.setText("已选" + num + "词");
            MutableLiveData<Boolean> h11 = wordListV2Activity.k1().h();
            e1 p11 = wordListV2Activity.k1().p();
            h11.setValue(Boolean.valueOf(kotlin.jvm.internal.g0.g(num, (p11 == null || (d11 = p11.d()) == null) ? null : d11.getValue())));
            return g2.f100423a;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(final int i11) {
            OrderType orderType;
            List<OrderType> orderOptionList;
            MutableLiveData<OrderType> c11;
            MutableLiveData<Integer> d11;
            ImageView ivTip = this.f27836a.f54561d;
            kotlin.jvm.internal.g0.o(ivTip, "ivTip");
            sa.q.z(ivTip, i11 == WordListType.MASTERED.getType());
            super.onPageSelected(i11);
            e1 p11 = this.f27837b.k1().p();
            if (p11 != null && (d11 = p11.d()) != null) {
                d11.removeObservers(this.f27837b);
            }
            this.f27837b.k1().c(i11);
            WordListV2Activity wordListV2Activity = this.f27837b;
            wordListV2Activity.f27834h = wordListV2Activity.l1().get(i11);
            e1 p12 = this.f27837b.k1().p();
            if (p12 != null) {
                final WordListV2Activity wordListV2Activity2 = this.f27837b;
                final d3 d3Var = this.f27836a;
                final List<String> list = this.f27838c;
                p12.d().observe(wordListV2Activity2, new c(new x00.l() { // from class: com.baicizhan.main.wordlistv2.r0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 d12;
                        d12 = WordListV2Activity.b.d(WordListV2Activity.this, d3Var, i11, list, (Integer) obj);
                        return d12;
                    }
                }));
                p12.a().observe(wordListV2Activity2, new c(new x00.l() { // from class: com.baicizhan.main.wordlistv2.s0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 e11;
                        e11 = WordListV2Activity.b.e(WordListV2Activity.this, (Boolean) obj);
                        return e11;
                    }
                }));
                p12.b().observe(wordListV2Activity2, new c(new x00.l() { // from class: com.baicizhan.main.wordlistv2.t0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 f11;
                        f11 = WordListV2Activity.b.f(WordListV2Activity.this, (Integer) obj);
                        return f11;
                    }
                }));
            }
            e1 p13 = this.f27837b.k1().p();
            if (p13 == null || (c11 = p13.c()) == null || (orderType = c11.getValue()) == null) {
                WordListType value = this.f27837b.k1().j().getValue();
                orderType = (value == null || (orderOptionList = value.getOrderOptionList()) == null) ? null : orderOptionList.get(0);
            }
            if (orderType != null) {
                this.f27836a.f54569l.setText(orderType.getOrderName());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f27839a;

        public c(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f27839a = function;
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
            return this.f27839a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27839a.invoke(obj);
        }
    }

    public WordListV2Activity() {
        final x00.a aVar = null;
        this.f27832f = new ViewModelLazy(kotlin.jvm.internal.o0.d(w0.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.wordlistv2.WordListV2Activity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.wordlistv2.WordListV2Activity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.wordlistv2.WordListV2Activity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                x00.a aVar2 = x00.a.this;
                return (aVar2 == null || (creationExtras = (CreationExtras) aVar2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    public static final g2 A1(d3 d3Var, OrderType it) {
        kotlin.jvm.internal.g0.p(it, "it");
        d3Var.f54569l.setText(it.getOrderName());
        return g2.f100423a;
    }

    public static final void B1(WordListV2Activity wordListV2Activity, AppBarLayout appBarLayout, int i11) {
        wordListV2Activity.f27834h.Y(wordListV2Activity.f27835i, i11);
    }

    public static final g2 C1(WordListV2Activity wordListV2Activity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordListV2Activity.m1();
        return g2.f100423a;
    }

    public static final g2 D1(WordListV2Activity wordListV2Activity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordListV2Activity.f27834h.W();
        return g2.f100423a;
    }

    public static final g2 E1(View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return g2.f100423a;
    }

    public static final g2 F1(final WordListV2Activity wordListV2Activity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordListV2Activity.f27834h.H(new x00.a() { // from class: com.baicizhan.main.wordlistv2.p0
            @Override // x00.a
            public final Object invoke() {
                g2 G1;
                G1 = WordListV2Activity.G1(WordListV2Activity.this);
                return G1;
            }
        });
        return g2.f100423a;
    }

    public static final g2 G1(WordListV2Activity wordListV2Activity) {
        wordListV2Activity.m1();
        return g2.f100423a;
    }

    public static final g2 H1(WordListV2Activity wordListV2Activity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordListV2Activity.M1();
        return g2.f100423a;
    }

    public static final void I1(d3 d3Var, WordListV2Activity wordListV2Activity) {
        d3Var.f54562e.setTranslationY(-r0.getHeight());
        d3Var.f54558a.setTranslationY(r0.getHeight());
        wordListV2Activity.f27835i = d3Var.f54564g.getHeight();
    }

    public static final d3 J1(WordListV2Activity wordListV2Activity) {
        return d3.e(wordListV2Activity.getLayoutInflater());
    }

    public static final g2 N1(PopupWindow popupWindow, WordListV2Activity wordListV2Activity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        popupWindow.dismiss();
        wordListV2Activity.k1().y();
        return g2.f100423a;
    }

    public static final List P1() {
        ArrayList arrayList = new ArrayList(5);
        for (int i11 = 0; i11 < 5; i11++) {
            arrayList.add(WordListContentFragment.f27810g.a(WordListType.values()[i11]));
        }
        return arrayList;
    }

    private final void n1() {
        final w0 k12 = k1();
        hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.wordlistv2.k0
            @Override // rj.e
            public final void a(ij.e eVar) {
                WordListV2Activity.o1(w0.this, this, eVar);
            }
        });
        k12.i().observe(this, new c(new x00.l() { // from class: com.baicizhan.main.wordlistv2.l0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 p12;
                p12 = WordListV2Activity.p1(WordListV2Activity.this, (Boolean) obj);
                return p12;
            }
        }));
        k12.o().observe(this, new c(new x00.l() { // from class: com.baicizhan.main.wordlistv2.m0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 q12;
                q12 = WordListV2Activity.q1(WordListV2Activity.this, (Boolean) obj);
                return q12;
            }
        }));
        k12.k().observe(this, new c(new x00.l() { // from class: com.baicizhan.main.wordlistv2.n0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r12;
                r12 = WordListV2Activity.r1(WordListV2Activity.this, (Boolean) obj);
                return r12;
            }
        }));
        k12.f().observe(this, new c(new x00.l() { // from class: com.baicizhan.main.wordlistv2.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s12;
                s12 = WordListV2Activity.s1(WordListV2Activity.this, (g2) obj);
                return s12;
            }
        }));
        k12.c(0);
    }

    public static final void o1(w0 w0Var, WordListV2Activity wordListV2Activity, ij.e it) {
        kotlin.jvm.internal.g0.p(it, "it");
        w0Var.E(new hj.m(wordListV2Activity, null, it));
        w0Var.u();
    }

    public static final g2 p1(WordListV2Activity wordListV2Activity, Boolean bool) {
        kotlin.jvm.internal.g0.m(bool);
        wordListV2Activity.O1(bool.booleanValue());
        return g2.f100423a;
    }

    public static final g2 q1(WordListV2Activity wordListV2Activity, Boolean bool) {
        kotlin.jvm.internal.g0.m(bool);
        LoadingDialogActivity.setLoading$default(wordListV2Activity, bool.booleanValue(), 0L, null, 6, null);
        return g2.f100423a;
    }

    public static final g2 r1(WordListV2Activity wordListV2Activity, Boolean bool) {
        ImageView actionBarOperateRight = wordListV2Activity.j1().f54563f.f54088d;
        kotlin.jvm.internal.g0.o(actionBarOperateRight, "actionBarOperateRight");
        sa.q.z(actionBarOperateRight, !bool.booleanValue());
        return g2.f100423a;
    }

    public static final g2 s1(WordListV2Activity wordListV2Activity, g2 g2Var) {
        new uj.j(new uj.a(null, "刚才的单词编辑操作未成功，请在稳定的网络环境下重试~", null, "我知道了", 5, null), null, new x00.a() { // from class: com.baicizhan.main.wordlistv2.q0
            @Override // x00.a
            public final Object invoke() {
                g2 t12;
                t12 = WordListV2Activity.t1();
                return t12;
            }
        }, 2, null).show(wordListV2Activity.getSupportFragmentManager(), "action");
        return g2.f100423a;
    }

    public static final g2 t1() {
        return g2.f100423a;
    }

    private final void u1() {
        final d3 j12 = j1();
        j12.setLifecycleOwner(this);
        j12.j(k1());
        j12.f54563f.D(new View.OnClickListener() { // from class: com.baicizhan.main.wordlistv2.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordListV2Activity.v1(WordListV2Activity.this, view);
            }
        });
        j12.f54563f.L(new View.OnClickListener() { // from class: com.baicizhan.main.wordlistv2.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WordListV2Activity.w1(WordListV2Activity.this, view);
            }
        });
        j12.f54564g.e(new AppBarLayout.g() { // from class: com.baicizhan.main.wordlistv2.z
            @Override // com.google.android.material.appbar.AppBarLayout.g, com.google.android.material.appbar.AppBarLayout.b
            public final void a(AppBarLayout appBarLayout, int i11) {
                WordListV2Activity.B1(WordListV2Activity.this, appBarLayout, i11);
            }
        });
        TextView tvCancelEdit = j12.f54565h;
        kotlin.jvm.internal.g0.o(tvCancelEdit, "tvCancelEdit");
        sa.q.t(tvCancelEdit, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 C1;
                C1 = WordListV2Activity.C1(WordListV2Activity.this, (View) obj);
                return C1;
            }
        }, 1, null);
        TextView tvSelect = j12.f54571n;
        kotlin.jvm.internal.g0.o(tvSelect, "tvSelect");
        KotlinExtKt.expandTouchArea(tvSelect, KotlinExtKt.getDpPixels(20));
        TextView tvSelect2 = j12.f54571n;
        kotlin.jvm.internal.g0.o(tvSelect2, "tvSelect");
        sa.q.t(tvSelect2, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 D1;
                D1 = WordListV2Activity.D1(WordListV2Activity.this, (View) obj);
                return D1;
            }
        }, 1, null);
        ConstraintLayout rlTopEdit = j12.f54562e;
        kotlin.jvm.internal.g0.o(rlTopEdit, "rlTopEdit");
        sa.q.t(rlTopEdit, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.c0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 E1;
                E1 = WordListV2Activity.E1((View) obj);
                return E1;
            }
        }, 1, null);
        TextView tvEditAction = j12.f54566i;
        kotlin.jvm.internal.g0.o(tvEditAction, "tvEditAction");
        sa.q.t(tvEditAction, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 F1;
                F1 = WordListV2Activity.F1(WordListV2Activity.this, (View) obj);
                return F1;
            }
        }, 1, null);
        ImageView ivTip = j12.f54561d;
        kotlin.jvm.internal.g0.o(ivTip, "ivTip");
        sa.q.t(ivTip, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H1;
                H1 = WordListV2Activity.H1(WordListV2Activity.this, (View) obj);
                return H1;
            }
        }, 1, null);
        ViewPager2 viewPager2 = j12.f54574q;
        viewPager2.setAdapter(new f1(this, l1()));
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(4);
        j12.getRoot().post(new Runnable() { // from class: com.baicizhan.main.wordlistv2.g0
            @Override // java.lang.Runnable
            public final void run() {
                WordListV2Activity.I1(d3.this, this);
            }
        });
        final List Q = a00.h0.Q("今日", "未学习", "学习中", "已熟识", "已斩");
        new com.google.android.material.tabs.b(j12.f54575r, j12.f54574q, new b.InterfaceC0378b() { // from class: com.baicizhan.main.wordlistv2.h0
            @Override // com.google.android.material.tabs.b.InterfaceC0378b
            public final void a(TabLayout.i iVar, int i11) {
                WordListV2Activity.x1(Q, iVar, i11);
            }
        }).a();
        j12.f54574q.registerOnPageChangeCallback(new b(j12, this, Q));
        TextView tvHideShow = j12.f54567j;
        kotlin.jvm.internal.g0.o(tvHideShow, "tvHideShow");
        sa.q.t(tvHideShow, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 y12;
                y12 = WordListV2Activity.y1(WordListV2Activity.this, (View) obj);
                return y12;
            }
        }, 1, null);
        TextView tvOption = j12.f54569l;
        kotlin.jvm.internal.g0.o(tvOption, "tvOption");
        sa.q.t(tvOption, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z12;
                z12 = WordListV2Activity.z1(WordListV2Activity.this, j12, (View) obj);
                return z12;
            }
        }, 1, null);
    }

    public static final void v1(WordListV2Activity wordListV2Activity, View view) {
        wordListV2Activity.finish();
    }

    public static final void w1(WordListV2Activity wordListV2Activity, View view) {
        wordListV2Activity.L1();
    }

    public static final void x1(List list, TabLayout.i tab, int i11) {
        kotlin.jvm.internal.g0.p(tab, "tab");
        tab.D((CharSequence) list.get(i11));
    }

    public static final g2 y1(WordListV2Activity wordListV2Activity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        wordListV2Activity.f27834h.X();
        return g2.f100423a;
    }

    public static final g2 z1(WordListV2Activity wordListV2Activity, final d3 d3Var, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        new uj.e(wordListV2Activity.k1(), new x00.l() { // from class: com.baicizhan.main.wordlistv2.j0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 A1;
                A1 = WordListV2Activity.A1(d3.this, (OrderType) obj);
                return A1;
            }
        }).show(wordListV2Activity.getSupportFragmentManager(), "");
        return g2.f100423a;
    }

    public final void K1(boolean z11) {
        View childAt = j1().f54575r.getChildAt(0);
        kotlin.jvm.internal.g0.n(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) childAt;
        linearLayout.setEnabled(z11);
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            linearLayout.getChildAt(i11).setClickable(z11);
        }
    }

    public final void L1() {
        d3 j12 = j1();
        ConstraintLayout rlTopEdit = j12.f54562e;
        kotlin.jvm.internal.g0.o(rlTopEdit, "rlTopEdit");
        sa.q.z(rlTopEdit, true);
        j12.f54562e.animate().translationY(0.0f);
        ConstraintLayout clBottomEdit = j12.f54558a;
        kotlin.jvm.internal.g0.o(clBottomEdit, "clBottomEdit");
        sa.q.z(clBottomEdit, true);
        j12.f54558a.animate().translationY(0.0f);
        j12.f54564g.setAlpha(0.38f);
        K1(false);
        k1().b(true);
        ma.l.e(ma.t.f73011j, ma.a.f72732d5, k1.k(h1.a(ma.b.H1, com.baicizhan.main.wordlistv2.repo.k.f(k1().j().getValue()))));
    }

    public final void M1() {
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.popup_word_list_tip, null, false);
        kotlin.jvm.internal.g0.o(inflate, "inflate(...)");
        em emVar = (em) inflate;
        final PopupWindow popupWindow = new PopupWindow(emVar.getRoot());
        popupWindow.setWidth(KotlinExtKt.getDpValue(R.styleable.Theme_drawable_walk_sound1));
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
        ImageView tipClose = emVar.f54829b;
        kotlin.jvm.internal.g0.o(tipClose, "tipClose");
        sa.q.t(tipClose, 0, new x00.l() { // from class: com.baicizhan.main.wordlistv2.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 N1;
                N1 = WordListV2Activity.N1(popupWindow, this, (View) obj);
                return N1;
            }
        }, 1, null);
        if (popupWindow.isShowing()) {
            return;
        }
        popupWindow.showAsDropDown(j1().f54561d, -KotlinExtKt.getDpValue(37), 0);
    }

    public final void O1(boolean z11) {
        j1().f54567j.setText(z11 ? "显示释义" : "隐藏释义");
        Drawable drawable = KotlinExtKt.getDrawable(z11 ? R.drawable.vector_eye : R.drawable.vector_eye_slash);
        if (drawable != null) {
            drawable.setBounds(0, 0, KotlinExtKt.getDpPixels(16), KotlinExtKt.getDpPixels(16));
        }
        j1().f54567j.setCompoundDrawables(null, null, drawable, null);
    }

    public final d3 j1() {
        return (d3) this.f27831e.getValue();
    }

    public final w0 k1() {
        return (w0) this.f27832f.getValue();
    }

    @m80.k
    public final List<WordListContentFragment> l1() {
        return (List) this.f27833g.getValue();
    }

    public final void m1() {
        d3 j12 = j1();
        j12.f54562e.animate().translationY(-j12.f54562e.getHeight());
        j12.f54558a.animate().translationY(j12.f54558a.getHeight());
        j12.f54564g.setAlpha(1.0f);
        K1(true);
        k1().b(false);
    }

    @Override // com.baicizhan.main.wordlistv2.Hilt_WordListV2Activity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(j1().getRoot());
        u1();
        n1();
    }
}
