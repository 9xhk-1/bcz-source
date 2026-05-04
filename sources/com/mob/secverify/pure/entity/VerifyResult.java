package com.mob.secverify.pure.entity;

import com.mob.secverify.b.c;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class VerifyResult extends a {
    private String opToken;
    private String operator;
    private String securityPhone;
    private String token;
    private UiElement uiElement;

    public VerifyResult(String str, String str2, String str3) {
        this(str, str2, null, str3);
    }

    public String getOpToken() {
        return this.opToken;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getSecurityPhone() {
        return this.securityPhone;
    }

    public String getToken() {
        return this.token;
    }

    public UiElement getUiElement() {
        return this.uiElement;
    }

    public void setSecurityPhone(String str) {
        this.securityPhone = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    @Override // com.mob.secverify.pure.entity.a
    public String toJson() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("securityPhone", this.securityPhone);
            hashMap.put("opToken", this.opToken);
            hashMap.put("token", this.token);
            hashMap.put("operator", this.operator);
            hashMap.put("uiElement", this.hashon.fromJson(this.uiElement.toJson()));
            return this.hashon.fromHashMap(hashMap);
        } catch (Throwable th2) {
            c.a().a(th2, "[SecPure][%s][%s] ==>%s", this.tag, "toJson", "Error parse entity to json");
            return "";
        }
    }

    public VerifyResult(String str, String str2, String str3, String str4) {
        this.securityPhone = str;
        this.opToken = str2;
        this.token = str3;
        this.operator = str4;
        this.uiElement = genUiElement();
    }
}
