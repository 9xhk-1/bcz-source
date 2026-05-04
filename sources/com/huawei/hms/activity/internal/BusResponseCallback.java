package com.huawei.hms.activity.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface BusResponseCallback {
    BusResponseResult innerError(Activity activity, int i11, String str);

    BusResponseResult succeedReturn(Activity activity, int i11, Intent intent);
}
