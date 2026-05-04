package com.tencent.mobileqq.openpay.api;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public class OpenApiFactory {
    private OpenApiFactory() {
        throw new RuntimeException(getClass().getSimpleName() + " should not be created.");
    }

    public static IOpenApi getInstance(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return new a(context);
    }
}
