package m60;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.g1;
import l60.r0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-FileSystem")
@u0({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n58#2,4:156\n58#2,22:160\n66#2,10:182\n62#2,3:192\n77#2,3:195\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,4\n66#1:160,22\n65#1:182,10\n65#1:192,3\n65#1:195,3\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {116, 135, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "children", "symlinkPath", "child", "followSymlinks", "postorder", "symlinkCount", "$this$collectRecursively", "fileSystem", "stack", "path", "children", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "Z$0", "Z$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "Z$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f72409a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72410b;

        /* renamed from: c, reason: collision with root package name */
        public Object f72411c;

        /* renamed from: d, reason: collision with root package name */
        public Object f72412d;

        /* renamed from: e, reason: collision with root package name */
        public Object f72413e;

        /* renamed from: f, reason: collision with root package name */
        public Object f72414f;

        /* renamed from: g, reason: collision with root package name */
        public Object f72415g;

        /* renamed from: h, reason: collision with root package name */
        public Object f72416h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f72417i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f72418j;

        /* renamed from: k, reason: collision with root package name */
        public int f72419k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f72420l;

        /* renamed from: m, reason: collision with root package name */
        public int f72421m;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f72420l = obj;
            this.f72421m |= Integer.MIN_VALUE;
            return e.a(null, null, null, null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {0}, l = {75}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"}, v = 1)
    public static final class b extends RestrictedSuspendLambda implements x00.p<q30.o<? super okio.f>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f72422a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f72423b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ okio.b f72424c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ okio.f f72425d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(okio.b bVar, okio.f fVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f72424c = bVar;
            this.f72425d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f72424c, this.f72425d, cVar);
            bVar.f72423b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            q30.o oVar = (q30.o) this.f72423b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72422a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                okio.b bVar = this.f72424c;
                a00.m mVar = new a00.m();
                okio.f fVar = this.f72425d;
                this.f72423b = l00.k.a(oVar);
                this.f72422a = 1;
                if (e.a(oVar, bVar, mVar, fVar, false, true, this) == l11) {
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

        @Override // x00.p
        public final Object invoke(q30.o<? super okio.f> oVar, j00.c<? super g2> cVar) {
            return ((b) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack", "child"}, s = {"L$0", "L$1", "L$3"}, v = 1)
    public static final class c extends RestrictedSuspendLambda implements x00.p<q30.o<? super okio.f>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f72426a;

        /* renamed from: b, reason: collision with root package name */
        public Object f72427b;

        /* renamed from: c, reason: collision with root package name */
        public Object f72428c;

        /* renamed from: d, reason: collision with root package name */
        public int f72429d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f72430e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ okio.f f72431f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ okio.b f72432g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f72433h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(okio.f fVar, okio.b bVar, boolean z11, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f72431f = fVar;
            this.f72432g = bVar;
            this.f72433h = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f72431f, this.f72432g, this.f72433h, cVar);
            cVar2.f72430e = obj;
            return cVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator<okio.f> it;
            a00.m mVar;
            q30.o oVar = (q30.o) this.f72430e;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f72429d;
            if (i11 == 0) {
                kotlin.e.n(obj);
                a00.m mVar2 = new a00.m();
                mVar2.addLast(this.f72431f);
                it = this.f72432g.i0(this.f72431f).iterator();
                mVar = mVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f72427b;
                mVar = (a00.m) this.f72426a;
                kotlin.e.n(obj);
            }
            Iterator<okio.f> it2 = it;
            while (it2.hasNext()) {
                okio.f next = it2.next();
                okio.b bVar = this.f72432g;
                boolean z11 = this.f72433h;
                this.f72430e = oVar;
                this.f72426a = mVar;
                this.f72427b = it2;
                this.f72428c = l00.k.a(next);
                this.f72429d = 1;
                if (e.a(oVar, bVar, mVar, next, z11, false, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super okio.f> oVar, j00.c<? super g2> cVar) {
            return ((c) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cb, code lost:
    
        if (r10.b(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0110, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0112, code lost:
    
        if (r11 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011b, code lost:
    
        r13 = r1;
        r1 = r6;
        r6 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0190, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c7, code lost:
    
        if (r17.b(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #2 {all -> 0x017e, blocks: (B:23:0x0121, B:25:0x0127), top: B:22:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0173 -> B:21:0x0086). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k q30.o<? super okio.f> r17, @m80.k okio.b r18, @m80.k a00.m<okio.f> r19, @m80.k okio.f r20, boolean r21, boolean r22, @m80.k j00.c<? super yz.g2> r23) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m60.e.a(q30.o, okio.b, a00.m, okio.f, boolean, boolean, j00.c):java.lang.Object");
    }

    public static final void b(@m80.k okio.b bVar, @m80.k okio.f source, @m80.k okio.f target) throws IOException {
        Throwable th2;
        Long l11;
        g0.p(bVar, "<this>");
        g0.p(source, "source");
        g0.p(target, "target");
        g1 F0 = bVar.F0(source);
        Throwable th3 = null;
        try {
            l60.l d11 = r0.d(okio.b.E0(bVar, target, false, 2, null));
            try {
                l11 = Long.valueOf(d11.V2(F0));
                if (d11 != null) {
                    try {
                        d11.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (d11 != null) {
                    try {
                        d11.close();
                    } catch (Throwable th6) {
                        yz.r.a(th5, th6);
                    }
                }
                th2 = th5;
                l11 = null;
            }
        } catch (Throwable th7) {
            if (F0 != null) {
                try {
                    F0.close();
                } catch (Throwable th8) {
                    yz.r.a(th7, th8);
                }
            }
            th3 = th7;
        }
        if (th2 != null) {
            throw th2;
        }
        l11.longValue();
        if (F0 != null) {
            try {
                F0.close();
            } catch (Throwable th9) {
                th3 = th9;
            }
        }
        if (th3 != null) {
            throw th3;
        }
    }

    public static final void c(@m80.k okio.b bVar, @m80.k okio.f dir, boolean z11) throws IOException {
        g0.p(bVar, "<this>");
        g0.p(dir, "dir");
        a00.m mVar = new a00.m();
        for (okio.f fVar = dir; fVar != null && !bVar.f0(fVar); fVar = fVar.t()) {
            mVar.addFirst(fVar);
        }
        if (z11 && mVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = mVar.iterator();
        while (it.hasNext()) {
            okio.b.L(bVar, (okio.f) it.next(), false, 2, null);
        }
    }

    public static final void d(@m80.k okio.b bVar, @m80.k okio.f fileOrDirectory, boolean z11) throws IOException {
        g0.p(bVar, "<this>");
        g0.p(fileOrDirectory, "fileOrDirectory");
        Iterator it = q30.q.b(new b(bVar, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            bVar.V((okio.f) it.next(), z11 && !it.hasNext());
        }
    }

    public static final boolean e(@m80.k okio.b bVar, @m80.k okio.f path) throws IOException {
        g0.p(bVar, "<this>");
        g0.p(path, "path");
        return bVar.w0(path) != null;
    }

    @m80.k
    public static final q30.m<okio.f> f(@m80.k okio.b bVar, @m80.k okio.f dir, boolean z11) throws IOException {
        g0.p(bVar, "<this>");
        g0.p(dir, "dir");
        return q30.q.b(new c(dir, bVar, z11, null));
    }

    @m80.k
    public static final l60.s g(@m80.k okio.b bVar, @m80.k okio.f path) throws IOException {
        g0.p(bVar, "<this>");
        g0.p(path, "path");
        l60.s w02 = bVar.w0(path);
        if (w02 != null) {
            return w02;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @m80.l
    public static final okio.f h(@m80.k okio.b bVar, @m80.k okio.f path) throws IOException {
        g0.p(bVar, "<this>");
        g0.p(path, "path");
        okio.f i11 = bVar.v0(path).i();
        if (i11 == null) {
            return null;
        }
        okio.f t11 = path.t();
        g0.m(t11);
        return t11.z(i11);
    }
}
