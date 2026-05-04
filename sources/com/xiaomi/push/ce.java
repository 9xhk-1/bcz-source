package com.xiaomi.push;

import com.xiaomi.push.ci;

/* loaded from: classes8.dex */
public class ce extends ci.d {

    /* renamed from: a, reason: collision with root package name */
    protected String f45333a;

    public ce(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f45333a = str3;
    }

    public static ce a(String str) {
        return new ce(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
