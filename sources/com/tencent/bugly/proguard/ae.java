package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ae {
    public static bu a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        bu buVar = new bu();
        buVar.f42566a = userInfoBean.f42061e;
        buVar.f42570e = userInfoBean.f42066j;
        buVar.f42569d = userInfoBean.f42059c;
        buVar.f42568c = userInfoBean.f42060d;
        buVar.f42573h = userInfoBean.f42071o == 1;
        int i11 = userInfoBean.f42058b;
        if (i11 == 1) {
            buVar.f42567b = (byte) 1;
        } else if (i11 == 2) {
            buVar.f42567b = (byte) 4;
        } else if (i11 == 3) {
            buVar.f42567b = (byte) 2;
        } else if (i11 == 4) {
            buVar.f42567b = (byte) 3;
        } else if (i11 == 8) {
            buVar.f42567b = (byte) 8;
        } else {
            if (i11 < 10 || i11 >= 20) {
                al.e("unknown uinfo type %d ", Integer.valueOf(i11));
                return null;
            }
            buVar.f42567b = (byte) i11;
        }
        HashMap hashMap = new HashMap();
        buVar.f42571f = hashMap;
        if (userInfoBean.f42072p >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f42072p);
            hashMap.put("C01", sb2.toString());
        }
        if (userInfoBean.f42073q >= 0) {
            Map<String, String> map = buVar.f42571f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(userInfoBean.f42073q);
            map.put("C02", sb3.toString());
        }
        Map<String, String> map2 = userInfoBean.f42074r;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f42074r.entrySet()) {
                buVar.f42571f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = userInfoBean.f42075s;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f42075s.entrySet()) {
                buVar.f42571f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map4 = buVar.f42571f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(true ^ userInfoBean.f42068l);
        map4.put("A36", sb4.toString());
        Map<String, String> map5 = buVar.f42571f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f42063g);
        map5.put("F02", sb5.toString());
        Map<String, String> map6 = buVar.f42571f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f42064h);
        map6.put("F03", sb6.toString());
        buVar.f42571f.put("F04", userInfoBean.f42066j);
        Map<String, String> map7 = buVar.f42571f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f42065i);
        map7.put("F05", sb7.toString());
        buVar.f42571f.put("F06", userInfoBean.f42069m);
        Map<String, String> map8 = buVar.f42571f;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(userInfoBean.f42067k);
        map8.put("F10", sb8.toString());
        al.c("summary type %d vm:%d", Byte.valueOf(buVar.f42567b), Integer.valueOf(buVar.f42571f.size()));
        return buVar;
    }

    public static <T extends m> T a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T newInstance = cls.newInstance();
                k kVar = new k(bArr);
                kVar.a("utf-8");
                newInstance.a(kVar);
                return newInstance;
            } catch (Throwable th2) {
                if (!al.b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public static bq a(Context context, int i11, byte[] bArr) {
        String str;
        aa b11 = aa.b();
        StrategyBean c11 = ac.a().c();
        if (b11 != null && c11 != null) {
            try {
                bq bqVar = new bq();
                synchronized (b11) {
                    try {
                        bqVar.f42514a = b11.f42185b;
                        bqVar.f42515b = b11.e();
                        bqVar.f42516c = b11.f42186c;
                        bqVar.f42517d = b11.f42198o;
                        bqVar.f42518e = b11.f42202s;
                        bqVar.f42519f = b11.f42191h;
                        bqVar.f42520g = i11;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        bqVar.f42521h = bArr;
                        bqVar.f42522i = b11.h();
                        bqVar.f42523j = b11.f42194k;
                        bqVar.f42524k = new HashMap();
                        bqVar.f42525l = b11.d();
                        bqVar.f42526m = c11.f42093o;
                        bqVar.f42528o = b11.g();
                        bqVar.f42529p = ab.c(context);
                        bqVar.f42530q = System.currentTimeMillis();
                        bqVar.f42532s = b11.i();
                        bqVar.f42535v = b11.g();
                        bqVar.f42536w = bqVar.f42529p;
                        bqVar.f42527n = "com.tencent.bugly";
                        bqVar.f42524k.put("A26", b11.s());
                        Map<String, String> map = bqVar.f42524k;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(aa.C());
                        map.put("A62", sb2.toString());
                        Map<String, String> map2 = bqVar.f42524k;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(aa.D());
                        map2.put("A63", sb3.toString());
                        Map<String, String> map3 = bqVar.f42524k;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(b11.J);
                        map3.put("F11", sb4.toString());
                        Map<String, String> map4 = bqVar.f42524k;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(b11.I);
                        map4.put("F12", sb5.toString());
                        bqVar.f42524k.put("D3", b11.f42200q);
                        List<o> list = p.f42620b;
                        if (list != null) {
                            for (o oVar : list) {
                                String str2 = oVar.versionKey;
                                if (str2 != null && (str = oVar.version) != null) {
                                    bqVar.f42524k.put(str2, str);
                                }
                            }
                        }
                        bqVar.f42524k.put("G15", ap.d("G15", ""));
                        bqVar.f42524k.put("G10", ap.d("G10", ""));
                        bqVar.f42524k.put("D4", ap.d("D4", "0"));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Map<String, String> x11 = b11.x();
                if (x11 != null) {
                    for (Map.Entry<String, String> entry : x11.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            bqVar.f42524k.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return bqVar;
            } catch (Throwable th3) {
                if (!al.b(th3)) {
                    th3.printStackTrace();
                }
                return null;
            }
        }
        al.e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    public static byte[] a(Object obj) {
        try {
            e eVar = new e();
            eVar.b();
            eVar.a("utf-8");
            eVar.c();
            eVar.b("RqdServer");
            eVar.c("sync");
            eVar.a("detail", (String) obj);
            return eVar.a();
        } catch (Throwable th2) {
            if (al.b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public static br a(byte[] bArr) {
        if (bArr != null) {
            try {
                e eVar = new e();
                eVar.b();
                eVar.a("utf-8");
                eVar.a(bArr);
                Object b11 = eVar.b("detail", new br());
                if (br.class.isInstance(b11)) {
                    return (br) br.class.cast(b11);
                }
                return null;
            } catch (Throwable th2) {
                if (!al.b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public static byte[] a(m mVar) {
        try {
            l lVar = new l();
            lVar.a("utf-8");
            mVar.a(lVar);
            byte[] bArr = new byte[lVar.f42614a.position()];
            System.arraycopy(lVar.f42614a.array(), 0, bArr, 0, lVar.f42614a.position());
            return bArr;
        } catch (Throwable th2) {
            if (al.b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
