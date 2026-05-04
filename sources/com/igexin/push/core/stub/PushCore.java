package com.igexin.push.core.stub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import com.getui.gtc.api.GtcManager;
import com.igexin.push.GtPushInterface;
import com.igexin.push.core.ServiceManager;
import com.igexin.push.core.d;
import com.igexin.push.core.e;
import com.igexin.push.core.i.a;
import com.igexin.push.core.i.b;
import com.igexin.sdk.IPushCore;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class PushCore implements IPushCore {

    /* renamed from: a, reason: collision with root package name */
    private d f38371a;

    /* renamed from: b, reason: collision with root package name */
    private Map<Activity, a> f38372b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private GtPushInterface.Stub f38373c = new GtPushInterface.Stub() { // from class: com.igexin.push.core.stub.PushCore.1
        @Override // com.igexin.push.GtPushInterface
        public final String getVersion() {
            return "3.3.7.0";
        }

        @Override // com.igexin.push.GtPushInterface
        public final boolean loadSdk(Bundle bundle) {
            try {
                String string = bundle.getString(AdvanceSetting.CLEAR_NOTIFICATION);
                GtcManager.getInstance().loadBundle(ServiceManager.f37612b, bundle);
                if (!TextUtils.isEmpty(string)) {
                    e.f38038o.put(string.substring(string.indexOf("distribution") + 13, string.indexOf("stub") - 1), GtcManager.getInstance().getClassLoader(bundle));
                }
                return true;
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
                return false;
            }
        }
    };

    @Override // com.igexin.sdk.IPushCore
    public void onActivityConfigurationChanged(Activity activity, Configuration configuration) {
        this.f38372b.get(activity);
    }

    @Override // com.igexin.sdk.IPushCore
    public boolean onActivityCreateOptionsMenu(Activity activity, Menu menu) {
        a aVar = this.f38372b.get(activity);
        return aVar != null && aVar.j();
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityDestroy(Activity activity) {
        a aVar = this.f38372b.get(activity);
        if (aVar != null) {
            this.f38372b.remove(activity);
            b.a().a(aVar);
        }
    }

    @Override // com.igexin.sdk.IPushCore
    public boolean onActivityKeyDown(Activity activity, int i11, KeyEvent keyEvent) {
        a aVar = this.f38372b.get(activity);
        return aVar != null && aVar.l();
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityNewIntent(Activity activity, Intent intent) {
        this.f38372b.get(activity);
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityPause(Activity activity) {
        this.f38372b.get(activity);
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityRestart(Activity activity) {
        this.f38372b.get(activity);
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityResume(Activity activity) {
        this.f38372b.get(activity);
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityStart(Activity activity, Intent intent) {
        if (activity == null || intent == null || !intent.hasExtra("activityid")) {
            return;
        }
        a a11 = b.a().a(Long.valueOf(intent.getLongExtra("activityid", 0L)));
        if (a11 == null) {
            activity.finish();
        } else {
            a11.a(activity);
            this.f38372b.put(activity, a11);
        }
    }

    @Override // com.igexin.sdk.IPushCore
    public void onActivityStop(Activity activity) {
        this.f38372b.get(activity);
    }

    @Override // com.igexin.sdk.IPushCore
    public IBinder onServiceBind(Intent intent) {
        return this.f38373c;
    }

    @Override // com.igexin.sdk.IPushCore
    public int onServiceStartCommand(Intent intent, int i11, int i12) {
        if (this.f38371a == null) {
            return 2;
        }
        Message obtain = Message.obtain();
        obtain.what = com.igexin.push.core.b.Q;
        obtain.obj = intent;
        this.f38371a.a(obtain);
        return 2;
    }

    @Override // com.igexin.sdk.IPushCore
    public boolean start(Context context) {
        com.igexin.c.a.c.a.d.a().a("PushCore started");
        d dVar = d.a.f37956a;
        this.f38371a = dVar;
        dVar.a(context);
        return true;
    }

    @Override // com.igexin.sdk.IPushCore
    public void onServiceDestroy() {
    }
}
