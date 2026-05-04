package com.baicizhan.main.activity.idenity;

import a00.a0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.idenity.UserGradleActivity;
import com.baicizhan.main.activity.idenity.UserIdentityActivity;
import com.baicizhan.main.home.experiment.q0;
import com.baicizhan.main.home.player.HomeActivity;
import com.jiongji.andriod.card.R;
import ee.m0;
import gi.e;
import gs.t2;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import ma.t;
import sa.q;
import va.f;
import w00.o;
import x00.l;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nUserIdentityActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserIdentityActivity.kt\ncom/baicizhan/main/activity/idenity/UserIdentityActivity\n+ 2 utils.kt\ncom/baicizhan/base/UtilsKt\n*L\n1#1,260:1\n14#2,6:261\n*S KotlinDebug\n*F\n+ 1 UserIdentityActivity.kt\ncom/baicizhan/main/activity/idenity/UserIdentityActivity\n*L\n108#1:261,6\n*E\n"})
/* loaded from: classes4.dex */
public final class UserIdentityActivity extends BaseAppCompatActivity {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f18497e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f18498f = 8;

    /* renamed from: g, reason: collision with root package name */
    public static final String f18499g = UserIdentityActivity.class.getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f18500h = "need_result";

    /* renamed from: i, reason: collision with root package name */
    public static final int f18501i = 1;

    /* renamed from: b, reason: collision with root package name */
    public String[] f18503b;

    /* renamed from: c, reason: collision with root package name */
    public m0 f18504c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Integer[] f18502a = {Integer.valueOf(R.drawable.ic_user_identity_for_us), Integer.valueOf(R.drawable.ic_user_identity_for_child)};

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c0 f18505d = e0.c(new x00.a() { // from class: ee.i0
        @Override // x00.a
        public final Object invoke() {
            va.f O0;
            O0 = UserIdentityActivity.O0(UserIdentityActivity.this);
            return O0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        public final void a(@k Context context) {
            g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) UserIdentityActivity.class));
        }

