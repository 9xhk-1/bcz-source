package com.baicizhan.main.activity.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.ActivityLifeController;
import com.baicizhan.client.business.util.AutoSizeMgr;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.IntroductionPageActivity;
import com.baicizhan.main.activity.MainTabActivity;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.baicizhan.main.activity.setting.SettingsActivity;
import com.baicizhan.main.activity.setting.account.AccountActivity;
import com.baicizhan.main.home.experiment.q0;
import com.jiongji.andriod.card.R;
import gs.d2;
import kc.r;
import kc.u;
import ma.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SettingsActivity extends BaseAppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    public com.baicizhan.main.activity.setting.a f19544a;

    /* renamed from: b, reason: collision with root package name */
    public d2 f19545b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19546c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19547d = true;

    /* renamed from: e, reason: collision with root package name */
    public va.f f19548e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Void> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SettingsActivity.this.d1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<UserRecord> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable UserRecord userRecord) {
            if (userRecord != null) {
                SettingsActivity.this.a1(userRecord);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Boolean> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Boolean isChecked) {
            if (isChecked.booleanValue()) {
                AutoSizeMgr autoSizeMgr = AutoSizeMgr.INSTANCE;
                autoSizeMgr.setUserCloseAutoSize(false);
                autoSizeMgr.setAutoSize(SettingsActivity.this.getApplication(), false);
                SettingsActivity.this.f19545b.f54556m.getRoot().setVisibility(8);
            }
            if (SettingsActivity.this.f19547d) {
                return;
            }
            com.baicizhan.base.a.b(SettingsActivity.this, isChecked.booleanValue());
            MainTabActivity.Y1(SettingsActivity.this, true);
            SettingsActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends r {
        public d() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            SettingsActivity.this.f19544a.b(SettingsActivity.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends r {
        public e() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            SettingsActivity.this.f19544a.b(SettingsActivity.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Observer<Void> {
        public f() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SettingsActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Observer<Void> {
        public g() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            AccountActivity.J0(SettingsActivity.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Observer<Void> {
        public h() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SettingsActivity settingsActivity = SettingsActivity.this;
            SingleFragmentActivity.I0(settingsActivity, bf.a.class, null, settingsActivity.getString(R.string.setting_learning_remainder));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements Observer<Void> {
        public i() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SettingsActivity settingsActivity = SettingsActivity.this;
            SingleFragmentActivity.I0(settingsActivity, cf.e.class, null, settingsActivity.getString(R.string.setting_learning_setting));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements Observer<Void> {
        public j() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SettingsActivity settingsActivity = SettingsActivity.this;
            SingleFragmentActivity.I0(settingsActivity, we.c.class, null, settingsActivity.getString(R.string.setting_daka_mode));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements Observer<Void> {
        public k() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SingleFragmentActivity.I0(SettingsActivity.this, ue.l.class, null, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements Observer<Void> {
        public l() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SettingsActivity settingsActivity = SettingsActivity.this;
            SingleFragmentActivity.J0(settingsActivity, ye.a.class, null, settingsActivity.getString(R.string.setting_cache_mgr), false, false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m implements Observer<Boolean> {
        public m() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Boolean aBoolean) {
            if (aBoolean == null || !aBoolean.booleanValue()) {
                SettingsActivity.this.S0();
            } else {
                SettingsActivity.this.e1();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n implements Observer<Void> {
        public n() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SettingsActivity.this.c1();
        }
    }

    private void T0() {
        this.f19544a.f19579p.observe(this, new f());
        this.f19544a.f19572i.observe(this, new Observer() { // from class: te.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingsActivity.this.V0((Void) obj);
            }
        });
        this.f19544a.f19573j.observe(this, new Observer() { // from class: te.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingsActivity.this.W0((Void) obj);
            }
        });
        this.f19544a.f19568e.observe(this, new g());
        this.f19544a.f19569f.observe(this, new h());
        this.f19544a.f19570g.observe(this, new i());
        this.f19544a.f19571h.observe(this, new j());
        this.f19544a.f19577n.observe(this, new k());
        this.f19544a.f19574k.observe(this, new l());
        this.f19544a.f19575l.observe(this, new Observer() { // from class: te.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingsActivity.this.X0((Void) obj);
            }
        });
        this.f19544a.f19576m.observe(this, new Observer() { // from class: te.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SettingsActivity.this.Y0((Void) obj);
            }
        });
        this.f19544a.f19582s.observe(this, new m());
        this.f19544a.f19581r.observe(this, new n());
        this.f19544a.f19580q.observe(this, new a());
        this.f19544a.f19583t.observe(this, new b());
        this.f19544a.f19585v.observe(this, new c());
        this.f19545b.getRoot().post(new Runnable() { // from class: te.g
            @Override // java.lang.Runnable
            public final void run() {
                SettingsActivity.this.Z0();
            }
        });
    }

    private void U0() {
        this.f19544a = (com.baicizhan.main.activity.setting.a) new ViewModelProvider(this).get(com.baicizhan.main.activity.setting.a.class);
    }

    private void b1() {
        d2 d2Var = (d2) DataBindingUtil.setContentView(this, R.layout.activity_settings_v2);
        this.f19545b = d2Var;
        d2Var.setLifecycleOwner(this);
        this.f19545b.j(this.f19544a);
    }

    public static void f1(Context context) {
        ed.a.f49644a.c();
        context.startActivity(new Intent(context, (Class<?>) SettingsActivity.class));
        ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    public void S0() {
        va.f fVar = this.f19548e;
        if (fVar == null) {
            return;
        }
        fVar.hide();
    }

    public final /* synthetic */ void V0(Void r32) {
        SingleFragmentActivity.I0(this, df.a.class, null, getString(R.string.setting_ui_setting));
    }

    public final /* synthetic */ void W0(Void r32) {
        SingleFragmentActivity.I0(this, ze.r.class, null, getString(R.string.setting_ui_private));
        ma.l.a(t.f73012k, ma.a.D3);
    }

    public final /* synthetic */ void X0(Void r22) {
        BczWebExecutorKt.startNormalWeb(this, getString(R.string.url_personal_info_collections));
        ma.l.a(t.f73012k, ma.a.B3);
    }

    public final /* synthetic */ void Y0(Void r22) {
        BczWebExecutorKt.startNormalWeb(this, getString(R.string.url_third_party_info));
        ma.l.a(t.f73012k, ma.a.C3);
    }

    public final /* synthetic */ void Z0() {
        this.f19547d = false;
    }

    public void a1(@NonNull UserRecord userRecord) {
        if (this.f19546c) {
            Intent intent = new Intent();
            intent.putExtra("loggedOutUser", userRecord);
            setResult(-1, intent);
        } else {
            IntroductionPageActivity.x1(this, userRecord);
        }
        finish();
        ActivityLifeController.get().finishAll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c1() {
        mc.a.n(this, ((u) new u.a(this).L(R.string.tip).U(R.string.user_center_logout_message).d()).f0(new e()), "logout_prompt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d1() {
        mc.a.n(this, ((u) ((u.a) new u.a(this).L(R.string.user_center_serious_tip).U(R.string.user_center_serious_message).C(R.string.user_center_i_know)).d()).f0(new d()), "logout_sync_prompt");
    }

    public void e1() {
        if (this.f19548e == null) {
            va.f c11 = gi.e.c(this);
            this.f19548e = c11;
            c11.setCancelable(false);
        }
        this.f19548e.show();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mClosedFit = true;
        this.f19546c = q0.f21394a.b();
        U0();
        b1();
        T0();
        this.f19544a.start();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
