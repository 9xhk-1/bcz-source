package p7;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k3.q3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import l7.i0;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {q3.class})
@u0({"SMAP\nUserBookServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBookServiceImpl.kt\ncom/baicizhan/app/biz/userbook/UserBookServiceImpl\n+ 2 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 3 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 4 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n+ 7 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 8 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 11 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 12 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n6#2:213\n6#2:225\n64#3,2:214\n66#3:217\n67#3,2:223\n64#3,2:226\n66#3:229\n67#3,2:235\n6#4:216\n6#4:228\n124#5,4:218\n124#5,4:230\n142#6:222\n142#6:234\n12#7,3:237\n15#7,10:258\n12#8,2:240\n14#8,10:248\n1563#9:242\n1634#9,3:243\n1563#9:270\n1634#9,3:271\n1563#9:276\n1634#9,3:277\n1563#9:282\n1634#9,3:283\n774#9:290\n865#9,2:291\n1563#9:293\n1634#9,3:294\n1869#9,2:303\n1869#9,2:305\n774#9:311\n865#9,2:312\n1869#9,2:314\n1563#9:316\n1634#9,3:317\n1563#9:320\n1634#9,3:321\n37#10,2:246\n37#10,2:268\n37#10,2:274\n37#10,2:280\n37#10,2:324\n11561#11:286\n11896#11,3:287\n11561#11:299\n11896#11,3:300\n11561#11:307\n11896#11,3:308\n1321#12,2:297\n1#13:326\n*S KotlinDebug\n*F\n+ 1 UserBookServiceImpl.kt\ncom/baicizhan/app/biz/userbook/UserBookServiceImpl\n*L\n36#1:213\n37#1:225\n36#1:214,2\n36#1:217\n36#1:223,2\n37#1:226,2\n37#1:229\n37#1:235,2\n36#1:216\n37#1:228\n36#1:218,4\n37#1:230,4\n36#1:222\n37#1:234\n-1#1:237,3\n-1#1:258,10\n-1#1:240,2\n-1#1:248,10\n42#1:242\n42#1:243,3\n82#1:270\n82#1:271,3\n83#1:276\n83#1:277,3\n90#1:282\n90#1:283,3\n93#1:290\n93#1:291,2\n95#1:293\n95#1:294,3\n114#1:303,2\n118#1:305,2\n162#1:311\n162#1:312,2\n165#1:314,2\n172#1:316\n172#1:317,3\n191#1:320\n191#1:321,3\n42#1:246,2\n74#1:268,2\n82#1:274,2\n83#1:280,2\n193#1:324,2\n92#1:286\n92#1:287,3\n113#1:299\n113#1:300,3\n161#1:307\n161#1:308,3\n108#1:297,2\n*E\n"})
/* loaded from: classes3.dex */
public final class u implements q3 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final r7.f f79436b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r7.h f79437c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final l7.p f79438d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final r7.e f79439e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {162, 167, 171, 172}, m = "addWords2Books", n = {xd.a.f98002r, "userBookIds", "tag$iv", "ids", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$addWords2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$addWords2Books$2$1", xd.a.f98002r, "userBookIds", "tag$iv", "books", "$this$forEach$iv", "element$iv", "it", "ids", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$addWords2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$addWords2Books$2$1", "$i$f$forEach", "$i$a$-forEach-UserBookServiceImpl$addWords2Books$2$1$1", xd.a.f98002r, "userBookIds", "tag$iv", "books", "ids", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$addWords2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$addWords2Books$2$1", xd.a.f98002r, "userBookIds", "tag$iv", "books", "newBooks", "ids", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$addWords2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$addWords2Books$2$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79440a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79441b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79442c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79443d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79444e;

        /* renamed from: f, reason: collision with root package name */
        public Object f79445f;

        /* renamed from: g, reason: collision with root package name */
        public Object f79446g;

        /* renamed from: h, reason: collision with root package name */
        public Object f79447h;

        /* renamed from: i, reason: collision with root package name */
        public Object f79448i;

        /* renamed from: j, reason: collision with root package name */
        public int f79449j;

        /* renamed from: k, reason: collision with root package name */
        public int f79450k;

        /* renamed from: l, reason: collision with root package name */
        public int f79451l;

        /* renamed from: m, reason: collision with root package name */
        public int f79452m;

        /* renamed from: n, reason: collision with root package name */
        public int f79453n;

        /* renamed from: o, reason: collision with root package name */
        public int f79454o;

        /* renamed from: p, reason: collision with root package name */
        public long f79455p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f79456q;

