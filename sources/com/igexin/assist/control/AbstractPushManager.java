package com.igexin.assist.control;

import android.content.Context;

/* loaded from: classes7.dex */
public interface AbstractPushManager {
    String getBrandCode();

    String getToken(Context context);

    boolean isSupport();

    void register(Context context);

    void setSilentTime(Context context, int i11, int i12);

    void turnOffPush(Context context);

    void turnOnPush(Context context);

    void unregister(Context context);
}
