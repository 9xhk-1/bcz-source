package com.baicizhan.main.wordlistv2;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import c40.h1;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.wordlistv2.repo.EditAction;
import com.baicizhan.main.wordlistv2.repo.OrderType;
import com.baicizhan.main.wordlistv2.repo.WordListType;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordListContentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n774#2:373\n865#2,2:374\n774#2:376\n865#2,2:377\n774#2:379\n865#2,2:380\n808#2,11:382\n1869#2,2:393\n808#2,11:395\n1869#2,2:406\n808#2,11:408\n1021#2,2:419\n1011#2,2:421\n1869#2,2:423\n1021#2,2:425\n1011#2,2:427\n1021#2,2:429\n1011#2,2:431\n1869#2,2:433\n774#2:435\n865#2,2:436\n774#2:438\n865#2,2:439\n808#2,11:441\n774#2:452\n865#2,2:453\n1563#2:455\n1634#2,3:456\n*S KotlinDebug\n*F\n+ 1 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n60#1:373\n60#1:374,2\n85#1:376\n85#1:377,2\n86#1:379\n86#1:380,2\n116#1:382,11\n116#1:393,2\n129#1:395,11\n129#1:406,2\n134#1:408,11\n184#1:419,2\n188#1:421,2\n198#1:423,2\n214#1:425,2\n218#1:427,2\n240#1:429,2\n242#1:431,2\n258#1:433,2\n272#1:435\n272#1:436,2\n273#1:438\n273#1:439,2\n330#1:441,11\n330#1:452\n330#1:453,2\n332#1:455\n332#1:456,3\n*E\n"})
/* loaded from: classes5.dex */
public final class t extends AndroidViewModel implements DefaultLifecycleObserver {

    /* renamed from: l, reason: collision with root package name */
    public static final int f28065l = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final w0 f28066a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public WordListType f28067b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<c1> f28068c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f28069d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f28070e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f28071f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f28072g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f28073h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.y<com.baicizhan.main.wordlistv2.repo.o> f28074i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28075j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final yz.c0 f28076k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28077a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28078b;

