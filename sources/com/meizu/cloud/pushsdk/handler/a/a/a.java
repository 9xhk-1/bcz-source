package com.meizu.cloud.pushsdk.handler.a.a;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.huawei.hms.iap.entity.OrderStatusCode;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f39841a;

    /* renamed from: b, reason: collision with root package name */
    private com.meizu.cloud.pushsdk.b.a.a f39842b;

    /* renamed from: c, reason: collision with root package name */
    private int f39843c;

    /* renamed from: d, reason: collision with root package name */
    private Notification f39844d;

    public a(Context context) {
        this.f39841a = context;
    }

    private void b() {
        this.f39843c = 0;
        this.f39844d = null;
        com.meizu.cloud.pushsdk.b.a.a aVar = this.f39842b;
        try {
            if (aVar != null) {
                aVar.b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        } finally {
            this.f39842b = null;
        }
    }

    public void a() {
        if (this.f39843c <= 0 || this.f39844d == null) {
            return;
        }
        try {
            ((NotificationManager) this.f39841a.getSystemService("notification")).notify(this.f39843c, this.f39844d);
            DebugLogger.d("AdNotification", "again show old ad notification, notifyId:" + this.f39843c);
        } catch (Exception e11) {
            e11.printStackTrace();
            DebugLogger.e("AdNotification", "again show old ad notification error:" + e11.getMessage());
        }
        b();
    }

    private void b(int i11) {
        if (i11 <= 0) {
            return;
        }
        com.meizu.cloud.pushsdk.b.a.a aVar = this.f39842b;
        if (aVar != null) {
            try {
                try {
                    aVar.b();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                this.f39842b = null;
            }
        }
        com.meizu.cloud.pushsdk.b.a.a aVar2 = new com.meizu.cloud.pushsdk.b.a.a(this.f39841a, new Runnable() { // from class: com.meizu.cloud.pushsdk.handler.a.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                DebugLogger.d("AdNotification", "ad priority valid time out");
                a.this.a();
            }
        }, i11 * OrderStatusCode.ORDER_STATE_CANCEL);
        this.f39842b = aVar2;
        aVar2.a();
    }

    public void a(int i11) {
        int i12;
        if (i11 <= 0 || (i12 = this.f39843c) <= 0 || i11 != i12) {
            return;
        }
        b();
        DebugLogger.d("AdNotification", "clean ad notification, notifyId:" + i11);
    }

    private void a(int i11, Notification notification) {
        this.f39843c = i11;
        this.f39844d = notification;
    }

    public void a(int i11, Notification notification, int i12) {
        if (i11 <= 0 || notification == null) {
            return;
        }
        a(i11, notification);
        b(i12);
        DebugLogger.d("AdNotification", "save ad notification, notifyId:" + i11);
    }

    public void a(MessageV3 messageV3) {
        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
        if (advanceSetting != null) {
            advanceSetting.getNotifyType().setSound(false);
            advanceSetting.getNotifyType().setLights(false);
            advanceSetting.getNotifyType().setVibrate(false);
        }
        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
        if (advanceSettingEx != null) {
            advanceSettingEx.setSoundTitle(null);
            if (Build.VERSION.SDK_INT < 29 || advanceSetting == null || !advanceSetting.isHeadUpNotification()) {
                advanceSettingEx.setPriorityDisplay(0);
            } else {
                advanceSettingEx.setPriorityDisplay(1);
            }
        }
    }
}
