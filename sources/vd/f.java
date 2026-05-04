package vd;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo;
import com.baicizhan.online.user_study_api.DakaBackgroundData;
import gs.gd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import qb0.g;
import rx.c;
import wb0.p;
import wb0.t;
import x00.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSentenceProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceProcessor.kt\ncom/baicizhan/main/activity/daka/imagedaka/sentence/SentenceProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1869#2,2:86\n*S KotlinDebug\n*F\n+ 1 SentenceProcessor.kt\ncom/baicizhan/main/activity/daka/imagedaka/sentence/SentenceProcessor\n*L\n33#1:86,2\n*E\n"})
/* loaded from: classes4.dex */
public final class f extends pd.a {

    /* renamed from: s, reason: collision with root package name */
    public static final int f93834s = 8;

    /* renamed from: p, reason: collision with root package name */
    @l
    public gd f93836p;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Triple<String, String, String> f93838r;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f93835o = "sentence";

    /* renamed from: q, reason: collision with root package name */
    @k
    public List<String> f93837q = new ArrayList();

    private final rx.c<gd> s(final Context context) {
        return rx.c.j1(new c.a() { // from class: vd.e
            @Override // wb0.b
            public final void call(Object obj) {
                f.t(f.this, context, (g) obj);
            }
        }).w5(tb0.a.a());
    }

    public static final void t(f fVar, Context context, g gVar) {
        if (fVar.f93836p == null) {
            fVar.f93836p = gd.d(LayoutInflater.from(context));
        }
        gVar.onStart();
        gVar.onNext(fVar.f93836p);
        gVar.onCompleted();
    }

    public static final rx.c u(final f fVar, Context context, g.j jVar) {
        DakaBackgroundData dakaBackgroundData;
        List<DakaBackgroundCategoryInfo> list;
        DakaBackgroundData dakaBackgroundData2;
        DakaBackgroundData dakaBackgroundData3;
        String str = null;
        rx.c<Bitmap> i11 = fVar.i((jVar == null || (dakaBackgroundData3 = jVar.f18379a) == null) ? null : dakaBackgroundData3.qr_image);
        if (jVar != null && (dakaBackgroundData2 = jVar.f18379a) != null) {
            str = dakaBackgroundData2.logo;
        }
        rx.c<Bitmap> i12 = fVar.i(str);
        rx.c M2 = rx.c.M2(jVar);
        if (jVar != null && (dakaBackgroundData = jVar.f18379a) != null && (list = dakaBackgroundData.category_info) != null) {
            for (DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo : list) {
                if (g0.g(pd.a.f80339i, dakaBackgroundCategoryInfo.name)) {
                    fVar.f93837q.clear();
                    List<String> list2 = fVar.f93837q;
                    List<String> images = dakaBackgroundCategoryInfo.images;
                    g0.o(images, "images");
                    list2.addAll(images);
                    fVar.f93838r = new Triple<>(dakaBackgroundCategoryInfo.sentence, dakaBackgroundCategoryInfo.sen_mean, dakaBackgroundCategoryInfo.sen_source);
                }
            }
        }
        rx.c<Bitmap> i13 = fVar.i(fVar.f93837q.get(0));
        rx.c<gd> s11 = fVar.s(context);
        final s sVar = new s() { // from class: vd.c
            @Override // x00.s
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                Bitmap v11;
                v11 = f.v(f.this, (gd) obj, (Bitmap) obj2, (Bitmap) obj3, (Bitmap) obj4, (g.j) obj5);
                return v11;
            }
        };
        return rx.c.o7(s11, i11, i12, i13, M2, new t() { // from class: vd.d
            @Override // wb0.t
            public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                Bitmap w11;
                w11 = f.w(s.this, obj, obj2, obj3, obj4, obj5);
                return w11;
            }
        }).w5(tb0.a.a());
    }

    public static final Bitmap v(f fVar, gd gdVar, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, g.j jVar) {
        if (gdVar == null) {
            return null;
        }
        gdVar.f55056c.setText("我在百词斩坚持学习" + jVar.f18380b.total_daka_days + "天");
        gdVar.f55058e.setImageBitmap(bitmap3);
        gdVar.f55055b.setImageBitmap(bitmap);
        TextView textView = gdVar.f55060g;
        Triple<String, String, String> triple = fVar.f93838r;
        textView.setText(triple != null ? triple.getFirst() : null);
        TextView textView2 = gdVar.f55059f;
        Triple<String, String, String> triple2 = fVar.f93838r;
        textView2.setText(triple2 != null ? triple2.getSecond() : null);
        TextView textView3 = gdVar.f55061h;
        Triple<String, String, String> triple3 = fVar.f93838r;
        textView3.setText(triple3 != null ? triple3.getThird() : null);
        View root = gdVar.getRoot();
        g0.o(root, "getRoot(...)");
        fVar.f80346b.postValue("");
        return fVar.k(root);
    }

    public static final Bitmap w(s sVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (Bitmap) sVar.invoke(obj, obj2, obj3, obj4, obj5);
    }

    public static final rx.c x(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    @Override // pd.d
    @k
    public rx.c<Bitmap> a(@k final Context context) {
        g0.p(context, "context");
        rx.c<g.j> l11 = com.baicizhan.main.activity.daka.datasource.g.n().l(context);
        final x00.l lVar = new x00.l() { // from class: vd.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c u11;
                u11 = f.u(f.this, context, (g.j) obj);
                return u11;
            }
        };
        rx.c<Bitmap> c32 = l11.b2(new p() { // from class: vd.b
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c x11;
                x11 = f.x(x00.l.this, obj);
                return x11;
            }
        }).I3(bc0.c.e()).c3(l(this.f93835o + "0"));
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
        return "DailySentence";
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
        return this.f93835o;
    }
}
