package com.baicizhan.app.biz.game.uc.schedule;

import com.baicizhan.app.api.service.model.BookLanguageType;
import com.baicizhan.app.biz.game.model.StudyMode;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import oa0.r;
import r6.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f15065c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f15066d = "GetBookLanguageUC";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.app.biz.game.repo.book.b f15067a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n f15068b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final BookLanguageType a(@m80.k List<Integer> modeList) {
            g0.p(modeList, "modeList");
            Iterator<Integer> it = modeList.iterator();
            while (it.hasNext()) {
                BookLanguageType b11 = b(it.next().intValue());
                if (b11 != null) {
                    return b11;
                }
            }
            return BookLanguageType.English;
        }

        public final BookLanguageType b(int i11) {
            if (i11 == StudyMode.MinorJapanese.getValue() || i11 == StudyMode.CakeJapanese.getValue()) {
                return BookLanguageType.Japanese;
            }
            if (i11 == StudyMode.MinorFrance.getValue()) {
                return BookLanguageType.French;
            }
            if (i11 == StudyMode.MinorSpanish.getValue()) {
                return BookLanguageType.Spanish;
            }
            if (i11 == StudyMode.MinorKorean.getValue() || i11 == StudyMode.CakeKorean.getValue()) {
                return BookLanguageType.Korean;
            }
            if (i11 == StudyMode.MinorGerman.getValue()) {
                return BookLanguageType.German;
            }
            if (i11 == StudyMode.MinorRussian.getValue()) {
                return BookLanguageType.Russian;
            }
            if (i11 == StudyMode.MinorCantonese.getValue()) {
                return BookLanguageType.Cantonese;
            }
            return null;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.schedule.GetBookLanguageUC", f = "GetBookLanguageUC.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {33, 37, 39}, m = "invoke", n = {"$this$invoke_u24lambda_u240", "bookId", "$i$a$-runCatching-GetBookLanguageUC$invoke$bookInfo$1", "it", "bookId", "$i$a$-getOrElse-GetBookLanguageUC$invoke$bookInfo$2", "it", "bookId", "$i$a$-getOrElse-GetBookLanguageUC$invoke$bookInfo$2"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "L$0", "J$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f15069a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15070b;

        /* renamed from: c, reason: collision with root package name */
        public int f15071c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f15072d;

        /* renamed from: f, reason: collision with root package name */
        public int f15074f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15072d = obj;
            this.f15074f |= Integer.MIN_VALUE;
            return f.this.a(0L, this);
        }
    }

    public f(@m80.k com.baicizhan.app.biz.game.repo.book.b gameBookRepo, @m80.k n fetchGameHomeUC) {
        g0.p(gameBookRepo, "gameBookRepo");
        g0.p(fetchGameHomeUC, "fetchGameHomeUC");
        this.f15067a = gameBookRepo;
        this.f15068b = fetchGameHomeUC;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|8|(1:(1:(1:(4:13|14|15|16)(2:18|19))(2:20|21))(2:24|25))(3:32|33|(2:35|23))|26|27|(1:29)|15|16))|38|6|7|8|(0)(0)|26|27|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (r0 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (r12.f15068b.b((int) r13, r15) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        r2 = kotlin.Result.Companion;
        r0 = kotlin.Result.m6308constructorimpl(kotlin.e.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r13, @m80.k j00.c<? super com.baicizhan.app.api.service.model.BookLanguageType> r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.schedule.f.a(long, j00.c):java.lang.Object");
    }
}
