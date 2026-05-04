package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class IntentCallable implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public Context f36222a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f36223b;

    /* renamed from: c, reason: collision with root package name */
    public String f36224c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.f36222a = context;
        this.f36223b = intent;
        this.f36224c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f36222a.sendBroadcast(this.f36223b);
        PushBiUtil.reportExit(this.f36222a, PushNaming.SET_NOTIFY_FLAG, this.f36224c, ErrorEnum.SUCCESS);
        return null;
    }
}
