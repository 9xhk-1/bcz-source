package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.id;
import java.util.Map;

/* loaded from: classes8.dex */
public class ag {

    /* renamed from: a, reason: collision with root package name */
    private static a f46236a;

    /* renamed from: a, reason: collision with other field name */
    private static b f917a;

    public interface a {
        Map<String, String> a(Context context, id idVar);

        /* renamed from: a, reason: collision with other method in class */
        void m6219a(Context context, id idVar);

        boolean a(Context context, id idVar, boolean z11);
    }

    public interface b {
        void a(id idVar);

        void a(String str);

        /* renamed from: a, reason: collision with other method in class */
        boolean m6220a(id idVar);
    }

    public static Map<String, String> a(Context context, id idVar) {
        a aVar = f46236a;
        if (aVar != null && idVar != null) {
            return aVar.a(context, idVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("pepa listener or container is null");
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m6217a(Context context, id idVar) {
        a aVar = f46236a;
        if (aVar == null || idVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("handle msg wrong");
        } else {
            aVar.m6219a(context, idVar);
        }
    }

    public static void a(id idVar) {
        b bVar = f917a;
        if (bVar == null || idVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("pepa clearMessage is null");
        } else {
            bVar.a(idVar);
        }
    }

    public static void a(String str) {
        b bVar = f917a;
        if (bVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("pepa clearMessage is null");
        } else {
            bVar.a(str);
        }
    }

    public static boolean a(Context context, id idVar, boolean z11) {
        a aVar = f46236a;
        if (aVar != null && idVar != null) {
            return aVar.a(context, idVar, z11);
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("pepa judement listener or container is null");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m6218a(id idVar) {
        b bVar = f917a;
        if (bVar != null && idVar != null) {
            return bVar.m6220a(idVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("pepa handleReceiveMessage is null");
        return false;
    }
}
