package com.baicizhan.main.wikiv2.lookup.wikiv2.view;

import a00.h0;
import a00.l1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.baicizhan.main.wikiv2.lookup.wikiv2.view.TipView;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.bumptech.glide.c;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTipView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TipView.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/TipView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1869#2,2:299\n1869#2,2:301\n1869#2,2:303\n*S KotlinDebug\n*F\n+ 1 TipView.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/TipView\n*L\n118#1:299,2\n127#1:301,2\n169#1:303,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TipView extends LinearLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final int f25826j = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleTabLayout f25827a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f25828b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f25829c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public LifecycleOwner f25830d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public o0 f25831e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public x00.a<g2> f25832f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public Map<Integer, ? extends List<i0.z>> f25833g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<Integer> f25834h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Map<String, Integer> f25835i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = TipView.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            x00.a aVar = TipView.this.f25832f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            g0.p(animation, "animation");
            x00.a aVar = TipView.this.f25832f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public TipView(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public static g2 b(TipView tipView, int i11, String tab) {
        g0.p(tab, "tab");
        Integer num = tipView.f25835i.get(tab);
        if (num != null) {
            tipView.i(num.intValue());
        }
        return g2.f100423a;
    }

    public static final void h(TipView tipView, View view) {
        Object tag = view.getTag();
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        g0.n(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        tipView.j(imageView, !booleanValue);
        imageView.setTag(Boolean.valueOf(!booleanValue));
    }

    public static final void k(int i11, int i12, int i13, int i14, int i15, int i16, ImageView imageView, ValueAnimator animation) {
        g0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        g0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (i11 + ((i12 - i11) * floatValue)), (int) (i13 + ((i14 - i13) * floatValue)));
        layoutParams.setMargins(0, 0, 0, (int) (i15 + ((i16 - i15) * floatValue)));
        imageView.setLayoutParams(layoutParams);
    }

    public final int e(int i11) {
        return (int) (i11 * getContext().getResources().getDisplayMetrics().density);
    }

    public final String f(int i11) {
        switch (i11) {
            case 1:
                return "词根";
            case 2:
                return "谐音";
            case 3:
                return "联想";
            case 4:
                return "押韵";
            case 5:
                return "象形";
            case 6:
                return "小斩";
            case 7:
                return "发音";
            case 8:
                return "阴阳性";
            case 9:
                return "音译";
            case 10:
                return "缩合";
            case 11:
                return ExtendedWordInfo.WordDeform.f25861c;
            case 12:
                return "短尾";
            case 13:
                return "词义区分";
            case 14:
                return "体";
            case 15:
                return "接格";
            case 16:
                return "特殊动词变位";
            case 17:
                return "同源词";
            case 18:
                return "词源";
            case 19:
                return "地区词汇差异";
            default:
                return "助记";
        }
    }

    public final void g(List<i0.z> list) {
        this.f25828b.removeAllViews();
        for (i0.z zVar : list) {
            if (zVar.g() == 5) {
                ImageView imageView = new ImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e(R.styleable.Theme_drawable_right_arrow), e(128));
                layoutParams.setMargins(0, 0, 0, e(66));
                imageView.setLayoutParams(layoutParams);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setTag(Boolean.FALSE);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: vi.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TipView.h(TipView.this, view);
                    }
                });
                c.F(getContext()).load(zVar.e()).into(imageView);
                this.f25828b.addView(imageView);
            } else {
                TextView textView = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 0, 0, e(16));
                textView.setLayoutParams(layoutParams2);
                if (Build.VERSION.SDK_INT >= 28) {
                    textView.setLineHeight(KotlinExtKt.getDpValue(24));
                }
                textView.setText(zVar.e());
                textView.setTextSize(15.0f);
                textView.setTextColor(Color.parseColor("#333333"));
                textView.setLineSpacing(e(4), 1.0f);
                this.f25828b.addView(textView);
            }
        }
    }

    public final void i(int i11) {
        List<i0.z> list = this.f25833g.get(Integer.valueOf(i11));
        if (list == null) {
            list = h0.J();
        }
        g(list);
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public final void j(final ImageView imageView, boolean z11) {
        int width = this.f25828b.getWidth();
        int e11 = e(R.styleable.Theme_drawable_right_arrow);
        int e12 = e(128);
        final int e13 = e(66);
        int i11 = (width * 128) / R.styleable.Theme_drawable_right_arrow;
        final int i12 = z11 ? e11 : width;
        final int i13 = z11 ? width : e11;
        final int i14 = z11 ? e12 : i11;
        final int i15 = z11 ? i11 : e12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vi.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TipView.k(i12, i13, i14, i15, e13, e13, imageView, valueAnimator);
            }
        });
        ofFloat.addListener(new b());
        ofFloat.start();
    }

    public final void setLifecycleOwner(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
        this.f25830d = owner;
    }

    public final void setOnContentChangedListener(@k x00.a<g2> listener) {
        g0.p(listener, "listener");
        this.f25832f = listener;
    }

    public final void setTipsByType(@k Map<Integer, ? extends List<i0.z>> data) {
        g0.p(data, "data");
        this.f25833g = data;
        ArrayList arrayList = new ArrayList();
        this.f25835i.clear();
        Iterator<T> it = this.f25834h.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (data.containsKey(Integer.valueOf(intValue))) {
                String f11 = f(intValue);
                arrayList.add(f11);
                this.f25835i.put(f11, Integer.valueOf(intValue));
            }
        }
        Iterator<T> it2 = data.keySet().iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Number) it2.next()).intValue();
            if (!this.f25834h.contains(Integer.valueOf(intValue2))) {
                String f12 = f(intValue2);
                arrayList.add(f12);
                this.f25835i.put(f12, Integer.valueOf(intValue2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f25827a.j(arrayList, 0);
        Integer num = this.f25835i.get(arrayList.get(0));
        if (num != null) {
            i(num.intValue());
        }
    }

    public final void setViewModel(@k o0 vm2) {
        g0.p(vm2, "vm");
        this.f25831e = vm2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public TipView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public TipView(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f25833g = l1.z();
        this.f25834h = h0.Q(6, 1, 3, 5, 2, 4);
        this.f25835i = new LinkedHashMap();
        setOrientation(1);
        setPadding(e(20), e(20), e(20), e(20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(e(4));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(e(20), e(16), e(20), e(16));
        this.f25829c = linearLayout;
        SimpleTabLayout simpleTabLayout = new SimpleTabLayout(context, null, 0, 6, null);
        simpleTabLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        simpleTabLayout.setOnTabSelectedListener(new p() { // from class: vi.f
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                return TipView.b(TipView.this, ((Integer) obj).intValue(), (String) obj2);
            }
        });
        this.f25827a = simpleTabLayout;
        linearLayout.addView(simpleTabLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(0, KotlinExtKt.getDpValue(16), 0, 0);
        this.f25828b = linearLayout2;
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
    }

    public /* synthetic */ TipView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
