package oh;

import android.content.Context;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.JsonSerializer;
import gi.e;
import i9.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import q9.x;
import qb0.g;
import qb0.h;
import sh.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f76977b = "StudyPreloader";

    /* renamed from: c, reason: collision with root package name */
    public static final int f76978c = 50;

    /* renamed from: a, reason: collision with root package name */
    public h f76979a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<List<Integer>> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(c.f76977b, "", e11);
        }

        @Override // qb0.c
        public void onNext(List<Integer> vo2) {
            if (vo2 == null || vo2.isEmpty()) {
                qb.c.i(c.f76977b, "no words", new Object[0]);
            } else {
                oh.b.c(pb.a.a(), (ArrayList) vo2, x.r().l());
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callable<List<Integer>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f76981a;

        public b(final Context val$context) {
            this.f76981a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Integer> call() throws Exception {
            int l11 = x.r().l();
            Context context = this.f76981a;
            if (context == null || l11 <= 0) {
                throw new IllegalArgumentException("null == context || currentBook <= 0 || null == roadMap || null == learned || plan <= 0");
            }
            c cVar = c.this;
            return cVar.d(context, l11, cVar.h(context));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: oh.c$c, reason: collision with other inner class name */
    public static class C0939c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f76983a = new c();
    }

    public static c c() {
        return C0939c.f76983a;
    }

    public final List<Integer> d(Context context, int bookId, List<Integer> words) {
        int d11 = x.r().s().u().d();
        if (d11 < 0) {
            d11 = 0;
        }
        if (words.size() < d11) {
            qb.c.i(f76977b, "no word need preload", new Object[0]);
            return Collections.EMPTY_LIST;
        }
        Set<Integer> b11 = e.b(words.subList(0, d11));
        qb.c.i(f76977b, "today related (F + G) %s ", new JsonSerializer(List.class).writeToJson(b11));
        List<Integer> subList = words.subList(d11, words.size());
        if (!rb.d.j(context) && subList.size() > 50) {
            subList = subList.subList(0, 50);
        }
        Set<Integer> b12 = e.b(subList);
        ArrayList arrayList = new ArrayList();
        Map<Integer, TopicRecord> e11 = l.e(context, bookId, b12);
        for (Integer num : b12) {
            int intValue = num.intValue();
            if (!b11.contains(num)) {
                TopicRecord topicRecord = e11.get(num);
                if (!sh.c.d().g(intValue) && topicRecord == null) {
                    topicRecord = sh.a.b().e(bookId, intValue);
                }
                if (topicRecord == null) {
                    arrayList.add(num);
                } else if (!t.b(topicRecord)) {
                    arrayList.add(num);
                } else if (subList.contains(num) && rb.d.f(context) && LearnRecordManager.A().Q(intValue) && !t.c(topicRecord)) {
                    arrayList.add(num);
                }
            }
        }
        qb.c.i(f76977b, "needDownload %s", new JsonSerializer(List.class).writeToJson(arrayList));
        return arrayList;
    }

    public final rx.c<List<Integer>> e(final Context context) {
        return rx.c.z2(new b(context)).w5(bc0.c.a());
    }

    public void f() {
        qb.c.i(f76977b, TtmlNode.START, new Object[0]);
        h hVar = this.f76979a;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f76979a = e(pb.a.a()).r5(new a());
        } else {
            qb.c.i(f76977b, "duplicated preload", new Object[0]);
        }
    }

    public void g() {
        qb.c.i(f76977b, "stop", new Object[0]);
        h hVar = this.f76979a;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f76979a.unsubscribe();
        }
        oh.b.e(pb.a.a());
    }

    public final List<Integer> h(Context context) {
        List<Integer> z11 = x.r().z();
        Collection<TopicLearnRecord> x11 = LearnRecordManager.A().x();
        if (z11 == null || x11 == null) {
            throw new IllegalArgumentException("null == roadMap || null == learned");
        }
        int d11 = x.r().s().u().d();
        if (d11 < 0) {
            d11 = 0;
        }
        int i11 = x.r().k().dailyCount;
        ArrayList arrayList = new ArrayList();
        for (Integer num : z11) {
            Iterator<TopicLearnRecord> it = x11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(num);
                    break;
                }
                if (it.next().topicId == num.intValue()) {
                    break;
                }
            }
            if (arrayList.size() >= i11 + d11) {
                break;
            }
        }
        qb.c.i(f76977b, "unLearnWords(C + F) %d , %d , %s ", Integer.valueOf(i11), Integer.valueOf(d11), new JsonSerializer(List.class).writeToJson(arrayList));
        return arrayList;
    }

    public c() {
    }
}
