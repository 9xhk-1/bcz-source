package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class b extends c<RegisterStatus> {

    /* renamed from: h, reason: collision with root package name */
    private Handler f39952h;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledExecutorService f39953i;

    /* renamed from: j, reason: collision with root package name */
    private int f39954j;

    public b(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
        this.f39953i = (ScheduledExecutorService) com.meizu.cloud.pushsdk.d.b.a.b.a();
        this.f39952h = new Handler(context.getMainLooper()) { // from class: com.meizu.cloud.pushsdk.platform.b.b.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 0) {
                    b.this.m();
                }
            }
        };
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
        return 2;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public RegisterStatus b() {
        String str;
        RegisterStatus registerStatus = new RegisterStatus();
        registerStatus.setCode(PushConsts.SEND_MESSAGE_ERROR_GENERAL);
        if (TextUtils.isEmpty(this.f39958b)) {
            str = "appId not empty";
        } else {
            if (!TextUtils.isEmpty(this.f39959c)) {
                return registerStatus;
            }
            str = "appKey not empty";
        }
        registerStatus.setMessage(str);
        return registerStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public RegisterStatus f() {
        return null;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public RegisterStatus e() {
        RegisterStatus registerStatus = new RegisterStatus();
        String a11 = com.meizu.cloud.pushsdk.util.b.a(this.f39957a, this.f39960d);
        int b11 = com.meizu.cloud.pushsdk.util.b.b(this.f39957a, this.f39960d);
        if (!a(a11, b11)) {
            registerStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            registerStatus.setMessage("already register PushId,don't register frequently");
            registerStatus.setPushId(a11);
            registerStatus.setExpireTime((int) (b11 - (System.currentTimeMillis() / 1000)));
            return registerStatus;
        }
        com.meizu.cloud.pushsdk.util.b.g(this.f39957a, "", this.f39960d);
        String a12 = com.meizu.cloud.pushsdk.b.c.a(this.f39957a);
        if (TextUtils.isEmpty(a12) && this.f39954j < 3) {
            DebugLogger.i("Strategy", "after " + (this.f39954j * 10) + " seconds start register");
            a((long) (this.f39954j * 10));
            this.f39954j = this.f39954j + 1;
            registerStatus.setCode(PushConsts.SEND_MESSAGE_ERROR);
            registerStatus.setMessage("deviceId is empty");
            return registerStatus;
        }
        this.f39954j = 0;
        com.meizu.cloud.pushsdk.c.a.c a13 = this.f39961e.a(this.f39958b, this.f39959c, a12);
        if (a13.b()) {
            RegisterStatus registerStatus2 = new RegisterStatus((String) a13.a());
            DebugLogger.e("Strategy", "registerStatus " + registerStatus2);
            if (!TextUtils.isEmpty(registerStatus2.getPushId())) {
                com.meizu.cloud.pushsdk.util.b.g(this.f39957a, registerStatus2.getPushId(), this.f39960d);
                com.meizu.cloud.pushsdk.util.b.a(this.f39957a, (int) ((System.currentTimeMillis() / 1000) + registerStatus2.getExpireTime()), this.f39960d);
            }
            return registerStatus2;
        }
        com.meizu.cloud.pushsdk.c.b.a c11 = a13.c();
        if (c11.a() != null) {
            DebugLogger.e("Strategy", "status code=" + c11.b() + " data=" + c11.a());
        }
        registerStatus.setCode(String.valueOf(c11.b()));
        registerStatus.setMessage(c11.c());
        DebugLogger.e("Strategy", "registerStatus " + registerStatus);
        return registerStatus;
    }

    public b(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z11) {
        this(context, aVar, scheduledExecutorService);
        this.f39963g = z11;
    }

    public void a(long j11) {
        this.f39953i.schedule(new Runnable() { // from class: com.meizu.cloud.pushsdk.platform.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                com.meizu.cloud.pushsdk.b.c.a(b.this.f39957a);
                b.this.f39952h.sendEmptyMessage(0);
            }
        }, j11, TimeUnit.SECONDS);
    }

    public b(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.f39954j = 0;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public void a(RegisterStatus registerStatus) {
        PlatformMessageSender.a(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), registerStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public boolean a() {
        DebugLogger.e("Strategy", "isBrandMeizu " + MzSystemUtils.isBrandMeizu(this.f39957a));
        return (TextUtils.isEmpty(this.f39958b) || TextUtils.isEmpty(this.f39959c)) ? false : true;
    }

    public boolean a(String str, int i11) {
        String a11 = com.meizu.cloud.pushsdk.b.c.a(this.f39957a);
        boolean a12 = a(a11, str, i11);
        return a12 ? a(a11, com.meizu.cloud.pushsdk.platform.a.a(str), i11) : a12;
    }

    private boolean a(String str, String str2, int i11) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.startsWith(str) || System.currentTimeMillis() / 1000 > ((long) i11);
    }
}
