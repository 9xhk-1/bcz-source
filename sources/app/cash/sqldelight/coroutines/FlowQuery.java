package app.cash.sqldelight.coroutines;

import c40.r0;
import com.squareup.picasso.h0;
import e40.o;
import j00.c;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import m80.k;
import w00.j;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "FlowQuery")
@u0({"SMAP\nFlowExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExtensions.kt\napp/cash/sqldelight/coroutines/FlowQuery\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,95:1\n49#2:96\n51#2:100\n49#2:101\n51#2:105\n49#2:106\n51#2:110\n56#2:111\n59#2:115\n49#2:116\n51#2:120\n46#3:97\n51#3:99\n46#3:102\n51#3:104\n46#3:107\n51#3:109\n46#3:112\n51#3:114\n46#3:117\n51#3:119\n105#4:98\n105#4:103\n105#4:108\n105#4:113\n105#4:118\n*S KotlinDebug\n*F\n+ 1 FlowExtensions.kt\napp/cash/sqldelight/coroutines/FlowQuery\n*L\n57#1:96\n57#1:100\n66#1:101\n66#1:105\n74#1:106\n74#1:110\n82#1:111\n82#1:115\n90#1:116\n90#1:120\n57#1:97\n57#1:99\n66#1:102\n66#1:104\n74#1:107\n74#1:109\n82#1:112\n82#1:114\n90#1:117\n90#1:119\n57#1:98\n66#1:103\n74#1:108\n82#1:113\n90#1:118\n*E\n"})
/* loaded from: classes3.dex */
public final class FlowQuery {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$asFlow$1", f = "FlowExtensions.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {47, 48}, m = "invokeSuspend", n = {"$this$flow", "channel", "listener", "$this$flow", "channel", "listener", "item"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4"}, v = 1)
    public static final class a<T> extends SuspendLambda implements p<kotlinx.coroutines.flow.j<? super j.j<? extends T>>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f5428a;

        /* renamed from: b, reason: collision with root package name */
        public Object f5429b;

        /* renamed from: c, reason: collision with root package name */
        public Object f5430c;

        /* renamed from: d, reason: collision with root package name */
        public Object f5431d;

        /* renamed from: e, reason: collision with root package name */
        public int f5432e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f5433f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ j.j<T> f5434g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j.j<? extends T> jVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f5434g = jVar;
        }

