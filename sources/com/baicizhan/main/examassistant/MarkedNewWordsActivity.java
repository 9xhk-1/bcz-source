package com.baicizhan.main.examassistant;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.util.DSLKitKt;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.SpannableWrapper;
import com.baicizhan.main.customview.SwipeMenuLayout;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.jiongji.andriod.card.R;
import gs.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nMarkedNewWordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkedNewWordsActivity.kt\ncom/baicizhan/main/examassistant/MarkedNewWordsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1#2:260\n1869#3,2:261\n1878#3,3:263\n*S KotlinDebug\n*F\n+ 1 MarkedNewWordsActivity.kt\ncom/baicizhan/main/examassistant/MarkedNewWordsActivity\n*L\n111#1:261,2\n115#1:263,3\n*E\n"})
/* loaded from: classes4.dex */
public final class MarkedNewWordsActivity extends BaseAppCompatActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final int f20341f = 8;

    /* renamed from: a, reason: collision with root package name */
    public gs.i1 f20342a;

    /* renamed from: b, reason: collision with root package name */
    public t1 f20343b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f20344c = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.examassistant.j
        @Override // x00.a
        public final Object invoke() {
            k0 q12;
            q12 = MarkedNewWordsActivity.q1(MarkedNewWordsActivity.this);
            return q12;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<RecyclerView.ItemDecoration> f20345d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public PopupWindow f20346e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f20347a;

        public a(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f20347a = function;
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
            return this.f20347a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f20347a.invoke(obj);
        }
    }

    public static final void B1(MarkedNewWordsActivity markedNewWordsActivity) {
        markedNewWordsActivity.s1(1.0f);
    }

    public static final yz.g2 C1(MarkedNewWordsActivity markedNewWordsActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        t1 t1Var = markedNewWordsActivity.f20343b;
        gs.i1 i1Var = null;
        if (t1Var == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
            t1Var = null;
        }
        t1Var.i();
        gs.i1 i1Var2 = markedNewWordsActivity.f20342a;
        if (i1Var2 == null) {
            kotlin.jvm.internal.g0.S("mBinding");
        } else {
            i1Var = i1Var2;
        }
        i1Var.f55258l.scrollToPosition(0);
        return yz.g2.f100423a;
    }

    public static final yz.g2 D1(MarkedNewWordsActivity markedNewWordsActivity, View view) {
        kotlin.jvm.internal.g0.p(view, "<unused var>");
        t1 t1Var = markedNewWordsActivity.f20343b;
        if (t1Var == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
            t1Var = null;
        }
        t1Var.H();
        markedNewWordsActivity.c1().notifyDataSetChanged();
        return yz.g2.f100423a;
    }

    public static final yz.g2 E1(MarkedNewWordsActivity markedNewWordsActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        markedNewWordsActivity.z1();
        return yz.g2.f100423a;
    }

    private final void d1() {
        gs.i1 i1Var = this.f20342a;
        if (i1Var == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            i1Var = null;
        }
        gs.a aVar = i1Var.f55247a;
        aVar.D(new View.OnClickListener() { // from class: com.baicizhan.main.examassistant.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarkedNewWordsActivity.e1(MarkedNewWordsActivity.this, view);
            }
        });
        aVar.L(new View.OnClickListener() { // from class: com.baicizhan.main.examassistant.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarkedNewWordsActivity.f1(MarkedNewWordsActivity.this, view);
            }
        });
        RecyclerView recyclerView = i1Var.f55258l;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(c1());
        TextView studyBtn = i1Var.f55255i;
        kotlin.jvm.internal.g0.o(studyBtn, "studyBtn");
        sa.q.t(studyBtn, 0, new x00.l() { // from class: com.baicizhan.main.examassistant.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 g12;
                g12 = MarkedNewWordsActivity.g1(MarkedNewWordsActivity.this, (View) obj);
                return g12;
            }
        }, 1, null);
        TextView cancelCollectBtn = i1Var.f55249c;
        kotlin.jvm.internal.g0.o(cancelCollectBtn, "cancelCollectBtn");
        sa.q.t(cancelCollectBtn, 0, new x00.l() { // from class: com.baicizhan.main.examassistant.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 h12;
                h12 = MarkedNewWordsActivity.h1(MarkedNewWordsActivity.this, (View) obj);
                return h12;
            }
        }, 1, null);
        TextView doCollectBtn = i1Var.f55253g;
        kotlin.jvm.internal.g0.o(doCollectBtn, "doCollectBtn");
        sa.q.t(doCollectBtn, 0, new x00.l() { // from class: com.baicizhan.main.examassistant.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 i12;
                i12 = MarkedNewWordsActivity.i1(MarkedNewWordsActivity.this, (View) obj);
                return i12;
            }
        }, 1, null);
        i1Var.f55257k.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.examassistant.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarkedNewWordsActivity.k1(MarkedNewWordsActivity.this, view);
            }
        });
    }

    public static final void e1(MarkedNewWordsActivity markedNewWordsActivity, View view) {
        markedNewWordsActivity.finish();
    }

    public static final void f1(MarkedNewWordsActivity markedNewWordsActivity, View view) {
        markedNewWordsActivity.A1();
        markedNewWordsActivity.b1();
    }

    public static final yz.g2 g1(MarkedNewWordsActivity markedNewWordsActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        t1 t1Var = markedNewWordsActivity.f20343b;
        if (t1Var == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
            t1Var = null;
        }
        t1Var.A(markedNewWordsActivity);
        SwipeMenuLayout.f20172i.e();
        return yz.g2.f100423a;
    }

    public static final yz.g2 h1(MarkedNewWordsActivity markedNewWordsActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        markedNewWordsActivity.b1();
        return yz.g2.f100423a;
    }

    public static final yz.g2 i1(final MarkedNewWordsActivity markedNewWordsActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        t1 t1Var = markedNewWordsActivity.f20343b;
        if (t1Var == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
            t1Var = null;
        }
        t1Var.k(new x00.l() { // from class: com.baicizhan.main.examassistant.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 j12;
                j12 = MarkedNewWordsActivity.j1(MarkedNewWordsActivity.this, ((Boolean) obj).booleanValue());
                return j12;
            }
        });
        return yz.g2.f100423a;
    }

    public static final yz.g2 j1(MarkedNewWordsActivity markedNewWordsActivity, boolean z11) {
        markedNewWordsActivity.b1();
        return yz.g2.f100423a;
    }

    public static final void k1(MarkedNewWordsActivity markedNewWordsActivity, View view) {
        view.setSelected(!view.isSelected());
        markedNewWordsActivity.c1().m(view.isSelected());
    }

    private final void l1() {
        final t1 t1Var = this.f20343b;
        if (t1Var == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
            t1Var = null;
        }
        t1Var.p().observe(this, new a(new x00.l() { // from class: com.baicizhan.main.examassistant.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 m12;
                m12 = MarkedNewWordsActivity.m1(MarkedNewWordsActivity.this, (Boolean) obj);
                return m12;
            }
        }));
        t1Var.u().observe(this, new a(new x00.l() { // from class: com.baicizhan.main.examassistant.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 n12;
                n12 = MarkedNewWordsActivity.n1(MarkedNewWordsActivity.this, (List) obj);
                return n12;
            }
        }));
        t1Var.y().observe(this, new a(new x00.l() { // from class: com.baicizhan.main.examassistant.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 o12;
                o12 = MarkedNewWordsActivity.o1(MarkedNewWordsActivity.this, (Integer) obj);
                return o12;
            }
        }));
        c1().o().observe(this, new a(new x00.l() { // from class: com.baicizhan.main.examassistant.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 p12;
                p12 = MarkedNewWordsActivity.p1(MarkedNewWordsActivity.this, t1Var, (Integer) obj);
                return p12;
            }
        }));
        t1Var.start();
    }

    public static final yz.g2 m1(MarkedNewWordsActivity markedNewWordsActivity, Boolean bool) {
        kotlin.jvm.internal.g0.m(bool);
        LoadingDialogActivity.setLoading$default(markedNewWordsActivity, bool.booleanValue(), 0L, null, 6, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 n1(MarkedNewWordsActivity markedNewWordsActivity, List list) {
        k0 c12 = markedNewWordsActivity.c1();
        kotlin.jvm.internal.g0.m(list);
        c12.H(list);
        markedNewWordsActivity.v1(list);
        return yz.g2.f100423a;
    }

    public static final yz.g2 o1(MarkedNewWordsActivity markedNewWordsActivity, Integer num) {
        kotlin.jvm.internal.g0.m(num);
        markedNewWordsActivity.x1(num.intValue());
        return yz.g2.f100423a;
    }

    public static final yz.g2 p1(MarkedNewWordsActivity markedNewWordsActivity, t1 t1Var, Integer num) {
        gs.i1 i1Var = markedNewWordsActivity.f20342a;
        if (i1Var == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            i1Var = null;
        }
        i1Var.f55257k.setSelected(kotlin.jvm.internal.g0.g(num, t1Var.y().getValue()));
        i1Var.f55253g.setEnabled(num.intValue() > 0);
        return yz.g2.f100423a;
    }

    public static final k0 q1(MarkedNewWordsActivity markedNewWordsActivity) {
        t1 t1Var = markedNewWordsActivity.f20343b;
        if (t1Var == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
            t1Var = null;
        }
        return new k0(t1Var);
    }

    public static final void r1(MarkedNewWordsActivity markedNewWordsActivity, int i11, ij.e it) {
        kotlin.jvm.internal.g0.p(it, "it");
        Application application = markedNewWordsActivity.getApplication();
        kotlin.jvm.internal.g0.o(application, "getApplication(...)");
        t1 t1Var = null;
        markedNewWordsActivity.f20343b = (t1) new ViewModelProvider(markedNewWordsActivity, new x(application, new hj.m(markedNewWordsActivity, null, it), i11)).get(t1.class);
        gs.i1 i1Var = markedNewWordsActivity.f20342a;
        if (i1Var == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            i1Var = null;
        }
        t1 t1Var2 = markedNewWordsActivity.f20343b;
        if (t1Var2 == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
        } else {
            t1Var = t1Var2;
        }
        i1Var.j(t1Var);
        i1Var.setLifecycleOwner(markedNewWordsActivity);
        markedNewWordsActivity.d1();
        markedNewWordsActivity.l1();
    }

    private final void s1(float f11) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.alpha = f11;
        getWindow().setAttributes(attributes);
    }

    private final void t1(View view, final x00.l<? super View, yz.g2> lVar) {
        sa.q.t(view, 0, new x00.l() { // from class: com.baicizhan.main.examassistant.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 u12;
                u12 = MarkedNewWordsActivity.u1(x00.l.this, this, (View) obj);
                return u12;
            }
        }, 1, null);
    }

    public static final yz.g2 u1(x00.l lVar, MarkedNewWordsActivity markedNewWordsActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        lVar.invoke(it);
        PopupWindow popupWindow = markedNewWordsActivity.f20346e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        return yz.g2.f100423a;
    }

    private final void w1(TextView textView, int i11) {
        Drawable drawable = KotlinExtKt.getDrawable(i11);
        if (drawable != null) {
            drawable.setBounds(0, 0, KotlinExtKt.getDpPixels(16), KotlinExtKt.getDpPixels(16));
        }
        textView.setCompoundDrawablePadding(KotlinExtKt.getDpPixels(4));
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public static final yz.g2 y1(String str, SpannableWrapper highLightDsl) {
        kotlin.jvm.internal.g0.p(highLightDsl, "$this$highLightDsl");
        highLightDsl.setContent(str);
        highLightDsl.setStart(4);
        highLightDsl.setEnd(str.length() - 2);
        highLightDsl.setSizeDp(16);
        highLightDsl.setTextColor(KotlinExtKt.getColorInt(R.color.main_blue_color));
        return yz.g2.f100423a;
    }

    public final void A1() {
        PopupWindow popupWindow;
        gs.i1 i1Var = null;
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.popup_marked_word_menu, null, false);
        kotlin.jvm.internal.g0.o(inflate, "inflate(...)");
        am amVar = (am) inflate;
        PopupWindow popupWindow2 = new PopupWindow(amVar.getRoot());
        popupWindow2.setWidth(KotlinExtKt.getDimenPx(R.dimen.word_book_detail_pop_width));
        popupWindow2.setHeight(-2);
        popupWindow2.setFocusable(true);
        s1(0.75f);
        popupWindow2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.baicizhan.main.examassistant.k
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                MarkedNewWordsActivity.B1(MarkedNewWordsActivity.this);
            }
        });
        this.f20346e = popupWindow2;
        t1 t1Var = this.f20343b;
        if (t1Var == null) {
            kotlin.jvm.internal.g0.S("mViewModel");
            t1Var = null;
        }
        TextView timeOrder = amVar.f54202c;
        kotlin.jvm.internal.g0.o(timeOrder, "timeOrder");
        w1(timeOrder, R.drawable.ic_menu_time);
        TextView showHideChinese = amVar.f54201b;
        kotlin.jvm.internal.g0.o(showHideChinese, "showHideChinese");
        w1(showHideChinese, t1Var.r() ? R.drawable.img_word_book_menu_show : R.drawable.img_word_book_menu_hide);
        TextView collect = amVar.f54200a;
        kotlin.jvm.internal.g0.o(collect, "collect");
        w1(collect, R.drawable.ic_word_book_menu_edit);
        amVar.f54202c.setText(getString(t1Var.t() ? R.string.marked_word_order_time_reverse : R.string.marked_word_order_time));
        amVar.f54201b.setText(getString(t1Var.r() ? R.string.word_book_menu_switch_show_ch : R.string.word_book_menu_switch_hide_ch));
        TextView timeOrder2 = amVar.f54202c;
        kotlin.jvm.internal.g0.o(timeOrder2, "timeOrder");
        t1(timeOrder2, new x00.l() { // from class: com.baicizhan.main.examassistant.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 C1;
                C1 = MarkedNewWordsActivity.C1(MarkedNewWordsActivity.this, (View) obj);
                return C1;
            }
        });
        TextView showHideChinese2 = amVar.f54201b;
        kotlin.jvm.internal.g0.o(showHideChinese2, "showHideChinese");
        t1(showHideChinese2, new x00.l() { // from class: com.baicizhan.main.examassistant.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 D1;
                D1 = MarkedNewWordsActivity.D1(MarkedNewWordsActivity.this, (View) obj);
                return D1;
            }
        });
        TextView collect2 = amVar.f54200a;
        kotlin.jvm.internal.g0.o(collect2, "collect");
        t1(collect2, new x00.l() { // from class: com.baicizhan.main.examassistant.n
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 E1;
                E1 = MarkedNewWordsActivity.E1(MarkedNewWordsActivity.this, (View) obj);
                return E1;
            }
        });
        PopupWindow popupWindow3 = this.f20346e;
        if (popupWindow3 == null || popupWindow3.isShowing() || (popupWindow = this.f20346e) == null) {
            return;
        }
        gs.i1 i1Var2 = this.f20342a;
        if (i1Var2 == null) {
            kotlin.jvm.internal.g0.S("mBinding");
        } else {
            i1Var = i1Var2;
        }
        popupWindow.showAsDropDown(i1Var.f55247a.f54088d, KotlinExtKt.getDimenPx(R.dimen.word_book_detail_pop_x_offset), 0);
    }

    public final void b1() {
        gs.i1 i1Var = this.f20342a;
        t1 t1Var = null;
        if (i1Var == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            i1Var = null;
        }
        if (c1().r()) {
            LinearLayout collectPanel = i1Var.f55251e;
            kotlin.jvm.internal.g0.o(collectPanel, "collectPanel");
            sa.q.n(collectPanel);
            t1 t1Var2 = this.f20343b;
            if (t1Var2 == null) {
                kotlin.jvm.internal.g0.S("mViewModel");
            } else {
                t1Var = t1Var2;
            }
            if (kotlin.jvm.internal.g0.g(t1Var.x().getValue(), Boolean.TRUE)) {
                LinearLayout studyPanel = i1Var.f55256j;
                kotlin.jvm.internal.g0.o(studyPanel, "studyPanel");
                sa.q.C(studyPanel);
            }
            c1().F(false);
        }
        SwipeMenuLayout.f20172i.e();
    }

    public final k0 c1() {
        return (k0) this.f20344c.getValue();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            if (kotlin.jvm.internal.g0.g("com.baicizhan.favoritebooks", data.getHost()) && kotlin.jvm.internal.g0.g("/markedlist", data.getPath())) {
                String queryParameter = data.getQueryParameter("paperId");
                num = queryParameter != null ? u30.e0.p1(queryParameter) : null;
            } else {
                num = 0;
            }
            if (num != null) {
                Integer num2 = num.intValue() != 0 ? num : null;
                if (num2 != null) {
                    final int intValue = num2.intValue();
                    ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_marked_word);
                    kotlin.jvm.internal.g0.o(contentView, "setContentView(...)");
                    this.f20342a = (gs.i1) contentView;
                    hj.p.d(this, new rj.e() { // from class: com.baicizhan.main.examassistant.u
                        @Override // rj.e
                        public final void a(ij.e eVar) {
                            MarkedNewWordsActivity.r1(MarkedNewWordsActivity.this, intValue, eVar);
                        }
                    });
                    return;
                }
            }
        }
        va.g.i("出错啦", 0);
        finish();
    }

    public final void v1(List<? extends Object> list) {
        int L = list != null ? a00.h0.L(list) : -1;
        if (list != null) {
            Iterator<T> it = this.f20345d.iterator();
            while (true) {
                gs.i1 i1Var = null;
                if (!it.hasNext()) {
                    break;
                }
                RecyclerView.ItemDecoration itemDecoration = (RecyclerView.ItemDecoration) it.next();
                gs.i1 i1Var2 = this.f20342a;
                if (i1Var2 == null) {
                    kotlin.jvm.internal.g0.S("mBinding");
                } else {
                    i1Var = i1Var2;
                }
                i1Var.f55258l.removeItemDecoration(itemDecoration);
            }
            this.f20345d.clear();
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    a00.h0.b0();
                }
                if (1 <= i11 && i11 <= L) {
                    int i13 = i11 - 1;
                    if ((list.get(i13) instanceof MarkedWord) && (obj instanceof MarkedWord)) {
                        gs.i1 i1Var3 = this.f20342a;
                        if (i1Var3 == null) {
                            kotlin.jvm.internal.g0.S("mBinding");
                            i1Var3 = null;
                        }
                        RecyclerView recyclerView = i1Var3.f55258l;
                        xl.c cVar = new xl.c(this, 1, i13, i11, false, 16, null);
                        Drawable drawable = getResources().getDrawable(R.drawable.divider_height_1dp_color_gray06, null);
                        kotlin.jvm.internal.g0.o(drawable, "getDrawable(...)");
                        cVar.setDrawable(drawable);
                        this.f20345d.add(cVar);
                        recyclerView.addItemDecoration(cVar);
                        i11 = i12;
                    }
                }
                i11 = i12;
            }
        }
    }

    public final void x1(int i11) {
        final String str = "已添加 " + i11 + WordPlanInfoView.f22926m;
        gs.i1 i1Var = this.f20342a;
        gs.i1 i1Var2 = null;
        if (i1Var == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            i1Var = null;
        }
        TextView wordNumText = i1Var.f55259m;
        kotlin.jvm.internal.g0.o(wordNumText, "wordNumText");
        DSLKitKt.highLightDsl(wordNumText, new x00.l() { // from class: com.baicizhan.main.examassistant.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 y12;
                y12 = MarkedNewWordsActivity.y1(str, (SpannableWrapper) obj);
                return y12;
            }
        });
        gs.i1 i1Var3 = this.f20342a;
        if (i1Var3 == null) {
            kotlin.jvm.internal.g0.S("mBinding");
        } else {
            i1Var2 = i1Var3;
        }
        i1Var2.f55252f.setText("已标记" + i11 + "个生词");
    }

    public final void z1() {
        gs.i1 i1Var = this.f20342a;
        if (i1Var == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            i1Var = null;
        }
        LinearLayout studyPanel = i1Var.f55256j;
        kotlin.jvm.internal.g0.o(studyPanel, "studyPanel");
        sa.q.n(studyPanel);
        LinearLayout collectPanel = i1Var.f55251e;
        kotlin.jvm.internal.g0.o(collectPanel, "collectPanel");
        sa.q.C(collectPanel);
        c1().F(true);
    }
}
