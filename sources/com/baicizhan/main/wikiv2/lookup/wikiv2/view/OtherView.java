package com.baicizhan.main.wikiv2.lookup.wikiv2.view;

import a00.h0;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.baicizhan.main.wikiv2.lookup.wikiv2.tab.OtherFragment;
import com.baicizhan.main.wikiv2.lookup.wikiv2.view.OtherView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import m80.k;
import m80.l;
import ri.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOtherView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherView.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/OtherView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n13805#2,2:172\n1#3:174\n*S KotlinDebug\n*F\n+ 1 OtherView.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/OtherView\n*L\n118#1:172,2\n*E\n"})
/* loaded from: classes3.dex */
public final class OtherView extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final int f25796m = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleTabLayout f25797a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f25798b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public LifecycleOwner f25799c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public o0 f25800d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public d f25801e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Map<String, OtherFragment.OtherType> f25802f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public List<i0.y> f25803g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public List<String> f25804h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public List<String> f25805i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public List<i0.b0> f25806j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public List<String> f25807k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public i0.a0 f25808l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25809a;

        static {
            int[] iArr = new int[OtherFragment.OtherType.values().length];
            try {
                iArr[OtherFragment.OtherType.SIMILAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtherFragment.OtherType.SYNONYM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtherFragment.OtherType.ANTONYM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtherFragment.OtherType.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OtherFragment.OtherType.EN_MEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OtherFragment.OtherType.TV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f25809a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public OtherView(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public static g2 a(OtherView otherView, int i11, String tab) {
        g0.p(tab, "tab");
        OtherFragment.OtherType otherType = otherView.f25802f.get(tab);
        if (otherType != null) {
            otherView.f(otherType);
        }
        return g2.f100423a;
    }

    public final int b(int i11) {
        return (int) (i11 * getContext().getResources().getDisplayMetrics().density);
    }

    public final boolean c(OtherFragment.OtherType otherType) {
        switch (a.f25809a[otherType.ordinal()]) {
            case 1:
                return !this.f25803g.isEmpty();
            case 2:
                return !this.f25804h.isEmpty();
            case 3:
                return !this.f25805i.isEmpty();
            case 4:
                return !this.f25806j.isEmpty();
            case 5:
                return !this.f25807k.isEmpty();
            case 6:
                return this.f25808l != null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void d(@k List<i0.y> similars, @k List<String> synonyms, @k List<String> antonyms, @k List<i0.b0> variants, @k List<String> enMeans, @l i0.a0 a0Var) {
        g0.p(similars, "similars");
        g0.p(synonyms, "synonyms");
        g0.p(antonyms, "antonyms");
        g0.p(variants, "variants");
        g0.p(enMeans, "enMeans");
        this.f25803g = similars;
        this.f25804h = synonyms;
        this.f25805i = antonyms;
        this.f25806j = variants;
        this.f25807k = enMeans;
        this.f25808l = a0Var;
        ArrayList arrayList = new ArrayList();
        this.f25802f.clear();
        for (OtherFragment.OtherType otherType : OtherFragment.OtherType.values()) {
            if (c(otherType)) {
                arrayList.add(otherType.getDisplayName());
                this.f25802f.put(otherType.getDisplayName(), otherType);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f25797a.j(arrayList, 0);
        OtherFragment.OtherType otherType2 = this.f25802f.get(arrayList.get(0));
        if (otherType2 != null) {
            f(otherType2);
        }
    }

    public final void e(OtherFragment.OtherType otherType) {
        List<? extends Object> list;
        if (this.f25801e == null) {
            d dVar = new d(this.f25799c, this.f25800d);
            this.f25801e = dVar;
            this.f25798b.setAdapter(dVar);
        }
        switch (a.f25809a[otherType.ordinal()]) {
            case 1:
                list = this.f25803g;
                break;
            case 2:
                list = this.f25804h;
                break;
            case 3:
                list = this.f25805i;
                break;
            case 4:
                list = this.f25806j;
                break;
            case 5:
                list = this.f25807k;
                break;
            case 6:
                i0.a0 a0Var = this.f25808l;
                if (a0Var == null || (list = a00.g0.l(a0Var)) == null) {
                    list = h0.J();
                    break;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        d dVar2 = this.f25801e;
        if (dVar2 != null) {
            dVar2.b(otherType, list);
        }
    }

    public final void f(OtherFragment.OtherType otherType) {
        e(otherType);
    }

    public final void setLifecycleOwner(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
        this.f25799c = owner;
    }

    public final void setViewModel(@k o0 vm2) {
        g0.p(vm2, "vm");
        this.f25800d = vm2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public OtherView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public OtherView(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f25802f = new LinkedHashMap();
        this.f25803g = h0.J();
        this.f25804h = h0.J();
        this.f25805i = h0.J();
        this.f25806j = h0.J();
        this.f25807k = h0.J();
        setOrientation(1);
        setPadding(b(20), b(20), b(20), b(20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(b(4));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(b(20), b(16), b(20), b(16));
        SimpleTabLayout simpleTabLayout = new SimpleTabLayout(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, b(16));
        simpleTabLayout.setLayoutParams(layoutParams);
        simpleTabLayout.setOnTabSelectedListener(new p() { // from class: vi.b
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                return OtherView.a(OtherView.this, ((Integer) obj).intValue(), (String) obj2);
            }
        });
        this.f25797a = simpleTabLayout;
        linearLayout.addView(simpleTabLayout);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.f25798b = recyclerView;
        linearLayout.addView(recyclerView);
        addView(linearLayout);
    }

    public /* synthetic */ OtherView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
