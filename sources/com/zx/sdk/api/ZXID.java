package com.zx.sdk.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.zx.a.I8b7.r2;
import java.io.Serializable;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class ZXID implements Serializable {
    private String aids;
    private long expiredTime;
    private String openid = "";

    /* renamed from: ot, reason: collision with root package name */
    private int f46767ot;
    private String tags;
    private String value;
    private String version;

    public JSONObject getAids() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.aids)) {
                return new JSONObject(this.aids);
            }
        } catch (Exception e11) {
            r2.a(e11);
        }
        return jSONObject;
    }

    public long getExpiredTime() {
        return this.expiredTime;
    }

    public int getOT() {
        return this.f46767ot;
    }

    public String getOpenid() {
        return this.openid;
    }

    public String getTags() {
        return this.tags;
    }

    public String getValue() {
        return this.value;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() / 1000 >= this.expiredTime;
    }

    public void setAids(String str) {
        this.aids = str;
    }

    public void setExpiredTime(long j11) {
        this.expiredTime = j11;
    }

    public void setOT(int i11) {
        this.f46767ot = i11;
    }

    public void setOpenid(String str) {
        this.openid = str;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    @NonNull
    public String toString() {
        return getValue();
    }
}
