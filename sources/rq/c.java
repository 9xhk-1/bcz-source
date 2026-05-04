package rq;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.ServiceDiscovery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f84526a;

    public static class b implements Serializable, Comparator<Map.Entry<String, Integer>> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    public c(Context context) {
        this.f84526a = context;
    }

    public List<qq.c> a() {
        Log.i("AGC_Registrar", "getServices");
        List<String> c11 = c();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = c11.iterator();
        while (it.hasNext()) {
            qq.d b11 = b(it.next());
            if (b11 != null) {
                b11.b(this.f84526a);
                List<qq.c> a11 = b11.a(this.f84526a);
                if (a11 != null) {
                    arrayList.addAll(a11);
                }
            }
        }
        Log.i("AGC_Registrar", "services:" + arrayList.size());
        return arrayList;
    }

    public final <T extends qq.d> T b(String str) {
        StringBuilder sb2;
        String sb3;
        try {
            Class<?> cls = Class.forName(str);
            if (qq.d.class.isAssignableFrom(cls)) {
                return (T) Class.forName(str).newInstance();
            }
            Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e11) {
            sb3 = "Can not found service class, " + e11.getMessage();
            Log.e("AGC_Registrar", sb3);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("instantiate service class exception ");
            sb2.append(e.getLocalizedMessage());
            sb3 = sb2.toString();
            Log.e("AGC_Registrar", sb3);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            sb2 = new StringBuilder();
            sb2.append("instantiate service class exception ");
            sb2.append(e.getLocalizedMessage());
            sb3 = sb2.toString();
            Log.e("AGC_Registrar", sb3);
            return null;
        }
    }

    public final List<String> c() {
        StringBuilder sb2;
        ArrayList arrayList = new ArrayList();
        Bundle d11 = d();
        if (d11 != null) {
            HashMap hashMap = new HashMap(10);
            for (String str : d11.keySet()) {
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(d11.getString(str))) {
                    String[] split = str.split(":");
                    if (split.length == 2) {
                        try {
                            hashMap.put(split[0], Integer.valueOf(split[1]));
                        } catch (NumberFormatException e11) {
                            sb2 = new StringBuilder();
                            sb2.append("registrar configuration format error:");
                            str = e11.getMessage();
                        }
                    } else if (split.length == 1) {
                        hashMap.put(split[0], 1000);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("registrar configuration error, ");
                        sb2.append(str);
                        Log.e("AGC_Registrar", sb2.toString());
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList2, new b());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
        }
        return arrayList;
    }

    public final Bundle d() {
        ServiceInfo serviceInfo;
        PackageManager packageManager = this.f84526a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(this.f84526a, (Class<?>) ServiceDiscovery.class), 128);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e11.getLocalizedMessage());
        }
        if (serviceInfo != null) {
            return serviceInfo.metaData;
        }
        Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
        return null;
    }
}
