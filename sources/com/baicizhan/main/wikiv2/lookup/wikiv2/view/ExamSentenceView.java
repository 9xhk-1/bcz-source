package com.baicizhan.main.wikiv2.lookup.wikiv2.view;

import a00.h0;
import a00.l1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.baicizhan.main.wikiv2.lookup.wikiv2.view.ExamSentenceView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import m80.k;
import m80.l;
import ri.b;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nExamSentenceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamSentenceView.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/ExamSentenceView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,162:1\n1869#2,2:163\n1869#2,2:165\n*S KotlinDebug\n*F\n+ 1 ExamSentenceView.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/view/ExamSentenceView\n*L\n110#1:163,2\n117#1:165,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ExamSentenceView extends LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int f25784i = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleTabLayout f25785a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f25786b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public b f25787c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public LifecycleOwner f25788d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public o0 f25789e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public Map<String, ? extends List<i0.w>> f25790f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<String> f25791g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public List<String> f25792h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ExamSentenceView(@k Context context) {
        this(context, null, 0, 6, null);
        g0.p(context, "context");
    }

    public static g2 a(ExamSentenceView examSentenceView, int i11, String tab) {
        g0.p(tab, "tab");
        examSentenceView.d(tab);
        return g2.f100423a;
    }

    public final int b(int i11) {
        return (int) (i11 * getContext().getResources().getDisplayMetrics().density);
    }

    public final void c(List<i0.w> list) {
        o0 o0Var;
        LifecycleOwner lifecycleOwner = this.f25788d;
        if (lifecycleOwner == null || (o0Var = this.f25789e) == null) {
            return;
        }
        if (this.f25787c == null) {
            b bVar = new b(lifecycleOwner, o0Var);
            this.f25787c = bVar;
            this.f25786b.setAdapter(bVar);
        }
        b bVar2 = this.f25787c;
        if (bVar2 != null) {
            bVar2.h(list);
        }
    }

    public final void d(String str) {
        List<i0.w> list = this.f25790f.get(str);
        if (list == null) {
            list = h0.J();
        }
        c(list);
    }

    public final void setLifecycleOwner(@k LifecycleOwner owner) {
        g0.p(owner, "owner");
        this.f25788d = owner;
    }

    public final void setSentencesByExamType(@k Map<String, ? extends List<i0.w>> data) {
        g0.p(data, "data");
        this.f25790f = data;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f25791g) {
            if (data.containsKey(str)) {
                arrayList.add(str);
            }
        }
        for (String str2 : data.keySet()) {
            if (!this.f25791g.contains(str2)) {
                arrayList.add(str2);
            }
        }
        this.f25792h = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f25785a.j(arrayList, 0);
        d((String) arrayList.get(0));
    }

    public final void setViewModel(@k o0 vm2) {
        g0.p(vm2, "vm");
        this.f25789e = vm2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ExamSentenceView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ExamSentenceView(@k Context context, @l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        g0.p(context, "context");
        this.f25790f = l1.z();
        this.f25791g = h0.Q("中考", "高考", "四级", "六级", "考研", "托福", "雅思");
        this.f25792h = h0.J();
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
        simpleTabLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        simpleTabLayout.setOnTabSelectedListener(new p() { // from class: vi.a
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                return ExamSentenceView.a(ExamSentenceView.this, ((Integer) obj).intValue(), (String) obj2);
            }
        });
        this.f25785a = simpleTabLayout;
        linearLayout.addView(simpleTabLayout);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        this.f25786b = recyclerView;
        linearLayout.addView(recyclerView);
        addView(linearLayout);
    }

    public /* synthetic */ ExamSentenceView(Context context, AttributeSet attributeSet, int i11, int i12, v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
