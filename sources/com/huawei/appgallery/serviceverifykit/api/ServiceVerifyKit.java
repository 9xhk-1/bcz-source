package com.huawei.appgallery.serviceverifykit.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ServiceVerifyKit {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f35196a;

        /* renamed from: k, reason: collision with root package name */
        public Context f35206k;

        /* renamed from: l, reason: collision with root package name */
        public int f35207l;

        /* renamed from: o, reason: collision with root package name */
        public Intent f35210o;

        /* renamed from: p, reason: collision with root package name */
        public ComponentType f35211p;

        /* renamed from: r, reason: collision with root package name */
        public String f35213r;

        /* renamed from: b, reason: collision with root package name */
        public String f35197b = "AppGallery Verification";

        /* renamed from: c, reason: collision with root package name */
        public String f35198c = "Huawei CBG Cloud Security Signer";

        /* renamed from: d, reason: collision with root package name */
        public String f35199d = "com.huawei.appgallery.fingerprint_signature";

        /* renamed from: e, reason: collision with root package name */
        public String f35200e = "com.huawei.appgallery.sign_certchain";

        /* renamed from: f, reason: collision with root package name */
        public Map<String, String[]> f35201f = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        public Map<String, String> f35202g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        public Map<String, Integer> f35203h = new HashMap();

        /* renamed from: i, reason: collision with root package name */
        public List<String> f35204i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        public List<c> f35205j = new ArrayList();

        /* renamed from: m, reason: collision with root package name */
        public int f35208m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f35209n = 0;

        /* renamed from: q, reason: collision with root package name */
        public String f35212q = "verify_match_property";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum ComponentType {
            ACTIVITY,
            SERVICE,
            BROADCAST
        }

        public Builder a(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input certSignerKey and certChainKey");
                return this;
            }
            this.f35202g.put(str, str2);
            return this;
        }

        public Builder b(String str, String str2) {
            this.f35201f.put(str, ServiceVerifyKit.d(this.f35201f.get(str), str2));
            this.f35203h.put(str, Integer.valueOf(this.f35208m));
            return this;
        }

        public Builder c(String str, String str2, int i11) {
            this.f35201f.put(str, ServiceVerifyKit.d(this.f35201f.get(str), str2));
            this.f35203h.put(str, Integer.valueOf(i11));
            return this;
        }

        public Builder d(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input propertyName");
                return this;
            }
            this.f35213r = str;
            return this;
        }

        public String e() {
            ServiceVerifyKit serviceVerifyKit = new ServiceVerifyKit();
            cr.a aVar = new cr.a(this.f35206k);
            this.f35202g.put(this.f35199d, this.f35200e);
            aVar.k(this.f35196a, this.f35197b, this.f35198c, this.f35201f, this.f35203h, this.f35207l, this.f35204i, this.f35205j, this.f35209n, this.f35212q, this.f35213r, this.f35210o, this.f35211p, this.f35202g);
            return serviceVerifyKit.b(aVar);
        }

        public Builder f(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input CN");
                return this;
            }
            this.f35197b = str;
            return this;
        }

        public Builder g(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input chain key");
                return this;
            }
            this.f35200e = str;
            return this;
        }

        public Builder h(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input signer key");
                return this;
            }
            this.f35199d = str;
            return this;
        }

        public Builder i(int i11, c... cVarArr) {
            if (cVarArr.length == 0) {
                er.b.f50106b.a("ServiceVerifyKit", "error input conditions");
                return this;
            }
            this.f35209n = i11;
            Collections.addAll(this.f35205j, cVarArr);
            return this;
        }

        public Builder j(Context context) {
            this.f35206k = context.getApplicationContext();
            return this;
        }

        public Builder k(int i11) {
            this.f35207l = i11;
            return this;
        }

        public Builder l(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input propertyKey");
                return this;
            }
            this.f35212q = str;
            return this;
        }

        public Builder m(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input OU");
                return this;
            }
            this.f35198c = str;
            return this;
        }

        public Builder n(List<String> list) {
            if (list.isEmpty()) {
                er.b.f50106b.a("ServiceVerifyKit", "error input preferred package name");
                return this;
            }
            this.f35204i = list;
            return this;
        }

        @Deprecated
        public Builder o(String str) {
            this.f35196a = str;
            return this;
        }

        public Builder p(Intent intent, ComponentType componentType) {
            if (intent == null) {
                er.b.f50106b.a("ServiceVerifyKit", "error input intent");
            } else {
                this.f35210o = intent;
            }
            if (componentType == null) {
                er.b.f50106b.a("ServiceVerifyKit", "error input type");
                return this;
            }
            this.f35211p = componentType;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Context f35214a;

        /* renamed from: b, reason: collision with root package name */
        public String f35215b;

        /* renamed from: c, reason: collision with root package name */
        public String f35216c = "AppGallery Verification";

        /* renamed from: d, reason: collision with root package name */
        public String f35217d = "Huawei CBG Cloud Security Signer";

        /* renamed from: e, reason: collision with root package name */
        public String f35218e = "com.huawei.appgallery.fingerprint_signature";

        /* renamed from: f, reason: collision with root package name */
        public String f35219f = "com.huawei.appgallery.sign_certchain";

        /* renamed from: g, reason: collision with root package name */
        public final Map<String, String[]> f35220g = new HashMap();

        public a(Context context) {
            this.f35214a = context;
        }

        public a a(String str, String str2) {
            this.f35220g.put(str, ServiceVerifyKit.d(this.f35220g.get(str), str2));
            return this;
        }

        public boolean b() {
            if (TextUtils.isEmpty(this.f35215b)) {
                er.b.f50106b.a("ServiceVerifyKit", "PackageName is null or empty!");
                return false;
            }
            try {
                PackageInfo packageInfo = this.f35214a.getPackageManager().getPackageInfo(this.f35215b, 192);
                if (packageInfo.applicationInfo == null) {
                    er.b.f50106b.a("ServiceVerifyKit", "skip package " + this.f35215b + " for ApplicationInfo is null");
                    return false;
                }
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    er.b.f50106b.a("ServiceVerifyKit", "skip package " + this.f35215b + " for no sign");
                    return false;
                }
                byte[] byteArray = signatureArr[0].toByteArray();
                if (byteArray.length == 0) {
                    er.b.f50106b.a("ServiceVerifyKit", "skip package " + this.f35215b + " for sign is empty");
                    return false;
                }
                try {
                    String c11 = dr.b.c(MessageDigest.getInstance("SHA-256").digest(byteArray), true);
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    if (bundle != null) {
                        cr.a aVar = new cr.a(this.f35214a);
                        HashMap hashMap = new HashMap();
                        hashMap.put(this.f35218e, this.f35219f);
                        aVar.k(null, this.f35216c, this.f35217d, this.f35220g, null, 0, null, null, 0, null, null, null, null, hashMap);
                        return aVar.m(bundle, c11, this.f35215b, this.f35218e, this.f35219f) || aVar.n(this.f35215b, c11);
                    }
                    er.b.f50106b.a("ServiceVerifyKit", "package" + this.f35215b + " metadata is null!");
                    return false;
                } catch (NoSuchAlgorithmException unused) {
                    er.b.f50106b.a("ServiceVerifyKit", "skip package " + this.f35215b + " for AlgorithmException");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                er.b.f50106b.a("ServiceVerifyKit", "get packageInfo from " + this.f35215b + " with NameNotFoundException");
                return false;
            } catch (Exception unused3) {
                er.b.f50106b.a("ServiceVerifyKit", "get packageInfo from " + this.f35215b + " with exception");
                return false;
            }
        }

        public a c(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input cn");
                return this;
            }
            this.f35216c = str;
            return this;
        }

        public a d(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input certChainKey");
                return this;
            }
            this.f35219f = str;
            return this;
        }

        public a e(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input certSignerKey");
                return this;
            }
            this.f35218e = str;
            return this;
        }

        public a f(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input ou");
                return this;
            }
            this.f35217d = str;
            return this;
        }

        public a g(String str) {
            if (TextUtils.isEmpty(str)) {
                er.b.f50106b.a("ServiceVerifyKit", "error input packageName");
                return this;
            }
            this.f35215b = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f35221a;

        /* renamed from: b, reason: collision with root package name */
        public String f35222b;

        public String a() {
            return this.f35221a;
        }

        public String b() {
            return this.f35222b;
        }
    }

    public ServiceVerifyKit() {
    }

    public static String[] d(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return strArr;
            }
        }
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    public final String b(cr.a aVar) {
        List<ar.a> h11 = aVar.h();
        if (h11 == null || h11.isEmpty()) {
            return null;
        }
        return new br.a().a(h11);
    }
}
