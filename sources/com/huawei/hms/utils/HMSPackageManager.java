package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Pair;
import com.alipay.sdk.m.f0.c;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class HMSPackageManager {

    /* renamed from: o, reason: collision with root package name */
    private static HMSPackageManager f36716o;

    /* renamed from: p, reason: collision with root package name */
    private static final Object f36717p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static final Object f36718q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private static final Object f36719r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final Map<String, String> f36720s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f36721a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageManagerHelper f36722b;

    /* renamed from: c, reason: collision with root package name */
    private String f36723c;

    /* renamed from: d, reason: collision with root package name */
    private String f36724d;

    /* renamed from: e, reason: collision with root package name */
    private int f36725e;

    /* renamed from: f, reason: collision with root package name */
    private String f36726f;

    /* renamed from: g, reason: collision with root package name */
    private String f36727g;

    /* renamed from: h, reason: collision with root package name */
    private String f36728h;

    /* renamed from: i, reason: collision with root package name */
    private String f36729i;

    /* renamed from: j, reason: collision with root package name */
    private int f36730j;

    /* renamed from: k, reason: collision with root package name */
    private int f36731k;

    /* renamed from: l, reason: collision with root package name */
    private long f36732l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f36733m;

    /* renamed from: n, reason: collision with root package name */
    private int f36734n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {

        /* renamed from: a, reason: collision with root package name */
        private String f36735a;

        /* renamed from: b, reason: collision with root package name */
        private String f36736b;

        /* renamed from: c, reason: collision with root package name */
        private String f36737c;

        /* renamed from: d, reason: collision with root package name */
        private String f36738d;

        /* renamed from: e, reason: collision with root package name */
        private String f36739e;

        /* renamed from: f, reason: collision with root package name */
        private Long f36740f;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j11) {
            this.f36735a = str;
            this.f36736b = str2;
            this.f36737c = str3;
            this.f36738d = str4;
            this.f36739e = str5;
            this.f36740f = Long.valueOf(j11);
        }

        @Override // java.lang.Comparable
        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            return TextUtils.equals(this.f36739e, packagePriorityInfo.f36739e) ? this.f36740f.compareTo(packagePriorityInfo.f36740f) : this.f36739e.compareTo(packagePriorityInfo.f36739e);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<ResolveInfo> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            String str2 = resolveInfo2.serviceInfo.applicationInfo.packageName;
            if (HMSPackageManager.f36720s.containsKey(str) && HMSPackageManager.f36720s.containsKey(str2)) {
                return str.compareTo(str2);
            }
            if (HMSPackageManager.f36720s.containsKey(str)) {
                return -1;
            }
            return HMSPackageManager.f36720s.containsKey(str2) ? 1 : 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            try {
                List<ResolveInfo> queryIntentServices = HMSPackageManager.this.f36721a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (queryIntentServices == null || queryIntentServices.size() == 0) {
                    return;
                }
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                        HMSPackageManager.this.d();
                    }
                }
                HMSLog.i("HMSPackageManager", "quit asyncOnceCheckMDMState");
            } catch (Exception e11) {
                HMSLog.e("HMSPackageManager", "asyncOnceCheckMDMState query hms action failed. " + e11.getMessage());
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f36720s = hashMap;
        hashMap.put("com.huawei.hwid", "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05");
        hashMap.put("com.huawei.hwid.tv", "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C");
    }

    private HMSPackageManager(Context context) {
        this.f36721a = context;
        this.f36722b = new PackageManagerHelper(context);
    }

    private boolean c(String str, String str2) {
        return Objects.equals(str2, this.f36722b.getPackageSigningCertificate(str)) || Objects.equals(str2, this.f36722b.getPackageSignature(str));
    }

    private Pair<String, String> d(String str, String str2) {
        if (!f36720s.containsKey(str) || !"E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(str2)) {
            return null;
        }
        this.f36734n = 3;
        return new Pair<>(str, str2);
    }

    private void e(String str) {
        if (SystemUtils.isHuawei() || SystemUtils.isSystemApp(this.f36721a, str) || Build.VERSION.SDK_INT < 28 || b(str)) {
            AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        }
    }

    private void f() {
        synchronized (f36718q) {
            this.f36723c = null;
            this.f36724d = null;
            this.f36725e = 0;
        }
    }

    private Pair<String, String> g() {
        try {
            List<ResolveInfo> queryIntentServices = this.f36721a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (queryIntentServices == null || queryIntentServices.size() == 0) {
                HMSLog.e("HMSPackageManager", "query hms action, resolveInfoList is null or empty.");
                return null;
            }
            a(queryIntentServices);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                String packageSigningCertificate = this.f36722b.getPackageSigningCertificate(str);
                String packageSignature = this.f36722b.getPackageSignature(str);
                Pair<String, String> d11 = d(str, packageSigningCertificate);
                if (d11 != null) {
                    HMSLog.i("HMSPackageManager", "signature V3 check success");
                    return d11;
                }
                Pair<String, String> a11 = a(resolveInfo.serviceInfo.metaData, str, packageSigningCertificate, packageSignature);
                if (a11 != null) {
                    HMSLog.i("HMSPackageManager", "DSS signature check success");
                    return a11;
                }
                Pair<String, String> a12 = a(str, packageSignature);
                if (a12 != null) {
                    HMSLog.i("HMSPackageManager", "signature V2 check success");
                    return a12;
                }
            }
            return null;
        } catch (Exception e11) {
            HMSLog.e("HMSPackageManager", "getHmsPackageName query hms action failed. " + e11.getMessage());
            return null;
        }
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f36717p) {
            try {
                if (f36716o == null && context != null) {
                    if (context.getApplicationContext() != null) {
                        f36716o = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        f36716o = new HMSPackageManager(context);
                    }
                    f36716o.k();
                    f36716o.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f36716o;
    }

    private Pair<String, String> h() {
        Pair<String, String> g11 = g();
        if (g11 != null) {
            HMSLog.i("HMSPackageManager", "aidlService pkgName: " + ((String) g11.first));
            this.f36728h = "com.huawei.hms.core.aidlservice";
            this.f36729i = null;
            return g11;
        }
        ArrayList<PackagePriorityInfo> i11 = i();
        if (i11 == null) {
            HMSLog.e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        Iterator<PackagePriorityInfo> it = i11.iterator();
        while (it.hasNext()) {
            PackagePriorityInfo next = it.next();
            String str = next.f36735a;
            String str2 = next.f36736b;
            String str3 = next.f36737c;
            String str4 = next.f36738d;
            String packageSignature = this.f36722b.getPackageSignature(str);
            if (a(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                HMSLog.i("HMSPackageManager", "result: " + str + j2.O + str2 + j2.O + next.f36740f);
                this.f36728h = PackageConstants.GENERAL_SERVICES_ACTION;
                d(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    private ArrayList<PackagePriorityInfo> i() {
        try {
            List<ResolveInfo> queryIntentServices = this.f36721a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                HMSLog.e("HMSPackageManager", "query aglite action, resolveInfoList is null or empty");
                return null;
            }
            ArrayList<PackagePriorityInfo> arrayList = new ArrayList<>();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                long packageFirstInstallTime = this.f36722b.getPackageFirstInstallTime(str);
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.e("HMSPackageManager", "package " + str + " get metaData is null");
                } else {
                    String a11 = a(bundle, "hms_app_checker_config");
                    String a12 = a(a11);
                    if (TextUtils.isEmpty(a12)) {
                        HMSLog.i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + a11);
                    } else {
                        String a13 = a(bundle, "hms_app_signer_v2");
                        if (TextUtils.isEmpty(a13)) {
                            HMSLog.i("HMSPackageManager", "get signerV2 fail.");
                        } else {
                            String a14 = a(bundle, "hms_app_cert_chain");
                            if (TextUtils.isEmpty(a14)) {
                                HMSLog.i("HMSPackageManager", "get certChain fail.");
                            } else {
                                HMSLog.i("HMSPackageManager", "add: " + str + j2.O + a11 + j2.O + packageFirstInstallTime);
                                arrayList.add(new PackagePriorityInfo(str, a11, a13, a14, a12, packageFirstInstallTime));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (Exception e11) {
            HMSLog.e("HMSPackageManager", "query aglite action failed. " + e11.getMessage());
            return null;
        }
    }

    private void j() {
        synchronized (f36718q) {
            try {
                Pair<String, String> g11 = g();
                if (g11 == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                    f();
                    return;
                }
                String str = (String) g11.first;
                this.f36723c = str;
                this.f36724d = (String) g11.second;
                this.f36725e = this.f36722b.getPackageVersionCode(str);
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f36723c + " version: " + this.f36725e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k() {
        synchronized (f36718q) {
            try {
                Pair<String, String> h11 = h();
                if (h11 == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                    e();
                    AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                    return;
                }
                this.f36726f = (String) h11.first;
                this.f36727g = (String) h11.second;
                this.f36730j = this.f36722b.getPackageVersionCode(getHMSPackageNameForMultiService());
                e(this.f36726f);
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f36726f + " version: " + this.f36730j);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean l() {
        Bundle bundle;
        PackageManager packageManager = this.f36721a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (AndroidException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e11) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e11);
        }
        if (TextUtils.isEmpty(this.f36728h) || (!this.f36728h.equals(PackageConstants.GENERAL_SERVICES_ACTION) && !this.f36728h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        }
        HMSLog.i("HMSPackageManager", "action = " + this.f36728h + " exist");
        return false;
    }

    public String getHMSFingerprint() {
        String str = this.f36724d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f36723c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f36722b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                j();
            }
            String str2 = this.f36723c;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f36726f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f36722b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                k();
            }
            String str2 = this.f36726f;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (f36717p) {
            try {
                refresh();
                PackageManagerHelper.PackageStates packageStates = this.f36722b.getPackageStates(this.f36723c);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    f();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.f36723c) && d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.f36723c, this.f36724d)) ? packageStates : packageStates2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (f36717p) {
            try {
                refreshForMultiService();
                PackageManagerHelper.PackageStates packageStates = this.f36722b.getPackageStates(this.f36726f);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    e();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.f36726f) && d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || c(this.f36726f, this.f36727g)) ? packageStates : packageStates2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f36722b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f36722b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.f36728h) ? this.f36728h : "com.huawei.hms.core.aidlservice";
    }

    public boolean hmsVerHigherThan(int i11) {
        if (this.f36725e >= i11 || !l()) {
            return true;
        }
        int packageVersionCode = this.f36722b.getPackageVersionCode(getHMSPackageName());
        this.f36725e = packageVersionCode;
        return packageVersionCode >= i11;
    }

    public boolean isApkNeedUpdate(int i11) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i11);
        return hmsVersionCode < i11;
    }

    public boolean isApkUpdateNecessary(int i11) {
        if (isUpdateHmsForThirdPartyDevice()) {
            return true;
        }
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i11);
        return l() && hmsVersionCode < i11;
    }

    public boolean isUpdateHmsForThirdPartyDevice() {
        return "com.huawei.hwid".equals(this.f36726f) && AgHmsUpdateState.getInstance().isUpdateHms();
    }

    public boolean isUseOldCertificate() {
        return this.f36733m;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f36723c) || TextUtils.isEmpty(this.f36724d)) {
            j();
        }
        c(this.f36723c);
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f36726f) || TextUtils.isEmpty(this.f36727g)) {
            k();
        }
        c(this.f36726f);
    }

    public void resetMultiServiceState() {
        e();
    }

    public void setUseOldCertificate(boolean z11) {
        this.f36733m = z11;
    }

    private boolean b(String str) {
        return !"com.huawei.hwid".equals(str) || this.f36734n == 3;
    }

    private void a(List<ResolveInfo> list) {
        if (list.size() <= 1) {
            return;
        }
        Collections.sort(list, new a());
    }

    private boolean b(String str, String str2) {
        Map<String, String> map = f36720s;
        return map.containsKey(str) && map.get(str).equalsIgnoreCase(str2);
    }

    private void c(String str) {
        if ("com.huawei.hwid".equals(str) && AgHmsUpdateState.getInstance().isUpdateHms() && this.f36722b.getPackageVersionCode(str) >= AgHmsUpdateState.getInstance().getTargetVersionCode()) {
            AgHmsUpdateState.getInstance().resetUpdateState();
            HMSLog.i("HMSPackageManager", "refresh update state for HMS V3");
        }
    }

    private Pair<String, String> a(Bundle bundle, String str, String str2, String str3) {
        String str4;
        if (bundle == null) {
            HMSLog.e("HMSPackageManager", "DSS check: " + str + " for metadata is null");
            return null;
        }
        this.f36734n = 2;
        if (a(bundle, str, str2)) {
            HMSLog.i("HMSPackageManager", "support DSS V3 check");
            str3 = str2;
            str4 = "hms_app_signer_v3";
        } else {
            str4 = "hms_app_signer";
        }
        if (!bundle.containsKey(str4)) {
            HMSLog.e("HMSPackageManager", "skip package " + str + " for no " + str4);
            return null;
        }
        if (!bundle.containsKey("hms_app_cert_chain")) {
            HMSLog.e("HMSPackageManager", "skip package " + str + " for no cert chain");
            return null;
        }
        if (!a(str + "&" + str3, bundle.getString(str4), bundle.getString("hms_app_cert_chain"))) {
            HMSLog.e("HMSPackageManager", "checkSigner failed");
            return null;
        }
        if (str4.equals("hms_app_signer_v3")) {
            this.f36734n = 3;
        }
        return new Pair<>(str, str3);
    }

    private void b() {
        new Thread(new b(), "Thread-asyncOnceCheckMDMState").start();
    }

    private void d(String str) {
        String a11 = a(str);
        if (TextUtils.isEmpty(a11)) {
            return;
        }
        this.f36729i = a11.substring(9);
    }

    private void e() {
        synchronized (f36718q) {
            this.f36726f = null;
            this.f36727g = null;
            this.f36728h = null;
            this.f36729i = null;
            this.f36730j = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        synchronized (f36719r) {
            try {
                HMSLog.i("HMSPackageManager", "enter checkHmsIsSpoof");
                long packageFirstInstallTime = this.f36722b.getPackageFirstInstallTime("com.huawei.hwid");
                if (this.f36731k != 3 && this.f36732l == packageFirstInstallTime) {
                    HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + a(this.f36731k));
                    return this.f36731k;
                }
                this.f36731k = c() ? 2 : 1;
                this.f36732l = this.f36722b.getPackageFirstInstallTime("com.huawei.hwid");
                HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof state: " + a(this.f36731k));
                return this.f36731k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f36721a);
        if (hmsPath == null) {
            HMSLog.i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    private Pair<String, String> a(String str, String str2) {
        if (b(str, str2)) {
            return new Pair<>(str, str2);
        }
        HMSLog.w("HMSPackageManager", "check sign fail: " + str + "_" + str2);
        return null;
    }

    private boolean a(Bundle bundle, String str, String str2) {
        return bundle.containsKey("hms_app_signer_v3") && !b(str, str2) && Build.VERSION.SDK_INT >= 28;
    }

    private String a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            HMSLog.e("HMSPackageManager", "no " + str + " in metaData");
            return null;
        }
        return bundle.getString(str);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("priority=");
        if (indexOf == -1) {
            HMSLog.e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int indexOf2 = str.indexOf(",", indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        return str.substring(indexOf, indexOf2);
    }

    private boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            List<X509Certificate> b11 = com.huawei.hms.device.a.b(str3);
            if (b11.size() == 0) {
                HMSLog.e("HMSPackageManager", "certChain is empty");
                return false;
            }
            if (!com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.f36721a), b11)) {
                HMSLog.e("HMSPackageManager", "failed to verify cert chain");
                return false;
            }
            X509Certificate x509Certificate = b11.get(b11.size() - 1);
            if (!com.huawei.hms.device.a.a(x509Certificate, "Huawei CBG HMS")) {
                HMSLog.e("HMSPackageManager", "CN is invalid");
                return false;
            }
            if (!com.huawei.hms.device.a.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                HMSLog.e("HMSPackageManager", "OU is invalid");
                return false;
            }
            if (com.huawei.hms.device.a.a(x509Certificate, str, str2)) {
                return true;
            }
            HMSLog.e("HMSPackageManager", "signature is invalid: " + str);
            return false;
        }
        HMSLog.e("HMSPackageManager", "args is invalid");
        return false;
    }

    private static String a(int i11) {
        if (i11 == 1) {
            return "SPOOFED";
        }
        if (i11 == 2) {
            return c.f10532p;
        }
        if (i11 == 3) {
            return "UNCHECKED";
        }
        HMSLog.e("HMSPackageManager", "invalid checkMDM state: " + i11);
        return "";
    }
}
