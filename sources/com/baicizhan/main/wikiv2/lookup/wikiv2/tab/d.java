package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.baicizhan.main.wikiv2.lookup.wikiv2.view.TipView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l3.i0;
import l3.y2;
import m80.k;
import m80.l;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMnemonicsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MnemonicsFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/MnemonicsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,76:1\n1491#2:77\n1516#2,3:78\n1519#2,3:88\n382#3,7:81\n*S KotlinDebug\n*F\n+ 1 MnemonicsFragment.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/tab/MnemonicsFragment\n*L\n48#1:77\n48#1:78,3\n48#1:88,3\n48#1:81,7\n*E\n"})
/* loaded from: classes3.dex */
public final class d extends com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f25763g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25764h = 8;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TipView f25765f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final d a() {
            return new d();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25766a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f25766a = function;
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
            return this.f25766a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25766a.invoke(obj);
        }
    }

    private final void H() {
        x().J().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: ui.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 I;
                I = com.baicizhan.main.wikiv2.lookup.wikiv2.tab.d.I(com.baicizhan.main.wikiv2.lookup.wikiv2.tab.d.this, (y2) obj);
                return I;
            }
        }));
    }

    public static final g2 I(d dVar, y2 y2Var) {
        if (y2Var == null) {
            dVar.B("助记");
            return g2.f100423a;
        }
        List<i0.z> k02 = y2Var.k0();
        if (k02.isEmpty()) {
            dVar.B("助记");
            return g2.f100423a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : k02) {
            Integer valueOf = Integer.valueOf(((i0.z) obj).g());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        if (linkedHashMap.isEmpty()) {
            dVar.B("助记");
        } else {
            dVar.y();
            View view = dVar.getView();
            final FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
            Context requireContext = dVar.requireContext();
            g0.o(requireContext, "requireContext(...)");
            TipView tipView = new TipView(requireContext, null, 0, 6, null);
            LifecycleOwner viewLifecycleOwner = dVar.getViewLifecycleOwner();
            g0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            tipView.setLifecycleOwner(viewLifecycleOwner);
            tipView.setViewModel(dVar.x());
            tipView.setOnContentChangedListener(new x00.a() { // from class: ui.d
                @Override // x00.a
                public final Object invoke() {
                    g2 J;
                    J = com.baicizhan.main.wikiv2.lookup.wikiv2.tab.d.J(frameLayout);
                    return J;
                }
            });
            tipView.setTipsByType(linkedHashMap);
            dVar.f25765f = tipView;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (frameLayout != null) {
                frameLayout.addView(dVar.f25765f);
            }
        }
        return g2.f100423a;
    }

    public static final g2 J(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.requestLayout();
        }
        return g2.f100423a;
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
        H();
    }
}
