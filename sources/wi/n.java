package wi;

import a00.k1;
import a00.l1;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.j0;
import com.jiongji.andriod.card.R;
import gi.h0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nStudyWikiViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyWikiViewModel.kt\ncom/baicizhan/main/wikiv2/study/StudyWikiViewModel\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,100:1\n35#2:101\n*S KotlinDebug\n*F\n+ 1 StudyWikiViewModel.kt\ncom/baicizhan/main/wikiv2/study/StudyWikiViewModel\n*L\n74#1:101\n*E\n"})
/* loaded from: classes3.dex */
public final class n extends AndroidViewModel implements hj.n {

    /* renamed from: m, reason: collision with root package name */
    public static final int f96382m = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f96383a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<?>> f96384b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f96385c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f96386d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Integer> f96387e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<com.baicizhan.main.wikiv2.study.model.b> f96388f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final zi.d f96389g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final c f96390h;

    /* renamed from: i, reason: collision with root package name */
    public int f96391i;

    /* renamed from: j, reason: collision with root package name */
    public int f96392j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public hj.m f96393k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public j0 f96394l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k Application application) {
        super(application);
        g0.p(application, "application");
        this.f96383a = "StudyWiki.ViewModel";
        this.f96384b = new MutableLiveData<>();
        this.f96385c = new MutableLiveData<>();
        this.f96386d = new MutableLiveData<>();
        this.f96387e = new ClickProtectedEvent<>();
        this.f96388f = new ClickProtectedEvent<>();
        this.f96389g = new zi.d();
        this.f96390h = new c(application);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(n nVar, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = l1.z();
        }
        nVar.d(str, map);
    }

    public static final g2 x(n nVar, List list) {
        nVar.f96384b.setValue(list);
        c cVar = nVar.f96390h;
        g0.m(list);
        cVar.e(list);
        return g2.f100423a;
    }

    public static final void y(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void z(n nVar, Throwable th2) {
        qb.c.c(nVar.f96383a, "", th2);
    }

    @Override // hj.n
    public void E(@m80.l hj.m mVar) {
        this.f96393k = mVar;
    }

    public final void d(@m80.k String eventId, @m80.k Map<String, ? extends Object> map) {
        g0.p(eventId, "eventId");
        g0.p(map, "map");
        Map<String, ? extends Object> j02 = l1.j0(h1.a("topic_id", Integer.valueOf(this.f96391i)));
        j0 j0Var = this.f96394l;
        if (j0Var != null) {
            String f11 = j0Var.f();
            if (f11 == null) {
                f11 = "";
            }
            j02.putAll(l1.W(h1.a(ma.b.f72923l1, f11), h1.a("plan_type", j0Var.g()), h1.a("strategy_id", j0Var.h())));
        }
        j02.putAll(map);
        com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a.h(eventId, j02);
    }

    public final void g() {
        com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
        j0 j0Var = this.f96394l;
        if (j0Var != null) {
            EntryAction d11 = u0Var.d();
            j0Var.i(d11 != null ? d11.getActon() : null);
        }
    }

    public final int h() {
        return this.f96392j;
    }

    @m80.k
    public final ClickProtectedEvent<com.baicizhan.main.wikiv2.study.model.b> i() {
        return this.f96388f;
    }

    @m80.k
    public final MutableLiveData<Boolean> j() {
        return this.f96386d;
    }

    @m80.k
    public final zi.d k() {
        return this.f96389g;
    }

    @m80.k
    public final c l() {
        return this.f96390h;
    }

    @Override // hj.n
    @m80.l
    public hj.m l0() {
        return this.f96393k;
    }

    @m80.k
    public final ClickProtectedEvent<Integer> m() {
        return this.f96387e;
    }

    @m80.k
    public final String n() {
        return this.f96383a;
    }

    public final int o() {
        return this.f96391i;
    }

    @m80.k
    public final MutableLiveData<List<?>> p() {
        return this.f96384b;
    }

    @m80.k
    public final MutableLiveData<Boolean> q() {
        return this.f96385c;
    }

    public final void r() {
        if (LearnRecordManager.A().R(this.f96391i)) {
            LearnRecordManager.A().l(this.f96391i);
        } else {
            LearnRecordManager.A().U(this.f96391i, 0L, 0);
            this.f96387e.setValue(Integer.valueOf(this.f96391i));
            if (i9.j.c(i9.j.f60415f, true)) {
                h0.a().b(getApplication(), R.raw.chop);
            }
        }
        this.f96385c.setValue(Boolean.valueOf(LearnRecordManager.A().R(this.f96391i)));
        d(ma.a.I4, k1.k(h1.a("status", g0.g(this.f96385c.getValue(), Boolean.TRUE) ? "slash" : "unslash")));
    }

    public final void s(@m80.k aj.a audioPlayAble) {
        g0.p(audioPlayAble, "audioPlayAble");
        this.f96390h.l(audioPlayAble);
    }

    public final void start() {
        rx.c<List<?>> I3 = this.f96389g.d(getApplication(), this.f96392j, this.f96391i).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: wi.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 x11;
                x11 = n.x(n.this, (List) obj);
                return x11;
            }
        };
        I3.u5(new wb0.b() { // from class: wi.l
            @Override // wb0.b
            public final void call(Object obj) {
                n.y(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: wi.m
            @Override // wb0.b
            public final void call(Object obj) {
                n.z(n.this, (Throwable) obj);
            }
        });
        com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
        EntryAction d11 = u0Var.d();
        this.f96394l = new j0(d11 != null ? d11.getActon() : null, u0Var.a(), u0Var.b());
    }

    public final void t() {
        this.f96390h.m();
    }

    public final void u() {
        LearnRecordManager A = LearnRecordManager.A();
        this.f96385c.setValue(Boolean.valueOf(A.R(this.f96391i)));
        this.f96386d.setValue(Boolean.valueOf(A.B() > 0));
    }

    public final void v(int i11) {
        this.f96392j = i11;
    }

    public final void w(int i11) {
        this.f96391i = i11;
    }
}
