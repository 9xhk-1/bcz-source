package v6;

import a00.w1;
import com.baicizhan.app.biz.game.model.StudyMode;
import j00.c;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l00.d;
import m80.k;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nCheckTrainingSupportUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckTrainingSupportUC.kt\ncom/baicizhan/app/biz/game/uc/wordlist/CheckTrainingSupportUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n1740#2,3:50\n*S KotlinDebug\n*F\n+ 1 CheckTrainingSupportUC.kt\ncom/baicizhan/app/biz/game/uc/wordlist/CheckTrainingSupportUC\n*L\n46#1:50,3\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C1252a f93109b = new C1252a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Set<Integer> f93110c = w1.u(Integer.valueOf(StudyMode.Picture.getValue()), Integer.valueOf(StudyMode.Deep.getValue()), Integer.valueOf(StudyMode.Context.getValue()), Integer.valueOf(StudyMode.Rhythm.getValue()), Integer.valueOf(StudyMode.Professional.getValue()), Integer.valueOf(StudyMode.Cake.getValue()), Integer.valueOf(StudyMode.AiLeadU.getValue()));

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.repo.book.b f93111a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v6.a$a, reason: collision with other inner class name */
    public static final class C1252a {
        public /* synthetic */ C1252a(v vVar) {
            this();
        }

        public C1252a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.uc.wordlist.CheckTrainingSupportUC", f = "CheckTrainingSupportUC.kt", i = {0}, l = {39}, m = "invoke", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f93112a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93113b;

        /* renamed from: d, reason: collision with root package name */
        public int f93115d;

        public b(c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f93113b = obj;
            this.f93115d |= Integer.MIN_VALUE;
            return a.this.a(0L, this);
        }
    }

    public a(@k com.baicizhan.app.biz.game.repo.book.b gameBookRepo) {
        g0.p(gameBookRepo, "gameBookRepo");
        this.f93111a = gameBookRepo;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r5, @m80.k j00.c<? super java.lang.Boolean> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof v6.a.b
            if (r0 == 0) goto L13
            r0 = r7
            v6.a$b r0 = (v6.a.b) r0
            int r1 = r0.f93115d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93115d = r1
            goto L18
        L13:
            v6.a$b r0 = new v6.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f93113b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f93115d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e.n(r7)
            com.baicizhan.app.biz.game.repo.book.b r7 = r4.f93111a
            r0.f93112a = r5
            r0.f93115d = r3
            java.lang.Object r7 = r7.e(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            h5.j r7 = (h5.j) r7
            java.util.List r5 = r7.r()
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L52
            java.lang.Boolean r5 = l00.a.a(r3)
            return r5
        L52:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L62
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L62
            goto L83
        L62:
            java.util.Iterator r5 = r5.iterator()
        L66:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r5.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = v6.a.f93110c
            java.lang.Integer r6 = l00.a.f(r6)
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L66
            r3 = 0
        L83:
            java.lang.Boolean r5 = l00.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.a.a(long, j00.c):java.lang.Object");
    }
}
