package eg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.main.customview.OfflineDownloadView;
import com.baicizhan.main.rx.BookAdObservables;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;
import gs.j6;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import sa.q;
import sh.d;
import tj.i;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBookDetailDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookDetailDialog.kt\ncom/baicizhan/main/dialog/BookDetailDialog\n+ 2 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,101:1\n18#2,3:102\n*S KotlinDebug\n*F\n+ 1 BookDetailDialog.kt\ncom/baicizhan/main/dialog/BookDetailDialog\n*L\n57#1:102,3\n*E\n"})
/* loaded from: classes4.dex */
public final class h extends DialogFragment {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f49801d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f49802e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0 f49803a = e0.c(new x00.a() { // from class: eg.g
        @Override // x00.a
        public final Object invoke() {
            tj.i D;
            D = h.D(h.this);
            return D;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public BookAdObservables.BookAdInfo f49804b;

    /* renamed from: c, reason: collision with root package name */
    public j6 f49805c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        @m80.k
        public final h a() {
            return new h();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f49806a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f49806a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final w<?> getFunctionDelegate() {
            return this.f49806a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49806a.invoke(obj);
        }
    }

    @o
    @m80.k
    public static final h B() {
        return f49801d.a();
    }

    public static final tj.i D(h hVar) {
        FragmentActivity requireActivity = hVar.requireActivity();
        g0.o(requireActivity, "requireActivity(...)");
        return (tj.i) new ViewModelProvider(requireActivity).get(tj.i.class);
    }

    public static final g2 E(h hVar, tj.a aVar) {
        if (aVar != null) {
            String g11 = aVar.g();
            j6 j6Var = null;
            if (g11 != null && g11.length() != 0) {
                ic.c f11 = hc.c.l(g11).f(R.drawable.ic_book_cover_default);
                j6 j6Var2 = hVar.f49805c;
                if (j6Var2 == null) {
                    g0.S("binding");
                    j6Var2 = null;
                }
                AspectRoundImageView bookCover = j6Var2.f55431b;
                g0.o(bookCover, "bookCover");
                f11.o(bookCover);
            }
            j6 j6Var3 = hVar.f49805c;
            if (j6Var3 == null) {
                g0.S("binding");
                j6Var3 = null;
            }
            j6Var3.f55433d.setText(aVar.i());
            j6 j6Var4 = hVar.f49805c;
            if (j6Var4 == null) {
                g0.S("binding");
                j6Var4 = null;
            }
            j6Var4.f55440k.setText(hVar.getString(R.string.book_detail_words_summary, Integer.valueOf(aVar.j())));
            j6 j6Var5 = hVar.f49805c;
            if (j6Var5 == null) {
                g0.S("binding");
            } else {
                j6Var = j6Var5;
            }
            j6Var.f55432c.setText(aVar.h());
        }
        return g2.f100423a;
    }

    public static final g2 F(h hVar, d.g gVar) {
        if (gVar != null) {
            i.a aVar = tj.i.f90704f;
            j6 j6Var = hVar.f49805c;
            if (j6Var == null) {
                g0.S("binding");
                j6Var = null;
            }
            OfflineDownloadView noproguardBookDownload = j6Var.f55437h;
            g0.o(noproguardBookDownload, "noproguardBookDownload");
            aVar.g(gVar, 0.0f, noproguardBookDownload);
        }
        return g2.f100423a;
    }

    public static final g2 G(h hVar, BookAdObservables.BookAdInfo bookAdInfo) {
        j6 j6Var = hVar.f49805c;
        if (j6Var == null) {
            g0.S("binding");
            j6Var = null;
        }
        TextView noproguardBookLink = j6Var.f55438i;
        g0.o(noproguardBookLink, "noproguardBookLink");
        q.p(noproguardBookLink, bookAdInfo != null ? bookAdInfo.show_name : null);
        hVar.f49804b = bookAdInfo;
        return g2.f100423a;
    }

    public static final g2 H(h hVar, View it) {
        g0.p(it, "it");
        i.a aVar = tj.i.f90704f;
        FragmentActivity requireActivity = hVar.requireActivity();
        g0.o(requireActivity, "requireActivity(...)");
        aVar.f(requireActivity);
        return g2.f100423a;
    }

    public static final g2 I(h hVar, View it) {
        g0.p(it, "it");
        if (hVar.f49804b != null) {
            i.a aVar = tj.i.f90704f;
            FragmentActivity requireActivity = hVar.requireActivity();
            g0.o(requireActivity, "requireActivity(...)");
            BookAdObservables.BookAdInfo bookAdInfo = hVar.f49804b;
            g0.m(bookAdInfo);
            aVar.e(requireActivity, bookAdInfo, 1);
        }
        return g2.f100423a;
    }

    public static final g2 J(h hVar, View it) {
        g0.p(it, "it");
        hVar.dismiss();
        return g2.f100423a;
    }

    public final tj.i C() {
        return (tj.i) this.f49803a.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        j6 c11 = j6.c(inflater);
        g0.o(c11, "inflate(...)");
        this.f49805c = c11;
        if (c11 == null) {
            g0.S("binding");
            c11 = null;
        }
        return c11.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_inset_common_dialog));
        }
        Dialog dialog2 = getDialog();
        WindowManager.LayoutParams layoutParams = null;
        WindowManager.LayoutParams attributes = (dialog2 == null || (window2 = dialog2.getWindow()) == null) ? null : window2.getAttributes();
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null) {
            return;
        }
        if (attributes != null) {
            attributes.width = -1;
            attributes.height = xb.f.f(getContext());
            layoutParams = attributes;
        }
        window.setAttributes(layoutParams);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@m80.k View view, @m80.l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        C().j().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: eg.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 E;
                E = h.E(h.this, (tj.a) obj);
                return E;
            }
        }));
        C().k().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: eg.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 F;
                F = h.F(h.this, (d.g) obj);
                return F;
            }
        }));
        C().i().observe(getViewLifecycleOwner(), new b(new x00.l() { // from class: eg.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 G;
                G = h.G(h.this, (BookAdObservables.BookAdInfo) obj);
                return G;
            }
        }));
        j6 j6Var = this.f49805c;
        if (j6Var == null) {
            g0.S("binding");
            j6Var = null;
        }
        OfflineDownloadView noproguardBookDownload = j6Var.f55437h;
        g0.o(noproguardBookDownload, "noproguardBookDownload");
        q.t(noproguardBookDownload, 0, new x00.l() { // from class: eg.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = h.H(h.this, (View) obj);
                return H;
            }
        }, 1, null);
        j6 j6Var2 = this.f49805c;
        if (j6Var2 == null) {
            g0.S("binding");
            j6Var2 = null;
        }
        TextView noproguardBookLink = j6Var2.f55438i;
        g0.o(noproguardBookLink, "noproguardBookLink");
        q.t(noproguardBookLink, 0, new x00.l() { // from class: eg.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 I;
                I = h.I(h.this, (View) obj);
                return I;
            }
        }, 1, null);
        j6 j6Var3 = this.f49805c;
        if (j6Var3 == null) {
            g0.S("binding");
            j6Var3 = null;
        }
        ImageView close = j6Var3.f55435f;
        g0.o(close, "close");
        q.t(close, 0, new x00.l() { // from class: eg.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 J;
                J = h.J(h.this, (View) obj);
                return J;
            }
        }, 1, null);
    }
}