        /* renamed from: s, reason: collision with root package name */
        public int f79458s;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79456q = obj;
            this.f79458s |= Integer.MIN_VALUE;
            return u.this.C1(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8}, l = {90, 91, 110, 111, 113, 115, 119, 124, 138}, m = "collectWord2Books", n = {"bookIds", "tag$iv", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "bookIds", "tag$iv", "collectedBookIds", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "bookIds", "tag$iv", "allBooks", "deleteIds", "addIds", "$this$forEach$iv", "element$iv", "it", "collectedBookIds", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "$i$f$forEach", "$i$a$-forEach-UserBookServiceImpl$collectWord2Books$2$1$3", "bookIds", "tag$iv", "allBooks", "deleteIds", "addIds", "$this$forEach$iv", "element$iv", "it", "collectedBookIds", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "$i$f$forEach", "$i$a$-forEach-UserBookServiceImpl$collectWord2Books$2$1$3", "bookIds", "tag$iv", "allBooks", "deleteIds", "addIds", "collectedBookIds", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "bookIds", "tag$iv", "allBooks", "deleteIds", "addIds", HiAnalyticsConstant.Direction.RESPONSE, "$this$forEach$iv", "element$iv", "collectedBookIds", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "$i$f$forEach", "$i$a$-forEach-UserBookServiceImpl$collectWord2Books$2$1$4", "deleteId", "bookIds", "tag$iv", "allBooks", "deleteIds", "addIds", HiAnalyticsConstant.Direction.RESPONSE, "wordDetail", "$this$forEach$iv", "collectedBookIds", "element$iv", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "$i$a$-also-UserBookServiceImpl$collectWord2Books$2$1$5", "$i$f$forEach", "it", "$i$a$-forEach-UserBookServiceImpl$collectWord2Books$2$1$5$1", "bookIds", "tag$iv", "allBooks", "deleteIds", "addIds", HiAnalyticsConstant.Direction.RESPONSE, "ids", "collectedBookIds", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "$i$a$-let-UserBookServiceImpl$collectWord2Books$2$1$6", "bookIds", "tag$iv", "allBooks", "deleteIds", "addIds", HiAnalyticsConstant.Direction.RESPONSE, "it", "collectedBookIds", "topicId", "bookId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWord2Books$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWord2Books$2$1", "$i$a$-also-UserBookServiceImpl$collectWord2Books$2$1$7"}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "I$6", "I$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "I$6", "I$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "I$6", "I$7", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$11", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "I$6", "I$7", "J$1", "I$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "I$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "J$0", "I$3", "I$4", "I$5", "I$6"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f79459a;

        /* renamed from: b, reason: collision with root package name */
        public int f79460b;

        /* renamed from: c, reason: collision with root package name */
        public int f79461c;

        /* renamed from: d, reason: collision with root package name */
        public int f79462d;

        /* renamed from: e, reason: collision with root package name */
        public int f79463e;

        /* renamed from: f, reason: collision with root package name */
        public int f79464f;

        /* renamed from: g, reason: collision with root package name */
        public int f79465g;

        /* renamed from: h, reason: collision with root package name */
        public int f79466h;

        /* renamed from: i, reason: collision with root package name */
        public int f79467i;

        /* renamed from: j, reason: collision with root package name */
        public Object f79468j;

        /* renamed from: k, reason: collision with root package name */
        public Object f79469k;

        /* renamed from: l, reason: collision with root package name */
        public Object f79470l;

        /* renamed from: m, reason: collision with root package name */
        public Object f79471m;

        /* renamed from: n, reason: collision with root package name */
        public Object f79472n;

        /* renamed from: o, reason: collision with root package name */
        public Object f79473o;

        /* renamed from: p, reason: collision with root package name */
        public Object f79474p;

        /* renamed from: q, reason: collision with root package name */
        public Object f79475q;

        /* renamed from: r, reason: collision with root package name */
        public Object f79476r;

        /* renamed from: s, reason: collision with root package name */
        public Object f79477s;

        /* renamed from: t, reason: collision with root package name */
        public Object f79478t;

        /* renamed from: u, reason: collision with root package name */
        public Object f79479u;

        /* renamed from: v, reason: collision with root package name */
        public long f79480v;

        /* renamed from: w, reason: collision with root package name */
        public long f79481w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f79482x;

