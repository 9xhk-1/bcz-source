package com.baicizhan.main.wikiv2.studyv2;

import a00.k1;
import a00.l1;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.j0;
import com.baicizhan.main.wikiv2.studyv2.data.o0;
import com.jiongji.andriod.card.R;
import gi.h0;
import hj.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nStudyWikiV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyWikiV2ViewModel.kt\ncom/baicizhan/main/wikiv2/studyv2/StudyWikiV2ViewModel\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,191:1\n35#2:192\n*S KotlinDebug\n*F\n+ 1 StudyWikiV2ViewModel.kt\ncom/baicizhan/main/wikiv2/studyv2/StudyWikiV2ViewModel\n*L\n158#1:192\n*E\n"})
/* loaded from: classes3.dex */
public final class StudyWikiV2ViewModel extends AndroidViewModel implements n {

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final a f25924n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f25925o = 8;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final String f25926p = "StudyWikiV2ViewModel";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f25927a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f25928b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m f25929c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public hj.m f25930d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Integer> f25931e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f25932f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<Boolean> f25933g;

    /* renamed from: h, reason: collision with root package name */
    public int f25934h;

    /* renamed from: i, reason: collision with root package name */
    public int f25935i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public j0 f25936j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Integer> f25937k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Integer> f25938l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25939m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyWikiV2ViewModel(@m80.k Application application) {
        super(application);
        g0.p(application, "application");
        this.f25927a = new MutableLiveData<>();
        this.f25928b = new MutableLiveData<>();
        this.f25929c = new m(application);
        this.f25931e = new ClickProtectedEvent<>();
        this.f25932f = new MutableLiveData<>();
        this.f25933g = new SingleLiveEvent<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f25937k = linkedHashMap;
        this.f25938l = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(StudyWikiV2ViewModel studyWikiV2ViewModel, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = l1.z();
        }
        studyWikiV2ViewModel.b(str, map);
    }

    public static /* synthetic */ void o(StudyWikiV2ViewModel studyWikiV2ViewModel, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        studyWikiV2ViewModel.n(context, z11);
    }

    @Override // hj.n
    public void E(@m80.l hj.m mVar) {
        this.f25930d = mVar;
    }

    public final void b(@m80.k String eventId, @m80.k Map<String, ? extends Object> map) {
        g0.p(eventId, "eventId");
        g0.p(map, "map");
        Map<String, ? extends Object> j02 = l1.j0(h1.a("topic_id", Integer.valueOf(this.f25934h)));
        j0 j0Var = this.f25936j;
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

    public final void d() {
        com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
        j0 j0Var = this.f25936j;
        if (j0Var != null) {
            EntryAction d11 = u0Var.d();
            j0Var.i(d11 != null ? d11.getActon() : null);
        }
    }

    public final int f() {
        return this.f25935i;
    }

    @m80.k
    public final MutableLiveData<Integer> g() {
        return this.f25928b;
    }

    @m80.k
    public final MutableLiveData<List<Object>> h() {
        return this.f25927a;
    }

    @m80.k
    public final SingleLiveEvent<Boolean> i() {
        return this.f25933g;
    }

    @m80.k
    public final m j() {
        return this.f25929c;
    }

    @m80.k
    public final ClickProtectedEvent<Integer> k() {
        return this.f25931e;
    }

    @m80.k
    public final Map<Integer, Integer> l() {
        return this.f25938l;
    }

    @Override // hj.n
    @m80.l
    public hj.m l0() {
        return this.f25930d;
    }

    public final int m() {
        return this.f25934h;
    }

    public final void n(@m80.k Context context, boolean z11) {
        g0.p(context, "context");
        qb.c.i(f25926p, "init load, bookId -> " + this.f25935i + " , topicId -> " + this.f25934h, new Object[0]);
        c40.k.f(ViewModelKt.getViewModelScope(this), c40.h1.a(), null, new StudyWikiV2ViewModel$init$1(this, context, z11, null), 2, null);
        com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
        EntryAction d11 = u0Var.d();
        this.f25936j = new j0(d11 != null ? d11.getActon() : null, u0Var.a(), u0Var.b());
    }

    public final boolean p() {
        return this.f25939m;
    }

    @m80.k
    public final MutableLiveData<Boolean> q() {
        return this.f25932f;
    }

    public final void r() {
        if (LearnRecordManager.A().R(this.f25934h)) {
            LearnRecordManager.A().l(this.f25934h);
        } else {
            LearnRecordManager.A().U(this.f25934h, 0L, 0);
            this.f25931e.setValue(Integer.valueOf(this.f25934h));
            if (i9.j.c(i9.j.f60415f, true)) {
                h0.a().b(getApplication(), R.raw.chop);
            }
        }
        this.f25932f.setValue(Boolean.valueOf(LearnRecordManager.A().R(this.f25934h)));
        b(ma.a.I4, k1.k(h1.a("status", g0.g(this.f25932f.getValue(), Boolean.TRUE) ? "slash" : "unslash")));
    }

    public final void s() {
        this.f25929c.p();
    }

    public final void t(@m80.k o0 model, @m80.k Uri uri) {
        g0.p(model, "model");
        g0.p(uri, "uri");
        this.f25929c.k(model, uri);
    }

    public final void u() {
        this.f25932f.setValue(Boolean.valueOf(LearnRecordManager.A().R(this.f25934h)));
    }

    public final void v(int i11) {
        this.f25935i = i11;
    }

    public final void w(boolean z11) {
        this.f25939m = z11;
    }

    public final void x(int i11) {
        this.f25934h = i11;
    }

    public final void y(int i11, int i12) {
        qb.c.b(f25926p, "switch tab", new Object[0]);
        this.f25937k.put(Integer.valueOf(i11), Integer.valueOf(i12));
        this.f25928b.setValue(Integer.valueOf(i11));
    }
}
