package com.baicizhan.main.activity.daka.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.networks.upload.RxUploader;
import com.baicizhan.client.business.util.networks.upload.result.CommonResult;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.online.bs_socials.BBShareChannel;
import com.baicizhan.online.bs_socials.BBShareModule;
import com.baicizhan.online.bs_socials.BSSocials;
import com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo;
import com.baicizhan.online.user_study_api.DakaBackgroundData;
import com.baicizhan.online.user_study_api.RecommendationDaka;
import com.baicizhan.online.user_study_api.UserDakaShareInfo;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q9.x;
import wb0.p;
import wb0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f18358b = "ImageDakaDataSource";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18359c = "http://avatar.baicizhan.com/avatar/checkimg";

    /* renamed from: a, reason: collision with root package name */
    public j f18360a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<BSSocials.Client, rx.c<Boolean>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ShareChannel f18361a;

        public a(final ShareChannel val$channel) {
            this.f18361a = val$channel;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<Boolean> call(BSSocials.Client client) {
            try {
                int i11 = h.f18374a[this.f18361a.ordinal()];
                return rx.c.M2(Boolean.valueOf(client.send_share_success(BBShareModule.SHARE_MODULE_DAKA, i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? null : BBShareChannel.SHARE_CHANNEL_WEIXIN_CIRCLE : BBShareChannel.SHARE_CHANNEL_WEIXIN_FRIEND : BBShareChannel.SHARE_CHANNEL_SINA : BBShareChannel.SHARE_CHANNEL_QQ_CIRCLE : BBShareChannel.SHARE_CHANNEL_QQ_FRIEND, System.currentTimeMillis())));
            } catch (Throwable th2) {
                return rx.c.T1(th2);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<UserDakaShareInfo, ld.b> {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b9, code lost:
        
            r1 = r1 + 1;
         */
        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ld.b call(com.baicizhan.online.user_study_api.UserDakaShareInfo r11) {
            /*
                r10 = this;
                java.util.List<com.baicizhan.online.user_study_api.UserDakaDate> r11 = r11.daka_dates
                java.util.List r11 = com.baicizhan.client.business.util.TimeUtil.convert2Seconds(r11)
                java.util.Collections.sort(r11)
                boolean r0 = r11.isEmpty()
                r1 = 1
                r2 = 1000(0x3e8, double:4.94E-321)
                if (r0 == 0) goto L1c
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = com.baicizhan.client.business.util.TimeUtil.getStartOfDay(r4)
                long r4 = r4 / r2
                goto L35
            L1c:
                int r0 = r11.size()
                int r0 = r0 - r1
                java.lang.Object r0 = r11.get(r0)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                long r4 = (long) r0
                long r6 = java.lang.System.currentTimeMillis()
                long r6 = r6 / r2
                long r4 = java.lang.Math.max(r4, r6)
            L35:
                ld.b r0 = new ld.b
                r0.<init>()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r0.f71089a = r6
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                r0.f71090b = r6
                java.util.Calendar r6 = java.util.Calendar.getInstance()
                r0.f71091c = r6
                long r7 = java.lang.System.currentTimeMillis()
                r6.setTimeInMillis(r7)
                java.util.Iterator r11 = r11.iterator()
            L59:
                boolean r6 = r11.hasNext()
                if (r6 == 0) goto L78
                java.lang.Object r6 = r11.next()
                java.lang.Integer r6 = (java.lang.Integer) r6
                java.util.Calendar r7 = java.util.Calendar.getInstance()
                int r6 = r6.intValue()
                long r8 = (long) r6
                long r8 = r8 * r2
                r7.setTimeInMillis(r8)
                java.util.List<java.util.Calendar> r6 = r0.f71089a
                r6.add(r7)
                goto L59
            L78:
                java.util.Calendar r11 = r0.f71091c
                r6 = 5
                int r11 = r11.getActualMaximum(r6)
                if (r1 > r11) goto Lbc
                java.util.Calendar r11 = java.util.Calendar.getInstance()
                java.util.Calendar r7 = r0.f71091c
                long r7 = r7.getTimeInMillis()
                r11.setTimeInMillis(r7)
                r11.set(r6, r1)
                java.util.List<java.util.Calendar> r6 = r0.f71089a
                java.util.Iterator r6 = r6.iterator()
            L97:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto Laa
                java.lang.Object r7 = r6.next()
                java.util.Calendar r7 = (java.util.Calendar) r7
                boolean r7 = bg.a.e(r7, r11)
                if (r7 == 0) goto L97
                goto Lb9
            Laa:
                long r6 = r11.getTimeInMillis()
                long r6 = r6 / r2
                int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r6 <= 0) goto Lb4
                goto Lbc
            Lb4:
                java.util.List<java.util.Calendar> r6 = r0.f71090b
                r6.add(r11)
            Lb9:
                int r1 = r1 + 1
                goto L78
            Lbc:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.daka.datasource.g.b.call(com.baicizhan.online.user_study_api.UserDakaShareInfo):ld.b");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements q<UserDakaShareInfo, DakaBackgroundData, j> {
        public c() {
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call(UserDakaShareInfo userDakaShareInfo, DakaBackgroundData dakaBackgroundData) {
            g.this.f18360a = new j();
            g.this.f18360a.f18379a = dakaBackgroundData;
            g.this.f18360a.f18380b = userDakaShareInfo;
            return g.this.f18360a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements p<UserStudyApiService.Client, DakaBackgroundData> {
        public d() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DakaBackgroundData call(UserStudyApiService.Client client) {
            Map<Integer, TopicLearnRecord> L = LearnRecordManager.A().L();
            if (L == null) {
                throw new RuntimeException("learnrecord Null");
            }
            ArrayList arrayList = new ArrayList();
            for (TopicLearnRecord topicLearnRecord : L.values()) {
                if (topicLearnRecord.topicDay == 0) {
                    arrayList.add(Integer.valueOf(topicLearnRecord.topicId));
                }
            }
            try {
                DakaBackgroundData dakaBackgroundData = client.get_daka_background_datas(arrayList);
                List<DakaBackgroundCategoryInfo> list = dakaBackgroundData.category_info;
                if (list == null || list.isEmpty()) {
                    throw new RuntimeException("null or empty category_info");
                }
                return dakaBackgroundData;
            } catch (Exception e11) {
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements p<InputStream, rx.c<String>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18366a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements p<String, String> {
            public a() {
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String call(String s11) {
                qb.c.i(g.f18358b, "after check", new Object[0]);
                if (TextUtils.isEmpty(s11)) {
                    throw new RuntimeException("photo not legal");
                }
                CommonResult fromJson = CommonResult.fromJson(s11);
                if (fromJson.error_code == 0) {
                    return e.this.f18366a;
                }
                qb.c.i(g.f18358b, "%s", s11);
                throw new PhotoException(fromJson.data);
            }
        }

        public e(final String val$uri) {
            this.f18366a = val$uri;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<String> call(InputStream s11) {
            return RxUploader.upload(g.f18359c, new RxUploader.CommonStringRequestFactory(0, new gf.a(s11))).c3(new a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements p<String, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18369a;

        public f(final String val$uri) {
            this.f18369a = val$uri;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InputStream call(String s11) {
            try {
                qb.c.i(g.f18358b, "compress begin", new Object[0]);
                Bitmap decodeFile = BitmapFactory.decodeFile(Uri.parse(this.f18369a).getPath());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Bitmap.createScaledBitmap(decodeFile, 400, (int) ((decodeFile.getHeight() / decodeFile.getWidth()) * 400.0f), true).compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                qb.c.i(g.f18358b, "compress %d", Integer.valueOf(byteArray.length));
                return new ByteArrayInputStream(byteArray);
            } catch (Exception unused) {
                throw new RuntimeException("file not found");
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.activity.daka.datasource.g$g, reason: collision with other inner class name */
    public class C0284g implements p<Integer, UserDakaShareInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f18371a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f18372b;

        public C0284g(final int val$currentBookId, final Context val$context) {
            this.f18371a = val$currentBookId;
            this.f18372b = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserDakaShareInfo call(Integer integer) {
            int i11 = this.f18371a;
            if (i11 == 0) {
                i11 = x.r().o().bookId;
            }
            UserDakaShareInfo p11 = nd.d.b(this.f18372b, i11, LearnRecordManager.A().I()).t6().p();
            if (integer.intValue() > 0) {
                ia.a.l(ia.a.f60467r, System.currentTimeMillis());
            }
            return p11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18374a;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            f18374a = iArr;
            try {
                iArr[ShareChannel.QQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18374a[ShareChannel.QZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18374a[ShareChannel.WEIBO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18374a[ShareChannel.WEIXIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18374a[ShareChannel.WEIXIN_CIRCLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public UserDakaShareInfo f18375a;

        /* renamed from: b, reason: collision with root package name */
        public ld.b f18376b;

        /* renamed from: c, reason: collision with root package name */
        public RecommendationDaka f18377c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f18378d;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public DakaBackgroundData f18379a;

        /* renamed from: b, reason: collision with root package name */
        public UserDakaShareInfo f18380b;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public static g f18381a = new g();
    }

    public static /* synthetic */ i b(i iVar, RecommendationDaka recommendationDaka) {
        iVar.f18377c = recommendationDaka;
        qb.c.i(f18358b, "%s", new com.google.gson.d().z(iVar));
        return iVar;
    }

    public static /* synthetic */ RecommendationDaka e(UserStudyApiService.Client client) {
        try {
            return client.get_recommendation().rec_daka;
        } catch (Throwable th2) {
            qb.c.c(f18358b, "requestChallenge failed.", th2);
            return null;
        }
    }

    public static g n() {
        return k.f18381a;
    }

    public rx.c<i> h(Context context) {
        return w(context, 0).b2(new p() { // from class: com.baicizhan.main.activity.daka.datasource.c
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c r11;
                r11 = g.this.r((UserDakaShareInfo) obj);
                return r11;
            }
        }).b2(new p() { // from class: com.baicizhan.main.activity.daka.datasource.d
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c s11;
                s11 = g.this.s((g.i) obj);
                return s11;
            }
        }).w5(bc0.c.e());
    }

    public rx.c<ld.b> i(UserDakaShareInfo userDakaShareInfo) {
        return rx.c.M2(userDakaShareInfo).c3(new b());
    }

    public rx.c<String> j(final String uri) {
        return rx.c.M2(uri).c3(new f(uri)).w5(bc0.c.e()).b2(new e(uri));
    }

    public final rx.c<DakaBackgroundData> k() {
        return com.baicizhan.client.business.thrift.p.b("/rpc/user_study").c3(new d()).w5(bc0.c.e());
    }

    public rx.c<j> l(Context context) {
        return m(context, 0);
    }

    public rx.c<j> m(Context context, int bookId) {
        j jVar = this.f18360a;
        return jVar != null ? rx.c.M2(jVar) : rx.c.r7(w(context, bookId), k(), new c()).w5(bc0.c.e());
    }

    public boolean o(Context context) {
        return hi.e.d() && !TextUtils.isEmpty(hi.e.a().getFinal_exam_link_popup()) && !hi.e.g(context) && x.r().A() <= LearnRecordManager.A().y();
    }

    public boolean p() {
        return hi.g.a().c();
    }

    public final /* synthetic */ i q(UserDakaShareInfo userDakaShareInfo, ld.b bVar) {
        i iVar = new i();
        iVar.f18375a = userDakaShareInfo;
        iVar.f18376b = bVar;
        iVar.f18378d = Boolean.valueOf(p());
        return iVar;
    }

    public final /* synthetic */ rx.c r(final UserDakaShareInfo userDakaShareInfo) {
        return i(userDakaShareInfo).c3(new p() { // from class: com.baicizhan.main.activity.daka.datasource.f
            @Override // wb0.p
            public final Object call(Object obj) {
                g.i q11;
                q11 = g.this.q(userDakaShareInfo, (ld.b) obj);
                return q11;
            }
        });
    }

    public final /* synthetic */ rx.c s(final i iVar) {
        return t().c3(new p() { // from class: com.baicizhan.main.activity.daka.datasource.e
            @Override // wb0.p
            public final Object call(Object obj) {
                return g.b(g.i.this, (RecommendationDaka) obj);
            }
        });
    }

    public final rx.c<RecommendationDaka> t() {
        return p() ? rx.c.M2(null) : com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study").d(3000).b(1000).c(1)).w5(bc0.c.e()).c3(new p() { // from class: com.baicizhan.main.activity.daka.datasource.b
            @Override // wb0.p
            public final Object call(Object obj) {
                return g.e((UserStudyApiService.Client) obj);
            }
        });
    }

    public void u() {
        this.f18360a = null;
    }

    public rx.c<Boolean> v(final ShareChannel channel) {
        return channel == null ? rx.c.M2(Boolean.FALSE) : com.baicizhan.client.business.thrift.p.b("/rpc/socials").b2(new a(channel)).w5(bc0.c.e());
    }

    public final rx.c<UserDakaShareInfo> w(final Context context, final int currentBookId) {
        return LearnRecordManager.A().c0(context).c3(new C0284g(currentBookId, context)).w5(bc0.c.e());
    }
}
