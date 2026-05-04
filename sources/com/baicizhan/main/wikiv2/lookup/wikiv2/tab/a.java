package com.baicizhan.main.wikiv2.lookup.wikiv2.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.baicizhan.main.wikiv2.lookup.wikiv2.o0;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class a extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0327a f25746c = new C0327a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f25747d = 8;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f25748e = "BaseWikiTabFragment";

    /* renamed from: a, reason: collision with root package name */
    public o0 f25749a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public View f25750b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a$a, reason: collision with other inner class name */
    public static final class C0327a {
        public /* synthetic */ C0327a(v vVar) {
            this();
        }

        public C0327a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f25751a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f25751a = function;
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
            return this.f25751a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25751a.invoke(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f25752a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f25753b;

        public c(View view, a aVar) {
            this.f25752a = view;
            this.f25753b = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ((ViewGroup) this.f25752a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f25753b.w(this.f25752a);
        }
    }

    public static final g2 z(a aVar, String str) {
        aVar.E(str);
        return g2.f100423a;
    }

    public final void A(@k o0 o0Var) {
        g0.p(o0Var, "<set-?>");
        this.f25749a = o0Var;
    }

    public final void B(@k String tabName) {
        g0.p(tabName, "tabName");
        if (this.f25750b == null) {
            this.f25750b = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_wiki_tab_empty, (ViewGroup) null);
        }
        View view = this.f25750b;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.empty_state_text) : null;
        if (textView != null) {
            textView.setText("没有相关" + tabName + "信息💨");
        }
        View view2 = getView();
        if (view2 == null || !(view2 instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        viewGroup.removeAllViews();
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new c(view2, this));
        viewGroup.addView(this.f25750b, new FrameLayout.LayoutParams(-1, -2));
    }

    public final void C(View view, String str) {
        if (view instanceof LottieAnimationView) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
            Object tag = lottieAnimationView.getTag();
            String str2 = tag instanceof String ? (String) tag : null;
            if (str2 != null) {
                D(lottieAnimationView, g0.g(str, str2));
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                g0.o(childAt, "getChildAt(...)");
                C(childAt, str);
            }
        }
    }

    public final void D(LottieAnimationView lottieAnimationView, boolean z11) {
        if (z11) {
            lottieAnimationView.A();
        } else {
            lottieAnimationView.m();
            lottieAnimationView.setProgress(0.0f);
        }
    }

    public void E(@l String str) {
        View view = getView();
        if (view != null) {
            C(view, str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            A((o0) new ViewModelProvider(parentFragment).get(o0.class));
            return;
        }
        FragmentActivity requireActivity = requireActivity();
        g0.o(requireActivity, "requireActivity(...)");
        A((o0) new ViewModelProvider(requireActivity).get(o0.class));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        x().D().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: ui.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 z11;
                z11 = com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a.z(com.baicizhan.main.wikiv2.lookup.wikiv2.tab.a.this, (String) obj);
                return z11;
            }
        }));
    }

    public final void w(View view) {
        View view2;
        View findViewById;
        try {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null && (view2 = parentFragment.getView()) != null && (findViewById = view2.findViewById(R.id.nested_scroll_view)) != null) {
                int height = findViewById.getHeight();
                View findViewById2 = view2.findViewById(R.id.word_info_container);
                int height2 = findViewById2 != null ? findViewById2.getHeight() : 0;
                View findViewById3 = view2.findViewById(R.id.tab_container);
                int height3 = findViewById3 != null ? findViewById3.getHeight() : 0;
                int i11 = (height - height2) - height3;
                qb.c.b(f25748e, "空状态高度计算: scrollViewHeight=" + height + ", wordInfoHeight=" + height2 + ", tabContainerHeight=" + height3 + ", emptyStateHeight=" + i11, new Object[0]);
                if (i11 > 0) {
                    View view3 = this.f25750b;
                    if (view3 != null) {
                        view3.setLayoutParams(new FrameLayout.LayoutParams(-1, i11));
                    }
                    View view4 = this.f25750b;
                    if (view4 != null) {
                        view4.requestLayout();
                    }
                }
            }
        } catch (Exception e11) {
            qb.c.c(f25748e, "计算空状态高度失败", e11);
        }
    }

    @k
    public final o0 x() {
        o0 o0Var = this.f25749a;
        if (o0Var != null) {
            return o0Var;
        }
        g0.S("viewModel");
        return null;
    }

    public final void y() {
        View view = this.f25750b;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
