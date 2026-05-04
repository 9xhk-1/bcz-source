package cr;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import ct.d;
import dr.c;
import er.b;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f46824a;

    /* renamed from: b, reason: collision with root package name */
    public String f46825b;

    /* renamed from: c, reason: collision with root package name */
    public String f46826c;

    /* renamed from: g, reason: collision with root package name */
    public int f46830g;

    /* renamed from: k, reason: collision with root package name */
    public String f46834k;

    /* renamed from: l, reason: collision with root package name */
    public String f46835l;

    /* renamed from: m, reason: collision with root package name */
    public Intent f46836m;

    /* renamed from: n, reason: collision with root package name */
    public ServiceVerifyKit.Builder.ComponentType f46837n;

    /* renamed from: s, reason: collision with root package name */
    public Context f46842s;

    /* renamed from: t, reason: collision with root package name */
    public String f46843t;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, String[]> f46827d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public Map<String, Integer> f46828e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f46829f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public List<String> f46831h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public List<ServiceVerifyKit.c> f46832i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f46833j = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f46838o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f46839p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f46840q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f46841r = 0;

    public a(Context context) {
        this.f46842s = context;
    }

    public static String g(@NonNull String str) {
        b bVar;
        String str2;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(d.f46852f, String.class).invoke(null, str);
        } catch (ClassNotFoundException unused) {
            bVar = b.f50106b;
            str2 = "getSystemProperties ClassNotFoundException";
            bVar.a("MatchAppFinder", str2);
            return "";
        } catch (Exception unused2) {
            bVar = b.f50106b;
            str2 = "getSystemProperties Exception while getting system property";
            bVar.a("MatchAppFinder", str2);
            return "";
        }
    }

    public final int a(Bundle bundle, int i11) {
        if (!bundle.containsKey("ag.application.base_priority")) {
            return i11 + 1000;
        }
        try {
            return i11 + bundle.getInt("ag.application.base_priority");
        } catch (Exception unused) {
            b.f50106b.a("MatchAppFinder", "skip package " + bundle.getString("ag.application.base_priority") + " is not number");
            return i11 + 1000;
        }
    }

    public final int b(Bundle bundle, int i11, List<ServiceVerifyKit.c> list) {
        int i12 = 0;
        for (ServiceVerifyKit.c cVar : list) {
            if (i11 == 1) {
                if (!bundle.containsKey(cVar.a()) || !bundle.get(cVar.a()).toString().equals(cVar.b())) {
                    return 0;
                }
                i12 = 1;
            } else if (i11 != 2) {
                b.f50106b.a("MatchAppFinder", "error input preferred package name");
            } else if (bundle.containsKey(cVar.a()) && bundle.get(cVar.a()).toString().equals(cVar.b())) {
                i12++;
            }
        }
        return i12;
    }

    public final int c(Bundle bundle, String str) {
        if (!bundle.containsKey(this.f46834k)) {
            return 0;
        }
        if (!bundle.getString(this.f46834k).equalsIgnoreCase(str)) {
            return -1;
        }
        b.f50106b.c("MatchAppFinder", "matchProp is 1, MetaDataKey is " + str);
        return 1;
    }

    public final int d(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                i11 = 1;
            }
        }
        return i11;
    }

    public final ar.a e(PackageInfo packageInfo, String str, String str2, int i11) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        if (bundle == null) {
            return null;
        }
        int c11 = c(bundle, this.f46843t);
        if (!l(bundle, str, str2, i11)) {
            return null;
        }
        if (!this.f46831h.isEmpty()) {
            this.f46840q = d(str2, this.f46831h);
        }
        if (!this.f46832i.isEmpty()) {
            this.f46841r = b(bundle, this.f46833j, this.f46832i);
            b.f50106b.c("MatchAppFinder", "match conditions success, packageName is " + str2 + " condition type is " + this.f46833j + " condition number is " + this.f46841r);
        }
        return new ar.a(str2, a(bundle, this.f46838o), this.f46839p, c11, this.f46840q, this.f46841r);
    }

    public final String f(ResolveInfo resolveInfo) {
        ServiceVerifyKit.Builder.ComponentType componentType = this.f46837n;
        return ((componentType == ServiceVerifyKit.Builder.ComponentType.ACTIVITY || componentType == ServiceVerifyKit.Builder.ComponentType.BROADCAST) ? resolveInfo.activityInfo.applicationInfo : resolveInfo.serviceInfo.applicationInfo).packageName;
    }

    public List<ar.a> h() {
        PackageManager packageManager = this.f46842s.getPackageManager();
        List<ResolveInfo> i11 = i(packageManager);
        if (i11.size() == 0) {
            return null;
        }
        this.f46843t = TextUtils.isEmpty(this.f46835l) ? Build.MANUFACTURER : g(this.f46835l);
        return j(i11, packageManager, this.f46830g | 192);
    }

    public final List<ResolveInfo> i(PackageManager packageManager) {
        ServiceVerifyKit.Builder.ComponentType componentType = this.f46837n;
        return componentType == null ? packageManager.queryIntentServices(new Intent(this.f46824a), this.f46830g) : componentType == ServiceVerifyKit.Builder.ComponentType.ACTIVITY ? packageManager.queryIntentActivities(this.f46836m, this.f46830g) : componentType == ServiceVerifyKit.Builder.ComponentType.BROADCAST ? packageManager.queryBroadcastReceivers(this.f46836m, this.f46830g) : packageManager.queryIntentServices(this.f46836m, this.f46830g);
    }

    public final List<ar.a> j(List<ResolveInfo> list, PackageManager packageManager, int i11) {
        b bVar;
        StringBuilder sb2;
        String str;
        PackageInfo packageInfo;
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            String f11 = f(resolveInfo);
            try {
                packageInfo = packageManager.getPackageInfo(f11, i11);
            } catch (PackageManager.NameNotFoundException unused) {
                bVar = b.f50106b;
                sb2 = new StringBuilder();
                sb2.append("skip package ");
                sb2.append(f11);
                str = " for PackageInfo is null with NameNotFoundException";
            } catch (Exception unused2) {
                bVar = b.f50106b;
                sb2 = new StringBuilder();
                sb2.append("skip package ");
                sb2.append(f11);
                str = " for PackageInfo is null with Exception";
            }
            if (packageInfo.applicationInfo == null) {
                bVar = b.f50106b;
                sb2 = new StringBuilder();
                sb2.append("skip package ");
                sb2.append(f11);
                str = " for ApplicationInfo is null";
            } else {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length <= 0) {
                    bVar = b.f50106b;
                    sb2 = new StringBuilder();
                    sb2.append("skip package ");
                    sb2.append(f11);
                    str = " for no sign";
                } else {
                    byte[] byteArray = signatureArr[0].toByteArray();
                    if (byteArray.length == 0) {
                        bVar = b.f50106b;
                        sb2 = new StringBuilder();
                        sb2.append("skip package ");
                        sb2.append(f11);
                        str = " for sign is empty";
                    } else {
                        try {
                            ar.a e11 = e(packageInfo, dr.b.c(MessageDigest.getInstance("SHA-256").digest(byteArray), true), f11, resolveInfo.priority);
                            if (e11 != null) {
                                arrayList.add(e11);
                            }
                        } catch (NoSuchAlgorithmException unused3) {
                            bVar = b.f50106b;
                            sb2 = new StringBuilder();
                            sb2.append("skip package ");
                            sb2.append(f11);
                            str = " for AlgorithmException";
                        }
                    }
                }
            }
            sb2.append(str);
            bVar.a("MatchAppFinder", sb2.toString());
        }
        return arrayList;
    }

    public void k(String str, String str2, String str3, Map<String, String[]> map, Map<String, Integer> map2, int i11, List<String> list, List<ServiceVerifyKit.c> list2, int i12, String str4, String str5, Intent intent, ServiceVerifyKit.Builder.ComponentType componentType, Map<String, String> map3) {
        this.f46824a = str;
        this.f46825b = str2;
        this.f46826c = str3;
        this.f46827d = map;
        this.f46828e = map2;
        this.f46830g = i11;
        this.f46831h = list;
        this.f46832i = list2;
        this.f46833j = i12;
        this.f46834k = str4;
        this.f46835l = str5;
        this.f46836m = intent;
        this.f46837n = componentType;
        this.f46829f = map3;
    }

    public final boolean l(Bundle bundle, String str, String str2, int i11) {
        for (Map.Entry<String, String> entry : this.f46829f.entrySet()) {
            if (bundle.containsKey(entry.getKey()) || bundle.containsKey(entry.getValue())) {
                if (p(bundle, str2, str, entry.getKey(), entry.getValue())) {
                    this.f46839p = 0;
                    this.f46838o = i11;
                    return true;
                }
                b.f50106b.a("MatchAppFinder", "checkSinger failed, packageName is " + str2);
            }
        }
        if (!n(str2, str)) {
            return false;
        }
        this.f46839p = 1;
        this.f46838o = this.f46828e.get(str2).intValue();
        b.f50106b.c("MatchAppFinder", "Legacy is success, packageName is " + str2);
        return true;
    }

    public boolean m(Bundle bundle, String str, String str2, String str3, String str4) {
        String str5;
        b bVar;
        StringBuilder sb2;
        if (bundle == null) {
            bVar = b.f50106b;
            sb2 = new StringBuilder();
            sb2.append("package");
            sb2.append(str2);
            sb2.append(" metadata is null!");
        } else {
            if (bundle.containsKey(str3) && bundle.containsKey(str4)) {
                str5 = str2;
                if (p(bundle, str5, str, str3, str4)) {
                    b.f50106b.a("MatchAppFinder", "checkSinger success, packageName is " + str5);
                    return true;
                }
            } else {
                str5 = str2;
            }
            bVar = b.f50106b;
            sb2 = new StringBuilder();
            sb2.append("checkSinger failed, packageName is ");
            sb2.append(str5);
        }
        bVar.a("MatchAppFinder", sb2.toString());
        return false;
    }

    public boolean n(String str, String str2) {
        String[] strArr;
        if (this.f46827d.containsKey(str) && (strArr = this.f46827d.get(str)) != null) {
            for (String str3 : strArr) {
                if (str2.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(String str, String str2, String str3) {
        b bVar;
        String str4;
        byte[] bArr;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            bVar = b.f50106b;
            str4 = "args is invalid";
        } else {
            List<X509Certificate> k11 = c.k(str3);
            if (k11.size() == 0) {
                bVar = b.f50106b;
                str4 = "certChain is empty";
            } else if (c.h(c.b(this.f46842s), k11)) {
                X509Certificate x509Certificate = k11.get(0);
                if (!c.f(x509Certificate, this.f46825b)) {
                    bVar = b.f50106b;
                    str4 = "CN is invalid";
                } else if (c.m(x509Certificate, this.f46826c)) {
                    try {
                        bArr = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e11) {
                        b.f50106b.b("MatchAppFinder", "checkCertChain UnsupportedEncodingException:", e11);
                        bArr = null;
                    }
                    if (c.i(x509Certificate, bArr, dr.a.a(str2))) {
                        return true;
                    }
                    bVar = b.f50106b;
                    str4 = "signature is invalid";
                } else {
                    bVar = b.f50106b;
                    str4 = "OU is invalid";
                }
            } else {
                bVar = b.f50106b;
                str4 = "failed to verify cert chain";
            }
        }
        bVar.a("MatchAppFinder", str4);
        return false;
    }

    public final boolean p(Bundle bundle, String str, String str2, String str3, String str4) {
        b bVar;
        String str5;
        if (bundle.containsKey(str3) && bundle.containsKey(str4)) {
            if (o(str + "&" + str2, bundle.getString(str3), bundle.getString(str4))) {
                return true;
            }
            bVar = b.f50106b;
            str5 = "checkSinger failed";
        } else {
            bVar = b.f50106b;
            str5 = "skip package " + str + " for no signer or no certChain";
        }
        bVar.a("MatchAppFinder", str5);
        return false;
    }
}
