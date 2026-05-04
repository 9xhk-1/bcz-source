package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private String f35939a;

    /* renamed from: b, reason: collision with root package name */
    public l1 f35940b;

    public z0(String str) {
        this.f35939a = str;
        this.f35940b = new l1(str);
        s.c().a(this.f35939a, this.f35940b);
    }

    private s0 b(int i11) {
        if (i11 == 0) {
            return this.f35940b.c();
        }
        if (i11 == 1) {
            return this.f35940b.b();
        }
        if (i11 == 2) {
            return this.f35940b.d();
        }
        if (i11 != 3) {
            return null;
        }
        return this.f35940b.a();
    }

    private boolean c(int i11) {
        String str;
        if (i11 != 2) {
            s0 b11 = b(i11);
            if (b11 != null && !TextUtils.isEmpty(b11.h())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i11;
        } else {
            if ("_default_config_tag".equals(this.f35939a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        v.e("hmsSdk", str);
        return false;
    }

    public void a(int i11) {
        v.d("hmsSdk", "onReport. TAG: " + this.f35939a + ", TYPE: " + i11);
        g0.a().a(this.f35939a, i11);
    }

    public void a(int i11, String str, LinkedHashMap<String, String> linkedHashMap) {
        v.d("hmsSdk", "onEvent. TAG: " + this.f35939a + ", TYPE: " + i11 + ", eventId : " + str);
        if (e1.a(str) || !c(i11)) {
            v.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f35939a + ", TYPE: " + i11);
            return;
        }
        if (!e1.a(linkedHashMap)) {
            v.e("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f35939a + ", TYPE: " + i11);
            linkedHashMap = null;
        }
        g0.a().a(this.f35939a, i11, str, linkedHashMap);
    }

    public void b(int i11, String str, LinkedHashMap<String, String> linkedHashMap) {
        v.d("hmsSdk", "onStreamEvent. TAG: " + this.f35939a + ", TYPE: " + i11 + ", eventId : " + str);
        if (e1.a(str) || !c(i11)) {
            v.e("hmsSdk", "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f35939a + ", TYPE: " + i11);
            return;
        }
        if (!e1.a(linkedHashMap)) {
            v.e("hmsSdk", "onStreamEvent() parameter mapValue will be cleared.TAG: " + this.f35939a + ", TYPE: " + i11);
            linkedHashMap = null;
        }
        g0.a().b(this.f35939a, i11, str, linkedHashMap);
    }

    public void a(Context context, String str, String str2) {
        v.d("hmsSdk", "onEvent(context). TAG: " + this.f35939a + ", eventId : " + str);
        if (context == null) {
            v.e("hmsSdk", "context is null in onevent ");
            return;
        }
        if (e1.a(str) || !c(0)) {
            v.e("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f35939a);
            return;
        }
        if (!e1.a("value", str2, 65536)) {
            v.e("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f35939a);
            str2 = "";
        }
        g0.a().a(this.f35939a, context, str, str2);
    }

    public void b(s0 s0Var) {
        v.c("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f35939a);
        if (s0Var != null) {
            this.f35940b.b(s0Var);
        } else {
            this.f35940b.b(null);
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }

    public void a(s0 s0Var) {
        v.c("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f35939a);
        if (s0Var != null) {
            this.f35940b.a(s0Var);
        } else {
            v.e("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f35940b.a((s0) null);
        }
    }
}
