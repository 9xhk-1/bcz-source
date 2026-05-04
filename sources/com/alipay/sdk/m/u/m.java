package com.alipay.sdk.m.u;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11110a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String a(Context context) {
        Cursor query = context.getContentResolver().query(Uri.parse(f11110a), null, null, null, null);
        if (query != null && query.getCount() > 0) {
            r0 = query.moveToFirst() ? query.getString(query.getColumnIndex("url")) : null;
            query.close();
        }
        return r0;
    }

    public static String b(Context context) {
        if (EnvUtils.isPreSandBox()) {
            return com.alipay.sdk.m.l.a.f10699b;
        }
        if (EnvUtils.isNewSanBox()) {
            return com.alipay.sdk.m.l.a.f10700c;
        }
        if (context == null) {
            return com.alipay.sdk.m.l.a.f10698a;
        }
        String str = com.alipay.sdk.m.l.a.f10698a;
        return TextUtils.isEmpty(str) ? com.alipay.sdk.m.l.a.f10698a : str;
    }
}
