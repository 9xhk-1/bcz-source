package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.xiaomi.push.ci;

/* loaded from: classes8.dex */
public class cf extends ci.e {

    /* renamed from: a, reason: collision with root package name */
    private String f45334a;

    public cf(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f45334a = str2;
    }

    public static cf a(Context context, String str, hl hlVar) {
        byte[] a11 = ir.a(hlVar);
        if (a11 == null || a11.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", hlVar.d());
        contentValues.put("messageItem", a11);
        contentValues.put("appId", bw.a(context).b());
        contentValues.put(CommonConstant.ReqAccessTokenParam.PACKAGE_NAME, bw.a(context).m5767a());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new cf(str, contentValues, "a job build to insert message to db");
    }
}
