package md;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.online.user_study_api.CalendarResignInfo;
import com.baicizhan.online.user_study_api.DakaRescueInfo;
import gs.p6;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import ma.t;
import md.j;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRepairDakaDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairDakaDialog.kt\ncom/baicizhan/main/activity/calendar/repair/RepairDakaDialog\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,186:1\n35#2:187\n35#2:188\n35#2:189\n35#2:190\n*S KotlinDebug\n*F\n+ 1 RepairDakaDialog.kt\ncom/baicizhan/main/activity/calendar/repair/RepairDakaDialog\n*L\n60#1:187\n73#1:188\n121#1:189\n135#1:190\n*E\n"})
/* loaded from: classes4.dex */
public final class f extends DialogFragment {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f73105g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f73106h = 8;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f73107i = "RepairDakaDialog";

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final String f73108j = "arg_calendar_repair_info";

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final String f73109k = "arg_current_calendar";

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public p6 f73110a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public q f73111b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public CalendarResignInfo f73112c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f73113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f73114e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f73115f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final f a(@m80.k CalendarResignInfo info, @m80.k Calendar calendar) {
            g0.p(info, "info");
            g0.p(calendar, "calendar");
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putSerializable(f.f73108j, info);
            bundle.putSerializable(f.f73109k, calendar);
            fVar.setArguments(bundle);
            return fVar;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f73116a;

        public b(x00.l function) {
            g0.p(function, "function");
            this.f73116a = function;
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
            return this.f73116a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f73116a.invoke(obj);
        }
    }

    public static final g2 F(f fVar, View it) {
        g0.p(it, "it");
        fVar.dismiss();
        g.f73117a.a().onNext(Boolean.valueOf(fVar.f73113d));
        return g2.f100423a;
    }

    public static final void G(f fVar, p6 p6Var, View view) {
        fVar.A(p6Var);
    }

    public static final void H(f fVar, p6 p6Var, View view) {
        fVar.A(p6Var);
    }

    public static final void L(f fVar, va.f fVar2, View view) {
        fVar.f73114e = true;
        fVar2.show();
        q qVar = fVar.f73111b;
        if (qVar != null) {
            qVar.l();
        }
        ma.l.a(t.C, ma.a.f72835s3);
    }

    public static final g2 M(f fVar, va.f fVar2, DakaRescueInfo dakaRescueInfo) {
        qb.c.i(f73107i, String.valueOf(dakaRescueInfo), new Object[0]);
        if (!fVar.f73114e) {
            return g2.f100423a;
        }
        if (dakaRescueInfo.code == 1) {
            fVar.f73113d = true;
        }
        fVar2.dismiss();
        int i11 = dakaRescueInfo.code;
        if (i11 == 0 || i11 == 2) {
            qb.c.i(f73107i, String.valueOf(i11), new Object[0]);
            fVar.dismiss();
            j.a aVar = j.f73123c;
            boolean z11 = dakaRescueInfo.code == 0;
            CalendarResignInfo calendarResignInfo = fVar.f73112c;
            aVar.a(z11, calendarResignInfo != null ? calendarResignInfo.jump_url : null).show(fVar.getParentFragmentManager(), "result");
        } else {
            va.g.i(dakaRescueInfo.message, 0);
        }
        return g2.f100423a;
    }

    public final void A(p6 p6Var) {
        if (this.f73115f) {
            return;
        }
        this.f73115f = true;
        p6Var.f56305b.setVisibility(4);
        p6Var.f56304a.setMaxLines(10);
    }

    @m80.l
    public final p6 B() {
        return this.f73110a;
    }

    @m80.l
    public final q C() {
        return this.f73111b;
    }

    @m80.l
    public final CalendarResignInfo D() {
        return this.f73112c;
    }

