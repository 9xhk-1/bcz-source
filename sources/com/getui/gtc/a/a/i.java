package com.getui.gtc.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29707a;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f29708b;

    public i(Context context) {
        this.f29707a = context;
    }

    public static String a(String str, k kVar) {
        try {
            if (kVar.f29725a != 2 || TextUtils.isEmpty(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile("value\\s*=\\s*\"(1[3-9][0-9]\\d{8})\"").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return null;
        }
    }

    public final void a(final Network network) {
        com.getui.gtc.f.c.a(0L, new com.getui.gtc.f.e() { // from class: com.getui.gtc.a.a.i.4
            @Override // com.getui.gtc.f.e
            public final void a(String str) {
                com.getui.gtc.i.c.a.d("pm vd http url failed:".concat(String.valueOf(str)));
            }

            @Override // com.getui.gtc.f.e
            public final void a(Map<String, String> map, Map<String, String> map2) {
                String str = map2.get("sdk.gtc.type305.cm.ad.gtc_skip");
                if (TextUtils.isEmpty(str)) {
                    com.getui.gtc.i.c.a.d("pm vd http url == null");
                    return;
                }
                k kVar = new k();
                kVar.f29725a = 2;
                final i iVar = i.this;
                byte[] decode = Base64.decode(str.getBytes(), 2);
                for (int length = decode.length - 1; length > 0; length--) {
                    decode[length] = (byte) (decode[length] ^ decode[length - 1]);
                }
                decode[0] = (byte) (decode[0] ^ ho.c.A);
                String str2 = new String(decode);
                Network network2 = network;
                final boolean z11 = network2 != null;
                d dVar = new d(str2, kVar, network2);
                dVar.f29697e = new e() { // from class: com.getui.gtc.a.a.i.5
                    @Override // com.getui.gtc.a.a.e
                    public final void a(Object obj) throws Throwable {
                        if (obj instanceof j) {
                            j jVar = (j) obj;
                            i iVar2 = i.this;
                            String str3 = jVar.f29722b;
                            int i11 = jVar.f29723c;
                            k kVar2 = jVar.f29724d;
                            boolean z12 = z11;
                            Runnable runnable = iVar2.f29708b;
                            if (runnable != null) {
                                runnable.run();
                            }
                            String a11 = i.a(str3, kVar2);
                            if (TextUtils.isEmpty(a11)) {
                                com.getui.gtc.i.c.a.d("p faild parseData type=" + i11 + " data = release");
                                com.getui.gtc.a.g.a(1, new o(z12 ? -4 : -1, "", ""));
                                return;
                            }
                            com.getui.gtc.i.c.a.d("p success parseData type=" + i11 + " data = release");
                            com.getui.gtc.a.g.a(1, new o(z12 ? -3 : 0, "", a11));
                        }
                    }
                };
                new b(dVar).run();
            }
        });
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, null)).booleanValue();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return false;
        }
    }
}
