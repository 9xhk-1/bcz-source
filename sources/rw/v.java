package rw;

import androidx.core.app.NotificationCompat;
import com.tencent.open.SocialConstants;
import cx.w;
import ix.t2;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.slf4j.Logger;
import rw.v;
import sw.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpCallValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCallValidator.kt\nio/ktor/client/plugins/HttpCallValidatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,190:1\n1863#2,2:191\n1863#2,2:193\n18#3:195\n58#4,16:196\n*S KotlinDebug\n*F\n+ 1 HttpCallValidator.kt\nio/ktor/client/plugins/HttpCallValidatorKt\n*L\n94#1:191,2\n99#1:193,2\n183#1:195\n183#1:196,16\n*E\n"})
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84774a = ez.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final sw.b<t> f84775b = sw.i.b("HttpResponseValidator", a.f84777a, new x00.l() { // from class: rw.u
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 b11;
            b11 = v.b((sw.d) obj);
            return b11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final xy.a<Boolean> f84776c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.a<t> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f84777a = new a();

        public a() {
            super(0, t.class, "<init>", "<init>()V", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke() {
            return new t();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", i = {1}, l = {112, 113}, m = "invokeSuspend", n = {NotificationCompat.CATEGORY_CALL}, s = {"L$0"})
    public static final class c extends SuspendLambda implements x00.q<q.a, cx.y, j00.c<? super mw.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84781a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84782b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84783c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<x00.p<ex.c, j00.c<? super g2>, Object>> f84784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends x00.p<? super ex.c, ? super j00.c<? super g2>, ? extends Object>> list, j00.c<? super c> cVar) {
            super(3, cVar);
            this.f84784d = list;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q.a aVar, cx.y yVar, j00.c<? super mw.a> cVar) {
            c cVar2 = new c(this.f84784d, cVar);
            cVar2.f84782b = aVar;
            cVar2.f84783c = yVar;
            return cVar2.invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6 == r0) goto L16;
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
                int r1 = r5.f84781a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.f84782b
                mw.a r0 = (mw.a) r0
                kotlin.e.n(r6)
                return r0
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                kotlin.e.n(r6)
                goto L39
            L22:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.f84782b
                sw.q$a r6 = (sw.q.a) r6
                java.lang.Object r1 = r5.f84783c
                cx.y r1 = (cx.y) r1
                r4 = 0
                r5.f84782b = r4
                r5.f84781a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L39
                goto L4b
            L39:
                mw.a r6 = (mw.a) r6
                java.util.List<x00.p<ex.c, j00.c<? super yz.g2>, java.lang.Object>> r1 = r5.f84784d
                ex.c r3 = r6.i()
                r5.f84782b = r6
                r5.f84781a = r2
                java.lang.Object r1 = rw.v.h(r1, r3, r5)
                if (r1 != r0) goto L4c
            L4b:
                return r0
            L4c:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.v.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3", f = "HttpCallValidator.kt", i = {0}, l = {119}, m = "invokeSuspend", n = {"unwrappedCause"}, s = {"L$0"})
    public static final class d extends SuspendLambda implements x00.q<cx.w, Throwable, j00.c<? super Throwable>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84785a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84786b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84787c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<s> f84788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends s> list, j00.c<? super d> cVar) {
            super(3, cVar);
            this.f84788d = list;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cx.w wVar, Throwable th2, j00.c<? super Throwable> cVar) {
            d dVar = new d(this.f84788d, cVar);
            dVar.f84786b = wVar;
            dVar.f84787c = th2;
            return dVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84785a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f84786b;
                kotlin.e.n(obj);
                return th2;
            }
            kotlin.e.n(obj);
            cx.w wVar = (cx.w) this.f84786b;
            Throwable a11 = fx.i.a((Throwable) this.f84787c);
            List<s> list = this.f84788d;
            this.f84786b = a11;
            this.f84785a = 1;
            return v.c(list, a11, wVar, this) == l11 ? l11 : a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", f = "HttpCallValidator.kt", i = {0}, l = {125}, m = "invokeSuspend", n = {"unwrappedCause"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements x00.q<cx.w, Throwable, j00.c<? super Throwable>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84789a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84790b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84791c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<s> f84792d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends s> list, j00.c<? super e> cVar) {
            super(3, cVar);
            this.f84792d = list;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cx.w wVar, Throwable th2, j00.c<? super Throwable> cVar) {
            e eVar = new e(this.f84792d, cVar);
            eVar.f84790b = wVar;
            eVar.f84791c = th2;
            return eVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84789a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f84790b;
                kotlin.e.n(obj);
                return th2;
            }
            kotlin.e.n(obj);
            cx.w wVar = (cx.w) this.f84790b;
            Throwable a11 = fx.i.a((Throwable) this.f84791c);
            List<s> list = this.f84792d;
            this.f84790b = a11;
            this.f84789a = 1;
            return v.c(list, a11, wVar, this) == l11 ? l11 : a11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {101, 102}, m = "HttpCallValidator$lambda$2$processException", n = {"cause", SocialConstants.TYPE_REQUEST, "cause", SocialConstants.TYPE_REQUEST}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f84793a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84794b;

        /* renamed from: c, reason: collision with root package name */
        public Object f84795c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f84796d;

        /* renamed from: e, reason: collision with root package name */
        public int f84797e;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f84796d = obj;
            this.f84797e |= Integer.MIN_VALUE;
            return v.c(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0}, l = {94}, m = "HttpCallValidator$lambda$2$validateResponse", n = {"response"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f84798a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84799b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84800c;

        /* renamed from: d, reason: collision with root package name */
        public int f84801d;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f84800c = obj;
            this.f84801d |= Integer.MIN_VALUE;
            return v.d(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements cx.w {

        /* renamed from: a, reason: collision with root package name */
        public final ix.e1 f84802a;

        /* renamed from: b, reason: collision with root package name */
        public final t2 f84803b;

        /* renamed from: c, reason: collision with root package name */
        public final xy.b f84804c;

        /* renamed from: d, reason: collision with root package name */
        public final ix.q0 f84805d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ cx.y f84806e;

        public h(cx.y yVar) {
            this.f84806e = yVar;
            this.f84802a = yVar.i();
            this.f84803b = yVar.j().b();
            this.f84804c = yVar.d();
            this.f84805d = yVar.a().build();
        }

        @Override // ix.a1
        public ix.q0 a() {
            return this.f84805d;
        }

        @Override // cx.w
        public mw.a c() {
            throw new IllegalStateException("Call is not initialized");
        }

        @Override // cx.w
        public xy.b getAttributes() {
            return this.f84804c;
        }

        @Override // cx.w, c40.r0
        public kotlin.coroutines.d getCoroutineContext() {
            return w.a.a(this);
        }

        @Override // cx.w
        public ix.e1 getMethod() {
            return this.f84802a;
        }

        @Override // cx.w
        public t2 getUrl() {
            return this.f84803b;
        }

        @Override // cx.w
        public mx.v w() {
            Object e11 = this.f84806e.e();
            mx.v vVar = e11 instanceof mx.v ? (mx.v) e11 : null;
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.f84806e.e()).toString());
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(Boolean.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(Boolean.TYPE);
        } catch (Throwable unused) {
            rVar = null;
        }
        f84776c = new xy.a<>("ExpectSuccessAttributeKey", new gz.a(d11, rVar));
    }

    public static final g2 b(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        List c52 = a00.r0.c5(((t) createClientPlugin.f()).c());
        List c53 = a00.r0.c5(((t) createClientPlugin.f()).b());
        createClientPlugin.g(sw.s.f88985a, new b(((t) createClientPlugin.f()).a(), null));
        createClientPlugin.g(sw.q.f88973a, new c(c52, null));
        createClientPlugin.g(j1.f84687a, new d(c53, null));
        createClientPlugin.g(h1.f84670a, new e(c53, null));
        return g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r10.invoke(r8, r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r6 = r9;
        r9 = r8;
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.List<? extends rw.s> r7, java.lang.Throwable r8, cx.w r9, j00.c<? super yz.g2> r10) {
        /*
            boolean r0 = r10 instanceof rw.v.f
            if (r0 == 0) goto L13
            r0 = r10
            rw.v$f r0 = (rw.v.f) r0
            int r1 = r0.f84797e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84797e = r1
            goto L18
        L13:
            rw.v$f r0 = new rw.v$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f84796d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f84797e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.f84795c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f84794b
            cx.w r8 = (cx.w) r8
            java.lang.Object r9 = r0.f84793a
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.e.n(r10)
            goto L94
        L41:
            kotlin.e.n(r10)
            org.slf4j.Logger r10 = rw.v.f84774a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Processing exception "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            ix.t2 r5 = r9.getUrl()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.trace(r2)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L6c:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lb7
            java.lang.Object r10 = r7.next()
            rw.s r10 = (rw.s) r10
            boolean r2 = r10 instanceof rw.r
            if (r2 == 0) goto L98
            rw.r r10 = (rw.r) r10
            x00.p r10 = r10.a()
            r0.f84793a = r8
            r0.f84794b = r9
            r0.f84795c = r7
            r0.f84797e = r4
            java.lang.Object r10 = r10.invoke(r8, r0)
            if (r10 != r1) goto L91
            goto Lb0
        L91:
            r6 = r9
            r9 = r8
            r8 = r6
        L94:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L6c
        L98:
            boolean r2 = r10 instanceof rw.k1
            if (r2 == 0) goto Lb1
            rw.k1 r10 = (rw.k1) r10
            x00.q r10 = r10.a()
            r0.f84793a = r8
            r0.f84794b = r9
            r0.f84795c = r7
            r0.f84797e = r3
            java.lang.Object r10 = r10.invoke(r8, r9, r0)
            if (r10 != r1) goto L91
        Lb0:
            return r1
        Lb1:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        Lb7:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rw.v.c(java.util.List, java.lang.Throwable, cx.w, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(java.util.List<? extends x00.p<? super ex.c, ? super j00.c<? super yz.g2>, ? extends java.lang.Object>> r5, ex.c r6, j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof rw.v.g
            if (r0 == 0) goto L13
            r0 = r7
            rw.v$g r0 = (rw.v.g) r0
            int r1 = r0.f84801d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84801d = r1
            goto L18
        L13:
            rw.v$g r0 = new rw.v$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f84800c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f84801d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f84799b
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f84798a
            ex.c r6 = (ex.c) r6
            kotlin.e.n(r7)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.e.n(r7)
            org.slf4j.Logger r7 = rw.v.f84774a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Validating response for request "
            r2.append(r4)
            mw.a r4 = r6.c()
            cx.w r4 = r4.h()
            ix.t2 r4 = r4.getUrl()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.trace(r2)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r5.next()
            x00.p r7 = (x00.p) r7
            r0.f84798a = r6
            r0.f84799b = r5
            r0.f84801d = r3
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L64
            return r1
        L7d:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rw.v.d(java.util.List, ex.c, j00.c):java.lang.Object");
    }

    public static final h e(cx.y yVar) {
        return new h(yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(@m80.k lw.j<?> jVar, @m80.k x00.l<? super t, g2> block) {
        kotlin.jvm.internal.g0.p(jVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        jVar.s(f84775b, block);
    }

    public static final boolean j(@m80.k cx.y yVar) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        Boolean bool = (Boolean) yVar.d().a(f84776c);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @m80.k
    public static final xy.a<Boolean> k() {
        return f84776c;
    }

    @m80.k
    public static final sw.b<t> l() {
        return f84775b;
    }

    public static final void m(@m80.k cx.y yVar, boolean z11) {
        kotlin.jvm.internal.g0.p(yVar, "<this>");
        yVar.d().e(f84776c, Boolean.valueOf(z11));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<cx.y, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84778a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84779b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f84780c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f84780c = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f84780c, cVar);
            bVar.f84779b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f84778a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            xy.b d11 = ((cx.y) this.f84779b).d();
            xy.a<Boolean> k11 = v.k();
            final boolean z11 = this.f84780c;
            d11.i(k11, new x00.a() { // from class: rw.w
                @Override // x00.a
                public final Object invoke() {
                    boolean k12;
                    k12 = v.b.k(z11);
                    return Boolean.valueOf(k12);
                }
            });
            return g2.f100423a;
        }

        @Override // x00.p
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cx.y yVar, j00.c<? super g2> cVar) {
            return ((b) create(yVar, cVar)).invokeSuspend(g2.f100423a);
        }

        public static final boolean k(boolean z11) {
            return z11;
        }
    }
}
