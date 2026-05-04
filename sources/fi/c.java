package fi;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.baicizhan.client.business.managers.upgrade.UpgradeManager;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.framework.common.magicdialog.Location;
import com.baicizhan.framework.common.magicdialog.State;
import com.baicizhan.online.bcz_system_api.AppBetaUpdateResult;
import com.jiongji.andriod.card.R;
import kc.r;
import kc.u;
import ma.l;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f51872b = "AppUpdateAgent";

    /* renamed from: a, reason: collision with root package name */
    public final Activity f51873a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends r {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppBetaUpdateResult f51874a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f51875b;

        public a(final AppBetaUpdateResult val$result, final Activity val$activity) {
            this.f51874a = val$result;
            this.f51875b = val$activity;
        }

        @Override // kc.r, kc.q
        public void onDialogNegativeClick(@NonNull View view) {
            l.a("notify-popup", ma.a.J3);
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            AppBetaUpdateResult appBetaUpdateResult = this.f51874a;
            if (appBetaUpdateResult.action_type == 1) {
                BczWebExecutorKt.startNormalWeb(this.f51875b, appBetaUpdateResult.link);
            } else {
                UpgradeManager.m().r(this.f51874a);
                g.i("正在下载新版本百词斩，请稍候...", 0);
            }
            l.a("notify-popup", ma.a.I3);
        }
    }

    public c(Activity activity) {
        this.f51873a = activity;
    }

    public void c() {
        if (UpgradeManager.m().o().booleanValue()) {
            qb.c.d(f51872b, "isDownloading!!", new Object[0]);
        } else {
            UpgradeManager.m().h().u5(new wb0.b() { // from class: fi.a
                @Override // wb0.b
                public final void call(Object obj) {
                    c.this.e((AppBetaUpdateResult) obj);
                }
            }, new wb0.b() { // from class: fi.b
                @Override // wb0.b
                public final void call(Object obj) {
                    qb.c.c(c.f51872b, "", (Throwable) obj);
                }
            });
        }
    }

    public final /* synthetic */ void e(AppBetaUpdateResult appBetaUpdateResult) {
        if (appBetaUpdateResult != null) {
            f(appBetaUpdateResult, this.f51873a, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(final AppBetaUpdateResult result, Activity activity, boolean quiet) {
        UpgradeManager.UpdateType typeOf = UpgradeManager.UpdateType.typeOf(result.type);
        qb.c.b(f51872b, "onCheckNewVersion: " + typeOf, new Object[0]);
        if (typeOf == UpgradeManager.UpdateType.NONE) {
            if (quiet) {
                return;
            }
            g.i("没有可用的更新", 1);
        } else if (typeOf == UpgradeManager.UpdateType.NEW) {
            try {
                if (((AppCompatActivity) activity).getSupportFragmentManager().findFragmentByTag("version") != null) {
                    return;
                }
                ((u) ((u.a) ((u.a) ((u.a) new u.a(activity).S(R.layout.dialog_beta_prompt).X(result.image_index == 1 ? R.drawable.upgrade_dialog_bg2 : R.drawable.upgrade_dialog_bg).N(R.style.bczDialogAnimation).T(Location.BOTTOM).a0(State.FULL).M(activity.getString(R.string.upgrade_title, result.getNew_version())).V(result.getVersion_description()).K(R.style.BetaPromptStyle)).F(activity.getString(R.string.upgrade_confirm_button))).f(false)).d()).f0(new a(result, activity)).show(((AppCompatActivity) activity).getSupportFragmentManager(), "version");
                l.a("notify-popup", ma.a.H3);
            } catch (Exception e11) {
                qb.c.c(f51872b, "", e11);
            }
        }
    }

    public void d() {
    }
}
