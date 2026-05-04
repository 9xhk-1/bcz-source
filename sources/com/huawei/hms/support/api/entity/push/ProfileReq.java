package com.huawei.hms.support.api.entity.push;

import com.alipay.sdk.m.u.i;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ProfileReq implements IMessageEntity {

    @Packed
    public int operation;

    @Packed
    public String pkgName;

    @Packed
    public String profileId;

    @Packed
    public String subjectId;

    @Packed
    public int type;

    public int getOperation() {
        return this.operation;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public String getSubjectId() {
        return this.subjectId;
    }

    public int getType() {
        return this.type;
    }

    public void setOperation(int i11) {
        this.operation = i11;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setProfileId(String str) {
        this.profileId = str;
    }

    public void setSubjectId(String str) {
        this.subjectId = str;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public String toString() {
        return ProfileReq.class.getName() + "{ pkgName: " + this.pkgName + ",subjectId: " + this.subjectId + ",operation: " + this.operation + " type: " + this.type + i.f11099d;
    }
}
