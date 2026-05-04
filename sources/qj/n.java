package qj;

import a00.i0;
import a00.k1;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import c40.r0;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.online.user_activity_api.ExportActivityInfo;
import com.baicizhan.online.user_activity_api.ExportParam;
import com.baicizhan.online.user_activity_api.ExportQuota;
import com.baicizhan.online.user_activity_api.ExportTemplateInfo;
import com.baicizhan.online.user_activity_api.ExportWord;
import ij.q;
import ij.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import ma.t;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nExportTemplateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportTemplateViewModel.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n1056#2:205\n1056#2:206\n1068#2:207\n1068#2:208\n1563#2:209\n1634#2,3:210\n*S KotlinDebug\n*F\n+ 1 ExportTemplateViewModel.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateViewModel\n*L\n125#1:205\n130#1:206\n135#1:207\n140#1:208\n144#1:209\n144#1:210,3\n*E\n"})
/* loaded from: classes5.dex */
public final class n extends AndroidViewModel implements DefaultLifecycleObserver {

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final a f82275o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f82276p = 8;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final String f82277q = "ExportTemplateViewModel";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q f82278a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82279b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<ExportActivityInfo> f82280c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final LiveData<ExportActivityInfo> f82281d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f82282e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f82283f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f82284g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final LiveData<Integer> f82285h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent<Boolean> f82286i;

    /* renamed from: j, reason: collision with root package name */
    public List<? extends ExportWord> f82287j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public String f82288k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public List<ExportTemplateInfo> f82289l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f82290m;

