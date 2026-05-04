package com.mob.secverify.pure.core.ope.b.c;

import android.text.TextUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private String f40882b;

    /* renamed from: c, reason: collision with root package name */
    private TreeMap<String, Object> f40883c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<File> f40884d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<String, Object> f40885e;

    /* renamed from: a, reason: collision with root package name */
    private String f40881a = "GET";

    /* renamed from: f, reason: collision with root package name */
    private int f40886f = 0;

    /* JADX WARN: Removed duplicated region for block: B:5:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.util.TreeMap<java.lang.String, java.lang.Object> r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L66
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L49
            r1.<init>()     // Catch: java.lang.Exception -> L49
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Exception -> L49
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L49
        L10:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Exception -> L49
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L49
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L49
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L49
            if (r2 == 0) goto L10
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L49
            if (r4 != 0) goto L10
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L49
            java.lang.String r4 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r4)     // Catch: java.lang.Exception -> L49
            r1.append(r3)     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = "="
            r1.append(r3)     // Catch: java.lang.Exception -> L49
            r1.append(r2)     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = "&"
            r1.append(r2)     // Catch: java.lang.Exception -> L49
            goto L10
        L49:
            r5 = move-exception
            goto L55
        L4b:
            int r5 = r1.length()     // Catch: java.lang.Exception -> L49
            int r5 = r5 + (-1)
            r1.deleteCharAt(r5)     // Catch: java.lang.Exception -> L49
            goto L67
        L55:
            com.mob.secverify.b.c r1 = com.mob.secverify.b.c.a()
            java.lang.String r2 = "toUrlString"
            java.lang.String r5 = r5.toString()
            java.lang.String r3 = "[SecPure][%s][%s] ==>%s"
            java.lang.String r4 = "ParamsUtils"
            r1.b(r3, r4, r2, r5)
        L66:
            r1 = r0
        L67:
            if (r1 != 0) goto L6a
            return r0
        L6a:
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.b.c.g.a(java.util.TreeMap):java.lang.String");
    }

    public final ArrayList<File> b() {
        return this.f40884d;
    }

    public final boolean c() {
        ArrayList<File> arrayList = this.f40884d;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }

    public final String d() {
        return this.f40882b;
    }

    public final TreeMap<String, Object> e() {
        return this.f40883c;
    }

    public final HashMap<String, Object> f() {
        return this.f40885e;
    }

    public final void b(String str) {
        this.f40882b = str;
    }

    public final void b(TreeMap<String, Object> treeMap) {
        this.f40883c = treeMap;
    }

    public final String a() {
        return this.f40881a;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40881a = str;
    }

    public final void a(ArrayList<File> arrayList) {
        this.f40884d = arrayList;
    }

    public final void a(HashMap<String, Object> hashMap) {
        this.f40885e = hashMap;
    }

    public final void a(int i11) {
        this.f40886f = i11;
    }
}
