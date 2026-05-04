package com.mob.commons;

import android.content.Context;
import android.text.TextUtils;
import com.mob.tools.network.NetCommunicator;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static volatile String f40315a = null;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Boolean f40316b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f40317c = null;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f40318d = false;

    /* renamed from: e, reason: collision with root package name */
    private static HashSet<String> f40319e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private static a f40320f;

    public static String b() {
        if (a()) {
            return null;
        }
        if (TextUtils.isEmpty(f40315a)) {
            f40315a = d().a();
        }
        return f40315a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d() {
        if (f40320f == null) {
            f40320f = new a();
        }
        return f40320f;
    }

    public static boolean a() {
        return !b.b();
    }

    public static String a(Context context) {
        return com.mob.commons.b.d.d(context);
    }

    public static synchronized String a(MobProduct mobProduct) {
        synchronized (e.class) {
            HashMap<String, Object> b11 = b(mobProduct);
            if (b11 == null) {
                return null;
            }
            return (String) b11.get(NetCommunicator.KEY_DUID);
        }
    }

    public static synchronized HashMap<String, Object> b(final MobProduct mobProduct) {
        boolean z11;
        HashMap<String, Object> hashMap;
        synchronized (e.class) {
            if (mobProduct != null) {
                try {
                    u.a(mobProduct);
                    boolean contains = f40319e.contains(mobProduct.getProductTag());
                    z11 = !contains;
                    if (!contains) {
                        f40319e.add(mobProduct.getProductTag());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z11 = false;
            }
            if (TextUtils.isEmpty(f40315a)) {
                f40315a = d().b();
                z11 = true;
            }
            if (z11 || !f40318d) {
                f40318d = true;
                t.f40414c.execute(new com.mob.tools.utils.d() { // from class: com.mob.commons.e.1
                    @Override // com.mob.tools.utils.d
                    public void a() {
                        int i11 = 0;
                        if (!b.a(j.a("002f+bc"))) {
                            boolean unused = e.f40318d = false;
                            return;
                        }
                        if (!b.e()) {
                            while (i11 < 5) {
                                i11++;
                                try {
                                    Thread.sleep(5000L);
                                    if (b.e()) {
                                        break;
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }
                        if (b.e()) {
                            e.d().a(MobProduct.this);
                        }
                    }
                });
            }
            if (f40316b == null) {
                String b11 = v.a().b("key_curr_passed_duid", (String) null);
                f40317c = b11;
                if (!TextUtils.isEmpty(b11) && !b11.equals(f40315a)) {
                    f40316b = Boolean.TRUE;
                } else {
                    f40316b = Boolean.FALSE;
                }
            }
            v.a().a("key_curr_passed_duid", f40315a);
            hashMap = new HashMap<>();
            hashMap.put(NetCommunicator.KEY_DUID, f40315a);
            Boolean bool = f40316b;
            bool.booleanValue();
            hashMap.put(NetCommunicator.KEY_IS_MODIFIED, bool);
            hashMap.put(NetCommunicator.KEY_DUID_PREVIOUS, f40317c);
        }
        return hashMap;
    }
}
