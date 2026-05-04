package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l3.i0;
import l3.y2;
import m80.k;
import m80.l;
import ri.h;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class b extends com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f25754g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25755h = 8;

    /* renamed from: f, reason: collision with root package name */
    @l
    public h f25756f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final b a() {
            return new b();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.wikiv2.lookup.wikiv2.tab.b$b, reason: collision with other inner class name */
    public static final class C0328b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25757a;

        public C0328b(x00.l function) {
            g0.p(function, "function");
            this.f25757a = function;
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
            return this.f25757a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25757a.invoke(obj);
        }
    }

    public static final g2 H(b bVar, y2 y2Var) {
        if (y2Var == null) {
            bVar.B("派生");
            return g2.f100423a;
        }
        List<i0.h> S = y2Var.S();
        if (S.isEmpty()) {
            bVar.B("派生");
        } else {
            bVar.y();
            LinearLayout linearLayout = new LinearLayout(bVar.requireContext());
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
            if (bVar.f25756f == null) {
                LifecycleOwner viewLifecycleOwner = bVar.getViewLifecycleOwner();
                g0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                bVar.f25756f = new h(viewLifecycleOwner, bVar.x());
            }
            h hVar = bVar.f25756f;
            if (hVar != null) {
                hVar.f(S);
            }
            RecyclerView recyclerView = new RecyclerView(bVar.requireContext());
            recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            recyclerView.setLayoutManager(new LinearLayoutManager(bVar.requireContext()));
            recyclerView.setAdapter(bVar.f25756f);
            linearLayout.addView(recyclerView);
            View view = bVar.getView();
            FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            View view2 = bVar.getView();
            FrameLayout frameLayout2 = view2 instanceof FrameLayout ? (FrameLayout) view2 : null;
            if (frameLayout2 != null) {
                frameLayout2.addView(linearLayout);
            }
        }
        return g2.f100423a;
    }

    public final void G() {
        x().J().observe(getViewLifecycleOwner(), new C0328b(new x00.l() { // from class: ui.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = com.baicizhan.main.wikiv2.lookup.wikiv2.tab.b.H(com.baicizhan.main.wikiv2.lookup.wikiv2.tab.b.this, (y2) obj);
                return H;
            }
        }));
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
        G();
    }
}
