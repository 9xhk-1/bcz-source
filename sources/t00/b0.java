package t00;

import com.jiongji.andriod.card.R;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.io.path.PathWalkOption;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b0 implements q30.m<Path> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Path f89105a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final PathWalkOption[] f89106b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {191, 197}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded"}, nl = {193, 199}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0"}, v = 2)
    @kotlin.jvm.internal.u0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n101#1:181,19\n*E\n"})
    public static final class a extends RestrictedSuspendLambda implements x00.p<q30.o<? super Path>, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f89107a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89108b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89109c;

        /* renamed from: d, reason: collision with root package name */
        public Object f89110d;

        /* renamed from: e, reason: collision with root package name */
        public Object f89111e;

        /* renamed from: f, reason: collision with root package name */
        public Object f89112f;

        /* renamed from: g, reason: collision with root package name */
        public Object f89113g;

        /* renamed from: h, reason: collision with root package name */
        public Object f89114h;

        /* renamed from: i, reason: collision with root package name */
        public int f89115i;

        /* renamed from: j, reason: collision with root package name */
        public int f89116j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f89117k;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            a aVar = b0.this.new a(cVar);
            aVar.f89117k = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
        
            r2 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 389
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t00.b0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super Path> oVar, j00.c<? super yz.g2> cVar) {
            return ((a) create(oVar, cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {191, 197, 210, R.styleable.Theme_drawable_right_arrow}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "node$iv", "entriesReader$iv", "path$iv", "$i$f$yieldIfNeeded"}, nl = {193, 199, 212, 218}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0"}, v = 2)
    @kotlin.jvm.internal.u0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n44#2,19:200\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n70#1:181,19\n81#1:200,19\n*E\n"})
    public static final class b extends RestrictedSuspendLambda implements x00.p<q30.o<? super Path>, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f89119a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89120b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89121c;

        /* renamed from: d, reason: collision with root package name */
        public Object f89122d;

        /* renamed from: e, reason: collision with root package name */
        public Object f89123e;

        /* renamed from: f, reason: collision with root package name */
        public Object f89124f;

        /* renamed from: g, reason: collision with root package name */
        public Object f89125g;

        /* renamed from: h, reason: collision with root package name */
        public Object f89126h;

        /* renamed from: i, reason: collision with root package name */
        public Object f89127i;

        /* renamed from: j, reason: collision with root package name */
        public Object f89128j;

        /* renamed from: k, reason: collision with root package name */
        public Object f89129k;

        /* renamed from: l, reason: collision with root package name */
        public int f89130l;

        /* renamed from: m, reason: collision with root package name */
        public int f89131m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f89132n;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            b bVar = b0.this.new b(cVar);
            bVar.f89132n = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x01de, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01d8, code lost:
        
            if (r1.b(r12, r17) == r2) goto L72;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 784
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t00.b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super Path> oVar, j00.c<? super yz.g2> cVar) {
            return ((b) create(oVar, cVar)).invokeSuspend(yz.g2.f100423a);
        }
    }

    public b0(@m80.k Path start, @m80.k PathWalkOption[] options) {
        kotlin.jvm.internal.g0.p(start, "start");
        kotlin.jvm.internal.g0.p(options, "options");
        this.f89105a = start;
        this.f89106b = options;
    }

    public final Iterator<Path> g() {
        return q30.q.a(new a(null));
    }

    public final Iterator<Path> h() {
        return q30.q.a(new b(null));
    }

    public final boolean i() {
        return a00.a0.B8(this.f89106b, PathWalkOption.FOLLOW_LINKS);
    }

    @Override // q30.m
    @m80.k
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }

    public final boolean j() {
        return a00.a0.B8(this.f89106b, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    public final LinkOption[] k() {
        return t.f89184a.a(i());
    }

    public final boolean l() {
        return a00.a0.B8(this.f89106b, PathWalkOption.BREADTH_FIRST);
    }

    public final Object m(q30.o<? super Path> oVar, u uVar, g gVar, x00.l<? super List<u>, yz.g2> lVar, j00.c<? super yz.g2> cVar) {
        boolean isDirectory;
        LinkOption linkOption;
        boolean exists;
        boolean c11;
        boolean isDirectory2;
        Path d11 = uVar.d();
        if (uVar.c() != null) {
            p1.O(d11);
        }
        LinkOption[] k11 = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k11, k11.length);
        isDirectory = Files.isDirectory(d11, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (isDirectory) {
            c11 = d0.c(uVar);
            if (c11) {
                a0.a();
                throw z.a(d11.toString());
            }
            if (j()) {
                kotlin.jvm.internal.d0.e(0);
                oVar.b(d11, cVar);
                kotlin.jvm.internal.d0.e(1);
            }
            LinkOption[] k12 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k12, k12.length);
            isDirectory2 = Files.isDirectory(d11, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            if (isDirectory2) {
                lVar.invoke(gVar.c(uVar));
            }
        } else {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(d11, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (exists) {
                kotlin.jvm.internal.d0.e(0);
                oVar.b(d11, cVar);
                kotlin.jvm.internal.d0.e(1);
                return yz.g2.f100423a;
            }
        }
        return yz.g2.f100423a;
    }
}
