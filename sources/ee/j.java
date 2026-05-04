package ee;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.main.activity.schedule.data.BookDataSource;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nGradeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GradeVM.kt\ncom/baicizhan/main/activity/idenity/GradeVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes4.dex */
public final class j extends AndroidViewModel {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final a f49676k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f49677l = 8;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final String f49678m = "GradeVM";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f49679a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LiveData<List<Object>> f49680b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f49681c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f49682d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Pair<Integer, String>> f49683e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final LiveData<Pair<Integer, String>> f49684f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public qb0.h f49685g;

    /* renamed from: h, reason: collision with root package name */
    public int f49686h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public qb0.h f49687i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f49688j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends b<Integer> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Pair<Integer, String> f49691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Pair<Integer, String> pair) {
            super();
            this.f49691c = pair;
        }

        @Override // ee.j.b, qb0.c
        public void onError(Throwable th2) {
            super.onError(th2);
            j.this.f49681c.postValue(Boolean.FALSE);
            va.g.j(th2, 0);
        }

        @Override // ee.j.b, qb0.c
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            q(((Number) obj).intValue());
        }

        public void q(int i11) {
            super.onNext(Integer.valueOf(i11));
            j.this.f49681c.postValue(Boolean.FALSE);
            j.this.f49683e.postValue(this.f49691c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@m80.k Application app2) {
        super(app2);
        kotlin.jvm.internal.g0.p(app2, "app");
        MutableLiveData<List<Object>> mutableLiveData = new MutableLiveData<>();
        this.f49679a = mutableLiveData;
        this.f49680b = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f49681c = mutableLiveData2;
        this.f49682d = mutableLiveData2;
        MutableLiveData<Pair<Integer, String>> mutableLiveData3 = new MutableLiveData<>();
        this.f49683e = mutableLiveData3;
        this.f49684f = mutableLiveData3;
        this.f49686h = 1;
    }

    public static final g2 q(int i11, j jVar, ee.a aVar, String str) {
        if (i11 == 0) {
            jVar.o(new Pair<>(Integer.valueOf(aVar.e()), str));
        } else {
            jVar.f49681c.postValue(Boolean.FALSE);
            jVar.f49683e.postValue(new Pair<>(Integer.valueOf(aVar.e()), str));
        }
        return g2.f100423a;
    }

    public static final void r(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void s(j jVar, Throwable th2) {
        jVar.f49681c.postValue(Boolean.FALSE);
        va.g.j(th2, 1);
        qb.c.c(f49678m, "", th2);
    }

    public static final g2 v(j jVar, List list) {
        jVar.f49679a.postValue(list);
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void x(Throwable th2) {
        qb.c.c(f49678m, "", th2);
    }

    @m80.k
    public final LiveData<Pair<Integer, String>> j() {
        return this.f49684f;
    }

    @m80.k
    public final LiveData<List<Object>> k() {
        return this.f49680b;
    }

    @m80.k
    public final LiveData<Boolean> l() {
        return this.f49682d;
    }

    @m80.l
    public final qb0.h m() {
        return this.f49687i;
    }

    public final boolean n() {
        return this.f49688j;
    }

    public final void o(@m80.k Pair<Integer, String> result) {
        kotlin.jvm.internal.g0.p(result, "result");
        qb0.h hVar = this.f49685g;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f49685g = BookDataSource.b().c(getApplication()).I3(tb0.a.a()).r5(new c(result));
    }

    public final void p(@m80.k final ee.a grade, final int i11) {
        kotlin.jvm.internal.g0.p(grade, "grade");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ma.b.X, String.valueOf(grade.e()));
        linkedHashMap.put(ma.b.Y, Integer.valueOf(i11));
        g2 g2Var = g2.f100423a;
        ma.l.e(ma.t.f73017p, ma.a.Q1, linkedHashMap);
        this.f49681c.postValue(Boolean.TRUE);
        qb0.h hVar = this.f49687i;
        if (hVar != null) {
            if (!hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<String> I3 = new t().j(this.f49686h, grade.e()).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: ee.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 q11;
                q11 = j.q(i11, this, grade, (String) obj);
                return q11;
            }
        };
        this.f49687i = I3.u5(new wb0.b() { // from class: ee.e
            @Override // wb0.b
            public final void call(Object obj) {
                j.r(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: ee.f
            @Override // wb0.b
            public final void call(Object obj) {
                j.s(j.this, (Throwable) obj);
            }
        });
    }

    public final void start() {
        rx.c<List<Object>> g11 = new t().g(getApplication());
        final x00.l lVar = new x00.l() { // from class: ee.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 v11;
                v11 = j.v(j.this, (List) obj);
                return v11;
            }
        };
        g11.u5(new wb0.b() { // from class: ee.h
            @Override // wb0.b
            public final void call(Object obj) {
                j.w(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: ee.i
            @Override // wb0.b
            public final void call(Object obj) {
                j.x((Throwable) obj);
            }
        });
    }

    public final void t(@m80.l qb0.h hVar) {
        this.f49687i = hVar;
    }

    public final void u(boolean z11) {
        this.f49688j = z11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends qb0.g<T> {
        public b() {
        }

        @Override // qb0.c
        public void onError(@m80.l Throwable th2) {
            j.this.f49681c.setValue(Boolean.FALSE);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            j.this.f49681c.setValue(Boolean.FALSE);
        }

        @Override // qb0.g
        public void onStart() {
            j.this.f49681c.setValue(Boolean.TRUE);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
