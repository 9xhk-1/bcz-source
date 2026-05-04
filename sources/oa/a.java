package oa;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.provider.BaicizhanContentProvider;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.uploadlog.uploadlog.UploadParam;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.networks.upload.RxLargeFileUpload;
import i9.j;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import q9.x;
import rx.c;
import wb0.o;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f76715a = "UploadLogManager";

    /* renamed from: b, reason: collision with root package name */
    public static final String f76716b = "http://assistant.baicizhan.com/api/feedback/upload_log";

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f76717c = {a.c.f16130e, "baicizhantopicproblem.db-wal", "baicizhantopicproblem.db-shm", a.c.f16132g, "baicizhandoexampleinfo.db-wal", "baicizhandoexampleinfo.db-shm"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f76718d = {"word_book", "word_book-wal", "word_book-shm"};

    /* renamed from: e, reason: collision with root package name */
    public static final int f76719e = 5000;

    /* renamed from: f, reason: collision with root package name */
    public static final String f76720f = "BCZCache/uploadLog.zip";

    /* renamed from: g, reason: collision with root package name */
    public static final String f76721g = "BCZCache/uploadLogForCrash.zip";

    /* renamed from: h, reason: collision with root package name */
    public static final String f76722h = "app_crash_id";

    /* renamed from: i, reason: collision with root package name */
    public static final String f76723i = "access_token";

    /* renamed from: j, reason: collision with root package name */
    public static final String f76724j = "Cookie";

    /* renamed from: k, reason: collision with root package name */
    public static final String f76725k = "Upload-Param";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: oa.a$a, reason: collision with other inner class name */
    public class C0936a extends qb0.g<Integer> {
        public C0936a() {
        }

        @Override // qb0.c
        public void onCompleted() {
            qb.c.i(a.f76715a, "finish upload id = %s", j.h(a.f76722h));
            j.m(a.f76722h, "");
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(a.f76715a, "checkAutoUpload", e11);
        }

        @Override // qb0.c
        public void onNext(Integer s11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<String, rx.c<Integer>> {
        public b() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Integer> call(String s11) {
            if (!rb.d.f(pb.a.a()) || !rb.d.j(pb.a.a())) {
                throw new RuntimeException("Wifi is not available, we can not auto upload log, try next time");
            }
            qb.c.i(a.f76715a, "about to Upload crashLog id = %s", s11);
            return a.this.m(s11, new pa.c(), null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.a<String> {
        public c() {
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super String> subscriber) {
            String h11 = j.h(a.f76722h);
            if (!TextUtils.isEmpty(h11)) {
                subscriber.onNext(h11);
            }
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements p<File, rx.c<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f76729a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f76730b;

        public d(final String val$crashId, final boolean val$isCrash) {
            this.f76729a = val$crashId;
            this.f76730b = val$isCrash;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Integer> call(File file) {
            return RxLargeFileUpload.upload(a.f76716b, file, a.this.f(this.f76729a, this.f76730b), true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements p<List<File>, File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f76732a;

        public e(final boolean val$isCrash) {
            this.f76732a = val$isCrash;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public File call(List<File> files) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(pb.a.a().getCacheDir().getAbsolutePath());
            sb2.append(File.separator);
            sb2.append(this.f76732a ? a.f76721g : a.f76720f);
            String sb3 = sb2.toString();
            File file = new File(sb3);
            if (!file.getParentFile().exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(sb3);
            try {
                yb.f.v(files, file2);
                return file2;
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements o<List<File>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa.b f76734a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f76735b;

        public f(final pa.b val$strategy, final Integer val$days) {
            this.f76734a = val$strategy;
            this.f76735b = val$days;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<File> call() {
            List<File> a11 = this.f76734a.a(qb.c.g(), qb.c.f(), this.f76735b);
            String c11 = BaicizhanContentProvider.c(pb.a.a());
            for (String str : a.f76717c) {
                File file = new File(c11, str);
                if (file.exists()) {
                    a11.add(file);
                } else {
                    qb.c.i(a.f76715a, "FILE NOT EXISTS %s", file.getAbsoluteFile());
                }
            }
            for (String str2 : a.f76718d) {
                File databasePath = pb.a.a().getDatabasePath(str2);
                if (databasePath.exists()) {
                    a11.add(databasePath);
                }
            }
            return a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f76737a = new a();
    }

    public static a g() {
        return g.f76737a;
    }

    public void e() {
        rx.c.j1(new c()).b2(new b()).x1(5000L, TimeUnit.MILLISECONDS, bc0.c.e()).N3().I3(bc0.c.e()).r5(new C0936a());
    }

    public final Map<String, String> f(String crashId, boolean isCrash) {
        UserRecord p11 = x.r().p();
        String token = p11 != null ? p11.getToken() : "";
        UploadParam uploadParam = new UploadParam(crashId, isCrash ? 1 : 2);
        HashMap hashMap = new HashMap();
        hashMap.put(f76725k, BczJson.writeToJson(uploadParam, UploadParam.class));
        hashMap.put("Cookie", "access_token=" + token);
        return hashMap;
    }

    public rx.c<File> h(Integer day) {
        return i("", new pa.c(), day).w5(bc0.c.e());
    }

    public final rx.c<File> i(final String crashId, final pa.b strategy, final Integer days) {
        return rx.c.z2(new f(strategy, days)).c3(new e(TextUtils.isEmpty(crashId)));
    }

    public void j(String crashId) {
        if (TextUtils.isEmpty(crashId)) {
            return;
        }
        j.m(f76722h, crashId);
    }

    public rx.c<Integer> k(Integer days) {
        return m("", new pa.c(), days);
    }

    public rx.c<Integer> l(Integer days, String tag) {
        return m(tag, new pa.c(), days);
    }

    public final rx.c<Integer> m(final String crashId, final pa.b strategy, final Integer days) {
        return i(crashId, strategy, days).b2(new d(crashId, TextUtils.isEmpty(crashId))).w5(bc0.c.e());
    }

    public a() {
    }
}
