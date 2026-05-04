package com.vivo.push.util;

import android.content.Context;
import com.vivo.push.model.InsideNotificationItem;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface BaseNotifyDataAdapter {
    int getDefaultNotifyIcon();

    int getDefaultSmallIconId();

    int getNotifyMode(InsideNotificationItem insideNotificationItem);

    void init(Context context);
}
