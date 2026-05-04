package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MiPushClient;

/* loaded from: classes8.dex */
public enum ex {
    COMMAND_REGISTER(MiPushClient.COMMAND_REGISTER),
    COMMAND_UNREGISTER(MiPushClient.COMMAND_UNREGISTER),
    COMMAND_SET_ALIAS(MiPushClient.COMMAND_SET_ALIAS),
    COMMAND_UNSET_ALIAS(MiPushClient.COMMAND_UNSET_ALIAS),
    COMMAND_SET_ACCOUNT(MiPushClient.COMMAND_SET_ACCOUNT),
    COMMAND_UNSET_ACCOUNT(MiPushClient.COMMAND_UNSET_ACCOUNT),
    COMMAND_SUBSCRIBE_TOPIC(MiPushClient.COMMAND_SUBSCRIBE_TOPIC),
    COMMAND_UNSUBSCRIBE_TOPIC(MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC),
    COMMAND_SET_ACCEPT_TIME(MiPushClient.COMMAND_SET_ACCEPT_TIME),
    COMMAND_CHK_VDEVID("check-vdeviceid");


    /* renamed from: a, reason: collision with other field name */
    public final String f366a;

    ex(String str) {
        this.f366a = str;
    }

    public static int a(String str) {
        int i11 = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (ex exVar : values()) {
            if (exVar.f366a.equals(str)) {
                i11 = em.a(exVar);
            }
        }
        return i11;
    }
}
