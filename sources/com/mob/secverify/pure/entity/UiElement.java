package com.mob.secverify.pure.entity;

import com.mob.secverify.b.c;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UiElement extends a {
    private String privacyName;
    private String privacyUrl;
    private String slogan;

    public String getPrivacyName() {
        return this.privacyName;
    }

    public String getPrivacyUrl() {
        return this.privacyUrl;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public void setPrivacyName(String str) {
        this.privacyName = str;
    }

    public void setPrivacyUrl(String str) {
        this.privacyUrl = str;
    }

    public void setSlogan(String str) {
        this.slogan = str;
    }

    @Override // com.mob.secverify.pure.entity.a
    public String toJson() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("privacyName", this.privacyName);
            hashMap.put("privacyUrl", this.privacyUrl);
            hashMap.put("slogan", this.slogan);
            return this.hashon.fromHashMap(hashMap);
        } catch (Throwable th2) {
            c.a().a(th2, "[SecPure][%s][%s] ==>%s", this.tag, "toJson", "Error parse entity to json");
            return "";
        }
    }
}
