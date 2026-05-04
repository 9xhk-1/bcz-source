package com.baicizhan.client.business.util;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ChannelUtils {
    private static final String DEFAULT_CHANNEL = "beta";

    public static String getChannel(Context context) {
        try {
            String c11 = ss.h.c(context);
            return TextUtils.isEmpty(c11) ? DEFAULT_CHANNEL : c11;
        } catch (Throwable unused) {
            return DEFAULT_CHANNEL;
        }
    }
}
