package wd;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo;
import com.baicizhan.online.user_study_api.DakaBackgroundData;
import com.jiongji.andriod.card.R;
import gs.id;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q9.x;
import qb0.g;
import rx.c;
import wb0.p;
import wb0.s;
import x00.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWinDayProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinDayProcessor.kt\ncom/baicizhan/main/activity/daka/imagedaka/win/WinDayProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1869#2,2:127\n*S KotlinDebug\n*F\n+ 1 WinDayProcessor.kt\ncom/baicizhan/main/activity/daka/imagedaka/win/WinDayProcessor\n*L\n47#1:127,2\n*E\n"})
/* loaded from: classes4.dex */
public final class f extends pd.a {

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final a f96179s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f96180t = 8;

    /* renamed from: u, reason: collision with root package name */
    public static final int f96181u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f96182v = 2;

    /* renamed from: p, reason: collision with root package name */
    @l
    public id f96184p;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Pair<Integer, Integer> f96186r;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f96183o = "sentence";

    /* renamed from: q, reason: collision with root package name */
    @k
    public List<String> f96185q = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    private final rx.c<id> s(final Context context) {
        return rx.c.j1(new c.a() { // from class: wd.e
            @Override // wb0.b
            public final void call(Object obj) {
                f.t(f.this, context, (g) obj);
            }
        }).w5(tb0.a.a());
    }

    public static final void t(f fVar, Context context, g gVar) {
        if (fVar.f96184p == null) {
            fVar.f96184p = id.d(LayoutInflater.from(context));
        }
        gVar.onStart();
        gVar.onNext(fVar.f96184p);
        gVar.onCompleted();
    }

