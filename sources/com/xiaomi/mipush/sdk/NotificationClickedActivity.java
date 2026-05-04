package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes6.dex */
public final class NotificationClickedActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f45169a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f75a;

    private void a(Intent intent) {
        if (intent != null) {
            try {
                Intent intent2 = (Intent) intent.getParcelableExtra("mipush_serviceIntent");
                if (intent2 != null) {
                    intent2.setComponent(new ComponentName(getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
                    intent2.putExtra("is_clicked_activity_call", true);
                    com.xiaomi.channel.commonutils.logger.b.b("clicked activity start service.");
                    startService(intent2);
                }
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.gravity = 8388659;
        window.setAttributes(attributes);
        Handler handler = new Handler();
        this.f75a = handler;
        handler.postDelayed(new ac(this), 3000L);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_clicked_activity_finish");
        ad adVar = new ad(this);
        this.f45169a = adVar;
        try {
            registerReceiver(adVar, intentFilter, d.a(this), null);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f75a.removeCallbacksAndMessages(null);
        try {
            unregisterReceiver(this.f45169a);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        a(getIntent());
    }
}
