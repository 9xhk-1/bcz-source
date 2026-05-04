package com.huawei.hms.apptouch;

import java.util.List;

/* loaded from: classes7.dex */
public class AppInfoSetResponse {

    /* renamed from: a, reason: collision with root package name */
    private List<AppInfoResult> f35446a;

    public static class AppInfoResult {

        /* renamed from: a, reason: collision with root package name */
        private int f35447a;

        /* renamed from: b, reason: collision with root package name */
        private String f35448b;

        /* renamed from: c, reason: collision with root package name */
        private AppInfo f35449c;

        public AppInfoResult() {
        }

        public AppInfo getAppInfo() {
            return this.f35449c;
        }

        public int getErrorCode() {
            return this.f35447a;
        }

        public String getErrorMessage() {
            return this.f35448b;
        }

        public void setAppInfo(AppInfo appInfo) {
            this.f35449c = appInfo;
        }

        public void setErrorCode(int i11) {
            this.f35447a = i11;
        }

        public void setErrorMessage(String str) {
            this.f35448b = str;
        }

        public String toString() {
            return "errorCode:" + this.f35447a + ", errorMessage:" + this.f35448b + ", appInfo:" + this.f35449c;
        }

        public AppInfoResult(int i11, String str, AppInfo appInfo) {
            this.f35447a = i11;
            this.f35448b = str;
            this.f35449c = appInfo;
        }
    }

    public List<AppInfoResult> getErrorAppInfos() {
        return this.f35446a;
    }

    public void setErrorAppInfos(List<AppInfoResult> list) {
        this.f35446a = list;
    }
}
