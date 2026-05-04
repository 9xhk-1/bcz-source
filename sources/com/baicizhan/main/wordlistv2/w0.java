package com.baicizhan.main.wordlistv2;

import a00.k1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.wordlistv2.repo.EditAction;
import com.baicizhan.main.wordlistv2.repo.OrderType;
import com.baicizhan.main.wordlistv2.repo.WordListType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@kotlin.jvm.internal.u0({"SMAP\nWordListV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListV2ViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListV2ViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1285#2,2:169\n1299#2,4:171\n*S KotlinDebug\n*F\n+ 1 WordListV2ViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListV2ViewModel\n*L\n51#1:169,2\n51#1:171,4\n*E\n"})
/* loaded from: classes5.dex */
public final class w0 extends ViewModel implements hj.n {

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final a f28091p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f28092q = 8;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final String f28093r = "WordListV2ViewModel";

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final String f28094s = "key_has_show_mastered_tip";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.wordlistv2.a f28095a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public hj.m f28096b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<c1>> f28097c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f28098d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final SingleLiveEvent<g2> f28099e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<MutableLiveData<Object>> f28100f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final Map<Integer, e1> f28101g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public e1 f28102h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final List<MutableLiveData<com.baicizhan.main.wordlistv2.repo.o>> f28103i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<WordListType> f28104j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f28105k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public List<? extends MutableLiveData<Boolean>> f28106l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public MutableLiveData<Boolean> f28107m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f28108n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f28109o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.WordListV2ViewModel$doAction$1", f = "WordListV2ViewModel.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {144, 145, 146}, m = "invokeSuspend", n = {"it", "$i$a$-let-WordListV2ViewModel$doAction$1$1", "$i$a$-runCatching-WordListV2ViewModel$doAction$1$1$1", "it", "$i$a$-let-WordListV2ViewModel$doAction$1$1", "$i$a$-runCatching-WordListV2ViewModel$doAction$1$1$1", "it", "$i$a$-let-WordListV2ViewModel$doAction$1$1", "$i$a$-runCatching-WordListV2ViewModel$doAction$1$1$1"}, s = {"L$1", "I$0", "I$1", "L$1", "I$0", "I$1", "L$1", "I$0", "I$1"}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f28110a;

        /* renamed from: b, reason: collision with root package name */
        public Object f28111b;

        /* renamed from: c, reason: collision with root package name */
        public int f28112c;

        /* renamed from: d, reason: collision with root package name */
        public int f28113d;

        /* renamed from: e, reason: collision with root package name */
        public int f28114e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ EditAction f28116g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f28117h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f28118a;

