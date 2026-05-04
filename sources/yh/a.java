package yh;

import android.content.Context;
import android.os.AsyncTask;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f100133f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f100134g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f100135h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f100136i = 3;

    /* renamed from: a, reason: collision with root package name */
    public List<TopicLearnRecord> f100137a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<Context> f100138b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f100139c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f100140d = false;

    /* renamed from: e, reason: collision with root package name */
    public c f100141e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: yh.a$a, reason: collision with other inner class name */
    public class C1366a extends bp.a<List<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends bp.a<List<Integer>> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(e result);

        void b(e result);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f100142a;

        /* renamed from: b, reason: collision with root package name */
        public int f100143b;

        /* renamed from: c, reason: collision with root package name */
        public List<Integer> f100144c;

        public d() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f100145a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f100146b;

        /* renamed from: c, reason: collision with root package name */
        public List<Integer> f100147c;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends AsyncTask<d, Void, d> {
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d doInBackground(d... paramses) {
            Context context = (Context) a.this.f100138b.get();
            if (context == null) {
                return null;
            }
            d dVar = paramses[0];
            int i11 = dVar.f100142a;
            if (i11 == 0) {
                dVar.f100144c = a.q(context, dVar.f100143b);
                return dVar;
            }
            if (i11 == 1) {
                a.x(context, dVar.f100143b, dVar.f100144c);
                return dVar;
            }
            if (i11 == 2) {
                a.t(context, dVar, true);
                return dVar;
            }
            if (i11 != 3) {
                return dVar;
            }
            a.t(context, dVar, false);
            return dVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(d params) {
            if (params == null) {
                return;
            }
            int i11 = params.f100142a;
            if (i11 == 0) {
                if (a.this.f100141e != null) {
                    a.this.f100141e.a(a.this.o(params.f100144c));
                }
            } else if (i11 == 2 || i11 == 3) {
                if (!a.this.f100140d) {
                    a.this.f100140d = 3 == params.f100142a;
                }
                if (a.this.f100141e != null) {
                    a.this.f100137a = a.p();
                    a.this.f100141e.b(a.this.o(params.f100144c));
                }
            }
        }

        public f() {
        }
    }

    public a(Context context) {
        this.f100139c = false;
        this.f100138b = new WeakReference<>(context);
        List<TopicLearnRecord> p11 = p();
        this.f100137a = p11;
        Iterator<TopicLearnRecord> it = p11.iterator();
        while (it.hasNext()) {
            if (1 == it.next().isTodayNew) {
                this.f100139c = true;
                return;
            }
        }
    }

    public static a k(Context context) {
        return new a(context);
    }

    public static a l(Context context, e initResult) {
        return new a(context, initResult);
    }

    public static void m(Context context, int bookId) {
        if (bookId <= 0) {
            return;
        }
        i9.f.a(context, i9.f.h(i9.f.O, Integer.toString(bookId)));
    }

    public static List<TopicLearnRecord> p() {
        Collection<TopicLearnRecord> x11 = LearnRecordManager.A().x();
        ArrayList arrayList = new ArrayList();
        for (TopicLearnRecord topicLearnRecord : x11) {
            if (!topicLearnRecord.isKilled()) {
                arrayList.add(topicLearnRecord);
            }
        }
        return arrayList;
    }

    public static List<Integer> q(Context context, int bookId) {
        if (bookId <= 0) {
            return null;
        }
        return (List) new com.google.gson.d().o(i9.f.g(context, i9.f.h(i9.f.O, Integer.toString(bookId)), false), new b().getType());
    }

    public static void t(Context context, d params, boolean todayOnly) {
        List<Integer> q11 = q(context, params.f100143b);
        HashSet hashSet = q11 != null ? new HashSet(q11) : new HashSet();
        List<Integer> list = params.f100144c;
        if (list != null) {
            hashSet.addAll(list);
        }
        ArrayList arrayList = new ArrayList();
        for (TopicLearnRecord topicLearnRecord : p()) {
            if (todayOnly && hashSet.contains(Integer.valueOf(topicLearnRecord.topicId)) && topicLearnRecord.isTodayNew == 0) {
                arrayList.add(Integer.valueOf(topicLearnRecord.topicId));
            }
        }
        m(context, params.f100143b);
        x(context, params.f100143b, arrayList);
        params.f100144c = arrayList;
    }

    public static void x(Context context, int bookId, List<Integer> testedIds) {
        if (testedIds == null || testedIds.isEmpty() || bookId <= 0) {
            return;
        }
        List<Integer> q11 = q(context, bookId);
        if (q11 != null) {
            q11.addAll(testedIds);
            testedIds = q11;
        }
        i9.f.n(context, i9.f.h(i9.f.O, Integer.toString(bookId)), new com.google.gson.d().A(testedIds, new C1366a().getType()), false);
    }

    public final void n(List<Integer> testedIds, int token) {
        if (token == 3 || token == 2) {
            d dVar = new d();
            dVar.f100142a = token;
            dVar.f100143b = x.r().l();
            dVar.f100144c = testedIds;
            new f().execute(dVar);
        }
    }

    public final e o(List<Integer> testedIds) {
        if (this.f100137a == null) {
            return null;
        }
        HashSet hashSet = testedIds != null ? new HashSet(testedIds) : new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (TopicLearnRecord topicLearnRecord : this.f100137a) {
            if (!hashSet.contains(Integer.valueOf(topicLearnRecord.topicId))) {
                if (topicLearnRecord.isTodayNew == 0) {
                    arrayList2.add(Integer.valueOf(topicLearnRecord.topicId));
                } else {
                    arrayList.add(Integer.valueOf(topicLearnRecord.topicId));
                }
                arrayList3.add(topicLearnRecord);
            }
        }
        this.f100137a = arrayList3;
        e eVar = new e();
        if (this.f100140d) {
            eVar.f100145a = false;
            ArrayList arrayList4 = new ArrayList(arrayList.size() + arrayList2.size());
            eVar.f100147c = arrayList4;
            arrayList4.addAll(arrayList);
            eVar.f100147c.addAll(arrayList2);
        } else if (arrayList.isEmpty()) {
            eVar.f100145a = false;
            eVar.f100147c = arrayList2;
        } else {
            eVar.f100145a = true;
            eVar.f100147c = arrayList;
        }
        eVar.f100146b = this.f100139c;
        return eVar;
    }

    public boolean r() {
        List<TopicLearnRecord> list = this.f100137a;
        if (list == null) {
            return false;
        }
        Iterator<TopicLearnRecord> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isTodayNew == 0) {
                return true;
            }
        }
        return false;
    }

    public void s() {
        List<TopicLearnRecord> list = this.f100137a;
        if (list == null || list.isEmpty()) {
            c cVar = this.f100141e;
            if (cVar != null) {
                cVar.a(null);
                return;
            }
            return;
        }
        d dVar = new d();
        dVar.f100142a = 0;
        dVar.f100143b = x.r().l();
        new f().execute(dVar);
    }

    public void u(List<Integer> testedIds) {
        n(testedIds, 3);
    }

    public void v(List<Integer> testedIds) {
        n(testedIds, 2);
    }

    public e w(List<Integer> testedIds) {
        d dVar = new d();
        dVar.f100142a = 1;
        dVar.f100143b = x.r().l();
        dVar.f100144c = testedIds;
        new f().execute(dVar);
        return o(testedIds);
    }

    public a y(c l11) {
        this.f100141e = l11;
        return this;
    }

    public a(Context context, e initResult) {
        this.f100139c = false;
        this.f100138b = new WeakReference<>(context);
        this.f100137a = new ArrayList(initResult.f100147c.size());
        LearnRecordManager A = LearnRecordManager.A();
        for (Integer num : initResult.f100147c) {
            num.intValue();
            this.f100137a.add(A.L().get(num));
        }
        this.f100139c = initResult.f100146b;
    }
}
