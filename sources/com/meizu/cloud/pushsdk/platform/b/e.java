package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class e extends c<SubTagsStatus> {

    /* renamed from: h, reason: collision with root package name */
    private String f39971h;

    /* renamed from: i, reason: collision with root package name */
    private int f39972i;

    /* renamed from: j, reason: collision with root package name */
    private String f39973j;

    public e(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public void a(int i11) {
        this.f39972i = i11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f39958b);
        intent.putExtra(com.alipay.sdk.m.l.b.f10731h, this.f39959c);
        intent.putExtra("strategy_package_name", this.f39957a.getPackageName());
        intent.putExtra(PushConstants.REGISTER_STATUS_PUSH_ID, this.f39971h);
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f39972i);
        intent.putExtra("strategy_params", this.f39973j);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public int g() {
        return 4;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public SubTagsStatus b() {
        String str;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        subTagsStatus.setCode(PushConsts.SEND_MESSAGE_ERROR_GENERAL);
        if (TextUtils.isEmpty(this.f39958b)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.f39959c)) {
            str = "appKey not empty";
        } else {
            if (!TextUtils.isEmpty(this.f39971h)) {
                return subTagsStatus;
            }
            str = "pushId not empty";
        }
        subTagsStatus.setMessage(str);
        return subTagsStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public SubTagsStatus e() {
        StringBuilder sb2;
        String str;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        int i11 = this.f39972i;
        com.meizu.cloud.pushsdk.c.a.c e11 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? null : this.f39961e.e(this.f39958b, this.f39959c, this.f39971h) : this.f39961e.d(this.f39958b, this.f39959c, this.f39971h) : this.f39961e.b(this.f39958b, this.f39959c, this.f39971h, this.f39973j) : this.f39961e.a(this.f39958b, this.f39959c, this.f39971h, this.f39973j);
        if (e11 == null) {
            DebugLogger.e("Strategy", "network anResponse is null");
            return null;
        }
        if (e11.b()) {
            subTagsStatus = new SubTagsStatus((String) e11.a());
            sb2 = new StringBuilder();
            str = "network subTagsStatus ";
        } else {
            com.meizu.cloud.pushsdk.c.b.a c11 = e11.c();
            if (c11.a() != null) {
                DebugLogger.e("Strategy", "status code=" + c11.b() + " data=" + c11.a());
            }
            subTagsStatus.setCode(String.valueOf(c11.b()));
            subTagsStatus.setMessage(c11.c());
            sb2 = new StringBuilder();
            str = "subTagsStatus ";
        }
        sb2.append(str);
        sb2.append(subTagsStatus);
        DebugLogger.e("Strategy", sb2.toString());
        return subTagsStatus;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public SubTagsStatus f() {
        return null;
    }

    public e(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z11) {
        this(context, aVar, scheduledExecutorService);
        this.f39963g = z11;
    }

    public void e(String str) {
        this.f39971h = str;
    }

    public e(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.f39972i = 3;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public void a(SubTagsStatus subTagsStatus) {
        PlatformMessageSender.a(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), subTagsStatus);
    }

    public e(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.f39971h = str3;
    }

    public void a(String str) {
        this.f39973j = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public boolean a() {
        return (TextUtils.isEmpty(this.f39958b) || TextUtils.isEmpty(this.f39959c) || TextUtils.isEmpty(this.f39971h)) ? false : true;
    }
}
