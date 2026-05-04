package v5;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import oa0.r;
import okio.f;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {d.class})
@u0({"SMAP\nFileDownloadRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileDownloadRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/FileDownloadRepoImpl\n+ 2 builders.kt\nio/ktor/client/request/BuildersKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt$get$4\n+ 4 FileSystem.kt\nokio/FileSystem\n+ 5 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,97:1\n326#2,4:98\n222#2:102\n96#2,2:104\n19#2:106\n328#3:103\n86#4:107\n191#4:108\n95#4:109\n96#4:114\n58#5,4:110\n66#5,10:115\n62#5,18:125\n*S KotlinDebug\n*F\n+ 1 FileDownloadRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/FileDownloadRepoImpl\n*L\n49#1:98,4\n49#1:102\n49#1:104,2\n49#1:106\n49#1:103\n56#1:107\n56#1:108\n56#1:109\n56#1:114\n56#1:110,4\n56#1:115,10\n56#1:125,18\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final okio.b f92984a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f92985b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f92986c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f92987d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final a40.f f92988e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.resource.FileDownloadRepoImpl", f = "FileDownloadRepo.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {34, 106, 53, 60}, m = "download", n = {"url", "filePath", "url", "filePath", "targetFilePath", "originalFileName", "tempFileName", "tempFilePath", "$this$get_u24default$iv", "urlString$iv", "$this$get$iv$iv", "$this$get$iv$iv$iv", "builder$iv$iv$iv", "$this$request$iv$iv$iv$iv", "counter", "$i$f$get", "$i$f$get", "$i$f$get", "$i$f$request", "url", "filePath", "targetFilePath", "originalFileName", "tempFileName", "tempFilePath", "response", "counter", "url", "filePath", "targetFilePath", "originalFileName", "tempFileName", "tempFilePath", "response", "channel", "$this$iv", "file$iv", "$this$use$iv$iv", "it$iv", "$this$download_u24lambda_u240", "sink", "buffer", "counter", "mustCreate$iv", "$i$f$-write", "$i$f$use", "$i$a$-use-FileSystem$write$1$iv", "$i$a$--write$default-FileDownloadRepoImpl$download$2"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92989a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92990b;

        /* renamed from: c, reason: collision with root package name */
        public Object f92991c;

        /* renamed from: d, reason: collision with root package name */
        public Object f92992d;

        /* renamed from: e, reason: collision with root package name */
        public Object f92993e;

        /* renamed from: f, reason: collision with root package name */
        public Object f92994f;

        /* renamed from: g, reason: collision with root package name */
        public Object f92995g;

        /* renamed from: h, reason: collision with root package name */
        public Object f92996h;

        /* renamed from: i, reason: collision with root package name */
        public Object f92997i;

        /* renamed from: j, reason: collision with root package name */
        public Object f92998j;

        /* renamed from: k, reason: collision with root package name */
        public Object f92999k;

        /* renamed from: l, reason: collision with root package name */
        public Object f93000l;

        /* renamed from: m, reason: collision with root package name */
        public Object f93001m;

        /* renamed from: n, reason: collision with root package name */
        public Object f93002n;

        /* renamed from: o, reason: collision with root package name */
        public Object f93003o;

        /* renamed from: p, reason: collision with root package name */
        public int f93004p;

        /* renamed from: q, reason: collision with root package name */
        public int f93005q;

        /* renamed from: r, reason: collision with root package name */
        public int f93006r;

        /* renamed from: s, reason: collision with root package name */
        public int f93007s;

        /* renamed from: t, reason: collision with root package name */
        public int f93008t;

        /* renamed from: u, reason: collision with root package name */
        public int f93009u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f93010v;

        /* renamed from: x, reason: collision with root package name */
        public int f93012x;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f93010v = obj;
            this.f93012x |= Integer.MIN_VALUE;
            return c.this.a(null, null, this);
        }
    }

    public c(@m80.k okio.b fileSystem) {
        g0.p(fileSystem, "fileSystem");
        this.f92984a = fileSystem;
        this.f92985b = e0.c(new x00.a() { // from class: v5.b
            @Override // x00.a
            public final Object invoke() {
                lw.c e11;
                e11 = c.e();
                return e11;
            }
        });
        this.f92986c = c4.n.h().n();
        this.f92987d = "downloadCache";
        this.f92988e = a40.d.c(1);
    }

    public static final lw.c e() {
        return x7.i.n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x014f, code lost:
    
        if (d(r2) == r3) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01aa A[Catch: Exception -> 0x00e7, TryCatch #5 {Exception -> 0x00e7, blocks: (B:34:0x03a1, B:36:0x03a7, B:38:0x03af, B:39:0x03b4, B:41:0x03bc, B:42:0x03c1, B:45:0x03c9, B:76:0x00da, B:91:0x011f, B:93:0x0242, B:95:0x0254, B:98:0x03cd, B:99:0x03eb, B:102:0x01a2, B:104:0x01aa, B:105:0x01cd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0350 A[Catch: all -> 0x0357, TryCatch #4 {all -> 0x0357, blocks: (B:18:0x0348, B:20:0x0350, B:22:0x02c4, B:24:0x02ca, B:29:0x0378), top: B:17:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ca A[Catch: all -> 0x0357, TryCatch #4 {all -> 0x0357, blocks: (B:18:0x0348, B:20:0x0350, B:22:0x02c4, B:24:0x02ca, B:29:0x0378), top: B:17:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0378 A[Catch: all -> 0x0357, TRY_LEAVE, TryCatch #4 {all -> 0x0357, blocks: (B:18:0x0348, B:20:0x0350, B:22:0x02c4, B:24:0x02ca, B:29:0x0378), top: B:17:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03a1 A[Catch: Exception -> 0x00e7, TRY_ENTER, TryCatch #5 {Exception -> 0x00e7, blocks: (B:34:0x03a1, B:36:0x03a7, B:38:0x03af, B:39:0x03b4, B:41:0x03bc, B:42:0x03c1, B:45:0x03c9, B:76:0x00da, B:91:0x011f, B:93:0x0242, B:95:0x0254, B:98:0x03cd, B:99:0x03eb, B:102:0x01a2, B:104:0x01aa, B:105:0x01cd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03c9 A[Catch: Exception -> 0x00e7, TRY_ENTER, TryCatch #5 {Exception -> 0x00e7, blocks: (B:34:0x03a1, B:36:0x03a7, B:38:0x03af, B:39:0x03b4, B:41:0x03bc, B:42:0x03c1, B:45:0x03c9, B:76:0x00da, B:91:0x011f, B:93:0x0242, B:95:0x0254, B:98:0x03cd, B:99:0x03eb, B:102:0x01a2, B:104:0x01aa, B:105:0x01cd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254 A[Catch: Exception -> 0x00e7, TRY_LEAVE, TryCatch #5 {Exception -> 0x00e7, blocks: (B:34:0x03a1, B:36:0x03a7, B:38:0x03af, B:39:0x03b4, B:41:0x03bc, B:42:0x03c1, B:45:0x03c9, B:76:0x00da, B:91:0x011f, B:93:0x0242, B:95:0x0254, B:98:0x03cd, B:99:0x03eb, B:102:0x01a2, B:104:0x01aa, B:105:0x01cd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03cd A[Catch: Exception -> 0x00e7, TryCatch #5 {Exception -> 0x00e7, blocks: (B:34:0x03a1, B:36:0x03a7, B:38:0x03af, B:39:0x03b4, B:41:0x03bc, B:42:0x03c1, B:45:0x03c9, B:76:0x00da, B:91:0x011f, B:93:0x0242, B:95:0x0254, B:98:0x03cd, B:99:0x03eb, B:102:0x01a2, B:104:0x01aa, B:105:0x01cd), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r2v3, types: [okio.b] */
    /* JADX WARN: Type inference failed for: r2v5, types: [okio.b] */
    /* JADX WARN: Type inference failed for: r31v0, types: [v5.c] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [okio.f] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0332 -> B:17:0x0348). Please report as a decompilation issue!!! */
    @Override // v5.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k java.lang.String r32, @m80.k java.lang.String r33, @m80.k j00.c<? super yz.g2> r34) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.c.a(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    public final Object d(j00.c<? super g2> cVar) {
        okio.f h11 = f.a.h(okio.f.f77539b, this.f92986c + okio.f.f77540c + this.f92987d, false, 1, null);
        if (!this.f92984a.f0(h11)) {
            this.f92984a.w(h11);
        }
        return g2.f100423a;
    }

    public final lw.c f() {
        return (lw.c) this.f92985b.getValue();
    }
}
