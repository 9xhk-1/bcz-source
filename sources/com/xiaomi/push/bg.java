package com.xiaomi.push;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class bg {

    /* renamed from: a, reason: collision with root package name */
    public int f45304a;

    /* renamed from: a, reason: collision with other field name */
    public String f171a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f172a = new HashMap();

    public String a() {
        return this.f171a;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f45304a), this.f172a.toString(), this.f171a);
    }
}
