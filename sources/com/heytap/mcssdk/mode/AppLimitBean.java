package com.heytap.mcssdk.mode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AppLimitBean {
    private int count;
    private long lastedTime;

    public AppLimitBean(long j11, int i11) {
        this.lastedTime = j11;
        this.count = i11;
    }

    public int getCount() {
        return this.count;
    }

    public long getLastedTime() {
        return this.lastedTime;
    }

    public void setCount(int i11) {
        this.count = i11;
    }

    public void setLastedTime(long j11) {
        this.lastedTime = j11;
    }
}
