package ue;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.client.business.util.BottomSheetUtils;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import gs.n7;
import kc.o;
import ue.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l extends Fragment {

    /* renamed from: g, reason: collision with root package name */
    public static final String f92140g = "AboutUsFragment";

    /* renamed from: h, reason: collision with root package name */
    public static final long f92141h = 2000;

    /* renamed from: i, reason: collision with root package name */
    public static final long f92142i = 6000;

    /* renamed from: a, reason: collision with root package name */
    public v f92143a;

    /* renamed from: b, reason: collision with root package name */
    public n7 f92144b;

    /* renamed from: c, reason: collision with root package name */
    public int f92145c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f92146d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f92147e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f92148f = new Runnable() { // from class: ue.j
        @Override // java.lang.Runnable
        public final void run() {
            l.this.U();
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Void> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            FragmentActivity activity = l.this.getActivity();
            if (activity != null) {
                BczWebExecutorKt.startNormalWeb(activity, BczWebExecutorKt.URL_JOIN_US, activity.getString(R.string.about_us_join_us));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            BottomSheetLayout bottomSheetLayout;
            KeyEventDispatcher.Component activity = l.this.getActivity();
            if (!(activity instanceof zf.a) || (bottomSheetLayout = ((zf.a) activity).getBottomSheetLayout()) == null) {
                return;
            }
            BottomSheetUtils.showBaicizhanAppStoreBottomSheet(l.this.getActivity(), bottomSheetLayout, l.this.getString(R.string.about_us_upgrade_choose), null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        public final /* synthetic */ g2 b(Boolean bool) {
            if (bool.booleanValue()) {
                return null;
            }
            l.this.f92143a.f();
            return null;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onChanged(Void unused) {
            fi.e.f51879a.a(l.this.requireContext(), new x00.l() { // from class: ue.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 b11;
                    b11 = l.c.this.b((Boolean) obj);
                    return b11;
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends g {
        public d() {
            super();
        }

        public final /* synthetic */ void b(View view) {
            if (l.this.getActivity() == null || l.this.getActivity().isFinishing()) {
                return;
            }
            view.setEnabled(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull final View widget) {
            widget.setEnabled(false);
            widget.postDelayed(new Runnable() { // from class: ue.n
                @Override // java.lang.Runnable
                public final void run() {
                    l.d.this.b(widget);
                }
            }, 1000L);
            BczWebHelperKt.startBczProtocolWeb(l.this.getActivity());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends g {
        public e() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(View view) {
            if (l.this.getActivity() == null || l.this.getActivity().isFinishing()) {
                return;
            }
            view.setEnabled(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull final View widget) {
            widget.setEnabled(false);
            widget.postDelayed(new Runnable() { // from class: ue.o
                @Override // java.lang.Runnable
                public final void run() {
                    l.e.this.b(widget);
                }
            }, 1000L);
            BczWebHelperKt.startPrivacyProtocolWeb(l.this.getActivity());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends ClickableSpan {
        public f() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull final View widget) {
            widget.setEnabled(false);
            widget.postDelayed(new Runnable() { // from class: ue.p
                @Override // java.lang.Runnable
                public final void run() {
                    widget.setEnabled(true);
                }
            }, 1000L);
            BczWebHelperKt.startChildProtocolWeb(l.this.getActivity());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint ds2) {
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g extends ClickableSpan {
        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            ds2.setColor(ds2.linkColor);
            ds2.setUnderlineText(false);
        }

        public g() {
        }
    }

    public static /* synthetic */ g2 C(String str) {
        if (!"Baicizhan99".equals(str.trim())) {
            return null;
        }
        va.g.i("开发者模式开启", 0);
        DebugConfig.getsIntance().enable = true;
        return null;
    }

    private void J() {
        this.f92143a.f92168c.observe(this, new a());
        this.f92143a.f92169d.observe(this, new b());
        this.f92143a.f92170e.observe(this, new c());
        this.f92143a.f92174i.observe(this, new Observer() { // from class: ue.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
        this.f92143a.f92171f.observe(this, new Observer() { // from class: ue.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                l.this.O((Void) obj);
            }
        });
    }

    private void L(LayoutInflater inflater) {
        n7 e11 = n7.e(inflater);
        this.f92144b = e11;
        e11.setLifecycleOwner(this);
        this.f92144b.j(this.f92143a);
        K(this.f92144b.f56006j);
        I();
        V();
    }

    private void M() {
        this.f92143a = (v) new ViewModelProvider(this).get(v.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Void r22) {
        BczWebExecutorKt.startNormalWeb(getContext(), BczWebExecutorKt.URL_WEB_JS_TEST_LAB);
    }

    public final void G(int nextStage) {
        this.f92145c = nextStage;
        this.f92146d = 0;
        this.f92147e = 0L;
        this.f92144b.getRoot().removeCallbacks(this.f92148f);
        this.f92144b.getRoot().postDelayed(this.f92148f, 6000L);
    }

    public final void H(int requiredStage, int requiredClicks, Runnable onComplete) {
        if (this.f92145c != requiredStage) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = this.f92146d;
        if (i11 == 0 || currentTimeMillis - this.f92147e > 2000) {
            this.f92146d = 1;
            this.f92147e = currentTimeMillis;
        } else {
            this.f92146d = i11 + 1;
        }
        if (this.f92146d >= requiredClicks) {
            onComplete.run();
        }
    }

    public final void I() {
        this.f92144b.f56003g.setOnClickListener(new View.OnClickListener() { // from class: ue.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.this.N(view);
            }
        });
    }

    public final void K(TextView textView) {
        if (textView == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(getString(R.string.setting_aboutus_protocol));
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        spannableString.setSpan(dVar, 0, 4, 34);
        spannableString.setSpan(eVar, 6, 10, 34);
        spannableString.setSpan(fVar, 13, spannableString.length(), 34);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(getResources().getColor(R.color.main_color_word_822));
    }

    public final /* synthetic */ void N(View view) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            BczWebExecutorKt.startNormalWeb(activity, BczWebExecutorKt.URL_ICP, activity.getString(R.string.about_us_icp));
        }
    }

    public final /* synthetic */ void P() {
        G(1);
    }

    public final /* synthetic */ void Q(View view) {
        H(0, 3, new Runnable() { // from class: ue.k
            @Override // java.lang.Runnable
            public final void run() {
                l.this.P();
            }
        });
    }

    public final /* synthetic */ void R() {
        G(2);
    }

    public final /* synthetic */ void S(View view) {
        H(1, 3, new Runnable() { // from class: ue.b
            @Override // java.lang.Runnable
            public final void run() {
                l.this.R();
            }
        });
    }

    public final /* synthetic */ void T(View view) {
        H(2, 2, new Runnable() { // from class: ue.i
            @Override // java.lang.Runnable
            public final void run() {
                l.this.W();
            }
        });
    }

    public final void U() {
        this.f92145c = 0;
        this.f92146d = 0;
        this.f92147e = 0L;
    }

    public final void V() {
        this.f92144b.f55998b.setOnClickListener(new View.OnClickListener() { // from class: ue.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.this.Q(view);
            }
        });
        this.f92144b.f55999c.setOnClickListener(new View.OnClickListener() { // from class: ue.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.this.S(view);
            }
        });
        this.f92144b.f56004h.setOnClickListener(new View.OnClickListener() { // from class: ue.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.this.T(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W() {
        this.f92144b.getRoot().removeCallbacks(this.f92148f);
        U();
        Context context = getContext();
        if (context == null) {
            return;
        }
        ((kc.o) ((o.a) new o.a(context).M("被你发现了🤣").S("输入通关密语").f(false)).Q(new x00.l() { // from class: ue.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                return l.C((String) obj);
            }
        }).d()).show(getChildFragmentManager(), "debug_passphrase");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        M();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        L(inflater);
        J();
        return this.f92144b.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f92143a.start();
    }
}
