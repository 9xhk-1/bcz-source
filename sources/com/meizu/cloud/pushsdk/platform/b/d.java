package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.sdk.PushConsts;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class d extends c<SubAliasStatus> {

    /* renamed from: h, reason: collision with root package name */
    private String f39967h;

    /* renamed from: i, reason: collision with root package name */
    private int f39968i;

    /* renamed from: j, reason: collision with root package name */
    private String f39969j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, Boolean> f39970k;

    public d(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    private String o() {
        return com.meizu.cloud.pushsdk.util.b.g(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName());
    }

    private boolean p() {
        Boolean bool = this.f39970k.get(this.f39960d + "_" + this.f39968i);
        return bool == null || bool.booleanValue();
    }

    private boolean q() {
        return !this.f39962f && PushConstants.PUSH_PACKAGE_NAME.equals(this.f39960d);
    }

    public void a(int i11) {
        this.f39968i = i11;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public Intent c() {
        if (this.f39968i == 2) {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f39958b);
        intent.putExtra(com.alipay.sdk.m.l.b.f10731h, this.f39959c);
        intent.putExtra("strategy_package_name", this.f39957a.getPackageName());
        intent.putExtra(PushConstants.REGISTER_STATUS_PUSH_ID, this.f39967h);
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f39968i);
        intent.putExtra("strategy_params", this.f39969j);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public int g() {
        return 8;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public SubAliasStatus b() {
        String str;
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode(PushConsts.SEND_MESSAGE_ERROR_GENERAL);
        if (TextUtils.isEmpty(this.f39958b)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.f39959c)) {
            str = "appKey not empty";
        } else {
            if (!TextUtils.isEmpty(this.f39967h)) {
                return subAliasStatus;
            }
            str = "pushId not empty";
        }
        subAliasStatus.setMessage(str);
        return subAliasStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.meizu.cloud.pushsdk.platform.message.SubAliasStatus e() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.b.d.e():com.meizu.cloud.pushsdk.platform.message.SubAliasStatus");
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public SubAliasStatus f() {
        if (this.f39968i != 2) {
            return null;
        }
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode(BasicPushStatus.SUCCESS_CODE);
        subAliasStatus.setPushId(this.f39967h);
        subAliasStatus.setAlias(o());
        subAliasStatus.setMessage("check alias success");
        return subAliasStatus;
    }

    public d(Context context, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService, boolean z11) {
        this(context, aVar, scheduledExecutorService);
        this.f39963g = z11;
    }

    private void b(boolean z11) {
        this.f39970k.put(this.f39960d + "_" + this.f39968i, Boolean.valueOf(z11));
    }

    private void f(String str) {
        com.meizu.cloud.pushsdk.util.b.h(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), str);
    }

    public void e(String str) {
        this.f39967h = str;
    }

    public d(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.f39970k = new HashMap();
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public void a(SubAliasStatus subAliasStatus) {
        PlatformMessageSender.a(this.f39957a, !TextUtils.isEmpty(this.f39960d) ? this.f39960d : this.f39957a.getPackageName(), subAliasStatus);
    }

    public d(Context context, String str, String str2, String str3, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.f39967h = str3;
    }

    public void a(String str) {
        this.f39969j = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.b.c
    public boolean a() {
        return (TextUtils.isEmpty(this.f39958b) || TextUtils.isEmpty(this.f39959c) || TextUtils.isEmpty(this.f39967h)) ? false : true;
    }
}
