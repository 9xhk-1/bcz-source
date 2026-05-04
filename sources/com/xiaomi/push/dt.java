package com.xiaomi.push;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.connect.common.Constants;

/* loaded from: classes8.dex */
public class dt extends ds {
    public dt(Context context, int i11) {
        super(context, i11);
    }

    @Override // com.xiaomi.push.ds
    public hj a() {
        return hj.Storage;
    }

    @Override // com.xiaomi.push.ds
    public String b() {
        return "ram:" + i.m6067a() + ",rom:" + i.m6070b() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + "ramOriginal:" + i.c() + ",romOriginal:" + i.d();
    }

    @Override // com.xiaomi.push.aj.a
    /* renamed from: a */
    public String mo5759a() {
        return Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR;
    }
}
