package com.alipay.sdk.m.c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements com.alipay.sdk.m.b.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10496a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.alipay.sdk.m.b.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse(f10496a), null, null, null, null);
        if (query != null) {
            r0 = query.moveToNext() ? query.getString(query.getColumnIndex("device_ids_grndid")) : null;
            query.close();
        }
        return r0;
    }
}