        static {
            int[] iArr = new int[WordListType.values().length];
            try {
                iArr[WordListType.TO_STUDY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WordListType.LEARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WordListType.MASTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WordListType.KILLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28077a = iArr;
            int[] iArr2 = new int[OrderType.values().length];
            try {
                iArr2[OrderType.TIME_ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderType.TIME_DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderType.MASTERED_ASC.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderType.MASTERED_DESC.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderType.LETTER_ASC.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OrderType.LETTER_DESC.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OrderType.DEFAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            f28078b = iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.WordListContentViewModel$changeShowStatus$1", f = "WordListContentViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f28079a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ OrderType f28081c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(OrderType orderType, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f28081c = orderType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return t.this.new b(this.f28081c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f28079a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (t.this.p() == WordListType.TODAY) {
                t.this.j(this.f28081c);
            } else {
                t.this.k(this.f28081c);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n189#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String w11 = ((c1) t11).w();
            Locale locale = Locale.ROOT;
            String lowerCase = w11.toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((c1) t12).w().toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase2, "toLowerCase(...)");
            return e00.g.l(lowerCase, lowerCase2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n185#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String w11 = ((c1) t12).w();
            Locale locale = Locale.ROOT;
            String lowerCase = w11.toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((c1) t11).w().toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase2, "toLowerCase(...)");
            return e00.g.l(lowerCase, lowerCase2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n219#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((c1) t11).q()), Integer.valueOf(((c1) t12).q()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n215#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((c1) t12).q()), Integer.valueOf(((c1) t11).q()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n235#2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((c1) t11).s()), Long.valueOf(((c1) t12).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n232#2:329\n*E\n"})
    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((c1) t12).s()), Long.valueOf(((c1) t11).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n242#2:329\n*E\n"})
    public static final class i<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((c1) t11).s()), Long.valueOf(((c1) t12).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n240#2:329\n*E\n"})
    public static final class j<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((c1) t12).s()), Long.valueOf(((c1) t11).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n233#2:329\n*E\n"})
    public static final class k<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f28082a;

        public k(Comparator comparator) {
            this.f28082a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f28082a.compare(t11, t12);
            return compare != 0 ? compare : e00.g.l(Integer.valueOf(((c1) t11).t()), Integer.valueOf(((c1) t12).t()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 WordListContentViewModel.kt\ncom/baicizhan/main/wordlistv2/WordListContentViewModel\n*L\n1#1,328:1\n236#2:329\n*E\n"})
    public static final class l<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f28083a;

        public l(Comparator comparator) {
            this.f28083a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f28083a.compare(t11, t12);
            return compare != 0 ? compare : e00.g.l(Integer.valueOf(((c1) t11).t()), Integer.valueOf(((c1) t12).t()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k Application application, @m80.k w0 activityVm) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(activityVm, "activityVm");
        this.f28066a = activityVm;
        this.f28067b = WordListType.TODAY;
        this.f28068c = new ArrayList();
        this.f28069d = new MutableLiveData<>();
        this.f28070e = new MutableLiveData<>();
        this.f28071f = new MutableLiveData<>();
        this.f28072g = new MutableLiveData<>(Boolean.TRUE);
        this.f28073h = new MutableLiveData<>();
        this.f28074i = kotlinx.coroutines.flow.o0.a(new com.baicizhan.main.wordlistv2.repo.o(0, false, 0, 7, null));
        this.f28076k = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wordlistv2.s
            @Override // x00.a
            public final Object invoke() {
                q9.l x11;
                x11 = t.x();
                return x11;
            }
        });
    }

    public static /* synthetic */ void B(t tVar, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        tVar.A(list, z11);
    }

    public static /* synthetic */ void D(t tVar, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        tVar.C(list, z11);
    }

    public static /* synthetic */ void G(t tVar, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        tVar.F(list, z11);
    }

    public static final void L(x00.a aVar, x00.a aVar2, IAudioPlayer.State state) {
        if (IAudioPlayer.State.Playing == state) {
            aVar.invoke();
        }
        if (IAudioPlayer.State.Stopped == state || IAudioPlayer.State.Completed == state) {
            aVar2.invoke();
        }
    }

    public static final g2 M(t tVar, File file) {
        tVar.u().e(file);
        return g2.f100423a;
    }

    public static final void N(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void O(Throwable th2) {
        va.g.i(KotlinExtKt.getString(R.string.word_book_voice_no_file), 0);
    }

    public static final q9.l x() {
        return new q9.l(KotlinExtKt.getGlobalApplicationContext());
    }

    public final void A(List<c1> list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (z11) {
            if (arrayList.size() > 1) {
                a00.l0.r0(arrayList, new d());
            }
        } else if (arrayList.size() > 1) {
            a00.l0.r0(arrayList, new c());
        }
        z(arrayList);
    }

    public final void C(List<c1> list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (z11) {
            if (arrayList.size() > 1) {
                a00.l0.r0(arrayList, new f());
            }
        } else if (arrayList.size() > 1) {
            a00.l0.r0(arrayList, new e());
        }
        this.f28069d.postValue(arrayList);
    }

    public final void F(@m80.k List<c1> list, boolean z11) {
        kotlin.jvm.internal.g0.p(list, "list");
        qb.c.b(mj.i0.f73299t, "order by time, isReverse:" + z11 + " start", new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (this.f28067b == WordListType.LEARNING) {
            if (z11) {
                a00.l0.r0(arrayList, new k(new h()));
            } else {
                a00.l0.r0(arrayList, new l(new g()));
            }
        } else if (z11) {
            if (arrayList.size() > 1) {
                a00.l0.r0(arrayList, new j());
            }
        } else if (arrayList.size() > 1) {
            a00.l0.r0(arrayList, new i());
        }
        if (arrayList.size() > 1) {
            qb.c.b(mj.i0.f73299t, "order by time, first -> " + a00.r0.G2(arrayList) + " \n second -> " + arrayList.get(1) + " \n last second -> " + arrayList.get(arrayList.size() - 2) + " \n last -> " + a00.r0.u3(arrayList), new Object[0]);
        }
        y(arrayList);
        qb.c.b(mj.i0.f73299t, "order by time, isReverse:" + z11 + " end", new Object[0]);
    }

    public final void H(@m80.k List<c1> list) {
        kotlin.jvm.internal.g0.p(list, "list");
        this.f28068c.clear();
        if (this.f28067b == WordListType.TODAY) {
            J(list);
        } else {
            I(list);
        }
    }

    public final void I(List<c1> list) {
        OrderType orderType;
        MutableLiveData<OrderType> c11;
        MutableLiveData<Integer> d11;
        MutableLiveData<Integer> d12;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c1) obj).u() == this.f28067b.getType() + 2) {
                arrayList.add(obj);
            }
        }
        this.f28068c.addAll(arrayList);
        if (!arrayList.isEmpty()) {
            e1 e1Var = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
            if (e1Var != null && (d11 = e1Var.d()) != null) {
                d11.postValue(Integer.valueOf(this.f28068c.size()));
            }
            e1 e1Var2 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
            if (e1Var2 == null || (c11 = e1Var2.c()) == null || (orderType = c11.getValue()) == null) {
                orderType = this.f28067b.getOrderOptionList().get(0);
            }
            k(orderType);
            return;
        }
        this.f28069d.postValue(a00.h0.J());
        MutableLiveData<String> mutableLiveData = this.f28070e;
        WordListType wordListType = this.f28067b;
        int[] iArr = a.f28077a;
        int i11 = iArr[wordListType.ordinal()];
        String str = "";
        mutableLiveData.setValue(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "" : "无已斩单词" : "暂无已熟识单词，快去复习吧💪🏻" : "暂无学习中单词，快去学习吧💪🏻" : "没有生词了，恭喜你完成学习计划🎉");
        MutableLiveData<String> mutableLiveData2 = this.f28071f;
        int i12 = iArr[this.f28067b.ordinal()];
        if (i12 == 3) {
            str = "Tips: 按照百词斩「多维能力记忆曲线」安排的计划，按时来复习，用最少的精力记最多的单词";
        } else if (i12 == 4) {
            str = "Tips: 认识的可以「斩」掉，提高背词效率~";
        }
        mutableLiveData2.setValue(str);
        e1 e1Var3 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        if (e1Var3 == null || (d12 = e1Var3.d()) == null) {
            return;
        }
        d12.postValue(0);
    }

    public final void J(List<c1> list) {
        OrderType orderType;
        MutableLiveData<OrderType> c11;
        MutableLiveData<Integer> d11;
        List<c1> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((c1) obj).u() == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((c1) obj2).u() == 2) {
                arrayList2.add(obj2);
            }
        }
        List<c1> list3 = this.f28068c;
        list3.addAll(arrayList);
        list3.addAll(arrayList2);
        e1 e1Var = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        if (e1Var != null && (d11 = e1Var.d()) != null) {
            d11.postValue(Integer.valueOf(arrayList.size() + arrayList2.size()));
        }
        e1 e1Var2 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        if (e1Var2 == null || (c11 = e1Var2.c()) == null || (orderType = c11.getValue()) == null) {
            orderType = this.f28067b.getOrderOptionList().get(0);
        }
        j(orderType);
    }

    public final void K(@m80.k String audioUrl, @m80.k final x00.a<g2> onStart, @m80.k final x00.a<g2> onEnd) {
        kotlin.jvm.internal.g0.p(audioUrl, "audioUrl");
        kotlin.jvm.internal.g0.p(onStart, "onStart");
        kotlin.jvm.internal.g0.p(onEnd, "onEnd");
        u().f(new IAudioPlayer.b() { // from class: com.baicizhan.main.wordlistv2.o
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                t.L(x00.a.this, onEnd, state);
            }
        });
        rx.c<File> I3 = m9.d.d().e(audioUrl).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.wordlistv2.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 M;
                M = t.M(t.this, (File) obj);
                return M;
            }
        };
        I3.u5(new wb0.b() { // from class: com.baicizhan.main.wordlistv2.q
            @Override // wb0.b
            public final void call(Object obj) {
                t.N(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.main.wordlistv2.r
            @Override // wb0.b
            public final void call(Object obj) {
                t.O((Throwable) obj);
            }
        });
    }

    public final boolean P() {
        Integer num;
        MutableLiveData<Integer> d11;
        MutableLiveData<Integer> b11;
        Integer value;
        e1 e1Var = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        int intValue = (e1Var == null || (b11 = e1Var.b()) == null || (value = b11.getValue()) == null) ? 0 : value.intValue();
        e1 e1Var2 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        if (e1Var2 == null || (d11 = e1Var2.d()) == null || (num = d11.getValue()) == null) {
            num = -1;
        }
        return intValue == num.intValue();
    }

    public final void Q(boolean z11) {
        this.f28075j = z11;
    }

    public final void R(@m80.k WordListType wordListType) {
        kotlin.jvm.internal.g0.p(wordListType, "<set-?>");
        this.f28067b = wordListType;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.t.S():void");
    }

    public final void T() {
        MutableLiveData<Boolean> a11;
        Boolean value = this.f28072g.getValue();
        boolean z11 = !(value != null ? value.booleanValue() : false);
        List<Object> value2 = this.f28069d.getValue();
        if (value2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : value2) {
                if (obj instanceof c1) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c1) it.next()).B(z11);
            }
        }
        this.f28072g.setValue(Boolean.valueOf(z11));
        e1 e1Var = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        if (e1Var == null || (a11 = e1Var.a()) == null) {
            return;
        }
        a11.setValue(Boolean.valueOf(z11));
    }

    public final void i(boolean z11) {
        MutableLiveData<Integer> b11;
        MutableLiveData<Integer> b12;
        Integer value;
        e1 e1Var = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        int intValue = (e1Var == null || (b12 = e1Var.b()) == null || (value = b12.getValue()) == null) ? 0 : value.intValue();
        int i11 = z11 ? intValue + 1 : intValue - 1;
        int i12 = i11 >= 0 ? i11 : 0;
        e1 e1Var2 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
        if (e1Var2 == null || (b11 = e1Var2.b()) == null) {
            return;
        }
        b11.setValue(Integer.valueOf(i12));
    }

    public final void j(OrderType orderType) {
        MutableLiveData<Integer> d11;
        MutableLiveData<Integer> d12;
        MutableLiveData<Integer> d13;
        MutableLiveData<Integer> d14;
        MutableLiveData<Integer> d15;
        MutableLiveData<Integer> d16;
        List a62 = a00.r0.a6(this.f28068c);
        List list = a62;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c1) obj).u() == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((c1) obj2).u() == 2) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (orderType == OrderType.TODAY_ALL) {
            if (!arrayList.isEmpty()) {
                arrayList3.add(WordTodayCategory.LEARN);
                arrayList3.addAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.add(WordTodayCategory.REVIEW);
                arrayList3.addAll(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                this.f28069d.postValue(a00.h0.J());
                this.f28070e.postValue(KotlinExtKt.getToStr(R.string.wordlist_empty_no_today_words));
                e1 e1Var = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
                if (e1Var == null || (d16 = e1Var.d()) == null) {
                    return;
                }
                d16.postValue(0);
                return;
            }
            e1 e1Var2 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
            if (e1Var2 != null && (d15 = e1Var2.d()) != null) {
                d15.postValue(Integer.valueOf(a62.size()));
            }
        }
        if (orderType == OrderType.TODAY_LEARN) {
            if (!arrayList.isEmpty()) {
                arrayList3.add(WordTodayCategory.LEARN);
                arrayList3.addAll(arrayList);
            }
            if (arrayList3.isEmpty()) {
                this.f28069d.postValue(a00.h0.J());
                this.f28070e.postValue(KotlinExtKt.getToStr(R.string.wordlist_empty_no_new_words));
                e1 e1Var3 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
                if (e1Var3 == null || (d14 = e1Var3.d()) == null) {
                    return;
                }
                d14.postValue(0);
                return;
            }
            e1 e1Var4 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
            if (e1Var4 != null && (d13 = e1Var4.d()) != null) {
                d13.postValue(Integer.valueOf(arrayList.size()));
            }
        }
        if (orderType == OrderType.TODAY_REVIEW) {
            if (!arrayList2.isEmpty()) {
                arrayList3.add(WordTodayCategory.REVIEW);
                arrayList3.addAll(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                this.f28069d.postValue(a00.h0.J());
                this.f28070e.postValue(KotlinExtKt.getToStr(R.string.wordlist_empty_no_review_words));
                e1 e1Var5 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
                if (e1Var5 == null || (d12 = e1Var5.d()) == null) {
                    return;
                }
                d12.postValue(0);
                return;
            }
            e1 e1Var6 = this.f28066a.s().get(Integer.valueOf(this.f28067b.getType()));
            if (e1Var6 != null && (d11 = e1Var6.d()) != null) {
                d11.postValue(Integer.valueOf(arrayList2.size()));
            }
        }
        this.f28069d.postValue(arrayList3);
    }

    public final void k(OrderType orderType) {
        List<c1> list = this.f28068c;
        switch (a.f28078b[orderType.ordinal()]) {
            case 1:
                G(this, list, false, 2, null);
                break;
            case 2:
                F(list, true);
                break;
            case 3:
                D(this, list, false, 2, null);
                break;
            case 4:
                C(list, true);
                break;
            case 5:
                B(this, list, false, 2, null);
                break;
            case 6:
                A(list, true);
                break;
            case 7:
                this.f28069d.postValue(list);
                break;
        }
    }

    public final void l(@m80.k OrderType type) {
        kotlin.jvm.internal.g0.p(type, "type");
        this.f28066a.o().setValue(Boolean.TRUE);
        this.f28075j = true;
        c40.k.f(ViewModelKt.getViewModelScope(this), h1.c(), null, new b(type, null), 2, null);
    }

    public final void m(@m80.k w0 activityVm) {
        kotlin.jvm.internal.g0.p(activityVm, "activityVm");
        List<Object> value = this.f28069d.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (obj instanceof c1) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((c1) obj2).z()) {
                    arrayList2.add(obj2);
                }
            }
            EditAction editAction = this.f28067b.getEditAction();
            ArrayList arrayList3 = new ArrayList(a00.i0.d0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Integer.valueOf(((c1) it.next()).v()));
            }
            activityVm.d(editAction, arrayList3);
        }
    }

    @m80.k
    public final w0 n() {
        return this.f28066a;
    }

    @m80.k
    public final MutableLiveData<Boolean> o() {
        return this.f28073h;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@m80.k LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        super.onDestroy(owner);
        u().destroy();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(@m80.k LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(@m80.k LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        super.onStop(owner);
        u().stop();
    }

    @m80.k
    public final WordListType p() {
        return this.f28067b;
    }

    @m80.k
    public final MutableLiveData<String> q() {
        return this.f28070e;
    }

    @m80.k
    public final MutableLiveData<String> r() {
        return this.f28071f;
    }

    @m80.k
    public final kotlinx.coroutines.flow.y<com.baicizhan.main.wordlistv2.repo.o> s() {
        return this.f28074i;
    }

    @m80.k
    public final MutableLiveData<Boolean> t() {
        return this.f28072g;
    }

    public final q9.l u() {
        return (q9.l) this.f28076k.getValue();
    }

    @m80.k
    public final MutableLiveData<List<Object>> v() {
        return this.f28069d;
    }

    public final boolean w() {
        return this.f28075j;
    }

    public final void y(List<c1> list) {
        ArrayList arrayList = new ArrayList();
        String str = " ";
        for (c1 c1Var : list) {
            String format = new SimpleDateFormat("yyyy.MM.dd", Locale.CHINA).format(new Date(c1Var.s()));
            if (!kotlin.jvm.internal.g0.g(format, str)) {
                kotlin.jvm.internal.g0.m(format);
                arrayList.add(format);
                str = format;
            }
            arrayList.add(c1Var);
        }
        this.f28069d.postValue(arrayList);
    }

    public final void z(List<c1> list) {
        ArrayList arrayList = new ArrayList();
        String str = " ";
        for (c1 c1Var : list) {
            String valueOf = String.valueOf(u30.r0.x7(c1Var.w()));
            if (!kotlin.jvm.internal.g0.g(valueOf, str)) {
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
                str = valueOf;
            }
            arrayList.add(c1Var);
        }
        this.f28069d.postValue(arrayList);
    }
}
