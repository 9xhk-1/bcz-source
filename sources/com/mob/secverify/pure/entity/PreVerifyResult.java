package com.mob.secverify.pure.entity;

import com.mob.secverify.b.c;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class PreVerifyResult extends a {
    private String operator;
    private String securityPhone;
    private UiElement uiElement = genUiElement();
    private long expireAt = setExpireAt();

    public PreVerifyResult(String str, String str2) {
        this.operator = str2;
        this.securityPhone = str;
    }

    private long setExpireAt() {
        return System.currentTimeMillis() + 3600000;
    }

    public long getExpireAt() {
        return this.expireAt;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getSecurityPhone() {
        return this.securityPhone;
    }

    public UiElement getUiElement() {
        return this.uiElement;
    }

    @Override // com.mob.secverify.pure.entity.a
    public String toJson() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("operator", this.operator);
            hashMap.put("securityPhone", this.securityPhone);
            hashMap.put("uiElement", this.hashon.fromJson(this.uiElement.toJson()));
            return this.hashon.fromHashMap(hashMap);
        } catch (Throwable th2) {
            c.a().a(th2, "[SecPure][%s][%s] ==>%s", this.tag, "toJson", "Error parse entity to json");
            return "";
        }
    }
}
