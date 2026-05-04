package io.ktor.server.engine;

import io.ktor.server.engine.a;
import io.ktor.server.engine.a.C0709a;
import io.ktor.server.engine.internal.ReloadingException;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nEmbeddedServerJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedServerJvm.kt\nio/ktor/server/engine/EmbeddedServer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1368#2:398\n1454#2,5:399\n1368#2:404\n1454#2,5:405\n1863#2,2:410\n1557#2:412\n1628#2,3:413\n774#2:416\n865#2,2:417\n1619#2:419\n1863#2:420\n1864#2:422\n1620#2:423\n774#2:424\n865#2:425\n1755#2,3:426\n866#2:429\n1863#2,2:430\n1863#2,2:433\n1611#2,9:435\n1863#2:444\n1864#2:446\n1620#2:447\n1863#2,2:449\n1863#2,2:451\n1#3:421\n1#3:432\n1#3:445\n1#3:448\n*S KotlinDebug\n*F\n+ 1 EmbeddedServerJvm.kt\nio/ktor/server/engine/EmbeddedServer\n*L\n103#1:398\n103#1:399,5\n113#1:404\n113#1:405,5\n123#1:410,2\n164#1:412\n164#1:413,3\n166#1:416\n166#1:417,2\n179#1:419\n179#1:420\n179#1:422\n179#1:423\n181#1:424\n181#1:425\n182#1:426,3\n181#1:429\n218#1:430,2\n254#1:433,2\n259#1:435,9\n259#1:444\n259#1:446\n259#1:447\n333#1:449,2\n337#1:451,2\n179#1:421\n259#1:445\n*E\n"})
/* loaded from: classes8.dex */
public final class b1<TEngine extends io.ktor.server.engine.a, TConfiguration extends a.C0709a> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.v0 f61319a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final hx.c f61320b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final zx.f f61321c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final TConfiguration f61322d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ReentrantReadWriteLock f61323e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f61324f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public ClassLoader f61325g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public List<? extends WatchKey> f61326h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final List<String> f61327i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final List<String> f61328j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final List<String> f61329k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final List<String> f61330l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public zx.a f61331m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final TEngine f61332n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61333o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.a<zx.a> {
        public b(Object obj) {
            super(0, obj, b1.class, "currentApplication", "currentApplication()Lio/ktor/server/application/Application;", 0);
        }

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zx.a invoke() {
            return ((b1) this.receiver).m();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.engine.EmbeddedServer$start$3", f = "EmbeddedServerJvm.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.jvm.internal.u0({"SMAP\nEmbeddedServerJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedServerJvm.kt\nio/ktor/server/engine/EmbeddedServer$start$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n1863#2,2:398\n*S KotlinDebug\n*F\n+ 1 EmbeddedServerJvm.kt\nio/ktor/server/engine/EmbeddedServer$start$3\n*L\n285#1:398,2\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61334a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b1<TEngine, TConfiguration> f61335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b1<TEngine, TConfiguration> b1Var, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f61335b = b1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f61335b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f61334a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                TEngine p11 = this.f61335b.p();
                this.f61334a = 1;
                obj = p11.i(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            b1<TEngine, TConfiguration> b1Var = this.f61335b;
            for (o1 o1Var : (Iterable) obj) {
                String a11 = fy.k.a(o1Var.b());
                Logger c11 = b1Var.r().c();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Responding at ");
                String lowerCase = o1Var.getType().f().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
                sb2.append(lowerCase);
                sb2.append("://");
                sb2.append(a11);
                sb2.append(':');
                sb2.append(o1Var.a());
                c11.info(sb2.toString());
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends SimpleFileVisitor<Path> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashSet<Path> f61336a;

        public e(HashSet<Path> hashSet) {
            this.f61336a = hashSet;
        }

        public FileVisitResult a(Path dir, BasicFileAttributes attrs) {
            FileVisitResult fileVisitResult;
            kotlin.jvm.internal.g0.p(dir, "dir");
            kotlin.jvm.internal.g0.p(attrs, "attrs");
            this.f61336a.add(dir);
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }

        public FileVisitResult b(Path file, BasicFileAttributes attrs) {
            Path parent;
            FileVisitResult fileVisitResult;
            kotlin.jvm.internal.g0.p(file, "file");
            kotlin.jvm.internal.g0.p(attrs, "attrs");
            parent = file.getParent();
            if (parent != null) {
                this.f61336a.add(parent);
            }
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
            return a(u0.a(obj), basicFileAttributes);
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
            return b(u0.a(obj), basicFileAttributes);
        }
    }

    public b1(@m80.k zx.v0 rootConfig, @m80.k io.ktor.server.engine.b<? extends TEngine, TConfiguration> engineFactory, @m80.k x00.l<? super TConfiguration, yz.g2> engineConfigBlock) {
        kotlin.jvm.internal.g0.p(rootConfig, "rootConfig");
        kotlin.jvm.internal.g0.p(engineFactory, "engineFactory");
        kotlin.jvm.internal.g0.p(engineConfigBlock, "engineConfigBlock");
        this.f61319a = rootConfig;
        hx.c a11 = rootConfig.b().a();
        this.f61320b = a11;
        zx.f b11 = rootConfig.b();
        this.f61321c = b11;
        TConfiguration a12 = engineFactory.a(engineConfigBlock);
        this.f61322d = a12;
        this.f61323e = new ReentrantReadWriteLock();
        this.f61326h = a00.h0.J();
        ey.c d11 = b11.getConfig().d(y.f61466e);
        List<String> a13 = d11 != null ? d11.a() : null;
        a13 = a13 == null ? a00.h0.J() : a13;
        this.f61327i = a13;
        this.f61328j = a00.r0.I4(a13, rootConfig.f());
        ey.c d12 = b11.getConfig().d("ktor.application.modules");
        List<String> J = (d12 == null || (J = d12.a()) == null) ? a00.h0.J() : J;
        this.f61329k = J;
        this.f61330l = J;
        this.f61331m = new zx.a(b11, rootConfig.a(), rootConfig.e(), a11, rootConfig.d(), new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.b1.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, h10.o
            public Object get() {
                return ((b1) this.receiver).p();
            }
        });
        this.f61332n = engineFactory.b(b11, a11, rootConfig.a(), a12, new b(this));
        this.f61333o = yz.e0.c(new x00.a() { // from class: io.ktor.server.engine.x0
            @Override // x00.a
            public final Object invoke() {
                WatchService H;
                H = b1.H();
                return H;
            }
        });
    }

    public static /* synthetic */ b1 B(b1 b1Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return b1Var.A(z11);
    }

    public static final yz.g2 C(b1 b1Var) {
        F(b1Var, 0L, 0L, 3, null);
        return yz.g2.f100423a;
    }

    public static /* synthetic */ void F(b1 b1Var, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = b1Var.f61322d.e();
        }
        if ((i11 & 2) != 0) {
            j12 = b1Var.f61322d.e();
        }
        b1Var.D(j11, j12);
    }

    public static final WatchService H() {
        FileSystem fileSystem;
        WatchService newWatchService;
        try {
            fileSystem = FileSystems.getDefault();
            newWatchService = fileSystem.newWatchService();
            return newWatchService;
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public static final yz.g2 f(a.C0709a c0709a) {
        kotlin.jvm.internal.g0.p(c0709a, "<this>");
        return yz.g2.f100423a;
    }

    public static final yz.g2 v(b1 b1Var, ClassLoader classLoader, zx.a aVar) {
        Iterator<T> it = b1Var.f61330l.iterator();
        while (it.hasNext()) {
            b1Var.w((String) it.next(), classLoader, aVar);
        }
        Iterator<T> it2 = b1Var.f61319a.c().iterator();
        while (it2.hasNext()) {
            x00.l lVar = (x00.l) it2.next();
            try {
                b1Var.w(b2.a(lVar), classLoader, aVar);
            } catch (ReloadingException unused) {
                lVar.invoke(aVar);
            }
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 x(ClassLoader classLoader, String str, zx.a aVar) {
        fy.j.c(classLoader, str, aVar);
        return yz.g2.f100423a;
    }

    @m80.k
    public final b1<TEngine, TConfiguration> A(boolean z11) {
        j2.b(this, new x00.a() { // from class: io.ktor.server.engine.a1
            @Override // x00.a
            public final Object invoke() {
                yz.g2 C;
                C = b1.C(b1.this);
                return C;
            }
        });
        ReentrantReadWriteLock reentrantReadWriteLock = this.f61323e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            try {
                Pair<zx.a, ClassLoader> k11 = k();
                zx.a component1 = k11.component1();
                ClassLoader component2 = k11.component2();
                this.f61331m = component1;
                this.f61325g = component2;
                yz.g2 g2Var = yz.g2.f100423a;
                while (i11 < readHoldCount) {
                    readLock.lock();
                    i11++;
                }
                writeLock.unlock();
                c40.k.f(c40.s0.a(o().getCoroutineContext()), null, null, new d(this, null), 3, null);
                this.f61332n.b(z11);
                return this;
            } finally {
            }
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void D(long j11, long j12) {
        E(j11, j12, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Finally extract failed */
    public final void E(long j11, long j12, @m80.k TimeUnit timeUnit) {
        kotlin.jvm.internal.g0.p(timeUnit, "timeUnit");
        try {
            this.f61332n.d(timeUnit.toMillis(j11), timeUnit.toMillis(j12));
        } catch (Exception e11) {
            this.f61321c.c().warn("Exception occurred during engine shutdown", (Throwable) e11);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f61323e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            n();
            yz.g2 g2Var = yz.g2.f100423a;
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            if (this.f61328j.isEmpty()) {
                return;
            }
            j();
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final void G(List<URL> list) {
        WatchKey watchKey;
        WatchEvent.Kind kind;
        WatchEvent.Kind kind2;
        WatchEvent.Kind kind3;
        Object m6308constructorimpl;
        boolean exists;
        boolean isDirectory;
        Path path;
        HashSet hashSet = new HashSet();
        Iterator<URL> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String path2 = it.next().getPath();
            if (path2 != null) {
                String decode = URLDecoder.decode(path2, "utf-8");
                try {
                    Result.a aVar = Result.Companion;
                    path = new File(decode).toPath();
                    m6308constructorimpl = Result.m6308constructorimpl(path);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                Path a11 = u0.a(Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
                if (a11 != null) {
                    exists = Files.exists(a11, new LinkOption[0]);
                    if (exists) {
                        e eVar = new e(hashSet);
                        isDirectory = Files.isDirectory(a11, new LinkOption[0]);
                        if (isDirectory) {
                            Files.walkFileTree(a11, h0.a(eVar));
                        }
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Path a12 = u0.a(it2.next());
            this.f61321c.c().debug("Watching " + a12 + " for changes.");
        }
        WatchEvent.Modifier k11 = fy.h.k();
        WatchEvent.Modifier[] modifierArr = k11 != null ? new WatchEvent.Modifier[]{k11} : new WatchEvent.Modifier[0];
        ArrayList arrayList = new ArrayList();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            Path a13 = u0.a(it3.next());
            WatchService t11 = t();
            if (t11 != null) {
                kind = StandardWatchEventKinds.ENTRY_CREATE;
                kind2 = StandardWatchEventKinds.ENTRY_DELETE;
                kind3 = StandardWatchEventKinds.ENTRY_MODIFY;
                watchKey = a13.register(t11, new WatchEvent.Kind[]{kind, kind2, kind3}, (WatchEvent.Modifier[]) Arrays.copyOf(modifierArr, modifierArr.length));
            } else {
                watchKey = null;
            }
            if (watchKey != null) {
                arrayList.add(watchKey);
            }
        }
        this.f61326h = arrayList;
    }

    public final void h(x00.a<yz.g2> aVar) {
        try {
            aVar.invoke();
        } finally {
            List<String> list = fy.h.j().get();
            if (list != null && list.isEmpty()) {
                fy.h.j().remove();
            }
        }
    }

    public final void i(String str, x00.a<yz.g2> aVar) {
        ThreadLocal<List<String>> j11 = fy.h.j();
        List<String> list = j11.get();
        if (list == null) {
            list = new ArrayList<>(1);
            j11.set(list);
        }
        List<String> list2 = list;
        if (list2.contains(str)) {
            throw new IllegalStateException(("Module startup is already in progress for function " + str + " (recursive module startup from module main?)").toString());
        }
        list2.add(str);
        try {
            aVar.invoke();
        } finally {
            list2.remove(str);
        }
    }

    public final void j() {
        try {
            WatchService t11 = t();
            if (t11 != null) {
                t11.close();
            }
        } catch (NoClassDefFoundError unused) {
        }
    }

    public final Pair<zx.a, ClassLoader> k() {
        ClassLoader l11 = l();
        Thread currentThread = Thread.currentThread();
        ClassLoader contextClassLoader = currentThread.getContextClassLoader();
        currentThread.setContextClassLoader(l11);
        try {
            return yz.h1.a(u(l11), l11);
        } finally {
            currentThread.setContextClassLoader(contextClassLoader);
        }
    }

    public final ClassLoader l() {
        ClassLoader b11 = this.f61321c.b();
        if (!this.f61319a.a()) {
            this.f61321c.c().info("Autoreload is disabled because the development mode is off.");
            return b11;
        }
        List<String> list = this.f61328j;
        if (list.isEmpty()) {
            this.f61321c.c().info("No ktor.deployment.watch patterns specified, automatic reload is not active.");
            return b11;
        }
        Set<URL> a11 = t.a(b11);
        String parent = new File(System.getProperty("java.home")).getParent();
        Set<URL> set = a11;
        ArrayList arrayList = new ArrayList(a00.i0.d0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((URL) it.next()).getFile());
        }
        this.f61321c.c().debug("Java Home: " + parent);
        Logger c11 = this.f61321c.c();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Class Loader: ");
        sb2.append(b11);
        sb2.append(": ");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = ((String) obj).toString();
            kotlin.jvm.internal.g0.m(parent);
            if (!u30.f0.J2(str, parent, false, 2, null)) {
                arrayList2.add(obj);
            }
        }
        sb2.append(arrayList2);
        c11.debug(sb2.toString());
        List Q = a00.h0.Q(zx.f.class, io.ktor.util.pipeline.c.class, ix.g1.class, x00.l.class, Logger.class, io.ktor.utils.io.g.class, y40.c0.class, xy.b.class);
        HashSet hashSet = new HashSet();
        Iterator it2 = Q.iterator();
        while (it2.hasNext()) {
            URL location = ((Class) it2.next()).getProtectionDomain().getCodeSource().getLocation();
            if (location != null) {
                hashSet.add(location);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : set) {
            URL url = (URL) obj2;
            if (!hashSet.contains(url)) {
                List<String> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (e1.a(url, (String) it3.next())) {
                            String path = url.getPath();
                            if (path == null) {
                                path = "";
                            }
                            kotlin.jvm.internal.g0.m(parent);
                            if (!u30.f0.J2(path, parent, false, 2, null)) {
                                arrayList3.add(obj2);
                            }
                        }
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            this.f61321c.c().info("No ktor.deployment.watch patterns match classpath entries, automatic reload is not active");
            return b11;
        }
        G(arrayList3);
        return new z1(arrayList3, b11);
    }

    /* JADX WARN: Finally extract failed */
    public final zx.a m() {
        Object context;
        List pollEvents;
        List pollEvents2;
        ReentrantReadWriteLock.ReadLock readLock = this.f61323e.readLock();
        readLock.lock();
        try {
            zx.a aVar = this.f61331m;
            if (aVar == null) {
                throw new IllegalStateException("EmbeddedServer was stopped");
            }
            if (this.f61319a.a()) {
                List<? extends WatchKey> list = this.f61326h;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    pollEvents2 = f0.a(it.next()).pollEvents();
                    kotlin.jvm.internal.g0.o(pollEvents2, "pollEvents(...)");
                    a00.m0.s0(arrayList, pollEvents2);
                }
                if (!arrayList.isEmpty()) {
                    this.f61321c.c().info("Changes in application detected.");
                    int size = arrayList.size();
                    while (true) {
                        Thread.sleep(200L);
                        List<? extends WatchKey> list2 = this.f61326h;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            pollEvents = f0.a(it2.next()).pollEvents();
                            kotlin.jvm.internal.g0.o(pollEvents, "pollEvents(...)");
                            a00.m0.s0(arrayList2, pollEvents);
                        }
                        if (arrayList2.isEmpty()) {
                            break;
                        }
                        this.f61321c.c().debug("Waiting for more changes.");
                        size += arrayList2.size();
                    }
                    this.f61321c.c().debug("Changes to " + size + " files caused application restart.");
                    Iterator it3 = a00.r0.O5(arrayList, 5).iterator();
                    while (it3.hasNext()) {
                        WatchEvent a11 = q0.a(it3.next());
                        Logger c11 = this.f61321c.c();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("...  ");
                        context = a11.context();
                        sb2.append(context);
                        c11.debug(sb2.toString());
                    }
                    ReentrantReadWriteLock reentrantReadWriteLock = this.f61323e;
                    ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                    int i11 = 0;
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i12 = 0; i12 < readHoldCount; i12++) {
                        readLock2.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        n();
                        Pair<zx.a, ClassLoader> k11 = k();
                        zx.a component1 = k11.component1();
                        ClassLoader component2 = k11.component2();
                        this.f61331m = component1;
                        this.f61325g = component2;
                        yz.g2 g2Var = yz.g2.f100423a;
                        while (i11 < readHoldCount) {
                            readLock2.lock();
                            i11++;
                        }
                        writeLock.unlock();
                        aVar = this.f61331m;
                        if (aVar == null) {
                            throw new IllegalStateException("EmbeddedServer was stopped");
                        }
                    } catch (Throwable th2) {
                        while (i11 < readHoldCount) {
                            readLock2.lock();
                            i11++;
                        }
                        writeLock.unlock();
                        throw th2;
                    }
                }
            }
            readLock.unlock();
            return aVar;
        } catch (Throwable th3) {
            readLock.unlock();
            throw th3;
        }
    }

    public final void n() {
        zx.a aVar = this.f61331m;
        ClassLoader classLoader = this.f61325g;
        this.f61331m = null;
        this.f61325g = null;
        if (aVar != null) {
            z(zx.c0.e(), aVar);
            try {
                aVar.l0();
                z1 z1Var = classLoader instanceof z1 ? (z1) classLoader : null;
                if (z1Var != null) {
                    z1Var.close();
                }
            } catch (Throwable th2) {
                this.f61321c.c().error("Failed to destroy application instance.", th2);
            }
            z(zx.c0.d(), aVar);
        }
        Iterator<T> it = this.f61326h.iterator();
        while (it.hasNext()) {
            f0.a(it.next()).cancel();
        }
        this.f61326h = new ArrayList();
    }

    @m80.k
    public final zx.a o() {
        return m();
    }

    @m80.k
    public final TEngine p() {
        return this.f61332n;
    }

    @m80.k
    public final TConfiguration q() {
        return this.f61322d;
    }

    @m80.k
    public final zx.f r() {
        return this.f61321c;
    }

    @m80.k
    public final hx.c s() {
        return this.f61320b;
    }

    public final WatchService t() {
        return o0.a(this.f61333o.getValue());
    }

    public final zx.a u(final ClassLoader classLoader) {
        final zx.a aVar;
        if (this.f61324f || (aVar = this.f61331m) == null) {
            aVar = new zx.a(this.f61321c, this.f61319a.a(), this.f61319a.e(), this.f61320b, this.f61319a.d(), new PropertyReference0Impl(this) { // from class: io.ktor.server.engine.b1.c
                @Override // kotlin.jvm.internal.PropertyReference0Impl, h10.o
                public Object get() {
                    return ((b1) this.receiver).p();
                }
            });
        } else {
            this.f61324f = true;
            kotlin.jvm.internal.g0.m(aVar);
        }
        z(zx.c0.b(), aVar);
        h(new x00.a() { // from class: io.ktor.server.engine.z0
            @Override // x00.a
            public final Object invoke() {
                yz.g2 v11;
                v11 = b1.v(b1.this, classLoader, aVar);
                return v11;
            }
        });
        z(zx.c0.a(), aVar);
        return aVar;
    }

    public final void w(final String str, final ClassLoader classLoader, final zx.a aVar) {
        i(str, new x00.a() { // from class: io.ktor.server.engine.w0
            @Override // x00.a
            public final Object invoke() {
                yz.g2 x11;
                x11 = b1.x(classLoader, str, aVar);
                return x11;
            }
        });
    }

    public final void y() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f61323e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            n();
            Pair<zx.a, ClassLoader> k11 = k();
            zx.a component1 = k11.component1();
            ClassLoader component2 = k11.component2();
            this.f61331m = component1;
            this.f61325g = component2;
            yz.g2 g2Var = yz.g2.f100423a;
        } finally {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        }
    }

    public final void z(hx.a<zx.a> aVar, zx.a aVar2) {
        hx.d.b(this.f61320b, aVar, aVar2, null, 4, null);
    }

    public /* synthetic */ b1(zx.v0 v0Var, io.ktor.server.engine.b bVar, x00.l lVar, int i11, kotlin.jvm.internal.v vVar) {
        this(v0Var, bVar, (i11 & 4) != 0 ? new x00.l() { // from class: io.ktor.server.engine.y0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 f11;
                f11 = b1.f((a.C0709a) obj);
                return f11;
            }
        } : lVar);
    }
}