        public static final void j(o oVar) {
            oVar.m(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f5434g, cVar);
            aVar.f5433f = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
        
            if (r0.emit(r8, r11) == r1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x0023, B:9:0x005f, B:15:0x0079, B:17:0x0081, B:25:0x003f, B:27:0x005b), top: B:2:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a0 -> B:8:0x0026). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f5433f
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.j) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r11.f5432e
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L43
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r2 = r11.f5431d
                yz.g2 r2 = (yz.g2) r2
                java.lang.Object r2 = r11.f5430c
                e40.q r2 = (e40.q) r2
                java.lang.Object r6 = r11.f5429b
                j.j$a r6 = (j.j.a) r6
                java.lang.Object r7 = r11.f5428a
                e40.o r7 = (e40.o) r7
                kotlin.e.n(r12)     // Catch: java.lang.Throwable -> L28
            L26:
                r12 = r7
                goto L5f
            L28:
                r12 = move-exception
                goto Lab
            L2b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L33:
                java.lang.Object r2 = r11.f5430c
                e40.q r2 = (e40.q) r2
                java.lang.Object r6 = r11.f5429b
                j.j$a r6 = (j.j.a) r6
                java.lang.Object r7 = r11.f5428a
                e40.o r7 = (e40.o) r7
                kotlin.e.n(r12)     // Catch: java.lang.Throwable -> L28
                goto L79
            L43:
                kotlin.e.n(r12)
                r12 = -1
                r2 = 6
                e40.o r12 = e40.r.d(r12, r5, r5, r2, r5)
                yz.g2 r2 = yz.g2.f100423a
                r12.m(r2)
                app.cash.sqldelight.coroutines.a r6 = new app.cash.sqldelight.coroutines.a
                r6.<init>()
                j.j<T> r2 = r11.f5434g
                r2.j(r6)
                e40.q r2 = r12.iterator()     // Catch: java.lang.Throwable -> L28
            L5f:
                r11.f5433f = r0     // Catch: java.lang.Throwable -> L28
                java.lang.Object r7 = l00.k.a(r12)     // Catch: java.lang.Throwable -> L28
                r11.f5428a = r7     // Catch: java.lang.Throwable -> L28
                r11.f5429b = r6     // Catch: java.lang.Throwable -> L28
                r11.f5430c = r2     // Catch: java.lang.Throwable -> L28
                r11.f5431d = r5     // Catch: java.lang.Throwable -> L28
                r11.f5432e = r4     // Catch: java.lang.Throwable -> L28
                java.lang.Object r7 = r2.a(r11)     // Catch: java.lang.Throwable -> L28
                if (r7 != r1) goto L76
                goto La2
            L76:
                r10 = r7
                r7 = r12
                r12 = r10
            L79:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L28
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L28
                if (r12 == 0) goto La3
                r2.next()     // Catch: java.lang.Throwable -> L28
                yz.g2 r12 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L28
                j.j<T> r8 = r11.f5434g     // Catch: java.lang.Throwable -> L28
                r11.f5433f = r0     // Catch: java.lang.Throwable -> L28
                java.lang.Object r9 = l00.k.a(r7)     // Catch: java.lang.Throwable -> L28
                r11.f5428a = r9     // Catch: java.lang.Throwable -> L28
                r11.f5429b = r6     // Catch: java.lang.Throwable -> L28
                r11.f5430c = r2     // Catch: java.lang.Throwable -> L28
                java.lang.Object r12 = l00.k.a(r12)     // Catch: java.lang.Throwable -> L28
                r11.f5431d = r12     // Catch: java.lang.Throwable -> L28
                r11.f5432e = r3     // Catch: java.lang.Throwable -> L28
                java.lang.Object r12 = r0.emit(r8, r11)     // Catch: java.lang.Throwable -> L28
                if (r12 != r1) goto L26
            La2:
                return r1
            La3:
                j.j<T> r12 = r11.f5434g
                r12.k(r6)
                yz.g2 r12 = yz.g2.f100423a
                return r12
            Lab:
                j.j<T> r0 = r11.f5434g
                r0.k(r6)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(kotlinx.coroutines.flow.j<? super j.j<? extends T>> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToList$1$1", f = "FlowExtensions.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b<T> extends SuspendLambda implements p<r0, j00.c<? super List<? extends T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5435a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j.j<T> f5436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j.j<? extends T> jVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f5436b = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f5436b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super List<? extends T>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5435a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            j.j<T> jVar = this.f5436b;
            this.f5435a = 1;
            Object c11 = k.e.c(jVar, this);
            return c11 == l11 ? l11 : c11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOne$1$1", f = "FlowExtensions.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5437a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j.j<T> f5438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(j.j<? extends T> jVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f5438b = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f5438b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5437a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            j.j<T> jVar = this.f5438b;
            this.f5437a = 1;
            Object e11 = k.e.e(jVar, this);
            return e11 == l11 ? l11 : e11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$1$1", f = "FlowExtensions.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5439a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j.j<T> f5440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(j.j<? extends T> jVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f5440b = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f5440b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5439a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            j.j<T> jVar = this.f5440b;
            this.f5439a = 1;
            Object f11 = k.e.f(jVar, this);
            return f11 == l11 ? l11 : f11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$1$1", f = "FlowExtensions.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5441a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j.j<T> f5442b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f5443c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(j.j<? extends T> jVar, T t11, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f5442b = jVar;
            this.f5443c = t11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f5442b, this.f5443c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5441a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j.j<T> jVar = this.f5442b;
                this.f5441a = 1;
                obj = k.e.f(jVar, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return obj == null ? this.f5443c : obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$1$1", f = "FlowExtensions.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f<T> extends SuspendLambda implements p<r0, j00.c<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5444a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j.j<T> f5445b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(j.j<? extends T> jVar, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f5445b = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f5445b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super T> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f5444a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            j.j<T> jVar = this.f5445b;
            this.f5444a = 1;
            Object f11 = k.e.f(jVar, this);
            return f11 == l11 ? l11 : f11;
        }
    }

    @k
    public static final <T> i<List<T>> a(@k final i<? extends j.j<? extends T>> iVar, @k final kotlin.coroutines.d context) {
        g0.p(iVar, "<this>");
        g0.p(context, "context");
        return new i<List<? extends T>>() { // from class: app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FlowExtensions.kt\napp/cash/sqldelight/coroutines/FlowQuery\n*L\n1#1,49:1\n50#2:50\n91#3,3:51\n*E\n"})
            /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f5408a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5409b;

                @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2", f = "FlowExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-FlowQuery$mapToList$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, d dVar) {
                    this.f5408a = jVar;
                    this.f5409b = dVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00ce, code lost:
                
                    if (r2.emit(r4, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, j00.c r12) {
                    /*
                        Method dump skipped, instructions count: 212
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, context), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        };
    }

    @k
    public static final <T> i<T> b(@k final i<? extends j.j<? extends T>> iVar, @k final kotlin.coroutines.d context) {
        g0.p(iVar, "<this>");
        g0.p(context, "context");
        return new i<T>() { // from class: app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FlowExtensions.kt\napp/cash/sqldelight/coroutines/FlowQuery\n*L\n1#1,49:1\n50#2:50\n58#3,3:51\n*E\n"})
            /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f5412a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5413b;

                @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1$2", f = "FlowExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-FlowQuery$mapToOne$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, d dVar) {
                    this.f5412a = jVar;
                    this.f5413b = dVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00ce, code lost:
                
                    if (r2.emit(r4, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, j00.c r12) {
                    /*
                        Method dump skipped, instructions count: 212
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, context), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        };
    }

    @k
    public static final <T> i<T> c(@k final i<? extends j.j<? extends T>> iVar, @k final kotlin.coroutines.d context) {
        g0.p(iVar, "<this>");
        g0.p(context, "context");
        return new i<T>() { // from class: app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FlowExtensions.kt\napp/cash/sqldelight/coroutines/FlowQuery\n*L\n1#1,49:1\n57#2:50\n58#2:54\n83#3,3:51\n*E\n"})
            /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f5416a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5417b;

                @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2", f = "FlowExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {51, 54}, m = "emit", n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "$completion", "it", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1", "$i$a$-mapNotNull-FlowQuery$mapToOneNotNull$1", "value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", h0.f41880v, "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 1)
                /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, d dVar) {
                    this.f5416a = jVar;
                    this.f5417b = dVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
                
                    if (r6.emit(r2, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, j00.c r12) {
                    /*
                        r10 = this;
                        boolean r0 = r12 instanceof app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r12
                        app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 r0 = (app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 r0 = new app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1
                        r0.<init>(r12)
                    L18:
                        java.lang.Object r12 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L5e
                        if (r2 == r5) goto L3e
                        if (r2 != r4) goto L36
                        java.lang.Object r11 = r0.L$3
                        kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.j) r11
                        java.lang.Object r11 = r0.L$1
                        app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 r11 = (app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r11
                        kotlin.e.n(r12)
                        goto Lcc
                    L36:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L3e:
                        int r11 = r0.I$0
                        java.lang.Object r2 = r0.L$5
                        j.j r2 = (j.j) r2
                        java.lang.Object r2 = r0.L$4
                        j00.c r2 = (j00.c) r2
                        java.lang.Object r2 = r0.L$3
                        kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
                        java.lang.Object r5 = r0.L$2
                        java.lang.Object r6 = r0.L$1
                        app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 r6 = (app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r6
                        java.lang.Object r7 = r0.L$0
                        kotlin.e.n(r12)
                        r9 = r12
                        r12 = r11
                        r11 = r7
                        r7 = r6
                        r6 = r2
                        r2 = r9
                        goto L9f
                    L5e:
                        kotlin.e.n(r12)
                        kotlinx.coroutines.flow.j r2 = r10.f5416a
                        r12 = r11
                        j.j r12 = (j.j) r12
                        kotlin.coroutines.d r6 = r10.f5417b
                        app.cash.sqldelight.coroutines.FlowQuery$d r7 = new app.cash.sqldelight.coroutines.FlowQuery$d
                        r7.<init>(r12, r3)
                        java.lang.Object r8 = l00.k.a(r11)
                        r0.L$0 = r8
                        java.lang.Object r8 = l00.k.a(r0)
                        r0.L$1 = r8
                        java.lang.Object r8 = l00.k.a(r11)
                        r0.L$2 = r8
                        r0.L$3 = r2
                        java.lang.Object r8 = l00.k.a(r0)
                        r0.L$4 = r8
                        java.lang.Object r12 = l00.k.a(r12)
                        r0.L$5 = r12
                        r12 = 0
                        r0.I$0 = r12
                        r0.I$1 = r12
                        r0.label = r5
                        java.lang.Object r5 = c40.i.h(r6, r7, r0)
                        if (r5 != r1) goto L9b
                        goto Lcb
                    L9b:
                        r7 = r0
                        r6 = r2
                        r2 = r5
                        r5 = r11
                    L9f:
                        if (r2 == 0) goto Lcc
                        java.lang.Object r11 = l00.k.a(r11)
                        r0.L$0 = r11
                        java.lang.Object r11 = l00.k.a(r7)
                        r0.L$1 = r11
                        java.lang.Object r11 = l00.k.a(r5)
                        r0.L$2 = r11
                        java.lang.Object r11 = l00.k.a(r6)
                        r0.L$3 = r11
                        java.lang.Object r11 = l00.k.a(r2)
                        r0.L$4 = r11
                        r0.L$5 = r3
                        r0.I$0 = r12
                        r0.label = r4
                        java.lang.Object r11 = r6.emit(r2, r0)
                        if (r11 != r1) goto Lcc
                    Lcb:
                        return r1
                    Lcc:
                        yz.g2 r11 = yz.g2.f100423a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, context), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        };
    }

    @k
    public static final <T> i<T> d(@k final i<? extends j.j<? extends T>> iVar, @k final T defaultValue, @k final kotlin.coroutines.d context) {
        g0.p(iVar, "<this>");
        g0.p(defaultValue, "defaultValue");
        g0.p(context, "context");
        return new i<T>() { // from class: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FlowExtensions.kt\napp/cash/sqldelight/coroutines/FlowQuery\n*L\n1#1,49:1\n50#2:50\n67#3,3:51\n*E\n"})
            /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f5421a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5422b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Object f5423c;

                @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$$inlined$map$1$2", f = "FlowExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-FlowQuery$mapToOneOrDefault$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, d dVar, Object obj) {
                    this.f5421a = jVar;
                    this.f5422b = dVar;
                    this.f5423c = obj;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00d0, code lost:
                
                    if (r2.emit(r4, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, j00.c r12) {
                    /*
                        Method dump skipped, instructions count: 214
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, context, defaultValue), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        };
    }

    @k
    public static final <T> i<T> e(@k final i<? extends j.j<? extends T>> iVar, @k final kotlin.coroutines.d context) {
        g0.p(iVar, "<this>");
        g0.p(context, "context");
        return new i<T>() { // from class: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FlowExtensions.kt\napp/cash/sqldelight/coroutines/FlowQuery\n*L\n1#1,49:1\n50#2:50\n75#3,3:51\n*E\n"})
            /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f5426a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f5427b;

                @l00.d(c = "app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1$2", f = "FlowExtensions.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$completion", "it", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1", "$i$a$-map-FlowQuery$mapToOneOrNull$1", "value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    Object L$6;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, d dVar) {
                    this.f5426a = jVar;
                    this.f5427b = dVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x00ce, code lost:
                
                    if (r2.emit(r4, r0) != r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, j00.c r12) {
                    /*
                        Method dump skipped, instructions count: 212
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, context), cVar);
                return collect == b.l() ? collect : g2.f100423a;
            }
        };
    }

    @j(name = "toFlow")
    @k
    public static final <T> i<j.j<T>> f(@k j.j<? extends T> jVar) {
        g0.p(jVar, "<this>");
        return kotlinx.coroutines.flow.k.K0(new a(jVar, null));
    }
}
