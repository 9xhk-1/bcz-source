package sh;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UpdateZpkMd5;
import com.baicizhan.client.business.util.JsonSerializer;
import com.baicizhan.client.business.util.ZPackUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f88521d = "ForceUpdateManager";

    /* renamed from: e, reason: collision with root package name */
    public static volatile c f88522e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final String f88523f = "force_update_";

    /* renamed from: a, reason: collision with root package name */
    public oh.a f88524a;

    /* renamed from: b, reason: collision with root package name */
    public Set<Integer> f88525b;

    /* renamed from: c, reason: collision with root package name */
    public List<TopicRecord> f88526c = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callable<Void> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            c.this.i();
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: sh.c$c, reason: collision with other inner class name */
    public class C1157c extends bp.a<List<Integer>> {
        public C1157c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends bp.a<Set<Integer>> {
        public d() {
        }
    }

    public static c d() {
        if (f88522e == null) {
            synchronized (x.class) {
                try {
                    if (f88522e == null) {
                        f88522e = new c();
                    }
                } finally {
                }
            }
        }
        return f88522e;
    }

    public final void b() {
        for (TopicRecord topicRecord : this.f88526c) {
            ZPackUtils.deleteZpk(topicRecord);
            qb.c.i(f88521d, "delete %d", Integer.valueOf(topicRecord.topicId));
        }
        this.f88526c.clear();
    }

    public final void c() {
        oh.a aVar = this.f88524a;
        if (aVar != null) {
            aVar.b();
        }
        oh.a aVar2 = new oh.a();
        this.f88524a = aVar2;
        aVar2.c(this.f88525b, x.r().l());
    }

    public final List<Integer> e(List<TopicRecord> res) {
        ArrayList arrayList = new ArrayList();
        for (TopicRecord topicRecord : res) {
            if (topicRecord != null && x.r().E0(topicRecord.topicId) && !t.c(topicRecord) && !t.a(topicRecord) && t.b(topicRecord)) {
                arrayList.add(Integer.valueOf(topicRecord.topicId));
                qb.c.i(f88521d, "need force update [%d,%d]", Integer.valueOf(topicRecord.bookId), Integer.valueOf(topicRecord.topicId));
                this.f88526c.add(topicRecord);
            }
        }
        return arrayList;
    }

    public final List<Integer> f() {
        String g11 = i9.f.g(pb.a.a(), f88523f + x.r().l(), false);
        List<Integer> arrayList = !TextUtils.isEmpty(g11) ? (List) new JsonSerializer(new C1157c().getType()).readFromJson(g11) : new ArrayList<>();
        if (!xb.e.h(arrayList)) {
            Map<Integer, TopicRecord> e11 = i9.l.e(pb.a.a(), x.r().l(), arrayList);
            if (!xb.e.i(e11)) {
                for (TopicRecord topicRecord : e11.values()) {
                    if (t.b(topicRecord) && (t.c(topicRecord) || t.a(topicRecord))) {
                        qb.c.i(f88521d, "has been updated, %d ", Integer.valueOf(topicRecord.topicId));
                        arrayList.remove(Integer.valueOf(topicRecord.topicId));
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean g(int topicId) {
        Set<Integer> set = this.f88525b;
        if (set != null) {
            return set.contains(Integer.valueOf(topicId));
        }
        return false;
    }

    public final void h(String tag, String data) {
        int i11 = 0;
        while (i11 < data.length()) {
            int i12 = i11 + 800;
            if (i12 >= data.length()) {
                i12 = data.length();
            }
            qb.c.i(f88521d, "%s %s", tag, data.substring(i11, i12));
            i11 = i12;
        }
    }

    public final void i() {
        List<TopicRecord> f11 = i9.l.f(pb.a.a(), x.r().l());
        k(f11);
        List<Integer> f12 = f();
        h("old", new com.google.gson.d().z(f12));
        List<Integer> e11 = e(f11);
        h("new", new com.google.gson.d().z(e11));
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f88525b = copyOnWriteArraySet;
        copyOnWriteArraySet.addAll(f12);
        this.f88525b.addAll(e11);
        String writeToJson = new JsonSerializer(new d().getType()).writeToJson(this.f88525b);
        h("merge", writeToJson);
        i9.f.n(pb.a.a(), f88523f + x.r().l(), writeToJson, false);
        b();
        c();
    }

    public void j() {
        rx.c.z2(new b()).w5(bc0.c.e()).r5(new a());
    }

    public final void k(List<TopicRecord> res) {
        UpdateZpkMd5 F;
        String str;
        x r11 = x.r();
        for (TopicRecord topicRecord : res) {
            if (topicRecord != null && (F = r11.F(topicRecord.topicId)) != null && (str = topicRecord.updateFlagMD5) != null && topicRecord.zpkVersion == 0 && str.equals(F.updateFlagMD5)) {
                topicRecord.zpkVersion = F.zpkVersion;
                i9.l.c(pb.a.a(), r11.l(), topicRecord);
                qb.c.i(f88521d, "update version [topicid, md5 ,version] [%d, %s, %d]", Integer.valueOf(topicRecord.topicId), topicRecord.updateFlagMD5, Integer.valueOf(topicRecord.zpkVersion));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Void> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(c.f88521d, "", e11);
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void aVoid) {
        }
    }
}
