package com.huawei.hms.adapter;

import android.app.PendingIntent;
import android.content.Intent;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CoreBaseResponse implements IMessageEntity {

    @Packed
    public Intent intent;

    @Packed
    private String jsonBody;

    @Packed
    private String jsonHeader;

    @Packed
    public PendingIntent pendingIntent;

    public Intent getIntent() {
        return this.intent;
    }

    public String getJsonBody() {
        return this.jsonBody;
    }

    public String getJsonHeader() {
        return this.jsonHeader;
    }

    public PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public void setJsonBody(String str) {
        this.jsonBody = str;
    }

    public void setJsonHeader(String str) {
        this.jsonHeader = str;
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }
}
