package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class JosGetNoticeReq extends JosBaseReq {
    public static final int NOTICE_TYPE_CONN = 0;
    public static final int NOTICE_TYPE_SIGN = 1;

    @Packed
    private int noticeType;

    public int getNoticeType() {
        return ((Integer) get(Integer.valueOf(this.noticeType))).intValue();
    }

    public void setNoticeType(int i11) {
        this.noticeType = i11;
    }

    private static <T> T get(T t11) {
        return t11;
    }
}
