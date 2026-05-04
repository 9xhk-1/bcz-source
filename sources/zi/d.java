package zi;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.baicizhan.main.wikiv2.study.model.f;
import com.baicizhan.main.wikiv2.study.model.g;
import com.baicizhan.main.wikiv2.study.model.h;
import com.baicizhan.online.resource_api.TopicResourceV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import sh.r;
import th.s;
import wb0.p;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nWikiLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiLoader.kt\ncom/baicizhan/main/wikiv2/study/data/WikiLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f102693b = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f102694a = "WikiLoader";

    public static final List e(int i11, TopicRecord topicRecord) {
        ExtendedWordInfo fromTopicResV2;
        ArrayList arrayList = new ArrayList();
        g0.m(topicRecord);
        com.baicizhan.main.wikiv2.study.model.c b11 = a.b(topicRecord);
        r rVar = r.f88672a;
        TopicResourceV2 topicResourceV2 = rVar.d().get(Integer.valueOf(i11));
        List<ExtendedWordInfo.WordDeform> list = null;
        if (topicResourceV2 != null && (fromTopicResV2 = ExtendedWordInfo.fromTopicResV2(topicResourceV2)) != null) {
            list = fromTopicResV2.wordDeforms;
        }
        b11.f(list);
        arrayList.add(b11);
        arrayList.add(a.c(topicRecord));
        h f11 = a.f(rVar.c().get(Integer.valueOf(i11)));
        if (f11 != null) {
            arrayList.add(f11);
        }
        g e11 = a.e(topicRecord);
        if (e11 != null) {
            arrayList.add(e11);
        }
        com.baicizhan.main.wikiv2.study.model.a a11 = a.a(topicRecord);
        if (a11 != null) {
            arrayList.add(a11);
        }
        f d11 = a.d(topicRecord);
        if (d11 != null) {
            arrayList.add(d11);
        }
        arrayList.add(new com.baicizhan.main.wikiv2.study.model.b(topicRecord, arrayList));
        return arrayList;
    }

    public static final List f(l lVar, Object obj) {
        return (List) lVar.invoke(obj);
    }

    @k
    public final String c() {
        return this.f102694a;
    }

    @k
    public final rx.c<List<?>> d(@k Context context, int i11, final int i12) {
        g0.p(context, "context");
        rx.c<TopicRecord> g11 = s.g(context, i11, i12);
        final l lVar = new l() { // from class: zi.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                List e11;
                e11 = d.e(i12, (TopicRecord) obj);
                return e11;
            }
        };
        rx.c c32 = g11.c3(new p() { // from class: zi.c
            @Override // wb0.p
            public final Object call(Object obj) {
                List f11;
                f11 = d.f(l.this, obj);
                return f11;
            }
        });
        g0.o(c32, "map(...)");
        return c32;
    }
}
