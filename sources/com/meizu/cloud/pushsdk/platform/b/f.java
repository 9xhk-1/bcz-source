package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class f extends c<PushSwitchStatus> {

    /* renamed from: h, reason: collision with root package name */
    private String f39974h;

    /* renamed from: i, reason: collision with root package name */
    private int f39975i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f39976j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, Boolean> f39977k;

    public f(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    private com.meizu.cloud.pushsdk.c.a.c<String> b(PushSwitchStatus pushSwitchStatus) {
        boolean z11;
        boolean r11;
        boolean p11;
        int i11 = this.f39975i;
        if (i11 != 0) {
            if (i11 == 1) {
                pushSwitchStatus.setMessage("SWITCH_THROUGH_MESSAGE");
                if (r() != this.f39976j || t()) {
                    f(true);
                    d(this.f39976j);
                    return this.f39961e.a(this.f39958b, this.f39959c, this.f39974h, this.f39975i, this.f39976j);
                }
                p11 = p();
            } else if (i11 == 2) {
                pushSwitchStatus.setMessage("CHECK_PUSH");
                if (!q() || !s() || t()) {
                    f(true);
                    return this.f39961e.c(this.f39958b, this.f39959c, this.f39974h);
                }
                z11 = p();
            } else {
                if (i11 != 3) {
                    return null;
                }
                pushSwitchStatus.setMessage("SWITCH_ALL");
                if (p() != this.f39976j || r() != this.f39976j || t()) {
                    f(true);
                    e(this.f39976j);
                    return this.f39961e.a(this.f39958b, this.f39959c, this.f39974h, this.f39976j);
                }
                p11 = this.f39976j;
            }
            pushSwitchStatus.setSwitchNotificationMessage(p11);
            r11 = this.f39976j;
            pushSwitchStatus.setSwitchThroughMessage(r11);
            return null;
        }
        pushSwitchStatus.setMessage("SWITCH_NOTIFICATION");
        if (p() != this.f39976j || t()) {
            f(true);
            c(this.f39976j);
            return this.f39961e.a(this.f39958b, this.f39959c, this.f39974h, this.f39975i, this.f39976j);
        }
        z11 = this.f39976j;
        pushSwitchStatus.setSwitchNotificationMessage(z11);
        r11 = r();
        pushSwitchStatus.setSwitchThroughMessage(r11);
        return null;
    }

    private void d(boolean z11) {
        com.meizu.cloud.pushsdk.util.b.b(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), z11);
    }

    private void o() {
        int i11 = this.f39975i;
        if (i11 == 0 || i11 == 1) {
            PlatformMessageSender.a(this.f39957a, i11, this.f39976j, this.f39960d);
        } else {
            if (i11 != 3) {
                return;
            }
            PlatformMessageSender.a(this.f39957a, 0, this.f39976j, this.f39960d);
            PlatformMessageSender.a(this.f39957a, 1, this.f39976j, this.f39960d);
        }
    }

    private boolean p() {
        return com.meizu.cloud.pushsdk.util.b.e(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName());
    }

    private boolean q() {
        return com.meizu.cloud.pushsdk.util.b.f(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName());
    }

    private boolean r() {
        return com.meizu.cloud.pushsdk.util.b.h(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName());
    }

    private boolean s() {
        return com.meizu.cloud.pushsdk.util.b.i(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName());
    }

    private boolean t() {
        Boolean bool = this.f39977k.get(this.f39960d + "_" + this.f39975i);
        boolean z11 = bool == null || bool.booleanValue();
        DebugLogger.e("Strategy", "isSyncPushStatus " + this.f39960d + " switch type->" + this.f39975i + " flag->" + z11);
        return z11;
    }

    public void a(int i11) {
        this.f39975i = i11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f39958b);
        intent.putExtra(com.alipay.sdk.m.l.b.f10731h, this.f39959c);
        intent.putExtra("strategy_package_name", this.f39957a.getPackageName());
        intent.putExtra(PushConstants.REGISTER_STATUS_PUSH_ID, this.f39974h);
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f39975i);
        intent.putExtra("strategy_params", this.f39976j ? "1" : "0");
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public int g() {
        return 16;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public PushSwitchStatus b() {
        String str;
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setCode(PushConsts.SEND_MESSAGE_ERROR_GENERAL);
        if (TextUtils.isEmpty(this.f39958b)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.f39959c)) {
            str = "appKey not empty";
        } else {
            if (!TextUtils.isEmpty(this.f39974h)) {
                return pushSwitchStatus;
            }
            str = "pushId not empty";
        }
        pushSwitchStatus.setMessage(str);
        return pushSwitchStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public PushSwitchStatus e() {
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setPushId(this.f39974h);
        pushSwitchStatus.setCode(BasicPushStatus.SUCCESS_CODE);
        com.meizu.cloud.pushsdk.c.a.c<String> b11 = b(pushSwitchStatus);
        if (b11 != null) {
            if (b11.b()) {
                PushSwitchStatus pushSwitchStatus2 = new PushSwitchStatus(b11.a());
                DebugLogger.e("Strategy", "network pushSwitchStatus " + pushSwitchStatus2);
                if (BasicPushStatus.SUCCESS_CODE.equals(pushSwitchStatus.getCode())) {
                    f(false);
                    DebugLogger.e("Strategy", "update local switch preference");
                    pushSwitchStatus.setSwitchNotificationMessage(pushSwitchStatus2.isSwitchNotificationMessage());
                    pushSwitchStatus.setSwitchThroughMessage(pushSwitchStatus2.isSwitchThroughMessage());
                    c(pushSwitchStatus2.isSwitchNotificationMessage());
                    d(pushSwitchStatus2.isSwitchThroughMessage());
                }
            } else {
                com.meizu.cloud.pushsdk.c.b.a c11 = b11.c();
                if (c11.a() != null) {
                    DebugLogger.e("Strategy", "status code=" + c11.b() + " data=" + c11.a());
                }
                pushSwitchStatus.setCode(String.valueOf(c11.b()));
                pushSwitchStatus.setMessage(c11.c());
                DebugLogger.e("Strategy", "pushSwitchStatus " + pushSwitchStatus);
            }
        }
        DebugLogger.e("Strategy", "enableRpc " + this.f39963g + " isSupportRemoteInvoke " + this.f39962f);
        if (this.f39963g && !this.f39962f) {
            o();
        }
        return pushSwitchStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public PushSwitchStatus f() {
        int i11 = this.f39975i;
        if (i11 == 0) {
            c(this.f39976j);
            return null;
        }
        if (i11 == 1) {
            d(this.f39976j);
            return null;
        }
        if (i11 != 2 && i11 != 3) {
            return null;
        }
        e(this.f39976j);
        return null;
    }

    public f(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z11) {
        this(context, aVar, scheduledExecutorService);
        this.f39963g = z11;
    }

    private void c(boolean z11) {
        com.meizu.cloud.pushsdk.util.b.a(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), z11);
    }

    private void e(boolean z11) {
        com.meizu.cloud.pushsdk.util.b.a(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), z11);
        com.meizu.cloud.pushsdk.util.b.b(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), z11);
    }

    private void f(boolean z11) {
        this.f39977k.put(this.f39960d + "_" + this.f39975i, Boolean.valueOf(z11));
    }

    public f(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.f39975i = 0;
        this.f39977k = new HashMap();
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public void a(PushSwitchStatus pushSwitchStatus) {
        PlatformMessageSender.a(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), pushSwitchStatus);
    }

    public void b(boolean z11) {
        this.f39976j = z11;
    }

    public f(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.f39974h = str3;
    }

    public void a(String str) {
        this.f39974h = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public boolean a() {
        return (TextUtils.isEmpty(this.f39958b) || TextUtils.isEmpty(this.f39959c) || TextUtils.isEmpty(this.f39974h)) ? false : true;
    }
}
