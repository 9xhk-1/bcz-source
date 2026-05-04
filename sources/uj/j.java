package uj;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.jiongji.andriod.card.R;
import gs.b7;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import sa.q;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class j extends DialogFragment {

    /* renamed from: e, reason: collision with root package name */
    public static final int f92252e = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f92253a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x00.a<g2> f92254b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x00.a<g2> f92255c;

    /* renamed from: d, reason: collision with root package name */
    public b7 f92256d;

    public j(@k a param, @k x00.a<g2> negativeClick, @k x00.a<g2> positiveClick) {
        g0.p(param, "param");
        g0.p(negativeClick, "negativeClick");
        g0.p(positiveClick, "positiveClick");
        this.f92253a = param;
        this.f92254b = negativeClick;
        this.f92255c = positiveClick;
    }

    private final void D() {
        b7 b7Var = this.f92256d;
        if (b7Var == null) {
            g0.S("mBinding");
            b7Var = null;
        }
        b7Var.f54252d.setText(this.f92253a.j());
        TextView tvTitle = b7Var.f54252d;
        g0.o(tvTitle, "tvTitle");
        q.z(tvTitle, this.f92253a.j().length() > 0);
        b7Var.f54251c.setText(this.f92253a.i());
        TextView tvSubtitle = b7Var.f54251c;
        g0.o(tvSubtitle, "tvSubtitle");
        q.z(tvSubtitle, this.f92253a.i().length() > 0);
        b7Var.f54249a.setText(this.f92253a.g());
        TextView tvNegative = b7Var.f54249a;
        g0.o(tvNegative, "tvNegative");
        q.z(tvNegative, this.f92253a.g().length() > 0);
        TextView tvNegative2 = b7Var.f54249a;
        g0.o(tvNegative2, "tvNegative");
        q.t(tvNegative2, 0, new l() { // from class: uj.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 E;
                E = j.E(j.this, (View) obj);
                return E;
            }
        }, 1, null);
        b7Var.f54250b.setText(this.f92253a.h());
        TextView tvPositive = b7Var.f54250b;
        g0.o(tvPositive, "tvPositive");
        q.z(tvPositive, this.f92253a.h().length() > 0);
        TextView tvPositive2 = b7Var.f54250b;
        g0.o(tvPositive2, "tvPositive");
        q.t(tvPositive2, 0, new l() { // from class: uj.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 F;
                F = j.F(j.this, (View) obj);
                return F;
            }
        }, 1, null);
    }

    public static final g2 E(j jVar, View it) {
        g0.p(it, "it");
        jVar.dismiss();
        jVar.f92254b.invoke();
        return g2.f100423a;
    }

    public static final g2 F(j jVar, View it) {
        g0.p(it, "it");
        jVar.dismiss();
        jVar.f92255c.invoke();
        return g2.f100423a;
    }

    public static final g2 y() {
        return g2.f100423a;
    }

    public static final g2 z() {
        return g2.f100423a;
    }

    @k
    public final x00.a<g2> A() {
        return this.f92254b;
    }

    @k
    public final a B() {
        return this.f92253a;
    }

    @k
    public final x00.a<g2> C() {
        return this.f92255c;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.bczDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        b7 e11 = b7.e(inflater, viewGroup, false);
        g0.m(e11);
        this.f92256d = e11;
        D();
        return e11.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams layoutParams = null;
        WindowManager.LayoutParams attributes = (dialog == null || (window2 = dialog.getWindow()) == null) ? null : window2.getAttributes();
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        if (attributes != null) {
            attributes.width = -1;
            attributes.height = -2;
            layoutParams = attributes;
        }
        window.setAttributes(layoutParams);
        window.getDecorView().setPadding(KotlinExtKt.getDpValue(40), 0, KotlinExtKt.getDpValue(40), 0);
    }

    public /* synthetic */ j(a aVar, x00.a aVar2, x00.a aVar3, int i11, v vVar) {
        this(aVar, (i11 & 2) != 0 ? new x00.a() { // from class: uj.h
            @Override // x00.a
            public final Object invoke() {
                g2 y11;
                y11 = j.y();
                return y11;
            }
        } : aVar2, (i11 & 4) != 0 ? new x00.a() { // from class: uj.i
            @Override // x00.a
            public final Object invoke() {
                g2 z11;
                z11 = j.z();
                return z11;
            }
        } : aVar3);
    }
}
