package l6;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v5.e f70209a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v5.d f70210b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.DownloadFileUC", f = "DownloadFileUC.kt", i = {0, 1, 1, 2, 2}, l = {18, 19, 20}, m = "invoke", n = {"url", "url", "localFilePath", "url", "localFilePath"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f70211a;

        /* renamed from: b, reason: collision with root package name */
        public Object f70212b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f70213c;

        /* renamed from: e, reason: collision with root package name */
        public int f70215e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70213c = obj;
            this.f70215e |= Integer.MIN_VALUE;
            return i.this.a(null, this);
        }
    }

    public i(@m80.k v5.e mediaFileRepo, @m80.k v5.d downloadRepo) {
        g0.p(mediaFileRepo, "mediaFileRepo");
        g0.p(downloadRepo, "downloadRepo");
        this.f70209a = mediaFileRepo;
        this.f70210b = downloadRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k java.lang.String r12, @m80.k j00.c<? super java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i.a(java.lang.String, j00.c):java.lang.Object");
    }
}
