package rw;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDefaultResponseValidation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultResponseValidation.kt\nio/ktor/client/plugins/DefaultResponseValidationKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,114:1\n18#2:115\n58#3,16:116\n*S KotlinDebug\n*F\n+ 1 DefaultResponseValidation.kt\nio/ktor/client/plugins/DefaultResponseValidationKt\n*L\n16#1:115\n16#1:116,16\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<g2> f84691a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Logger f84692b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f84693c = "<no response text provided>";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f84694d = "<body failed decoding>";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f84695e = "Please, provide response text in constructor";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {40, 46}, m = "invokeSuspend", n = {"response", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "response", "exceptionResponse", HiAnalyticsConstant.HaKey.BI_KEY_RESULT}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
    public static final class a extends SuspendLambda implements x00.p<ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f84696a;

        /* renamed from: b, reason: collision with root package name */
        public int f84697b;

        /* renamed from: c, reason: collision with root package name */
        public int f84698c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f84699d;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(cVar);
            aVar.f84699d = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ex.c cVar, j00.c<? super g2> cVar2) {
            return ((a) create(cVar, cVar2)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(8:5|6|7|8|9|(2:16|(1:(1:24)(1:23))(1:19))(1:12)|13|14)(2:28|29))(1:30))(2:39|(2:41|42)(2:43|(2:50|51)(3:47|(1:49)|35)))|31|32|33|(10:36|8|9|(0)|16|(0)|(1:21)|24|13|14)|35|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
        
            r0 = r1;
            r3 = r5;
            r1 = r11;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00d9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00e6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(g2.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(g2.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f84691a = new xy.a<>("ValidateMark", new gz.a(d11, rVar));
        f84692b = ez.a.a("io.ktor.client.plugins.DefaultResponseValidation");
    }

    public static final void d(@m80.k final lw.j<?> jVar) {
        kotlin.jvm.internal.g0.p(jVar, "<this>");
        v.f(jVar, new x00.l() { // from class: rw.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e11;
                e11 = k.e(lw.j.this, (t) obj);
                return e11;
            }
        });
    }

    public static final g2 e(lw.j jVar, t HttpResponseValidator) {
        kotlin.jvm.internal.g0.p(HttpResponseValidator, "$this$HttpResponseValidator");
        HttpResponseValidator.f(jVar.n());
        HttpResponseValidator.g(new a(null));
        return g2.f100423a;
    }
}
