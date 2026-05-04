package com.vivo.push.model;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class SubscribeAppInfo {
    public static final int SUBSCIRBE = 1;
    public static final int SUBSCIRBE_CANCLE = 2;
    private int mActualStatus;
    private String mName;
    private int mTargetStatus;

    public SubscribeAppInfo(String str, int i11, int i12) {
        this.mName = str;
        this.mTargetStatus = i11;
        this.mActualStatus = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeAppInfo subscribeAppInfo = (SubscribeAppInfo) obj;
        String str = this.mName;
        if (str == null) {
            if (subscribeAppInfo.mName != null) {
                return false;
            }
        } else if (!str.equals(subscribeAppInfo.mName)) {
            return false;
        }
        return this.mTargetStatus == subscribeAppInfo.mTargetStatus;
    }

    public int getActualStatus() {
        return this.mActualStatus;
    }

    public String getName() {
        return this.mName;
    }

    public int getTargetStatus() {
        return this.mTargetStatus;
    }

    public int hashCode() {
        String str = this.mName;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.mTargetStatus;
    }

    public void setActualStatus(int i11) {
        this.mActualStatus = i11;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setTargetStatus(int i11) {
        this.mTargetStatus = i11;
    }

    public String toString() {
        return "SubscribeAppInfo [mName=" + this.mName + ", mTargetStatus=" + this.mTargetStatus + ", mActualStatus=" + this.mActualStatus + "]";
    }
}