    public final void E(final p6 p6Var) {
        if (p6Var != null) {
            TextView repairCancel = p6Var.f56306c;
            g0.o(repairCancel, "repairCancel");
            sa.q.t(repairCancel, 0, new x00.l() { // from class: md.c
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 F;
                    F = f.F(f.this, (View) obj);
                    return F;
                }
            }, 1, null);
            CalendarResignInfo calendarResignInfo = this.f73112c;
            if (calendarResignInfo != null) {
                String icon = calendarResignInfo.icon;
                g0.o(icon, "icon");
                ic.c l11 = hc.c.l(icon);
                ImageView repairImage = p6Var.f56311h;
                g0.o(repairImage, "repairImage");
                l11.o(repairImage);
            }
            p6Var.f56304a.setOnClickListener(new View.OnClickListener() { // from class: md.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.G(f.this, p6Var, view);
                }
            });
            p6Var.f56305b.setOnClickListener(new View.OnClickListener() { // from class: md.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.H(f.this, p6Var, view);
                }
            });
        }
    }

    public final boolean I() {
        return this.f73115f;
    }

    public final boolean J() {
        return this.f73113d;
    }

    public final boolean K() {
        return this.f73114e;
    }

    public final void N(boolean z11) {
        this.f73115f = z11;
    }

    public final void O(@m80.l p6 p6Var) {
        this.f73110a = p6Var;
    }

    public final void P(@m80.l q qVar) {
        this.f73111b = qVar;
    }

    public final void Q(boolean z11) {
        this.f73113d = z11;
    }

    public final void R(@m80.l CalendarResignInfo calendarResignInfo) {
        this.f73112c = calendarResignInfo;
    }

    public final void S(boolean z11) {
        this.f73114e = z11;
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        g0.p(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        this.f73110a = p6.e(inflater);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable(f73108j) : null;
        g0.n(serializable, "null cannot be cast to non-null type com.baicizhan.online.user_study_api.CalendarResignInfo");
        this.f73112c = (CalendarResignInfo) serializable;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            q qVar = (q) new ViewModelProvider(activity).get(q.class);
            this.f73111b = qVar;
            if (qVar != null) {
                Bundle arguments2 = getArguments();
                Serializable serializable2 = arguments2 != null ? arguments2.getSerializable(f73108j) : null;
                g0.n(serializable2, "null cannot be cast to non-null type com.baicizhan.online.user_study_api.CalendarResignInfo");
                CalendarResignInfo calendarResignInfo = (CalendarResignInfo) serializable2;
                Bundle arguments3 = getArguments();
                Serializable serializable3 = arguments3 != null ? arguments3.getSerializable(f73109k) : null;
                g0.n(serializable3, "null cannot be cast to non-null type java.util.Calendar");
                qVar.u(calendarResignInfo, (Calendar) serializable3);
            }
        }
        p6 p6Var = this.f73110a;
        if (p6Var != null) {
            p6Var.j(this.f73111b);
        }
        E(this.f73110a);
        p6 p6Var2 = this.f73110a;
        if (p6Var2 != null) {
            return p6Var2.getRoot();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r2 = r1.getInsetsController();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r4 = r0.getInsetsController();
     */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() {
        /*
            r6 = this;
            super.onStart()
            android.app.Dialog r0 = r6.getDialog()
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.Window r0 = r0.getWindow()
            goto L10
        Lf:
            r0 = r1
        L10:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 <= r3) goto L25
            if (r0 == 0) goto L25
            android.view.WindowInsetsController r4 = androidx.core.view.e2.a(r0)
            if (r4 == 0) goto L25
            int r5 = androidx.core.view.x1.a()
            androidx.core.view.c0.a(r4, r5)
        L25:
            android.app.Dialog r4 = r6.getDialog()
            if (r4 == 0) goto L2f
            r5 = 0
            r4.setCancelable(r5)
        L2f:
            r4 = 2131887372(0x7f12050c, float:1.940935E38)
            if (r0 == 0) goto L3d
            r5 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r5)
            r0.setWindowAnimations(r4)
        L3d:
            if (r0 == 0) goto L55
            android.view.WindowManager$LayoutParams r5 = r0.getAttributes()
            if (r5 == 0) goto L52
            r1 = -1
            r5.width = r1
            r1 = -2
            r5.height = r1
            r1 = 80
            r5.gravity = r1
            r5.windowAnimations = r4
            r1 = r5
        L52:
            r0.setAttributes(r1)
        L55:
            android.content.Context r0 = r6.getContext()
            va.f r0 = gi.e.c(r0)
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L76
            if (r2 <= r3) goto L72
            android.view.WindowInsetsController r2 = androidx.core.view.e2.a(r1)
            if (r2 == 0) goto L72
            int r3 = androidx.core.view.x1.a()
            androidx.core.view.c0.a(r2, r3)
        L72:
            r2 = 2
            r1.clearFlags(r2)
        L76:
            gs.p6 r1 = r6.f73110a
            if (r1 == 0) goto L86
            android.widget.TextView r1 = r1.f56307d
            if (r1 == 0) goto L86
            md.a r2 = new md.a
            r2.<init>()
            r1.setOnClickListener(r2)
        L86:
            md.q r1 = r6.f73111b
            if (r1 == 0) goto L9d
            androidx.lifecycle.MutableLiveData r1 = r1.j()
            if (r1 == 0) goto L9d
            md.b r2 = new md.b
            r2.<init>()
            md.f$b r0 = new md.f$b
            r0.<init>(r2)
            r1.observe(r6, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md.f.onStart():void");
    }

    public final void z(p6 p6Var) {
    }
}
