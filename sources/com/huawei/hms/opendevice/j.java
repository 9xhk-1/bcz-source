package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class j implements Callable<AAIDResult> {

    /* renamed from: a, reason: collision with root package name */
    public Context f36094a;

    public j(Context context) {
        this.f36094a = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public AAIDResult call() throws Exception {
        Context context = this.f36094a;
        if (context == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String c11 = o.c(context);
        AAIDResult aAIDResult = new AAIDResult();
        aAIDResult.setId(c11);
        return aAIDResult;
    }
}
