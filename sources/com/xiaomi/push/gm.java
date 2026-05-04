package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public abstract class gm {

    /* renamed from: a, reason: collision with root package name */
    private static long f45639a;

    /* renamed from: a, reason: collision with other field name */
    public static final DateFormat f472a;

    /* renamed from: c, reason: collision with root package name */
    private static String f45641c;

    /* renamed from: a, reason: collision with other field name */
    private gq f473a;

    /* renamed from: a, reason: collision with other field name */
    private List<gj> f474a;

    /* renamed from: a, reason: collision with other field name */
    private final Map<String, Object> f475a;

    /* renamed from: d, reason: collision with root package name */
    private String f45642d;

    /* renamed from: e, reason: collision with root package name */
    private String f45643e;

    /* renamed from: f, reason: collision with root package name */
    private String f45644f;

    /* renamed from: g, reason: collision with root package name */
    private String f45645g;

    /* renamed from: h, reason: collision with root package name */
    private String f45646h;

    /* renamed from: i, reason: collision with root package name */
    private String f45647i;

    /* renamed from: a, reason: collision with other field name */
    protected static final String f471a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: b, reason: collision with root package name */
    private static String f45640b = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f472a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f45641c = gx.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        f45639a = 0L;
    }

    public gm() {
        this.f45642d = f45640b;
        this.f45643e = null;
        this.f45644f = null;
        this.f45645g = null;
        this.f45646h = null;
        this.f45647i = null;
        this.f474a = new CopyOnWriteArrayList();
        this.f475a = new HashMap();
        this.f473a = null;
    }

    public static synchronized String i() {
        String sb2;
        synchronized (gm.class) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f45641c);
            long j11 = f45639a;
            f45639a = 1 + j11;
            sb3.append(Long.toString(j11));
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public static String q() {
        return f471a;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f45642d)) {
            bundle.putString("ext_ns", this.f45642d);
        }
        if (!TextUtils.isEmpty(this.f45645g)) {
            bundle.putString("ext_from", this.f45645g);
        }
        if (!TextUtils.isEmpty(this.f45644f)) {
            bundle.putString("ext_to", this.f45644f);
        }
        if (!TextUtils.isEmpty(this.f45643e)) {
            bundle.putString("ext_pkt_id", this.f45643e);
        }
        if (!TextUtils.isEmpty(this.f45646h)) {
            bundle.putString("ext_chid", this.f45646h);
        }
        gq gqVar = this.f473a;
        if (gqVar != null) {
            bundle.putBundle("ext_ERROR", gqVar.a());
        }
        List<gj> list = this.f474a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<gj> it = this.f474a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Bundle a11 = it.next().a();
                if (a11 != null) {
                    bundleArr[i11] = a11;
                    i11++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* renamed from: a */
    public abstract String mo5990a();

    public synchronized Collection<String> b() {
        if (this.f475a == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(new HashSet(this.f475a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gm gmVar = (gm) obj;
            gq gqVar = this.f473a;
            if (gqVar == null ? gmVar.f473a != null : !gqVar.equals(gmVar.f473a)) {
                return false;
            }
            String str = this.f45645g;
            if (str == null ? gmVar.f45645g != null : !str.equals(gmVar.f45645g)) {
                return false;
            }
            if (!this.f474a.equals(gmVar.f474a)) {
                return false;
            }
            String str2 = this.f45643e;
            if (str2 == null ? gmVar.f45643e != null : !str2.equals(gmVar.f45643e)) {
                return false;
            }
            String str3 = this.f45646h;
            if (str3 == null ? gmVar.f45646h != null : !str3.equals(gmVar.f45646h)) {
                return false;
            }
            Map<String, Object> map = this.f475a;
            if (map == null ? gmVar.f475a != null : !map.equals(gmVar.f475a)) {
                return false;
            }
            String str4 = this.f45644f;
            if (str4 == null ? gmVar.f45644f != null : !str4.equals(gmVar.f45644f)) {
                return false;
            }
            String str5 = this.f45642d;
            String str6 = gmVar.f45642d;
            if (str5 == null ? str6 == null : str5.equals(str6)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45642d;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45643e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45644f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45645g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f45646h;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f474a.hashCode()) * 31) + this.f475a.hashCode()) * 31;
        gq gqVar = this.f473a;
        return hashCode5 + (gqVar != null ? gqVar.hashCode() : 0);
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.f45643e)) {
            return null;
        }
        if (this.f45643e == null) {
            this.f45643e = i();
        }
        return this.f45643e;
    }

    public String k() {
        return this.f45646h;
    }

    public String l() {
        return this.f45644f;
    }

    public String m() {
        return this.f45645g;
    }

    public String n() {
        return this.f45647i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:37|(2:38|39)|(6:41|42|43|44|46|47)|48|49|51|21) */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String o() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gm.o():java.lang.String");
    }

    public String p() {
        return this.f45642d;
    }

    public gm(Bundle bundle) {
        this.f45642d = f45640b;
        this.f45643e = null;
        this.f45644f = null;
        this.f45645g = null;
        this.f45646h = null;
        this.f45647i = null;
        this.f474a = new CopyOnWriteArrayList();
        this.f475a = new HashMap();
        this.f473a = null;
        this.f45644f = bundle.getString("ext_to");
        this.f45645g = bundle.getString("ext_from");
        this.f45646h = bundle.getString("ext_chid");
        this.f45643e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f474a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                gj a11 = gj.a((Bundle) parcelable);
                if (a11 != null) {
                    this.f474a.add(a11);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f473a = new gq(bundle2);
        }
    }

    public gj a(String str) {
        return a(str, null);
    }

    public void k(String str) {
        this.f45643e = str;
    }

    public void l(String str) {
        this.f45646h = str;
    }

    public void m(String str) {
        this.f45644f = str;
    }

    public void n(String str) {
        this.f45645g = str;
    }

    public void o(String str) {
        this.f45647i = str;
    }

    public gj a(String str, String str2) {
        for (gj gjVar : this.f474a) {
            if (str2 == null || str2.equals(gjVar.b())) {
                if (str.equals(gjVar.m5987a())) {
                    return gjVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public gq m5991a() {
        return this.f473a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Object m5992a(String str) {
        Map<String, Object> map = this.f475a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Collection<gj> m5993a() {
        if (this.f474a == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(new ArrayList(this.f474a));
    }

    public void a(gj gjVar) {
        this.f474a.add(gjVar);
    }

    public void a(gq gqVar) {
        this.f473a = gqVar;
    }
}
