package com.baicizhan.main.activity.schedule_v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import gs.t6;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import sa.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSpecialFreeBookDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialFreeBookDialog.kt\ncom/baicizhan/main/activity/schedule_v2/SpecialFreeBookDialog\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,95:1\n35#2:96\n35#2:97\n*S KotlinDebug\n*F\n+ 1 SpecialFreeBookDialog.kt\ncom/baicizhan/main/activity/schedule_v2/SpecialFreeBookDialog\n*L\n39#1:96\n67#1:97\n*E\n"})
/* loaded from: classes4.dex */
public final class e extends DialogFragment {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f19253c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f19254d = 8;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f19255e = "img_url";

    /* renamed from: a, reason: collision with root package name */
    @l
    public t6 f19256a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public x00.a<g2> f19257b = new x00.a() { // from class: oe.j1
        @Override // x00.a
        public final Object invoke() {
            g2 x11;
            x11 = com.baicizhan.main.activity.schedule_v2.e.x();
            return x11;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final e a(@l String str) {
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString(e.f19255e, str);
            eVar.setArguments(bundle);
            return eVar;
        }

        public a() {
        }
    }

    public static final g2 A(e eVar, View it) {
        g0.p(it, "it");
        eVar.f19257b.invoke();
        eVar.dismiss();
        return g2.f100423a;
    }

    public static final g2 B(e eVar, View it) {
        g0.p(it, "it");
        eVar.dismiss();
        return g2.f100423a;
    }

    public static final g2 x() {
        return g2.f100423a;
    }

    public final void C(@k x00.a<g2> aVar) {
        g0.p(aVar, "<set-?>");
        this.f19257b = aVar;
    }

    public final void D(@l t6 t6Var) {
        this.f19256a = t6Var;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        String str;
        g0.p(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        this.f19256a = t6.d(inflater);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(f19255e)) == null) {
            str = "";
        }
        t6 t6Var = this.f19256a;
        if (t6Var != null) {
            ic.c l11 = hc.c.l(str);
            ImageView ivAd = t6Var.f56834a;
            g0.o(ivAd, "ivAd");
            l11.o(ivAd);
            TextView tvAdd = t6Var.f56836c;
            g0.o(tvAdd, "tvAdd");
            q.t(tvAdd, 0, new x00.l() { // from class: oe.h1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 A;
                    A = com.baicizhan.main.activity.schedule_v2.e.A(com.baicizhan.main.activity.schedule_v2.e.this, (View) obj);
                    return A;
                }
            }, 1, null);
            ImageView ivClose = t6Var.f56835b;
            g0.o(ivClose, "ivClose");
            q.t(ivClose, 0, new x00.l() { // from class: oe.i1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 B;
                    B = com.baicizhan.main.activity.schedule_v2.e.B(com.baicizhan.main.activity.schedule_v2.e.this, (View) obj);
                    return B;
                }
            }, 1, null);
        }
        t6 t6Var2 = this.f19256a;
        if (t6Var2 != null) {
            return t6Var2.getRoot();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.getInsetsController();
     */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() {
        /*
            r4 = this;
            super.onStart()
            android.app.Dialog r0 = r4.getDialog()
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.Window r0 = r0.getWindow()
            goto L10
        Lf:
            r0 = r1
        L10:
            android.app.Dialog r2 = r4.getDialog()
            if (r2 == 0) goto L1a
            r3 = 1
            r2.setCancelable(r3)
        L1a:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 <= r3) goto L2f
            if (r0 == 0) goto L2f
            android.view.WindowInsetsController r2 = androidx.core.view.e2.a(r0)
            if (r2 == 0) goto L2f
            int r3 = androidx.core.view.x1.a()
            androidx.core.view.c0.a(r2, r3)
        L2f:
            r2 = 2131887372(0x7f12050c, float:1.940935E38)
            if (r0 == 0) goto L3d
            r3 = 2131230916(0x7f0800c4, float:1.8077898E38)
            r0.setBackgroundDrawableResource(r3)
            r0.setWindowAnimations(r2)
        L3d:
            if (r0 == 0) goto L55
            android.view.WindowManager$LayoutParams r3 = r0.getAttributes()
            if (r3 == 0) goto L52
            r1 = -1
            r3.width = r1
            r1 = -2
            r3.height = r1
            r1 = 80
            r3.gravity = r1
            r3.windowAnimations = r2
            r1 = r3
        L52:
            r0.setAttributes(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.schedule_v2.e.onStart():void");
    }

    @k
    public final x00.a<g2> y() {
        return this.f19257b;
    }

    @l
    public final t6 z() {
        return this.f19256a;
    }
}
