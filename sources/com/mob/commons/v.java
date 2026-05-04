package com.mob.commons;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.mob.MobSDK;
import com.mob.commons.a;
import com.mob.tools.MobLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.SharePrefrenceHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class v {

    /* renamed from: z, reason: collision with root package name */
    private static v f40449z;
    private SharePrefrenceHelper A;

    /* renamed from: u, reason: collision with root package name */
    private static final String f40444u = n.a("011kTdbebcccfdbDkkDdbcjef");

    /* renamed from: a, reason: collision with root package name */
    public static final String f40424a = n.a("009Sci-h@chcc;g0cdeece5d");

    /* renamed from: b, reason: collision with root package name */
    public static final String f40425b = n.a("010 ciPhBchccTgKcb<dg?cfPg");

    /* renamed from: c, reason: collision with root package name */
    public static final String f40426c = n.a("0107ci(h0chcccjcb(d_cgcf'g");

    /* renamed from: d, reason: collision with root package name */
    public static final String f40427d = n.a("0095ciAh*chcccjcbdccedc");

    /* renamed from: e, reason: collision with root package name */
    public static final String f40428e = n.a("010Aci;hSchccefcjcbdccedc");

    /* renamed from: f, reason: collision with root package name */
    public static final String f40429f = n.a("010Jci@h>chcccjcbdc%dDdc5c");

    /* renamed from: g, reason: collision with root package name */
    public static final String f40430g = n.a("018IciEh0chcccecg2cUcccjCh*ck:c ccLc!db!cJcedc");

    /* renamed from: h, reason: collision with root package name */
    public static final String f40431h = n.a("011Wci1hHchcc<dd+cccjcfefch");

    /* renamed from: i, reason: collision with root package name */
    public static final String f40432i = n.a("011QciIhGchcc ddEcceecg0cg");

    /* renamed from: j, reason: collision with root package name */
    public static final String f40433j = n.a("031Lci2h<chcccj1h^ck$c_cccb@d;dcdbce]g*ccceBdd7cccecf;cKcdVihTccWc-cd;kh");

    /* renamed from: k, reason: collision with root package name */
    public static final String f40434k = n.a("012Gci0h,chccZhMckWc>cccdcjegdb");

    /* renamed from: l, reason: collision with root package name */
    public static final String f40435l = n.a("033@ci9hYchcccjRh^ck!c1cc7ghi7ccDh0ck@cHcccdcjegdbcccb^dQdcdbce$g2cc<cXcd5kh");

    /* renamed from: m, reason: collision with root package name */
    public static final String f40436m = n.a("032OciKh)chcccj6h4ck9c9ccZghi^cc$h,ckRc$cc;iLcecgcccbAdGdcdbce6gXccCc4cdVkh");

    /* renamed from: n, reason: collision with root package name */
    public static final String f40437n = n.a("025Sci.hVchccebcbegegJhQcgWhg9ccdcdbcfceMc2cddbcjccLkgVgd");

    /* renamed from: o, reason: collision with root package name */
    public static final String f40438o = n.a("038Kci$h!chcccjBh:ck[c7cccb]dYdcdbce4gIccebcbegeg%h_cgIhg_ccdcdbcfce+c(cddbcjccVcHcd$kh");

    /* renamed from: p, reason: collision with root package name */
    public static final String f40439p = n.a("022JciDhRchccefcdIkYcbdcceTcKdbcgcccdcjegdbccIkg.gd");

    /* renamed from: q, reason: collision with root package name */
    public static final String f40440q = n.a("0140eccdegcdccdcceefDc6cccdcjegdb");

    /* renamed from: r, reason: collision with root package name */
    public static final String f40441r = n.a("018[ciQh$chcceccdegcdccdccdefGc.ccVb[ceefEb");

    /* renamed from: s, reason: collision with root package name */
    public static final String f40442s = n.a("030Oci]h8chcccj?hLck@cRcccb@dVdcdbce,gDcceccdegcdccdccdefWcPccNc@cdLkh");

    /* renamed from: t, reason: collision with root package name */
    public static final String f40443t = n.a("012Yci:hNchccefeccd,cYcf.bh7ef");

    /* renamed from: v, reason: collision with root package name */
    private static final String f40445v = n.a("019Cci3hQchccce2ddScccecfRc2cd ih'cc+c1cd:kh");

    /* renamed from: w, reason: collision with root package name */
    private static final String f40446w = n.a("012$ciShQchcccf*b7cecjcjNhXdcef");

    /* renamed from: x, reason: collision with root package name */
    private static AtomicBoolean f40447x = new AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    private static AtomicBoolean f40448y = new AtomicBoolean(false);

    private v() {
        if (this.A == null) {
            SharePrefrenceHelper sharePrefrenceHelper = new SharePrefrenceHelper(MobSDK.getContext());
            this.A = sharePrefrenceHelper;
            sharePrefrenceHelper.open(f40444u, 1);
        }
    }

    public static synchronized v a() {
        v vVar;
        synchronized (v.class) {
            try {
                if (f40449z == null) {
                    f40449z = new v();
                }
                vVar = f40449z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public static void g() {
        if (f40447x.compareAndSet(false, true)) {
            new com.mob.tools.utils.e(n.a("004Iehhhghfk")) { // from class: com.mob.commons.v.1
                @Override // com.mob.tools.utils.e
                public void a() {
                    Object obj = l.f40361g;
                    synchronized (obj) {
                        try {
                            obj.wait(600000L);
                            f.a().a(11);
                            ConcurrentHashMap<String, Object> f11 = b.f();
                            if (f11 != null && f11.size() > 0) {
                                f.a().a(12);
                                Object obj2 = f11.get(CmcdData.STREAMING_FORMAT_HLS);
                                Object obj3 = f11.get("k");
                                Object obj4 = f11.get(n.a("001Teb"));
                                Object obj5 = f11.get("s");
                                Object obj6 = f11.get(n.a("002Fcfcj"));
                                Object obj7 = f11.get(n.a("002?egcj"));
                                f11.clear();
                                d.a(obj2, obj3, obj4, obj5, obj6, obj7);
                            }
                        } finally {
                        }
                    }
                }
            }.start();
        }
        i();
    }

    private static String h() {
        return Data.MD5(DeviceHelper.getInstance(MobSDK.getContext()).getModel());
    }

    private static void i() {
        if (f40448y.compareAndSet(false, true)) {
            new com.mob.tools.utils.e("DS-W") { // from class: com.mob.commons.v.2
                @Override // com.mob.tools.utils.e
                public void a() {
                    Object obj = l.f40362h;
                    synchronized (obj) {
                        try {
                            obj.wait();
                            ConcurrentHashMap<String, Object> g11 = b.g();
                            ArrayList arrayList = (ArrayList) g11.get(n.a("002[dcVc"));
                            g11.clear();
                            d.a((ArrayList<HashMap<String, Object>>) arrayList);
                        } finally {
                        }
                    }
                }
            }.start();
        }
    }

    public long b(String str, long j11) {
        return this.A.getLong(str, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<Long, Long> c() {
        HashMap fromJson;
        String string = this.A.getString(f40445v);
        HashMap<Long, Long> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(string) && (fromJson = HashonHelper.fromJson(string)) != null && !fromJson.isEmpty()) {
            for (Map.Entry entry : fromJson.entrySet()) {
                if (entry != null) {
                    try {
                        hashMap.put(Long.valueOf(Long.parseLong((String) entry.getKey())), entry.getValue());
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
            }
        }
        return hashMap;
    }

    public HashMap<String, Object> d() {
        String b11 = b(f40446w, (String) null);
        if (TextUtils.isEmpty(b11)) {
            return null;
        }
        return HashonHelper.fromJson(b11);
    }

    public a.c e() {
        return a.c.a(b("key_duid_param_blacklist", (String) null));
    }

    public a.C0483a f() {
        try {
            String b11 = b("key_duid_entity", (String) null);
            if (!TextUtils.isEmpty(b11)) {
                return a.C0483a.a(Data.AES128Decode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), Base64.decode(b11, 0)));
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        return null;
    }

    public int b(String str, int i11) {
        return this.A.getInt(str, i11);
    }

    public String b(String str, String str2) {
        return this.A.getString(str, str2);
    }

    public void a(String str, long j11) {
        this.A.putLong(str, Long.valueOf(j11));
    }

    public String b() {
        String b11 = b(f40443t, (String) null);
        if (!TextUtils.isEmpty(b11)) {
            try {
                return Data.AES128Decode(h(), Base64.decode(b11, 0));
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        return b11;
    }

    public void d(String str, String str2) {
        a(n.a("011SciPhCchcc^gAdb^k3cecdcjcc") + str, str2);
    }

    public void a(String str, int i11) {
        this.A.putInt(str, Integer.valueOf(i11));
    }

    public boolean a(String str, boolean z11) {
        return this.A.getBoolean(str, z11);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.A.remove(str);
        } else {
            this.A.putString(str, str2);
        }
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(Data.AES128Encode(h(), str), 0);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
        a(f40443t, str);
    }

    public String c(String str, String str2) {
        return b(n.a("011Tci:hNchccSg!db9k*cecdcjcc") + str, str2);
    }

    public void b(HashMap<String, Object> hashMap) {
        a(f40446w, HashonHelper.fromHashMap(hashMap));
    }

    public void a(HashMap<Long, Long> hashMap) {
        if (hashMap != null && !hashMap.isEmpty()) {
            try {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, Long> entry : hashMap.entrySet()) {
                    if (entry != null) {
                        hashMap2.put(String.valueOf(entry.getKey()), entry.getValue());
                    }
                }
                this.A.putString(f40445v, HashonHelper.fromHashMap(hashMap2));
                return;
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return;
            }
        }
        this.A.remove(f40445v);
    }

    public void a(a.c cVar) {
        a("key_duid_param_blacklist", cVar != null ? cVar.a() : null);
    }

    public void a(a.C0483a c0483a) {
        String a11;
        if (c0483a != null) {
            try {
                a11 = c0483a.a();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return;
            }
        } else {
            a11 = null;
        }
        a("key_duid_entity", Base64.encodeToString(Data.AES128Encode(DeviceHelper.getInstance(MobSDK.getContext()).getModel(), a11), 0));
    }
}
