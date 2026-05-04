package com.baicizhan.main.wordlistv2;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.main.wordlistv2.WordListContentFragment;
import com.baicizhan.main.wordlistv2.repo.EditAction;
import com.baicizhan.main.wordlistv2.repo.OrderType;
import com.baicizhan.main.wordlistv2.repo.WordListType;
import com.baicizhan.main.wordlistv2.sidebar.IndexSideBar;
import com.jiongji.andriod.card.R;
import gs.wb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordListContentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListContentFragment.kt\ncom/baicizhan/main/wordlistv2/WordListContentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n172#2,9:233\n1869#3,2:242\n1878#3,2:244\n1880#3:247\n808#3,11:248\n360#3,7:259\n1#4:246\n*S KotlinDebug\n*F\n+ 1 WordListContentFragment.kt\ncom/baicizhan/main/wordlistv2/WordListContentFragment\n*L\n50#1:233,9\n171#1:242,2\n175#1:244,2\n175#1:247\n107#1:248,11\n113#1:259,7\n*E\n"})
/* loaded from: classes5.dex */
public final class WordListContentFragment extends Fragment {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f27810g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f27811h = 8;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f27812i = "word_type";

    /* renamed from: a, reason: collision with root package name */
    public wb f27813a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f27814b;

    /* renamed from: d, reason: collision with root package name */
    public vj.p f27816d;

