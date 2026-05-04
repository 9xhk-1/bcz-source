package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class UpdateBean implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36663a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36664b;

    /* renamed from: c, reason: collision with root package name */
    private String f36665c;

    /* renamed from: d, reason: collision with root package name */
    private int f36666d;

    /* renamed from: e, reason: collision with root package name */
    private String f36667e;

    /* renamed from: f, reason: collision with root package name */
    private String f36668f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f36669g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f36670h = true;

    public String getClientAppId() {
        return (String) a(this.f36667e);
    }

    public String getClientAppName() {
        return (String) a(this.f36668f);
    }

    public String getClientPackageName() {
        return (String) a(this.f36665c);
    }

    public int getClientVersionCode() {
        return ((Integer) a(Integer.valueOf(this.f36666d))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.f36664b;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f36669g);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) a(Boolean.valueOf(this.f36663a))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.f36670h))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f36667e = str;
    }

    public void setClientAppName(String str) {
        this.f36668f = str;
    }

    public void setClientPackageName(String str) {
        this.f36665c = str;
    }

    public void setClientVersionCode(int i11) {
        this.f36666d = i11;
    }

    public void setHmsOrApkUpgrade(boolean z11) {
        this.f36663a = z11;
    }

    public void setNeedConfirm(boolean z11) {
        this.f36670h = z11;
    }

    public void setResolutionInstallHMS(boolean z11) {
        this.f36664b = z11;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f36669g = arrayList;
    }

    private static <T> T a(T t11) {
        return t11;
    }
}
