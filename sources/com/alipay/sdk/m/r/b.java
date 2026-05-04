package com.alipay.sdk.m.r;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public a f10983a;

    /* renamed from: b, reason: collision with root package name */
    public String f10984b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f10985c;

    public b(String str) {
        this.f10984b = str;
    }

    public static void a(b bVar) {
        String[] c11 = bVar.c();
        if (c11.length == 3 && TextUtils.equals("tid", c11[0])) {
            com.alipay.sdk.m.t.a a11 = com.alipay.sdk.m.t.a.a(com.alipay.sdk.m.s.b.d().b());
            if (TextUtils.isEmpty(c11[1]) || TextUtils.isEmpty(c11[2])) {
                return;
            }
            a11.a(c11[1], c11[2]);
        }
    }

    public static String[] b(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        for (String str2 : str.substring(indexOf + 1, lastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String[] c() {
        return this.f10985c;
    }

    public b(String str, a aVar) {
        this.f10984b = str;
        this.f10983a = aVar;
    }

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            String[] a11 = a(jSONObject.optString("name", ""));
            for (int i11 = 0; i11 < a11.length; i11++) {
                a a12 = a.a(a11[i11]);
                if (a12 != a.None) {
                    b bVar = new b(a11[i11], a12);
                    bVar.f10985c = b(a11[i11]);
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public String b() {
        return this.f10984b;
    }

    public static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(i.f11097b);
    }

    public a a() {
        return this.f10983a;
    }
}
