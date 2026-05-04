package com.huawei.hms.adapter;

import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class CoreBaseRequest implements IMessageEntity {

    @Packed
    private String jsonHeader;

    @Packed
    private String jsonObject;

    @Packed
    private Parcelable parcelable;

    public String getJsonHeader() {
        return this.jsonHeader;
    }

    public String getJsonObject() {
        return this.jsonObject;
    }

    public Parcelable getParcelable() {
        return this.parcelable;
    }

    public void setJsonHeader(String str) {
        this.jsonHeader = str;
    }

    public void setJsonObject(String str) {
        this.jsonObject = str;
    }

    public void setParcelable(Parcelable parcelable) {
        this.parcelable = parcelable;
    }
}