    public static final rx.c u(final f fVar, Context context, g.j jVar) {
        DakaBackgroundData dakaBackgroundData;
        List<DakaBackgroundCategoryInfo> list;
        DakaBackgroundData dakaBackgroundData2;
        rx.c<Bitmap> i11 = fVar.i((jVar == null || (dakaBackgroundData2 = jVar.f18379a) == null) ? null : dakaBackgroundData2.qr_image);
        rx.c M2 = rx.c.M2(jVar);
        if (jVar != null && (dakaBackgroundData = jVar.f18379a) != null && (list = dakaBackgroundData.category_info) != null) {
            for (DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo : list) {
                if (g0.g(pd.a.f80338h, dakaBackgroundCategoryInfo.name)) {
                    fVar.f96185q.clear();
                    List<String> list2 = fVar.f96185q;
                    List<String> images = dakaBackgroundCategoryInfo.images;
                    g0.o(images, "images");
                    list2.addAll(images);
                    fVar.f96186r = new Pair<>(Integer.valueOf(dakaBackgroundCategoryInfo.win_days), Integer.valueOf(dakaBackgroundCategoryInfo.win_type));
                }
            }
        }
        rx.c<Bitmap> j11 = fVar.j(x.r().p().getImage(), R.drawable.defaultavatarbig_normal_default);
        rx.c<id> s11 = fVar.s(context);
        final r rVar = new r() { // from class: wd.c
            @Override // x00.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Bitmap v11;
                v11 = f.v(f.this, (id) obj, (Bitmap) obj2, (Bitmap) obj3, (g.j) obj4);
                return v11;
            }
        };
        return rx.c.p7(s11, i11, j11, M2, new s() { // from class: wd.d
            @Override // wb0.s
            public final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
                Bitmap w11;
                w11 = f.w(r.this, obj, obj2, obj3, obj4);
                return w11;
            }
        }).w5(tb0.a.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0.getSecond().intValue() == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap v(wd.f r6, gs.id r7, android.graphics.Bitmap r8, android.graphics.Bitmap r9, com.baicizhan.main.activity.daka.datasource.g.j r10) {
        /*
            r10 = 0
            if (r7 == 0) goto Lf3
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r0 = r6.f96186r
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L16
            goto L17
        L16:
            r2 = r1
        L17:
            android.view.View r0 = r7.getRoot()
            if (r2 == 0) goto L21
            r3 = 2131231913(0x7f0804a9, float:1.807992E38)
            goto L24
        L21:
            r3 = 2131231914(0x7f0804aa, float:1.8079922E38)
        L24:
            r0.setBackgroundResource(r3)
            android.widget.ImageView r0 = r7.f55309a
            r0.setImageBitmap(r8)
            r8 = 2131100402(0x7f0602f2, float:1.7813184E38)
            if (r2 == 0) goto L39
            r0 = 2131100386(0x7f0602e2, float:1.7813152E38)
            int r0 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r0)
            goto L3d
        L39:
            int r0 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r8)
        L3d:
            if (r2 == 0) goto L47
            r3 = 2131100404(0x7f0602f4, float:1.7813188E38)
            int r3 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r3)
            goto L4b
        L47:
            int r3 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r8)
        L4b:
            if (r2 != 0) goto L55
            android.view.View r4 = r7.f55319k
            r5 = 2131232127(0x7f08057f, float:1.8080354E38)
            r4.setBackgroundResource(r5)
        L55:
            android.widget.ImageView r4 = r7.f55311c
            r4.setColorFilter(r0)
            android.widget.TextView r0 = r7.f55316h
            r0.setTextColor(r3)
            android.widget.TextView r0 = r7.f55315g
            r4 = 2131099821(0x7f0600ad, float:1.7812006E38)
            if (r2 == 0) goto L6b
            int r5 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r8)
            goto L6f
        L6b:
            int r5 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r4)
        L6f:
            r0.setTextColor(r5)
            android.widget.TextView r0 = r7.f55315g
            if (r2 == 0) goto L7e
            r5 = 58
        L78:
            int r5 = com.baicizhan.client.business.util.KotlinExtKt.getDpValue(r5)
            float r5 = (float) r5
            goto L81
        L7e:
            r5 = 70
            goto L78
        L81:
            r0.setTextSize(r1, r5)
            android.widget.TextView r0 = r7.f55314f
            if (r2 == 0) goto L8d
            int r8 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r8)
            goto L91
        L8d:
            int r8 = com.baicizhan.client.business.util.KotlinExtKt.getColorInt(r4)
        L91:
            r0.setTextColor(r8)
            android.widget.TextView r8 = r7.f55315g
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r0 = r6.f96186r
            if (r0 == 0) goto La0
            java.lang.Object r10 = r0.getFirst()
            java.lang.Integer r10 = (java.lang.Integer) r10
        La0:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r8.setText(r10)
            com.baicizhan.client.business.widget.CircleImageView r8 = r7.f55310b
            r8.setImageBitmap(r9)
            android.widget.TextView r8 = r7.f55317i
            r8.setTextColor(r3)
            android.widget.TextView r8 = r7.f55317i
            q9.x r9 = q9.x.r()
            com.baicizhan.client.business.dataset.models.UserRecord r9 = r9.p()
            java.lang.String r9 = r9.getNickName()
            r8.setText(r9)
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            java.lang.String r9 = "EEEE, MMMM d"
            java.util.Locale r10 = java.util.Locale.ENGLISH
            r8.<init>(r9, r10)
            android.widget.TextView r9 = r7.f55313e
            r9.setTextColor(r3)
            android.widget.TextView r9 = r7.f55313e
            java.util.Date r10 = new java.util.Date
            r10.<init>()
            java.lang.String r8 = r8.format(r10)
            r9.setText(r8)
            android.view.View r7 = r7.getRoot()
            java.lang.String r8 = "getRoot(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            androidx.lifecycle.MutableLiveData<java.lang.String> r8 = r6.f80346b
            java.lang.String r9 = ""
            r8.postValue(r9)
            android.graphics.Bitmap r6 = r6.k(r7)
            return r6
        Lf3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.f.v(wd.f, gs.id, android.graphics.Bitmap, android.graphics.Bitmap, com.baicizhan.main.activity.daka.datasource.g$j):android.graphics.Bitmap");
    }

    public static final Bitmap w(r rVar, Object obj, Object obj2, Object obj3, Object obj4) {
        return (Bitmap) rVar.invoke(obj, obj2, obj3, obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rx.c x(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    @Override // pd.d
    @k
    public rx.c<Bitmap> a(@k final Context context) {
        g0.p(context, "context");
        rx.c<g.j> l11 = com.baicizhan.main.activity.daka.datasource.g.n().l(context);
        final x00.l lVar = new x00.l() { // from class: wd.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c u11;
                u11 = f.u(f.this, context, (g.j) obj);
                return u11;
            }
        };
        rx.c<Bitmap> c32 = l11.b2(new p() { // from class: wd.b
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c x11;
                x11 = f.x(x00.l.this, obj);
                return x11;
            }
        }).I3(bc0.c.e()).c3(l(this.f96183o + "0"));
        g0.o(c32, "map(...)");
        return c32;
    }

    @Override // pd.a, pd.d
    @k
    public Boolean b() {
        return Boolean.FALSE;
    }

    @Override // pd.d
    @k
    public String d() {
        Pair<Integer, Integer> pair = this.f96186r;
        return (pair == null || pair.getSecond().intValue() != 1) ? "SpecialContinuousDaka" : "ContinuousDaka";
    }

    @Override // pd.d
    @k
    public rx.c<Bitmap> f(@l Context context) {
        rx.c<Bitmap> T1 = rx.c.T1(new RuntimeException("no change"));
        g0.o(T1, "error(...)");
        return T1;
    }

    @k
    public final String r() {
        return this.f96183o;
    }
}
