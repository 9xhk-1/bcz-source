package com.baicizhan.main.wikiv2.lookup.wikiv2.view;

import a00.h0;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.lookup.wikiv2.view.SimpleTabLayout;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import sa.q;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSimpleTabLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleTabLayout.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/SimpleTabLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1878#2,3:209\n1878#2,3:212\n*S KotlinDebug\n*F\n+ 1 SimpleTabLayout.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/SimpleTabLayout\n*L\n68#1:209,3\n140#1:212,3\n*E\n"})
/* loaded from: classes3.dex */
public final class SimpleTabLayout extends FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final int f25810p = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FlowLayout f25811a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<TextView> f25812b;

    /* renamed from: c, reason: collision with root package name */
    public int f25813c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public p<? super Integer, ? super String, g2> f25814d;

    /* renamed from: e, reason: collision with root package name */
    public float f25815e;

    /* renamed from: f, reason: collision with root package name */
    public int f25816f;

    /* renamed from: g, reason: collision with root package name */
    public int f25817g;

    /* renamed from: h, reason: collision with root package name */
    public int f25818h;

    /* renamed from: i, reason: collision with root package name */
    public int f25819i;

    /* renamed from: j, reason: collision with root package name */
    public int f25820j;

    /* renamed from: k, reason: collision with root package name */
    public int f25821k;

    /* renamed from: l, reason: collision with root package name */
    public int f25822l;

    /* renamed from: m, reason: collision with root package name */
    public int f25823m;

    /* renamed from: n, reason: collision with root package name */
    public int f25824n;

    /* renamed from: o, reason: collision with root package name */
    public int f25825o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleTabLayout(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public static final g2 d(SimpleTabLayout simpleTabLayout, int i11, View it) {
        g0.p(it, "it");
        simpleTabLayout.e(i11, true);
        return g2.f100423a;
    }

    public static /* synthetic */ void f(SimpleTabLayout simpleTabLayout, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        simpleTabLayout.e(i11, z11);
    }

    public static /* synthetic */ void k(SimpleTabLayout simpleTabLayout, List list, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        simpleTabLayout.j(list, i11);
    }

    public final GradientDrawable b(boolean z11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(KotlinExtKt.getDpValue(this.f25820j));
        if (z11) {
            gradientDrawable.setColor(this.f25823m);
            return gradientDrawable;
        }
        gradientDrawable.setColor(this.f25824n);
        return gradientDrawable;
    }

    public final TextView c(String str, final int i11) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        textView.setPadding(KotlinExtKt.getDpValue(this.f25816f), KotlinExtKt.getDpValue(this.f25817g), KotlinExtKt.getDpValue(this.f25816f), KotlinExtKt.getDpValue(this.f25817g));
        textView.setTextSize(2, this.f25815e);
        textView.setGravity(17);
        textView.setTextColor(this.f25822l);
        textView.setBackground(b(false));
        q.t(textView, 0, new x00.l() { // from class: vi.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = SimpleTabLayout.d(SimpleTabLayout.this, i11, (View) obj);
                return d11;
            }
        }, 1, null);
        return textView;
    }

    public final void e(int i11, boolean z11) {
        p<? super Integer, ? super String, g2> pVar;
        if (i11 < 0 || i11 >= this.f25812b.size() || i11 == this.f25813c) {
            return;
        }
        this.f25813c = i11;
        int i12 = 0;
        for (Object obj : this.f25812b) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                h0.b0();
            }
            TextView textView = (TextView) obj;
            boolean z12 = i12 == i11;
            textView.setTextColor(z12 ? this.f25821k : this.f25822l);
            textView.setBackground(b(z12));
            i12 = i13;
        }
        if (!z11 || (pVar = this.f25814d) == null) {
            return;
        }
        pVar.invoke(Integer.valueOf(i11), this.f25812b.get(i11).getText().toString());
    }

    public final void g(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f25821k = i11;
        this.f25822l = i12;
        this.f25823m = i13;
        this.f25824n = i14;
    }

    public final int getSelectedPosition() {
        return this.f25813c;
    }

    @l
    public final String getSelectedTab() {
        int size = this.f25812b.size();
        int i11 = this.f25813c;
        if (i11 < 0 || i11 >= size) {
            return null;
        }
        return this.f25812b.get(i11).getText().toString();
    }

    public final void h(int i11, int i12) {
        this.f25818h = i11;
        this.f25819i = i12;
    }

    public final void i(int i11, int i12) {
        this.f25816f = i11;
        this.f25817g = i12;
    }

    public final void j(@k List<String> tabs, int i11) {
        g0.p(tabs, "tabs");
        this.f25811a.removeAllViews();
        this.f25812b.clear();
        this.f25813c = -1;
        int i12 = 0;
        for (Object obj : tabs) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                h0.b0();
            }
            TextView c11 = c((String) obj, i12);
            this.f25811a.addView(c11);
            this.f25812b.add(c11);
            i12 = i13;
        }
        if (i11 < 0 || i11 >= tabs.size()) {
            return;
        }
        e(i11, false);
    }

    public final void setOnTabSelectedListener(@k p<? super Integer, ? super String, g2> listener) {
        g0.p(listener, "listener");
        this.f25814d = listener;
    }

    public final void setTabCornerRadius(int i11) {
        this.f25820j = i11;
    }

    public final void setTabTextSize(float f11) {
        this.f25815e = f11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleTabLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleTabLayout(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f25812b = new ArrayList();
        this.f25813c = -1;
        this.f25815e = 12.0f;
        this.f25816f = 8;
        this.f25817g = 3;
        this.f25818h = 8;
        this.f25819i = 8;
        this.f25820j = 20;
        this.f25821k = -1;
        this.f25822l = KotlinExtKt.getColorInt(R.color.main_color_word_822);
        this.f25823m = Color.parseColor("#606A7E");
        this.f25824n = Color.parseColor("#E6E9EE");
        FlowLayout flowLayout = new FlowLayout(context, null, 0, 6, null);
        flowLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        flowLayout.setHorizontalSpacing(KotlinExtKt.getDpValue(this.f25818h));
        flowLayout.setVerticalSpacing(KotlinExtKt.getDpValue(this.f25819i));
        this.f25811a = flowLayout;
        addView(flowLayout);
    }

    public /* synthetic */ SimpleTabLayout(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
