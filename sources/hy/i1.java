package hy;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.open.SocialConstants;
import cy.h;
import hy.f;
import io.ktor.http.CacheControl;
import io.ktor.server.http.content.CompressedFileType;
import io.ktor.server.routing.RoutingBuilderKt;
import io.ktor.server.routing.g0;
import java.io.File;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStaticContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticContent.kt\nio/ktor/server/http/content/StaticContentKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 5 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n1#1,734:1\n37#2,2:735\n25#3:737\n26#3:754\n25#3:755\n26#3:772\n58#4,16:738\n58#4,16:756\n58#4,16:774\n58#4,16:791\n58#4,16:808\n18#5:773\n18#5:790\n18#5:807\n*S KotlinDebug\n*F\n+ 1 StaticContent.kt\nio/ktor/server/http/content/StaticContentKt\n*L\n363#1:735,2\n580#1:737\n580#1:754\n623#1:755\n623#1:772\n580#1:738,16\n623#1:756,16\n26#1:774,16\n30#1:791,16\n464#1:808,16\n26#1:773\n30#1:790\n464#1:807\n*E\n"})
/* loaded from: classes8.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<String> f59839a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f59840b = "static-content-path-parameter";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final xy.a<File> f59841c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final zx.r0<g2> f59842d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final xy.a<String> f59843e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$StaticContentAutoHead$1$1", f = "StaticContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.r<h.a, zx.b, mx.v, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59844a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59845b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f59846c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f59847d;

        public a(j00.c<? super a> cVar) {
            super(4, cVar);
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h.a aVar, zx.b bVar, mx.v vVar, j00.c<? super g2> cVar) {
            a aVar2 = new a(cVar);
            aVar2.f59845b = aVar;
            aVar2.f59846c = bVar;
            aVar2.f59847d = vVar;
            return aVar2.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f59844a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            h.a aVar = (h.a) this.f59845b;
            zx.b bVar = (zx.b) this.f59846c;
            mx.v vVar = (mx.v) this.f59847d;
            if (!kotlin.jvm.internal.g0.g(bVar.f().h().getMethod(), ix.e1.f62753b.d())) {
                throw new IllegalStateException("Check failed.");
            }
            if (vVar instanceof v.e) {
                ((v.e) vVar).m().a(null);
            }
            aVar.a(new b(vVar));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends v.c {

        /* renamed from: b, reason: collision with root package name */
        public final mx.v f59848b;

        public b(mx.v original) {
            kotlin.jvm.internal.g0.p(original, "original");
            this.f59848b = original;
        }

        @Override // mx.v
        public Long a() {
            return this.f59848b.a();
        }

        @Override // mx.v
        public ix.k b() {
            return this.f59848b.b();
        }

        @Override // mx.v
        public ix.q0 d() {
            return this.f59848b.d();
        }

        @Override // mx.v
        public <T> T e(xy.a<T> key) {
            kotlin.jvm.internal.g0.p(key, "key");
            return (T) this.f59848b.e(key);
        }

        @Override // mx.v
        public ix.g1 h() {
            return this.f59848b.h();
        }

        @Override // mx.v
        public <T> void i(xy.a<T> key, T t11) {
            kotlin.jvm.internal.g0.p(key, "key");
            this.f59848b.i(key, t11);
        }

        public final mx.v m() {
            return this.f59848b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$default$1", f = "StaticContent.kt", i = {}, l = {419}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59849a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59850b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f59851c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59852d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(File file, List<? extends CompressedFileType> list, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f59851c = file;
            this.f59852d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f59851c, this.f59852d, cVar);
            cVar2.f59850b = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((c) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59849a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.b1 a11 = ((io.ktor.server.routing.c1) this.f59850b).a();
                File file = this.f59851c;
                List<CompressedFileType> list = this.f59852d;
                this.f59849a = 1;
                if (c0.t(a11, file, list, null, null, null, this, 28, null) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$defaultResource$1", f = "StaticContent.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59853a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59854b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f59855c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f59856d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59857e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, List<? extends CompressedFileType> list, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f59855c = str;
            this.f59856d = str2;
            this.f59857e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f59855c, this.f59856d, this.f59857e, cVar);
            dVar.f59854b = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((d) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59853a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.b1 a11 = ((io.ktor.server.routing.c1) this.f59854b).a();
                String str = this.f59855c;
                String str2 = this.f59856d;
                List<CompressedFileType> list = this.f59857e;
                this.f59853a = 1;
                if (c0.B(a11, str, str2, list, null, null, null, null, this, 120, null) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$file$1", f = "StaticContent.kt", i = {}, l = {439}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59858a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59859b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f59860c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59861d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(File file, List<? extends CompressedFileType> list, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f59860c = file;
            this.f59861d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = new e(this.f59860c, this.f59861d, cVar);
            eVar.f59859b = obj;
            return eVar;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((e) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59858a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.b1 a11 = ((io.ktor.server.routing.c1) this.f59859b).a();
                File file = this.f59860c;
                List<CompressedFileType> list = this.f59861d;
                this.f59858a = 1;
                if (c0.t(a11, file, list, null, null, null, this, 28, null) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$files$1", f = "StaticContent.kt", i = {}, l = {com.alipay.sdk.m.u.n.f11119i}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59862a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59863b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f59864c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(File file, List<? extends CompressedFileType> list, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f59864c = file;
            this.f59865d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            f fVar = new f(this.f59864c, this.f59865d, cVar);
            fVar.f59863b = obj;
            return fVar;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((f) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59862a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.c1 c1Var = (io.ktor.server.routing.c1) this.f59863b;
                List<String> a11 = c1Var.a().getParameters().a(i1.f59840b);
                if (a11 != null) {
                    String separator = File.separator;
                    kotlin.jvm.internal.g0.o(separator, "separator");
                    String r32 = a00.r0.r3(a11, separator, null, null, 0, null, null, 62, null);
                    if (r32 != null) {
                        File b11 = xy.n1.b(this.f59864c, r32);
                        io.ktor.server.routing.b1 a12 = c1Var.a();
                        List<CompressedFileType> list = this.f59865d;
                        this.f59862a = 1;
                        if (c0.t(a12, b11, list, null, null, null, this, 28, null) == l11) {
                            return l11;
                        }
                    }
                }
                return g2.f100423a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$resource$1", f = "StaticContent.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59866a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59867b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f59868c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f59869d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59870e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, String str2, List<? extends CompressedFileType> list, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f59868c = str;
            this.f59869d = str2;
            this.f59870e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = new g(this.f59868c, this.f59869d, this.f59870e, cVar);
            gVar.f59867b = obj;
            return gVar;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((g) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59866a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.b1 a11 = ((io.ktor.server.routing.c1) this.f59867b).a();
                String str = this.f59868c;
                String str2 = this.f59869d;
                List<CompressedFileType> list = this.f59870e;
                this.f59866a = 1;
                if (c0.B(a11, str, str2, list, null, null, null, null, this, 120, null) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$resources$1", f = "StaticContent.kt", i = {}, l = {com.badlogic.gdx.graphics.f.f11590g2}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59871a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59872b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f59873c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59874d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, List<? extends CompressedFileType> list, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f59873c = str;
            this.f59874d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            h hVar = new h(this.f59873c, this.f59874d, cVar);
            hVar.f59872b = obj;
            return hVar;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((h) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59871a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.c1 c1Var = (io.ktor.server.routing.c1) this.f59872b;
                List<String> a11 = c1Var.a().getParameters().a(i1.f59840b);
                if (a11 != null) {
                    String separator = File.separator;
                    kotlin.jvm.internal.g0.o(separator, "separator");
                    String r32 = a00.r0.r3(a11, separator, null, null, 0, null, null, 62, null);
                    if (r32 != null) {
                        io.ktor.server.routing.b1 a12 = c1Var.a();
                        String str = this.f59873c;
                        List<CompressedFileType> list = this.f59874d;
                        this.f59871a = 1;
                        if (c0.B(a12, r32, str, list, null, null, null, null, this, 120, null) == l11) {
                            return l11;
                        }
                    }
                }
                return g2.f100423a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {586, 588, 590, 594, 595, TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE}, m = "respondStaticFile", n = {"$this$respondStaticFile", "dir", "compressedTypes", "contentType", "cacheControl", "modify", "defaultPath", "$this$respondStaticFile", "dir", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "extensions", "defaultPath", "requestedFile", "$this$respondStaticFile", "dir", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "extensions", "defaultPath", "requestedFile", "$this$respondStaticFile", "dir", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "defaultPath", "requestedFile", "fileWithExtension", "$this$respondStaticFile", "dir", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "defaultPath", "requestedFile"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f59875a;

        /* renamed from: b, reason: collision with root package name */
        public Object f59876b;

        /* renamed from: c, reason: collision with root package name */
        public Object f59877c;

        /* renamed from: d, reason: collision with root package name */
        public Object f59878d;

        /* renamed from: e, reason: collision with root package name */
        public Object f59879e;

        /* renamed from: f, reason: collision with root package name */
        public Object f59880f;

        /* renamed from: g, reason: collision with root package name */
        public Object f59881g;

        /* renamed from: h, reason: collision with root package name */
        public Object f59882h;

        /* renamed from: i, reason: collision with root package name */
        public Object f59883i;

        /* renamed from: j, reason: collision with root package name */
        public Object f59884j;

        /* renamed from: k, reason: collision with root package name */
        public Object f59885k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f59886l;

        /* renamed from: m, reason: collision with root package name */
        public int f59887m;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59886l = obj;
            this.f59887m |= Integer.MIN_VALUE;
            return i1.M(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", i = {}, l = {735}, m = "respondStaticFile$checkExclude", n = {}, s = {})
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f59888a;

        /* renamed from: b, reason: collision with root package name */
        public int f59889b;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59888a = obj;
            this.f59889b |= Integer.MIN_VALUE;
            return i1.N(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {629, 631, 633, 637, 638, 645}, m = "respondStaticPath", n = {"$this$respondStaticPath", "fileSystem", "basePath", "compressedTypes", "contentType", "cacheControl", "modify", "defaultPath", "$this$respondStaticPath", "fileSystem", "basePath", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "extensions", "defaultPath", "requestedPath", "$this$respondStaticPath", "fileSystem", "basePath", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "extensions", "defaultPath", "requestedPath", "$this$respondStaticPath", "fileSystem", "basePath", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "defaultPath", "requestedPath", "pathWithExtension", "$this$respondStaticPath", "fileSystem", "basePath", "compressedTypes", "contentType", "cacheControl", "modify", SocialConstants.PARAM_EXCLUDE, "defaultPath", "requestedPath"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f59890a;

        /* renamed from: b, reason: collision with root package name */
        public Object f59891b;

        /* renamed from: c, reason: collision with root package name */
        public Object f59892c;

        /* renamed from: d, reason: collision with root package name */
        public Object f59893d;

        /* renamed from: e, reason: collision with root package name */
        public Object f59894e;

        /* renamed from: f, reason: collision with root package name */
        public Object f59895f;

        /* renamed from: g, reason: collision with root package name */
        public Object f59896g;

        /* renamed from: h, reason: collision with root package name */
        public Object f59897h;

        /* renamed from: i, reason: collision with root package name */
        public Object f59898i;

        /* renamed from: j, reason: collision with root package name */
        public Object f59899j;

        /* renamed from: k, reason: collision with root package name */
        public Object f59900k;

        /* renamed from: l, reason: collision with root package name */
        public Object f59901l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f59902m;

        /* renamed from: n, reason: collision with root package name */
        public int f59903n;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59902m = obj;
            this.f59903n |= Integer.MIN_VALUE;
            return i1.O(null, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", i = {}, l = {735}, m = "respondStaticPath$checkExclude$8", n = {}, s = {})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f59904a;

        /* renamed from: b, reason: collision with root package name */
        public int f59905b;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59904a = obj;
            this.f59905b |= Integer.MIN_VALUE;
            return i1.P(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {669, 681, 694, TypedValues.TransitionType.TYPE_INTERPOLATOR}, m = "respondStaticResource", n = {"$this$respondStaticResource", "index", "basePackage", "compressedTypes", "contentType", "cacheControl", "modifier", SocialConstants.PARAM_EXCLUDE, "extensions", "defaultPath", "relativePath", "$this$respondStaticResource", "index", "basePackage", "compressedTypes", "contentType", "cacheControl", "modifier", SocialConstants.PARAM_EXCLUDE, "defaultPath", "relativePath", "$this$respondStaticResource", "basePackage", "compressedTypes", "contentType", "cacheControl", "modifier", "defaultPath"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f59906a;

        /* renamed from: b, reason: collision with root package name */
        public Object f59907b;

        /* renamed from: c, reason: collision with root package name */
        public Object f59908c;

        /* renamed from: d, reason: collision with root package name */
        public Object f59909d;

        /* renamed from: e, reason: collision with root package name */
        public Object f59910e;

        /* renamed from: f, reason: collision with root package name */
        public Object f59911f;

        /* renamed from: g, reason: collision with root package name */
        public Object f59912g;

        /* renamed from: h, reason: collision with root package name */
        public Object f59913h;

        /* renamed from: i, reason: collision with root package name */
        public Object f59914i;

        /* renamed from: j, reason: collision with root package name */
        public Object f59915j;

        /* renamed from: k, reason: collision with root package name */
        public Object f59916k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f59917l;

        /* renamed from: m, reason: collision with root package name */
        public int f59918m;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59917l = obj;
            this.f59918m |= Integer.MIN_VALUE;
            return i1.Q(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$staticContentRoute$1$1$1", f = "StaticContent.kt", i = {}, l = {551}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59919a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59920b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<zx.b, j00.c<? super g2>, Object> f59921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(x00.p<? super zx.b, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super n> cVar) {
            super(2, cVar);
            this.f59921c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            n nVar = new n(this.f59921c, cVar);
            nVar.f59920b = obj;
            return nVar;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((n) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59919a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.c1 c1Var = (io.ktor.server.routing.c1) this.f59920b;
                x00.p<zx.b, j00.c<? super g2>, Object> pVar = this.f59921c;
                io.ktor.server.routing.b1 a11 = c1Var.a();
                this.f59919a = 1;
                if (pVar.invoke(a11, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$staticContentRoute$1$1$2$1", f = "StaticContent.kt", i = {}, l = {557}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements x00.p<io.ktor.server.routing.c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59922a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59923b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<zx.b, j00.c<? super g2>, Object> f59924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(x00.p<? super zx.b, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super o> cVar) {
            super(2, cVar);
            this.f59924c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            o oVar = new o(this.f59924c, cVar);
            oVar.f59923b = obj;
            return oVar;
        }

        @Override // x00.p
        public final Object invoke(io.ktor.server.routing.c1 c1Var, j00.c<? super g2> cVar) {
            return ((o) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59922a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                io.ktor.server.routing.c1 c1Var = (io.ktor.server.routing.c1) this.f59923b;
                x00.p<zx.b, j00.c<? super g2>, Object> pVar = this.f59924c;
                io.ktor.server.routing.b1 a11 = c1Var.a();
                this.f59922a = 1;
                if (pVar.invoke(a11, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$staticFileSystem$2", f = "StaticContent.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements x00.p<zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59925a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59926b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hy.f f59927c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f59928d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f59929e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59930f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.l<Path, ix.k> f59931g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.l<Path, List<CacheControl>> f59932h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x00.q<Path, zx.b, j00.c<? super g2>, Object> f59933i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ x00.l<Path, Boolean> f59934j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List<String> f59935k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f59936l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(hy.f fVar, String str, String str2, List<? extends CompressedFileType> list, x00.l<? super Path, ix.k> lVar, x00.l<? super Path, ? extends List<? extends CacheControl>> lVar2, x00.q<? super Path, ? super zx.b, ? super j00.c<? super g2>, ? extends Object> qVar, x00.l<? super Path, Boolean> lVar3, List<String> list2, String str3, j00.c<? super p> cVar) {
            super(2, cVar);
            this.f59927c = fVar;
            this.f59928d = str;
            this.f59929e = str2;
            this.f59930f = list;
            this.f59931g = lVar;
            this.f59932h = lVar2;
            this.f59933i = qVar;
            this.f59934j = lVar3;
            this.f59935k = list2;
            this.f59936l = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            p pVar = new p(this.f59927c, this.f59928d, this.f59929e, this.f59930f, this.f59931g, this.f59932h, this.f59933i, this.f59934j, this.f59935k, this.f59936l, cVar);
            pVar.f59926b = obj;
            return pVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.b bVar, j00.c<? super g2> cVar) {
            return ((p) create(bVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59925a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                zx.b bVar = (zx.b) this.f59926b;
                hy.f fVar = this.f59927c;
                String str = this.f59928d;
                String str2 = this.f59929e;
                List<CompressedFileType> list = this.f59930f;
                x00.l<Path, ix.k> lVar = this.f59931g;
                x00.l<Path, List<CacheControl>> lVar2 = this.f59932h;
                x00.q<Path, zx.b, j00.c<? super g2>, Object> qVar = this.f59933i;
                x00.l<Path, Boolean> lVar3 = this.f59934j;
                List<String> list2 = this.f59935k;
                String str3 = this.f59936l;
                this.f59925a = 1;
                if (i1.O(bVar, fVar, str, str2, list, lVar, lVar2, qVar, lVar3, list2, str3, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$staticFiles$2", f = "StaticContent.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements x00.p<zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59937a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59938b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f59939c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ File f59940d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59941e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<File, ix.k> f59942f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.l<File, List<CacheControl>> f59943g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.q<File, zx.b, j00.c<? super g2>, Object> f59944h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x00.l<File, Boolean> f59945i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<String> f59946j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f59947k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(String str, File file, List<? extends CompressedFileType> list, x00.l<? super File, ix.k> lVar, x00.l<? super File, ? extends List<? extends CacheControl>> lVar2, x00.q<? super File, ? super zx.b, ? super j00.c<? super g2>, ? extends Object> qVar, x00.l<? super File, Boolean> lVar3, List<String> list2, String str2, j00.c<? super q> cVar) {
            super(2, cVar);
            this.f59939c = str;
            this.f59940d = file;
            this.f59941e = list;
            this.f59942f = lVar;
            this.f59943g = lVar2;
            this.f59944h = qVar;
            this.f59945i = lVar3;
            this.f59946j = list2;
            this.f59947k = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            q qVar = new q(this.f59939c, this.f59940d, this.f59941e, this.f59942f, this.f59943g, this.f59944h, this.f59945i, this.f59946j, this.f59947k, cVar);
            qVar.f59938b = obj;
            return qVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.b bVar, j00.c<? super g2> cVar) {
            return ((q) create(bVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59937a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                zx.b bVar = (zx.b) this.f59938b;
                String str = this.f59939c;
                File file = this.f59940d;
                List<CompressedFileType> list = this.f59941e;
                x00.l<File, ix.k> lVar = this.f59942f;
                x00.l<File, List<CacheControl>> lVar2 = this.f59943g;
                x00.q<File, zx.b, j00.c<? super g2>, Object> qVar = this.f59944h;
                x00.l<File, Boolean> lVar3 = this.f59945i;
                List<String> list2 = this.f59946j;
                String str2 = this.f59947k;
                this.f59937a = 1;
                if (i1.M(bVar, str, file, list, lVar, lVar2, qVar, lVar3, list2, str2, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.StaticContentKt$staticResources$2", f = "StaticContent.kt", i = {}, l = {225}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements x00.p<zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59948a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f59949b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f59950c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f59951d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<CompressedFileType> f59952e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<URL, ix.k> f59953f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.l<URL, List<CacheControl>> f59954g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x00.q<URL, zx.b, j00.c<? super g2>, Object> f59955h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x00.l<URL, Boolean> f59956i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<String> f59957j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f59958k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(String str, String str2, List<? extends CompressedFileType> list, x00.l<? super URL, ix.k> lVar, x00.l<? super URL, ? extends List<? extends CacheControl>> lVar2, x00.q<? super URL, ? super zx.b, ? super j00.c<? super g2>, ? extends Object> qVar, x00.l<? super URL, Boolean> lVar3, List<String> list2, String str3, j00.c<? super r> cVar) {
            super(2, cVar);
            this.f59950c = str;
            this.f59951d = str2;
            this.f59952e = list;
            this.f59953f = lVar;
            this.f59954g = lVar2;
            this.f59955h = qVar;
            this.f59956i = lVar3;
            this.f59957j = list2;
            this.f59958k = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            r rVar = new r(this.f59950c, this.f59951d, this.f59952e, this.f59953f, this.f59954g, this.f59955h, this.f59956i, this.f59957j, this.f59958k, cVar);
            rVar.f59949b = obj;
            return rVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zx.b bVar, j00.c<? super g2> cVar) {
            return ((r) create(bVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f59948a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                zx.b bVar = (zx.b) this.f59949b;
                String str = this.f59950c;
                String str2 = this.f59951d;
                List<CompressedFileType> list = this.f59952e;
                x00.l<URL, ix.k> lVar = this.f59953f;
                x00.l<URL, List<CacheControl>> lVar2 = this.f59954g;
                x00.q<URL, zx.b, j00.c<? super g2>, Object> qVar = this.f59955h;
                x00.l<URL, Boolean> lVar3 = this.f59956i;
                List<String> list2 = this.f59957j;
                String str3 = this.f59958k;
                this.f59948a = 1;
                if (i1.Q(bVar, str, str2, list, lVar, lVar2, qVar, lVar3, list2, str3, this) == l11) {
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

    static {
        h10.r rVar;
        h10.r rVar2;
        h10.d d11 = kotlin.jvm.internal.o0.d(String.class);
        h10.r rVar3 = null;
        try {
            rVar = kotlin.jvm.internal.o0.B(String.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f59839a = new xy.a<>("StaticFileLocation", new gz.a(d11, rVar));
        h10.d d12 = kotlin.jvm.internal.o0.d(File.class);
        try {
            rVar2 = kotlin.jvm.internal.o0.B(File.class);
        } catch (Throwable unused2) {
            rVar2 = null;
        }
        f59841c = new xy.a<>("BaseFolder", new gz.a(d12, rVar2));
        f59842d = zx.b0.p("StaticContentAutoHead", new x00.l() { // from class: hy.b1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = i1.i((zx.s0) obj);
                return i11;
            }
        });
        h10.d d13 = kotlin.jvm.internal.o0.d(String.class);
        try {
            rVar3 = kotlin.jvm.internal.o0.B(String.class);
        } catch (Throwable unused3) {
        }
        f59843e = new xy.a<>("BasePackage", new gz.a(d13, rVar3));
    }

    public static final FileSystem A(Path path, ClassLoader classLoader) {
        FileSystem newFileSystem;
        newFileSystem = FileSystems.newFileSystem(path, classLoader);
        kotlin.jvm.internal.g0.o(newFileSystem, "newFileSystem(...)");
        return newFileSystem;
    }

    @m80.l
    public static final String B(@m80.k io.ktor.server.routing.g0 g0Var) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        String str = (String) g0Var.getAttributes().a(f59843e);
        if (str != null) {
            return str;
        }
        io.ktor.server.routing.g0 parent = g0Var.getParent();
        if (parent != null) {
            return B(parent);
        }
        return null;
    }

    @m80.k
    public static final xy.a<String> D() {
        return f59839a;
    }

    @m80.l
    public static final File E(@m80.k io.ktor.server.routing.g0 g0Var) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        File file = (File) g0Var.getAttributes().a(f59841c);
        if (file != null) {
            return file;
        }
        io.ktor.server.routing.g0 parent = g0Var.getParent();
        if (parent != null) {
            return E(parent);
        }
        return null;
    }

    public static final boolean F(@m80.k zx.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return bVar.getAttributes().c(f59839a);
    }

    public static final void G(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k CompressedFileType[] types, @m80.k x00.l<? super io.ktor.server.routing.g0, g2> configure) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(types, "types");
        kotlin.jvm.internal.g0.p(configure, "configure");
        List<CompressedFileType> r11 = c0.r(g0Var);
        if (r11 == null) {
            r11 = a00.h0.J();
        }
        g0Var.getAttributes().e(c0.q(), a00.r0.e2(a00.r0.I4(r11, a00.q.t(types))));
        configure.invoke(g0Var);
        g0Var.getAttributes().b(c0.q());
    }

    public static /* synthetic */ void H(io.ktor.server.routing.g0 g0Var, CompressedFileType[] compressedFileTypeArr, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            compressedFileTypeArr = (CompressedFileType[]) CompressedFileType.getEntries().toArray(new CompressedFileType[0]);
        }
        G(g0Var, compressedFileTypeArr, lVar);
    }

    @yz.n(message = "Please use `staticResources` instead")
    public static final void I(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.k String resource, @m80.l String str) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(resource, "resource");
        RoutingBuilderKt.v(g0Var, remotePath, new g(resource, q(B(g0Var), str), c0.r(g0Var), null));
    }

    public static /* synthetic */ void J(io.ktor.server.routing.g0 g0Var, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        I(g0Var, str, str2, str3);
    }

    @yz.n(message = "Please use `staticResources` instead")
    public static final void K(@m80.k io.ktor.server.routing.g0 g0Var, @m80.l String str) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        RoutingBuilderKt.v(g0Var, "{static-content-path-parameter...}", new h(q(B(g0Var), str), c0.r(g0Var), null));
    }

    public static /* synthetic */ void L(io.ktor.server.routing.g0 g0Var, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        K(g0Var, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x02f5, code lost:
    
        if (hy.c0.s(r6, r0, r2, r3, r4, r1, r10) != r11) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0185, code lost:
    
        if (hy.c0.s(r24, r6, r2, r3, r4, r30, r10) == r11) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x029c -> B:15:0x02a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(zx.b r24, java.lang.String r25, java.io.File r26, java.util.List<? extends io.ktor.server.http.content.CompressedFileType> r27, x00.l<? super java.io.File, ix.k> r28, x00.l<? super java.io.File, ? extends java.util.List<? extends io.ktor.http.CacheControl>> r29, x00.q<? super java.io.File, ? super zx.b, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r30, x00.l<? super java.io.File, java.lang.Boolean> r31, java.util.List<java.lang.String> r32, java.lang.String r33, j00.c<? super yz.g2> r34) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.i1.M(zx.b, java.lang.String, java.io.File, java.util.List, x00.l, x00.l, x00.q, x00.l, java.util.List, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(x00.l<? super java.io.File, java.lang.Boolean> r4, zx.b r5, java.io.File r6, j00.c<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof hy.i1.j
            if (r0 == 0) goto L13
            r0 = r7
            hy.i1$j r0 = (hy.i1.j) r0
            int r1 = r0.f59889b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59889b = r1
            goto L18
        L13:
            hy.i1$j r0 = new hy.i1$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f59888a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f59889b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L66
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r7)
            java.lang.Object r4 = r4.invoke(r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L46
            r4 = 0
            java.lang.Boolean r4 = l00.a.a(r4)
            return r4
        L46:
            ix.g1$a r4 = ix.g1.f62797c
            ix.g1 r4 = r4.k()
            java.lang.Class<ix.g1> r6 = ix.g1.class
            h10.d r7 = kotlin.jvm.internal.o0.d(r6)
            h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L57
            goto L58
        L57:
            r6 = 0
        L58:
            gz.a r2 = new gz.a
            r2.<init>(r7, r6)
            r0.f59889b = r3
            java.lang.Object r4 = r5.E(r4, r2, r0)
            if (r4 != r1) goto L66
            return r1
        L66:
            java.lang.Boolean r4 = l00.a.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.i1.N(x00.l, zx.b, java.io.File, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0372, code lost:
    
        if (hy.c0.w(r7, r6, r0, r4, r3, r5, r1, r11) != r12) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0334 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0309 -> B:15:0x0314). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(zx.b r26, hy.f r27, java.lang.String r28, java.lang.String r29, java.util.List<? extends io.ktor.server.http.content.CompressedFileType> r30, x00.l<? super java.nio.file.Path, ix.k> r31, x00.l<? super java.nio.file.Path, ? extends java.util.List<? extends io.ktor.http.CacheControl>> r32, x00.q<? super java.nio.file.Path, ? super zx.b, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r33, x00.l<? super java.nio.file.Path, java.lang.Boolean> r34, java.util.List<java.lang.String> r35, java.lang.String r36, j00.c<? super yz.g2> r37) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.i1.O(zx.b, hy.f, java.lang.String, java.lang.String, java.util.List, x00.l, x00.l, x00.q, x00.l, java.util.List, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(x00.l<? super java.nio.file.Path, java.lang.Boolean> r4, zx.b r5, java.nio.file.Path r6, j00.c<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof hy.i1.l
            if (r0 == 0) goto L13
            r0 = r7
            hy.i1$l r0 = (hy.i1.l) r0
            int r1 = r0.f59905b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59905b = r1
            goto L18
        L13:
            hy.i1$l r0 = new hy.i1$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f59904a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f59905b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L66
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r7)
            java.lang.Object r4 = r4.invoke(r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L46
            r4 = 0
            java.lang.Boolean r4 = l00.a.a(r4)
            return r4
        L46:
            ix.g1$a r4 = ix.g1.f62797c
            ix.g1 r4 = r4.k()
            java.lang.Class<ix.g1> r6 = ix.g1.class
            h10.d r7 = kotlin.jvm.internal.o0.d(r6)
            h10.r r6 = kotlin.jvm.internal.o0.B(r6)     // Catch: java.lang.Throwable -> L57
            goto L58
        L57:
            r6 = 0
        L58:
            gz.a r2 = new gz.a
            r2.<init>(r7, r6)
            r0.f59905b = r3
            java.lang.Object r4 = r5.E(r4, r2, r0)
            if (r4 != r1) goto L66
            return r1
        L66:
            java.lang.Boolean r4 = l00.a.a(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.i1.P(x00.l, zx.b, java.nio.file.Path, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0255, code lost:
    
        if (hy.c0.B(r11, r12, r13, r14, r15, r16, r17, null, r10, 64, null) == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a6, code lost:
    
        if (r0 == r1) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01a6 -> B:30:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(zx.b r29, java.lang.String r30, java.lang.String r31, java.util.List<? extends io.ktor.server.http.content.CompressedFileType> r32, x00.l<? super java.net.URL, ix.k> r33, x00.l<? super java.net.URL, ? extends java.util.List<? extends io.ktor.http.CacheControl>> r34, x00.q<? super java.net.URL, ? super zx.b, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r35, x00.l<? super java.net.URL, java.lang.Boolean> r36, java.util.List<java.lang.String> r37, java.lang.String r38, j00.c<? super yz.g2> r39) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.i1.Q(zx.b, java.lang.String, java.lang.String, java.util.List, x00.l, x00.l, x00.q, x00.l, java.util.List, java.lang.String, j00.c):java.lang.Object");
    }

    public static final void R(@m80.k io.ktor.server.routing.g0 g0Var, @m80.l String str) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        if (str != null) {
            g0Var.getAttributes().e(f59843e, str);
        } else {
            g0Var.getAttributes().b(f59843e);
        }
    }

    public static final void S(@m80.k io.ktor.server.routing.g0 g0Var, @m80.l File file) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        if (file != null) {
            g0Var.getAttributes().e(f59841c, file);
        } else {
            g0Var.getAttributes().b(f59841c);
        }
    }

    @yz.n(message = "Please use `staticFiles` or `staticResources` instead")
    @m80.k
    public static final io.ktor.server.routing.g0 T(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.k x00.l<? super io.ktor.server.routing.g0, g2> configure) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(configure, "configure");
        return RoutingBuilderKt.f0(g0Var, remotePath, configure);
    }

    @yz.n(message = "Please use `staticFiles` or `staticResources` instead")
    @m80.k
    public static final io.ktor.server.routing.g0 U(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k x00.l<? super io.ktor.server.routing.g0, g2> configure) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(configure, "configure");
        configure.invoke(g0Var);
        return g0Var;
    }

    public static final io.ktor.server.routing.g0 V(io.ktor.server.routing.g0 g0Var, String str, final boolean z11, final x00.p<? super zx.b, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return RoutingBuilderKt.f0(g0Var, str, new x00.l() { // from class: hy.d1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 W;
                W = i1.W(z11, pVar, (io.ktor.server.routing.g0) obj);
                return W;
            }
        });
    }

    public static final g2 W(final boolean z11, final x00.p pVar, io.ktor.server.routing.g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        RoutingBuilderKt.f0(route, "{static-content-path-parameter...}", new x00.l() { // from class: hy.e1
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 X;
                X = i1.X(z11, pVar, (io.ktor.server.routing.g0) obj);
                return X;
            }
        });
        return g2.f100423a;
    }

    public static final g2 X(boolean z11, final x00.p pVar, io.ktor.server.routing.g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        RoutingBuilderKt.w(route, new n(pVar, null));
        if (z11) {
            RoutingBuilderKt.E(route, ix.e1.f62753b.d(), new x00.l() { // from class: hy.g1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 Y;
                    Y = i1.Y(x00.p.this, (io.ktor.server.routing.g0) obj);
                    return Y;
                }
            });
        }
        return g2.f100423a;
    }

    public static final g2 Y(x00.p pVar, io.ktor.server.routing.g0 method) {
        kotlin.jvm.internal.g0.p(method, "$this$method");
        g0.a.b(method, f59842d, null, 2, null);
        method.e(new o(pVar, null));
        return g2.f100423a;
    }

    @m80.k
    public static final io.ktor.server.routing.g0 Z(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.l String str, @m80.l String str2, @m80.k hy.f fileSystem, @m80.k x00.l<? super x0<Path>, g2> block) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(fileSystem, "fileSystem");
        kotlin.jvm.internal.g0.p(block, "block");
        x0 x0Var = new x0();
        block.invoke(x0Var);
        return V(g0Var, remotePath, x0Var.q(), new p(fileSystem, str2, str, x0Var.x(), x0Var.s(), x0Var.r(), x0Var.w(), x0Var.u(), x0Var.v(), x0Var.t(), null));
    }

    public static /* synthetic */ io.ktor.server.routing.g0 a0(io.ktor.server.routing.g0 g0Var, String str, String str2, String str3, hy.f fVar, x00.l lVar, int i11, Object obj) {
        FileSystem fileSystem;
        if ((i11 & 4) != 0) {
            str3 = o4.a.f75712c;
        }
        String str4 = str3;
        if ((i11 & 8) != 0) {
            f.a aVar = hy.f.f59830a;
            fileSystem = FileSystems.getDefault();
            kotlin.jvm.internal.g0.o(fileSystem, "getDefault(...)");
            fVar = aVar.a(fileSystem);
        }
        hy.f fVar2 = fVar;
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: hy.h1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 b02;
                    b02 = i1.b0((x0) obj2);
                    return b02;
                }
            };
        }
        return Z(g0Var, str, str2, str4, fVar2, lVar);
    }

    public static final g2 b0(x0 x0Var) {
        kotlin.jvm.internal.g0.p(x0Var, "<this>");
        return g2.f100423a;
    }

    @m80.k
    public static final io.ktor.server.routing.g0 c0(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.k File dir, @m80.l String str, @m80.k x00.l<? super x0<File>, g2> block) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(dir, "dir");
        kotlin.jvm.internal.g0.p(block, "block");
        x0 x0Var = new x0();
        block.invoke(x0Var);
        return V(g0Var, remotePath, x0Var.q(), new q(str, dir, x0Var.x(), x0Var.s(), x0Var.r(), x0Var.w(), x0Var.u(), x0Var.v(), x0Var.t(), null));
    }

    public static /* synthetic */ io.ktor.server.routing.g0 d0(io.ktor.server.routing.g0 g0Var, String str, File file, String str2, x00.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = o4.a.f75712c;
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: hy.a1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 e02;
                    e02 = i1.e0((x0) obj2);
                    return e02;
                }
            };
        }
        return c0(g0Var, str, file, str2, lVar);
    }

    public static final g2 e0(x0 x0Var) {
        kotlin.jvm.internal.g0.p(x0Var, "<this>");
        return g2.f100423a;
    }

    @m80.k
    public static final io.ktor.server.routing.g0 f0(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.l String str, @m80.l String str2, @m80.k x00.l<? super x0<URL>, g2> block) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(block, "block");
        x0 x0Var = new x0();
        block.invoke(x0Var);
        return V(g0Var, remotePath, x0Var.q(), new r(str2, str, x0Var.x(), x0Var.s(), x0Var.r(), x0Var.w(), x0Var.u(), x0Var.v(), x0Var.t(), null));
    }

    public static /* synthetic */ io.ktor.server.routing.g0 g0(io.ktor.server.routing.g0 g0Var, String str, String str2, String str3, x00.l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = o4.a.f75712c;
        }
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: hy.c1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 h02;
                    h02 = i1.h0((x0) obj2);
                    return h02;
                }
            };
        }
        return f0(g0Var, str, str2, str3, lVar);
    }

    public static final g2 h0(x0 x0Var) {
        kotlin.jvm.internal.g0.p(x0Var, "<this>");
        return g2.f100423a;
    }

    public static final g2 i(zx.s0 createRouteScopedPlugin) {
        kotlin.jvm.internal.g0.p(createRouteScopedPlugin, "$this$createRouteScopedPlugin");
        createRouteScopedPlugin.n(cy.h.f46970a, new a(null));
        return g2.f100423a;
    }

    @m80.k
    public static final io.ktor.server.routing.g0 i0(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.l String str, @m80.k Path zip, @m80.l String str2, @m80.k x00.l<? super x0<Path>, g2> block) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(zip, "zip");
        kotlin.jvm.internal.g0.p(block, "block");
        return Z(g0Var, remotePath, str, str2, new j0(zip, g0Var.a().b(), hy.f.f59830a.a(A(zip, g0Var.a().b()))), block);
    }

    public static /* synthetic */ io.ktor.server.routing.g0 j0(io.ktor.server.routing.g0 g0Var, String str, String str2, Path path, String str3, x00.l lVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = o4.a.f75712c;
        }
        String str4 = str3;
        if ((i11 & 16) != 0) {
            lVar = new x00.l() { // from class: hy.f1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 k02;
                    k02 = i1.k0((x0) obj2);
                    return k02;
                }
            };
        }
        return i0(g0Var, str, str2, path, str4, lVar);
    }

    public static final g2 k0(x0 x0Var) {
        kotlin.jvm.internal.g0.p(x0Var, "<this>");
        return g2.f100423a;
    }

    public static final File p(File file, File file2) {
        return file == null ? file2 : r00.o.o0(file, file2);
    }

    public static final String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        return str + '.' + str2;
    }

    @yz.n(message = "Please use `staticFiles` instead")
    public static final void r(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k File localPath) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(localPath, "localPath");
        RoutingBuilderKt.w(g0Var, new c(p(E(g0Var), localPath), c0.r(g0Var), null));
    }

    @yz.n(message = "Please use `staticFiles` instead")
    public static final void s(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String localPath) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(localPath, "localPath");
        r(g0Var, new File(localPath));
    }

    @yz.n(message = "Please use `staticResources` instead")
    public static final void t(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String resource, @m80.l String str) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(resource, "resource");
        RoutingBuilderKt.w(g0Var, new d(resource, q(B(g0Var), str), c0.r(g0Var), null));
    }

    public static /* synthetic */ void u(io.ktor.server.routing.g0 g0Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        t(g0Var, str, str2);
    }

    @yz.n(message = "Please use `staticFiles` instead")
    public static final void v(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.k File localPath) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(localPath, "localPath");
        RoutingBuilderKt.v(g0Var, remotePath, new e(p(E(g0Var), localPath), c0.r(g0Var), null));
    }

    @yz.n(message = "Please use `staticFiles` instead")
    public static final void w(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String remotePath, @m80.k String localPath) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(remotePath, "remotePath");
        kotlin.jvm.internal.g0.p(localPath, "localPath");
        v(g0Var, remotePath, new File(localPath));
    }

    public static /* synthetic */ void x(io.ktor.server.routing.g0 g0Var, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        w(g0Var, str, str2);
    }

    @yz.n(message = "Please use `staticFiles` instead")
    public static final void y(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k File folder) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(folder, "folder");
        RoutingBuilderKt.v(g0Var, "{static-content-path-parameter...}", new f(p(E(g0Var), folder), c0.r(g0Var), null));
    }

    @yz.n(message = "Please use `staticFiles` instead")
    public static final void z(@m80.k io.ktor.server.routing.g0 g0Var, @m80.k String folder) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(folder, "folder");
        y(g0Var, new File(folder));
    }

    @yz.n(message = "Please use `staticResources` instead")
    public static /* synthetic */ void C(io.ktor.server.routing.g0 g0Var) {
    }
}
