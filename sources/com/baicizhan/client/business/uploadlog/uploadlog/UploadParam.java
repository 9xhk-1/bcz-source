package com.baicizhan.client.business.uploadlog.uploadlog;

import com.baicizhan.client.business.util.NoProguard;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UploadParam implements NoProguard {
    public static final int CRASH = 1;
    public static final int FEADBACK = 2;
    public String crashId;
    public int type;

    public UploadParam(String crashId, int type) {
        this.crashId = crashId;
        this.type = type;
    }
}
