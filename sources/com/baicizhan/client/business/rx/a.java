package com.baicizhan.client.business.rx;

import com.baicizhan.client.business.rx.BczNavTabInfos;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.google.gson.d;
import i9.f;
import java.util.List;
import java.util.concurrent.Callable;
import rx.c;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16545a = "BizHomeless";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.rx.a$a, reason: collision with other inner class name */
    public class C0271a implements p<BczSystemApiService.Client, c<List<BczNavTabInfos.BczNavInfo>>> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<List<BczNavTabInfos.BczNavInfo>> call(BczSystemApiService.Client client) {
            try {
                String todayEn = TimeUtil.getTodayEn();
                String g11 = f.g(pb.a.a(), BczNavTabInfos.KEY_TODAY, false);
                qb.c.i(a.f16545a, "last %s, value %s", g11, todayEn);
                if (todayEn.equals(g11)) {
                    throw new RuntimeException("refreshed today" + todayEn);
                }
                BczNavTabInfos from = BczNavTabInfos.from(client.check_nav_tabs());
                f.n(pb.a.a(), BczNavTabInfos.KEY_STORE, from != null ? new d().z(from) : "", false);
                f.n(pb.a.a(), BczNavTabInfos.KEY_TODAY, todayEn, false);
                return c.M2(from == null ? null : from.tabs);
            } catch (Exception e11) {
                return c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callable<List<BczNavTabInfos.BczNavInfo>> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BczNavTabInfos.BczNavInfo> call() throws Exception {
            try {
                return ((BczNavTabInfos) new d().n(f.g(pb.a.a(), BczNavTabInfos.KEY_STORE, false), BczNavTabInfos.class)).tabs;
            } catch (Exception e11) {
                qb.c.h(a.f16545a, "", e11);
                return null;
            }
        }
    }

    public static c<List<BczNavTabInfos.BczNavInfo>> a() {
        return com.baicizhan.client.business.thrift.p.a(new l("/rpc/bcz_system")).b2(new C0271a()).U3(c.z2(new b())).w5(bc0.c.e());
    }
}
