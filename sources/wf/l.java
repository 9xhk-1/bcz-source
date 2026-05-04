package wf;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.main.wikiv2.study.model.ExtendedWordInfo;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.ZpkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.apache.thrift.TException;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static final String f96209i = "TopicAssetLoader";

    /* renamed from: j, reason: collision with root package name */
    public static final int f96210j = 20;

    /* renamed from: k, reason: collision with root package name */
    public static final int f96211k = 100;

    /* renamed from: l, reason: collision with root package name */
    public static final int f96212l = 3;

    /* renamed from: a, reason: collision with root package name */
    public List<wf.d> f96213a;

    /* renamed from: b, reason: collision with root package name */
    public List<wf.d> f96214b;

    /* renamed from: c, reason: collision with root package name */
    public int f96215c;

    /* renamed from: d, reason: collision with root package name */
    public int f96216d;

    /* renamed from: e, reason: collision with root package name */
    public qb0.h f96217e;

    /* renamed from: f, reason: collision with root package name */
    public qb0.h f96218f;

    /* renamed from: g, reason: collision with root package name */
    public qb0.h f96219g;

    /* renamed from: h, reason: collision with root package name */
    public dc0.c<wf.d> f96220h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<List<wf.d>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f96221a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rx.d f96222b;

        public a(final Context val$context, final rx.d val$observeOn) {
            this.f96221a = val$context;
            this.f96222b = val$observeOn;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            l.this.f96220h.onError(e11);
        }

        @Override // qb0.c
        public void onNext(List<wf.d> topicAssets) {
            l.this.f96213a = topicAssets;
            if (l.this.f96213a == null || l.this.f96213a.isEmpty()) {
                l.this.f96220h.onNext(null);
                return;
            }
            l lVar = l.this;
            int size = lVar.f96213a.size();
            lVar.f96216d = size;
            lVar.f96215c = size;
            l.this.f96214b = new ArrayList();
            l.this.q(this.f96221a, this.f96222b);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f96224a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rx.d f96225b;

        public b(final Context val$context, final rx.d val$observeOn) {
            this.f96224a = val$context;
            this.f96225b = val$observeOn;
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            l.this.q(this.f96224a, this.f96225b);
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Callable<List<DictionaryRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f96228a;

        public d(final Context val$context) {
            this.f96228a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<DictionaryRecord> call() throws Exception {
            return i9.i.c(this.f96228a, 100);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Callable<List<DictionaryRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f96229a;

        public e(final Context val$context) {
            this.f96229a = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<DictionaryRecord> call() throws Exception {
            List<Integer> z11 = x.r().z();
            return CollectionUtils.isEmpty(z11) ? i9.i.c(this.f96229a, 100) : i9.i.b(this.f96229a, 100, z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements wb0.p<wf.d, rx.c<wf.d>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f96230a;

        public f(final Context val$context) {
            this.f96230a = val$context;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<wf.d> call(wf.d asset) {
            return asset.i() ? rx.c.M2(asset) : l.B(this.f96230a, asset).U3(l.C(asset));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Callable<wf.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wf.d f96231a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f96232b;

        public g(final wf.d val$asset, final Context val$context) {
            this.f96231a = val$asset;
            this.f96232b = val$context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public wf.d call() throws Exception {
            TopicRecord topicRecord;
            if (this.f96231a.b() > 0) {
                topicRecord = i9.l.d(this.f96232b, this.f96231a.b(), this.f96231a.g());
                if (topicRecord == null) {
                    topicRecord = sh.a.b().e(this.f96231a.b(), this.f96231a.g());
                }
                if (!sh.t.b(topicRecord)) {
                    throw new IllegalArgumentException("load full collect word from local failed.");
                }
            } else {
                File a11 = m9.b.a(this.f96231a.d().g(), false);
                if (a11 == null || !a11.exists()) {
                    topicRecord = null;
                } else {
                    TopicRecord q11 = m.q(this.f96231a.d());
                    q11.wordAudio = a11.getAbsolutePath();
                    topicRecord = q11;
                }
            }
            if (topicRecord == null) {
                throw new RuntimeException("load full collect word from local failed.");
            }
            topicRecord.wordMean = TopicRecord.convertToStandardCnmean(topicRecord.wordMean);
            this.f96231a.a(topicRecord);
            return this.f96231a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements wb0.p<TopicRecord, rx.c<? extends wf.d>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wf.d f96233a;

        public h(final wf.d val$asset) {
            this.f96233a = val$asset;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<? extends wf.d> call(TopicRecord record) {
            try {
                if (!sh.t.b(record)) {
                    throw new TException(String.format(Locale.CHINA, "collect word loaded online is not integrity, bookId=%d, topicId=%d", Integer.valueOf(this.f96233a.b()), Integer.valueOf(this.f96233a.g())));
                }
                record.wordMean = TopicRecord.convertToStandardCnmean(record.wordMean);
                this.f96233a.a(record);
                return rx.c.M2(this.f96233a);
            } catch (Exception e11) {
                return rx.c.T1(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements wb0.p<ResourceService.Client, rx.c<TopicRecord>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wf.d f96234a;

        public i(final wf.d val$asset) {
            this.f96234a = val$asset;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<TopicRecord> call(ResourceService.Client client) {
            try {
                List<ZpkInfo> list = client.get_zpk_infos(Collections.singletonList(TopicIdMapingUtils.buildTopicKey(this.f96234a.g(), this.f96234a.b())));
                if (list == null || list.isEmpty()) {
                    throw new TException(String.format(Locale.CHINA, "get_zpk_infos failed, bookId=%d, topicId=%d", Integer.valueOf(this.f96234a.b()), Integer.valueOf(this.f96234a.g())));
                }
                sh.s sVar = new sh.s(this.f96234a.b(), this.f96234a.g());
                sVar.n(list.get(0));
                return th.s.d(sVar, bc0.c.e());
            } catch (TException e11) {
                return rx.c.T1(e11);
            }
        }
    }

    public static rx.c<wf.d> A(final wf.d asset) {
        return com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/resource_api").c(1).d(10000)).b2(new i(asset)).b2(new h(asset)).w5(bc0.c.e());
    }

    public static rx.c<wf.d> B(final Context context, final wf.d asset) {
        return rx.c.z2(new g(asset, context)).w5(bc0.c.e());
    }

    public static rx.c<wf.d> C(final wf.d asset) {
        return asset.b() > 0 ? A(asset).U3(D(asset)) : D(asset);
    }

    public static rx.c<wf.d> D(final wf.d asset) {
        return m9.b.c(asset.d().g(), asset.g()).c3(new wb0.p() { // from class: wf.f
            @Override // wb0.p
            public final Object call(Object obj) {
                return l.a(d.this, (File) obj);
            }
        }).w5(bc0.c.e());
    }

    public static rx.c<List<DictionaryRecord>> E(final Context context) {
        return rx.c.z2(new d(context)).w5(bc0.c.e());
    }

    public static rx.c<List<DictionaryRecord>> F(final Context context) {
        return rx.c.z2(new e(context)).w5(bc0.c.e());
    }

    public static void G(List<m> collectWordRecords) {
        if (CollectionUtils.isEmpty(collectWordRecords)) {
            qb.c.i(f96209i, "load collected word empty", new Object[0]);
        } else {
            qb.c.i(f96209i, "load count %d", Integer.valueOf(collectWordRecords.size()));
            rx.c.u2(collectWordRecords).D(15).L1(new wb0.b() { // from class: wf.j
                @Override // wb0.b
                public final void call(Object obj) {
                    qb.c.i(l.f96209i, "load %s", new com.google.gson.d().z((List) obj));
                }
            }).p5();
        }
    }

    public static /* synthetic */ wf.d a(wf.d dVar, File file) {
        TopicRecord q11 = m.q(dVar.d());
        q11.wordAudio = file == null ? "" : file.getAbsolutePath();
        q11.wordMean = TopicRecord.convertToStandardCnmean(q11.wordMean);
        dVar.a(q11);
        return dVar;
    }

    public static /* synthetic */ List c(List list, List list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return null;
        }
        G(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (TextUtils.isEmpty(mVar.c())) {
                qb.c.d(f96209i, "null meanCn %s", new com.google.gson.d().z(mVar));
            } else {
                wf.d dVar = new wf.d();
                dVar.j(mVar);
                Collections.shuffle(list2);
                DictionaryRecord[] dictionaryRecordArr = new DictionaryRecord[3];
                int i12 = 0;
                do {
                    DictionaryRecord dictionaryRecord = (DictionaryRecord) list2.get(i11);
                    dictionaryRecord.meanCn = TopicRecord.convertToStandardCnmean(dictionaryRecord.meanCn);
                    if (dictionaryRecord.topicId != dVar.g() && !TextUtils.isEmpty(dictionaryRecord.meanCn)) {
                        dictionaryRecordArr[i12] = dictionaryRecord;
                        i12++;
                    }
                    i11 = ((i11 + list2.size()) + 1) % list2.size();
                } while (i12 < 3);
                dVar.h(dictionaryRecordArr);
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ Integer e(wf.d dVar, wf.d dVar2) {
        return dVar.d().e() == dVar2.d().e() ? Integer.valueOf((int) (dVar2.d().b() - dVar.d().b())) : Integer.valueOf(dVar.d().e() - dVar2.d().e());
    }

    public static rx.c<List<wf.d>> w(Context context, wf.a loader) {
        return rx.c.r7(x(loader), F(context), new wb0.q() { // from class: wf.e
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                return l.c((List) obj, (List) obj2);
            }
        });
    }

    public static rx.c<List<m>> x(wf.a loader) {
        return loader.load().b2(new wf.g()).d5(new wb0.q() { // from class: wf.h
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                Integer valueOf;
                valueOf = Integer.valueOf(((m) obj).e() - ((m) obj2).e());
                return valueOf;
            }
        }).b3(20).v6().w5(bc0.c.e());
    }

    public static void y(wf.d topic) {
        try {
            if (topic.b() == 0) {
                ExtendedWordInfo p11 = gj.a.c(false, topic.d().g()).t6().p();
                TopicRecord topicRecord = topic.c().get(topic.f());
                List<ExtendedWordInfo.Sentence> list = p11.sentences;
                if (list != null && !list.isEmpty()) {
                    topicRecord.sentence = p11.sentences.get(0).f25857a;
                    topicRecord.sentenceTrans = p11.sentences.get(0).f25858b;
                }
                List<ExtendedWordInfo.Enmean> list2 = p11.enmeans;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                topicRecord.wordMeanEn = p11.enmeans.get(0).f25854b;
            }
        } catch (Exception e11) {
            qb.c.c(f96209i, "", e11);
        }
    }

    public static rx.c<wf.d> z(final Context context, wf.d[] src) {
        return rx.c.y2(src).b2(new f(context)).G6(new wb0.q() { // from class: wf.i
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                return l.e((d) obj, (d) obj2);
            }
        }).b2(new wf.g());
    }

    public void H(wf.d asset) {
        List<wf.d> list = this.f96214b;
        if (list == null || !list.remove(asset)) {
            return;
        }
        this.f96216d--;
    }

    public void I(wf.d asset) {
        List<wf.d> list = this.f96213a;
        if (list != null) {
            list.add(asset);
            this.f96216d++;
        }
    }

    public void J() {
        qb0.h hVar = this.f96217e;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f96217e.unsubscribe();
        }
        this.f96217e = null;
        if (u()) {
            this.f96218f.unsubscribe();
        }
        this.f96218f = null;
        qb0.h hVar2 = this.f96219g;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.f96219g.unsubscribe();
        }
        this.f96219g = null;
        List<wf.d> list = this.f96213a;
        if (list != null) {
            list.clear();
            this.f96213a = null;
        }
        List<wf.d> list2 = this.f96214b;
        if (list2 != null) {
            list2.clear();
            this.f96214b = null;
        }
        this.f96215c = 0;
    }

    public final void q(Context context, rx.d observeOn) {
        List<wf.d> list = this.f96214b;
        if (list != null && !list.isEmpty()) {
            this.f96220h.onNext(this.f96214b.get(0));
        }
        if (u()) {
            return;
        }
        List<wf.d> list2 = this.f96214b;
        if (list2 == null || list2.size() < 3) {
            int min = Math.min(3, this.f96213a.size());
            wf.d[] dVarArr = new wf.d[min];
            for (int i11 = 0; i11 < min; i11++) {
                dVarArr[i11] = this.f96213a.remove(0);
            }
            if (min != 0) {
                this.f96218f = z(context, dVarArr).L1(new wb0.b() { // from class: wf.k
                    @Override // wb0.b
                    public final void call(Object obj) {
                        l.y((d) obj);
                    }
                }).w5(bc0.c.e()).I3(observeOn).r5(new c());
                return;
            }
            List<wf.d> list3 = this.f96214b;
            if (list3 == null || list3.isEmpty()) {
                this.f96220h.onNext(null);
            }
        }
    }

    public int r() {
        return this.f96216d;
    }

    public int s() {
        return this.f96215c;
    }

    public void t() {
        J();
        this.f96220h = dc0.c.y7();
    }

    public final boolean u() {
        qb0.h hVar = this.f96218f;
        return (hVar == null || hVar.isUnsubscribed()) ? false : true;
    }

    public rx.c<wf.d> v(final Context context, wf.a loader, final rx.d observeOn) {
        if (this.f96213a == null) {
            this.f96217e = w(context, loader).I3(observeOn).r5(new a(context, observeOn));
        } else {
            qb0.h hVar = this.f96219g;
            if (hVar != null && !hVar.isUnsubscribed()) {
                this.f96219g.unsubscribe();
            }
            this.f96219g = rx.c.M2(Boolean.TRUE).w5(bc0.c.a()).I3(observeOn).r5(new b(context, observeOn));
        }
        return this.f96220h.X1();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<wf.d> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            l.this.f96220h.onError(e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(wf.d asset) {
            l.this.f96214b.add(asset);
            l.this.f96220h.onNext(asset);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