        /* renamed from: z, reason: collision with root package name */
        public int f79484z;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79482x = obj;
            this.f79484z |= Integer.MIN_VALUE;
            return u.this.y2(0, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {147, 149, 150, 152, 153}, m = "collectWords2Book", n = {xd.a.f98002r, "userBookId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWords2Book$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWords2Book$2$1", "ubId", xd.a.f98002r, "userBookId", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWords2Book$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWords2Book$2$1", "ubId", xd.a.f98002r, "userBookId", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWords2Book$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWords2Book$2$1", "ubId", xd.a.f98002r, "userBookId", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWords2Book$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWords2Book$2$1", "ubId", xd.a.f98002r, "userBookId", "tag$iv", "record", "it", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$collectWords2Book$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$collectWords2Book$2$1", "ubId", "$i$a$-also-UserBookServiceImpl$collectWords2Book$2$1$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "I$4"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79485a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79486b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79487c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79488d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79489e;

        /* renamed from: f, reason: collision with root package name */
        public Object f79490f;

        /* renamed from: g, reason: collision with root package name */
        public int f79491g;

        /* renamed from: h, reason: collision with root package name */
        public int f79492h;

        /* renamed from: i, reason: collision with root package name */
        public int f79493i;

        /* renamed from: j, reason: collision with root package name */
        public int f79494j;

        /* renamed from: k, reason: collision with root package name */
        public int f79495k;

        /* renamed from: l, reason: collision with root package name */
        public long f79496l;

        /* renamed from: m, reason: collision with root package name */
        public long f79497m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f79498n;

        /* renamed from: p, reason: collision with root package name */
        public int f79500p;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79498n = obj;
            this.f79500p |= Integer.MIN_VALUE;
            return u.this.b0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {63}, m = "createUserBook", n = {"name", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$createUserBook$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$createUserBook$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79501a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79502b;

        /* renamed from: c, reason: collision with root package name */
        public int f79503c;

        /* renamed from: d, reason: collision with root package name */
        public int f79504d;

        /* renamed from: e, reason: collision with root package name */
        public int f79505e;

        /* renamed from: f, reason: collision with root package name */
        public int f79506f;

        /* renamed from: g, reason: collision with root package name */
        public long f79507g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f79508h;

        /* renamed from: j, reason: collision with root package name */
        public int f79510j;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79508h = obj;
            this.f79510j |= Integer.MIN_VALUE;
            return u.this.p(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {52, 53}, m = "deleteUserBook", n = {"userBookId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$deleteUserBook$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$deleteUserBook$2$1", "userBookId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$deleteUserBook$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$deleteUserBook$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79511a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79512b;

        /* renamed from: c, reason: collision with root package name */
        public int f79513c;

        /* renamed from: d, reason: collision with root package name */
        public int f79514d;

        /* renamed from: e, reason: collision with root package name */
        public int f79515e;

        /* renamed from: f, reason: collision with root package name */
        public int f79516f;

        /* renamed from: g, reason: collision with root package name */
        public long f79517g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f79518h;

        /* renamed from: j, reason: collision with root package name */
        public int f79520j;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79518h = obj;
            this.f79520j |= Integer.MIN_VALUE;
            return u.this.Z(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {181, 182, 184, 186}, m = "deleteWords", n = {"userBookId", "topicId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$deleteWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$deleteWords$2$1", "ubId", "userBookId", "topicId", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$deleteWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$deleteWords$2$1", "ubId", "userBookId", "topicId", "tag$iv", "record", "bookItem", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$deleteWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$deleteWords$2$1", "ubId", "userBookId", "topicId", "tag$iv", "record", "bookItem", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$deleteWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$deleteWords$2$1", "ubId"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "I$1", "I$2", "I$3", "J$1"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79521a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79522b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79523c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79524d;

        /* renamed from: e, reason: collision with root package name */
        public Object f79525e;

        /* renamed from: f, reason: collision with root package name */
        public int f79526f;

        /* renamed from: g, reason: collision with root package name */
        public int f79527g;

        /* renamed from: h, reason: collision with root package name */
        public int f79528h;

        /* renamed from: i, reason: collision with root package name */
        public int f79529i;

        /* renamed from: j, reason: collision with root package name */
        public long f79530j;

        /* renamed from: k, reason: collision with root package name */
        public long f79531k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f79532l;

        /* renamed from: n, reason: collision with root package name */
        public int f79534n;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79532l = obj;
            this.f79534n |= Integer.MIN_VALUE;
            return u.this.K(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {58}, m = "editUserBookName", n = {"bookName", "userBookId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$editUserBookName$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$editUserBookName$2$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79535a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79536b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79537c;

        /* renamed from: d, reason: collision with root package name */
        public int f79538d;

        /* renamed from: e, reason: collision with root package name */
        public int f79539e;

        /* renamed from: f, reason: collision with root package name */
        public int f79540f;

        /* renamed from: g, reason: collision with root package name */
        public int f79541g;

        /* renamed from: h, reason: collision with root package name */
        public long f79542h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f79543i;

        /* renamed from: k, reason: collision with root package name */
        public int f79545k;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79543i = obj;
            this.f79545k |= Integer.MIN_VALUE;
            return u.this.S1(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {198}, m = "exportInfo", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$exportInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$exportInfo$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79546a;

        /* renamed from: b, reason: collision with root package name */
        public int f79547b;

        /* renamed from: c, reason: collision with root package name */
        public int f79548c;

        /* renamed from: d, reason: collision with root package name */
        public int f79549d;

        /* renamed from: e, reason: collision with root package name */
        public int f79550e;

        /* renamed from: f, reason: collision with root package name */
        public long f79551f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f79552g;

        /* renamed from: i, reason: collision with root package name */
        public int f79554i;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79552g = obj;
            this.f79554i |= Integer.MIN_VALUE;
            return u.this.z1(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {203}, m = "exportWords", n = {HiAnalyticsConstant.Direction.REQUEST, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$exportWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$exportWords$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79555a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79556b;

        /* renamed from: c, reason: collision with root package name */
        public int f79557c;

        /* renamed from: d, reason: collision with root package name */
        public int f79558d;

        /* renamed from: e, reason: collision with root package name */
        public int f79559e;

        /* renamed from: f, reason: collision with root package name */
        public int f79560f;

        /* renamed from: g, reason: collision with root package name */
        public long f79561g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f79562h;

        /* renamed from: j, reason: collision with root package name */
        public int f79564j;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79562h = obj;
            this.f79564j |= Integer.MIN_VALUE;
            return u.this.R(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {47}, m = "getUserBookMaxCount", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$getUserBookMaxCount$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$getUserBookMaxCount$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79565a;

        /* renamed from: b, reason: collision with root package name */
        public int f79566b;

        /* renamed from: c, reason: collision with root package name */
        public int f79567c;

        /* renamed from: d, reason: collision with root package name */
        public int f79568d;

        /* renamed from: e, reason: collision with root package name */
        public int f79569e;

        /* renamed from: f, reason: collision with root package name */
        public long f79570f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f79571g;

        /* renamed from: i, reason: collision with root package name */
        public int f79573i;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79571g = obj;
            this.f79573i |= Integer.MIN_VALUE;
            return u.this.M(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {68, 69, 72, 74}, m = "getUserBookWords", n = {"userBookId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$getUserBookWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$getUserBookWords$2$1", "userBookId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$getUserBookWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$getUserBookWords$2$1", "userBookId", "tag$iv", "it", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$getUserBookWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$getUserBookWords$2$1", "$i$a$-also-UserBookServiceImpl$getUserBookWords$2$1$2", "userBookId", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$getUserBookWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$getUserBookWords$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79574a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79575b;

        /* renamed from: c, reason: collision with root package name */
        public Object f79576c;

        /* renamed from: d, reason: collision with root package name */
        public Object f79577d;

        /* renamed from: e, reason: collision with root package name */
        public int f79578e;

        /* renamed from: f, reason: collision with root package name */
        public int f79579f;

        /* renamed from: g, reason: collision with root package name */
        public int f79580g;

        /* renamed from: h, reason: collision with root package name */
        public int f79581h;

        /* renamed from: i, reason: collision with root package name */
        public int f79582i;

        /* renamed from: j, reason: collision with root package name */
        public long f79583j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f79584k;

        /* renamed from: m, reason: collision with root package name */
        public int f79586m;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79584k = obj;
            this.f79586m |= Integer.MIN_VALUE;
            return u.this.I2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {41, 42}, m = "getUserBooks", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$getUserBooks$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$getUserBooks$2$1", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$getUserBooks$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$getUserBooks$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79587a;

        /* renamed from: b, reason: collision with root package name */
        public int f79588b;

        /* renamed from: c, reason: collision with root package name */
        public int f79589c;

        /* renamed from: d, reason: collision with root package name */
        public int f79590d;

        /* renamed from: e, reason: collision with root package name */
        public int f79591e;

        /* renamed from: f, reason: collision with root package name */
        public long f79592f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f79593g;

        /* renamed from: i, reason: collision with root package name */
        public int f79595i;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79593g = obj;
            this.f79595i |= Integer.MIN_VALUE;
            return u.this.B(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {191}, m = "matchWords", n = {"wordContent", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$matchWords$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$matchWords$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f79596a;

        /* renamed from: b, reason: collision with root package name */
        public Object f79597b;

        /* renamed from: c, reason: collision with root package name */
        public int f79598c;

        /* renamed from: d, reason: collision with root package name */
        public int f79599d;

        /* renamed from: e, reason: collision with root package name */
        public int f79600e;

        /* renamed from: f, reason: collision with root package name */
        public int f79601f;

        /* renamed from: g, reason: collision with root package name */
        public long f79602g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f79603h;

        /* renamed from: j, reason: collision with root package name */
        public int f79605j;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79603h = obj;
            this.f79605j |= Integer.MIN_VALUE;
            return u.this.O1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userbook.UserBookServiceImpl", f = "UserBookServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {79, 80}, m = "queryWordCollected", n = {"tag$iv", "topicId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$queryWordCollected$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$queryWordCollected$2$1", "tag$iv", "books", "topicId", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserBookServiceImpl$queryWordCollected$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserBookServiceImpl$queryWordCollected$2$1"}, s = {"L$0", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f79606a;

        /* renamed from: b, reason: collision with root package name */
        public int f79607b;

        /* renamed from: c, reason: collision with root package name */
        public int f79608c;

        /* renamed from: d, reason: collision with root package name */
        public int f79609d;

        /* renamed from: e, reason: collision with root package name */
        public int f79610e;

        /* renamed from: f, reason: collision with root package name */
        public Object f79611f;

        /* renamed from: g, reason: collision with root package name */
        public Object f79612g;

        /* renamed from: h, reason: collision with root package name */
        public long f79613h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f79614i;

        /* renamed from: k, reason: collision with root package name */
        public int f79616k;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f79614i = obj;
            this.f79616k |= Integer.MIN_VALUE;
            return u.this.o1(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class o implements x00.l<w7.d<y8.h>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f79617a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f79618b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f79619c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f79620a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f79621b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f79622c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f79620a = eVar;
                this.f79621b = cVar;
                this.f79622c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f79620a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f79620a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f79621b.b(this.f79622c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public o(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f79617a = dVar;
            this.f79618b = eVar;
            this.f79619c = cVar;
        }

        public final void a(w7.d<y8.h> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f79618b, this.f79619c, this.f79617a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = l7.i0.o().get(this.f79617a);
            kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<y8.h> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class p implements x00.l<w7.d<w8.f>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f79623a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f79624b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f79625c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f79626a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f79627b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f79628c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f79626a = eVar;
                this.f79627b = cVar;
                this.f79628c = dVar;
            }

            public final void a(d.a randomRetry) {
                kotlin.jvm.internal.g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f79626a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f79626a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f79627b.b(this.f79628c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public p(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f79623a = dVar;
            this.f79624b = eVar;
            this.f79625c = cVar;
        }

        public final void a(w7.d<w8.f> thriftBuilder) {
            kotlin.jvm.internal.g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f79624b, this.f79625c, this.f79623a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = l7.i0.o().get(this.f79623a);
            kotlin.jvm.internal.g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<w8.f> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public u(@m80.k r7.f bookRepo, @m80.k r7.h wordsRepo, @m80.k l7.p thrift, @m80.k r7.e syncer) {
        kotlin.jvm.internal.g0.p(bookRepo, "bookRepo");
        kotlin.jvm.internal.g0.p(wordsRepo, "wordsRepo");
        kotlin.jvm.internal.g0.p(thrift, "thrift");
        kotlin.jvm.internal.g0.p(syncer, "syncer");
        this.f79436b = bookRepo;
        this.f79437c = wordsRepo;
        this.f79438d = thrift;
        this.f79439e = syncer;
    }

    public static final p7.p B0(y8.a aVar, Map map, p7.p it) {
        kotlin.jvm.internal.g0.p(it, "it");
        long j11 = aVar.f99513a;
        return p7.p.h(it, 0L, null, ((Integer) map.get(Long.valueOf(it.m()))) != null ? r14.intValue() : it.n(), null, j11, j11, 11, null);
    }

    public static final p7.p I0(List list, long j11) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((p7.p) obj).m() == j11) {
                break;
            }
        }
        return (p7.p) obj;
    }

    public static final p7.p J(List list, long j11) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((p7.p) obj).m() == j11) {
                break;
            }
        }
        return (p7.p) obj;
    }

    private final y8.h T1() {
        return (y8.h) w7.f.b(new o(o0.d(y8.h.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    public static final boolean p1(p7.p it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.l() > it.k();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba A[Catch: all -> 0x0037, LOOP:0: B:14:0x00b4->B:16:0x00ba, LOOP_END, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0032, B:13:0x00a3, B:14:0x00b4, B:16:0x00ba, B:18:0x00c8), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112 A[Catch: all -> 0x012a, TryCatch #3 {all -> 0x012a, blocks: (B:28:0x010b, B:30:0x0112, B:32:0x0116, B:34:0x011a, B:36:0x011e, B:38:0x0122, B:49:0x0189, B:40:0x012d, B:42:0x0138, B:44:0x014c, B:46:0x0160, B:48:0x0175), top: B:27:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175 A[Catch: all -> 0x012a, TryCatch #3 {all -> 0x012a, blocks: (B:28:0x010b, B:30:0x0112, B:32:0x0116, B:34:0x011a, B:36:0x011e, B:38:0x0122, B:49:0x0189, B:40:0x012d, B:42:0x0138, B:44:0x014c, B:46:0x0160, B:48:0x0175), top: B:27:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(@m80.k j00.c<? super k3.o3[]> r15) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.B(j00.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c8 A[Catch: all -> 0x024e, TryCatch #8 {all -> 0x024e, blocks: (B:83:0x01c2, B:85:0x01c8, B:89:0x01dc, B:94:0x025b), top: B:82:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b A[EDGE_INSN: B:93:0x025b->B:94:0x025b BREAK  A[LOOP:1: B:82:0x01c2->B:87:0x0253], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x022c -> B:74:0x023b). Please report as a decompilation issue!!! */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C1(@m80.k k3.m4[] r27, @m80.k java.lang.String[] r28, @m80.k j00.c<? super yz.g2> r29) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.C1(k3.m4[], java.lang.String[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x008c: MOVE (r3 I:??[long, double]) = (r12 I:??[long, double]) (LINE:141), block:B:101:0x008c */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #4 {all -> 0x014d, blocks: (B:18:0x0101, B:21:0x0112, B:23:0x0116, B:14:0x00de), top: B:13:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c8 A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:39:0x01c1, B:41:0x01c8, B:43:0x01cc, B:45:0x01d0, B:47:0x01d4, B:49:0x01d8, B:60:0x023e, B:51:0x01e2, B:53:0x01ed, B:55:0x0201, B:57:0x0215, B:59:0x022a), top: B:38:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022a A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:39:0x01c1, B:41:0x01c8, B:43:0x01cc, B:45:0x01d0, B:47:0x01d4, B:49:0x01d8, B:60:0x023e, B:51:0x01e2, B:53:0x01ed, B:55:0x0201, B:57:0x0215, B:59:0x022a), top: B:38:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I2(@m80.k java.lang.String r20, @m80.k j00.c<? super k3.r3[]> r21) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.I2(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(5:(1:(1:(1:(9:12|13|14|15|16|17|18|(1:20)|21)(2:58|59))(10:60|61|62|63|64|65|66|67|(6:70|16|17|18|(0)|21)|69))(8:78|79|80|81|82|83|84|(5:86|87|88|(6:90|64|65|66|67|(0))|69)(6:94|65|66|67|(0)|69)))(4:101|102|103|104)|57|25|26|(2:28|(2:30|(2:32|(2:34|(2:36|37)(2:38|39))(2:40|41))(2:42|43))(2:44|45))(2:46|47))(4:122|123|124|(2:126|69)(1:127))|105|110|111|112|(2:114|69)(5:115|82|83|84|(0)(0))))|128|6|(0)(0)|105|110|111|112|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x029b A[Catch: all -> 0x02b3, TryCatch #5 {all -> 0x02b3, blocks: (B:26:0x0294, B:28:0x029b, B:30:0x029f, B:32:0x02a3, B:34:0x02a7, B:36:0x02ab, B:47:0x0311, B:38:0x02b5, B:40:0x02c0, B:42:0x02d4, B:44:0x02e8, B:46:0x02fd), top: B:25:0x0294 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02fd A[Catch: all -> 0x02b3, TryCatch #5 {all -> 0x02b3, blocks: (B:26:0x0294, B:28:0x029b, B:30:0x029f, B:32:0x02a3, B:34:0x02a7, B:36:0x02ab, B:47:0x0311, B:38:0x02b5, B:40:0x02c0, B:42:0x02d4, B:44:0x02e8, B:46:0x02fd), top: B:25:0x0294 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(@m80.k java.lang.String r28, @m80.k java.lang.Integer[] r29, @m80.k j00.c<? super yz.g2> r30) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.K(java.lang.String, java.lang.Integer[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:14:0x006e, B:23:0x00b1, B:25:0x00b8, B:27:0x00bc, B:29:0x00c0, B:31:0x00c4, B:33:0x00c8, B:44:0x012c, B:35:0x00d0, B:37:0x00db, B:39:0x00ef, B:41:0x0103, B:43:0x0118), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[Catch: all -> 0x00a9, TryCatch #1 {all -> 0x00a9, blocks: (B:14:0x006e, B:23:0x00b1, B:25:0x00b8, B:27:0x00bc, B:29:0x00c0, B:31:0x00c4, B:33:0x00c8, B:44:0x012c, B:35:0x00d0, B:37:0x00db, B:39:0x00ef, B:41:0x0103, B:43:0x0118), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, long] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(@m80.k j00.c<? super java.lang.Integer> r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.M(j00.c):java.lang.Object");
    }

    public final w8.f N1() {
        return (w8.f) w7.f.b(new p(o0.d(w8.f.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: all -> 0x0036, LOOP:0: B:13:0x0085->B:15:0x008b, LOOP_END, TryCatch #0 {all -> 0x0036, blocks: (B:11:0x0032, B:12:0x0074, B:13:0x0085, B:15:0x008b, B:17:0x0099), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:27:0x00de, B:29:0x00e5, B:31:0x00e9, B:33:0x00ed, B:35:0x00f1, B:37:0x00f5, B:48:0x015c, B:39:0x0100, B:41:0x010b, B:43:0x011f, B:45:0x0133, B:47:0x0148), top: B:26:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:27:0x00de, B:29:0x00e5, B:31:0x00e9, B:33:0x00ed, B:35:0x00f1, B:37:0x00f5, B:48:0x015c, B:39:0x0100, B:41:0x010b, B:43:0x011f, B:45:0x0133, B:47:0x0148), top: B:26:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O1(@m80.k java.lang.String r11, @m80.k j00.c<? super k3.m4[]> r12) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.O1(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R(@m80.k k3.l0 r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.R(k3.l0, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00db, blocks: (B:22:0x00bc, B:24:0x00c3, B:26:0x00c7, B:28:0x00cb, B:30:0x00cf, B:32:0x00d3, B:43:0x013a, B:34:0x00de, B:36:0x00e9, B:38:0x00fd, B:40:0x0111, B:42:0x0126), top: B:21:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126 A[Catch: all -> 0x00db, TryCatch #2 {all -> 0x00db, blocks: (B:22:0x00bc, B:24:0x00c3, B:26:0x00c7, B:28:0x00cb, B:30:0x00cf, B:32:0x00d3, B:43:0x013a, B:34:0x00de, B:36:0x00e9, B:38:0x00fd, B:40:0x0111, B:42:0x0126), top: B:21:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S1(@m80.k java.lang.String r11, @m80.k java.lang.String r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.S1(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fe A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:23:0x00f7, B:25:0x00fe, B:27:0x0102, B:29:0x0106, B:31:0x010a, B:33:0x010e, B:44:0x0175, B:35:0x0119, B:37:0x0124, B:39:0x0138, B:41:0x014c, B:43:0x0161), top: B:22:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161 A[Catch: all -> 0x0116, TryCatch #1 {all -> 0x0116, blocks: (B:23:0x00f7, B:25:0x00fe, B:27:0x0102, B:29:0x0106, B:31:0x010a, B:33:0x010e, B:44:0x0175, B:35:0x0119, B:37:0x0124, B:39:0x0138, B:41:0x014c, B:43:0x0161), top: B:22:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Z(@m80.k java.lang.String r14, @m80.k j00.c<? super yz.g2> r15) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.Z(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0172 A[Catch: all -> 0x01f9, TryCatch #3 {all -> 0x01f9, blocks: (B:21:0x019d, B:13:0x0164, B:15:0x0172, B:106:0x010f), top: B:105:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0305 A[Catch: all -> 0x031d, TryCatch #6 {all -> 0x031d, blocks: (B:40:0x02fe, B:42:0x0305, B:44:0x0309, B:46:0x030d, B:48:0x0311, B:50:0x0315, B:61:0x037b, B:52:0x031f, B:54:0x032a, B:56:0x033e, B:58:0x0352, B:60:0x0367), top: B:39:0x02fe }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0367 A[Catch: all -> 0x031d, TryCatch #6 {all -> 0x031d, blocks: (B:40:0x02fe, B:42:0x0305, B:44:0x0309, B:46:0x030d, B:48:0x0311, B:50:0x0315, B:61:0x037b, B:52:0x031f, B:54:0x032a, B:56:0x033e, B:58:0x0352, B:60:0x0367), top: B:39:0x02fe }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b0(@m80.k k3.m4[] r35, @m80.k java.lang.String r36, @m80.k j00.c<? super yz.g2> r37) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.b0(k3.m4[], java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1 A[Catch: all -> 0x003e, LOOP:0: B:14:0x00cb->B:16:0x00d1, LOOP_END, TryCatch #4 {all -> 0x003e, blocks: (B:12:0x0039, B:13:0x00b8, B:14:0x00cb, B:16:0x00d1, B:18:0x00e3, B:19:0x00fa, B:21:0x0100, B:23:0x010e), top: B:11:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[Catch: all -> 0x003e, LOOP:1: B:19:0x00fa->B:21:0x0100, LOOP_END, TryCatch #4 {all -> 0x003e, blocks: (B:12:0x0039, B:13:0x00b8, B:14:0x00cb, B:16:0x00d1, B:18:0x00e3, B:19:0x00fa, B:21:0x0100, B:23:0x010e), top: B:11:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0160 A[Catch: all -> 0x0178, TryCatch #3 {all -> 0x0178, blocks: (B:32:0x0159, B:34:0x0160, B:36:0x0164, B:38:0x0168, B:40:0x016c, B:42:0x0170, B:53:0x01d6, B:44:0x017a, B:46:0x0185, B:48:0x0199, B:50:0x01ad, B:52:0x01c2), top: B:31:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c2 A[Catch: all -> 0x0178, TryCatch #3 {all -> 0x0178, blocks: (B:32:0x0159, B:34:0x0160, B:36:0x0164, B:38:0x0168, B:40:0x016c, B:42:0x0170, B:53:0x01d6, B:44:0x017a, B:46:0x0185, B:48:0x0199, B:50:0x01ad, B:52:0x01c2), top: B:31:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o1(int r19, @m80.k j00.c<? super k3.g4> r20) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.o1(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:22:0x00b5, B:24:0x00bc, B:26:0x00c0, B:28:0x00c4, B:30:0x00c8, B:32:0x00cc, B:43:0x0133, B:34:0x00d7, B:36:0x00e2, B:38:0x00f6, B:40:0x010a, B:42:0x011f), top: B:21:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(@m80.k java.lang.String r11, @m80.k j00.c<? super k3.o3> r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.p(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0789 A[Catch: all -> 0x0769, TryCatch #4 {all -> 0x0769, blocks: (B:159:0x0711, B:138:0x0789, B:140:0x0799), top: B:158:0x0711 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0a06 A[Catch: all -> 0x0a1e, TryCatch #34 {all -> 0x0a1e, blocks: (B:24:0x09ff, B:26:0x0a06, B:28:0x0a0a, B:30:0x0a0e, B:32:0x0a12, B:34:0x0a16, B:45:0x0a7c, B:36:0x0a20, B:38:0x0a2b, B:40:0x0a3f, B:42:0x0a53, B:44:0x0a68), top: B:23:0x09ff }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x040f A[Catch: all -> 0x03ef, TRY_ENTER, TryCatch #6 {all -> 0x03ef, blocks: (B:272:0x03db, B:282:0x040f, B:284:0x0427, B:286:0x0435, B:295:0x0450, B:299:0x0468, B:301:0x046e), top: B:271:0x03db }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0450 A[Catch: all -> 0x03ef, LOOP:3: B:293:0x044a->B:295:0x0450, LOOP_END, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x03ef, blocks: (B:272:0x03db, B:282:0x040f, B:284:0x0427, B:286:0x0435, B:295:0x0450, B:299:0x0468, B:301:0x046e), top: B:271:0x03db }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0381 A[Catch: all -> 0x0393, LOOP:4: B:321:0x037b->B:323:0x0381, LOOP_END, TryCatch #26 {all -> 0x0393, blocks: (B:320:0x036a, B:321:0x037b, B:323:0x0381, B:325:0x0398), top: B:319:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0a68 A[Catch: all -> 0x0a1e, TryCatch #34 {all -> 0x0a1e, blocks: (B:24:0x09ff, B:26:0x0a06, B:28:0x0a0a, B:30:0x0a0e, B:32:0x0a12, B:34:0x0a16, B:45:0x0a7c, B:36:0x0a20, B:38:0x0a2b, B:40:0x0a3f, B:42:0x0a53, B:44:0x0a68), top: B:23:0x09ff }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07c1 A[Catch: all -> 0x087e, TRY_LEAVE, TryCatch #18 {all -> 0x087e, blocks: (B:84:0x07bb, B:86:0x07c1), top: B:83:0x07bb }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0736 -> B:127:0x074f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x05d3 -> B:193:0x05ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x083c -> B:76:0x0131). Please report as a decompilation issue!!! */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y2(int r41, int r42, @m80.k java.lang.String[] r43, @m80.k j00.c<? super yz.g2> r44) {
        /*
            Method dump skipped, instructions count: 2764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.y2(int, int, java.lang.String[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:22:0x00ab, B:24:0x00b2, B:26:0x00b6, B:28:0x00ba, B:30:0x00be, B:32:0x00c2, B:43:0x0129, B:34:0x00cd, B:36:0x00d8, B:38:0x00ec, B:40:0x0100, B:42:0x0115), top: B:21:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:22:0x00ab, B:24:0x00b2, B:26:0x00b6, B:28:0x00ba, B:30:0x00be, B:32:0x00c2, B:43:0x0129, B:34:0x00cd, B:36:0x00d8, B:38:0x00ec, B:40:0x0100, B:42:0x0115), top: B:21:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.q3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z1(@m80.k j00.c<? super k3.k0> r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.u.z1(j00.c):java.lang.Object");
    }
}
