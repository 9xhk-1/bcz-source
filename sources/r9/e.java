package r9;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.AdvertiseLoadingInfo;
import com.baicizhan.online.advertise_api.AdvertiseLoadingItem;
import com.baicizhan.online.advertise_api.AdvertiseLoadingModule;
import com.baicizhan.online.advertise_api.AdvertisePromotionInfo;
import com.baicizhan.online.thrift.basic.AdvertiseRedirectInfo;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.thrift.transport.TTransportException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: g, reason: collision with root package name */
    public static final String f83702g = "AdManager";

    /* renamed from: h, reason: collision with root package name */
    public static final String f83703h = ".loadingbaicizhan";

    /* renamed from: i, reason: collision with root package name */
    public static final String f83704i = "loading/";

    /* renamed from: j, reason: collision with root package name */
    public static volatile e f83705j;

    /* renamed from: a, reason: collision with root package name */
    public Context f83706a;

    /* renamed from: b, reason: collision with root package name */
    public List<AdvertiseLoadingItem> f83707b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public Map<Integer, AdvertiseLoadingItem> f83708c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<AdvertiseLoadingItem>> f83709d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public Map<AdvertiseLoadingModule, List<Integer>> f83710e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Map<AdvertiseLoadingModule, Integer> f83711f = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<String> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(e.f83702g, "", e11);
        }

        @Override // qb0.c
        public void onNext(String imageUrl) {
            List<AdvertiseLoadingItem> list = (List) e.this.f83709d.get(imageUrl);
            if (list != null) {
                for (AdvertiseLoadingItem advertiseLoadingItem : list) {
                    e.this.f83708c.put(Integer.valueOf(advertiseLoadingItem.getAd_id()), advertiseLoadingItem);
                }
                qb.c.o(e.f83702g, "ad download success " + TextUtils.join(",", list), new Object[0]);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<String, rx.c<String>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Callable<String> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f83714a;

            public a(final String val$imageUrl) {
                this.f83714a = val$imageUrl;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String call() throws Exception {
                new c(this.f83714a).d();
                return this.f83714a;
            }
        }

        public b() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<String> call(final String imageUrl) {
            return rx.c.z2(new a(imageUrl)).w5(bc0.c.e());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends m9.a {

        /* renamed from: d, reason: collision with root package name */
        public String f83716d;

        public c(String imageUrl) {
            this.f83716d = imageUrl;
        }

        @Override // m9.a
        public Object a() {
            return null;
        }

        @Override // m9.a
        public void d() {
            try {
                File baicizhanFile = PathUtil.getBaicizhanFile(new File(e.f83704i, e.j(this.f83716d)).getPath());
                if (baicizhanFile == null) {
                    return;
                }
                String absolutePath = baicizhanFile.getAbsolutePath();
                qb.c.b(e.f83702g, "download " + this.f83716d + " -> " + absolutePath, new Object[0]);
                File a11 = this.f72662a.a(this.f83716d, absolutePath);
                File f11 = e.f(this.f83716d);
                if (f11.exists()) {
                    f11.delete();
                }
                a11.renameTo(f11);
            } catch (Throwable th2) {
                qb.c.c(e.f83702g, "download failed : " + this.f83716d, th2);
            }
        }

        public String toString() {
            return "AdDownloadTask{mImageUrl='" + this.f83716d + '\'' + l50.b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public long f83717a;

        /* renamed from: b, reason: collision with root package name */
        public long f83718b;

        /* renamed from: c, reason: collision with root package name */
        public String f83719c;

        /* renamed from: d, reason: collision with root package name */
        public AdvertiseRedirectInfo f83720d;

        /* renamed from: e, reason: collision with root package name */
        public double f83721e;

        /* renamed from: f, reason: collision with root package name */
        public double f83722f;

        /* renamed from: g, reason: collision with root package name */
        public double f83723g;

        /* renamed from: h, reason: collision with root package name */
        public double f83724h;

        public static d a(AdvertisePromotionInfo ad2) {
            d dVar = new d();
            dVar.k(TimeUtil.secondsToMillis(ad2.getStart_time()));
            dVar.i(TimeUtil.secondsToMillis(ad2.getEnd_time()));
            dVar.j(ad2.getImg_url());
            dVar.f83720d = ad2.getRedirect_info();
            dVar.f83721e = ad2.btn_x;
            dVar.f83722f = ad2.btn_y;
            dVar.f83723g = ad2.btn_w;
            dVar.f83724h = ad2.btn_h;
            return dVar;
        }

        public long b() {
            return this.f83718b;
        }

        public String c() {
            return this.f83719c;
        }

        public File d() {
            return e.f(this.f83719c);
        }

        public AdvertiseRedirectInfo e() {
            return this.f83720d;
        }

        public long f() {
            return this.f83717a;
        }

        public boolean g() {
            long currentTimeMillis = System.currentTimeMillis();
            return TimeUtil.getBetweenDays(currentTimeMillis, ia.a.d(ia.a.f60465p)) != 0 && f() <= currentTimeMillis && currentTimeMillis <= b() && h();
        }

        public boolean h() {
            File d11 = d();
            return d11 != null && d11.exists() && d11.length() > 0;
        }

        public void i(long endTime) {
            this.f83718b = endTime;
        }

        public void j(String imgUrl) {
            this.f83719c = imgUrl;
        }

        public void k(long startTime) {
            this.f83717a = startTime;
        }

        public String toString() {
            return "PromotionAdRecord{endTime=" + this.f83718b + ", startTime=" + this.f83717a + ", imgUrl='" + this.f83719c + "', redirectInfo=" + this.f83720d + l50.b.f69928j;
        }
    }

    public static File f(String url) {
        return PathUtil.getBaicizhanResourceFile(new File(f83704i, j(url)).getPath(), f83703h);
    }

    public static e g() {
        if (f83705j == null) {
            synchronized (e.class) {
                try {
                    if (f83705j == null) {
                        f83705j = new e();
                    }
                } finally {
                }
            }
        }
        return f83705j;
    }

    public static String j(String url) {
        String trim = url.trim();
        try {
            return trim.startsWith("http") ? new File(new URL(trim).getFile()).getName() : trim;
        } catch (Exception e11) {
            e11.printStackTrace();
            return trim;
        }
    }

    public final synchronized void d() {
        try {
            for (AdvertiseLoadingItem advertiseLoadingItem : this.f83707b) {
                File f11 = f(advertiseLoadingItem.getImage_url());
                if (f11 == null || !f11.exists() || f11.length() <= 0) {
                    List<AdvertiseLoadingItem> list = this.f83709d.get(advertiseLoadingItem.getImage_url());
                    if (list == null) {
                        list = new ArrayList<>();
                        this.f83709d.put(advertiseLoadingItem.getImage_url(), list);
                    }
                    list.add(advertiseLoadingItem);
                } else {
                    this.f83708c.put(Integer.valueOf(advertiseLoadingItem.getAd_id()), advertiseLoadingItem);
                }
            }
            if (rb.d.j(pb.a.a())) {
                rx.c.u2(this.f83709d.keySet()).b2(new b()).I3(tb0.a.a()).r5(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public AdvertiseLoadingItem e(AdvertiseLoadingModule moduleName) {
        List<Integer> list = this.f83710e.get(moduleName);
        int intValue = this.f83711f.containsKey(moduleName) ? this.f83711f.get(moduleName).intValue() : 0;
        if (!xb.e.i(this.f83708c) && !xb.e.h(list)) {
            if (intValue < 0 || intValue >= list.size()) {
                intValue = 0;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                Integer num = list.get(intValue);
                num.intValue();
                AdvertiseLoadingItem advertiseLoadingItem = this.f83708c.get(num);
                intValue++;
                if (intValue >= list.size()) {
                    intValue = 0;
                }
                if (advertiseLoadingItem != null) {
                    this.f83711f.put(moduleName, Integer.valueOf(intValue));
                    if (moduleName == AdvertiseLoadingModule.MODULE_MAIN) {
                        ia.a.k(ia.a.f60461l, intValue);
                    }
                    return advertiseLoadingItem;
                }
            }
        }
        return null;
    }

    public void h(Context context) {
        this.f83706a = context.getApplicationContext();
    }

    public void i(AdvertiseApiService.Client client) {
        try {
            qb.c.b(f83702g, "update", new Object[0]);
            if (this.f83706a == null) {
                h(pb.a.a());
            }
            this.f83707b = client.get_loading_ad_items();
            qb.c.b(f83702g, "thrift get_ads_list " + this.f83707b.size(), new Object[0]);
            List<AdvertiseLoadingInfo> list = client.get_loading_ad_info();
            if (list != null) {
                this.f83710e.clear();
                for (AdvertiseLoadingInfo advertiseLoadingInfo : list) {
                    this.f83710e.put(advertiseLoadingInfo.getModule_name(), advertiseLoadingInfo.getAd_ids());
                    qb.c.b(f83702g, advertiseLoadingInfo.getModule_name() + j2.O + TextUtils.join(",", advertiseLoadingInfo.getAd_ids()), new Object[0]);
                }
            }
            this.f83709d.clear();
            d();
            this.f83711f.put(AdvertiseLoadingModule.MODULE_MAIN, Integer.valueOf(ia.a.c(ia.a.f60461l)));
        } catch (Exception e11) {
            qb.c.a(f83702g, "", e11);
            if (e11 instanceof TTransportException) {
                return;
            }
            qb.c.c(f83702g, "", e11);
        }
    }
}
