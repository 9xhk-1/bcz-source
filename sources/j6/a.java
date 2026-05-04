package j6;

import com.baicizhan.app.biz.game.uc.abtest.GetABTestUC;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l00.d;
import m80.k;
import m80.l;
import n6.c;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C0734a f63522f = new C0734a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f63523g = "CheckPremiumModeUC";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c6.b f63524a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.repo.book.b f63525b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y5.a f63526c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GetABTestUC f63527d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c f63528e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: j6.a$a, reason: collision with other inner class name */
    public static final class C0734a {
        public /* synthetic */ C0734a(v vVar) {
            this();
        }

        public C0734a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.mode.CheckPremiumModeUC", f = "CheckPremiumModeUC.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5}, l = {51, 57, 59, 70, 77, 79}, m = "invoke", n = {"roundType", "bookId", "hasPurchased", "roundType", "bookId", "hasPurchased", "roundType", "currentMode", "bookId", "hasPurchased", "roundType", "currentMode", "bookId", "hasPurchased", "roundType", "currentMode", "freeMode", "bookId", "hasPurchased", "roundType", "currentMode", "freeMode", "modeList", "bookId", "hasPurchased", "availableMode"}, s = {"L$0", "J$0", "Z$0", "L$0", "J$0", "Z$0", "L$0", "L$1", "J$0", "Z$0", "L$0", "L$1", "J$0", "Z$0", "L$0", "L$1", "L$2", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f63529a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f63530b;

        /* renamed from: c, reason: collision with root package name */
        public Object f63531c;

        /* renamed from: d, reason: collision with root package name */
        public Object f63532d;

        /* renamed from: e, reason: collision with root package name */
        public Object f63533e;

        /* renamed from: f, reason: collision with root package name */
        public Object f63534f;

        /* renamed from: g, reason: collision with root package name */
        public Object f63535g;

        /* renamed from: h, reason: collision with root package name */
        public int f63536h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f63537i;

        /* renamed from: k, reason: collision with root package name */
        public int f63539k;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f63537i = obj;
            this.f63539k |= Integer.MIN_VALUE;
            return a.this.a(0L, false, null, this);
        }
    }

    public a(@k c6.b userGameInfoRepo, @k com.baicizhan.app.biz.game.repo.book.b gameBookRepo, @k y5.a settingRepo, @k GetABTestUC getABTestUC, @k c getStudyModeSetting) {
        g0.p(userGameInfoRepo, "userGameInfoRepo");
        g0.p(gameBookRepo, "gameBookRepo");
        g0.p(settingRepo, "settingRepo");
        g0.p(getABTestUC, "getABTestUC");
        g0.p(getStudyModeSetting, "getStudyModeSetting");
        this.f63524a = userGameInfoRepo;
        this.f63525b = gameBookRepo;
        this.f63526c = settingRepo;
        this.f63527d = getABTestUC;
        this.f63528e = getStudyModeSetting;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01be, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r19, boolean r21, @m80.k com.baicizhan.app.biz.game.model.RoundType r22, @m80.k j00.c<? super yz.g2> r23) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a.a(long, boolean, com.baicizhan.app.biz.game.model.RoundType, j00.c):java.lang.Object");
    }
}