        @o
        public final void b(@k Activity context, int i11) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserIdentityActivity.class);
            intent.putExtra(UserIdentityActivity.f18500h, true);
            context.startActivityForResult(intent, i11);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends RecyclerView.Adapter<c> {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@k c holder, int i11) {
            g0.p(holder, "holder");
            TextView e11 = holder.e();
            String[] strArr = UserIdentityActivity.this.f18503b;
            Drawable drawable = null;
            if (strArr == null) {
                g0.S("identityNames");
                strArr = null;
            }
            e11.setText((CharSequence) a0.hf(strArr, i11));
            ImageView f11 = holder.f();
            UserIdentityActivity userIdentityActivity = UserIdentityActivity.this;
            Drawable drawable2 = ContextCompat.getDrawable(userIdentityActivity, userIdentityActivity.f18502a[i11].intValue());
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                drawable = drawable2;
            }
            f11.setImageDrawable(drawable);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c onCreateViewHolder(@k ViewGroup parent, int i11) {
            g0.p(parent, "parent");
            UserIdentityActivity userIdentityActivity = UserIdentityActivity.this;
            View inflate = LayoutInflater.from(userIdentityActivity).inflate(R.layout.item_user_identity, parent, false);
            g0.o(inflate, "inflate(...)");
            return new c(userIdentityActivity, inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return UserIdentityActivity.this.f18502a.length;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TextView f18507a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ImageView f18508b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserIdentityActivity f18509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@k final UserIdentityActivity userIdentityActivity, View v11) {
            super(v11);
            g0.p(v11, "v");
            this.f18509c = userIdentityActivity;
            View findViewById = v11.findViewById(R.id.identity_name);
            g0.o(findViewById, "findViewById(...)");
            this.f18507a = (TextView) findViewById;
            View findViewById2 = v11.findViewById(R.id.identity_icon);
            g0.o(findViewById2, "findViewById(...)");
            this.f18508b = (ImageView) findViewById2;
            q.t(v11, 0, new l() { // from class: ee.l0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 d11;
                    d11 = UserIdentityActivity.c.d(UserIdentityActivity.this, this, (View) obj);
                    return d11;
                }
            }, 1, null);
        }

        public static g2 b(final c cVar, UserIdentityActivity userIdentityActivity, Boolean bool) {
            if (bool.booleanValue()) {
                if (cVar.getAdapterPosition() == 2) {
                    m0 m0Var = userIdentityActivity.f18504c;
                    if (m0Var == null) {
                        g0.S("model");
                        m0Var = null;
                    }
                    m0Var.d(3, new l() { // from class: ee.k0
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            return UserIdentityActivity.c.c(UserIdentityActivity.c.this, (String) obj);
                        }
                    });
                } else {
                    cVar.g(cVar.getAdapterPosition() + 1, "");
                }
            }
            return g2.f100423a;
        }

        public static g2 c(c cVar, String config) {
            g0.p(config, "config");
            cVar.g(3, config);
            return g2.f100423a;
        }

        public static final g2 d(final UserIdentityActivity userIdentityActivity, final c cVar, View it) {
            g0.p(it, "it");
            m0 m0Var = userIdentityActivity.f18504c;
            if (m0Var == null) {
                g0.S("model");
                m0Var = null;
            }
            m0Var.c().observe(userIdentityActivity, new d(new l() { // from class: ee.j0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    return UserIdentityActivity.c.b(UserIdentityActivity.c.this, userIdentityActivity, (Boolean) obj);
                }
            }));
            return g2.f100423a;
        }

        @k
        public final TextView e() {
            return this.f18507a;
        }

        @k
        public final ImageView f() {
            return this.f18508b;
        }

        public final void g(int i11, String str) {
            this.f18509c.P0(i11, str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f18510a;

        public d(l function) {
            g0.p(function, "function");
            this.f18510a = function;
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
            return this.f18510a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18510a.invoke(obj);
        }
    }

    private final f E0() {
        return (f) this.f18505d.getValue();
    }

    public static final f O0(UserIdentityActivity userIdentityActivity) {
        return e.c(userIdentityActivity);
    }

    public static final g2 R0(UserIdentityActivity userIdentityActivity, Boolean bool) {
        qb.c.b(f18499g, "state: " + bool, new Object[0]);
        if (g0.g(bool, Boolean.TRUE)) {
            userIdentityActivity.E0().show();
        } else {
            userIdentityActivity.E0().dismiss();
        }
        return g2.f100423a;
    }

    @o
    public static final void S0(@k Context context) {
        f18497e.a(context);
    }

    @o
    public static final void T0(@k Activity activity, int i11) {
        f18497e.b(activity, i11);
    }

    public final void P0(int i11, String str) {
        UserGradleActivity.a.d(UserGradleActivity.f18481f, this, 0, null, 4, null);
        ma.l.a(t.f73017p, ma.a.O1);
    }

    public final void Q0() {
        m0 m0Var = (m0) new ViewModelProvider(this).get(m0.class);
        this.f18504c = m0Var;
        if (m0Var == null) {
            g0.S("model");
            m0Var = null;
        }
        m0Var.b().observe(this, new d(new l() { // from class: ee.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 R0;
                R0 = UserIdentityActivity.R0(UserIdentityActivity.this, (Boolean) obj);
                return R0;
            }
        }));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @m80.l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1 && i12 == -1) {
            if (getIntent().getBooleanExtra(f18500h, false)) {
                setResult(-1);
                finish();
            } else {
                if (q0.f21394a.b()) {
                    startActivity(new Intent(this, (Class<?>) HomeActivity.class));
                } else {
                    MainTabActivity.Y1(this, false);
                }
                finish();
            }
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        String[] stringArray = getResources().getStringArray(R.array.user_identities);
        g0.o(stringArray, "getStringArray(...)");
        this.f18503b = stringArray;
        t2 c11 = t2.c(getLayoutInflater());
        c11.f56821b.setAdapter(new b());
        c11.f56821b.addItemDecoration(new qf.a(1, xb.f.a(this, 20.0f), xb.f.a(this, 8.0f), true, false, true, false, 0, 0, 464, null));
        setContentView(c11.getRoot());
        Q0();
        ma.l.a(t.f73017p, ma.a.N1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