    /* renamed from: n, reason: collision with root package name */
    public int f82291n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$buyAndExport$1", f = "ExportTemplateViewModel.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f82292a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f82294c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f82294c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return n.this.new b(this.f82294c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object b11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f82292a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                o oVar = new o();
                this.f82292a = 1;
                b11 = oVar.b(this);
                if (b11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                b11 = ((Result) obj).m6317unboximpl();
            }
            n nVar = n.this;
            int i12 = this.f82294c;
            if (Result.m6315isSuccessimpl(b11)) {
                ExportQuota exportQuota = (ExportQuota) b11;
                if (exportQuota.balance < 1) {
                    nVar.f82282e.setValue(l00.a.a(false));
                    KotlinExtKt.showToast("铜板余额不足");
                } else {
                    nVar.f82284g.setValue(l00.a.f(exportQuota.balance));
                    nVar.z(i12);
                }
            }
            n nVar2 = n.this;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(b11);
            if (m6311exceptionOrNullimpl != null) {
                nVar2.f82282e.setValue(l00.a.a(false));
                KotlinExtKt.showToast("铜板余额不足");
                qb.c.c(n.f82277q, "buyExportQuota error", m6311exceptionOrNullimpl);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExportTemplateViewModel.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateViewModel\n*L\n1#1,328:1\n126#2:329\n*E\n"})
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((z) t11).s()), Long.valueOf(((z) t12).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ExportTemplateViewModel.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateViewModel\n*L\n1#1,328:1\n131#2:329\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String z11 = ((z) t11).z();
            Locale locale = Locale.ROOT;
            String lowerCase = z11.toLowerCase(locale);
            g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((z) t12).z().toLowerCase(locale);
            g0.o(lowerCase2, "toLowerCase(...)");
            return e00.g.l(lowerCase, lowerCase2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ExportTemplateViewModel.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateViewModel\n*L\n1#1,328:1\n136#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            String z11 = ((z) t12).z();
            Locale locale = Locale.ROOT;
            String lowerCase = z11.toLowerCase(locale);
            g0.o(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((z) t11).z().toLowerCase(locale);
            g0.o(lowerCase2, "toLowerCase(...)");
            return e00.g.l(lowerCase, lowerCase2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 ExportTemplateViewModel.kt\ncom/baicizhan/main/word_book/pdf/ExportTemplateViewModel\n*L\n1#1,328:1\n141#2:329\n*E\n"})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((z) t12).s()), Long.valueOf(((z) t11).s()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$refresh$1", f = "ExportTemplateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f82295a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f82296b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$refresh$1$1", f = "ExportTemplateViewModel.kt", i = {}, l = {72, 86}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f82298a;

            /* renamed from: b, reason: collision with root package name */
            public int f82299b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f82300c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$refresh$1$1$1", f = "ExportTemplateViewModel.kt", i = {0, 1, 1, 1}, l = {66, 68}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "it", "$i$a$-onSuccess-ExportTemplateViewModel$refresh$1$1$1$1"}, s = {"L$0", "L$0", "L$2", "I$0"}, v = 1)
            /* renamed from: qj.n$g$a$a, reason: collision with other inner class name */
            public static final class C1021a extends SuspendLambda implements x00.p<kotlinx.coroutines.flow.j<? super List<? extends z>>, j00.c<? super g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public Object f82301a;

                /* renamed from: b, reason: collision with root package name */
                public Object f82302b;

                /* renamed from: c, reason: collision with root package name */
                public int f82303c;

                /* renamed from: d, reason: collision with root package name */
                public int f82304d;

                /* renamed from: e, reason: collision with root package name */
                public /* synthetic */ Object f82305e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ n f82306f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1021a(n nVar, j00.c<? super C1021a> cVar) {
                    super(2, cVar);
                    this.f82306f = nVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    C1021a c1021a = new C1021a(this.f82306f, cVar);
                    c1021a.f82305e = obj;
                    return c1021a;
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.flow.j<? super List<? extends z>> jVar, j00.c<? super g2> cVar) {
                    return invoke2((kotlinx.coroutines.flow.j<? super List<z>>) jVar, cVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
                
                    if (r13 == r1) goto L17;
                 */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = r12.f82305e
                        kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r12.f82304d
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L30
                        if (r2 == r4) goto L25
                        if (r2 != r3) goto L1d
                        java.lang.Object r0 = r12.f82302b
                        java.util.List r0 = (java.util.List) r0
                        java.lang.Object r0 = r12.f82301a
                        kotlin.e.n(r13)
                        r9 = r12
                        goto L72
                    L1d:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L25:
                        kotlin.e.n(r13)
                        kotlin.Result r13 = (kotlin.Result) r13
                        java.lang.Object r13 = r13.m6317unboximpl()
                        r9 = r12
                        goto L4e
                    L30:
                        kotlin.e.n(r13)
                        qj.n r13 = r12.f82306f
                        ij.q r5 = r13.q()
                        qj.n r13 = r12.f82306f
                        long r6 = r13.k()
                        r12.f82305e = r0
                        r12.f82304d = r4
                        r8 = 0
                        r10 = 2
                        r11 = 0
                        r9 = r12
                        java.lang.Object r13 = ij.q.E(r5, r6, r8, r9, r10, r11)
                        if (r13 != r1) goto L4e
                        goto L70
                    L4e:
                        boolean r2 = kotlin.Result.m6315isSuccessimpl(r13)
                        if (r2 == 0) goto L73
                        r2 = r13
                        java.util.List r2 = (java.util.List) r2
                        java.lang.Object r4 = l00.k.a(r0)
                        r9.f82305e = r4
                        r9.f82301a = r13
                        java.lang.Object r4 = l00.k.a(r2)
                        r9.f82302b = r4
                        r4 = 0
                        r9.f82303c = r4
                        r9.f82304d = r3
                        java.lang.Object r0 = r0.emit(r2, r12)
                        if (r0 != r1) goto L71
                    L70:
                        return r1
                    L71:
                        r0 = r13
                    L72:
                        r13 = r0
                    L73:
                        java.lang.Throwable r13 = kotlin.Result.m6311exceptionOrNullimpl(r13)
                        if (r13 == 0) goto L80
                        java.lang.String r0 = "ExportTemplateViewModel"
                        java.lang.String r1 = "get words error"
                        qb.c.c(r0, r1, r13)
                    L80:
                        yz.g2 r13 = yz.g2.f100423a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: qj.n.g.a.C1021a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(kotlinx.coroutines.flow.j<? super List<z>> jVar, j00.c<? super g2> cVar) {
                    return ((C1021a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$refresh$1$1$2", f = "ExportTemplateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            public static final class b extends SuspendLambda implements x00.q<List<? extends z>, ExportActivityInfo, j00.c<? super g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f82307a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f82308b;

                /* renamed from: c, reason: collision with root package name */
                public /* synthetic */ Object f82309c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ n f82310d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(n nVar, j00.c<? super b> cVar) {
                    super(3, cVar);
                    this.f82310d = nVar;
                }

                @Override // x00.q
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List<z> list, ExportActivityInfo exportActivityInfo, j00.c<? super g2> cVar) {
                    b bVar = new b(this.f82310d, cVar);
                    bVar.f82308b = list;
                    bVar.f82309c = exportActivityInfo;
                    return bVar.invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    List list = (List) this.f82308b;
                    ExportActivityInfo exportActivityInfo = (ExportActivityInfo) this.f82309c;
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f82307a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    qb.c.b(n.f82277q, "word and exportInfo zip", new Object[0]);
                    this.f82310d.f82282e.postValue(l00.a.a(false));
                    this.f82310d.f82284g.setValue(l00.a.f(exportActivityInfo.balance));
                    this.f82310d.f82280c.postValue(exportActivityInfo);
                    List<ExportTemplateInfo> p11 = this.f82310d.p();
                    List<ExportTemplateInfo> template_infos = exportActivityInfo.template_infos;
                    g0.o(template_infos, "template_infos");
                    p11.addAll(template_infos);
                    n nVar = this.f82310d;
                    String activity_url = exportActivityInfo.activity_url;
                    g0.o(activity_url, "activity_url");
                    nVar.v(activity_url);
                    this.f82310d.r(list);
                    return g2.f100423a;
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$refresh$1$1$3", f = "ExportTemplateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            public static final class c extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super g2>, Throwable, j00.c<? super g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f82311a;

                /* renamed from: b, reason: collision with root package name */
                public /* synthetic */ Object f82312b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ n f82313c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(n nVar, j00.c<? super c> cVar) {
                    super(3, cVar);
                    this.f82313c = nVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Throwable th2 = (Throwable) this.f82312b;
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f82311a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    qb.c.c(n.f82277q, "getExportInfo error", th2);
                    this.f82313c.f82280c.postValue(null);
                    this.f82313c.f82282e.postValue(l00.a.a(false));
                    return g2.f100423a;
                }

                @Override // x00.q
                public final Object invoke(kotlinx.coroutines.flow.j<? super g2> jVar, Throwable th2, j00.c<? super g2> cVar) {
                    c cVar2 = new c(this.f82313c, cVar);
                    cVar2.f82312b = th2;
                    return cVar2.invokeSuspend(g2.f100423a);
                }
            }

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public static final class d<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public static final d<T> f82314a = new d<>();

                @Override // kotlinx.coroutines.flow.j
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(g2 g2Var, j00.c<? super g2> cVar) {
                    qb.c.b(n.f82277q, "collect", new Object[0]);
                    return g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f82300c = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f82300c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
            
                if (r7.collect(r1, r6) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
            
                if (r7 == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r6.f82299b
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L23
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.e.n(r7)
                    goto L66
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    java.lang.Object r1 = r6.f82298a
                    kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
                    kotlin.e.n(r7)
                    goto L41
                L23:
                    kotlin.e.n(r7)
                    qj.n$g$a$a r7 = new qj.n$g$a$a
                    qj.n r1 = r6.f82300c
                    r7.<init>(r1, r4)
                    kotlinx.coroutines.flow.i r1 = kotlinx.coroutines.flow.k.K0(r7)
                    qj.o r7 = new qj.o
                    r7.<init>()
                    r6.f82298a = r1
                    r6.f82299b = r3
                    java.lang.Object r7 = r7.c(r6)
                    if (r7 != r0) goto L41
                    goto L65
                L41:
                    kotlinx.coroutines.flow.i r7 = (kotlinx.coroutines.flow.i) r7
                    qj.n$g$a$b r3 = new qj.n$g$a$b
                    qj.n r5 = r6.f82300c
                    r3.<init>(r5, r4)
                    kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.k.j2(r1, r7, r3)
                    qj.n$g$a$c r1 = new qj.n$g$a$c
                    qj.n r3 = r6.f82300c
                    r1.<init>(r3, r4)
                    kotlinx.coroutines.flow.i r7 = kotlinx.coroutines.flow.k.v(r7, r1)
                    qj.n$g$a$d<T> r1 = qj.n.g.a.d.f82314a
                    r6.f82298a = r4
                    r6.f82299b = r2
                    java.lang.Object r7 = r7.collect(r1, r6)
                    if (r7 != r0) goto L66
                L65:
                    return r0
                L66:
                    yz.g2 r7 = yz.g2.f100423a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: qj.n.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public g(j00.c<? super g> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = n.this.new g(cVar);
            gVar.f82296b = obj;
            return gVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r0 r0Var = (r0) this.f82296b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f82295a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            c40.k.f(r0Var, null, null, new a(n.this, null), 3, null);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$refreshBalance$1", f = "ExportTemplateViewModel.kt", i = {}, l = {96, 101}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f82315a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$refreshBalance$1$1", f = "ExportTemplateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.q<kotlinx.coroutines.flow.j<? super ExportActivityInfo>, Throwable, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f82317a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f82318b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f82319c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n nVar, j00.c<? super a> cVar) {
                super(3, cVar);
                this.f82319c = nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Throwable th2 = (Throwable) this.f82318b;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f82317a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                qb.c.c(n.f82277q, "refreshBalance error", th2);
                this.f82319c.f82282e.postValue(l00.a.a(false));
                return g2.f100423a;
            }

            @Override // x00.q
            public final Object invoke(kotlinx.coroutines.flow.j<? super ExportActivityInfo> jVar, Throwable th2, j00.c<? super g2> cVar) {
                a aVar = new a(this.f82319c, cVar);
                aVar.f82318b = th2;
                return aVar.invokeSuspend(g2.f100423a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f82320a;

            public b(n nVar) {
                this.f82320a = nVar;
            }

            @Override // kotlinx.coroutines.flow.j
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ExportActivityInfo exportActivityInfo, j00.c<? super g2> cVar) {
                this.f82320a.f82282e.postValue(l00.a.a(false));
                this.f82320a.f82284g.setValue(l00.a.f(exportActivityInfo.balance));
                return g2.f100423a;
            }
        }

        public h(j00.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return n.this.new h(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        
            if (r6.collect(r1, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f82315a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L5a
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L3c
            L1e:
                kotlin.e.n(r6)
                qj.n r6 = qj.n.this
                androidx.lifecycle.MutableLiveData r6 = qj.n.c(r6)
                java.lang.Boolean r1 = l00.a.a(r3)
                r6.setValue(r1)
                qj.o r6 = new qj.o
                r6.<init>()
                r5.f82315a = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L59
            L3c:
                kotlinx.coroutines.flow.i r6 = (kotlinx.coroutines.flow.i) r6
                qj.n$h$a r1 = new qj.n$h$a
                qj.n r3 = qj.n.this
                r4 = 0
                r1.<init>(r3, r4)
                kotlinx.coroutines.flow.i r6 = kotlinx.coroutines.flow.k.v(r6, r1)
                qj.n$h$b r1 = new qj.n$h$b
                qj.n r3 = qj.n.this
                r1.<init>(r3)
                r5.f82315a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L5a
            L59:
                return r0
            L5a:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qj.n.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.pdf.ExportTemplateViewModel$tryExport$1", f = "ExportTemplateViewModel.kt", i = {0}, l = {188}, m = "invokeSuspend", n = {"exportParams"}, s = {"L$0"}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f82321a;

        /* renamed from: b, reason: collision with root package name */
        public int f82322b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f82323c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f82324d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i11, n nVar, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f82323c = i11;
            this.f82324d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new i(this.f82323c, this.f82324d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f82322b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ExportParam exportParam = new ExportParam();
                int i12 = this.f82323c;
                n nVar = this.f82324d;
                exportParam.setTemplate_id(i12);
                exportParam.setUser_book_id(nVar.k());
                List<ExportWord> list = nVar.f82287j;
                if (list == null) {
                    g0.S("exportWordList");
                    list = null;
                }
                exportParam.setWords(list);
                o oVar = new o();
                this.f82321a = l00.k.a(exportParam);
                this.f82322b = 1;
                a11 = oVar.a(exportParam, this);
                if (a11 == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                a11 = ((Result) obj).m6317unboximpl();
            }
            n nVar2 = this.f82324d;
            if (Result.m6315isSuccessimpl(a11)) {
                nVar2.f82282e.setValue(l00.a.a(false));
                nVar2.l().call();
            }
            n nVar3 = this.f82324d;
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(a11);
            if (m6311exceptionOrNullimpl != null) {
                nVar3.f82282e.setValue(l00.a.a(false));
                KotlinExtKt.showToast(m6311exceptionOrNullimpl);
                qb.c.c(n.f82277q, "doExport error", m6311exceptionOrNullimpl);
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k Application application, @m80.k q wordBookManager, long j11) {
        super(application);
        g0.p(application, "application");
        g0.p(wordBookManager, "wordBookManager");
        this.f82278a = wordBookManager;
        this.f82279b = j11;
        MutableLiveData<ExportActivityInfo> mutableLiveData = new MutableLiveData<>();
        this.f82280c = mutableLiveData;
        this.f82281d = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f82282e = mutableLiveData2;
        this.f82283f = mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3 = new MutableLiveData<>();
        this.f82284g = mutableLiveData3;
        this.f82285h = mutableLiveData3;
        this.f82286i = new ClickProtectedEvent<>();
        this.f82288k = "";
        this.f82289l = new ArrayList();
        this.f82291n = 2;
    }

    private final void s() {
        this.f82282e.setValue(Boolean.TRUE);
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new g(null), 3, null);
    }

    public final void g(int i11) {
        this.f82282e.setValue(Boolean.TRUE);
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new b(i11, null), 3, null);
    }

    @m80.k
    public final String h() {
        return this.f82288k;
    }

    @m80.k
    public final LiveData<Integer> i() {
        return this.f82285h;
    }

    public final int j() {
        Integer value = this.f82285h.getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    public final long k() {
        return this.f82279b;
    }

    @m80.k
    public final ClickProtectedEvent<Boolean> l() {
        return this.f82286i;
    }

    @m80.k
    public final LiveData<Boolean> m() {
        return this.f82283f;
    }

    public final int n() {
        return this.f82291n;
    }

    @m80.k
    public final LiveData<ExportActivityInfo> o() {
        return this.f82281d;
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
        g0.p(owner, "owner");
        super.onPause(owner);
        this.f82290m = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@m80.k LifecycleOwner owner) {
        g0.p(owner, "owner");
        super.onResume(owner);
        if (this.f82290m) {
            t();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStart(lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(@m80.k LifecycleOwner lifecycleOwner) {
        super.onStop(lifecycleOwner);
    }

    @m80.k
    public final List<ExportTemplateInfo> p() {
        return this.f82289l;
    }

    @m80.k
    public final q q() {
        return this.f82278a;
    }

    public final void r(List<z> list) {
        int i11 = this.f82291n;
        List<z> z52 = i11 != 1 ? i11 != 3 ? i11 != 4 ? a00.r0.z5(list, new f()) : a00.r0.z5(list, new e()) : a00.r0.z5(list, new d()) : a00.r0.z5(list, new c());
        ArrayList arrayList = new ArrayList(i0.d0(z52, 10));
        for (z zVar : z52) {
            arrayList.add(new ExportWord(zVar.x(), zVar.r()));
        }
        this.f82287j = arrayList;
    }

    public final void t() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
    }

    public final void u() {
        s();
    }

    public final void v(@m80.k String str) {
        g0.p(str, "<set-?>");
        this.f82288k = str;
    }

    public final void w(int i11) {
        this.f82291n = i11;
    }

    public final void x(@m80.k List<ExportTemplateInfo> list) {
        g0.p(list, "<set-?>");
        this.f82289l = list;
    }

    public final void y(int i11) {
        this.f82291n = i11;
        s();
    }

    public final void z(int i11) {
        this.f82282e.setValue(Boolean.TRUE);
        if (i11 >= this.f82289l.size()) {
            return;
        }
        int i12 = this.f82289l.get(i11).t_id;
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new i(i12, this, null), 3, null);
        ma.l.e(t.f73012k, ma.a.S4, k1.k(h1.a("pdf_style", Integer.valueOf(i12))));
    }
}
