package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public class gj implements gn {

    /* renamed from: a, reason: collision with root package name */
    private String f45618a;

    /* renamed from: a, reason: collision with other field name */
    private List<gj> f465a;

    /* renamed from: a, reason: collision with other field name */
    private String[] f466a;

    /* renamed from: b, reason: collision with root package name */
    private String f45619b;

    /* renamed from: b, reason: collision with other field name */
    private String[] f467b;

    /* renamed from: c, reason: collision with root package name */
    private String f45620c;

    public gj(String str, String str2, String[] strArr, String[] strArr2) {
        this.f465a = null;
        this.f45618a = str;
        this.f45619b = str2;
        this.f466a = strArr;
        this.f467b = strArr2;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f45618a);
        bundle.putString("ext_ns", this.f45619b);
        bundle.putString("ext_text", this.f45620c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f466a;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f466a;
                if (i11 >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i11], this.f467b[i11]);
                i11++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<gj> list = this.f465a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", a(this.f465a));
        }
        return bundle;
    }

    public String b() {
        return this.f45619b;
    }

    public String c() {
        return !TextUtils.isEmpty(this.f45620c) ? gx.b(this.f45620c) : this.f45620c;
    }

    @Override // com.xiaomi.push.gn
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(this.f45618a);
        if (!TextUtils.isEmpty(this.f45619b)) {
            sb2.append(" ");
            sb2.append("xmlns=");
            sb2.append("\"");
            sb2.append(this.f45619b);
            sb2.append("\"");
        }
        String[] strArr = this.f466a;
        if (strArr != null && strArr.length > 0) {
            for (int i11 = 0; i11 < this.f466a.length; i11++) {
                if (!TextUtils.isEmpty(this.f467b[i11])) {
                    sb2.append(" ");
                    sb2.append(this.f466a[i11]);
                    sb2.append("=\"");
                    sb2.append(gx.a(this.f467b[i11]));
                    sb2.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.f45620c)) {
            List<gj> list = this.f465a;
            if (list == null || list.size() <= 0) {
                sb2.append("/>");
                return sb2.toString();
            }
            sb2.append(">");
            Iterator<gj> it = this.f465a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().d());
            }
        } else {
            sb2.append(">");
            sb2.append(this.f45620c);
        }
        sb2.append("</");
        sb2.append(this.f45618a);
        sb2.append(">");
        return sb2.toString();
    }

    public String toString() {
        return d();
    }

    public gj(String str, String str2, String[] strArr, String[] strArr2, String str3, List<gj> list) {
        this.f45618a = str;
        this.f45619b = str2;
        this.f466a = strArr;
        this.f467b = strArr2;
        this.f45620c = str3;
        this.f465a = list;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Parcelable m5986a() {
        return a();
    }

    public static gj a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i11 = 0;
        for (String str : keySet) {
            strArr[i11] = str;
            strArr2[i11] = bundle2.getString(str);
            i11++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add(a((Bundle) parcelable));
            }
        } else {
            arrayList = null;
        }
        return new gj(string, string2, strArr, strArr2, string3, arrayList);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5987a() {
        return this.f45618a;
    }

    public String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.f466a == null) {
            return null;
        }
        int i11 = 0;
        while (true) {
            String[] strArr = this.f466a;
            if (i11 >= strArr.length) {
                return null;
            }
            if (str.equals(strArr[i11])) {
                return this.f467b[i11];
            }
            i11++;
        }
    }

    public void a(gj gjVar) {
        if (this.f465a == null) {
            this.f465a = new ArrayList();
        }
        if (this.f465a.contains(gjVar)) {
            return;
        }
        this.f465a.add(gjVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5988a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f45620c = str;
        } else {
            this.f45620c = gx.a(str);
        }
    }

    public static Parcelable[] a(List<gj> list) {
        return a((gj[]) list.toArray(new gj[list.size()]));
    }

    public static Parcelable[] a(gj[] gjVarArr) {
        if (gjVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[gjVarArr.length];
        for (int i11 = 0; i11 < gjVarArr.length; i11++) {
            parcelableArr[i11] = gjVarArr[i11].m5986a();
        }
        return parcelableArr;
    }
}