    /* renamed from: e, reason: collision with root package name */
    public vj.e f27817e;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f27815c = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wordlistv2.j
        @Override // x00.a
        public final Object invoke() {
            t U;
            U = WordListContentFragment.U(WordListContentFragment.this);
            return U;
        }
    });

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<RecyclerView.ItemDecoration> f27818f = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final WordListContentFragment a(@m80.k WordListType type) {
            kotlin.jvm.internal.g0.p(type, "type");
            WordListContentFragment wordListContentFragment = new WordListContentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("word_type", type);
            wordListContentFragment.setArguments(bundle);
            return wordListContentFragment;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27819a;

        static {
            int[] iArr = new int[EditAction.values().length];
            try {
                iArr[EditAction.RELEARN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f27819a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.WordListContentFragment$initData$1$1$1", f = "WordListContentFragment.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27820a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Object> f27822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<? extends Object> list, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f27822c = list;
        }

        public static final void j(WordListContentFragment wordListContentFragment) {
            wb wbVar = wordListContentFragment.f27813a;
            if (wbVar == null) {
                kotlin.jvm.internal.g0.S("mBinding");
                wbVar = null;
            }
            wbVar.f57310c.scrollToPosition(0);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordListContentFragment.this.new c(this.f27822c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f27820a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                vj.p pVar = null;
                wb wbVar = null;
                if (WordListContentFragment.this.K().w()) {
                    vj.p pVar2 = WordListContentFragment.this.f27816d;
                    if (pVar2 == null) {
                        kotlin.jvm.internal.g0.S("mAdapter");
                        pVar2 = null;
                    }
                    List<? extends Object> list = this.f27822c;
                    kotlin.jvm.internal.g0.m(list);
                    pVar2.z(list);
                    wb wbVar2 = WordListContentFragment.this.f27813a;
                    if (wbVar2 == null) {
                        kotlin.jvm.internal.g0.S("mBinding");
                    } else {
                        wbVar = wbVar2;
                    }
                    View root = wbVar.getRoot();
                    final WordListContentFragment wordListContentFragment = WordListContentFragment.this;
                    root.post(new Runnable() { // from class: com.baicizhan.main.wordlistv2.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            WordListContentFragment.c.j(WordListContentFragment.this);
                        }
                    });
                    WordListContentFragment.this.K().Q(false);
                } else {
                    vj.p pVar3 = WordListContentFragment.this.f27816d;
                    if (pVar3 == null) {
                        kotlin.jvm.internal.g0.S("mAdapter");
                    } else {
                        pVar = pVar3;
                    }
                    List<? extends Object> list2 = this.f27822c;
                    kotlin.jvm.internal.g0.m(list2);
                    this.f27820a = 1;
                    if (pVar.m(list2, this) == l11) {
                        return l11;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            WordListContentFragment.this.V(this.f27822c);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.WordListContentFragment$initData$1$4", f = "WordListContentFragment.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27823a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f27824b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WordListType f27825c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t f27826a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WordListType f27827b;

            public a(t tVar, WordListType wordListType) {
                this.f27826a = tVar;
                this.f27827b = wordListType;
            }

            @Override // kotlinx.coroutines.flow.j
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.baicizhan.main.wordlistv2.repo.o oVar, j00.c<? super g2> cVar) {
                this.f27826a.n().n().get(this.f27827b.getType()).postValue(oVar);
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t tVar, WordListType wordListType, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f27824b = tVar;
            this.f27825c = wordListType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f27824b, this.f27825c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f27823a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                kotlinx.coroutines.flow.y<com.baicizhan.main.wordlistv2.repo.o> s11 = this.f27824b.s();
                a aVar = new a(this.f27824b, this.f27825c);
                this.f27823a = 1;
                if (s11.collect(aVar, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f27828a;

        public e(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f27828a = function;
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
            return this.f27828a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27828a.invoke(obj);
        }
    }

    public WordListContentFragment() {
        final x00.a aVar = null;
        this.f27814b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.o0.d(w0.class), new x00.a<ViewModelStore>() { // from class: com.baicizhan.main.wordlistv2.WordListContentFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelStore invoke() {
                return Fragment.this.requireActivity().getViewModelStore();
            }
        }, new x00.a<CreationExtras>() { // from class: com.baicizhan.main.wordlistv2.WordListContentFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                x00.a aVar2 = x00.a.this;
                return (aVar2 == null || (creationExtras = (CreationExtras) aVar2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new x00.a<ViewModelProvider.Factory>() { // from class: com.baicizhan.main.wordlistv2.WordListContentFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            @m80.k
            public final ViewModelProvider.Factory invoke() {
                return Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    public static final g2 I(WordListContentFragment wordListContentFragment, x00.a aVar) {
        wordListContentFragment.K().m(wordListContentFragment.J());
        aVar.invoke();
        return g2.f100423a;
    }

    private final w0 J() {
        return (w0) this.f27814b.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void L() {
        WordListType wordListType;
        MutableLiveData<OrderType> c11;
        Serializable serializable;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("word_type", WordListType.class);
                wordListType = (WordListType) serializable;
            }
            wordListType = null;
        } else {
            Bundle arguments2 = getArguments();
            Serializable serializable2 = arguments2 != null ? arguments2.getSerializable("word_type") : null;
            if (serializable2 instanceof WordListType) {
                wordListType = (WordListType) serializable2;
            }
            wordListType = null;
        }
        if (wordListType == null) {
            wordListType = WordListType.TODAY;
        }
        this.f27816d = new vj.p(wordListType, J(), K());
        wb wbVar = this.f27813a;
        if (wbVar == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            wbVar = null;
        }
        RecyclerView recyclerView = wbVar.f57310c;
        vj.p pVar = this.f27816d;
        if (pVar == null) {
            kotlin.jvm.internal.g0.S("mAdapter");
            pVar = null;
        }
        recyclerView.setAdapter(pVar);
        final t K = K();
        K().R(wordListType);
        K.v().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.wordlistv2.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 M;
                M = WordListContentFragment.M(WordListContentFragment.this, (List) obj);
                return M;
            }
        }));
        K.t().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.wordlistv2.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 O;
                O = WordListContentFragment.O(WordListContentFragment.this, K, (Boolean) obj);
                return O;
            }
        }));
        K.o().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.wordlistv2.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 P;
                P = WordListContentFragment.P(WordListContentFragment.this, (Boolean) obj);
                return P;
            }
        }));
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(K, wordListType, null), 3, null);
        w0 J = J();
        J.g().observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.wordlistv2.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 Q;
                Q = WordListContentFragment.Q(WordListContentFragment.this, (List) obj);
                return Q;
            }
        }));
        J.m().get(wordListType.getType()).observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.wordlistv2.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 R;
                R = WordListContentFragment.R(WordListContentFragment.this, (Boolean) obj);
                return R;
            }
        }));
        e1 e1Var = J().s().get(Integer.valueOf(wordListType.getType()));
        if (e1Var == null || (c11 = e1Var.c()) == null) {
            return;
        }
        c11.observe(getViewLifecycleOwner(), new e(new x00.l() { // from class: com.baicizhan.main.wordlistv2.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 S;
                S = WordListContentFragment.S(WordListContentFragment.this, (OrderType) obj);
                return S;
            }
        }));
    }

    public static final g2 M(final WordListContentFragment wordListContentFragment, List list) {
        wb wbVar = wordListContentFragment.f27813a;
        wb wbVar2 = null;
        if (wbVar == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            wbVar = null;
        }
        RecyclerView rvList = wbVar.f57310c;
        kotlin.jvm.internal.g0.o(rvList, "rvList");
        kotlin.jvm.internal.g0.m(list);
        sa.q.z(rvList, !list.isEmpty());
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(wordListContentFragment), null, null, wordListContentFragment.new c(list, null), 3, null);
        xj.a aVar = xj.a.f98126a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof c1) {
                arrayList.add(obj);
            }
        }
        List<String> a11 = aVar.a(arrayList);
        wb wbVar3 = wordListContentFragment.f27813a;
        if (wbVar3 == null) {
            kotlin.jvm.internal.g0.S("mBinding");
        } else {
            wbVar2 = wbVar3;
        }
        IndexSideBar indexSideBar = wbVar2.f57311d;
        indexSideBar.setIndexList(a11);
        indexSideBar.setTextSize(KotlinExtKt.getDpFloat(12));
        indexSideBar.setOnIndexChangeListener(new x00.l() { // from class: com.baicizhan.main.wordlistv2.l
            @Override // x00.l
            public final Object invoke(Object obj2) {
                g2 N;
                N = WordListContentFragment.N(WordListContentFragment.this, (String) obj2);
                return N;
            }
        });
        return g2.f100423a;
    }

    public static final g2 N(WordListContentFragment wordListContentFragment, String tag) {
        int i11;
        String str;
        String w11;
        kotlin.jvm.internal.g0.p(tag, "tag");
        if (TextUtils.isEmpty(tag)) {
            return g2.f100423a;
        }
        List<Object> value = wordListContentFragment.K().v().getValue();
        wb wbVar = null;
        if (value != null) {
            i11 = 0;
            for (Object obj : value) {
                c1 c1Var = obj instanceof c1 ? (c1) obj : null;
                if (c1Var == null || (w11 = c1Var.w()) == null) {
                    str = null;
                } else {
                    String valueOf = String.valueOf(u30.r0.x7(w11));
                    kotlin.jvm.internal.g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
                    str = valueOf.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.g0.o(str, "toUpperCase(...)");
                }
                if (kotlin.jvm.internal.g0.g(tag, str)) {
                    break;
                }
                i11++;
            }
        }
        i11 = -1;
        if (i11 != -1) {
            wb wbVar2 = wordListContentFragment.f27813a;
            if (wbVar2 == null) {
                kotlin.jvm.internal.g0.S("mBinding");
            } else {
                wbVar = wbVar2;
            }
            RecyclerView.LayoutManager layoutManager = wbVar.f57310c.getLayoutManager();
            kotlin.jvm.internal.g0.n(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i11, 0);
        }
        return g2.f100423a;
    }

    public static final g2 O(WordListContentFragment wordListContentFragment, t tVar, Boolean bool) {
        vj.p pVar = wordListContentFragment.f27816d;
        if (pVar == null) {
            kotlin.jvm.internal.g0.S("mAdapter");
            pVar = null;
        }
        pVar.notifyDataSetChanged();
        tVar.n().i().setValue(bool);
        return g2.f100423a;
    }

    public static final g2 P(WordListContentFragment wordListContentFragment, Boolean bool) {
        vj.p pVar = wordListContentFragment.f27816d;
        if (pVar == null) {
            kotlin.jvm.internal.g0.S("mAdapter");
            pVar = null;
        }
        pVar.notifyDataSetChanged();
        return g2.f100423a;
    }

    public static final g2 Q(WordListContentFragment wordListContentFragment, List list) {
        Log.i("tjy", "allwordlist change");
        t K = wordListContentFragment.K();
        kotlin.jvm.internal.g0.m(list);
        K.H(list);
        return g2.f100423a;
    }

    public static final g2 R(WordListContentFragment wordListContentFragment, Boolean bool) {
        vj.p pVar = wordListContentFragment.f27816d;
        if (pVar == null) {
            kotlin.jvm.internal.g0.S("mAdapter");
            pVar = null;
        }
        pVar.A(bool);
        return g2.f100423a;
    }

    public static final g2 S(WordListContentFragment wordListContentFragment, OrderType orderType) {
        wb wbVar = wordListContentFragment.f27813a;
        vj.e eVar = null;
        if (wbVar == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            wbVar = null;
        }
        IndexSideBar sideBar = wbVar.f57311d;
        kotlin.jvm.internal.g0.o(sideBar, "sideBar");
        sa.q.z(sideBar, orderType == OrderType.LETTER_ASC || orderType == OrderType.LETTER_DESC);
        vj.e eVar2 = wordListContentFragment.f27817e;
        if (eVar2 == null) {
            kotlin.jvm.internal.g0.S("stickyHeaderDecoration");
        } else {
            eVar = eVar2;
        }
        eVar.a();
        t K = wordListContentFragment.K();
        kotlin.jvm.internal.g0.m(orderType);
        K.l(orderType);
        return g2.f100423a;
    }

    private final void T() {
        wb wbVar = this.f27813a;
        if (wbVar == null) {
            kotlin.jvm.internal.g0.S("mBinding");
            wbVar = null;
        }
        wbVar.setLifecycleOwner(getViewLifecycleOwner());
        wbVar.j(K());
        wbVar.f57310c.setLayoutManager(new LinearLayoutManager(requireContext()));
        vj.e eVar = new vj.e();
        this.f27817e = eVar;
        wbVar.f57310c.addItemDecoration(eVar);
        getLifecycle().addObserver(K());
    }

    public static final t U(WordListContentFragment wordListContentFragment) {
        Application application = wordListContentFragment.requireActivity().getApplication();
        kotlin.jvm.internal.g0.o(application, "getApplication(...)");
        return (t) new ViewModelProvider(wordListContentFragment, new n(application, wordListContentFragment.J())).get(t.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(List<? extends Object> list) {
        int L = list != null ? a00.h0.L(list) : -1;
        if (list != null) {
            Iterator<T> it = this.f27818f.iterator();
            while (true) {
                wb wbVar = null;
                if (!it.hasNext()) {
                    break;
                }
                RecyclerView.ItemDecoration itemDecoration = (RecyclerView.ItemDecoration) it.next();
                wb wbVar2 = this.f27813a;
                if (wbVar2 == null) {
                    kotlin.jvm.internal.g0.S("mBinding");
                } else {
                    wbVar = wbVar2;
                }
                wbVar.f57310c.removeItemDecoration(itemDecoration);
            }
            this.f27818f.clear();
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    a00.h0.b0();
                }
                if (i11 >= 0 && i11 <= L && (list.get(i11) instanceof c1) && (obj instanceof c1)) {
                    wb wbVar3 = this.f27813a;
                    if (wbVar3 == null) {
                        kotlin.jvm.internal.g0.S("mBinding");
                        wbVar3 = null;
                    }
                    RecyclerView recyclerView = wbVar3.f57310c;
                    Context requireContext = requireContext();
                    kotlin.jvm.internal.g0.o(requireContext, "requireContext(...)");
                    xl.c cVar = new xl.c(requireContext, 1, i11, i12, false, 16, null);
                    Drawable drawable = KotlinExtKt.getDrawable(i11 == L ? R.drawable.divider_transparent_80dp : R.drawable.divider_transparent_8dp);
                    kotlin.jvm.internal.g0.m(drawable);
                    cVar.setDrawable(drawable);
                    this.f27818f.add(cVar);
                    recyclerView.addItemDecoration(cVar);
                }
                i11 = i12;
            }
        }
    }

    public final void H(@m80.k final x00.a<g2> confirmAction) {
        kotlin.jvm.internal.g0.p(confirmAction, "confirmAction");
        if ((K().p().getEditAction() == EditAction.UNKILL || K().p().getEditAction() == EditAction.RELEARN) && K().P()) {
            new uj.j(b.f27819a[K().p().getEditAction().ordinal()] == 1 ? new uj.a("确定要重学所有已熟识单词吗？", "这些单词将进入“学习中”列表再次安排复习～", "取消", "确定") : new uj.a("确定要撤销所有已斩单词吗？", null, "取消", "确定", 2, null), null, new x00.a() { // from class: com.baicizhan.main.wordlistv2.k
                @Override // x00.a
                public final Object invoke() {
                    g2 I;
                    I = WordListContentFragment.I(WordListContentFragment.this, confirmAction);
                    return I;
                }
            }, 2, null).show(getParentFragmentManager(), "");
        } else {
            confirmAction.invoke();
            K().m(J());
        }
    }

    public final t K() {
        return (t) this.f27815c.getValue();
    }

    public final void W() {
        K().S();
    }

    public final void X() {
        K().T();
    }

    public final void Y(int i11, int i12) {
        wb wbVar = this.f27813a;
        if (wbVar != null) {
            if (wbVar == null) {
                kotlin.jvm.internal.g0.S("mBinding");
                wbVar = null;
            }
            IndexSideBar indexSideBar = wbVar.f57311d;
            ViewGroup.LayoutParams layoutParams = indexSideBar.getLayoutParams();
            kotlin.jvm.internal.g0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i12 + i11;
            indexSideBar.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @m80.l
    public View onCreateView(@m80.k LayoutInflater inflater, @m80.l ViewGroup viewGroup, @m80.l Bundle bundle) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        wb g11 = wb.g(inflater, viewGroup, false);
        kotlin.jvm.internal.g0.m(g11);
        this.f27813a = g11;
        T();
        L();
        return g11.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
