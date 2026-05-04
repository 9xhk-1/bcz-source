package mj;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import c40.a1;
import c40.l2;
import c40.v1;
import c40.x1;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.online.user_activity_api.ExportActivityInfo;
import com.baicizhan.online.user_activity_api.ExportBanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.i0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordBookDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookDetailViewModel.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n808#2,11:325\n1869#2,2:336\n1021#2,2:338\n1011#2,2:340\n1869#2,2:342\n1021#2,2:345\n1011#2,2:347\n1869#2:349\n1870#2:352\n35#3:344\n39#3:351\n1#4:350\n*S KotlinDebug\n*F\n+ 1 WordBookDetailViewModel.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailViewModel\n*L\n181#1:325,11\n181#1:336,2\n210#1:338,2\n214#1:340,2\n233#1:342,2\n261#1:345,2\n265#1:347,2\n288#1:349\n288#1:352\n249#1:344\n292#1:351\n*E\n"})
/* loaded from: classes5.dex */
public final class i0 extends pj.a implements DefaultLifecycleObserver {

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final a f73297r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f73298s = 8;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final String f73299t = "WordBookDetailViewModel";

    /* renamed from: u, reason: collision with root package name */
    public static final int f73300u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f73301v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f73302w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f73303x = 4;

    /* renamed from: c, reason: collision with root package name */
    public final long f73304c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final CopyOnWriteArrayList<ij.z> f73305d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<kj.a> f73306e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final LiveData<kj.a> f73307f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f73308g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f73309h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f73310i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f73311j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public ExportBanner f73312k;

