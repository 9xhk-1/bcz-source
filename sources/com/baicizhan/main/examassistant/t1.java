package com.baicizhan.main.examassistant;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.baicizhan.main.examassistant.t1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nMarkedWordsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkedWordsViewModel.kt\ncom/baicizhan/main/examassistant/MarkedWordsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,205:1\n1011#2,2:206\n1021#2,2:208\n1869#2,2:210\n1563#2:220\n1634#2,3:221\n625#3,8:212\n*S KotlinDebug\n*F\n+ 1 MarkedWordsViewModel.kt\ncom/baicizhan/main/examassistant/MarkedWordsViewModel\n*L\n126#1:206,2\n130#1:208,2\n135#1:210,2\n189#1:220\n189#1:221,3\n187#1:212,8\n*E\n"})
/* loaded from: classes4.dex */
public final class t1 extends AndroidViewModel {

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final a f20637u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f20638v = 8;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public static final String f20639w = "MarkedWordsViewModel";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final hj.m f20640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20641b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f20642c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f20643d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f20644e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f20645f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f20646g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f20647h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f20648i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f20649j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f20650k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final LiveData<List<Object>> f20651l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final List<MarkedWord> f20652m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f20653n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final LiveData<Integer> f20654o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20655p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20656q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Boolean> f20657r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final Set<Integer> f20658s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final yz.c0 f20659t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsViewModel$deleteWord$1", f = "MarkedWordsViewModel.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20660a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20662c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsViewModel$deleteWord$1$1", f = "MarkedWordsViewModel.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f20663a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t1 f20664b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f20665c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t1 t1Var, int i11, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f20664b = t1Var;
                this.f20665c = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new a(this.f20664b, this.f20665c, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super yz.g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f20663a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    fg.a q11 = this.f20664b.q();
                    int i12 = this.f20665c;
                    int v11 = this.f20664b.v();
                    this.f20663a = 1;
                    if (q11.a(i12, v11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f20662c = i11;
        }

        public static final boolean j(int i11, MarkedWord markedWord) {
            return markedWord.n() == i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return t1.this.new b(this.f20662c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Object d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20660a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                t1.this.f20646g.setValue(l00.a.a(true));
                c40.m0 c11 = c40.h1.c();
                a aVar = new a(t1.this, this.f20662c, null);
                this.f20660a = 1;
                bVar = this;
                d11 = com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, bVar, 2, null);
                if (d11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                d11 = ((Result) obj).m6317unboximpl();
                bVar = this;
            }
            t1 t1Var = t1.this;
            final int i12 = bVar.f20662c;
            if (Result.m6315isSuccessimpl(d11)) {
                t1Var.f20646g.postValue(l00.a.a(false));
                a00.m0.N0(t1Var.f20652m, new x00.l() { // from class: com.baicizhan.main.examassistant.u1
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        boolean j11;
                        j11 = t1.b.j(i12, (MarkedWord) obj2);
                        return Boolean.valueOf(j11);
                    }
                });
                t1Var.G(t1Var.f20652m.size());
                t1Var.C();
            }
            t1 t1Var2 = t1.this;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(d11);
            if (m6311exceptionOrNullimpl != null) {
                t1Var2.f20646g.postValue(l00.a.a(false));
                qb.c.c(t1.f20639w, "delete marked word error", m6311exceptionOrNullimpl);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsViewModel$getWordList$1", f = "MarkedWordsViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f20666a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20668c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.examassistant.MarkedWordsViewModel$getWordList$1$1", f = "MarkedWordsViewModel.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super List<? extends MarkedWord>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f20669a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t1 f20670b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f20671c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t1 t1Var, int i11, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f20670b = t1Var;
                this.f20671c = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(j00.c<?> cVar) {
                return new a(this.f20670b, this.f20671c, cVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(j00.c<? super List<MarkedWord>> cVar) {
                return ((a) create(cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f20669a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                fg.a q11 = this.f20670b.q();
                int i12 = this.f20671c;
                this.f20669a = 1;
                Object b11 = q11.b(i12, this);
                return b11 == l11 ? l11 : b11;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends MarkedWord>> cVar) {
                return invoke2((j00.c<? super List<MarkedWord>>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f20668c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return t1.this.new c(this.f20668c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object d11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f20666a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = c40.h1.c();
                a aVar = new a(t1.this, this.f20668c, null);
                this.f20666a = 1;
                cVar = this;
                d11 = com.baicizhan.main.word_book.data.impl.c.d(c11, null, aVar, cVar, 2, null);
                if (d11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                d11 = ((Result) obj).m6317unboximpl();
                cVar = this;
            }
            t1 t1Var = t1.this;
            int i12 = cVar.f20668c;
            if (Result.m6315isSuccessimpl(d11)) {
                List list = (List) d11;
                t1Var.f20646g.setValue(l00.a.a(false));
                t1Var.G(list.size());
                t1Var.f20652m.clear();
                t1Var.f20652m.addAll(list);
                t1Var.C();
                if (kotlin.jvm.internal.g0.g(t1Var.m().getValue(), l00.a.a(true))) {
                    ma.l.e(ma.t.f73011j, ma.a.V4, a00.k1.k(yz.h1.a("word_num", l00.a.f(list.size()))));
                } else {
                    ma.l.b(ma.t.f73011j, ma.a.f72836s4, ma.u.d(new String[]{ma.b.f72902e1, "word_num"}, new Object[]{l00.a.f(i12), l00.a.f(list.size())}, false, 4, null));
                }
            }
            t1 t1Var2 = t1.this;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(d11);
            if (m6311exceptionOrNullimpl != null) {
                t1Var2.f20646g.setValue(l00.a.a(false));
                qb.c.c(t1.f20639w, "getMarkedWords error", m6311exceptionOrNullimpl);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 MarkedWordsViewModel.kt\ncom/baicizhan/main/examassistant/MarkedWordsViewModel\n*L\n1#1,328:1\n127#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((MarkedWord) t11).k()), Long.valueOf(((MarkedWord) t12).k()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MarkedWordsViewModel.kt\ncom/baicizhan/main/examassistant/MarkedWordsViewModel\n*L\n1#1,328:1\n131#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((MarkedWord) t12).k()), Long.valueOf(((MarkedWord) t11).k()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(@m80.k Application application, @m80.k hj.m collectHelper, int i11) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(collectHelper, "collectHelper");
        this.f20640a = collectHelper;
        this.f20641b = i11;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f20642c = mutableLiveData;
        this.f20643d = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f20644e = mutableLiveData2;
        this.f20645f = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f20646g = mutableLiveData3;
        this.f20647h = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.f20648i = mutableLiveData4;
        this.f20649j = mutableLiveData4;
        MutableLiveData<List<Object>> mutableLiveData5 = new MutableLiveData<>();
        this.f20650k = mutableLiveData5;
        this.f20651l = mutableLiveData5;
        this.f20652m = new ArrayList();
        MutableLiveData<Integer> mutableLiveData6 = new MutableLiveData<>();
        this.f20653n = mutableLiveData6;
        this.f20654o = mutableLiveData6;
        this.f20655p = !KotlinExtKt.isKvFlagTrue(i9.f.H);
        this.f20656q = KotlinExtKt.isKvFlagTrue(i9.f.G);
        this.f20657r = new LinkedHashMap();
        this.f20658s = new LinkedHashSet();
        this.f20659t = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.examassistant.r1
            @Override // x00.a
            public final Object invoke() {
                gg.a B;
                B = t1.B();
                return B;
            }
        });
    }

    public static final gg.a B() {
        return new gg.a();
    }

    public static final void l(x00.l lVar, Boolean bool, long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<unused var>");
        Boolean bool2 = Boolean.TRUE;
        if (kotlin.jvm.internal.g0.g(bool, bool2)) {
            KotlinExtKt.showToast("已成功收藏到单词本");
            lVar.invoke(bool2);
        }
    }

    public final void A(@m80.k Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        CollectReviewActivity.v1(context, this.f20652m);
        ma.l.a(ma.t.f73011j, ma.a.W4);
    }

    public final void C() {
        ArrayList<MarkedWord> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(this.f20652m);
        if (this.f20656q && kotlin.jvm.internal.g0.g(this.f20643d.getValue(), Boolean.TRUE)) {
            if (arrayList.size() > 1) {
                a00.l0.r0(arrayList, new d());
            }
        } else if (arrayList.size() > 1) {
            a00.l0.r0(arrayList, new e());
        }
        MutableLiveData<List<Object>> mutableLiveData = this.f20650k;
        if (kotlin.jvm.internal.g0.g(this.f20643d.getValue(), Boolean.TRUE)) {
            String str = " ";
            for (MarkedWord markedWord : arrayList) {
                String dateString = TimeUtil.getDateString(new Date(markedWord.k()));
                if (!kotlin.jvm.internal.g0.g(str, dateString)) {
                    kotlin.jvm.internal.g0.m(dateString);
                    arrayList2.add(dateString);
                    str = dateString;
                }
                arrayList2.add(markedWord);
            }
            arrayList = arrayList2;
        }
        mutableLiveData.setValue(arrayList);
    }

    public final void D(boolean z11) {
        this.f20655p = z11;
    }

    public final void F(boolean z11) {
        this.f20656q = z11;
    }

    public final void G(int i11) {
        this.f20653n.setValue(Integer.valueOf(i11));
        MutableLiveData<Boolean> mutableLiveData = this.f20644e;
        Boolean value = this.f20643d.getValue();
        Boolean bool = Boolean.TRUE;
        boolean z11 = false;
        mutableLiveData.setValue(Boolean.valueOf(kotlin.jvm.internal.g0.g(value, bool) && i11 > 0));
        MutableLiveData<Boolean> mutableLiveData2 = this.f20648i;
        if (kotlin.jvm.internal.g0.g(this.f20643d.getValue(), bool) && i11 > 0) {
            z11 = true;
        }
        mutableLiveData2.setValue(Boolean.valueOf(z11));
    }

    public final void H() {
        this.f20657r.clear();
        boolean z11 = this.f20655p;
        this.f20655p = !z11;
        KotlinExtKt.setKvFlagTrue(i9.f.H, z11);
    }

    public final void i() {
        boolean z11 = !this.f20656q;
        this.f20656q = z11;
        KotlinExtKt.setKvFlagTrue(i9.f.G, z11);
        C();
    }

    public final void j(int i11) {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new b(i11, null), 3, null);
    }

    public final void k(@m80.k final x00.l<? super Boolean, yz.g2> collectResult) {
        kotlin.jvm.internal.g0.p(collectResult, "collectResult");
        List<MarkedWord> list = this.f20652m;
        List J = a00.h0.J();
        for (Object obj : list) {
            if (this.f20658s.contains(Integer.valueOf(((MarkedWord) obj).n()))) {
                if (J.isEmpty()) {
                    J = new ArrayList();
                }
                kotlin.jvm.internal.g0.n(J, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                kotlin.jvm.internal.x0.g(J).add(obj);
            }
        }
        List<MarkedWord> list2 = J;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        for (MarkedWord markedWord : list2) {
            arrayList.add(new ij.e0(markedWord.n(), 0, markedWord.o(), markedWord.l(), markedWord.m()));
        }
        this.f20640a.m(arrayList, new hj.o() { // from class: com.baicizhan.main.examassistant.s1
            @Override // hj.o
            public final void a(Boolean bool, long[] jArr) {
                t1.l(x00.l.this, bool, jArr);
            }
        });
    }

    @m80.k
    public final LiveData<Boolean> m() {
        return this.f20643d;
    }

    @m80.k
    public final hj.m n() {
        return this.f20640a;
    }

    @m80.k
    public final Map<Integer, Boolean> o() {
        return this.f20657r;
    }

    @m80.k
    public final LiveData<Boolean> p() {
        return this.f20647h;
    }

    public final fg.a q() {
        return (fg.a) this.f20659t.getValue();
    }

    public final boolean r() {
        return this.f20655p;
    }

    @m80.k
    public final Set<Integer> s() {
        return this.f20658s;
    }

    public final void start() {
        this.f20642c.setValue(Boolean.valueOf(this.f20641b == -1));
        z(this.f20641b);
    }

    public final boolean t() {
        return this.f20656q;
    }

    @m80.k
    public final LiveData<List<Object>> u() {
        return this.f20651l;
    }

    public final int v() {
        return this.f20641b;
    }

    @m80.k
    public final LiveData<Boolean> w() {
        return this.f20645f;
    }

    @m80.k
    public final LiveData<Boolean> x() {
        return this.f20649j;
    }

    @m80.k
    public final LiveData<Integer> y() {
        return this.f20654o;
    }

    public final void z(int i11) {
        this.f20646g.setValue(Boolean.TRUE);
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new c(i11, null), 3, null);
    }
}
