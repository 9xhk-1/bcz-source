package com.huawei.updatesdk.service.otaupdate;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.hms.update.UpdateConstants;
import com.huawei.updatesdk.b.i.a;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.c;
import java.io.Serializable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AppUpdateActivity extends Activity implements com.huawei.updatesdk.service.otaupdate.b, com.huawei.updatesdk.b.f.b {

    /* renamed from: a, reason: collision with root package name */
    private String f36938a;

    /* renamed from: b, reason: collision with root package name */
    private AlertDialog f36939b;

    /* renamed from: c, reason: collision with root package name */
    private com.huawei.updatesdk.b.i.a f36940c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.updatesdk.b.i.a f36941d;

    /* renamed from: e, reason: collision with root package name */
    private ProgressBar f36942e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f36943f;

    /* renamed from: l, reason: collision with root package name */
    private com.huawei.updatesdk.b.d.c f36949l;

    /* renamed from: p, reason: collision with root package name */
    private q f36953p;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36944g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36945h = false;

    /* renamed from: i, reason: collision with root package name */
    private ApkUpgradeInfo f36946i = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f36947j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36948k = false;

    /* renamed from: m, reason: collision with root package name */
    private int f36950m = -99;

    /* renamed from: n, reason: collision with root package name */
    private int f36951n = -99;

    /* renamed from: o, reason: collision with root package name */
    private int f36952o = -99;

    /* renamed from: q, reason: collision with root package name */
    private boolean f36954q = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.e {
        public a() {
        }

        @Override // com.huawei.updatesdk.b.i.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements DialogInterface.OnKeyListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
            com.huawei.updatesdk.a.a.a.b("AppUpdateActivity", "onKeyBack");
            if (i11 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            AppUpdateActivity.this.f36950m = 4;
            AppUpdateActivity.this.finish();
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements com.huawei.updatesdk.b.i.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.appmgr.bean.c f36957a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.b.i.a f36958b;

        public c(com.huawei.updatesdk.service.appmgr.bean.c cVar, com.huawei.updatesdk.b.i.a aVar) {
            this.f36957a = cVar;
            this.f36958b = aVar;
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            AppUpdateActivity.this.d(this.f36957a);
            this.f36958b.a();
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            this.f36958b.a();
            if (AppUpdateActivity.this.f36947j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.f36946i);
            } else {
                AppUpdateActivity.this.f36950m = 4;
                AppUpdateActivity.this.finish();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements a.e {
        public d() {
        }

        @Override // com.huawei.updatesdk.b.i.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppUpdateActivity.this.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f36962a;

        public f(boolean z11) {
            this.f36962a = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36962a) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.b(appUpdateActivity.f36946i);
            } else {
                AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                appUpdateActivity2.c(appUpdateActivity2.f36946i);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.a.b.b.b f36964a;

        public g(com.huawei.updatesdk.a.b.b.b bVar) {
            this.f36964a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bundle b11 = this.f36964a.b();
            if (b11 == null) {
                return;
            }
            int i11 = b11.getInt("INSTALL_STATE");
            com.huawei.updatesdk.service.otaupdate.d.a().a(AppUpdateActivity.this.a(i11, b11.getInt("INSTALL_TYPE"), -1));
            AppUpdateActivity.this.c(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements com.huawei.updatesdk.b.i.b {
        public h() {
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            AppUpdateActivity.this.f36942e.setProgress(0);
            AppUpdateActivity.this.f36942e.setMax(0);
            AppUpdateActivity.this.f36943f.setText("");
            AppUpdateActivity.this.a();
            if (AppUpdateActivity.this.f36949l != null) {
                AppUpdateActivity.this.f36949l.a();
            }
            AppUpdateActivity.this.f36940c.a();
            if (AppUpdateActivity.this.f36947j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.f36946i);
            } else {
                AppUpdateActivity.this.f36950m = 4;
                AppUpdateActivity.this.finish();
            }
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            AppUpdateActivity.this.f36940c.a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements a.e {
        public i() {
        }

        @Override // com.huawei.updatesdk.b.i.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AppUpdateActivity.this.e();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements com.huawei.updatesdk.b.i.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.service.appmgr.bean.c f36969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.updatesdk.b.i.a f36970b;

        public k(com.huawei.updatesdk.service.appmgr.bean.c cVar, com.huawei.updatesdk.b.i.a aVar) {
            this.f36969a = cVar;
            this.f36970b = aVar;
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            if (!com.huawei.updatesdk.a.a.d.j.a.d(AppUpdateActivity.this)) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                Toast.makeText(appUpdateActivity, com.huawei.updatesdk.b.h.c.c(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
                AppUpdateActivity.this.finish();
            } else if (com.huawei.updatesdk.a.a.d.j.a.c(AppUpdateActivity.this) != 1) {
                AppUpdateActivity.this.c(this.f36969a);
            } else {
                AppUpdateActivity.this.d(this.f36969a);
                this.f36970b.a();
            }
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            this.f36970b.a();
            if (AppUpdateActivity.this.f36947j) {
                AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                appUpdateActivity.c(appUpdateActivity.f36946i);
            } else {
                AppUpdateActivity.this.f36950m = 4;
                AppUpdateActivity.this.finish();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements a.e {
        public l() {
        }

        @Override // com.huawei.updatesdk.b.i.a.e
        public void a() {
            AppUpdateActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m implements com.huawei.updatesdk.b.i.b {
        public m() {
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void a() {
            com.huawei.updatesdk.a.a.a.b("AppUpdateActivity", "performConfirm");
            AppUpdateActivity.this.f36952o = 101;
            if (com.huawei.updatesdk.a.a.d.j.a.d(AppUpdateActivity.this)) {
                AppUpdateActivity.this.g();
                return;
            }
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            Toast.makeText(appUpdateActivity, com.huawei.updatesdk.b.h.c.c(appUpdateActivity, "upsdk_no_available_network_prompt_toast"), 0).show();
            AppUpdateActivity.this.f36950m = 2;
            AppUpdateActivity.this.finish();
        }

        @Override // com.huawei.updatesdk.b.i.b
        public void b() {
            com.huawei.updatesdk.a.a.a.b("AppUpdateActivity", "performCancel");
            AppUpdateActivity.this.f36941d.a();
            AppUpdateActivity.this.f36950m = 4;
            AppUpdateActivity.this.f36952o = 100;
            if (AppUpdateActivity.this.f36947j) {
                AppUpdateActivity.this.finish();
                return;
            }
            com.huawei.updatesdk.service.otaupdate.c cVar = new com.huawei.updatesdk.service.otaupdate.c();
            AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
            cVar.a(appUpdateActivity, appUpdateActivity.f36938a, AppUpdateActivity.this.new n(), AppUpdateActivity.this.f36954q);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n implements c.a {
        public n() {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.c.a
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                try {
                    Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateRemindAction");
                    intent.setPackage(AppUpdateActivity.this.f36938a);
                    AppUpdateActivity.this.startActivity(intent);
                } catch (ActivityNotFoundException e11) {
                    com.huawei.updatesdk.a.a.c.a.a.a.b("AppUpdateActivity", "goHiappUpgrade error: " + e11.getMessage());
                }
            }
            AppUpdateActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o implements DialogInterface.OnDismissListener {
        private o() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, 10001);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        }

        public /* synthetic */ o(e eVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p implements DialogInterface.OnShowListener {
        private p() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Intent intent = new Intent();
            intent.putExtra(UpdateKey.DIALOG_STATUS, 10002);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        }

        public /* synthetic */ p(e eVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class q extends com.huawei.updatesdk.a.b.b.a {
        private q() {
        }

        @Override // com.huawei.updatesdk.a.b.b.a
        public void a(Context context, com.huawei.updatesdk.a.b.b.b bVar) {
            if (bVar.d()) {
                if (AppUpdateActivity.this.f36940c != null) {
                    AppUpdateActivity.this.f36940c.a();
                }
                AppUpdateActivity.this.a();
                String a11 = bVar.a();
                String dataString = bVar.c().getDataString();
                if (dataString == null || dataString.length() < 9) {
                    return;
                }
                String substring = dataString.substring(8);
                if ("android.intent.action.PACKAGE_ADDED".equals(a11) && TextUtils.equals(AppUpdateActivity.this.f36938a, substring)) {
                    com.huawei.updatesdk.service.otaupdate.d.a().a(AppUpdateActivity.this.a(6, 0, -1));
                    com.huawei.updatesdk.b.h.b.a();
                    AppUpdateActivity appUpdateActivity = AppUpdateActivity.this;
                    appUpdateActivity.a(appUpdateActivity.f36946i.getPackage_(), AppUpdateActivity.this.f36946i.getDetailId_());
                    if (AppUpdateActivity.this.f36947j) {
                        AppUpdateActivity appUpdateActivity2 = AppUpdateActivity.this;
                        appUpdateActivity2.c(appUpdateActivity2.f36946i);
                    }
                }
            }
        }

        public /* synthetic */ q(AppUpdateActivity appUpdateActivity, e eVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class r implements DialogInterface.OnKeyListener {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<AppUpdateActivity> f36976a;

        /* renamed from: b, reason: collision with root package name */
        private final com.huawei.updatesdk.b.i.a f36977b;

        public r(AppUpdateActivity appUpdateActivity, com.huawei.updatesdk.b.i.a aVar) {
            this.f36976a = new WeakReference<>(appUpdateActivity);
            this.f36977b = aVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
            AppUpdateActivity appUpdateActivity = this.f36976a.get();
            if (appUpdateActivity == null || i11 != 4 || keyEvent.getAction() != 0) {
                return false;
            }
            com.huawei.updatesdk.a.a.a.b("AppUpdateActivity", "press back");
            if (appUpdateActivity.f36947j) {
                this.f36977b.a();
                appUpdateActivity.c(appUpdateActivity.f36946i);
                return true;
            }
            appUpdateActivity.f36950m = 4;
            appUpdateActivity.finish();
            return true;
        }
    }

    private void d() {
        com.huawei.updatesdk.b.i.a aVar = this.f36941d;
        if (aVar != null) {
            e eVar = null;
            aVar.a(new o(eVar));
            this.f36941d.a(new p(eVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        com.huawei.updatesdk.b.i.a a11 = com.huawei.updatesdk.b.i.a.a(this, null, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_cancel_download_prompt_ex")));
        this.f36940c = a11;
        a11.a(new h());
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_sure_cancel_download"));
        this.f36940c.a(new i());
        this.f36940c.a(-1, string);
    }

    private void f() {
        com.huawei.updatesdk.service.otaupdate.a.a(this, this.f36953p);
        com.huawei.updatesdk.b.f.c.a().b(this);
        com.huawei.updatesdk.b.d.c cVar = this.f36949l;
        if (cVar != null) {
            cVar.b();
        }
        com.huawei.updatesdk.b.d.f.a((com.huawei.updatesdk.service.otaupdate.b) null);
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f36944g) {
            overridePendingTransition(0, 0);
        }
        Intent intent = new Intent();
        intent.putExtra("status", this.f36950m);
        intent.putExtra(UpdateKey.FAIL_CODE, this.f36951n);
        intent.putExtra(UpdateKey.MUST_UPDATE, this.f36944g);
        intent.putExtra(UpdateKey.BUTTON_STATUS, this.f36952o);
        com.huawei.updatesdk.service.otaupdate.d.a().b(intent);
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        com.huawei.updatesdk.a.a.a.b("AppUpdateActivity", "get from market requestCode: " + i11 + ", resultCode: " + i12);
        if (i11 == 1002) {
            if (intent != null) {
                this.f36950m = i12;
                a(intent);
            }
            this.f36952o = i12 == 4 ? 100 : 101;
            if (this.f36945h) {
                return;
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        requestWindowFeature(1);
        com.huawei.updatesdk.a.a.d.i.c.f().a(getWindow());
        super.onCreate(bundle);
        Bundle b11 = com.huawei.updatesdk.a.b.b.b.a(getIntent()).b();
        com.huawei.updatesdk.a.b.a.a.a(this);
        if (b11 != null) {
            try {
                serializable = b11.getSerializable("app_update_parm");
                this.f36954q = b11.getBoolean("is_apptouch", false);
                this.f36948k = b11.getBoolean("app_must_btn", false);
            } catch (Throwable th2) {
                com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "Type Conversion Error: " + th2.getMessage());
                super.finish();
                return;
            }
        } else {
            serializable = null;
        }
        String b12 = com.huawei.updatesdk.b.e.e.a(this.f36954q).b();
        this.f36938a = b12;
        if (TextUtils.isEmpty(b12)) {
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "finish activity and appStorePkgName is: " + this.f36938a);
            super.finish();
            return;
        }
        if (!(serializable instanceof ApkUpgradeInfo)) {
            this.f36950m = 3;
            finish();
            return;
        }
        ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializable;
        this.f36946i = apkUpgradeInfo;
        if (apkUpgradeInfo.getIsCompulsoryUpdate_() == 1) {
            this.f36947j = true;
        }
        if (1 == this.f36946i.getDevType_() && com.huawei.updatesdk.b.h.b.f(this, this.f36938a)) {
            b(this.f36946i);
        } else if (2 == this.f36946i.getDevType_() && com.huawei.updatesdk.b.h.b.e(this, this.f36938a)) {
            com.huawei.updatesdk.b.g.c.f36911b.execute(new e());
        } else {
            c(this.f36946i);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.huawei.updatesdk.b.i.a aVar = this.f36940c;
        if (aVar != null) {
            aVar.a();
            this.f36940c = null;
        }
        com.huawei.updatesdk.b.i.a aVar2 = this.f36941d;
        if (aVar2 != null) {
            aVar2.a();
            this.f36941d = null;
        }
        a();
        f();
        super.onDestroy();
        finishActivity(1002);
    }

    private long a(ApkUpgradeInfo apkUpgradeInfo) {
        long longSize_ = apkUpgradeInfo.getLongSize_();
        if (apkUpgradeInfo.getPackingType_() == 1 && apkUpgradeInfo.getBundleSize_() > 0) {
            return apkUpgradeInfo.getBundleSize_();
        }
        if (apkUpgradeInfo.getPackingType_() == 3 && apkUpgradeInfo.getObbSize_() > 0) {
            longSize_ += apkUpgradeInfo.getObbSize_();
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            return longSize_;
        }
        long diffSize_ = apkUpgradeInfo.getDiffSize_();
        return (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? diffSize_ : diffSize_ + apkUpgradeInfo.getObbSize_();
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q qVar = new q(this, null);
        this.f36953p = qVar;
        com.huawei.updatesdk.service.otaupdate.a.a(this, intentFilter, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        c();
        b(cVar.a());
        com.huawei.updatesdk.b.d.b bVar = new com.huawei.updatesdk.b.d.b(cVar.b(), cVar.c(), cVar.e());
        bVar.a(cVar.d());
        com.huawei.updatesdk.b.d.c cVar2 = new com.huawei.updatesdk.b.d.c(bVar);
        this.f36949l = cVar2;
        cVar2.executeOnExecutor(com.huawei.updatesdk.b.g.c.f36910a, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (com.huawei.updatesdk.b.h.b.d(this, this.f36938a)) {
            a(this.f36946i.getPackage_(), this.f36946i.getDetailId_());
            return;
        }
        com.huawei.updatesdk.b.d.f.a(this);
        com.huawei.updatesdk.b.d.f.a(this.f36954q);
        this.f36941d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Intent a(int i11, int i12, int i13) {
        Intent intent = new Intent();
        intent.putExtra(UpdateKey.MARKET_DLD_STATUS, i13);
        intent.putExtra(UpdateKey.MARKET_INSTALL_STATE, i11);
        intent.putExtra(UpdateKey.MARKET_INSTALL_TYPE, i12);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        runOnUiThread(new f(com.huawei.updatesdk.b.h.b.a(this.f36938a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i11) {
        if (i11 == 5 || i11 == 4) {
            Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_install_failed")), 0).show();
            com.huawei.updatesdk.b.h.b.a();
            finish();
        }
        if (i11 == 7) {
            com.huawei.updatesdk.b.h.b.a();
            if (this.f36944g) {
                c(this.f36946i);
            } else {
                finish();
            }
        }
    }

    private void c(com.huawei.updatesdk.a.b.b.b bVar) {
        new Handler(Looper.getMainLooper()).post(new g(bVar));
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void b(int i11) {
        Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        com.huawei.updatesdk.service.otaupdate.d.a().a(i11);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            AlertDialog alertDialog = this.f36939b;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.f36939b.dismiss();
            this.f36939b = null;
        } catch (IllegalArgumentException unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("AppUpdateActivity", "progressDialog dismiss IllegalArgumentException");
        }
    }

    private void b(com.huawei.updatesdk.a.b.b.b bVar) {
        if (this.f36942e == null) {
            return;
        }
        this.f36942e.setProgress(com.huawei.updatesdk.b.h.d.a(bVar.b("download_apk_already", 0), bVar.b("download_apk_size", 0)));
        this.f36943f.setText(com.huawei.updatesdk.b.h.d.a((int) ((this.f36942e.getProgress() / this.f36942e.getMax()) * 100.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ApkUpgradeInfo apkUpgradeInfo) {
        com.huawei.updatesdk.a.a.a.b("AppUpdateActivity", "showOtaDialog");
        if (apkUpgradeInfo == null) {
            finish();
            return;
        }
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_title"));
        String string2 = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_notify_updatebtn"));
        String string3 = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_cancel"));
        if (!a(string)) {
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "UpdateSDK show update dialog error and resource is proguard, please add ignore proguard rules!");
            finish();
            return;
        }
        if (1 == apkUpgradeInfo.getIsCompulsoryUpdate_()) {
            string3 = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_ota_force_cancel_new"));
            if (this.f36948k) {
                this.f36941d.c();
            }
            this.f36944g = true;
        }
        this.f36941d.a(new m());
        d();
        this.f36941d.a(new a());
        if (this.f36944g) {
            this.f36941d.a(false);
        } else {
            this.f36941d.a(new b());
        }
        this.f36941d.a(-1, string2);
        this.f36941d.a(-2, string3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ApkUpgradeInfo apkUpgradeInfo) {
        Intent intent = new Intent(UpdateConstants.ACTION_NAME_HIAPP_SILENT_DOWNLOAD);
        intent.setPackage(this.f36938a);
        intent.putExtra("APP_PACKAGENAME", apkUpgradeInfo.getPackage_());
        intent.putExtra("devType", apkUpgradeInfo.getDevType_());
        intent.putExtra("version", apkUpgradeInfo.getVersion_());
        intent.putExtra("longSize", apkUpgradeInfo.getLongSize_());
        intent.putExtra("newFeature", apkUpgradeInfo.getNewFeatures_());
        intent.putExtra("IsCompulsoryUpdate", apkUpgradeInfo.getIsCompulsoryUpdate_());
        intent.putExtra("APP_MUST_UPDATE_BTN", this.f36948k);
        intent.putExtra("VersionCode", apkUpgradeInfo.getVersionCode_());
        intent.putExtra("detailId", apkUpgradeInfo.getDetailId_());
        intent.putExtra("name", apkUpgradeInfo.getName_());
        try {
            this.f36945h = false;
            startActivityForResult(intent, 1002);
        } catch (ActivityNotFoundException unused) {
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "goHiappUpgrade error: ActivityNotFoundException");
            this.f36945h = true;
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent2);
            c(apkUpgradeInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        com.huawei.updatesdk.b.i.a a11 = com.huawei.updatesdk.b.i.a.a(this, null, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_mobile_dld_warn"), com.huawei.updatesdk.b.h.d.a(this, cVar.c())));
        a11.a(new c(cVar, a11));
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_app_download_info_new"));
        a11.a(new d());
        a11.a(-1, string);
        a11.a(new r(this, a11));
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(int i11) {
        Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
        com.huawei.updatesdk.service.otaupdate.d.a().a(i11);
        finish();
    }

    private void b(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        com.huawei.updatesdk.b.i.a a11 = com.huawei.updatesdk.b.i.a.a(this, null, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_appstore_install"), cVar.a()));
        a11.a(new k(cVar, a11));
        String string = getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_app_download_info_new"));
        a11.a(new l());
        a11.a(-1, string);
        a11.a(new r(this, a11));
    }

    @Override // com.huawei.updatesdk.b.f.b
    public void a(int i11, com.huawei.updatesdk.a.b.b.b bVar) {
        if (bVar == null) {
            return;
        }
        if (i11 == 0) {
            a(bVar);
        } else if (1 == i11) {
            b(bVar);
        } else {
            c(bVar);
        }
    }

    private void a(Intent intent) {
        try {
            com.huawei.updatesdk.a.b.b.b a11 = com.huawei.updatesdk.a.b.b.b.a(intent);
            this.f36951n = a11.a("installResultCode", -99);
            this.f36944g = a11.a(UpdateKey.MUST_UPDATE, false);
        } catch (Throwable th2) {
            this.f36951n = -99;
            this.f36944g = false;
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "get result error, e: " + th2.getMessage());
        }
    }

    private void a(View view) {
        if (com.huawei.updatesdk.a.a.d.i.c.l()) {
            try {
                ScrollView scrollView = (ScrollView) view.findViewById(com.huawei.updatesdk.b.h.c.a(this, "scroll_layout"));
                TypedValue typedValue = new TypedValue();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getTheme().resolveAttribute(R.attr.dialogPreferredPadding, typedValue, true);
                ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics);
                scrollView.setPadding(complexToDimensionPixelSize, 0, complexToDimensionPixelSize, 0);
            } catch (Exception e11) {
                com.huawei.updatesdk.a.a.c.a.a.a.b("AppUpdateActivity", e11.toString());
            }
        }
    }

    private void a(com.huawei.updatesdk.a.b.b.b bVar) {
        Bundle b11 = bVar.b();
        if (b11 != null) {
            int i11 = b11.getInt("download_status_param", -1);
            com.huawei.updatesdk.service.otaupdate.d.a().a(a(-1, -1, i11));
            if (com.huawei.updatesdk.b.d.a.a(i11)) {
                return;
            }
            a();
            if (com.huawei.updatesdk.b.d.a.b(i11)) {
                Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_third_app_dl_install_failed")), 0).show();
                finish();
            }
        }
    }

    private void b(String str) {
        AlertDialog alertDialog = this.f36939b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            this.f36939b = (com.huawei.updatesdk.a.a.d.i.c.l() ? new AlertDialog.Builder(this) : ((getResources().getConfiguration().uiMode & 48) != 32 || Build.VERSION.SDK_INT < 29) ? new AlertDialog.Builder(this, R.style.Theme.DeviceDefault.Light.Dialog.Alert) : new AlertDialog.Builder(this, R.style.Theme.DeviceDefault.Dialog.Alert)).create();
            com.huawei.updatesdk.a.a.d.i.c.f().a(this.f36939b.getWindow());
            View inflate = LayoutInflater.from(this).inflate(com.huawei.updatesdk.b.h.c.b(this, "upsdk_app_dl_progress_dialog"), (ViewGroup) null);
            ((TextView) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "third_app_warn_text"))).setText(getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_app_download_installing"), str));
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "third_app_dl_progressbar"));
            this.f36942e = progressBar;
            progressBar.setMax(100);
            this.f36943f = (TextView) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "third_app_dl_progress_text"));
            inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "cancel_bg")).setOnClickListener(new j());
            this.f36939b.setView(inflate);
            this.f36939b.setCancelable(false);
            this.f36939b.setCanceledOnTouchOutside(false);
            if (!com.huawei.updatesdk.service.otaupdate.a.a(this)) {
                this.f36939b.show();
            }
            this.f36943f.setText(com.huawei.updatesdk.b.h.d.a(0));
        }
    }

    private void a(ApkUpgradeInfo apkUpgradeInfo, TextView textView) {
        if (textView == null) {
            return;
        }
        if (apkUpgradeInfo.getDiffSize_() <= 0) {
            textView.setVisibility(8);
            return;
        }
        String a11 = com.huawei.updatesdk.b.h.d.a(this, (apkUpgradeInfo.getPackingType_() != 3 || apkUpgradeInfo.getObbSize_() <= 0) ? apkUpgradeInfo.getLongSize_() : apkUpgradeInfo.getLongSize_() + apkUpgradeInfo.getObbSize_());
        SpannableString spannableString = new SpannableString(a11);
        spannableString.setSpan(new StrikethroughSpan(), 0, a11.length(), 33);
        spannableString.setSpan(new TextAppearanceSpan(com.huawei.updatesdk.b.h.a.f().b() > 0 ? "HnChinese-medium" : "HwChinese-medium", 0, (int) textView.getTextSize(), null, null), 0, spannableString.length(), 33);
        textView.setText(spannableString);
    }

    @Override // com.huawei.updatesdk.service.otaupdate.b
    public void a(com.huawei.updatesdk.service.appmgr.bean.c cVar) {
        if (cVar == null || !cVar.f()) {
            Toast.makeText(this, getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_getting_message_fail_prompt_toast")), 0).show();
            finish();
        } else {
            com.huawei.updatesdk.b.f.c.a().a(this);
            this.f36938a = cVar.d();
            b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.f36950m = 1;
            finish();
            return;
        }
        Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
        intent.setPackage(this.f36938a);
        intent.putExtra("appDetailId", str2);
        intent.putExtra("thirdId", str);
        intent.addFlags(268468224);
        try {
            startActivity(intent);
            if (this.f36947j) {
                return;
            }
            finish();
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.a.a("AppUpdateActivity", "openMarketUpdateDetail error: " + e11.getMessage());
            com.huawei.updatesdk.b.d.f.a(this);
            com.huawei.updatesdk.b.d.f.a(this.f36954q);
            Intent intent2 = new Intent();
            intent2.putExtra("status", 8);
            com.huawei.updatesdk.service.otaupdate.d.a().b(intent2);
            com.huawei.updatesdk.b.i.a aVar = this.f36941d;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    private boolean a(String str) {
        TextView textView;
        View inflate = LayoutInflater.from(this).inflate(com.huawei.updatesdk.b.h.c.b(this, "upsdk_ota_update_view"), (ViewGroup) null);
        String string = TextUtils.isEmpty(this.f36946i.getNewFeatures_()) ? getString(com.huawei.updatesdk.b.h.c.c(this, "upsdk_choice_update")) : this.f36946i.getNewFeatures_();
        if (inflate == null || (textView = (TextView) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "content_textview"))) == null) {
            return false;
        }
        textView.setText(string);
        String version_ = this.f36946i.getVersion_();
        TextView textView2 = (TextView) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "version_textview"));
        if (textView2 == null) {
            return false;
        }
        textView2.setText(version_);
        com.huawei.updatesdk.b.h.d.a(textView2);
        String a11 = com.huawei.updatesdk.b.h.d.a(this, a(this.f36946i));
        TextView textView3 = (TextView) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "appsize_textview"));
        textView3.setText(a11);
        com.huawei.updatesdk.b.h.d.a(textView3);
        TextView textView4 = (TextView) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "name_textview"));
        textView4.setText(this.f36946i.getName_());
        com.huawei.updatesdk.b.h.d.a(textView4);
        TextView textView5 = (TextView) inflate.findViewById(com.huawei.updatesdk.b.h.c.a(this, "allsize_textview"));
        a(this.f36946i, textView5);
        com.huawei.updatesdk.b.h.d.a(textView5);
        a(inflate);
        com.huawei.updatesdk.b.i.a a12 = com.huawei.updatesdk.b.i.a.a(this, str, null);
        this.f36941d = a12;
        a12.a(inflate);
        return true;
    }
}
