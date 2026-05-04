package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import a00.h0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wikiv2.lookup.wikiv2.tab.OtherFragment;
import com.baicizhan.main.wikiv2.lookup.wikiv2.view.SimpleTabLayout;
import com.baicizhan.main.wikiv2.studyv2.data.m0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import l3.y2;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOtherFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/OtherFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n13805#2,2:245\n1#3:247\n*S KotlinDebug\n*F\n+ 1 OtherFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/OtherFragment\n*L\n144#1:245,2\n*E\n"})
/* loaded from: classes3.dex */
public final class OtherFragment extends com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a {

    /* renamed from: q, reason: collision with root package name */
    @k
    public static final a f25728q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f25729r = 8;

    /* renamed from: f, reason: collision with root package name */
    @l
    public SimpleTabLayout f25730f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public RecyclerView f25731g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public ri.d f25732h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public b f25733i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Map<String, OtherType> f25734j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    @k
    public List<i0.y> f25735k = h0.J();

    /* renamed from: l, reason: collision with root package name */
    @k
    public List<String> f25736l = h0.J();

    /* renamed from: m, reason: collision with root package name */
    @k
    public List<String> f25737m = h0.J();

    /* renamed from: n, reason: collision with root package name */
    @k
    public List<i0.b0> f25738n = h0.J();

    /* renamed from: o, reason: collision with root package name */
    @k
    public List<String> f25739o = h0.J();

