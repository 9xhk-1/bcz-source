package com.meizu.cloud.pushsdk.handler.a.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f39891a;

    /* renamed from: b, reason: collision with root package name */
    private List<Intent> f39892b;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f39893c;

    public a(Context context) {
        this.f39891a = context.getApplicationContext();
        b();
    }

    private void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushConsts.ACTION_BROADCAST_USER_PRESENT);
        if (this.f39893c == null) {
            this.f39893c = new BroadcastReceiver() { // from class: com.meizu.cloud.pushsdk.handler.a.f.a.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if (PushConsts.ACTION_BROADCAST_USER_PRESENT.equalsIgnoreCase(intent.getAction())) {
                        a.this.a();
                    }
                }
            };
        }
        this.f39891a.registerReceiver(this.f39893c, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        List<Intent> list = this.f39892b;
        if (list == null || list.size() == 0) {
            return;
        }
        int size = this.f39892b.size();
        Iterator<Intent> it = this.f39892b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Intent next = it.next();
            if (i11 != size - 1) {
                b(next);
            }
            a(next);
            it.remove();
            i11++;
        }
    }

    private void b(Intent intent) {
        MessageV3 messageV3 = (MessageV3) intent.getParcelableExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE);
        if (messageV3 == null) {
            return;
        }
        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
        if (advanceSetting == null || advanceSettingEx == null) {
            return;
        }
        advanceSettingEx.setSoundTitle(null);
        advanceSetting.getNotifyType().setSound(false);
        advanceSetting.getNotifyType().setLights(false);
        advanceSetting.getNotifyType().setVibrate(false);
    }

    private void a(final Intent intent) {
        com.meizu.cloud.pushsdk.b.c.c.a().execute(new Runnable() { // from class: com.meizu.cloud.pushsdk.handler.a.f.a.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(1000L);
                    DebugLogger.d("BrightNotification", "start bright notification service " + intent);
                    a.this.f39891a.startService(intent);
                } catch (Exception e11) {
                    DebugLogger.e("BrightNotification", "send bright notification error " + e11.getMessage());
                }
            }
        });
    }

    public void a(Intent intent, String str) {
        if (intent == null || TextUtils.isEmpty(str)) {
            return;
        }
        List<Intent> list = this.f39892b;
        if (list != null) {
            Iterator<Intent> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent next = it.next();
                MessageV3 messageV3 = (MessageV3) next.getParcelableExtra(PushConstants.EXTRA_APP_PUSH_BRIGHT_NOTIFICATION_MESSAGE);
                if (messageV3 != null && messageV3.getUploadDataPackageName() != null && str.equalsIgnoreCase(messageV3.getUploadDataPackageName())) {
                    this.f39892b.remove(next);
                    break;
                }
            }
        } else {
            this.f39892b = new ArrayList();
        }
        this.f39892b.add(intent);
        DebugLogger.d("BrightNotification", "add bright notification intent, intent list: " + this.f39892b);
    }
}
