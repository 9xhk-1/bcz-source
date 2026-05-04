package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class g extends c<UnRegisterStatus> {
    public g(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f39958b);
        intent.putExtra(com.alipay.sdk.m.l.b.f10731h, this.f39959c);
        intent.putExtra("strategy_package_name", this.f39957a.getPackageName());
        intent.putExtra("strategy_type", g());
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public int g() {
        return 32;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public UnRegisterStatus b() {
        String str;
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        unRegisterStatus.setCode(PushConsts.SEND_MESSAGE_ERROR_GENERAL);
        if (TextUtils.isEmpty(this.f39958b)) {
            str = "appId not empty";
        } else {
            if (!TextUtils.isEmpty(this.f39959c)) {
                return unRegisterStatus;
            }
            str = "appKey not empty";
        }
        unRegisterStatus.setMessage(str);
        return unRegisterStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public UnRegisterStatus e() {
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        if (TextUtils.isEmpty(com.meizu.cloud.pushsdk.util.b.a(this.f39957a, this.f39960d))) {
            unRegisterStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            unRegisterStatus.setMessage("already unRegister PushId,don't unRegister frequently");
            unRegisterStatus.setIsUnRegisterSuccess(true);
            return unRegisterStatus;
        }
        com.meizu.cloud.pushsdk.c.a.c b11 = this.f39961e.b(this.f39958b, this.f39959c, com.meizu.cloud.pushsdk.b.c.a(this.f39957a));
        if (b11.b()) {
            UnRegisterStatus unRegisterStatus2 = new UnRegisterStatus((String) b11.a());
            DebugLogger.e("Strategy", "network unRegisterStatus " + unRegisterStatus2);
            if (BasicPushStatus.SUCCESS_CODE.equals(unRegisterStatus2.getCode())) {
                com.meizu.cloud.pushsdk.util.b.g(this.f39957a, "", this.f39960d);
            }
            return unRegisterStatus2;
        }
        com.meizu.cloud.pushsdk.c.b.a c11 = b11.c();
        if (c11.a() != null) {
            DebugLogger.e("Strategy", "status code=" + c11.b() + " data=" + c11.a());
        }
        unRegisterStatus.setCode(String.valueOf(c11.b()));
        unRegisterStatus.setMessage(c11.c());
        DebugLogger.e("Strategy", "unRegisterStatus " + unRegisterStatus);
        return unRegisterStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public UnRegisterStatus f() {
        return null;
    }

    public g(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z11) {
        this(context, aVar, scheduledExecutorService);
        this.f39963g = z11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public void a(UnRegisterStatus unRegisterStatus) {
        PlatformMessageSender.a(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), unRegisterStatus);
    }

    public g(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public boolean a() {
        return (TextUtils.isEmpty(this.f39958b) || TextUtils.isEmpty(this.f39959c)) ? false : true;
    }
}
