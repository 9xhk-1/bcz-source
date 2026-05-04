package th;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.provider.BaicizhanContentProvider;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.StoragePathDetector;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import org.junit.jupiter.api.j2;
import q9.w;
import q9.x;
import rx.Notification;
import rx.c;
import th.g;
import wb0.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90605a = "InitializationObservables";

    /* renamed from: b, reason: collision with root package name */
    public static final int f90606b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f90607c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f90608d = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.p<Integer, rx.c<Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90609a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f90610b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements c.a<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Integer f90611a;

            public a(final Integer val$resId) {
                this.f90611a = val$resId;
            }

            @Override // wb0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(qb0.g<? super Boolean> subscriber) {
                Resources resources = b.this.f90609a.getResources();
                String str = gi.b.f53730a.get(this.f90611a);
                qb.c.b(g.f90605a, "try unzip " + str, new Object[0]);
                try {
                    String f11 = xb.o.f(pb.a.a());
                    String valueOf = String.valueOf(xb.o.g(pb.a.a()));
                    String d11 = i9.h.f().d(valueOf + f11 + str);
                    if (FileUtils.needUnzipRawDatabaseToSDCard(resources, this.f90611a.intValue(), b.this.f90610b, str) || TextUtils.isEmpty(d11)) {
                        if (R.raw.lookup == this.f90611a.intValue()) {
                            ia.a.o(false);
                        }
                        try {
                            for (File file : new File(b.this.f90610b).listFiles()) {
                                if (file.getName().contains(str)) {
                                    qb.c.i(g.f90605a, "DELETE %s %b", file.getName(), Boolean.valueOf(file.delete()));
                                }
                            }
                        } catch (Exception e11) {
                            qb.c.c(g.f90605a, "", e11);
                        }
                        qb.c.i(g.f90605a, "force update %s", str);
                    }
                    FileUtils.unzipRawFileToSDCard(resources, this.f90611a.intValue(), b.this.f90610b, str);
                    i9.h.f().j(valueOf + f11 + str, "done");
                    if (R.raw.lookup == this.f90611a.intValue()) {
                        ia.a.o(true);
                    }
                    subscriber.onNext(Boolean.TRUE);
                    subscriber.onCompleted();
                } catch (Exception unused) {
                    subscriber.onNext(Boolean.FALSE);
                }
            }
        }

        public b(final Context val$context, final String val$appRoot) {
            this.f90609a = val$context;
            this.f90610b = val$appRoot;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Boolean> call(final Integer resId) {
            return rx.c.j1(new a(resId));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90613a;

        public c(final Context val$context) {
            this.f90613a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Boolean> subscriber) {
            g.s(this.f90613a);
            oa.a.g().e();
            subscriber.onNext(Boolean.TRUE);
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements c.a<Boolean> {
        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Boolean> subscriber) {
            ((w) qu.e.d(pb.a.a(), w.class)).i().b();
            subscriber.onNext(Boolean.TRUE);
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements c.a<Boolean> {
        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super Boolean> subscriber) {
            subscriber.onNext(Boolean.TRUE);
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: th.g$g, reason: collision with other inner class name */
    public class C1204g implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90615a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f90616b;

        public C1204g(final String val$name, final long[] val$timeSlot) {
            this.f90615a = val$name;
            this.f90616b = val$timeSlot;
        }

        @Override // wb0.a
        public void call() {
            qb.c.i(g.f90605a, "[Elapsed] " + this.f90615a + j2.O + (System.currentTimeMillis() - this.f90616b[0]), new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long[] f90617a;

        public h(final long[] val$timeSlot) {
            this.f90617a = val$timeSlot;
        }

        @Override // wb0.a
        public void call() {
            this.f90617a[0] = System.currentTimeMillis();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements c.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90618a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dc0.c f90619b;

        public i(final Context val$context, final dc0.c val$copyProgressPublish) {
            this.f90618a = val$context;
            this.f90619b = val$copyProgressPublish;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super String> subscriber) {
            String defaultRoot;
            qb.c.i(g.f90605a, "detect", new Object[0]);
            String detect = StoragePathDetector.detect(this.f90618a, this.f90619b);
            String type = this.f90618a.getContentResolver().getType(com.baicizhan.client.business.dataset.provider.a.a(BaicizhanContentProvider.f16080i, detect));
            qb.c.i(g.f90605a, "check root type: " + type, new Object[0]);
            if (!TextUtils.equals(type, BaicizhanContentProvider.f16082k) && (defaultRoot = StoragePathDetector.getDefaultRoot(this.f90618a)) != null) {
                detect = defaultRoot;
            }
            qb.c.i(g.f90605a, "detect end " + detect, new Object[0]);
            try {
                try {
                    g.q(this.f90618a, detect);
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    subscriber.onNext(detect);
                    subscriber.onCompleted();
                } catch (Exception e11) {
                    subscriber.onError(e11);
                }
            } catch (Exception unused) {
                String bestFolder = StoragePathDetector.getBestFolder();
                g.q(this.f90618a, bestFolder);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onNext(bestFolder);
                subscriber.onCompleted();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements Callable<UserRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90620a;

        public j(final Context val$context) {
            this.f90620a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserRecord call() throws Exception {
            qb.c.b(g.f90605a, "loadUser begin", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            UserRecord p11 = x.r().p();
            if (p11 != null) {
                p11.setIsNewUser(p11.getGameBeta() == 2);
            }
            UserRecord c11 = i9.m.c(this.f90620a);
            qb.c.b(g.f90605a, "getCurrentUserRecord: %s, time %d ", c11 == null ? "null" : c11.getDisplayName(), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return c11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements Callable<List<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90621a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends bp.a<List<Integer>> {
            public a() {
            }
        }

        public k(final Context val$context) {
            this.f90621a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Integer> call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            List<Integer> list = (List) i9.f.e(this.f90621a, i9.f.f60365c0, new a().getType(), false);
            y9.e.f().h();
            qb.c.b(g.f90605a, "getJsonBean: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            return list;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements wb0.p<BczSystemApiService.Client, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90623a;

        public l(final Context val$context) {
            this.f90623a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(BczSystemApiService.Client client) {
            qb.c.b(g.f90605a, "loadOtherInfo begin", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            dg.c.c().a(this.f90623a);
            if (!dg.c.c().i()) {
                x.r().a(1);
            }
            qb.c.b(g.f90605a, "init consume check recource: " + (System.currentTimeMillis() - currentTimeMillis) + "; completed? " + dg.c.c().i(), new Object[0]);
            try {
                qb.c.b(g.f90605a, "checkIn ", new Object[0]);
                long currentTimeMillis2 = System.currentTimeMillis();
                x.r().l0(client.check_infos());
                qb.c.b(g.f90605a, "check end %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                return null;
            } catch (Exception e11) {
                qb.c.c(g.f90605a, "loadCheckInfo", e11);
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m implements wb0.r<UserRecord, List<Integer>, Integer, Integer> {
        @Override // wb0.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer i(UserRecord userRecord, List<Integer> integers, Integer integer) {
            int i11 = userRecord != null ? 1 : 2;
            qb.c.i(g.f90605a, "checkIn result:" + i11, new Object[0]);
            if (userRecord != null) {
                userRecord.setBetaTypeList(integers);
                x.r().q0(userRecord);
            }
            return Integer.valueOf(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n implements wb0.b<Notification<? super Boolean>> {
        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Notification<? super Boolean> notification) {
            qb.c.b(g.f90605a, "unzip " + notification.toString(), new Object[0]);
        }
    }

    public static rx.c<Boolean> i(Context context) {
        return rx.c.j1(new e()).w5(bc0.c.a());
    }

    public static rx.c<Integer> j(final Context context) {
        return rx.c.q7(o(context), n(context), m(context), new m());
    }

    public static rx.c<String> k(final Context context, final dc0.c<FileUtils.DirCopyProgress> copyProgressPublish) {
        return rx.c.j1(new i(context, copyProgressPublish)).w5(bc0.c.a());
    }

    public static rx.c<Integer> l(final Context context, dc0.c<FileUtils.DirCopyProgress> copyProgressPublish) {
        return r("detectAppRoot", k(context, copyProgressPublish)).b2(new f(context));
    }

    public static rx.c<Integer> m(final Context context) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/bcz_system").e(false).f(com.baicizhan.client.business.thrift.c.f16594v).d(3000).b(1000).c(1)).w5(bc0.c.e()).c3(new l(context));
    }

    public static rx.c<List<Integer>> n(final Context context) {
        return rx.c.z2(new k(context)).w5(bc0.c.e());
    }

    public static rx.c<UserRecord> o(final Context context) {
        return rx.c.z2(new j(context)).w5(bc0.c.e());
    }

    public static rx.c<Boolean> p(final Context context) {
        return rx.c.j1(new c(context)).w5(bc0.c.a());
    }

    public static void q(Context context, String baicizhanPath) {
        qb.c.b(f90605a, "prepareBaicizhanRoot", new Object[0]);
        context.getContentResolver().getType(com.baicizhan.client.business.dataset.provider.a.a(BaicizhanContentProvider.f16081j, baicizhanPath));
        qb.c.b(f90605a, "getType", new Object[0]);
        i9.j.m(i9.j.f60412c, baicizhanPath);
        qb.c.b(f90605a, i9.j.f60410a, new Object[0]);
        PathUtil.init();
        qb.c.b(f90605a, "prepareBaicizhanRoot end", new Object[0]);
    }

    public static <T> rx.c<T> r(final String name, rx.c<T> observable) {
        long[] jArr = new long[1];
        return observable.N1(new h(jArr)).H1(new C1204g(name, jArr));
    }

    public static void s(Context context) {
        if (xb.o.h(context)) {
            File baicizhanFile = PathUtil.getBaicizhanFile("debug.config");
            qb.c.b(f90605a, "readDebugOption " + baicizhanFile, new Object[0]);
            if (baicizhanFile == null || !baicizhanFile.exists()) {
                qb.c.b(f90605a, "debug.config not exists", new Object[0]);
            } else {
                try {
                    DebugConfig.setInstance((DebugConfig) new com.google.gson.d().n(FileUtils.readTextFile(baicizhanFile, 0, null), DebugConfig.class));
                    qb.c.b(f90605a, "debug.config " + DebugConfig.getsIntance().toString(), new Object[0]);
                } catch (Exception e11) {
                    qb.c.b(f90605a, e11.toString(), new Object[0]);
                }
            }
        }
        DebugConfig.getsIntance().init(context);
    }

    public static rx.c<Boolean> t() {
        return rx.c.j1(new d()).w5(bc0.c.a());
    }

    public static rx.c<Boolean> u(final Context context, final String appRoot) {
        return rx.c.u2(gi.b.f53730a.keySet()).I3(bc0.c.a()).b2(new b(context, appRoot)).c(new a()).J1(new n());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.p<Boolean, Boolean> {
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Boolean aBoolean) {
            return aBoolean;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements wb0.p<String, rx.c<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f90614a;

        public f(final Context val$context) {
            this.f90614a = val$context;
        }

        @Override // wb0.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public rx.c<Integer> call(String s11) {
            return rx.c.o7(g.r("checkIn", g.j(this.f90614a)), g.r("unzip", g.u(this.f90614a, s11)), g.r("miscInit", g.p(this.f90614a)), g.r("initAd", g.i(this.f90614a)), g.r("serverTimeCheck", g.t()), new t() { // from class: th.f
                @Override // wb0.t
                public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return g.f.a((Integer) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5);
                }
            });
        }

        public static /* synthetic */ Integer a(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            return num;
        }
    }
}
