package f6;

import a00.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import p8.e0;
import p8.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetCurUnitNoUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetCurUnitNoUC.kt\ncom/baicizhan/app/biz/game/uc/cake/GetCurUnitNoUC\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1#2:86\n1#2:94\n1563#3:87\n1634#3,3:88\n2967#3,3:91\n2970#3,6:95\n360#3,7:101\n*S KotlinDebug\n*F\n+ 1 GetCurUnitNoUC.kt\ncom/baicizhan/app/biz/game/uc/cake/GetCurUnitNoUC\n*L\n77#1:94\n76#1:87\n76#1:88,3\n77#1:91,3\n77#1:95,6\n78#1:101,7\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.game.repo.roadmap.a f51077a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f6.a f51078b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.cake.GetCurUnitNoUC", f = "GetCurUnitNoUC.kt", i = {0, 1, 1, 1}, l = {19, 25}, m = "invoke", n = {"bookId", "roadMapInfo", "cakeModules", "bookId"}, s = {"J$0", "L$0", "L$1", "J$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f51079a;

        /* renamed from: b, reason: collision with root package name */
        public Object f51080b;

        /* renamed from: c, reason: collision with root package name */
        public Object f51081c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f51082d;

        /* renamed from: f, reason: collision with root package name */
        public int f51084f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f51082d = obj;
            this.f51084f |= Integer.MIN_VALUE;
            return c.this.b(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.cake.GetCurUnitNoUC", f = "GetCurUnitNoUC.kt", i = {0, 0, 0}, l = {45}, m = "invoke", n = {"roadMap", "cakeModules", "bookId"}, s = {"L$0", "L$1", "J$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f51085a;

        /* renamed from: b, reason: collision with root package name */
        public Object f51086b;

        /* renamed from: c, reason: collision with root package name */
        public Object f51087c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f51088d;

        /* renamed from: f, reason: collision with root package name */
        public int f51090f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f51088d = obj;
            this.f51090f |= Integer.MIN_VALUE;
            return c.this.c(0L, null, this);
        }
    }

    public c(@k com.baicizhan.app.biz.game.repo.roadmap.a roadMapRepo, @k f6.a getCurStudyIdxUC) {
        g0.p(roadMapRepo, "roadMapRepo");
        g0.p(getCurStudyIdxUC, "getCurStudyIdxUC");
        this.f51077a = roadMapRepo;
        this.f51078b = getCurStudyIdxUC;
    }

    public final int a(e0 e0Var, int i11) {
        List list;
        z6.b.d(z6.b.f101032b, d.f51091a, "Calculating unit number for idx: " + i11, null, 4, null);
        List<i> list2 = e0Var.f79774c;
        int i12 = 1;
        if (list2 != null) {
            List<i> list3 = list2;
            ArrayList arrayList = new ArrayList(i0.d0(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((i) it.next()).f79908a));
            }
            int i13 = 0;
            Integer num = 0;
            int d02 = i0.d0(arrayList, 9);
            if (d02 == 0) {
                list = a00.g0.l(num);
            } else {
                ArrayList arrayList2 = new ArrayList(d02 + 1);
                arrayList2.add(num);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    num = Integer.valueOf(num.intValue() + ((Number) it2.next()).intValue());
                    arrayList2.add(num);
                }
                list = arrayList2;
            }
            if (list != null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i13 = -1;
                        break;
                    }
                    if (((Number) it3.next()).intValue() > i11) {
                        break;
                    }
                    i13++;
                }
                Integer valueOf = Integer.valueOf(i13);
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i12 = valueOf.intValue();
                }
            }
        }
        z6.b.d(z6.b.f101032b, d.f51091a, "Calculated unit number: " + i12, null, 4, null);
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        if (r3 == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r18, @m80.k j00.c<? super java.lang.Integer> r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.c.b(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r12, @m80.k p8.e0 r14, @m80.k j00.c<? super java.lang.Integer> r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.c.c(long, p8.e0, j00.c):java.lang.Object");
    }

    @l
    public final Object d(@k e0 e0Var, int i11, @k j00.c<? super Integer> cVar) {
        z6.b bVar = z6.b.f101032b;
        z6.b.d(bVar, d.f51091a, "Getting unit number for idx: " + i11, null, 4, null);
        List<i> list = e0Var.f79774c;
        List<i> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list == null) {
            z6.b.j(bVar, d.f51091a, "No cake modules found for idx: " + i11, null, 4, null);
            return l00.a.f(0);
        }
        int a11 = a(e0Var, i11);
        z6.b.d(bVar, d.f51091a, "Unit number: " + a11 + " for idx: " + i11, null, 4, null);
        return l00.a.f(a11);
    }
}
