package cd;

import ad.d;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.learning_strategy.util.L;
import com.baicizhan.learning_strategy.util.e;
import com.baicizhan.learning_strategy.util.f;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import yc.b;
import zc.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8517a = 6000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8518b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8519c = 30;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8520d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8521e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f8522f = 2;

    public static Map<Integer, b> a() throws Exception {
        bd.b bVar = new bd.b();
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (i11 < 2000) {
            b j11 = bVar.j();
            i11++;
            j11.x0(i11);
            j11.F0("word_" + j11.e0());
            j11.D0(2);
            j11.y0(System.currentTimeMillis());
            j11.B0(0);
            j11.w0(0);
            hashMap.put(Integer.valueOf(j11.e0()), j11);
        }
        return hashMap;
    }

    public static List<b> b() throws Exception {
        bd.b bVar = new bd.b();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 6000) {
            b j11 = bVar.j();
            i11++;
            j11.x0(i11);
            j11.F0("word_" + j11.e0());
            j11.w0(0);
            arrayList.add(j11);
        }
        return arrayList;
    }

    public static void c(String[] strArr) throws Exception {
        c.d().e(0);
        try {
            zc.a aVar = new zc.a(System.getProperty("user.dir") + "/js");
            f fVar = new f();
            fVar.a();
            ad.a load = aVar.load();
            if (load == null) {
                L.log.error("load error");
            } else {
                System.out.println(fVar.b());
                bd.b bVar = new bd.b();
                bVar.j();
                long currentTimeMillis = System.currentTimeMillis();
                bVar.F(1000);
                System.out.println(System.currentTimeMillis() - currentTimeMillis);
                long currentTimeMillis2 = System.currentTimeMillis();
                bVar.F(OrderStatusCode.ORDER_STATE_CANCEL);
                System.out.println(System.currentTimeMillis() - currentTimeMillis2);
                ArrayList arrayList = new ArrayList();
                long currentTimeMillis3 = System.currentTimeMillis();
                for (int i11 = 0; i11 < 3000; i11++) {
                    arrayList.add(bVar.j());
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                System.out.println("1 use time : " + (currentTimeMillis4 - currentTimeMillis3) + " count: " + arrayList.size());
                long currentTimeMillis5 = System.currentTimeMillis();
                List<b> F = bVar.F(3000);
                long currentTimeMillis6 = System.currentTimeMillis();
                System.out.println("2 use time : " + (currentTimeMillis6 - currentTimeMillis5) + " count: " + F.size());
                List<b> b11 = b();
                Map<Integer, b> a11 = a();
                long currentTimeMillis7 = System.currentTimeMillis();
                load.A(b11, a11);
                long currentTimeMillis8 = System.currentTimeMillis();
                System.out.println("init use time : " + (currentTimeMillis8 - currentTimeMillis7));
                long currentTimeMillis9 = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("slideWindowSize", 0);
                int i12 = f8522f;
                if (1 == i12) {
                    load.w(1, hashMap);
                } else if (2 == i12) {
                    load.h(30, hashMap);
                } else if (3 != i12 && 4 == i12) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(1, 100);
                    HashSet hashSet = new HashSet();
                    hashSet.add(100);
                    hashMap.put("learnedList", hashMap2);
                    hashMap.put("skippedList", hashSet);
                    load.v(10, hashMap);
                }
                long currentTimeMillis10 = System.currentTimeMillis();
                System.out.println("setSequenceMode : " + (currentTimeMillis10 - currentTimeMillis9));
                load.D(null);
                ad.c u11 = load.u();
                d n11 = load.n();
                System.out.println(u11);
                System.out.println(n11);
                b Y = b.Y();
                Y.D0(TopicLearnRecord.SCORE_UNTOUCH);
                u11.b(Y);
                for (int i13 = 0; i13 < 12; i13++) {
                    b Y2 = b.Y();
                    Y2.D0(-i13);
                    u11.b(Y2);
                }
                int d11 = u11.d();
                int a12 = u11.a();
                System.out.println("new-count:" + d11 + " review-count:" + a12);
                e<Integer, Integer> s11 = u11.s();
                System.out.println("new-count:" + s11.a() + " review-count:" + s11.b());
                while (true) {
                    b m11 = u11.m();
                    if (m11 == null) {
                        break;
                    }
                    u11.r(m11, 1L, null);
                    e<Integer, Integer> s12 = u11.s();
                    System.out.println("new-count:" + s12.a() + " review-count:" + s12.b());
                }
                load.h(30, hashMap);
                ad.c u12 = load.u();
                e<Integer, Integer> s13 = u12.s();
                System.out.println("new-count:" + s13.a() + " review-count:" + s13.b());
                System.exit(0);
                List<b> y11 = u12.y(0, 20);
                for (b bVar2 : y11) {
                    System.out.println("p1: " + bVar2.e0());
                }
                System.out.println("============");
                u12.t(y11.get(0));
                for (b bVar3 : u12.y(0, 20)) {
                    System.out.println("p1: " + bVar3.e0());
                }
                for (b bVar4 : u12.y(1, 19)) {
                    System.out.println("p1: " + bVar4.e0());
                }
                for (b bVar5 : u12.y(1, 3)) {
                    System.out.println("p2: " + bVar5.e0());
                }
                L.log.info(String.format("new:%d review:%d", Integer.valueOf(d11), Integer.valueOf(a12)));
                for (int i14 = 0; i14 < 1000; i14++) {
                    b m12 = u12.m();
                    if (m12 == null) {
                        break;
                    }
                    m12.k0();
                    m12.q0();
                    n11.C(m12);
                    u12.r(m12, 100L, null);
                }
            }
        } finally {
            c.d().a();
        }
    }
}
