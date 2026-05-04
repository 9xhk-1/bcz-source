package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ConnectInfo implements IMessageEntity {

    /* renamed from: a, reason: collision with root package name */
    @Packed
    private List<String> f36286a;

    /* renamed from: b, reason: collision with root package name */
    @Packed
    private List<Scope> f36287b;

    /* renamed from: c, reason: collision with root package name */
    @Packed
    private String f36288c;

    /* renamed from: d, reason: collision with root package name */
    @Packed
    private String f36289d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f36286a;
    }

    public String getFingerprint() {
        return this.f36288c;
    }

    public List<Scope> getScopeList() {
        return this.f36287b;
    }

    public String getSubAppID() {
        return this.f36289d;
    }

    public void setApiNameList(List<String> list) {
        this.f36286a = list;
    }

    public void setFingerprint(String str) {
        this.f36288c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.f36287b = list;
    }

    public void setSubAppID(String str) {
        this.f36289d = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f36286a = list;
        this.f36287b = list2;
        this.f36288c = str;
        this.f36289d = str2;
    }
}
