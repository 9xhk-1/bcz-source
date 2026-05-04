package com.baicizhan.main.activity.schedule_v2;

import a00.l1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.idenity.UserIdentity;
import com.baicizhan.main.activity.schedule_v2.IdentityBooksActivity;
import com.baicizhan.main.activity.schedule_v2.PositionedBooksFragment;
import com.baicizhan.online.user_study_api.UserSelectedBookInfo;
import com.jiongji.andriod.card.R;
import ee.m;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import ma.t;
import oe.i0;
import x00.l;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIdentityBooksActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityBooksActivity.kt\ncom/baicizhan/main/activity/schedule_v2/IdentityBooksActivity\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 3 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,103:1\n35#2:104\n18#3,3:105\n*S KotlinDebug\n*F\n+ 1 IdentityBooksActivity.kt\ncom/baicizhan/main/activity/schedule_v2/IdentityBooksActivity\n*L\n42#1:104\n47#1:105,3\n*E\n"})
/* loaded from: classes4.dex */
public final class IdentityBooksActivity extends IdentityInfoActivity implements PositionedBooksFragment.b {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f18933o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f18934p = 8;

    /* renamed from: q, reason: collision with root package name */
    public static final int f18935q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f18936r = 2;

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final String f18937s = "param_grade";

    /* renamed from: m, reason: collision with root package name */
    public gs.u0 f18938m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final c0 f18939n = e0.c(new x00.a() { // from class: oe.x0
        @Override // x00.a
        public final Object invoke() {
            i0 V0;
            V0 = IdentityBooksActivity.V0(IdentityBooksActivity.this);
            return V0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public final void a(@k Activity activity, int i11, @k String config, int i12, int i13) {
            g0.p(activity, "activity");
            g0.p(config, "config");
            Intent intent = new Intent(activity, (Class<?>) IdentityBooksActivity.class);
            intent.putExtra(IdentityBooksActivity.f18937s, i11);
            intent.putExtra(IdentityInfoActivity.f18944g, config);
            intent.putExtra("form", i13);
            activity.startActivityForResult(intent, i12);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f18940a;

        public b(l function) {
            g0.p(function, "function");
            this.f18940a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f18940a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18940a.invoke(obj);
        }
    }

    private final i0 U0() {
        return (i0) this.f18939n.getValue();
    }

    public static final i0 V0(IdentityBooksActivity identityBooksActivity) {
        return (i0) new ViewModelProvider(identityBooksActivity).get(i0.class);
    }

    public static final void W0(IdentityBooksActivity identityBooksActivity, View view) {
        identityBooksActivity.finish();
    }

    public static final void X0(IdentityBooksActivity identityBooksActivity, View view) {
        AllBooksActivity.f18897q.d(identityBooksActivity, identityBooksActivity.K0(), 1, identityBooksActivity.L0());
    }

    public static final g2 Y0(IdentityBooksActivity identityBooksActivity, UserSelectedBookInfo userSelectedBookInfo) {
        g2 g2Var;
        String str = userSelectedBookInfo.mode_switch_url;
        if (str != null) {
            BczWebExecutorKt.startWebForResult$default(identityBooksActivity, str, 2, false, 0, 16, null);
            return g2.f100423a;
        }
        String J0 = identityBooksActivity.J0();
        if (J0 == null || J0.length() == 0) {
            g2Var = null;
        } else {
            BczWebExecutorKt.startWebForResult$default(identityBooksActivity, J0, 2, false, 0, 16, null);
            g2Var = g2.f100423a;
        }
        if (g2Var == null) {
            identityBooksActivity.setResult(-1);
            identityBooksActivity.finish();
        }
        return g2.f100423a;
    }

    public static final g2 Z0(IdentityBooksActivity identityBooksActivity, Boolean bool) {
        if (g0.g(bool, Boolean.TRUE)) {
            identityBooksActivity.E0().show();
        } else {
            identityBooksActivity.E0().dismiss();
        }
        return g2.f100423a;
    }

    @Override // com.baicizhan.main.activity.schedule_v2.PositionedBooksFragment.b
    public void d0(@k String tagName) {
        g0.p(tagName, "tagName");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @m80.l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i12 == -1) {
            if (i11 == 1 || i11 == 2) {
                setResult(-1);
                finish();
            }
        }
    }

    @Override // com.baicizhan.main.activity.schedule_v2.IdentityInfoActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R.layout.activity_identity_books);
        g0.o(contentView, "setContentView(...)");
        gs.u0 u0Var = (gs.u0) contentView;
        this.f18938m = u0Var;
        gs.u0 u0Var2 = null;
        if (u0Var == null) {
            g0.S("binding");
            u0Var = null;
        }
        u0Var.f56931a.D(new View.OnClickListener() { // from class: oe.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IdentityBooksActivity.W0(IdentityBooksActivity.this, view);
            }
        });
        gs.u0 u0Var3 = this.f18938m;
        if (u0Var3 == null) {
            g0.S("binding");
        } else {
            u0Var2 = u0Var3;
        }
        u0Var2.f56931a.L(new View.OnClickListener() { // from class: oe.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IdentityBooksActivity.X0(IdentityBooksActivity.this, view);
            }
        });
        U0().C().observe(this, new b(new l() { // from class: oe.v0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Y0;
                Y0 = IdentityBooksActivity.Y0(IdentityBooksActivity.this, (UserSelectedBookInfo) obj);
                return Y0;
            }
        }));
        U0().A().observe(this, new b(new l() { // from class: oe.w0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Z0;
                Z0 = IdentityBooksActivity.Z0(IdentityBooksActivity.this, (Boolean) obj);
                return Z0;
            }
        }));
        UserIdentity d11 = m.d(getIntent().getIntExtra(f18937s, 1));
        U0().F(d11);
        ma.l.e(t.f73017p, ma.a.f72882z1, l1.W(h1.a(ma.b.f72933p, gi.i0.a(d11)), h1.a(ma.b.Y, Integer.valueOf(L0()))));
    }
}