            static {
                int[] iArr = new int[EditAction.values().length];
                try {
                    iArr[EditAction.KILL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EditAction.RELEARN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EditAction.UNKILL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f28118a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EditAction editAction, List<Integer> list, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f28116g = editAction;
            this.f28117h = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return w0.this.new b(this.f28116g, this.f28117h, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.w0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.WordListV2ViewModel$requestWordList$1", f = "WordListV2ViewModel.kt", i = {0, 0, 0}, l = {108}, m = "invokeSuspend", n = {"it", "$i$a$-let-WordListV2ViewModel$requestWordList$1$1", "$i$a$-runCatching-WordListV2ViewModel$requestWordList$1$1$1"}, s = {"L$1", "I$0", "I$1"}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f28119a;

        /* renamed from: b, reason: collision with root package name */
        public Object f28120b;

        /* renamed from: c, reason: collision with root package name */
        public int f28121c;

        /* renamed from: d, reason: collision with root package name */
        public int f28122d;

        /* renamed from: e, reason: collision with root package name */
        public int f28123e;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return w0.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f28123e
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r6.f28120b
                hj.m r0 = (hj.m) r0
                java.lang.Object r0 = r6.f28119a
                com.baicizhan.main.wordlistv2.w0 r0 = (com.baicizhan.main.wordlistv2.w0) r0
                kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L18
                goto L58
            L18:
                r7 = move-exception
                goto L61
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                kotlin.e.n(r7)
                com.baicizhan.main.wordlistv2.w0 r7 = com.baicizhan.main.wordlistv2.w0.this
                androidx.lifecycle.MutableLiveData r7 = r7.o()
                java.lang.Boolean r1 = l00.a.a(r3)
                r7.postValue(r1)
                com.baicizhan.main.wordlistv2.w0 r7 = com.baicizhan.main.wordlistv2.w0.this
                hj.m r7 = r7.l0()
                if (r7 == 0) goto Lbf
                com.baicizhan.main.wordlistv2.w0 r1 = com.baicizhan.main.wordlistv2.w0.this
                kotlin.Result$a r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L5f
                com.baicizhan.main.wordlistv2.a r4 = r1.r()     // Catch: java.lang.Throwable -> L5f
                r6.f28119a = r1     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r5 = l00.k.a(r7)     // Catch: java.lang.Throwable -> L5f
                r6.f28120b = r5     // Catch: java.lang.Throwable -> L5f
                r6.f28121c = r2     // Catch: java.lang.Throwable -> L5f
                r6.f28122d = r2     // Catch: java.lang.Throwable -> L5f
                r6.f28123e = r3     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r7 = r4.c(r7, r6)     // Catch: java.lang.Throwable -> L5f
                if (r7 != r0) goto L57
                return r0
            L57:
                r0 = r1
            L58:
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L18
                java.lang.Object r7 = kotlin.Result.m6308constructorimpl(r7)     // Catch: java.lang.Throwable -> L18
                goto L6b
            L5f:
                r7 = move-exception
                r0 = r1
            L61:
                kotlin.Result$a r1 = kotlin.Result.Companion
                java.lang.Object r7 = kotlin.e.a(r7)
                java.lang.Object r7 = kotlin.Result.m6308constructorimpl(r7)
            L6b:
                boolean r1 = kotlin.Result.m6315isSuccessimpl(r7)
                if (r1 == 0) goto La3
                r1 = r7
                java.util.List r1 = (java.util.List) r1
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L91
                androidx.lifecycle.MutableLiveData r1 = r0.k()
                java.lang.Boolean r4 = l00.a.a(r3)
                r1.postValue(r4)
                androidx.lifecycle.MutableLiveData r1 = r0.o()
                java.lang.Boolean r4 = l00.a.a(r2)
                r1.postValue(r4)
                goto La3
            L91:
                androidx.lifecycle.MutableLiveData r4 = r0.k()
                java.lang.Boolean r5 = l00.a.a(r2)
                r4.postValue(r5)
                androidx.lifecycle.MutableLiveData r4 = r0.g()
                r4.postValue(r1)
            La3:
                java.lang.Throwable r7 = kotlin.Result.m6311exceptionOrNullimpl(r7)
                if (r7 == 0) goto Lbf
                androidx.lifecycle.MutableLiveData r7 = r0.k()
                java.lang.Boolean r1 = l00.a.a(r3)
                r7.postValue(r1)
                androidx.lifecycle.MutableLiveData r7 = r0.o()
                java.lang.Boolean r0 = l00.a.a(r2)
                r7.postValue(r0)
            Lbf:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.w0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f28125a;

        public d(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f28125a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f28125a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28125a.invoke(obj);
        }
    }

    @Inject
    public w0(@m80.k com.baicizhan.main.wordlistv2.a wordListRepo) {
        kotlin.jvm.internal.g0.p(wordListRepo, "wordListRepo");
        this.f28095a = wordListRepo;
        this.f28097c = new MutableLiveData<>();
        this.f28098d = new MutableLiveData<>(Boolean.FALSE);
        this.f28099e = new SingleLiveEvent<>();
        ArrayList arrayList = new ArrayList(5);
        for (int i11 = 0; i11 < 5; i11++) {
            arrayList.add(new MutableLiveData());
        }
        this.f28100f = arrayList;
        ArrayList arrayList2 = new ArrayList(5);
        for (int i12 = 0; i12 < 5; i12++) {
            arrayList2.add(Integer.valueOf(i12));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            final int intValue = ((Number) obj).intValue();
            e1 e1Var = new e1();
            final String str = i9.f.f60389o0 + intValue;
            if (i9.f.i(KotlinExtKt.getGlobalApplicationContext(), str)) {
                e1Var.c().setValue(WordListType.values()[intValue].getOrderOptionList().get(i9.f.d(KotlinExtKt.getGlobalApplicationContext(), str)));
            } else if (intValue == WordListType.LEARNING.getType()) {
                e1Var.c().setValue(OrderType.TIME_DESC);
            }
            e1Var.c().observeForever(new d(new x00.l() { // from class: com.baicizhan.main.wordlistv2.v0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 B;
                    B = w0.B(str, intValue, (OrderType) obj2);
                    return B;
                }
            }));
            linkedHashMap.put(obj, e1Var);
        }
        this.f28101g = linkedHashMap;
        ArrayList arrayList3 = new ArrayList(5);
        for (int i13 = 0; i13 < 5; i13++) {
            arrayList3.add(new MutableLiveData());
        }
        this.f28103i = arrayList3;
        this.f28104j = new MutableLiveData<>();
        this.f28105k = new MutableLiveData<>();
        ArrayList arrayList4 = new ArrayList(5);
        for (int i14 = 0; i14 < 5; i14++) {
            arrayList4.add(new MutableLiveData(Boolean.FALSE));
        }
        this.f28106l = arrayList4;
        this.f28107m = new MutableLiveData<>(Boolean.FALSE);
        this.f28108n = new MutableLiveData<>();
        this.f28109o = new MutableLiveData<>();
    }

    public static final g2 B(String str, int i11, OrderType orderType) {
        if (orderType != null) {
            i9.f.k(KotlinExtKt.getGlobalApplicationContext(), str, WordListType.values()[i11].getOrderOptionList().indexOf(orderType));
        }
        return g2.f100423a;
    }

    public final void A() {
        this.f28107m.setValue(Boolean.valueOf(!(this.f28107m.getValue() != null ? r0.booleanValue() : false)));
    }

    @Override // hj.n
    public void E(@m80.l hj.m mVar) {
        this.f28096b = mVar;
    }

    public final void b(boolean z11) {
        WordListType value = this.f28104j.getValue();
        if (value == null) {
            value = WordListType.TODAY;
        }
        this.f28106l.get(value.getType()).setValue(Boolean.valueOf(z11));
    }

    public final void c(int i11) {
        this.f28104j.setValue(WordListType.values()[i11]);
        this.f28102h = this.f28101g.get(Integer.valueOf(i11));
        this.f28108n.setValue(i11 != 3 ? i11 != 4 ? "斩" : "撤销斩" : "重学");
        ma.l.e(ma.t.f73011j, ma.a.f72725c5, k1.k(h1.a(ma.b.H1, com.baicizhan.main.wordlistv2.repo.k.f(this.f28104j.getValue()))));
    }

    public final void d(@m80.k EditAction action, @m80.k List<Integer> wordList) {
        kotlin.jvm.internal.g0.p(action, "action");
        kotlin.jvm.internal.g0.p(wordList, "wordList");
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new b(action, wordList, null), 3, null);
    }

    @m80.k
    public final SingleLiveEvent<g2> f() {
        return this.f28099e;
    }

    @m80.k
    public final MutableLiveData<List<c1>> g() {
        return this.f28097c;
    }

    @m80.k
    public final MutableLiveData<Boolean> h() {
        return this.f28107m;
    }

    @m80.k
    public final MutableLiveData<Boolean> i() {
        return this.f28105k;
    }

    @m80.k
    public final MutableLiveData<WordListType> j() {
        return this.f28104j;
    }

    @m80.k
    public final MutableLiveData<Boolean> k() {
        return this.f28098d;
    }

    @m80.k
    public final MutableLiveData<String> l() {
        return this.f28108n;
    }

    @Override // hj.n
    @m80.l
    public hj.m l0() {
        return this.f28096b;
    }

    @m80.k
    public final List<MutableLiveData<Boolean>> m() {
        return this.f28106l;
    }

    @m80.k
    public final List<MutableLiveData<com.baicizhan.main.wordlistv2.repo.o>> n() {
        return this.f28103i;
    }

    @m80.k
    public final MutableLiveData<Boolean> o() {
        return this.f28109o;
    }

    @m80.l
    public final e1 p() {
        return this.f28102h;
    }

    @m80.k
    public final List<MutableLiveData<Object>> q() {
        return this.f28100f;
    }

    @m80.k
    public final com.baicizhan.main.wordlistv2.a r() {
        return this.f28095a;
    }

    @m80.k
    public final Map<Integer, e1> s() {
        return this.f28101g;
    }

    public final boolean t() {
        return !KotlinExtKt.isKvFlagTrue(f28094s);
    }

    public final void u() {
        c40.k.f(ViewModelKt.getViewModelScope(this), c40.h1.c(), null, new c(null), 2, null);
    }

    public final void v(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f28107m = mutableLiveData;
    }

    public final void w(@m80.k MutableLiveData<Boolean> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<set-?>");
        this.f28105k = mutableLiveData;
    }

    public final void x(@m80.k List<? extends MutableLiveData<Boolean>> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f28106l = list;
    }

    public final void y() {
        KotlinExtKt.setKvFlagTrue(f28094s, true);
    }

    public final void z(@m80.l e1 e1Var) {
        this.f28102h = e1Var;
    }
}
