package com.huawei.hms.hwid;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ar {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Integer> f35954a;

    static {
        HashSet hashSet = new HashSet();
        f35954a = hashSet;
        hashSet.add(0);
    }

    public static int a(int i11) {
        return f35954a.contains(Integer.valueOf(i11)) ? 0 : 1;
    }
}