    /* renamed from: p, reason: collision with root package name */
    @l
    public i0.a0 f25740p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OtherType {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ OtherType[] $VALUES;

        @k
        private final String displayName;
        public static final OtherType SIMILAR = new OtherType("SIMILAR", 0, m0.f26074h);
        public static final OtherType SYNONYM = new OtherType("SYNONYM", 1, m0.f26072f);
        public static final OtherType ANTONYM = new OtherType("ANTONYM", 2, m0.f26073g);
        public static final OtherType VARIANT = new OtherType("VARIANT", 3, m0.f26068b);
        public static final OtherType EN_MEAN = new OtherType("EN_MEAN", 4, "释义");
        public static final OtherType TV = new OtherType("TV", 5, m0.f26071e);

        private static final /* synthetic */ OtherType[] $values() {
            return new OtherType[]{SIMILAR, SYNONYM, ANTONYM, VARIANT, EN_MEAN, TV};
        }

        static {
            OtherType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private OtherType(String str, int i11, String str2) {
            this.displayName = str2;
        }

        @k
        public static m00.a<OtherType> getEntries() {
            return $ENTRIES;
        }

        public static OtherType valueOf(String str) {
            return (OtherType) Enum.valueOf(OtherType.class, str);
        }

        public static OtherType[] values() {
            return (OtherType[]) $VALUES.clone();
        }

        @k
        public final String getDisplayName() {
            return this.displayName;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final OtherFragment a() {
            return new OtherFragment();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ItemDecoration {

        /* renamed from: c, reason: collision with root package name */
        public static final int f25741c = 8;

        /* renamed from: a, reason: collision with root package name */
        public final int f25742a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25743b;

        public b(int i11, int i12) {
            this.f25742a = i11;
            this.f25743b = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@k Rect outRect, @k View view, @k RecyclerView parent, @k RecyclerView.State state) {
            g0.p(outRect, "outRect");
            g0.p(view, "view");
            g0.p(parent, "parent");
            g0.p(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i11 = this.f25743b;
            int i12 = childAdapterPosition % i11;
            outRect.left = i12 == 0 ? 0 : this.f25742a / 2;
            outRect.right = i12 != i11 + (-1) ? this.f25742a / 2 : 0;
            outRect.bottom = this.f25742a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25744a;

        static {
            int[] iArr = new int[OtherType.values().length];
            try {
                iArr[OtherType.SIMILAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OtherType.SYNONYM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OtherType.ANTONYM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OtherType.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OtherType.EN_MEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OtherType.TV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f25744a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25745a;

        public d(x00.l function) {
            g0.p(function, "function");
            this.f25745a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f25745a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25745a.invoke(obj);
        }
    }

    private final void J() {
        x().J().observe(getViewLifecycleOwner(), new d(new x00.l() { // from class: ui.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 K;
                K = OtherFragment.K(OtherFragment.this, (y2) obj);
                return K;
            }
        }));
    }

    public static final g2 K(OtherFragment otherFragment, y2 y2Var) {
        if (y2Var == null) {
            otherFragment.B("其他");
            return g2.f100423a;
        }
        otherFragment.f25735k = y2Var.e0();
        otherFragment.f25736l = y2Var.i0();
        otherFragment.f25737m = y2Var.Q();
        otherFragment.f25738n = y2Var.o0();
        otherFragment.f25739o = y2Var.U();
        otherFragment.f25740p = y2Var.m0();
        boolean isEmpty = otherFragment.f25735k.isEmpty();
        boolean isEmpty2 = otherFragment.f25736l.isEmpty();
        boolean isEmpty3 = otherFragment.f25737m.isEmpty();
        boolean isEmpty4 = otherFragment.f25738n.isEmpty();
        boolean isEmpty5 = otherFragment.f25739o.isEmpty();
        boolean z11 = otherFragment.f25740p != null;
        if (isEmpty && isEmpty2 && isEmpty3 && isEmpty4 && isEmpty5 && !z11) {
            otherFragment.B("其他");
        } else {
            otherFragment.y();
            View view = otherFragment.getView();
            g0.n(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            otherFragment.L((FrameLayout) view);
        }
        return g2.f100423a;
    }

    public static final g2 M(OtherFragment otherFragment, int i11, String tab) {
        g0.p(tab, "tab");
        OtherType otherType = otherFragment.f25734j.get(tab);
        if (otherType != null) {
            otherFragment.O(otherType);
        }
        return g2.f100423a;
    }

    public final List<Object> H(OtherType otherType) {
        List<Object> l11;
        switch (c.f25744a[otherType.ordinal()]) {
            case 1:
                return this.f25735k;
            case 2:
                return this.f25736l;
            case 3:
                return this.f25737m;
            case 4:
                return this.f25738n;
            case 5:
                return this.f25739o;
            case 6:
                i0.a0 a0Var = this.f25740p;
                return (a0Var == null || (l11 = a00.g0.l(a0Var)) == null) ? h0.J() : l11;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean I(OtherType otherType) {
        switch (c.f25744a[otherType.ordinal()]) {
            case 1:
                return !this.f25735k.isEmpty();
            case 2:
                return !this.f25736l.isEmpty();
            case 3:
                return !this.f25737m.isEmpty();
            case 4:
                return !this.f25738n.isEmpty();
            case 5:
                return !this.f25739o.isEmpty();
            case 6:
                return this.f25740p != null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void L(FrameLayout frameLayout) {
        frameLayout.removeAllViews();
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(KotlinExtKt.getDpPixels(20), KotlinExtKt.getDpPixels(16), KotlinExtKt.getDpPixels(20), KotlinExtKt.getDpPixels(16));
        linearLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(KotlinExtKt.getDpPixels(4));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(KotlinExtKt.getDpPixels(20), KotlinExtKt.getDpPixels(16), KotlinExtKt.getDpPixels(20), KotlinExtKt.getDpPixels(16));
        Context requireContext = requireContext();
        g0.o(requireContext, "requireContext(...)");
        SimpleTabLayout simpleTabLayout = new SimpleTabLayout(requireContext, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, KotlinExtKt.getDpPixels(16));
        simpleTabLayout.setLayoutParams(layoutParams2);
        simpleTabLayout.setOnTabSelectedListener(new p() { // from class: ui.g
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 M;
                M = OtherFragment.M(OtherFragment.this, ((Integer) obj).intValue(), (String) obj2);
                return M;
            }
        });
        this.f25730f = simpleTabLayout;
        linearLayout.addView(simpleTabLayout);
        RecyclerView recyclerView = new RecyclerView(requireContext());
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setNestedScrollingEnabled(false);
        this.f25731g = recyclerView;
        linearLayout.addView(recyclerView);
        frameLayout.addView(linearLayout);
        N();
    }

    public final void N() {
        ArrayList arrayList = new ArrayList();
        this.f25734j.clear();
        for (OtherType otherType : OtherType.values()) {
            if (I(otherType)) {
                arrayList.add(otherType.getDisplayName());
                this.f25734j.put(otherType.getDisplayName(), otherType);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SimpleTabLayout simpleTabLayout = this.f25730f;
        if (simpleTabLayout != null) {
            simpleTabLayout.j(arrayList, 0);
        }
        OtherType otherType2 = this.f25734j.get(arrayList.get(0));
        if (otherType2 != null) {
            O(otherType2);
        }
    }

    public final void O(OtherType otherType) {
        RecyclerView recyclerView = this.f25731g;
        if (recyclerView != null) {
            b bVar = this.f25733i;
            if (bVar != null) {
                g0.m(bVar);
                recyclerView.removeItemDecoration(bVar);
                this.f25733i = null;
            }
            int i11 = c.f25744a[otherType.ordinal()];
            if (i11 == 2 || i11 == 3) {
                recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
                b bVar2 = new b(KotlinExtKt.getDpPixels(16), 2);
                this.f25733i = bVar2;
                g0.m(bVar2);
                recyclerView.addItemDecoration(bVar2);
            } else {
                recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            }
        }
        if (this.f25732h == null) {
            ri.d dVar = new ri.d(getViewLifecycleOwner(), x());
            this.f25732h = dVar;
            RecyclerView recyclerView2 = this.f25731g;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(dVar);
            }
        }
        List<? extends Object> H = H(otherType);
        ri.d dVar2 = this.f25732h;
        if (dVar2 != null) {
            dVar2.b(otherType, H);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }

    @Override // com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        J();
    }
}
