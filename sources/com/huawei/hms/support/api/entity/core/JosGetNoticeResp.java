package com.huawei.hms.support.api.entity.core;

import android.content.Intent;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class JosGetNoticeResp extends JosBaseResp {

    @Packed
    private Intent noticeIntent;

    public Intent getNoticeIntent() {
        return (Intent) get(this.noticeIntent);
    }

    public void setNoticeIntent(Intent intent) {
        this.noticeIntent = intent;
    }

    private static <T> T get(T t11) {
        return t11;
    }
}
