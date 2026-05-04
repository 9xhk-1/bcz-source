package t00;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.path.CopyActionResult;
import kotlin.io.path.IllegalFileNameException;
import kotlin.io.path.OnErrorResult;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,532:1\n378#1,2:536\n386#1:538\n386#1:539\n380#1,4:540\n378#1,2:544\n386#1:546\n380#1,4:547\n386#1:551\n378#1,6:552\n378#1,2:558\n386#1:560\n380#1,4:561\n1#2:533\n1869#3,2:534\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n394#1:536,2\n409#1:538\n412#1:539\n394#1:540,4\n420#1:544,2\n421#1:546\n420#1:547,4\n432#1:551\n440#1:552,6\n463#1:558,2\n464#1:560\n463#1:561,4\n314#1:534,2\n*E\n"})
/* loaded from: classes8.dex */
public class p1 extends l0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89166a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f89167b;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89166a = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f89167b = iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f89168a = new b();

        public final Void a(Path path, Path path2, Exception exception) {
            kotlin.jvm.internal.g0.p(path, "<unused var>");
            kotlin.jvm.internal.g0.p(path2, "<unused var>");
            kotlin.jvm.internal.g0.p(exception, "exception");
            throw exception;
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(io.ktor.server.engine.u0.a(obj), io.ktor.server.engine.u0.a(obj2), (Exception) obj3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements x00.q {

        /* renamed from: a, reason: collision with root package name */
        public static final c f89169a = new c();

        public final Void a(Path path, Path path2, Exception exception) {
            kotlin.jvm.internal.g0.p(path, "<unused var>");
            kotlin.jvm.internal.g0.p(path2, "<unused var>");
            kotlin.jvm.internal.g0.p(exception, "exception");
            throw exception;
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(io.ktor.server.engine.u0.a(obj), io.ktor.server.engine.u0.a(obj2), (Exception) obj3);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements x00.p<Path, BasicFileAttributes, FileVisitResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList<Path> f89170a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.q<t00.a, Path, Path, CopyActionResult> f89171b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Path f89172c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Path f89173d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Path f89174e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.q<Path, Path, Exception, OnErrorResult> f89175f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ArrayList<Path> arrayList, x00.q<? super t00.a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, Path path3, x00.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
            super(2, g0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
            this.f89170a = arrayList;
            this.f89171b = qVar;
            this.f89172c = path;
            this.f89173d = path2;
            this.f89174e = path3;
            this.f89175f = qVar2;
        }

        public final FileVisitResult a(Path p02, BasicFileAttributes p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return p1.T(this.f89170a, this.f89171b, this.f89172c, this.f89173d, this.f89174e, this.f89175f, p02, p12);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, BasicFileAttributes basicFileAttributes) {
            return a(io.ktor.server.engine.u0.a(path), q1.a(basicFileAttributes));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements x00.p<Path, Exception, FileVisitResult> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.q<Path, Path, Exception, OnErrorResult> f89176a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Path f89177b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Path f89178c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Path f89179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(x00.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2, Path path3) {
            super(2, g0.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
            this.f89176a = qVar;
            this.f89177b = path;
            this.f89178c = path2;
            this.f89179d = path3;
        }

        public final FileVisitResult a(Path p02, Exception p12) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            kotlin.jvm.internal.g0.p(p12, "p1");
            return p1.X(this.f89176a, this.f89177b, this.f89178c, this.f89179d, p02, p12);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ FileVisitResult invoke(Path path, Exception exc) {
            return a(io.ktor.server.engine.u0.a(path), exc);
        }
    }

    public static final void O(@m80.k Path path) {
        kotlin.jvm.internal.g0.p(path, "<this>");
        String d12 = w2.d1(path);
        int hashCode = d12.hashCode();
        if (hashCode != 46) {
            if (hashCode != 1518) {
                if (hashCode != 45679) {
                    if (hashCode != 45724) {
                        if (hashCode != 1472) {
                            if (hashCode != 1473 || !d12.equals("./")) {
                                return;
                            }
                        } else if (!d12.equals(zr.m.f102856e)) {
                            return;
                        }
                    } else if (!d12.equals("..\\")) {
                        return;
                    }
                } else if (!d12.equals("../")) {
                    return;
                }
            } else if (!d12.equals(".\\")) {
                return;
            }
        } else if (!d12.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }

    public static final void P(Path path, Path path2) {
        boolean isSymbolicLink;
        boolean isSameFile;
        isSymbolicLink = Files.isSymbolicLink(path);
        if (isSymbolicLink) {
            return;
        }
        isSameFile = Files.isSameFile(path, path2);
        if (isSameFile) {
            a0.a();
            throw z.a(path.toString());
        }
    }

    public static final void Q(m mVar, x00.a<yz.g2> aVar) {
        try {
            aVar.invoke();
        } catch (Exception e11) {
            mVar.a(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r7 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        if (r3 == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    @yz.y0(version = "1.8")
    @t00.n
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.nio.file.Path R(@m80.k final java.nio.file.Path r9, @m80.k final java.nio.file.Path r10, @m80.k final x00.q<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r11, boolean r12, @m80.k final x00.q<? super t00.a, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r13) {
        /*
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r1)
            java.lang.String r1 = "target"
            kotlin.jvm.internal.g0.p(r10, r1)
            java.lang.String r1 = "onError"
            kotlin.jvm.internal.g0.p(r11, r1)
            java.lang.String r1 = "copyAction"
            kotlin.jvm.internal.g0.p(r13, r1)
            t00.t r1 = t00.t.f89184a
            java.nio.file.LinkOption[] r1 = r1.a(r12)
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = io.ktor.server.engine.v0.a(r9, r1)
            if (r1 == 0) goto Le0
            r1 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = io.ktor.server.engine.v0.a(r9, r3)
            if (r3 == 0) goto Lc3
            if (r12 != 0) goto L45
            boolean r3 = t00.i1.a(r9)
            if (r3 != 0) goto Lc3
        L45:
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = io.ktor.server.engine.v0.a(r10, r3)
            r5 = 1
            if (r3 == 0) goto L5c
            boolean r3 = t00.i1.a(r10)
            if (r3 != 0) goto L5c
            r3 = r5
            goto L5d
        L5c:
            r3 = r1
        L5d:
            if (r3 == 0) goto L65
            boolean r7 = t00.c0.a(r9, r10)
            if (r7 != 0) goto Lc3
        L65:
            java.nio.file.FileSystem r7 = t00.v.a(r9)
            java.nio.file.FileSystem r8 = t00.v.a(r10)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
            if (r7 != 0) goto L74
            goto Lae
        L74:
            if (r3 == 0) goto L87
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r3 = t00.h1.a(r10, r3)
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r1 = t00.h1.a(r9, r1)
            boolean r1 = t00.g1.a(r3, r1)
            goto Lae
        L87:
            java.nio.file.Path r3 = io.ktor.server.engine.c1.a(r10)
            if (r3 == 0) goto Lae
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = io.ktor.server.engine.v0.a(r3, r7)
            if (r7 == 0) goto Lae
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r3 = t00.h1.a(r3, r7)
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r7 = t00.h1.a(r9, r7)
            boolean r3 = t00.g1.a(r3, r7)
            if (r3 == 0) goto Lae
            r1 = r5
        Lae:
            if (r1 != 0) goto Lb1
            goto Lc3
        Lb1:
            t00.l.a()
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = r10.toString()
            java.lang.String r2 = "Recursively copying a directory into its subdirectory is prohibited."
            java.nio.file.FileSystemException r0 = t00.a1.a(r0, r1, r2)
            throw r0
        Lc3:
            java.nio.file.Path r5 = xy.c1.a(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            t00.m1 r3 = new t00.m1
            r4 = r10
            r6 = r11
            r2 = r13
            r0 = r3
            r3 = r9
            r0.<init>()
            r4 = 1
            r5 = 0
            r1 = 0
            r2 = r12
            r3 = r0
            r0 = r9
            t00.w2.O1(r0, r1, r2, r3, r4, r5)
            return r10
        Le0:
            t00.b1.a()
            java.lang.String r0 = r9.toString()
            java.lang.String r1 = r10.toString()
            java.lang.String r2 = "The source file doesn't exist."
            java.nio.file.NoSuchFileException r0 = t00.z0.a(r0, r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.p1.R(java.nio.file.Path, java.nio.file.Path, x00.q, boolean, x00.q):java.nio.file.Path");
    }

    @yz.y0(version = "1.8")
    @n
    @m80.k
    public static final Path S(@m80.k Path path, @m80.k Path target, @m80.k x00.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, final boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(path, "<this>");
        kotlin.jvm.internal.g0.p(target, "target");
        kotlin.jvm.internal.g0.p(onError, "onError");
        return z12 ? R(path, target, onError, z11, new x00.q() { // from class: t00.l1
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                CopyActionResult Y;
                Y = p1.Y(z11, (a) obj, (Path) obj2, (Path) obj3);
                return Y;
            }
        }) : U(path, target, onError, z11, null, 8, null);
    }

    public static final FileVisitResult T(ArrayList<Path> arrayList, x00.q<? super t00.a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, Path path3, x00.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                O(path4);
                Object u32 = a00.r0.u3(arrayList);
                kotlin.jvm.internal.g0.o(u32, "last(...)");
                P(path4, io.ktor.server.engine.u0.a(u32));
            }
            return k0(qVar.invoke(t00.d.f89134a, path4, W(path, path2, path3, path4)));
        } catch (Exception e11) {
            return X(qVar2, path, path2, path3, path4, e11);
        }
    }

    public static /* synthetic */ Path U(Path path, Path path2, x00.q qVar, final boolean z11, x00.q qVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            qVar = c.f89169a;
        }
        if ((i11 & 8) != 0) {
            qVar2 = new x00.q() { // from class: t00.k1
                @Override // x00.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    CopyActionResult Z;
                    Z = p1.Z(z11, (a) obj2, (Path) obj3, (Path) obj4);
                    return Z;
                }
            };
        }
        return R(path, path2, qVar, z11, qVar2);
    }

    public static /* synthetic */ Path V(Path path, Path path2, x00.q qVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            qVar = b.f89168a;
        }
        return S(path, path2, qVar, z11, z12);
    }

    public static final Path W(Path path, Path path2, Path path3, Path path4) {
        Path resolve;
        Path normalize;
        boolean startsWith;
        resolve = path2.resolve(w2.C1(path4, path).toString());
        normalize = resolve.normalize();
        startsWith = normalize.startsWith(path3);
        if (!startsWith) {
            throw new IllegalFileNameException(path4, resolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        kotlin.jvm.internal.g0.m(resolve);
        return resolve;
    }

    public static final FileVisitResult X(x00.q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar, Path path, Path path2, Path path3, Path path4, Exception exc) {
        return l0(qVar.invoke(path4, W(path, path2, path3, path4), exc));
    }

    public static final CopyActionResult Y(boolean z11, t00.a copyToRecursively, Path src, Path dst) {
        LinkOption linkOption;
        boolean isDirectory;
        boolean isDirectory2;
        StandardCopyOption standardCopyOption;
        Path copy;
        kotlin.jvm.internal.g0.p(copyToRecursively, "$this$copyToRecursively");
        kotlin.jvm.internal.g0.p(src, "src");
        kotlin.jvm.internal.g0.p(dst, "dst");
        LinkOption[] a11 = t.f89184a.a(z11);
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a11, a11.length);
        isDirectory2 = Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (!isDirectory2 || !isDirectory) {
            if (isDirectory) {
                d0(dst);
            }
            kotlin.jvm.internal.v0 v0Var = new kotlin.jvm.internal.v0(2);
            v0Var.b(a11);
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            v0Var.a(standardCopyOption);
            CopyOption[] copyOptionArr = (CopyOption[]) v0Var.d(new CopyOption[v0Var.c()]);
            copy = Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
            kotlin.jvm.internal.g0.o(copy, "copy(...)");
        }
        return CopyActionResult.CONTINUE;
    }

    public static final CopyActionResult Z(boolean z11, t00.a aVar, Path src, Path dst) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(src, "src");
        kotlin.jvm.internal.g0.p(dst, "dst");
        return aVar.a(src, dst, z11);
    }

    public static final FileVisitResult a0(ArrayList arrayList, x00.q qVar, Path path, Path path2, Path path3, x00.q qVar2, Path directory, BasicFileAttributes attributes) {
        FileVisitResult fileVisitResult;
        kotlin.jvm.internal.g0.p(directory, "directory");
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        FileVisitResult T = T(arrayList, qVar, path, path2, path3, qVar2, directory, attributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (T == fileVisitResult) {
            arrayList.add(directory);
        }
        return T;
    }

    public static final FileVisitResult b0(ArrayList arrayList, x00.q qVar, Path path, Path path2, Path path3, Path directory, IOException iOException) {
        FileVisitResult fileVisitResult;
        kotlin.jvm.internal.g0.p(directory, "directory");
        a00.m0.Q0(arrayList);
        if (iOException != null) {
            return X(qVar, path, path2, path3, directory, iOException);
        }
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    public static final yz.g2 c0(final ArrayList arrayList, final x00.q qVar, final Path path, final Path path2, final Path path3, final x00.q qVar2, o visitFileTree) {
        kotlin.jvm.internal.g0.p(visitFileTree, "$this$visitFileTree");
        visitFileTree.c(new x00.p() { // from class: t00.n1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                FileVisitResult a02;
                a02 = p1.a0(arrayList, qVar, path, path2, path3, qVar2, (Path) obj, (BasicFileAttributes) obj2);
                return a02;
            }
        });
        visitFileTree.a(new d(arrayList, qVar, path, path2, path3, qVar2));
        visitFileTree.d(new e(qVar2, path, path2, path3));
        visitFileTree.b(new x00.p() { // from class: t00.o1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                FileVisitResult b02;
                b02 = p1.b0(arrayList, qVar2, path, path2, path3, (Path) obj, (IOException) obj2);
                return b02;
            }
        });
        return yz.g2.f100423a;
    }

    @yz.y0(version = "1.8")
    @n
    public static final void d0(@m80.k Path path) {
        kotlin.jvm.internal.g0.p(path, "<this>");
        List<Exception> e02 = e0(path);
        if (e02.isEmpty()) {
            return;
        }
        FileSystemException a11 = k.a("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterator<T> it = e02.iterator();
        while (it.hasNext()) {
            yz.r.a(a11, (Exception) it.next());
        }
        throw a11;
    }

    public static final List<Exception> e0(Path path) {
        Path fileName;
        Path parent;
        DirectoryStream directoryStream;
        FileSystem fileSystem;
        boolean z11 = false;
        boolean z12 = true;
        m mVar = new m(0, 1, null);
        fileName = path.getFileName();
        if (fileName != null) {
            parent = path.getParent();
            if (parent == null) {
                fileSystem = path.getFileSystem();
                parent = fileSystem.getPath("", new String[0]);
            }
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    DirectoryStream a11 = d1.a(directoryStream);
                    if (e1.a(a11)) {
                        mVar.g(parent);
                        g0(f1.a(a11), fileName, null, mVar);
                    } else {
                        z11 = true;
                    }
                    yz.g2 g2Var = yz.g2.f100423a;
                    r00.b.a(directoryStream, null);
                    z12 = z11;
                } finally {
                }
            }
        }
        if (z12) {
            i0(path, null, mVar);
        }
        return mVar.d();
    }

    public static final void f0(SecureDirectoryStream<Path> secureDirectoryStream, Path path, m mVar) {
        SecureDirectoryStream secureDirectoryStream2;
        Iterator it;
        Path fileName;
        LinkOption linkOption;
        try {
            try {
                linkOption = LinkOption.NOFOLLOW_LINKS;
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, linkOption);
            } catch (Exception e11) {
                mVar.a(e11);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 == null) {
            return;
        }
        try {
            SecureDirectoryStream a11 = f1.a(secureDirectoryStream2);
            it = a11.iterator();
            kotlin.jvm.internal.g0.o(it, "iterator(...)");
            while (it.hasNext()) {
                fileName = io.ktor.server.engine.u0.a(it.next()).getFileName();
                kotlin.jvm.internal.g0.o(fileName, "getFileName(...)");
                g0(a11, fileName, mVar.e(), mVar);
            }
            yz.g2 g2Var = yz.g2.f100423a;
            r00.b.a(secureDirectoryStream2, null);
        } finally {
        }
    }

    public static final void g0(SecureDirectoryStream<Path> secureDirectoryStream, Path path, Path path2, m mVar) {
        LinkOption linkOption;
        mVar.b(path);
        if (path2 != null) {
            try {
                Path e11 = mVar.e();
                kotlin.jvm.internal.g0.m(e11);
                O(e11);
                P(e11, path2);
            } catch (Exception e12) {
                mVar.a(e12);
            }
        }
        linkOption = LinkOption.NOFOLLOW_LINKS;
        if (j0(secureDirectoryStream, path, linkOption)) {
            int f11 = mVar.f();
            f0(secureDirectoryStream, path, mVar);
            if (f11 == mVar.f()) {
                secureDirectoryStream.deleteDirectory(path);
                yz.g2 g2Var = yz.g2.f100423a;
            }
            mVar.c(path);
        }
        secureDirectoryStream.deleteFile(path);
        yz.g2 g2Var2 = yz.g2.f100423a;
        mVar.c(path);
    }

    public static final void h0(Path path, m mVar) {
        DirectoryStream directoryStream;
        Iterator it;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (Exception e11) {
                mVar.a(e11);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream == null) {
            return;
        }
        try {
            it = d1.a(directoryStream).iterator();
            kotlin.jvm.internal.g0.o(it, "iterator(...)");
            while (it.hasNext()) {
                Path a11 = io.ktor.server.engine.u0.a(it.next());
                kotlin.jvm.internal.g0.m(a11);
                i0(a11, path, mVar);
            }
            yz.g2 g2Var = yz.g2.f100423a;
            r00.b.a(directoryStream, null);
        } finally {
        }
    }

    public static final void i0(Path path, Path path2, m mVar) {
        LinkOption linkOption;
        boolean isDirectory;
        if (path2 != null) {
            try {
                O(path);
                P(path, path2);
            } catch (Exception e11) {
                mVar.a(e11);
                return;
            }
        }
        linkOption = LinkOption.NOFOLLOW_LINKS;
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
        if (!isDirectory) {
            Files.deleteIfExists(path);
            return;
        }
        int f11 = mVar.f();
        h0(path, mVar);
        if (f11 == mVar.f()) {
            Files.deleteIfExists(path);
        }
    }

    public static final boolean j0(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        FileAttributeView fileAttributeView;
        BasicFileAttributes readAttributes;
        boolean isDirectory;
        try {
            fileAttributeView = secureDirectoryStream.getFileAttributeView(path, q0.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
            readAttributes = s0.a(fileAttributeView).readAttributes();
            isDirectory = readAttributes.isDirectory();
            bool = Boolean.valueOf(isDirectory);
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @n
    public static final FileVisitResult k0(CopyActionResult copyActionResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        FileVisitResult fileVisitResult3;
        int i11 = a.f89166a[copyActionResult.ordinal()];
        if (i11 == 1) {
            fileVisitResult = FileVisitResult.CONTINUE;
            return fileVisitResult;
        }
        if (i11 == 2) {
            fileVisitResult2 = FileVisitResult.TERMINATE;
            return fileVisitResult2;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult3 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult3;
    }

    @n
    public static final FileVisitResult l0(OnErrorResult onErrorResult) {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        int i11 = a.f89167b[onErrorResult.ordinal()];
        if (i11 == 1) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        fileVisitResult2 = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult2;
    }

    public static final <R> R m0(x00.a<? extends R> aVar) {
        try {
            return aVar.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
