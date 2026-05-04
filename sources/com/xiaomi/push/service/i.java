package com.xiaomi.push.service;

import com.xiaomi.push.ig;

/* loaded from: classes8.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static a f46374a;

    /* renamed from: a, reason: collision with other field name */
    private static b f1011a;

    public interface a {
        boolean a(ig igVar);
    }

    public interface b {
    }

    public static void a(b bVar) {
        f1011a = bVar;
    }

    public static boolean a(ig igVar) {
        String str;
        if (f46374a == null || igVar == null) {
            str = "rc params is null, not cpra";
        } else {
            if (com.xiaomi.push.j.m6172a(com.xiaomi.push.s.m6183a())) {
                return f46374a.a(igVar);
            }
            str = "rc app not permission to cpra";
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a(str);
        return false;
    }
}
