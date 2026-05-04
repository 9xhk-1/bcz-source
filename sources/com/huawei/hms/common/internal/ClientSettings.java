package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ClientSettings {

    /* renamed from: a, reason: collision with root package name */
    private String f35558a;

    /* renamed from: b, reason: collision with root package name */
    private String f35559b;

    /* renamed from: c, reason: collision with root package name */
    private List<Scope> f35560c;

    /* renamed from: d, reason: collision with root package name */
    private String f35561d;

    /* renamed from: e, reason: collision with root package name */
    private List<String> f35562e;

    /* renamed from: f, reason: collision with root package name */
    private String f35563f;

    /* renamed from: g, reason: collision with root package name */
    private SubAppInfo f35564g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f35565h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f35566i;

    /* renamed from: j, reason: collision with root package name */
    private String f35567j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35568k;

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2) {
        this.f35558a = str;
        this.f35559b = str2;
        this.f35560c = list;
        this.f35561d = str3;
        this.f35562e = list2;
    }

    public List<String> getApiName() {
        return this.f35562e;
    }

    public String getAppID() {
        return this.f35561d;
    }

    public String getClientClassName() {
        return this.f35559b;
    }

    public String getClientPackageName() {
        return this.f35558a;
    }

    public Activity getCpActivity() {
        WeakReference<Activity> weakReference = this.f35565h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getCpID() {
        return this.f35563f;
    }

    public String getInnerHmsPkg() {
        return this.f35567j;
    }

    public List<Scope> getScopes() {
        return this.f35560c;
    }

    public SubAppInfo getSubAppID() {
        return this.f35564g;
    }

    public boolean isHasActivity() {
        return this.f35566i;
    }

    public boolean isUseInnerHms() {
        return this.f35568k;
    }

    public void setApiName(List<String> list) {
        this.f35562e = list;
    }

    public void setAppID(String str) {
        this.f35561d = str;
    }

    public void setClientClassName(String str) {
        this.f35559b = str;
    }

    public void setClientPackageName(String str) {
        this.f35558a = str;
    }

    public void setCpActivity(Activity activity) {
        this.f35565h = new WeakReference<>(activity);
        this.f35566i = true;
    }

    public void setCpID(String str) {
        this.f35563f = str;
    }

    public void setInnerHmsPkg(String str) {
        this.f35567j = str;
    }

    public void setScopes(List<Scope> list) {
        this.f35560c = list;
    }

    public void setSubAppId(SubAppInfo subAppInfo) {
        this.f35564g = subAppInfo;
    }

    public void setUseInnerHms(boolean z11) {
        this.f35568k = z11;
    }

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2, SubAppInfo subAppInfo) {
        this(str, str2, list, str3, list2);
        this.f35564g = subAppInfo;
    }
}
