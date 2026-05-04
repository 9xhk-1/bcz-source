package hy;

import com.jiongji.andriod.card.R;
import io.ktor.server.http.content.CompressedFileType;
import ix.k;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPreCompressed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreCompressed.kt\nio/ktor/server/http/content/PreCompressedKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 5 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n1#1,217:1\n1557#2:218\n1628#2,3:219\n774#2:222\n865#2,2:223\n295#2,2:225\n1557#2:227\n1628#2,3:228\n774#2:231\n865#2,2:232\n1557#2:234\n1628#2,3:235\n295#2,2:238\n1557#2:240\n1628#2,3:241\n25#3:244\n26#3:261\n25#3:262\n26#3:279\n25#3:280\n26#3:297\n25#3:298\n26#3:315\n25#3:316\n26#3:333\n25#3:334\n26#3:351\n25#3:352\n26#3:369\n25#3:370\n26#3:387\n58#4,16:245\n58#4,16:263\n58#4,16:281\n58#4,16:299\n58#4,16:317\n58#4,16:335\n58#4,16:353\n58#4,16:371\n58#4,16:389\n18#5:388\n*S KotlinDebug\n*F\n+ 1 PreCompressed.kt\nio/ktor/server/http/content/PreCompressedKt\n*L\n61#1:218\n61#1:219,3\n64#1:222\n64#1:223,2\n65#1:225,2\n74#1:227\n74#1:228,3\n77#1:231\n77#1:232,2\n78#1:234\n78#1:235,3\n79#1:238,2\n96#1:240\n96#1:241,3\n129#1:244\n129#1:261\n138#1:262\n138#1:279\n157#1:280\n157#1:297\n166#1:298\n166#1:315\n190#1:316\n190#1:333\n197#1:334\n197#1:351\n208#1:352\n208#1:369\n214#1:370\n214#1:387\n129#1:245,16\n138#1:263,16\n157#1:281,16\n166#1:299,16\n190#1:317,16\n197#1:335,16\n208#1:353,16\n214#1:371,16\n29#1:389,16\n29#1:388\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<List<CompressedFileType>> f59802a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.PreCompressedKt", f = "PreCompressed.kt", i = {0, 0, 0, 2, 2, 2, 2, 2}, l = {128, 218, 136, R.styleable.Theme_drawable_tab_mall_1111}, m = "respondStaticFile", n = {"$this$respondStaticFile", "requestedFile", "contentType", "$this$respondStaticFile", "requestedFile", "contentType", "bestCompressionFit", "compressedFile"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f59803a;

        /* renamed from: b, reason: collision with root package name */
        public Object f59804b;

        /* renamed from: c, reason: collision with root package name */
        public Object f59805c;

        /* renamed from: d, reason: collision with root package name */
        public Object f59806d;

        /* renamed from: e, reason: collision with root package name */
        public Object f59807e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f59808f;

        /* renamed from: g, reason: collision with root package name */
        public int f59809g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59808f = obj;
            this.f59809g |= Integer.MIN_VALUE;
            return c0.s(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.PreCompressedKt$respondStaticFile$4", f = "PreCompressed.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.q<File, zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59810a;

        public b(j00.c<? super b> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(File file, zx.b bVar, j00.c<? super g2> cVar) {
            return new b(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f59810a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.PreCompressedKt", f = "PreCompressed.kt", i = {0, 0, 0, 2, 2, 2, 2, 2}, l = {156, 218, 164, R.styleable.Theme_drawable_tab_mall_1111}, m = "respondStaticPath", n = {"$this$respondStaticPath", "requestedPath", "contentType", "$this$respondStaticPath", "requestedPath", "contentType", "compressedPath", "compression"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f59811a;

        /* renamed from: b, reason: collision with root package name */
        public Object f59812b;

        /* renamed from: c, reason: collision with root package name */
        public Object f59813c;

        /* renamed from: d, reason: collision with root package name */
        public Object f59814d;

        /* renamed from: e, reason: collision with root package name */
        public Object f59815e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f59816f;

        /* renamed from: g, reason: collision with root package name */
        public int f59817g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59816f = obj;
            this.f59817g |= Integer.MIN_VALUE;
            return c0.w(null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.PreCompressedKt$respondStaticPath$4", f = "PreCompressed.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.q<Path, zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59818a;

        public d(j00.c<? super d> cVar) {
            super(3, cVar);
        }

        public final Object i(Path path, zx.b bVar, j00.c<? super g2> cVar) {
            return new d(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Path path, zx.b bVar, j00.c<? super g2> cVar) {
            return i(io.ktor.server.engine.u0.a(path), bVar, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f59818a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.PreCompressedKt", f = "PreCompressed.kt", i = {1, 1, 4, 4}, l = {218, 196, R.styleable.Theme_drawable_tab_mall_1111, 254, R.styleable.Theme_drawable_reset_plan, e3.a.f48454z}, m = "respondStaticResource", n = {"$this$respondStaticResource", "bestCompressionFit", "$this$respondStaticResource", "content"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f59819a;

        /* renamed from: b, reason: collision with root package name */
        public Object f59820b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f59821c;

        /* renamed from: d, reason: collision with root package name */
        public int f59822d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f59821c = obj;
            this.f59822d |= Integer.MIN_VALUE;
            return c0.A(null, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.http.content.PreCompressedKt$respondStaticResource$4", f = "PreCompressed.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements x00.q<URL, zx.b, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f59823a;

        public f(j00.c<? super f> cVar) {
            super(3, cVar);
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(URL url, zx.b bVar, j00.c<? super g2> cVar) {
            return new f(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f59823a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(List.class);
        try {
            rVar = kotlin.jvm.internal.o0.C(List.class, h10.t.f57954c.e(kotlin.jvm.internal.o0.B(CompressedFileType.class)));
        } catch (Throwable unused) {
            rVar = null;
        }
        f59802a = new xy.a<>("StaticContentCompressed", new gz.a(d11, rVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01e2, code lost:
    
        if (r0.E(r1, r4, r9) != r10) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0133, code lost:
    
        if (r0.E(r2, r4, r9) != r10) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r0.E(r2, r1, r9) == r10) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        if (r0.E(r2, r1, r9) == r10) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(@m80.k zx.b r21, @m80.k java.lang.String r22, @m80.l java.lang.String r23, @m80.l java.util.List<? extends io.ktor.server.http.content.CompressedFileType> r24, @m80.k x00.l<? super java.net.URL, ix.k> r25, @m80.k x00.l<? super java.net.URL, ? extends java.util.List<? extends io.ktor.http.CacheControl>> r26, @m80.k x00.q<? super java.net.URL, ? super zx.b, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r27, @m80.k x00.l<? super java.net.URL, java.lang.Boolean> r28, @m80.k j00.c<? super yz.g2> r29) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.c0.A(zx.b, java.lang.String, java.lang.String, java.util.List, x00.l, x00.l, x00.q, x00.l, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object B(zx.b bVar, String str, String str2, List list, x00.l lVar, x00.l lVar2, x00.q qVar, x00.l lVar3, j00.c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: hy.w
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    ix.k C;
                    C = c0.C((URL) obj2);
                    return C;
                }
            };
        }
        x00.l lVar4 = lVar;
        if ((i11 & 16) != 0) {
            lVar2 = new x00.l() { // from class: hy.x
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    List D;
                    D = c0.D((URL) obj2);
                    return D;
                }
            };
        }
        return A(bVar, str, str2, list, lVar4, lVar2, (i11 & 32) != 0 ? new f(null) : qVar, (i11 & 64) != 0 ? new x00.l() { // from class: hy.y
            @Override // x00.l
            public final Object invoke(Object obj2) {
                boolean E;
                E = c0.E((URL) obj2);
                return Boolean.valueOf(E);
            }
        } : lVar3, cVar);
    }

    public static final ix.k C(URL it) {
        kotlin.jvm.internal.g0.p(it, "it");
        k.c cVar = ix.k.f62843f;
        String path = it.getPath();
        kotlin.jvm.internal.g0.o(path, "getPath(...)");
        return ix.l0.e(cVar, n1.e(path));
    }

    public static final List D(URL it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return a00.h0.J();
    }

    public static final boolean E(URL it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return false;
    }

    @m80.l
    public static final hy.b k(@m80.k final zx.b call, @m80.k final String resource, @m80.l final String str, @m80.k List<ix.m0> acceptEncoding, @m80.l List<? extends CompressedFileType> list, @m80.k final x00.l<? super URL, ix.k> contentType) {
        q30.m E1;
        q30.m P0;
        q30.m S1;
        kotlin.jvm.internal.g0.p(call, "call");
        kotlin.jvm.internal.g0.p(resource, "resource");
        kotlin.jvm.internal.g0.p(acceptEncoding, "acceptEncoding");
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        List<ix.m0> list2 = acceptEncoding;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ix.m0) it.next()).g());
        }
        final Set f62 = a00.r0.f6(arrayList);
        if (list == null || (E1 = a00.r0.E1(list)) == null || (P0 = q30.k0.P0(E1, new x00.l() { // from class: hy.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean p11;
                p11 = c0.p(f62, (CompressedFileType) obj);
                return Boolean.valueOf(p11);
            }
        })) == null || (S1 = q30.k0.S1(P0, new x00.l() { // from class: hy.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                b n11;
                n11 = c0.n(resource, call, str, contentType, (CompressedFileType) obj);
                return n11;
            }
        })) == null) {
            return null;
        }
        return (hy.b) q30.k0.i1(S1);
    }

    @m80.l
    public static final CompressedFileType l(@m80.k File file, @m80.k List<ix.m0> acceptEncoding, @m80.l List<? extends CompressedFileType> list) {
        kotlin.jvm.internal.g0.p(file, "file");
        kotlin.jvm.internal.g0.p(acceptEncoding, "acceptEncoding");
        List<ix.m0> list2 = acceptEncoding;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ix.m0) it.next()).g());
        }
        Set f62 = a00.r0.f6(arrayList);
        Object obj = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (f62.contains(((CompressedFileType) obj2).getEncoding())) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (new File(file.getAbsolutePath() + '.' + ((CompressedFileType) next).getExtension()).isFile()) {
                obj = next;
                break;
            }
        }
        return (CompressedFileType) obj;
    }

    @m80.l
    public static final Pair<Path, CompressedFileType> m(@m80.k hy.f fileSystem, @m80.k Path path, @m80.k List<ix.m0> acceptEncoding, @m80.l List<? extends CompressedFileType> list) {
        boolean exists;
        kotlin.jvm.internal.g0.p(fileSystem, "fileSystem");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(acceptEncoding, "acceptEncoding");
        List<ix.m0> list2 = acceptEncoding;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ix.m0) it.next()).g());
        }
        Set f62 = a00.r0.f6(arrayList);
        Object obj = null;
        if (list == null) {
            return null;
        }
        ArrayList<CompressedFileType> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (f62.contains(((CompressedFileType) obj2).getEncoding())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(a00.i0.d0(arrayList2, 10));
        for (CompressedFileType compressedFileType : arrayList2) {
            arrayList3.add(yz.h1.a(fileSystem.a(path.toString() + '.' + compressedFileType.getExtension(), new String[0]), compressedFileType));
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            exists = Files.exists(io.ktor.server.engine.u0.a(((Pair) next).getFirst()), (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (exists) {
                obj = next;
                break;
            }
        }
        return (Pair) obj;
    }

    public static final hy.b n(final String str, zx.b bVar, String str2, final x00.l lVar, CompressedFileType it) {
        kotlin.jvm.internal.g0.p(it, "it");
        final String str3 = str + '.' + it.getExtension();
        Pair k11 = n1.k(bVar.w0(), str3, str2, null, new x00.l() { // from class: hy.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                ix.k o11;
                o11 = c0.o(str3, str, lVar, (URL) obj);
                return o11;
            }
        }, 4, null);
        if (k11 == null) {
            return null;
        }
        return new hy.b((URL) k11.getFirst(), (v.e) k11.getSecond(), it);
    }

    public static final ix.k o(String str, String str2, x00.l lVar, URL url) {
        kotlin.jvm.internal.g0.p(url, "url");
        String path = url.getPath();
        kotlin.jvm.internal.g0.o(path, "getPath(...)");
        StringBuilder sb2 = new StringBuilder();
        Regex.a aVar = Regex.Companion;
        String separator = File.separator;
        kotlin.jvm.internal.g0.o(separator, "separator");
        sb2.append(aVar.d(u30.k0.Q5(str, separator, null, 2, null)));
        sb2.append('$');
        Regex regex = new Regex(sb2.toString());
        kotlin.jvm.internal.g0.o(separator, "separator");
        return (ix.k) lVar.invoke(new URL(url.getProtocol(), url.getHost(), url.getPort(), regex.replace(path, u30.k0.Q5(str2, separator, null, 2, null))));
    }

    public static final boolean p(Set set, CompressedFileType it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return set.contains(it.getEncoding());
    }

    @m80.k
    public static final xy.a<List<CompressedFileType>> q() {
        return f59802a;
    }

    @m80.l
    public static final List<CompressedFileType> r(@m80.k io.ktor.server.routing.g0 g0Var) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        List<CompressedFileType> list = (List) g0Var.getAttributes().a(f59802a);
        if (list != null) {
            return list;
        }
        io.ktor.server.routing.g0 parent = g0Var.getParent();
        if (parent != null) {
            return r(parent);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0197, code lost:
    
        if (r0.E(r1, r4, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        if (r0.E(r3, r4, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if (r28.invoke(r1, r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015f, code lost:
    
        if (r28.invoke(r1, r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(@m80.k zx.b r23, @m80.k java.io.File r24, @m80.l java.util.List<? extends io.ktor.server.http.content.CompressedFileType> r25, @m80.k x00.l<? super java.io.File, ix.k> r26, @m80.k x00.l<? super java.io.File, ? extends java.util.List<? extends io.ktor.http.CacheControl>> r27, @m80.k x00.q<? super java.io.File, ? super zx.b, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r28, @m80.k j00.c<? super yz.g2> r29) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.c0.s(zx.b, java.io.File, java.util.List, x00.l, x00.l, x00.q, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object t(zx.b bVar, File file, List list, x00.l lVar, x00.l lVar2, x00.q qVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            lVar = new x00.l() { // from class: hy.z
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    ix.k u11;
                    u11 = c0.u((File) obj2);
                    return u11;
                }
            };
        }
        x00.l lVar3 = lVar;
        if ((i11 & 8) != 0) {
            lVar2 = new x00.l() { // from class: hy.a0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    List v11;
                    v11 = c0.v((File) obj2);
                    return v11;
                }
            };
        }
        x00.l lVar4 = lVar2;
        if ((i11 & 16) != 0) {
            qVar = new b(null);
        }
        return s(bVar, file, list, lVar3, lVar4, qVar, cVar);
    }

    public static final ix.k u(File it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return ix.h0.a(ix.k.f62843f, it);
    }

    public static final List v(File it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return a00.h0.J();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x018f, code lost:
    
        if (r0.E(r1, r4, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011d, code lost:
    
        if (r0.E(r3, r4, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        if (r29.invoke(r1, r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0157, code lost:
    
        if (r29.invoke(r1, r0, r5) == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(@m80.k zx.b r23, @m80.k hy.f r24, @m80.k java.nio.file.Path r25, @m80.l java.util.List<? extends io.ktor.server.http.content.CompressedFileType> r26, @m80.k x00.l<? super java.nio.file.Path, ix.k> r27, @m80.k x00.l<? super java.nio.file.Path, ? extends java.util.List<? extends io.ktor.http.CacheControl>> r28, @m80.k x00.q<? super java.nio.file.Path, ? super zx.b, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r29, @m80.k j00.c<? super yz.g2> r30) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy.c0.w(zx.b, hy.f, java.nio.file.Path, java.util.List, x00.l, x00.l, x00.q, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object x(zx.b bVar, hy.f fVar, Path path, List list, x00.l lVar, x00.l lVar2, x00.q qVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            lVar = new x00.l() { // from class: hy.u
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    ix.k y11;
                    y11 = c0.y((Path) obj2);
                    return y11;
                }
            };
        }
        x00.l lVar3 = lVar;
        if ((i11 & 16) != 0) {
            lVar2 = new x00.l() { // from class: hy.v
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    List z11;
                    z11 = c0.z((Path) obj2);
                    return z11;
                }
            };
        }
        x00.l lVar4 = lVar2;
        if ((i11 & 32) != 0) {
            qVar = new d(null);
        }
        return w(bVar, fVar, path, list, lVar3, lVar4, qVar, cVar);
    }

    public static final ix.k y(Path it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return ix.h0.b(ix.k.f62843f, it);
    }

    public static final List z(Path it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return a00.h0.J();
    }
}
