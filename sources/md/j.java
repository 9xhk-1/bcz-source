package md;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import gs.r6;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import ma.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRepairDakaResultDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairDakaResultDialog.kt\ncom/baicizhan/main/activity/calendar/repair/RepairDakaResultDialog\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,106:1\n35#2:107\n35#2:108\n35#2:109\n35#2:110\n*S KotlinDebug\n*F\n+ 1 RepairDakaResultDialog.kt\ncom/baicizhan/main/activity/calendar/repair/RepairDakaResultDialog\n*L\n39#1:107\n43#1:108\n76#1:109\n51#1:110\n*E\n"})
/* loaded from: classes4.dex */
public final class j extends DialogFragment {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f73123c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f73124d = 8;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f73125e = "is_success";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f73126f = "jump_url";

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public r6 f73127a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public k f73128b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final j a(boolean z11, @m80.l String str) {
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putBoolean(j.f73125e, z11);
            bundle.putString(j.f73126f, str);
            jVar.setArguments(bundle);
            return jVar;
        }

        public a() {
        }
    }

    public static final g2 y(j jVar, boolean z11, View it) {
        g0.p(it, "it");
        jVar.dismiss();
        g.f73117a.a().onNext(Boolean.valueOf(z11));
        return g2.f100423a;
    }

    public static final g2 z(j jVar, View it) {
        g0.p(it, "it");
        jVar.dismiss();
        Bundle arguments = jVar.getArguments();
        String string = arguments != null ? arguments.getString(f73126f) : null;
        if (string != null) {
            BczWebExecutorKt.startNormalWeb$default(jVar.getContext(), string, null, false, 0, null, 60, null);
        }
        return g2.f100423a;
    }

    public final void A(@m80.l r6 r6Var) {
        this.f73127a = r6Var;
    }

    public final void B(@m80.l k kVar) {
        this.f73128b = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        this.f73127a = r6.e(inflater);
        Bundle arguments = getArguments();
        final boolean z11 = arguments != null ? arguments.getBoolean(f73125e, false) : false;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            k kVar = (k) new ViewModelProvider(activity).get(k.class);
            this.f73128b = kVar;
            if (kVar != null) {
                kVar.b(z11);
            }
        }
        r6 r6Var = this.f73127a;
        if (r6Var != null) {
            r6Var.j(this.f73128b);
            TextView repairFinish = r6Var.f56575a;
            g0.o(repairFinish, "repairFinish");
            sa.q.t(repairFinish, 0, new x00.l() { // from class: md.h
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 y11;
                    y11 = j.y(j.this, z11, (View) obj);
                    return y11;
                }
            }, 1, null);
            TextView repairMore = r6Var.f56576b;
            g0.o(repairMore, "repairMore");
            sa.q.t(repairMore, 0, new x00.l() { // from class: md.i
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 z12;
                    z12 = j.z(j.this, (View) obj);
                    return z12;
                }
            }, 1, null);
        }
        if (z11) {
            ma.l.a(t.C, ma.a.f72828r3);
        }
        r6 r6Var2 = this.f73127a;
        if (r6Var2 != null) {
            return r6Var2.getRoot();
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
            r3 = 0
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
        throw new UnsupportedOperationException("Method not decompiled: md.j.onStart():void");
    }

    @m80.l
    public final r6 w() {
        return this.f73127a;
    }

    @m80.l
    public final k x() {
        return this.f73128b;
    }
}