    /* renamed from: l, reason: collision with root package name */
    public int f73313l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f73314m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f73315n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f73316o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f73317p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final yz.c0 f73318q;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$deleteWords$1", f = "WordBookDetailViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73319a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Long> f73321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Long> list, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f73321c = list;
        }

        public static final boolean j(List list, ij.z zVar) {
            return list.contains(Long.valueOf(zVar.y()));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i0.this.new b(this.f73321c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object z11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f73319a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.q a11 = i0.this.a();
                long j11 = i0.this.f73304c;
                List<Long> list = this.f73321c;
                this.f73319a = 1;
                z11 = a11.z(j11, list, this);
                if (z11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                z11 = ((Result) obj).m6317unboximpl();
            }
            i0 i0Var = i0.this;
            final List<Long> list2 = this.f73321c;
            if (Result.m6315isSuccessimpl(z11)) {
                ((Boolean) z11).getClass();
                qb.c.b(i0.f73299t, "delete success", new Object[0]);
                long currentTimeMillis = System.currentTimeMillis();
                a00.m0.N0(i0Var.f73305d, new x00.l() { // from class: mj.j0
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        boolean j12;
                        j12 = i0.b.j(list2, (ij.z) obj2);
                        return Boolean.valueOf(j12);
                    }
                });
                i0.G(i0Var, 0, null, false, 7, null);
                qb.c.b(i0.f73299t, "delete order end cost time:" + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(z11);
            if (m6311exceptionOrNullimpl != null) {
                qb.c.d(i0.f73299t, "delete error:" + m6311exceptionOrNullimpl.getMessage(), new Object[0]);
                KotlinExtKt.showToast(m6311exceptionOrNullimpl);
            }
            i0.this.f73310i.setValue(l00.a.a(false));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel", f = "WordBookDetailViewModel.kt", i = {}, l = {312}, m = "getShareCode-IoAF18A", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f73322a;

        /* renamed from: c, reason: collision with root package name */
        public int f73324c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f73322a = obj;
            this.f73324c |= Integer.MIN_VALUE;
            Object s11 = i0.this.s(this);
            return s11 == kotlin.coroutines.intrinsics.b.l() ? s11 : Result.m6307boximpl(s11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WordBookDetailViewModel.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailViewModel\n*L\n1#1,328:1\n266#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String z11 = ((ij.z) t11).z();
            Locale locale = Locale.ROOT;
            String lowerCase = z11.toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((ij.z) t12).z().toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase2, "toLowerCase(...)");
            return e00.g.l(lowerCase, lowerCase2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WordBookDetailViewModel.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailViewModel\n*L\n1#1,328:1\n262#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String z11 = ((ij.z) t12).z();
            Locale locale = Locale.ROOT;
            String lowerCase = z11.toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((ij.z) t11).z().toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase2, "toLowerCase(...)");
            return e00.g.l(lowerCase, lowerCase2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WordBookDetailViewModel.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailViewModel\n*L\n1#1,328:1\n215#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((ij.z) t11).s()), Long.valueOf(((ij.z) t12).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 WordBookDetailViewModel.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailViewModel\n*L\n1#1,328:1\n211#2:329\n*E\n"})
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((ij.z) t12).s()), Long.valueOf(((ij.z) t11).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$refreshListData$1", f = "WordBookDetailViewModel.kt", i = {}, l = {124, 130}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f73325a;

        /* renamed from: b, reason: collision with root package name */
        public int f73326b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l2 f73327c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f73328d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$refreshListData$1$1", f = "WordBookDetailViewModel.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4}, l = {108, 112, 113, 116, 119}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", xd.a.f98002r, "$i$a$-onSuccess-WordBookDetailViewModel$refreshListData$1$1$1", "$this$flow", xd.a.f98002r, "it", "$i$a$-onSuccess-WordBookDetailViewModel$refreshListData$1$1$1", "$i$a$-onSuccess-WordBookDetailViewModel$refreshListData$1$1$1$1", "$this$flow", xd.a.f98002r, "it", "$i$a$-onSuccess-WordBookDetailViewModel$refreshListData$1$1$1", "$i$a$-onFailure-WordBookDetailViewModel$refreshListData$1$1$1$2", "$this$flow", xd.a.f98002r, "$i$a$-onSuccess-WordBookDetailViewModel$refreshListData$1$1$1"}, s = {"L$0", "L$0", "L$2", "I$0", "L$0", "L$2", "L$4", "I$0", "I$1", "L$0", "L$2", "L$4", "I$0", "I$1", "L$0", "L$2", "I$0"}, v = 1)
        @kotlin.jvm.internal.u0({"SMAP\nWordBookDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookDetailViewModel.kt\ncom/baicizhan/main/word_book/detail/WordBookDetailViewModel$refreshListData$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n1#2:325\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super List<? extends ij.z>>, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f73329a;

            /* renamed from: b, reason: collision with root package name */
            public Object f73330b;

            /* renamed from: c, reason: collision with root package name */
            public Object f73331c;

            /* renamed from: d, reason: collision with root package name */
            public Object f73332d;

            /* renamed from: e, reason: collision with root package name */
            public int f73333e;

            /* renamed from: f, reason: collision with root package name */
            public int f73334f;

            /* renamed from: g, reason: collision with root package name */
            public int f73335g;

            /* renamed from: h, reason: collision with root package name */
            public /* synthetic */ Object f73336h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ i0 f73337i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i0 i0Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f73337i = i0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f73337i, cVar);
                aVar.f73336h = obj;
                return aVar;
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super List<? extends ij.z>> jVar, j00.c<? super g2> cVar) {
                return invoke2((kotlinx.coroutines.flow.j<? super List<ij.z>>) jVar, cVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0163, code lost:
            
                if (r7.emit(r2, r17) == r8) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0130, code lost:
            
                if (r7.emit(r5, r17) == r8) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0182, code lost:
            
                if (r7.emit(r2, r17) == r8) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
            
                if (r0 == r8) goto L50;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 403
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: mj.i0.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(kotlinx.coroutines.flow.j<? super List<ij.z>> jVar, j00.c<? super g2> cVar) {
                return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$refreshListData$1$2", f = "WordBookDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements x00.q<List<? extends ij.z>, ExportActivityInfo, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73338a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f73339b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f73340c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i0 f73341d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i0 i0Var, j00.c<? super b> cVar) {
                super(3, cVar);
                this.f73341d = i0Var;
            }

            @Override // x00.q
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(List<ij.z> list, ExportActivityInfo exportActivityInfo, j00.c<? super g2> cVar) {
                b bVar = new b(this.f73341d, cVar);
                bVar.f73339b = list;
                bVar.f73340c = exportActivityInfo;
                return bVar.invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.f73339b;
                ExportActivityInfo exportActivityInfo = (ExportActivityInfo) this.f73340c;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f73338a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                qb.c.i(i0.f73299t, "getWords list size:" + list.size(), new Object[0]);
                this.f73341d.L(list);
                this.f73341d.f73312k = exportActivityInfo.banner;
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$refreshListData$1$3", f = "WordBookDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class c extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super g2>, Throwable, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73342a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f73343b;

            public c(j00.c<? super c> cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Throwable th2 = (Throwable) this.f73343b;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f73342a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                qb.c.d(i0.f73299t, "getWords or get export error:" + th2.getMessage(), new Object[0]);
                return g2.f100423a;
            }

            @Override // x00.q
            public final Object invoke(kotlinx.coroutines.flow.j<? super g2> jVar, Throwable th2, j00.c<? super g2> cVar) {
                c cVar2 = new c(cVar);
                cVar2.f73343b = th2;
                return cVar2.invokeSuspend(g2.f100423a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class d<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a, reason: collision with root package name */
            public static final d<T> f73344a = new d<>();

            @Override // kotlinx.coroutines.flow.j
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(g2 g2Var, j00.c<? super g2> cVar) {
                qb.c.b(i0.f73299t, "getWords collect", new Object[0]);
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l2 l2Var, i0 i0Var, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f73327c = l2Var;
            this.f73328d = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new h(this.f73327c, this.f73328d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        
            if (r9.collect(r1, r8) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r9 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f73326b
                r2 = 0
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.e.n(r9)
                goto L6e
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r1 = r8.f73325a
                kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
                kotlin.e.n(r9)
                goto L4b
            L24:
                kotlin.e.n(r9)
                java.lang.String r9 = "flowOfWords"
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r6 = "WordBookDetailViewModel"
                qb.c.b(r6, r9, r1)
                mj.i0$h$a r9 = new mj.i0$h$a
                mj.i0 r1 = r8.f73328d
                r9.<init>(r1, r5)
                kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.K0(r9)
                qj.o r9 = new qj.o
                r9.<init>()
                r8.f73325a = r1
                r8.f73326b = r4
                java.lang.Object r9 = r9.c(r8)
                if (r9 != r0) goto L4b
                goto L6d
            L4b:
                kotlinx.coroutines.flow.i r9 = (kotlinx.coroutines.flow.i) r9
                mj.i0$h$b r6 = new mj.i0$h$b
                mj.i0 r7 = r8.f73328d
                r6.<init>(r7, r5)
                kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.k.j2(r1, r9, r6)
                mj.i0$h$c r1 = new mj.i0$h$c
                r1.<init>(r5)
                kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.k.v(r9, r1)
                mj.i0$h$d<T> r1 = mj.i0.h.d.f73344a
                r8.f73325a = r5
                r8.f73326b = r3
                java.lang.Object r9 = r9.collect(r1, r8)
                if (r9 != r0) goto L6e
            L6d:
                return r0
            L6e:
                c40.l2 r9 = r8.f73327c
                boolean r9 = r9.isActive()
                if (r9 == 0) goto L7b
                c40.l2 r9 = r8.f73327c
                c40.l2.a.b(r9, r5, r4, r5)
            L7b:
                mj.i0 r9 = r8.f73328d
                androidx.lifecycle.MutableLiveData r9 = mj.i0.g(r9)
                java.lang.Boolean r0 = l00.a.a(r2)
                r9.postValue(r0)
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mj.i0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$refreshListData$loading$1", f = "WordBookDetailViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73345a;

        public i(j00.c<? super i> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i0.this.new i(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f73345a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = i0.this.a().Z() ? 0L : 150L;
                this.f73345a = 1;
                if (a1.b(j11, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            i0.this.f73310i.setValue(l00.a.a(true));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$resetOrder$1", f = "WordBookDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73347a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f73348b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0 f73349c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<ij.z> f73350d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f73351e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i11, i0 i0Var, List<ij.z> list, boolean z11, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f73348b = i11;
            this.f73349c = i0Var;
            this.f73350d = list;
            this.f73351e = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new j(this.f73348b, this.f73349c, this.f73350d, this.f73351e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f73347a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            int i11 = this.f73348b;
            if (i11 == 1) {
                i0.B(this.f73349c, this.f73350d, false, this.f73351e, 2, null);
            } else if (i11 == 2) {
                this.f73349c.A(this.f73350d, true, this.f73351e);
            } else if (i11 == 3) {
                i0.z(this.f73349c, this.f73350d, false, this.f73351e, 2, null);
            } else if (i11 == 4) {
                this.f73349c.y(this.f73350d, true, this.f73351e);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$start$1", f = "WordBookDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73352a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f73353b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$start$1$1", f = "WordBookDetailViewModel.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f73355a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f73356b;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$start$1$1$1", f = "WordBookDetailViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: mj.i0$k$a$a, reason: collision with other inner class name */
            public static final class C0885a extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super kj.a>, Throwable, j00.c<? super g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f73357a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f73358b;

                public C0885a(j00.c<? super C0885a> cVar) {
                    super(3, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Throwable th2 = (Throwable) this.f73358b;
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f73357a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    qb.c.c(i0.f73299t, "", th2);
                    KotlinExtKt.showToast(th2);
                    return g2.f100423a;
                }

                @Override // x00.q
                public final Object invoke(kotlinx.coroutines.flow.j<? super kj.a> jVar, Throwable th2, j00.c<? super g2> cVar) {
                    C0885a c0885a = new C0885a(cVar);
                    c0885a.f73358b = th2;
                    return c0885a.invokeSuspend(g2.f100423a);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class b<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i0 f73359a;

                public b(i0 i0Var) {
                    this.f73359a = i0Var;
                }

                @Override // kotlinx.coroutines.flow.j
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(kj.a aVar, j00.c<? super g2> cVar) {
                    qb.c.b(i0.f73299t, "book profile update: " + aVar, new Object[0]);
                    this.f73359a.f73317p = true;
                    this.f73359a.f73306e.setValue(aVar);
                    return g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i0 i0Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f73356b = i0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f73356b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f73355a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    kotlinx.coroutines.flow.i v11 = kotlinx.coroutines.flow.k.v(this.f73356b.a().f(this.f73356b.f73304c), new C0885a(null));
                    b bVar = new b(this.f73356b);
                    this.f73355a = 1;
                    if (v11.collect(bVar, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        public k(j00.c<? super k> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            k kVar = i0.this.new k(cVar);
            kVar.f73353b = obj;
            return kVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c40.r0 r0Var = (c40.r0) this.f73353b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f73352a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            c40.k.f(r0Var, null, null, new a(i0.this, null), 3, null);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.detail.WordBookDetailViewModel$updateBookName$1", f = "WordBookDetailViewModel.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class l extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f73360a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f73362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, j00.c<? super l> cVar) {
            super(2, cVar);
            this.f73362c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i0.this.new l(this.f73362c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((l) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object p11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f73360a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                i0.this.f73310i.postValue(l00.a.a(true));
                ij.q a11 = i0.this.a();
                long j11 = i0.this.f73304c;
                String str = this.f73362c;
                this.f73360a = 1;
                p11 = a11.p(j11, str, this);
                if (p11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                p11 = ((Result) obj).m6317unboximpl();
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(p11);
            if (m6311exceptionOrNullimpl != null) {
                KotlinExtKt.showToast(m6311exceptionOrNullimpl);
            }
            i0.this.f73310i.postValue(l00.a.a(false));
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@m80.k Application application, @m80.k ij.q manager, long j11) {
        super(manager, application);
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(manager, "manager");
        this.f73304c = j11;
        this.f73305d = new CopyOnWriteArrayList<>();
        MutableLiveData<kj.a> mutableLiveData = new MutableLiveData<>();
        this.f73306e = mutableLiveData;
        this.f73307f = mutableLiveData;
        MutableLiveData<List<Object>> mutableLiveData2 = new MutableLiveData<>();
        this.f73308g = mutableLiveData2;
        this.f73309h = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.f73310i = mutableLiveData3;
        this.f73311j = mutableLiveData3;
        this.f73313l = 1;
        this.f73314m = true;
        this.f73316o = true;
        this.f73317p = true;
        this.f73318q = yz.e0.c(new x00.a() { // from class: mj.h0
            @Override // x00.a
            public final Object invoke() {
                v1 N;
                N = i0.N();
                return N;
            }
        });
    }

    public static /* synthetic */ void B(i0 i0Var, List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        i0Var.A(list, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void G(i0 i0Var, int i11, List list, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = i0Var.f73313l;
        }
        if ((i12 & 2) != 0) {
            list = i0Var.f73305d;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        i0Var.F(i11, list, z11);
    }

    public static final v1 N() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.g0.o(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return x1.d(newSingleThreadExecutor);
    }

    public static /* synthetic */ void z(i0 i0Var, List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        i0Var.y(list, z11, z12);
    }

    public final void A(@m80.k List<ij.z> newWords, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(newWords, "newWords");
        qb.c.b(f73299t, "order by time, isReverse:" + z11 + " start", new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(newWords);
        if (z11) {
            if (arrayList.size() > 1) {
                a00.l0.r0(arrayList, new g());
            }
        } else if (arrayList.size() > 1) {
            a00.l0.r0(arrayList, new f());
        }
        if (arrayList.size() > 1) {
            qb.c.b(f73299t, "order by time, first -> " + a00.r0.G2(arrayList) + " \n second -> " + arrayList.get(1) + " \n last second -> " + arrayList.get(arrayList.size() - 2) + " \n last -> " + a00.r0.u3(arrayList), new Object[0]);
        }
        x(arrayList, z12);
        qb.c.b(f73299t, "order by time, isReverse:" + z11 + " end", new Object[0]);
    }

    public final void C() {
        l2 f11;
        if (this.f73317p) {
            this.f73317p = false;
            f11 = c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new i(null), 3, null);
            c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new h(f11, this, null), 3, null);
        }
    }

    public final void D(boolean z11) {
        List<Object> value = this.f73308g.getValue();
        if (value != null) {
            ArrayList<ij.z> arrayList = new ArrayList();
            for (Object obj : value) {
                if (obj instanceof ij.z) {
                    arrayList.add(obj);
                }
            }
            for (ij.z zVar : arrayList) {
                if (z11) {
                    zVar.B(this.f73314m);
                } else {
                    zVar.A(this.f73315n);
                }
            }
        }
        this.f73308g.postValue(value);
    }

    public final void F(int i11, @m80.k List<ij.z> newWords, boolean z11) {
        kotlin.jvm.internal.g0.p(newWords, "newWords");
        this.f73313l = i11;
        c40.k.f(ViewModelKt.getViewModelScope(this), t(), null, new j(i11, this, newWords, z11, null), 2, null);
    }

    public final void H(@m80.k List<ij.z> newWords, boolean z11) {
        g2 g2Var;
        Object obj;
        kotlin.jvm.internal.g0.p(newWords, "newWords");
        if (!this.f73305d.isEmpty() && z11) {
            qb.c.i(f73299t, "resume new data status", new Object[0]);
            for (ij.z zVar : newWords) {
                Iterator<T> it = this.f73305d.iterator();
                while (true) {
                    g2Var = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (zVar.y() == ((ij.z) obj).y()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ij.z zVar2 = (ij.z) obj;
                if (zVar2 != null) {
                    zVar.B(zVar2.w());
                    zVar.A(zVar2.v());
                    g2Var = g2.f100423a;
                }
                if (g2Var == null) {
                    zVar.B(this.f73314m);
                    zVar.A(this.f73315n);
                }
            }
        }
        this.f73305d.clear();
        this.f73305d.addAll(newWords);
    }

    public final void I(int i11) {
        this.f73313l = i11;
    }

    public final void J(boolean z11) {
        this.f73315n = z11;
    }

    public final void K(boolean z11) {
        this.f73314m = z11;
    }

    public final void L(List<ij.z> list) {
        G(this, 0, list, true, 1, null);
    }

    public final void M(boolean z11) {
        this.f73316o = z11;
    }

    public final void O() {
        this.f73315n = !this.f73315n;
        D(false);
    }

    public final void P() {
        this.f73314m = !this.f73314m;
        D(true);
    }

    public final void Q(@m80.k List<Object> resultList) {
        ExportBanner exportBanner;
        kotlin.jvm.internal.g0.p(resultList, "resultList");
        if (resultList.isEmpty() || (exportBanner = this.f73312k) == null) {
            return;
        }
        String img_url = exportBanner.img_url;
        kotlin.jvm.internal.g0.o(img_url, "img_url");
        if (img_url.length() > 0) {
            resultList.add(0, exportBanner);
        }
    }

    public final void R(@m80.k String newName) {
        kotlin.jvm.internal.g0.p(newName, "newName");
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new l(newName, null), 3, null);
    }

    public final boolean l() {
        return r() > 0;
    }

    public final void m(@m80.k List<Long> deleteTopics) {
        kotlin.jvm.internal.g0.p(deleteTopics, "deleteTopics");
        this.f73310i.postValue(Boolean.TRUE);
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new b(deleteTopics, null), 3, null);
    }

    @m80.k
    public final LiveData<Boolean> n() {
        return this.f73311j;
    }

    public final int o() {
        return this.f73313l;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@m80.k LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(@m80.k LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        this.f73317p = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@m80.k LifecycleOwner owner) {
        kotlin.jvm.internal.g0.p(owner, "owner");
        C();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStop(lifecycleOwner);
    }

    public final boolean p() {
        return this.f73315n;
    }

    public final boolean q() {
        return this.f73314m;
    }

    public final int r() {
        return this.f73305d.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(@m80.k j00.c<? super kotlin.Result<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mj.i0.c
            if (r0 == 0) goto L13
            r0 = r7
            mj.i0$c r0 = (mj.i0.c) r0
            int r1 = r0.f73324c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73324c = r1
            goto L18
        L13:
            mj.i0$c r0 = new mj.i0$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73322a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f73324c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.m6317unboximpl()
            return r7
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.e.n(r7)
            ij.q r7 = r6.a()
            long r4 = r6.f73304c
            r0.f73324c = r3
            java.lang.Object r7 = r7.B(r4, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.i0.s(j00.c):java.lang.Object");
    }

    public final void start() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new k(null), 3, null);
    }

    @m80.k
    public final v1 t() {
        return (v1) this.f73318q.getValue();
    }

    public final boolean u() {
        return this.f73316o;
    }

    @m80.k
    public final MutableLiveData<List<Object>> v() {
        return this.f73309h;
    }

    @m80.k
    public final LiveData<kj.a> w() {
        return this.f73307f;
    }

    public final void x(List<ij.z> list, boolean z11) {
        List<Object> arrayList = new ArrayList<>();
        H(list, z11);
        Object obj = " ";
        for (ij.z zVar : list) {
            Object dateString = TimeUtil.getDateString(new Date(zVar.s()));
            if (!kotlin.jvm.internal.g0.g(dateString, obj)) {
                kotlin.jvm.internal.g0.m(dateString);
                arrayList.add(dateString);
                obj = dateString;
            }
            arrayList.add(zVar);
        }
        Q(arrayList);
        this.f73308g.postValue(arrayList);
    }

    public final void y(@m80.k List<ij.z> newWords, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(newWords, "newWords");
        qb.c.b(f73299t, "order by Letter, isReverse:" + z11 + " start", new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(newWords);
        if (z11) {
            if (arrayList.size() > 1) {
                a00.l0.r0(arrayList, new e());
            }
        } else if (arrayList.size() > 1) {
            a00.l0.r0(arrayList, new d());
        }
        if (arrayList.size() > 1) {
            qb.c.b(f73299t, "order by letter, first -> " + a00.r0.G2(arrayList) + " \n second -> " + arrayList.get(1) + " \n last second -> " + arrayList.get(arrayList.size() - 2) + " \n last -> " + a00.r0.u3(arrayList), new Object[0]);
        }
        x(arrayList, z12);
        qb.c.b(f73299t, "order by Letter, isReverse:" + z11 + " end", new Object[0]);
    }
}
