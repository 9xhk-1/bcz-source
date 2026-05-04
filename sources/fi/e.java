package fi;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.DeviceUtil;
import com.huawei.hms.jos.JosApps;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f51879a = new e();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f51880b = "HwUpgradeManager";

    /* renamed from: c, reason: collision with root package name */
    public static final int f51881c = 0;

    public final void a(@k Context context, @k l<? super Boolean, g2> callback) {
        g0.p(context, "context");
        g0.p(callback, "callback");
        qb.c.b(f51880b, "check Hw update", new Object[0]);
        if (DeviceUtil.isHuawei()) {
            JosApps.getAppUpdateClient(context).checkAppUpdate(context, new a(context, callback));
        } else {
            callback.invoke(Boolean.FALSE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHwUpgradeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HwUpgradeManager.kt\ncom/baicizhan/main/upgrade/HwUpgradeManager$HwCallback\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,71:1\n35#2:72\n*S KotlinDebug\n*F\n+ 1 HwUpgradeManager.kt\ncom/baicizhan/main/upgrade/HwUpgradeManager$HwCallback\n*L\n38#1:72\n*E\n"})
    public static final class a implements CheckUpdateCallBack {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final l<Boolean, g2> f51882a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WeakReference<Context> f51883b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k Context context, @k l<? super Boolean, g2> callback) {
            g0.p(context, "context");
            g0.p(callback, "callback");
            this.f51882a = callback;
            this.f51883b = new WeakReference<>(context);
        }

        @k
        public final l<Boolean, g2> a() {
            return this.f51882a;
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(@k Intent intent) {
            g0.p(intent, "intent");
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(@m80.l Intent intent) {
            g2 g2Var;
            if (intent != null) {
                qb.c.i(e.f51880b, "check update status is:" + intent.getIntExtra("status", -99), new Object[0]);
                qb.c.i(e.f51880b, "rtnCode = " + intent.getIntExtra(UpdateKey.FAIL_CODE, -99) + "rtnMessage = " + intent.getStringExtra(UpdateKey.FAIL_REASON), new Object[0]);
                Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
                if (serializableExtra instanceof ApkUpgradeInfo) {
                    Context context = this.f51883b.get();
                    if (context != null) {
                        qb.c.i(e.f51880b, "check update success and there is a new update", new Object[0]);
                        JosApps.getAppUpdateClient(context).showUpdateDialog(context, (ApkUpgradeInfo) serializableExtra, false);
                        this.f51882a.invoke(Boolean.TRUE);
                    } else {
                        this.f51882a.invoke(Boolean.FALSE);
                    }
                } else {
                    this.f51882a.invoke(Boolean.FALSE);
                }
                g2Var = g2.f100423a;
            } else {
                g2Var = null;
            }
            if (g2Var == null) {
                this.f51882a.invoke(Boolean.FALSE);
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i11) {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i11) {
        }
    }
}
