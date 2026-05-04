package com.baicizhan.main.home.plan.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.jiongji.andriod.card.R;
import gs.m6;
import hj.p;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pg.l0;
import rg.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a extends DialogFragment {

    /* renamed from: g, reason: collision with root package name */
    public static final int f22972g = 8;

    /* renamed from: a, reason: collision with root package name */
    public int f22973a;

    /* renamed from: b, reason: collision with root package name */
    public int f22974b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public InterfaceC0315a f22975c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22976d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22977e;

    /* renamed from: f, reason: collision with root package name */
    public m6 f22978f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.home.plan.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC0315a {
        void a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements InterfaceC0315a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f22979a;

        public b(x00.a<g2> aVar) {
            this.f22979a = aVar;
        }

        @Override // com.baicizhan.main.home.plan.view.a.InterfaceC0315a
        public void a() {
            this.f22979a.invoke();
        }
    }

    public static final g2 v(a aVar, View it) {
        g0.p(it, "it");
        InterfaceC0315a interfaceC0315a = aVar.f22975c;
        if (interfaceC0315a != null) {
            interfaceC0315a.a();
        }
        aVar.f22976d = true;
        return g2.f100423a;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        setCancelable(false);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            this.f22973a = window.getStatusBarColor();
            this.f22974b = window.getDecorView().getSystemUiVisibility();
        }
        setStyle(0, R.style.FullScreenDialog_FreshmanGuide);
        x();
        Context requireContext = requireContext();
        g0.o(requireContext, "requireContext(...)");
        p.i(this, requireContext);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        m6 d11 = m6.d(inflater);
        g0.o(d11, "inflate(...)");
        this.f22978f = d11;
        if (d11 == null) {
            g0.S("binding");
            d11 = null;
        }
        return d11.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Window window;
        View decorView;
        Window window2;
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setStatusBarColor(this.f22973a);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(this.f22974b);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f22977e = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f22976d) {
            dismiss();
        } else if (this.f22977e) {
            this.f22977e = false;
            x();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        m6 m6Var = this.f22978f;
        if (m6Var == null) {
            g0.S("binding");
            m6Var = null;
        }
        TextView wordsCount = m6Var.f55856g;
        g0.o(wordsCount, "wordsCount");
        q.c(wordsCount, new l0().d().i());
        m6 m6Var2 = this.f22978f;
        if (m6Var2 == null) {
            g0.S("binding");
            m6Var2 = null;
        }
        TextView textView = m6Var2.f55854e;
        WordPlanInfoView.c cVar = WordPlanInfoView.f22923j;
        Context requireContext = requireContext();
        g0.o(requireContext, "requireContext(...)");
        textView.setText(cVar.a(requireContext, new l0().d().e()));
        m6 m6Var3 = this.f22978f;
        if (m6Var3 == null) {
            g0.S("binding");
            m6Var3 = null;
        }
        m6Var3.f55852c.setVisibility(8);
        m6 m6Var4 = this.f22978f;
        if (m6Var4 == null) {
            g0.S("binding");
            m6Var4 = null;
        }
        TextView btnStart = m6Var4.f55850a;
        g0.o(btnStart, "btnStart");
        sa.q.t(btnStart, 0, new x00.l() { // from class: rg.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v11;
                v11 = com.baicizhan.main.home.plan.view.a.v(com.baicizhan.main.home.plan.view.a.this, (View) obj);
                return v11;
            }
        }, 1, null);
    }

    @k
    public final a w(@k x00.a<g2> interaction) {
        g0.p(interaction, "interaction");
        this.f22975c = new b(interaction);
        return this;
    }

    public final void x() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(this.f22974b | 8192);
    }
}
