package com.baicizhan.main.word_book.data.impl;

import a00.w1;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.main.word_book.data.db.WordBookDatabase;
import com.jiongji.andriod.card.R;
import ij.x;
import ij.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nWordBookManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl\n+ 2 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 7 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,399:1\n16#2,2:400\n18#2:418\n1617#3,9:402\n1869#3:411\n1870#3:414\n1626#3:415\n774#3:419\n865#3:420\n1563#3:421\n1634#3,3:422\n866#3:425\n774#3:426\n865#3,2:427\n1869#3,2:429\n1869#3,2:431\n1869#3:433\n1869#3,2:434\n1870#3:436\n774#3:437\n865#3,2:438\n774#3:440\n865#3,2:441\n1869#3,2:443\n1869#3,2:445\n1563#3:447\n1634#3,3:448\n1803#3,3:451\n1#4:412\n1#4:413\n37#5,2:416\n49#6:454\n51#6:458\n49#6:459\n51#6:463\n49#6:464\n51#6:468\n46#7:455\n51#7:457\n46#7:460\n51#7:462\n46#7:465\n51#7:467\n105#8:456\n105#8:461\n105#8:466\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl\n*L\n72#1:400,2\n72#1:418\n73#1:402,9\n73#1:411\n73#1:414\n73#1:415\n96#1:419\n96#1:420\n96#1:421\n96#1:422,3\n96#1:425\n97#1:426\n97#1:427,2\n100#1:429,2\n101#1:431,2\n121#1:433\n123#1:434,2\n121#1:436\n131#1:437\n131#1:438,2\n132#1:440\n132#1:441,2\n150#1:443,2\n153#1:445,2\n165#1:447\n165#1:448,3\n168#1:451,3\n73#1:413\n88#1:416,2\n382#1:454\n382#1:458\n386#1:459\n386#1:463\n390#1:464\n390#1:468\n382#1:455\n382#1:457\n386#1:460\n386#1:462\n390#1:465\n390#1:467\n382#1:456\n386#1:461\n390#1:466\n*E\n"})
/* loaded from: classes5.dex */
public final class WordBookManagerImpl implements ij.q {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final a f26175i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f26176j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final String f26177k = WordBookManagerImpl.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WordBookDatabase f26178a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ij.j f26179b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final oj.b f26180c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ij.v f26181d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ij.w f26182e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final c40.m0 f26183f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public n40.h f26184g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26185h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getShareCode$2", f = "WordBookManagerImpl.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a0 extends SuspendLambda implements x00.l<j00.c<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26196a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26198c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(long j11, j00.c<? super a0> cVar) {
            super(1, cVar);
            this.f26198c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new a0(this.f26198c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super String> cVar) {
            return ((a0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26196a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            ij.w wVar = WordBookManagerImpl.this.f26182e;
            long j11 = this.f26198c;
            this.f26196a = 1;
            Object t11 = wVar.t(j11, this);
            return t11 == l11 ? l11 : t11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$updateBookInfo$2", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {337, 338}, m = "invokeSuspend", n = {"it", "$i$a$-also-WordBookManagerImpl$updateBookInfo$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class a1 extends SuspendLambda implements x00.l<j00.c<? super kj.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26199a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26200b;

        /* renamed from: c, reason: collision with root package name */
        public int f26201c;

        /* renamed from: d, reason: collision with root package name */
        public int f26202d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f26204f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f26205g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f26206h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a1(long j11, String str, List<Integer> list, j00.c<? super a1> cVar) {
            super(1, cVar);
            this.f26204f = j11;
            this.f26205g = str;
            this.f26206h = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new a1(this.f26204f, this.f26205g, this.f26206h, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super kj.a> cVar) {
            return ((a1) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            if (r11 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f26202d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r10.f26200b
                kj.a r0 = (kj.a) r0
                java.lang.Object r0 = r10.f26199a
                kotlin.e.n(r11)
                return r0
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                kotlin.e.n(r11)
                r9 = r10
                goto L3e
            L25:
                kotlin.e.n(r11)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r11 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r4 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r11)
                long r5 = r10.f26204f
                java.lang.String r7 = r10.f26205g
                java.util.List<java.lang.Integer> r8 = r10.f26206h
                r10.f26202d = r3
                r9 = r10
                java.lang.Object r11 = r4.k(r5, r7, r8, r9)
                if (r11 != r0) goto L3e
                goto L5a
            L3e:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r3 = r11
                kj.a r3 = (kj.a) r3
                ij.v r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r1)
                r9.f26199a = r11
                java.lang.Object r4 = l00.k.a(r3)
                r9.f26200b = r4
                r4 = 0
                r9.f26201c = r4
                r9.f26202d = r2
                java.lang.Object r1 = r1.i0(r3, r10)
                if (r1 != r0) goto L5b
            L5a:
                return r0
            L5b:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.a1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, l = {115, 118, 121, 124, 126, 142, 144, 147, 151, 154}, m = "actualUpdateFavorites", n = {"word", "bookIds", "bookIdsList", "word", "bookIds", "bookIdsList", "updatedInfo", "universalId", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "universalId", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "$this$forEach$iv", "element$iv", "it", "$this$forEach$iv", "element$iv", "universalId", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$actualUpdateFavorites$2", "$i$f$forEach", "toMinus", "$i$a$-forEach-WordBookManagerImpl$actualUpdateFavorites$2$1", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "$this$forEach$iv", "element$iv", "it", "universalId", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$actualUpdateFavorites$2", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "currentBooks", "news", "removes", TypedValues.AttributesType.S_TARGET, "universalId", "$i$a$-let-WordBookManagerImpl$actualUpdateFavorites$3", "toAdd", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "currentBooks", "news", "removes", TypedValues.AttributesType.S_TARGET, "universalId", "$i$a$-let-WordBookManagerImpl$actualUpdateFavorites$3", "toAdd", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "currentBooks", "news", "removes", "$this$actualUpdateFavorites_u24lambda_u244", "universalId", "$i$a$-run-WordBookManagerImpl$actualUpdateFavorites$4", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "currentBooks", "news", "removes", "$this$forEach$iv", "element$iv", "universalId", "$i$f$forEach", "it", "$i$a$-forEach-WordBookManagerImpl$actualUpdateFavorites$5", "word", "bookIds", "bookIdsList", "updatedInfo", "matchedCompletely", "currentBooks", "news", "removes", "$this$forEach$iv", "element$iv", "universalId", "$i$f$forEach", "it", "$i$a$-forEach-WordBookManagerImpl$actualUpdateFavorites$6"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "L$11", "J$0", "I$0", "I$1", "I$2", "J$1", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "J$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "J$0", "I$0", "J$1", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "J$0", "I$0", "J$1", "I$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26207a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26208b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26209c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26210d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26211e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26212f;

        /* renamed from: g, reason: collision with root package name */
        public Object f26213g;

        /* renamed from: h, reason: collision with root package name */
        public Object f26214h;

        /* renamed from: i, reason: collision with root package name */
        public Object f26215i;

        /* renamed from: j, reason: collision with root package name */
        public Object f26216j;

        /* renamed from: k, reason: collision with root package name */
        public Object f26217k;

        /* renamed from: l, reason: collision with root package name */
        public Object f26218l;

        /* renamed from: m, reason: collision with root package name */
        public long f26219m;

        /* renamed from: n, reason: collision with root package name */
        public long f26220n;

        /* renamed from: o, reason: collision with root package name */
        public int f26221o;

        /* renamed from: p, reason: collision with root package name */
        public int f26222p;

        /* renamed from: q, reason: collision with root package name */
        public int f26223q;

        /* renamed from: r, reason: collision with root package name */
        public int f26224r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f26225s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f26226t;

        /* renamed from: v, reason: collision with root package name */
        public int f26228v;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26226t = obj;
            this.f26228v |= Integer.MIN_VALUE;
            return WordBookManagerImpl.this.C0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {295}, m = "getWord-gIAlu-s", n = {"universalId"}, s = {"J$0"}, v = 1)
    public static final class b0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26229a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26230b;

        /* renamed from: d, reason: collision with root package name */
        public int f26232d;

        public b0(j00.c<? super b0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26230b = obj;
            this.f26232d |= Integer.MIN_VALUE;
            Object t11 = WordBookManagerImpl.this.t(0L, this);
            return t11 == kotlin.coroutines.intrinsics.b.l() ? t11 : Result.m6307boximpl(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {330}, m = "updateBookName-0E7RQCE", n = {"name", "bookId"}, s = {"L$0", "J$0"}, v = 1)
    public static final class b1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26233a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26234b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26235c;

        /* renamed from: e, reason: collision with root package name */
        public int f26237e;

        public b1(j00.c<? super b1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26235c = obj;
            this.f26237e |= Integer.MIN_VALUE;
            Object p11 = WordBookManagerImpl.this.p(0L, null, this);
            return p11 == kotlin.coroutines.intrinsics.b.l() ? p11 : Result.m6307boximpl(p11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {178}, m = "addBook-gIAlu-s", n = {"name"}, s = {"L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26238a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26239b;

        /* renamed from: d, reason: collision with root package name */
        public int f26241d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26239b = obj;
            this.f26241d |= Integer.MIN_VALUE;
            Object h02 = WordBookManagerImpl.this.h0(null, this);
            return h02 == kotlin.coroutines.intrinsics.b.l() ? h02 : Result.m6307boximpl(h02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getWord$2", f = "WordBookManagerImpl.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c0 extends SuspendLambda implements x00.l<j00.c<? super ij.z>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26242a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(long j11, j00.c<? super c0> cVar) {
            super(1, cVar);
            this.f26244c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new c0(this.f26244c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super ij.z> cVar) {
            return ((c0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ij.z b11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26242a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.v vVar = WordBookManagerImpl.this.f26181d;
                long j11 = this.f26244c;
                this.f26242a = 1;
                obj = vVar.T(j11, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            kj.b bVar = (kj.b) obj;
            if (bVar == null || (b11 = ij.c.b(bVar, 0L, 1, null)) == null) {
                throw new IllegalStateException("word not found");
            }
            return b11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$updateBookName$2", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {331, 332}, m = "invokeSuspend", n = {"it", "$i$a$-also-WordBookManagerImpl$updateBookName$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class c1 extends SuspendLambda implements x00.l<j00.c<? super kj.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26245a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26246b;

        /* renamed from: c, reason: collision with root package name */
        public int f26247c;

        /* renamed from: d, reason: collision with root package name */
        public int f26248d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f26250f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f26251g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c1(long j11, String str, j00.c<? super c1> cVar) {
            super(1, cVar);
            this.f26250f = j11;
            this.f26251g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new c1(this.f26250f, this.f26251g, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super kj.a> cVar) {
            return ((c1) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        
            if (r7 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f26248d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r6.f26246b
                kj.a r0 = (kj.a) r0
                java.lang.Object r0 = r6.f26245a
                kotlin.e.n(r7)
                return r0
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.e.n(r7)
                goto L3a
            L24:
                kotlin.e.n(r7)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r7)
                long r4 = r6.f26250f
                java.lang.String r1 = r6.f26251g
                r6.f26248d = r3
                java.lang.Object r7 = r7.o(r4, r1, r6)
                if (r7 != r0) goto L3a
                goto L56
            L3a:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r3 = r7
                kj.a r3 = (kj.a) r3
                ij.v r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r1)
                r6.f26245a = r7
                java.lang.Object r4 = l00.k.a(r3)
                r6.f26246b = r4
                r4 = 0
                r6.f26247c = r4
                r6.f26248d = r2
                java.lang.Object r1 = r1.i0(r3, r6)
                if (r1 != r0) goto L57
            L56:
                return r0
            L57:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.c1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$addBook$2", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {179, 180}, m = "invokeSuspend", n = {"it", "$i$a$-also-WordBookManagerImpl$addBook$2$1"}, s = {"L$2", "I$0"}, v = 1)
    public static final class d extends SuspendLambda implements x00.l<j00.c<? super kj.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26252a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26253b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26254c;

        /* renamed from: d, reason: collision with root package name */
        public int f26255d;

        /* renamed from: e, reason: collision with root package name */
        public int f26256e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f26258g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, j00.c<? super d> cVar) {
            super(1, cVar);
            this.f26258g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new d(this.f26258g, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super kj.a> cVar) {
            return ((d) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f26256e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r6.f26254c
                kj.a r0 = (kj.a) r0
                java.lang.Object r1 = r6.f26253b
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl) r1
                java.lang.Object r2 = r6.f26252a
                kotlin.e.n(r7)
                goto L59
            L1c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L24:
                kotlin.e.n(r7)
                goto L3c
            L28:
                kotlin.e.n(r7)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r7)
                java.lang.String r1 = r6.f26258g
                r6.f26256e = r3
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L3c
                goto L56
            L3c:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r3 = r7
                kj.a r3 = (kj.a) r3
                ij.v r4 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r1)
                r6.f26252a = r7
                r6.f26253b = r1
                r6.f26254c = r3
                r5 = 0
                r6.f26255d = r5
                r6.f26256e = r2
                java.lang.Object r2 = r4.R(r3, r6)
                if (r2 != r0) goto L57
            L56:
                return r0
            L57:
                r2 = r7
                r0 = r3
            L59:
                ij.j r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r1)
                long r0 = r0.m()
                r7.c(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {299}, m = "getWords-0E7RQCE", n = {"bookId", "forceUpdate"}, s = {"J$0", "Z$0"}, v = 1)
    public static final class d0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26259a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f26260b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26261c;

        /* renamed from: e, reason: collision with root package name */
        public int f26263e;

        public d0(j00.c<? super d0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26261c = obj;
            this.f26263e |= Integer.MIN_VALUE;
            Object k02 = WordBookManagerImpl.this.k0(0L, false, this);
            return k02 == kotlin.coroutines.intrinsics.b.l() ? k02 : Result.m6307boximpl(k02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {95, 100, 101}, m = "updateBooksRepository", n = {"booksInfo", "booksInfo", "curBooks", "removedOnes", "updatedOnes", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$updateBooksRepository$2", "booksInfo", "curBooks", "removedOnes", "updatedOnes", "$this$forEach$iv", "element$iv", "book", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$updateBooksRepository$3"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1"}, v = 1)
    public static final class d1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26264a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26265b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26266c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26267d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26268e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26269f;

        /* renamed from: g, reason: collision with root package name */
        public Object f26270g;

        /* renamed from: h, reason: collision with root package name */
        public Object f26271h;

        /* renamed from: i, reason: collision with root package name */
        public int f26272i;

        /* renamed from: j, reason: collision with root package name */
        public int f26273j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f26274k;

        /* renamed from: m, reason: collision with root package name */
        public int f26276m;

        public d1(j00.c<? super d1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26274k = obj;
            this.f26276m |= Integer.MIN_VALUE;
            return WordBookManagerImpl.this.M0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {185}, m = "addBook-0E7RQCE", n = {"name", "tags"}, s = {"L$0", "L$1"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26277a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26278b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26279c;

        /* renamed from: e, reason: collision with root package name */
        public int f26281e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26279c = obj;
            this.f26281e |= Integer.MIN_VALUE;
            Object b02 = WordBookManagerImpl.this.b0(null, null, this);
            return b02 == kotlin.coroutines.intrinsics.b.l() ? b02 : Result.m6307boximpl(b02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getWords$2", f = "WordBookManagerImpl.kt", i = {}, l = {302, 306}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e0 extends SuspendLambda implements x00.l<j00.c<? super List<? extends ij.z>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26282a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26284c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f26285d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(long j11, boolean z11, j00.c<? super e0> cVar) {
            super(1, cVar);
            this.f26284c = j11;
            this.f26285d = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new e0(this.f26284c, this.f26285d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<ij.z>> cVar) {
            return ((e0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (r7.a(r6) == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f26282a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.e.n(r7)
                return r7
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                kotlin.e.n(r7)
                goto L46
            L1f:
                kotlin.e.n(r7)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                n40.h r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.u0(r7)
                if (r7 == 0) goto L57
                java.lang.String r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v0()
                java.lang.String r1 = "wait to refresh done"
                java.lang.Object[] r5 = new java.lang.Object[r2]
                qb.c.b(r7, r1, r5)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                n40.h r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.u0(r7)
                if (r7 == 0) goto L46
                r6.f26282a = r4
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L46
                goto L65
            L46:
                java.lang.String r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v0()
                java.lang.String r1 = "------- refresh done"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                qb.c.b(r7, r1, r2)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r1 = 0
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.A0(r7, r1)
            L57:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                long r1 = r6.f26284c
                boolean r4 = r6.f26285d
                r6.f26282a = r3
                java.lang.Object r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.s0(r7, r1, r4, r6)
                if (r7 != r0) goto L66
            L65:
                return r0
            L66:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends ij.z>> cVar) {
            return invoke2((j00.c<? super List<ij.z>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0, 0}, l = {347}, m = "updateFavoriteScore-BWLJW6A", n = {"universalId", "bookId", a.b.C0242a.f16107c}, s = {"J$0", "J$1", "I$0"}, v = 1)
    public static final class e1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26286a;

        /* renamed from: b, reason: collision with root package name */
        public long f26287b;

        /* renamed from: c, reason: collision with root package name */
        public int f26288c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f26289d;

        /* renamed from: f, reason: collision with root package name */
        public int f26291f;

        public e1(j00.c<? super e1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26289d = obj;
            this.f26291f |= Integer.MIN_VALUE;
            Object D = WordBookManagerImpl.this.D(0L, 0L, 0, this);
            return D == kotlin.coroutines.intrinsics.b.l() ? D : Result.m6307boximpl(D);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$addBook$4", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {186, 187}, m = "invokeSuspend", n = {"it", "$i$a$-also-WordBookManagerImpl$addBook$4$1"}, s = {"L$2", "I$0"}, v = 1)
    public static final class f extends SuspendLambda implements x00.l<j00.c<? super kj.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26292a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26293b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26294c;

        /* renamed from: d, reason: collision with root package name */
        public int f26295d;

        /* renamed from: e, reason: collision with root package name */
        public int f26296e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f26298g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f26299h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, List<Integer> list, j00.c<? super f> cVar) {
            super(1, cVar);
            this.f26298g = str;
            this.f26299h = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new f(this.f26298g, this.f26299h, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super kj.a> cVar) {
            return ((f) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f26296e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r6.f26294c
                kj.a r0 = (kj.a) r0
                java.lang.Object r1 = r6.f26293b
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl) r1
                java.lang.Object r2 = r6.f26292a
                kotlin.e.n(r7)
                goto L5b
            L1c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L24:
                kotlin.e.n(r7)
                goto L3e
            L28:
                kotlin.e.n(r7)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r7)
                java.lang.String r1 = r6.f26298g
                java.util.List<java.lang.Integer> r4 = r6.f26299h
                r6.f26296e = r3
                java.lang.Object r7 = r7.r(r1, r4, r6)
                if (r7 != r0) goto L3e
                goto L58
            L3e:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r3 = r7
                kj.a r3 = (kj.a) r3
                ij.v r4 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r1)
                r6.f26292a = r7
                r6.f26293b = r1
                r6.f26294c = r3
                r5 = 0
                r6.f26295d = r5
                r6.f26296e = r2
                java.lang.Object r2 = r4.R(r3, r6)
                if (r2 != r0) goto L59
            L58:
                return r0
            L59:
                r2 = r7
                r0 = r3
            L5b:
                ij.j r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r1)
                long r0 = r0.m()
                r7.c(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$initialize$2", f = "WordBookManagerImpl.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f0 extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26300a;

        public f0(j00.c<? super f0> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new f0(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((f0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26300a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.v vVar = WordBookManagerImpl.this.f26181d;
                this.f26300a = 1;
                if (vVar.u(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$updateFavoriteScore$2", f = "WordBookManagerImpl.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f1 extends SuspendLambda implements x00.l<j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26302a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26304c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f26305d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f26306e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(long j11, long j12, int i11, j00.c<? super f1> cVar) {
            super(1, cVar);
            this.f26304c = j11;
            this.f26305d = j12;
            this.f26306e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new f1(this.f26304c, this.f26305d, this.f26306e, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Boolean> cVar) {
            return ((f1) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26302a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.v vVar = WordBookManagerImpl.this.f26181d;
                long j11 = this.f26304c;
                long j12 = this.f26305d;
                int i12 = this.f26306e;
                this.f26302a = 1;
                if (vVar.G(j11, j12, i12, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return l00.a.a(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {196}, m = "addBookByCode-gIAlu-s", n = {"shareCode"}, s = {"L$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26307a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26308b;

        /* renamed from: d, reason: collision with root package name */
        public int f26310d;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26308b = obj;
            this.f26310d |= Integer.MIN_VALUE;
            Object Q = WordBookManagerImpl.this.Q(null, this);
            return Q == kotlin.coroutines.intrinsics.b.l() ? Q : Result.m6307boximpl(Q);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$isRefreshNeeded$2", f = "WordBookManagerImpl.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordBookManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$isRefreshNeeded$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,399:1\n1#2:400\n*E\n"})
    public static final class g0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26311a;

        public g0(j00.c<? super g0> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return WordBookManagerImpl.this.new g0(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((g0) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0070, code lost:
        
            if (r7 != false) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f26311a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L18
                if (r1 != r3) goto L10
                kotlin.e.n(r7)
                goto L50
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                kotlin.e.n(r7)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.j r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r7)
                boolean r7 = r7.i()
                java.lang.String r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v0()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "sync needed: "
                r4.append(r5)
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                java.lang.Object[] r5 = new java.lang.Object[r2]
                qb.c.b(r1, r4, r5)
                if (r7 != 0) goto L72
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.v r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r7)
                r6.f26311a = r3
                java.lang.Object r7 = r7.d(r6)
                if (r7 != r0) goto L50
                return r0
            L50:
                java.util.List r7 = (java.util.List) r7
                boolean r7 = r7.isEmpty()
                java.lang.String r0 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v0()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "empty db and forced to refresh: "
                r1.append(r4)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r4 = new java.lang.Object[r2]
                qb.c.b(r0, r1, r4)
                if (r7 == 0) goto L73
            L72:
                r2 = r3
            L73:
                java.lang.Boolean r7 = l00.a.a(r2)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {342}, m = "updateFavorites-0E7RQCE", n = {"word", "bookIds"}, s = {"L$0", "L$1"}, v = 1)
    public static final class g1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26313a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26314b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26315c;

        /* renamed from: e, reason: collision with root package name */
        public int f26317e;

        public g1(j00.c<? super g1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26315c = obj;
            this.f26317e |= Integer.MIN_VALUE;
            Object c02 = WordBookManagerImpl.this.c0(null, null, this);
            return c02 == kotlin.coroutines.intrinsics.b.l() ? c02 : Result.m6307boximpl(c02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$addBookByCode$2", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {197, 198}, m = "invokeSuspend", n = {"it", "$i$a$-also-WordBookManagerImpl$addBookByCode$2$1"}, s = {"L$2", "I$0"}, v = 1)
    public static final class h extends SuspendLambda implements x00.l<j00.c<? super kj.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26318a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26319b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26320c;

        /* renamed from: d, reason: collision with root package name */
        public int f26321d;

        /* renamed from: e, reason: collision with root package name */
        public int f26322e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f26324g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, j00.c<? super h> cVar) {
            super(1, cVar);
            this.f26324g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new h(this.f26324g, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super kj.a> cVar) {
            return ((h) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f26322e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r6.f26320c
                kj.a r0 = (kj.a) r0
                java.lang.Object r1 = r6.f26319b
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl) r1
                java.lang.Object r2 = r6.f26318a
                kotlin.e.n(r7)
                goto L59
            L1c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L24:
                kotlin.e.n(r7)
                goto L3c
            L28:
                kotlin.e.n(r7)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r7)
                java.lang.String r1 = r6.f26324g
                r6.f26322e = r3
                java.lang.Object r7 = r7.f(r1, r6)
                if (r7 != r0) goto L3c
                goto L56
            L3c:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r3 = r7
                kj.a r3 = (kj.a) r3
                ij.v r4 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r1)
                r6.f26318a = r7
                r6.f26319b = r1
                r6.f26320c = r3
                r5 = 0
                r6.f26321d = r5
                r6.f26322e = r2
                java.lang.Object r2 = r4.R(r3, r6)
                if (r2 != r0) goto L57
            L56:
                return r0
            L57:
                r2 = r7
                r0 = r3
            L59:
                ij.j r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r1)
                long r0 = r0.m()
                r7.c(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 1}, l = {160, 160}, m = "isWordsNotComplete", n = {"bookId", "bookId"}, s = {"J$0", "J$0"}, v = 1)
    public static final class h0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26325a;

        /* renamed from: b, reason: collision with root package name */
        public int f26326b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26327c;

        /* renamed from: e, reason: collision with root package name */
        public int f26329e;

        public h0(j00.c<? super h0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26327c = obj;
            this.f26329e |= Integer.MIN_VALUE;
            return WordBookManagerImpl.this.I0(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$updateFavorites$2", f = "WordBookManagerImpl.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h1 extends SuspendLambda implements x00.l<j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26330a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ij.c0 f26332c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Set<Long> f26333d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h1(ij.c0 c0Var, Set<Long> set, j00.c<? super h1> cVar) {
            super(1, cVar);
            this.f26332c = c0Var;
            this.f26333d = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new h1(this.f26332c, this.f26333d, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Boolean> cVar) {
            return ((h1) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26330a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                WordBookManagerImpl wordBookManagerImpl = WordBookManagerImpl.this;
                ij.c0 c0Var = this.f26332c;
                Set<Long> set = this.f26333d;
                this.f26330a = 1;
                if (wordBookManagerImpl.C0(c0Var, set, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return l00.a.a(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {R.styleable.Theme_drawable_searchwords}, m = "addWords-0E7RQCE", n = {xd.a.f98002r, "bookId"}, s = {"L$0", "J$0"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26334a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26335b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26336c;

        /* renamed from: e, reason: collision with root package name */
        public int f26338e;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26336c = obj;
            this.f26338e |= Integer.MIN_VALUE;
            Object m02 = WordBookManagerImpl.this.m0(0L, null, this);
            return m02 == kotlin.coroutines.intrinsics.b.l() ? m02 : Result.m6307boximpl(m02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {203}, m = "parseWords-gIAlu-s", n = {"description"}, s = {"L$0"}, v = 1)
    public static final class i0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26339a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26340b;

        /* renamed from: d, reason: collision with root package name */
        public int f26342d;

        public i0(j00.c<? super i0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26340b = obj;
            this.f26342d |= Integer.MIN_VALUE;
            Object a02 = WordBookManagerImpl.this.a0(null, this);
            return a02 == kotlin.coroutines.intrinsics.b.l() ? a02 : Result.m6307boximpl(a02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 1, 1}, l = {107, 108}, m = "updateFavoritesForBook", n = {"bookId", "updatedWords", "bookId"}, s = {"J$0", "L$0", "J$0"}, v = 1)
    public static final class i1 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26343a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26344b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26345c;

        /* renamed from: e, reason: collision with root package name */
        public int f26347e;

        public i1(j00.c<? super i1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26345c = obj;
            this.f26347e |= Integer.MIN_VALUE;
            return WordBookManagerImpl.this.N0(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$addWords$3", f = "WordBookManagerImpl.kt", i = {1, 2}, l = {R.styleable.Theme_drawable_share_close, R.styleable.Theme_drawable_sound, R.styleable.Theme_drawable_syncview_error}, m = "invokeSuspend", n = {"result", "result"}, s = {"L$0", "L$0"}, v = 1)
    public static final class j extends SuspendLambda implements x00.l<j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26348a;

        /* renamed from: b, reason: collision with root package name */
        public int f26349b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f26351d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<ij.c0> f26352e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$addWords$3$1", f = "WordBookManagerImpl.kt", i = {}, l = {R.styleable.Theme_drawable_sound1, 224}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f26353a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WordBookManagerImpl f26354b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f26355c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ij.a0 f26356d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WordBookManagerImpl wordBookManagerImpl, long j11, ij.a0 a0Var, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f26354b = wordBookManagerImpl;
                this.f26355c = j11;
                this.f26356d = a0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f26354b, this.f26355c, this.f26356d, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
            
                if (r13.i0(r1, r12) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
            
                if (ij.v.g0(r4, r5, r7, false, r9, 4, null) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r12.f26353a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.e.n(r13)
                    r9 = r12
                    goto L53
                L13:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1b:
                    kotlin.e.n(r13)
                    r9 = r12
                    goto L3e
                L20:
                    kotlin.e.n(r13)
                    com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r13 = r12.f26354b
                    ij.v r4 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r13)
                    long r5 = r12.f26355c
                    ij.a0 r13 = r12.f26356d
                    java.util.List r7 = r13.f()
                    r12.f26353a = r3
                    r8 = 0
                    r10 = 4
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = ij.v.g0(r4, r5, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L3e
                    goto L52
                L3e:
                    com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r13 = r9.f26354b
                    ij.v r13 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r13)
                    ij.a0 r1 = r9.f26356d
                    kj.a r1 = r1.e()
                    r9.f26353a = r2
                    java.lang.Object r13 = r13.i0(r1, r12)
                    if (r13 != r0) goto L53
                L52:
                    return r0
                L53:
                    com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r13 = r9.f26354b
                    ij.j r13 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r13)
                    ij.a0 r0 = r9.f26356d
                    kj.a r0 = r0.e()
                    long r0 = r0.m()
                    r13.c(r0)
                    yz.g2 r13 = yz.g2.f100423a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j11, List<ij.c0> list, j00.c<? super j> cVar) {
            super(1, cVar);
            this.f26351d = j11;
            this.f26352e = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new j(this.f26351d, this.f26352e, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Boolean> cVar) {
            return ((j) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
        
            if (r12.L0(r5, r11) != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (r12 == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f26349b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r11.f26348a
                ij.a0 r0 = (ij.a0) r0
                kotlin.e.n(r12)
                goto L84
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                java.lang.Object r1 = r11.f26348a
                ij.a0 r1 = (ij.a0) r1
                kotlin.e.n(r12)
                goto L6b
            L29:
                kotlin.e.n(r12)
                goto L48
            L2d:
                kotlin.e.n(r12)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r12 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.B0(r12, r4)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r12 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r12 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r12)
                long r5 = r11.f26351d
                java.util.List<ij.c0> r1 = r11.f26352e
                r11.f26349b = r4
                java.lang.Object r12 = r12.n(r5, r1, r11)
                if (r12 != r0) goto L48
                goto L83
            L48:
                r9 = r12
                ij.a0 r9 = (ij.a0) r9
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r12 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                com.baicizhan.main.word_book.data.db.WordBookDatabase r12 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.t0(r12)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$j$a r5 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$j$a
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r6 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                long r7 = r11.f26351d
                r10 = 0
                r5.<init>(r6, r7, r9, r10)
                java.lang.Object r1 = l00.k.a(r9)
                r11.f26348a = r1
                r11.f26349b = r3
                java.lang.Object r12 = androidx.room.RoomDatabaseKt.withTransaction(r12, r5, r11)
                if (r12 != r0) goto L6a
                goto L83
            L6a:
                r1 = r9
            L6b:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r12 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r3 = 0
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.B0(r12, r3)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r12 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                long r5 = r11.f26351d
                java.lang.Object r1 = l00.k.a(r1)
                r11.f26348a = r1
                r11.f26349b = r2
                java.lang.Object r12 = r12.L0(r5, r11)
                if (r12 != r0) goto L84
            L83:
                return r0
            L84:
                java.lang.Boolean r12 = l00.a.a(r4)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$parseWords$2", f = "WordBookManagerImpl.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j0 extends SuspendLambda implements x00.l<j00.c<? super List<? extends ij.c0>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26357a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26359c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str, j00.c<? super j0> cVar) {
            super(1, cVar);
            this.f26359c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new j0(this.f26359c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<ij.c0>> cVar) {
            return ((j0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26357a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            ij.w wVar = WordBookManagerImpl.this.f26182e;
            String str = this.f26359c;
            this.f26357a = 1;
            Object p11 = wVar.p(str, this);
            return p11 == l11 ? l11 : p11;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends ij.c0>> cVar) {
            return invoke2((j00.c<? super List<ij.c0>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {R.styleable.Theme_drawable_tab_home}, m = "addWords-0E7RQCE", n = {"bookIds", xd.a.f98002r}, s = {"L$0", "L$1"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26360a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26361b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26362c;

        /* renamed from: e, reason: collision with root package name */
        public int f26364e;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26362c = obj;
            this.f26364e |= Integer.MIN_VALUE;
            Object i11 = WordBookManagerImpl.this.i(null, null, this);
            return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : Result.m6307boximpl(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {207}, m = "parseWords-gIAlu-s", n = {"bytes"}, s = {"L$0"}, v = 1)
    public static final class k0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26365a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26366b;

        /* renamed from: d, reason: collision with root package name */
        public int f26368d;

        public k0(j00.c<? super k0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26366b = obj;
            this.f26368d |= Integer.MIN_VALUE;
            Object V = WordBookManagerImpl.this.V(null, this);
            return V == kotlin.coroutines.intrinsics.b.l() ? V : Result.m6307boximpl(V);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$addWords$6", f = "WordBookManagerImpl.kt", i = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {R.styleable.Theme_drawable_tab_lecture_new, R.styleable.Theme_drawable_tab_mall, R.styleable.Theme_drawable_walk_sound4}, m = "invokeSuspend", n = {"result", "result", "$this$measureTime$iv$iv", "$this$forEach$iv", "element$iv", "$i$f$measureTime", "$i$f$measureTime", "mark$iv$iv", "$i$a$-measureTime-WordBookManagerImpl$addWords$6$2", "$i$f$forEach", "it", "$i$a$-forEach-WordBookManagerImpl$addWords$6$2$1"}, s = {"L$0", "L$0", "L$2", "L$3", "L$5", "I$0", "I$1", "J$0", "I$2", "I$3", "J$1", "I$4"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordBookManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$addWords$6\n+ 2 measureTime.kt\nkotlin/time/MeasureTimeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n24#2:400\n63#2,2:401\n65#2:405\n1869#3,2:403\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$addWords$6\n*L\n247#1:400\n247#1:401,2\n247#1:405\n248#1:403,2\n*E\n"})
    public static final class l extends SuspendLambda implements x00.l<j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26369a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26370b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26371c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26372d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26373e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26374f;

        /* renamed from: g, reason: collision with root package name */
        public int f26375g;

        /* renamed from: h, reason: collision with root package name */
        public int f26376h;

        /* renamed from: i, reason: collision with root package name */
        public int f26377i;

        /* renamed from: j, reason: collision with root package name */
        public int f26378j;

        /* renamed from: k, reason: collision with root package name */
        public int f26379k;

        /* renamed from: l, reason: collision with root package name */
        public long f26380l;

        /* renamed from: m, reason: collision with root package name */
        public long f26381m;

        /* renamed from: n, reason: collision with root package name */
        public int f26382n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Set<Long> f26384p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ List<ij.c0> f26385q;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$addWords$6$1", f = "WordBookManagerImpl.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {R.styleable.Theme_drawable_tab_mall_1111, R.styleable.Theme_drawable_tab_surrounding}, m = "invokeSuspend", n = {"$this$measureTime$iv$iv", "$this$forEach$iv", "element$iv", "it", "$i$f$measureTime", "$i$f$measureTime", "mark$iv$iv", "$i$a$-measureTime-WordBookManagerImpl$addWords$6$1$1", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$addWords$6$1$1$1"}, s = {"L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
        @kotlin.jvm.internal.u0({"SMAP\nWordBookManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$addWords$6$1\n+ 2 measureTime.kt\nkotlin/time/MeasureTimeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,399:1\n24#2:400\n63#2,2:401\n65#2:405\n1869#3,2:403\n1#4:406\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$addWords$6$1\n*L\n237#1:400\n237#1:401,2\n237#1:405\n238#1:403,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f26386a;

            /* renamed from: b, reason: collision with root package name */
            public Object f26387b;

            /* renamed from: c, reason: collision with root package name */
            public Object f26388c;

            /* renamed from: d, reason: collision with root package name */
            public Object f26389d;

            /* renamed from: e, reason: collision with root package name */
            public Object f26390e;

            /* renamed from: f, reason: collision with root package name */
            public Object f26391f;

            /* renamed from: g, reason: collision with root package name */
            public int f26392g;

            /* renamed from: h, reason: collision with root package name */
            public int f26393h;

            /* renamed from: i, reason: collision with root package name */
            public int f26394i;

            /* renamed from: j, reason: collision with root package name */
            public int f26395j;

            /* renamed from: k, reason: collision with root package name */
            public int f26396k;

            /* renamed from: l, reason: collision with root package name */
            public long f26397l;

            /* renamed from: m, reason: collision with root package name */
            public int f26398m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ WordBookManagerImpl f26399n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Set<Long> f26400o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ ij.b0 f26401p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WordBookManagerImpl wordBookManagerImpl, Set<Long> set, ij.b0 b0Var, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f26399n = wordBookManagerImpl;
                this.f26400o = set;
                this.f26401p = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f26399n, this.f26400o, this.f26401p, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x00b8, code lost:
            
                if (r3.i0(r15, r16) == r1) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x00ba, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
            
                if (r2.e(r6, r7, r16) == r1) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x007d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00b8 -> B:6:0x00bb). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Set<Long> set, List<ij.c0> list, j00.c<? super l> cVar) {
            super(1, cVar);
            this.f26384p = set;
            this.f26385q = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new l(this.f26384p, this.f26385q, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Boolean> cVar) {
            return ((l) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x00f0, code lost:
        
            if (r14.L0(r5, r19) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00f2, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
        
            if (androidx.room.RoomDatabaseKt.withTransaction(r7, r8, r19) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        
            if (r2 == r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00f7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00f0 -> B:7:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$parseWords$4", f = "WordBookManagerImpl.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class l0 extends SuspendLambda implements x00.l<j00.c<? super List<? extends ij.c0>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26402a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f26404c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(byte[] bArr, j00.c<? super l0> cVar) {
            super(1, cVar);
            this.f26404c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new l0(this.f26404c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<ij.c0>> cVar) {
            return ((l0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26402a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            ij.w wVar = WordBookManagerImpl.this.f26182e;
            byte[] bArr = this.f26404c;
            this.f26402a = 1;
            Object m11 = wVar.m(bArr, this);
            return m11 == l11 ? l11 : m11;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends ij.c0>> cVar) {
            return invoke2((j00.c<? super List<ij.c0>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {}, l = {374}, m = "copperExchange-IoAF18A", n = {}, s = {}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f26405a;

        /* renamed from: c, reason: collision with root package name */
        public int f26407c;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26405a = obj;
            this.f26407c |= Integer.MIN_VALUE;
            Object m11 = WordBookManagerImpl.this.m(this);
            return m11 == kotlin.coroutines.intrinsics.b.l() ? m11 : Result.m6307boximpl(m11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {211}, m = "parseWordsByOcr-gIAlu-s", n = {"bytes"}, s = {"L$0"}, v = 1)
    public static final class m0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26408a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26409b;

        /* renamed from: d, reason: collision with root package name */
        public int f26411d;

        public m0(j00.c<? super m0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26409b = obj;
            this.f26411d |= Integer.MIN_VALUE;
            Object A = WordBookManagerImpl.this.A(null, this);
            return A == kotlin.coroutines.intrinsics.b.l() ? A : Result.m6307boximpl(A);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$copperExchange$2", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {375, 377}, m = "invokeSuspend", n = {"result", "$i$a$-also-WordBookManagerImpl$copperExchange$2$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class n extends SuspendLambda implements x00.l<j00.c<? super ij.b>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26412a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26413b;

        /* renamed from: c, reason: collision with root package name */
        public int f26414c;

        /* renamed from: d, reason: collision with root package name */
        public int f26415d;

        public n(j00.c<? super n> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new n(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super ij.b> cVar) {
            return ((n) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            if (r7 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f26415d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r0 = r6.f26413b
                ij.b r0 = (ij.b) r0
                java.lang.Object r0 = r6.f26412a
                kotlin.e.n(r7)
                kotlin.Result r7 = (kotlin.Result) r7
                r7.m6317unboximpl()
                return r0
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                kotlin.e.n(r7)
                goto L3b
            L29:
                kotlin.e.n(r7)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r7)
                r6.f26415d = r3
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r0) goto L3b
                goto L59
            L3b:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                r4 = r7
                ij.b r4 = (ij.b) r4
                boolean r5 = r4.f()
                if (r5 == 0) goto L5a
                r6.f26412a = r7
                java.lang.Object r4 = l00.k.a(r4)
                r6.f26413b = r4
                r4 = 0
                r6.f26414c = r4
                r6.f26415d = r2
                java.lang.Object r1 = r1.L(r3, r6)
                if (r1 != r0) goto L5a
            L59:
                return r0
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$parseWordsByOcr$2", f = "WordBookManagerImpl.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n0 extends SuspendLambda implements x00.l<j00.c<? super List<? extends ij.c0>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26417a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f26419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(byte[] bArr, j00.c<? super n0> cVar) {
            super(1, cVar);
            this.f26419c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new n0(this.f26419c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<ij.c0>> cVar) {
            return ((n0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26417a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            ij.w wVar = WordBookManagerImpl.this.f26182e;
            byte[] bArr = this.f26419c;
            this.f26417a = 1;
            Object j11 = wVar.j(bArr, this);
            return j11 == l11 ? l11 : j11;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends ij.c0>> cVar) {
            return invoke2((j00.c<? super List<ij.c0>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0, 1, 1}, l = {163, 165}, m = "getAndUpdateWordsIfNecessary", n = {"bookId", "forceUpdate", "bookId", "forceUpdate"}, s = {"J$0", "Z$0", "J$0", "Z$0"}, v = 1)
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26420a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f26421b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26422c;

        /* renamed from: e, reason: collision with root package name */
        public int f26424e;

        public o(j00.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26422c = obj;
            this.f26424e |= Integer.MIN_VALUE;
            return WordBookManagerImpl.this.G0(0L, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {}, l = {363}, m = "refreshBooksMeta-IoAF18A", n = {}, s = {}, v = 1)
    public static final class o0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f26425a;

        /* renamed from: c, reason: collision with root package name */
        public int f26427c;

        public o0(j00.c<? super o0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26425a = obj;
            this.f26427c |= Integer.MIN_VALUE;
            Object P = WordBookManagerImpl.this.P(this);
            return P == kotlin.coroutines.intrinsics.b.l() ? P : Result.m6307boximpl(P);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {283}, m = "getBook-gIAlu-s", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26428a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26429b;

        /* renamed from: d, reason: collision with root package name */
        public int f26431d;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26429b = obj;
            this.f26431d |= Integer.MIN_VALUE;
            Object j02 = WordBookManagerImpl.this.j0(0L, this);
            return j02 == kotlin.coroutines.intrinsics.b.l() ? j02 : Result.m6307boximpl(j02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$refreshBooksMeta$2", f = "WordBookManagerImpl.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class p0 extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26432a;

        public p0(j00.c<? super p0> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new p0(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((p0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26432a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.w wVar = WordBookManagerImpl.this.f26182e;
                this.f26432a = 1;
                obj = wVar.b(this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            WordBookManagerImpl wordBookManagerImpl = WordBookManagerImpl.this;
            ij.x xVar = (ij.x) obj;
            wordBookManagerImpl.f26179b.g(xVar.h());
            wordBookManagerImpl.f26179b.h(xVar.g());
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getBook$2", f = "WordBookManagerImpl.kt", i = {}, l = {284}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class q extends SuspendLambda implements x00.l<j00.c<? super kj.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26434a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26436c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long j11, j00.c<? super q> cVar) {
            super(1, cVar);
            this.f26436c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new q(this.f26436c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super kj.a> cVar) {
            return ((q) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26434a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            ij.v vVar = WordBookManagerImpl.this.f26181d;
            long j11 = this.f26436c;
            this.f26434a = 1;
            Object N = vVar.N(j11, this);
            return N == l11 ? l11 : N;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {}, l = {352}, m = "refreshIfNecessary-IoAF18A", n = {}, s = {}, v = 1)
    public static final class q0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f26437a;

        /* renamed from: c, reason: collision with root package name */
        public int f26439c;

        public q0(j00.c<? super q0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26437a = obj;
            this.f26439c |= Integer.MIN_VALUE;
            Object K = WordBookManagerImpl.this.K(this);
            return K == kotlin.coroutines.intrinsics.b.l() ? K : Result.m6307boximpl(K);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {287}, m = "getBooks-gIAlu-s", n = {"universalId"}, s = {"J$0"}, v = 1)
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26440a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26441b;

        /* renamed from: d, reason: collision with root package name */
        public int f26443d;

        public r(j00.c<? super r> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26441b = obj;
            this.f26443d |= Integer.MIN_VALUE;
            Object r11 = WordBookManagerImpl.this.r(0L, this);
            return r11 == kotlin.coroutines.intrinsics.b.l() ? r11 : Result.m6307boximpl(r11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$refreshIfNecessary$2", f = "WordBookManagerImpl.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {353, 354, 356, 358}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$refreshIfNecessary$2$1", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$refreshIfNecessary$2$1", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$refreshIfNecessary$2$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1", "L$0", "L$3", "L$4", "I$0", "I$1", "L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordBookManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$refreshIfNecessary$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1869#2,2:400\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$refreshIfNecessary$2\n*L\n353#1:400,2\n*E\n"})
    public static final class r0 extends SuspendLambda implements x00.l<j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26444a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26445b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26446c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26447d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26448e;

        /* renamed from: f, reason: collision with root package name */
        public int f26449f;

        /* renamed from: g, reason: collision with root package name */
        public int f26450g;

        /* renamed from: h, reason: collision with root package name */
        public int f26451h;

        public r0(j00.c<? super r0> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new r0(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Boolean> cVar) {
            return ((r0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
        
            if (r2 == r1) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0154 -> B:8:0x015e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.r0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getBooks$2", f = "WordBookManagerImpl.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class s extends SuspendLambda implements x00.l<j00.c<? super Set<? extends Long>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26453a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f26455c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(long j11, j00.c<? super s> cVar) {
            super(1, cVar);
            this.f26455c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new s(this.f26455c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super Set<Long>> cVar) {
            return ((s) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Set<Long> q11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26453a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ij.v vVar = WordBookManagerImpl.this.f26181d;
                long j11 = this.f26455c;
                this.f26453a = 1;
                obj = vVar.T(j11, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            kj.b bVar = (kj.b) obj;
            return (bVar == null || (q11 = bVar.q()) == null) ? w1.k() : q11;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Set<? extends Long>> cVar) {
            return invoke2((j00.c<? super Set<Long>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {R.styleable.Theme_drawable_revocation}, m = "rematchWords-0E7RQCE", n = {"topicIds", "cate"}, s = {"L$0", "I$0"}, v = 1)
    public static final class s0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f26456a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26457b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26458c;

        /* renamed from: e, reason: collision with root package name */
        public int f26460e;

        public s0(j00.c<? super s0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26458c = obj;
            this.f26460e |= Integer.MIN_VALUE;
            Object I = WordBookManagerImpl.this.I(0, null, this);
            return I == kotlin.coroutines.intrinsics.b.l() ? I : Result.m6307boximpl(I);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {291}, m = "getBooks-gIAlu-s", n = {"topicId"}, s = {"I$0"}, v = 1)
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f26461a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26462b;

        /* renamed from: d, reason: collision with root package name */
        public int f26464d;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26462b = obj;
            this.f26464d |= Integer.MIN_VALUE;
            Object v11 = WordBookManagerImpl.this.v(0, this);
            return v11 == kotlin.coroutines.intrinsics.b.l() ? v11 : Result.m6307boximpl(v11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$rematchWords$2", f = "WordBookManagerImpl.kt", i = {}, l = {R.styleable.Theme_drawable_right_arrow}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class t0 extends SuspendLambda implements x00.l<j00.c<? super List<? extends ij.c0>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26465a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f26467c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f26468d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(int i11, List<Integer> list, j00.c<? super t0> cVar) {
            super(1, cVar);
            this.f26467c = i11;
            this.f26468d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new t0(this.f26467c, this.f26468d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<ij.c0>> cVar) {
            return ((t0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26465a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            ij.w wVar = WordBookManagerImpl.this.f26182e;
            int i12 = this.f26467c;
            List<Integer> list = this.f26468d;
            this.f26465a = 1;
            Object s11 = wVar.s(i12, list, this);
            return s11 == l11 ? l11 : s11;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends ij.c0>> cVar) {
            return invoke2((j00.c<? super List<ij.c0>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getBooks$4", f = "WordBookManagerImpl.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class u extends SuspendLambda implements x00.l<j00.c<? super Set<Long>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26469a;

        /* renamed from: b, reason: collision with root package name */
        public int f26470b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f26472d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i11, j00.c<? super u> cVar) {
            super(1, cVar);
            this.f26472d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new u(this.f26472d, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Set<Long>> cVar) {
            return ((u) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WordBookManagerImpl wordBookManagerImpl;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26470b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                WordBookManagerImpl wordBookManagerImpl2 = WordBookManagerImpl.this;
                ij.v vVar = wordBookManagerImpl2.f26181d;
                int i12 = this.f26472d;
                this.f26469a = wordBookManagerImpl2;
                this.f26470b = 1;
                Object l12 = vVar.l(i12, this);
                if (l12 == l11) {
                    return l11;
                }
                wordBookManagerImpl = wordBookManagerImpl2;
                obj = l12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wordBookManagerImpl = (WordBookManagerImpl) this.f26469a;
                kotlin.e.n(obj);
            }
            return wordBookManagerImpl.F0((List) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {309}, m = "removeBook-gIAlu-s", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class u0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26473a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26474b;

        /* renamed from: d, reason: collision with root package name */
        public int f26476d;

        public u0(j00.c<? super u0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26474b = obj;
            this.f26476d |= Integer.MIN_VALUE;
            Object S = WordBookManagerImpl.this.S(0L, this);
            return S == kotlin.coroutines.intrinsics.b.l() ? S : Result.m6307boximpl(S);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {255}, m = "getBooksInfo-gIAlu-s", n = {"forceUpdate"}, s = {"Z$0"}, v = 1)
    public static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public boolean f26477a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26478b;

        /* renamed from: d, reason: collision with root package name */
        public int f26480d;

        public v(j00.c<? super v> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26478b = obj;
            this.f26480d |= Integer.MIN_VALUE;
            Object L = WordBookManagerImpl.this.L(false, this);
            return L == kotlin.coroutines.intrinsics.b.l() ? L : Result.m6307boximpl(L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$removeBook$2", f = "WordBookManagerImpl.kt", i = {1}, l = {310, 311}, m = "invokeSuspend", n = {"mills"}, s = {"J$0"}, v = 1)
    public static final class v0 extends SuspendLambda implements x00.l<j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f26481a;

        /* renamed from: b, reason: collision with root package name */
        public int f26482b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f26484d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(long j11, j00.c<? super v0> cVar) {
            super(1, cVar);
            this.f26484d = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new v0(this.f26484d, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Boolean> cVar) {
            return ((v0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        
            if (r9 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f26482b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                long r0 = r8.f26481a
                kotlin.e.n(r9)
                goto L4e
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                kotlin.e.n(r9)
                goto L34
            L20:
                kotlin.e.n(r9)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r9 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r9 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r9)
                long r4 = r8.f26484d
                r8.f26482b = r3
                java.lang.Object r9 = r9.h(r4, r8)
                if (r9 != r0) goto L34
                goto L4c
            L34:
                java.lang.Number r9 = (java.lang.Number) r9
                long r4 = r9.longValue()
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r9 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.v r9 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r9)
                long r6 = r8.f26484d
                r8.f26481a = r4
                r8.f26482b = r2
                java.lang.Object r9 = r9.h(r6, r8)
                if (r9 != r0) goto L4d
            L4c:
                return r0
            L4d:
                r0 = r4
            L4e:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r9 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.j r9 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r9)
                r9.c(r0)
                java.lang.Boolean r9 = l00.a.a(r3)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getBooksInfo$3", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {258, 259, 277}, m = "invokeSuspend", n = {"it", "$i$a$-also-WordBookManagerImpl$getBooksInfo$3$1"}, s = {"L$1", "I$0"}, v = 1)
    public static final class w extends SuspendLambda implements x00.l<j00.c<? super ij.x>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26485a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26486b;

        /* renamed from: c, reason: collision with root package name */
        public int f26487c;

        /* renamed from: d, reason: collision with root package name */
        public int f26488d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f26489e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ WordBookManagerImpl f26490f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getBooksInfo$3$1$1", f = "WordBookManagerImpl.kt", i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3}, l = {260, 262, 262, 270}, m = "invokeSuspend", n = {"updated", "$this$associate$iv", "$this$associateTo$iv$iv", "destination$iv$iv", "element$iv$iv", "book", "$i$f$associate", "capacity$iv", "$i$f$associateTo", "$i$a$-associate-WordBookManagerImpl$getBooksInfo$3$1$1$1", "updated", "updated", "$this$forEach$iv", "element$iv", "book", "$i$f$forEach", "$i$a$-forEach-WordBookManagerImpl$getBooksInfo$3$1$1$4"}, s = {"L$0", "L$1", "L$3", "L$4", "L$6", "L$8", "I$0", "I$1", "I$2", "I$3", "L$0", "L$0", "L$1", "L$4", "L$5", "I$0", "I$1"}, v = 1)
        @kotlin.jvm.internal.u0({"SMAP\nWordBookManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$getBooksInfo$3$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,399:1\n1193#2,2:400\n1267#2,4:402\n1869#2,2:407\n1#3:406\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$getBooksInfo$3$1$1\n*L\n262#1:400,2\n262#1:402,4\n269#1:407,2\n*E\n"})
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f26491a;

            /* renamed from: b, reason: collision with root package name */
            public Object f26492b;

            /* renamed from: c, reason: collision with root package name */
            public Object f26493c;

            /* renamed from: d, reason: collision with root package name */
            public Object f26494d;

            /* renamed from: e, reason: collision with root package name */
            public Object f26495e;

            /* renamed from: f, reason: collision with root package name */
            public Object f26496f;

            /* renamed from: g, reason: collision with root package name */
            public Object f26497g;

            /* renamed from: h, reason: collision with root package name */
            public Object f26498h;

            /* renamed from: i, reason: collision with root package name */
            public Object f26499i;

            /* renamed from: j, reason: collision with root package name */
            public Object f26500j;

            /* renamed from: k, reason: collision with root package name */
            public Object f26501k;

            /* renamed from: l, reason: collision with root package name */
            public int f26502l;

            /* renamed from: m, reason: collision with root package name */
            public int f26503m;

            /* renamed from: n, reason: collision with root package name */
            public int f26504n;

            /* renamed from: o, reason: collision with root package name */
            public int f26505o;

            /* renamed from: p, reason: collision with root package name */
            public int f26506p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ WordBookManagerImpl f26507q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ij.x f26508r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WordBookManagerImpl wordBookManagerImpl, ij.x xVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f26507q = wordBookManagerImpl;
                this.f26508r = xVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f26507q, this.f26508r, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:47:0x0156, code lost:
            
                if (r9.f0(r11, r19) == r1) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0091, code lost:
            
                if (r2 == r1) goto L41;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
            /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r9v13 */
            /* JADX WARN: Type inference failed for: r9v2 */
            /* JADX WARN: Type inference failed for: r9v3, types: [ij.v, java.lang.Object] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0120 -> B:31:0x0124). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                /*
                    Method dump skipped, instructions count: 585
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z11, WordBookManagerImpl wordBookManagerImpl, j00.c<? super w> cVar) {
            super(1, cVar);
            this.f26489e = z11;
            this.f26490f = wordBookManagerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new w(this.f26489e, this.f26490f, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super ij.x> cVar) {
            return ((w) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            if (r8 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f26488d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                int r0 = r7.f26487c
                kotlin.e.n(r8)
                goto L8d
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r0 = r7.f26486b
                ij.x r0 = (ij.x) r0
                java.lang.Object r0 = r7.f26485a
                kotlin.e.n(r8)
                goto L6d
            L2a:
                kotlin.e.n(r8)
                goto L49
            L2e:
                kotlin.e.n(r8)
                boolean r8 = r7.f26489e
                if (r8 == 0) goto L70
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r8 = r7.f26490f
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.B0(r8, r4)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r8 = r7.f26490f
                ij.w r8 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r8)
                r7.f26488d = r4
                java.lang.Object r8 = r8.b(r7)
                if (r8 != r0) goto L49
                goto L8a
            L49:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = r7.f26490f
                r2 = r8
                ij.x r2 = (ij.x) r2
                com.baicizhan.main.word_book.data.db.WordBookDatabase r4 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.t0(r1)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$w$a r5 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$w$a
                r6 = 0
                r5.<init>(r1, r2, r6)
                r7.f26485a = r8
                java.lang.Object r1 = l00.k.a(r2)
                r7.f26486b = r1
                r1 = 0
                r7.f26487c = r1
                r7.f26488d = r3
                java.lang.Object r1 = androidx.room.RoomDatabaseKt.withTransaction(r4, r5, r7)
                if (r1 != r0) goto L6c
                goto L8a
            L6c:
                r0 = r8
            L6d:
                ij.x r0 = (ij.x) r0
                return r0
            L70:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r8 = r7.f26490f
                ij.j r8 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r8)
                int r8 = r8.a()
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = r7.f26490f
                ij.v r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r1)
                r7.f26487c = r8
                r7.f26488d = r2
                java.lang.Object r1 = r1.d(r7)
                if (r1 != r0) goto L8b
            L8a:
                return r0
            L8b:
                r0 = r8
                r8 = r1
            L8d:
                java.util.List r8 = (java.util.List) r8
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r1 = r7.f26490f
                ij.j r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r1)
                int r1 = r1.j()
                ij.x r2 = new ij.x
                r2.<init>(r0, r8, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0}, l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "removeWords-0E7RQCE", n = {"universalIds", "bookId"}, s = {"L$0", "J$0"}, v = 1)
    public static final class w0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26509a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26510b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26511c;

        /* renamed from: e, reason: collision with root package name */
        public int f26513e;

        public w0(j00.c<? super w0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26511c = obj;
            this.f26513e |= Integer.MIN_VALUE;
            Object z11 = WordBookManagerImpl.this.z(0L, null, this);
            return z11 == kotlin.coroutines.intrinsics.b.l() ? z11 : Result.m6307boximpl(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {}, l = {370}, m = "getCopperExchangeInfo-IoAF18A", n = {}, s = {}, v = 1)
    public static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f26514a;

        /* renamed from: c, reason: collision with root package name */
        public int f26516c;

        public x(j00.c<? super x> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26514a = obj;
            this.f26516c |= Integer.MIN_VALUE;
            Object n02 = WordBookManagerImpl.this.n0(this);
            return n02 == kotlin.coroutines.intrinsics.b.l() ? n02 : Result.m6307boximpl(n02);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$removeWords$3", f = "WordBookManagerImpl.kt", i = {1, 1}, l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET, MediaSessionCompat.K}, m = "invokeSuspend", n = {"it", "$i$a$-also-WordBookManagerImpl$removeWords$3$2"}, s = {"L$2", "I$0"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordBookManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$removeWords$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1563#2:400\n1634#2,3:401\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl$removeWords$3\n*L\n318#1:400\n318#1:401,3\n*E\n"})
    public static final class x0 extends SuspendLambda implements x00.l<j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26517a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26518b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26519c;

        /* renamed from: d, reason: collision with root package name */
        public int f26520d;

        /* renamed from: e, reason: collision with root package name */
        public int f26521e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f26523g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List<Long> f26524h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$removeWords$3$2$1", f = "WordBookManagerImpl.kt", i = {}, l = {321, 322}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f26525a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WordBookManagerImpl f26526b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f26527c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List<Long> f26528d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kj.a f26529e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WordBookManagerImpl wordBookManagerImpl, long j11, List<Long> list, kj.a aVar, j00.c<? super a> cVar) {
                super(1, cVar);
                this.f26526b = wordBookManagerImpl;
                this.f26527c = j11;
                this.f26528d = list;
                this.f26529e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new a(this.f26526b, this.f26527c, this.f26528d, this.f26529e, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
            
                if (r7.i0(r1, r6) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
            
                if (r7.g(r4, r1, r6) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r6.f26525a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r7)
                    goto L45
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    kotlin.e.n(r7)
                    goto L34
                L1e:
                    kotlin.e.n(r7)
                    com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = r6.f26526b
                    ij.v r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r7)
                    long r4 = r6.f26527c
                    java.util.List<java.lang.Long> r1 = r6.f26528d
                    r6.f26525a = r3
                    java.lang.Object r7 = r7.g(r4, r1, r6)
                    if (r7 != r0) goto L34
                    goto L44
                L34:
                    com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = r6.f26526b
                    ij.v r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0(r7)
                    kj.a r1 = r6.f26529e
                    r6.f26525a = r2
                    java.lang.Object r7 = r7.i0(r1, r6)
                    if (r7 != r0) goto L45
                L44:
                    return r0
                L45:
                    com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r7 = r6.f26526b
                    ij.j r7 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r7)
                    kj.a r0 = r6.f26529e
                    long r0 = r0.m()
                    r7.c(r0)
                    yz.g2 r7 = yz.g2.f100423a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(long j11, List<Long> list, j00.c<? super x0> cVar) {
            super(1, cVar);
            this.f26523g = j11;
            this.f26524h = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new x0(this.f26523g, this.f26524h, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super Boolean> cVar) {
            return ((x0) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        
            if (r13 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f26521e
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r0 = r12.f26519c
                kj.a r0 = (kj.a) r0
                java.lang.Object r0 = r12.f26518b
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl) r0
                kotlin.e.n(r13)
                goto Lb5
            L1c:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L24:
                kotlin.e.n(r13)
                goto L72
            L28:
                kotlin.e.n(r13)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r13 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.B0(r13, r4)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r13 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                ij.w r13 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y0(r13)
                long r5 = r12.f26523g
                java.util.List<java.lang.Long> r1 = r12.f26524h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = 10
                int r8 = a00.i0.d0(r1, r8)
                r7.<init>(r8)
                java.util.Iterator r1 = r1.iterator()
            L4b:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L69
                java.lang.Object r8 = r1.next()
                java.lang.Number r8 = (java.lang.Number) r8
                long r8 = r8.longValue()
                ij.z$a r10 = ij.z.f60671m
                int r8 = r10.b(r8)
                java.lang.Integer r8 = l00.a.f(r8)
                r7.add(r8)
                goto L4b
            L69:
                r12.f26521e = r4
                java.lang.Object r13 = r13.g(r5, r7, r12)
                if (r13 != r0) goto L72
                goto Lb3
            L72:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r6 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.this
                long r7 = r12.f26523g
                java.util.List<java.lang.Long> r9 = r12.f26524h
                r10 = r13
                kj.a r10 = (kj.a) r10
                java.lang.String r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v0()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r11 = " remove words: "
                r5.append(r11)
                r5.append(r10)
                java.lang.String r5 = r5.toString()
                java.lang.Object[] r11 = new java.lang.Object[r3]
                qb.c.b(r1, r5, r11)
                com.baicizhan.main.word_book.data.db.WordBookDatabase r1 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.t0(r6)
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$x0$a r5 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$x0$a
                r11 = 0
                r5.<init>(r6, r7, r9, r10, r11)
                r12.f26517a = r13
                r12.f26518b = r6
                java.lang.Object r13 = l00.k.a(r10)
                r12.f26519c = r13
                r12.f26520d = r3
                r12.f26521e = r2
                java.lang.Object r13 = androidx.room.RoomDatabaseKt.withTransaction(r1, r5, r12)
                if (r13 != r0) goto Lb4
            Lb3:
                return r0
            Lb4:
                r0 = r6
            Lb5:
                com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.B0(r0, r3)
                java.lang.Boolean r13 = l00.a.a(r4)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$getCopperExchangeInfo$2", f = "WordBookManagerImpl.kt", i = {}, l = {371}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class y extends SuspendLambda implements x00.l<j00.c<? super ij.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26530a;

        public y(j00.c<? super y> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return WordBookManagerImpl.this.new y(cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super ij.a> cVar) {
            return ((y) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26530a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            ij.w wVar = WordBookManagerImpl.this.f26182e;
            this.f26530a = 1;
            Object i12 = wVar.i(2, this);
            return i12 == l11 ? l11 : i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {71, 88}, m = "supplementWordsIfNecessary", n = {"bookId", TtmlNode.COMBINE_ALL, "$this$available$iv", "founds", "parsed", "bookId", "$i$f$available", "$i$a$-available-WordBookManagerImpl$supplementWordsIfNecessary$2"}, s = {"J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "I$0", "I$1"}, v = 1)
    public static final class y0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26532a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26533b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26534c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26535d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26536e;

        /* renamed from: f, reason: collision with root package name */
        public int f26537f;

        /* renamed from: g, reason: collision with root package name */
        public int f26538g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f26539h;

        /* renamed from: j, reason: collision with root package name */
        public int f26541j;

        public y0(j00.c<? super y0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26539h = obj;
            this.f26541j |= Integer.MIN_VALUE;
            return WordBookManagerImpl.this.L0(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0}, l = {192}, m = "getShareCode-gIAlu-s", n = {"bookId"}, s = {"J$0"}, v = 1)
    public static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26542a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26543b;

        /* renamed from: d, reason: collision with root package name */
        public int f26545d;

        public z(j00.c<? super z> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26543b = obj;
            this.f26545d |= Integer.MIN_VALUE;
            Object B = WordBookManagerImpl.this.B(0L, this);
            return B == kotlin.coroutines.intrinsics.b.l() ? B : Result.m6307boximpl(B);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl", f = "WordBookManagerImpl.kt", i = {0, 0, 0}, l = {336}, m = "updateBookInfo-BWLJW6A", n = {"name", "tags", "bookId"}, s = {"L$0", "L$1", "J$0"}, v = 1)
    public static final class z0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26546a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26547b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26548c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f26549d;

        /* renamed from: f, reason: collision with root package name */
        public int f26551f;

        public z0(j00.c<? super z0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26549d = obj;
            this.f26551f |= Integer.MIN_VALUE;
            Object y11 = WordBookManagerImpl.this.y(0L, null, null, this);
            return y11 == kotlin.coroutines.intrinsics.b.l() ? y11 : Result.m6307boximpl(y11);
        }
    }

    public WordBookManagerImpl(@m80.k WordBookDatabase db2, @m80.k ij.j wordBookConfig, @m80.k oj.b wordSource, @m80.k ij.v wordBookRepository, @m80.k ij.w wordBookService, @m80.k c40.m0 coroutineDispatcher) {
        kotlin.jvm.internal.g0.p(db2, "db");
        kotlin.jvm.internal.g0.p(wordBookConfig, "wordBookConfig");
        kotlin.jvm.internal.g0.p(wordSource, "wordSource");
        kotlin.jvm.internal.g0.p(wordBookRepository, "wordBookRepository");
        kotlin.jvm.internal.g0.p(wordBookService, "wordBookService");
        kotlin.jvm.internal.g0.p(coroutineDispatcher, "coroutineDispatcher");
        this.f26178a = db2;
        this.f26179b = wordBookConfig;
        this.f26180c = wordSource;
        this.f26181d = wordBookRepository;
        this.f26182e = wordBookService;
        this.f26183f = coroutineDispatcher;
    }

    public static final g2 D0(WordBookManagerImpl wordBookManagerImpl) {
        wordBookManagerImpl.K0(false);
        return g2.f100423a;
    }

    public static final g2 E0(WordBookManagerImpl wordBookManagerImpl) {
        wordBookManagerImpl.K0(false);
        return g2.f100423a;
    }

    public static final g2 H0(WordBookManagerImpl wordBookManagerImpl) {
        wordBookManagerImpl.K0(false);
        return g2.f100423a;
    }

    public static final g2 J0(WordBookManagerImpl wordBookManagerImpl) {
        wordBookManagerImpl.K0(false);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(@m80.k byte[] r8, @m80.k j00.c<? super kotlin.Result<? extends java.util.List<ij.c0>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.m0
            if (r0 == 0) goto L14
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$m0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.m0) r0
            int r1 = r0.f26411d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26411d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$m0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$m0
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f26409b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26411d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r8 = r4.f26408a
            byte[] r8 = (byte[]) r8
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.m6317unboximpl()
            return r8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.e.n(r9)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$n0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$n0
            r9 = 0
            r3.<init>(r8, r9)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f26408a = r8
            r4.f26411d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.A(byte[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(long r8, @m80.k j00.c<? super kotlin.Result<java.lang.String>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.z
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$z r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.z) r0
            int r1 = r0.f26545d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26545d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$z r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$z
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26543b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26545d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$a0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$a0
            r10 = 0
            r3.<init>(r8, r10)
            r4.f26542a = r8
            r4.f26545d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.B(long, j00.c):java.lang.Object");
    }

    @Override // ij.m
    @m80.k
    public Set<Integer> C() {
        return this.f26181d.C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0232, code lost:
    
        if (r3 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01df, code lost:
    
        if (r6 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03f6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x03b0 -> B:32:0x03ba). Please report as a decompilation issue!!! */
    @m80.l
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(@m80.k ij.c0 r37, @m80.k java.util.Set<java.lang.Long> r38, @m80.k j00.c<? super yz.g2> r39) {
        /*
            Method dump skipped, instructions count: 1870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.C0(ij.c0, java.util.Set, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(long r13, long r15, int r17, @m80.k j00.c<? super kotlin.Result<java.lang.Boolean>> r18) {
        /*
            r12 = this;
            r0 = r18
            boolean r2 = r0 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.e1
            if (r2 == 0) goto L16
            r2 = r0
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e1 r2 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.e1) r2
            int r3 = r2.f26291f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f26291f = r3
        L14:
            r8 = r2
            goto L1c
        L16:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e1 r2 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e1
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f26289d
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r8.f26291f
            r10 = 1
            if (r2 == 0) goto L3b
            if (r2 != r10) goto L33
            kotlin.e.n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.m6317unboximpl()
            return r0
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            kotlin.e.n(r0)
            c40.m0 r11 = r12.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$f1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$f1
            r7 = 0
            r1 = r12
            r2 = r13
            r4 = r15
            r6 = r17
            r0.<init>(r2, r4, r6, r7)
            r8.f26286a = r13
            r8.f26287b = r4
            r8.f26288c = r6
            r8.f26291f = r10
            r1 = 0
            r2 = 2
            r3 = 0
            r15 = r0
            r14 = r1
            r17 = r2
            r18 = r3
            r16 = r8
            r13 = r11
            java.lang.Object r0 = com.baicizhan.main.word_book.data.impl.c.d(r13, r14, r15, r16, r17, r18)
            if (r0 != r9) goto L66
            return r9
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.D(long, long, int, j00.c):java.lang.Object");
    }

    public final Set<Long> F0(List<kj.b> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((kj.b) it.next()).q());
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[LOOP:0: B:12:0x006d->B:14:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G0(long r6, boolean r8, j00.c<? super java.util.List<ij.z>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.o
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$o r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.o) r0
            int r1 = r0.f26424e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26424e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$o r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$o
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26422c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26424e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r6 = r0.f26420a
            kotlin.e.n(r9)
            goto L5c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.e.n(r9)
            return r9
        L3a:
            kotlin.e.n(r9)
            if (r8 == 0) goto L4d
            r0.f26420a = r6
            r0.f26421b = r8
            r0.f26424e = r4
            java.lang.Object r6 = r5.N0(r6, r0)
            if (r6 != r1) goto L4c
            goto L5b
        L4c:
            return r6
        L4d:
            ij.v r9 = r5.f26181d
            r0.f26420a = r6
            r0.f26421b = r8
            r0.f26424e = r3
            java.lang.Object r9 = r9.a(r6, r0)
            if (r9 != r1) goto L5c
        L5b:
            return r1
        L5c:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r0 = 10
            int r0 = a00.i0.d0(r9, r0)
            r8.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L6d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r9.next()
            kj.b r0 = (kj.b) r0
            ij.z r0 = ij.c.a(r0, r6)
            r8.add(r0)
            goto L6d
        L81:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.G0(long, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(int r8, @m80.k java.util.List<java.lang.Integer> r9, @m80.k j00.c<? super kotlin.Result<? extends java.util.List<ij.c0>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.s0
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$s0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.s0) r0
            int r1 = r0.f26460e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26460e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$s0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$s0
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26458c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26460e
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r8 = r4.f26457b
            java.util.List r8 = (java.util.List) r8
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$t0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$t0
            r10 = 0
            r3.<init>(r8, r9, r10)
            java.lang.Object r9 = l00.k.a(r9)
            r4.f26457b = r9
            r4.f26456a = r8
            r4.f26460e = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5c
            return r0
        L5c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.I(int, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I0(long r7, j00.c<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.h0
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$h0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.h0) r0
            int r1 = r0.f26329e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26329e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$h0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$h0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26327c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26329e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r7 = r0.f26326b
            kotlin.e.n(r9)
            goto L64
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            long r7 = r0.f26325a
            kotlin.e.n(r9)
            goto L4c
        L3c:
            kotlin.e.n(r9)
            ij.v r9 = r6.f26181d
            r0.f26325a = r7
            r0.f26329e = r4
            java.lang.Object r9 = r9.N(r7, r0)
            if (r9 != r1) goto L4c
            goto L60
        L4c:
            kj.a r9 = (kj.a) r9
            int r9 = r9.n()
            ij.v r2 = r6.f26181d
            r0.f26325a = r7
            r0.f26326b = r9
            r0.f26329e = r3
            java.lang.Object r7 = r2.x(r7, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            r5 = r9
            r9 = r7
            r7 = r5
        L64:
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r9.intValue()
            if (r7 == r8) goto L6d
            goto L6e
        L6d:
            r4 = 0
        L6e:
            java.lang.Boolean r7 = l00.a.a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.I0(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(@m80.k j00.c<? super kotlin.Result<java.lang.Boolean>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.q0
            if (r0 == 0) goto L14
            r0 = r8
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$q0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.q0) r0
            int r1 = r0.f26439c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26439c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$q0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$q0
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f26437a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26439c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$r0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$r0
            r8 = 0
            r3.<init>(r8)
            r4.f26439c = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.K(j00.c):java.lang.Object");
    }

    public final void K0(boolean z11) {
        boolean z12 = this.f26185h;
        this.f26185h = z11;
        qb.c.b(f26177k, "refreshing [" + z12 + j2.O + z11 + "]", new Object[0]);
        if (!z12 && z11) {
            this.f26184g = n40.l.a(1, 1);
            return;
        }
        if (!z12 || z11) {
            this.f26184g = null;
            return;
        }
        n40.h hVar = this.f26184g;
        if (hVar != null) {
            hVar.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(boolean r7, @m80.k j00.c<? super kotlin.Result<ij.x>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$v r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v) r0
            int r1 = r0.f26480d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26480d = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$v r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$v
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26478b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26480d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.m6317unboximpl()
            return r7
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.e.n(r8)
            c40.m0 r8 = r6.f26183f
            com.baicizhan.main.word_book.data.impl.f r2 = new com.baicizhan.main.word_book.data.impl.f
            r2.<init>()
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$w r4 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$w
            r5 = 0
            r4.<init>(r7, r6, r5)
            r0.f26477a = r7
            r0.f26480d = r3
            java.lang.Object r7 = com.baicizhan.main.word_book.data.impl.c.c(r8, r2, r4, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.L(boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
    
        if (r8.l0(r10, r4) == r5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x005e, code lost:
    
        if (r3 == r5) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151 A[EDGE_INSN: B:79:0x0151->B:80:0x0151 BREAK  A[LOOP:0: B:22:0x0083->B:74:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @m80.l
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(long r31, @m80.k j00.c<? super yz.g2> r33) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.L0(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0097, code lost:
    
        if (r1 == r3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x01e4 -> B:22:0x01e6). Please report as a decompilation issue!!! */
    @m80.l
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(@m80.k ij.x r23, @m80.k j00.c<? super java.util.List<kj.a>> r24) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.M0(ij.x, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (r10 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(long r8, @m80.k j00.c<? super java.util.List<ij.z>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.i1
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i1 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.i1) r0
            int r1 = r0.f26347e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26347e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f26345c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f26347e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r6.f26344b
            java.util.List r8 = (java.util.List) r8
            kotlin.e.n(r10)
            return r8
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            long r8 = r6.f26343a
            kotlin.e.n(r10)
            goto L50
        L40:
            kotlin.e.n(r10)
            ij.w r10 = r7.f26182e
            r6.f26343a = r8
            r6.f26347e = r3
            java.lang.Object r10 = r10.a(r8, r6)
            if (r10 != r0) goto L50
            goto L63
        L50:
            r4 = r10
            java.util.List r4 = (java.util.List) r4
            ij.v r1 = r7.f26181d
            r6.f26344b = r4
            r6.f26343a = r8
            r6.f26347e = r2
            r5 = 1
            r2 = r8
            java.lang.Object r8 = r1.e0(r2, r4, r5, r6)
            if (r8 != r0) goto L64
        L63:
            return r0
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.N0(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P(@m80.k j00.c<? super kotlin.Result<yz.g2>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.o0
            if (r0 == 0) goto L14
            r0 = r8
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$o0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.o0) r0
            int r1 = r0.f26427c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26427c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$o0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$o0
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f26425a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26427c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$p0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$p0
            r8 = 0
            r3.<init>(r8)
            r4.f26427c = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.P(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Q(@m80.k java.lang.String r8, @m80.k j00.c<? super kotlin.Result<kj.a>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.g
            if (r0 == 0) goto L14
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$g r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.g) r0
            int r1 = r0.f26310d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26310d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$g r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$g
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f26308b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26310d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r8 = r4.f26307a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.m6317unboximpl()
            return r8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.e.n(r9)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$h r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$h
            r9 = 0
            r3.<init>(r8, r9)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f26307a = r8
            r4.f26310d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.Q(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(long r8, @m80.k j00.c<? super kotlin.Result<java.lang.Boolean>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.u0
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$u0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.u0) r0
            int r1 = r0.f26476d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26476d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$u0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$u0
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26474b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26476d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$v0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$v0
            r10 = 0
            r3.<init>(r8, r10)
            r4.f26473a = r8
            r4.f26476d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.S(long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(@m80.k byte[] r8, @m80.k j00.c<? super kotlin.Result<? extends java.util.List<ij.c0>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.k0
            if (r0 == 0) goto L14
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$k0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.k0) r0
            int r1 = r0.f26368d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26368d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$k0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$k0
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f26366b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26368d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r8 = r4.f26365a
            byte[] r8 = (byte[]) r8
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.m6317unboximpl()
            return r8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.e.n(r9)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$l0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$l0
            r9 = 0
            r3.<init>(r8, r9)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f26365a = r8
            r4.f26368d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.V(byte[], j00.c):java.lang.Object");
    }

    @Override // ij.q
    @m80.k
    public kotlinx.coroutines.flow.i<ij.x> W() {
        final kotlinx.coroutines.flow.i<List<kj.a>> O = this.f26181d.O();
        return new kotlinx.coroutines.flow.i<ij.x>() { // from class: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl\n*L\n1#1,49:1\n50#2:50\n382#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f26188a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ WordBookManagerImpl f26189b;

                @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1$2", f = "WordBookManagerImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, WordBookManagerImpl wordBookManagerImpl) {
                    this.f26188a = jVar;
                    this.f26189b = wordBookManagerImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, j00.c r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1$2$1 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1$2$1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r8 = r0.L$3
                        kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                        java.lang.Object r8 = r0.L$1
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1$2$1 r8 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1.AnonymousClass2.AnonymousClass1) r8
                        kotlin.e.n(r9)
                        goto L7e
                    L31:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L39:
                        kotlin.e.n(r9)
                        kotlinx.coroutines.flow.j r9 = r7.f26188a
                        r2 = r8
                        java.util.List r2 = (java.util.List) r2
                        ij.x r4 = new ij.x
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r5 = r7.f26189b
                        ij.j r5 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r5)
                        int r5 = r5.a()
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl r6 = r7.f26189b
                        ij.j r6 = com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0(r6)
                        int r6 = r6.j()
                        r4.<init>(r5, r2, r6)
                        java.lang.Object r2 = l00.k.a(r8)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r8 = l00.k.a(r8)
                        r0.L$2 = r8
                        java.lang.Object r8 = l00.k.a(r9)
                        r0.L$3 = r8
                        r8 = 0
                        r0.I$0 = r8
                        r0.label = r3
                        java.lang.Object r8 = r9.emit(r4, r0)
                        if (r8 != r1) goto L7e
                        return r1
                    L7e:
                        yz.g2 r8 = yz.g2.f100423a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfBooksInfo$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super x> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    @Override // ij.q
    public boolean Z() {
        return this.f26185h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a0(@m80.k java.lang.String r8, @m80.k j00.c<? super kotlin.Result<? extends java.util.List<ij.c0>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.i0
            if (r0 == 0) goto L14
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.i0) r0
            int r1 = r0.f26342d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26342d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i0
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f26340b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26342d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r8 = r4.f26339a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.m6317unboximpl()
            return r8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.e.n(r9)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$j0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$j0
            r9 = 0
            r3.<init>(r8, r9)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f26339a = r8
            r4.f26342d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.a0(java.lang.String, j00.c):java.lang.Object");
    }

    @Override // ij.q
    @m80.k
    public kotlinx.coroutines.flow.i<List<ij.z>> b(final long j11) {
        final kotlinx.coroutines.flow.i<List<kj.b>> b11 = this.f26181d.b(j11);
        return new kotlinx.coroutines.flow.i<List<? extends ij.z>>() { // from class: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n387#3:51\n1563#4:52\n1634#4,3:53\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl\n*L\n387#1:52\n387#1:53,3\n*E\n"})
            /* renamed from: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f26192a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f26193b;

                @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1$2", f = "WordBookManagerImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar, long j11) {
                    this.f26192a = jVar;
                    this.f26193b = j11;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, j00.c r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1$2$1 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1$2$1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r9 = r0.L$3
                        kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                        java.lang.Object r9 = r0.L$1
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1$2$1 r9 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1.AnonymousClass2.AnonymousClass1) r9
                        kotlin.e.n(r10)
                        goto L8c
                    L31:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L39:
                        kotlin.e.n(r10)
                        kotlinx.coroutines.flow.j r10 = r8.f26192a
                        r2 = r9
                        java.util.List r2 = (java.util.List) r2
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = a00.i0.d0(r2, r5)
                        r4.<init>(r5)
                        java.util.Iterator r2 = r2.iterator()
                    L52:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L68
                        java.lang.Object r5 = r2.next()
                        kj.b r5 = (kj.b) r5
                        long r6 = r8.f26193b
                        ij.z r5 = ij.c.a(r5, r6)
                        r4.add(r5)
                        goto L52
                    L68:
                        java.lang.Object r2 = l00.k.a(r9)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r9 = l00.k.a(r9)
                        r0.L$2 = r9
                        java.lang.Object r9 = l00.k.a(r10)
                        r0.L$3 = r9
                        r9 = 0
                        r0.I$0 = r9
                        r0.label = r3
                        java.lang.Object r9 = r10.emit(r4, r0)
                        if (r9 != r1) goto L8c
                        return r1
                    L8c:
                        yz.g2 r9 = yz.g2.f100423a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super List<? extends z>> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar, j11), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b0(@m80.k java.lang.String r8, @m80.k java.util.List<java.lang.Integer> r9, @m80.k j00.c<? super kotlin.Result<kj.a>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.e
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.e) r0
            int r1 = r0.f26281e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26281e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26279c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26281e
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r8 = r4.f26278b
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = r4.f26277a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$f r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$f
            r10 = 0
            r3.<init>(r8, r9, r10)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f26277a = r8
            java.lang.Object r8 = l00.k.a(r9)
            r4.f26278b = r8
            r4.f26281e = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L64
            return r0
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.b0(java.lang.String, java.util.List, j00.c):java.lang.Object");
    }

    @Override // ij.q
    @m80.k
    public kotlinx.coroutines.flow.i<List<ij.z>> c() {
        final kotlinx.coroutines.flow.i<List<kj.b>> c11 = this.f26181d.c();
        return new kotlinx.coroutines.flow.i<List<? extends ij.z>>() { // from class: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n391#3:51\n1563#4:52\n1634#4,3:53\n*S KotlinDebug\n*F\n+ 1 WordBookManagerImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookManagerImpl\n*L\n391#1:52\n391#1:53,3\n*E\n"})
            /* renamed from: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j f26195a;

                @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2$2", f = "WordBookManagerImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                    this.f26195a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, j00.c r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2$2$1 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2$2$1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r10 = r0.L$3
                        kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.j) r10
                        java.lang.Object r10 = r0.L$1
                        com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2$2$1 r10 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2.AnonymousClass2.AnonymousClass1) r10
                        kotlin.e.n(r11)
                        goto L8d
                    L31:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L39:
                        kotlin.e.n(r11)
                        kotlinx.coroutines.flow.j r11 = r9.f26195a
                        r2 = r10
                        java.util.List r2 = (java.util.List) r2
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r5 = 10
                        int r5 = a00.i0.d0(r2, r5)
                        r4.<init>(r5)
                        java.util.Iterator r2 = r2.iterator()
                    L52:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L69
                        java.lang.Object r5 = r2.next()
                        kj.b r5 = (kj.b) r5
                        r6 = 0
                        r8 = 0
                        ij.z r5 = ij.c.b(r5, r6, r3, r8)
                        r4.add(r5)
                        goto L52
                    L69:
                        java.lang.Object r2 = l00.k.a(r10)
                        r0.L$0 = r2
                        java.lang.Object r2 = l00.k.a(r0)
                        r0.L$1 = r2
                        java.lang.Object r10 = l00.k.a(r10)
                        r0.L$2 = r10
                        java.lang.Object r10 = l00.k.a(r11)
                        r0.L$3 = r10
                        r10 = 0
                        r0.I$0 = r10
                        r0.label = r3
                        java.lang.Object r10 = r11.emit(r4, r0)
                        if (r10 != r1) goto L8d
                        return r1
                    L8d:
                        yz.g2 r10 = yz.g2.f100423a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$flowOfWords$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(kotlinx.coroutines.flow.j<? super List<? extends z>> jVar, j00.c cVar) {
                Object collect = kotlinx.coroutines.flow.i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c0(@m80.k ij.c0 r8, @m80.k java.util.Set<java.lang.Long> r9, @m80.k j00.c<? super kotlin.Result<java.lang.Boolean>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.g1
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$g1 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.g1) r0
            int r1 = r0.f26317e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26317e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$g1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$g1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26315c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26317e
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r8 = r4.f26314b
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r8 = r4.f26313a
            ij.c0 r8 = (ij.c0) r8
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$h1 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$h1
            r10 = 0
            r3.<init>(r8, r9, r10)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f26313a = r8
            java.lang.Object r8 = l00.k.a(r9)
            r4.f26314b = r8
            r4.f26317e = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L64
            return r0
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.c0(ij.c0, java.util.Set, j00.c):java.lang.Object");
    }

    @Override // ij.q
    @m80.k
    public kotlinx.coroutines.flow.i<kj.a> f(long j11) {
        return this.f26181d.f(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h0(@m80.k java.lang.String r8, @m80.k j00.c<? super kotlin.Result<kj.a>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.c
            if (r0 == 0) goto L14
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$c r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.c) r0
            int r1 = r0.f26241d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26241d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$c r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$c
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f26239b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26241d
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r8 = r4.f26238a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.m6317unboximpl()
            return r8
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.e.n(r9)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$d r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$d
            r9 = 0
            r3.<init>(r8, r9)
            java.lang.Object r8 = l00.k.a(r8)
            r4.f26238a = r8
            r4.f26241d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.h0(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(@m80.k java.util.Set<java.lang.Long> r7, @m80.k java.util.List<ij.c0> r8, @m80.k j00.c<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.k
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$k r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.k) r0
            int r1 = r0.f26364e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26364e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$k r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26362c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26364e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f26361b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f26360a
            java.util.Set r7 = (java.util.Set) r7
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.m6317unboximpl()
            return r7
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.e.n(r9)
            c40.m0 r9 = r6.f26183f
            com.baicizhan.main.word_book.data.impl.e r2 = new com.baicizhan.main.word_book.data.impl.e
            r2.<init>()
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$l r4 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$l
            r5 = 0
            r4.<init>(r7, r8, r5)
            java.lang.Object r7 = l00.k.a(r7)
            r0.f26360a = r7
            java.lang.Object r7 = l00.k.a(r8)
            r0.f26361b = r7
            r0.f26364e = r3
            java.lang.Object r7 = com.baicizhan.main.word_book.data.impl.c.c(r9, r2, r4, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.i(java.util.Set, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j0(long r8, @m80.k j00.c<? super kotlin.Result<kj.a>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.p
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$p r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.p) r0
            int r1 = r0.f26431d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26431d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$p r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$p
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26429b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26431d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$q r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$q
            r10 = 0
            r3.<init>(r8, r10)
            r4.f26428a = r8
            r4.f26431d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.j0(long, j00.c):java.lang.Object");
    }

    @Override // ij.q
    @m80.l
    public Object k(@m80.k j00.c<? super Boolean> cVar) {
        return c40.i.h(this.f26183f, new g0(null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k0(long r12, boolean r14, @m80.k j00.c<? super kotlin.Result<? extends java.util.List<ij.z>>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.d0
            if (r0 == 0) goto L14
            r0 = r15
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$d0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.d0) r0
            int r1 = r0.f26263e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26263e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$d0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$d0
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.f26261c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26263e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.m6317unboximpl()
            return r12
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.e.n(r15)
            c40.m0 r1 = r11.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$e0
            r10 = 0
            r6 = r11
            r7 = r12
            r9 = r14
            r5 = r3
            r5.<init>(r7, r9, r10)
            r4.f26259a = r7
            r4.f26260b = r9
            r4.f26263e = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r12 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L58
            return r0
        L58:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.k0(long, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(@m80.k j00.c<? super kotlin.Result<ij.b>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.m
            if (r0 == 0) goto L14
            r0 = r8
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$m r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.m) r0
            int r1 = r0.f26407c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26407c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$m r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$m
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f26405a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26407c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$n r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$n
            r8 = 0
            r3.<init>(r8)
            r4.f26407c = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.m(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m0(long r11, @m80.k java.util.List<ij.c0> r13, @m80.k j00.c<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.i
            if (r0 == 0) goto L13
            r0 = r14
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.i) r0
            int r1 = r0.f26338e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26338e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26336c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26338e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.f26335b
            java.util.List r11 = (java.util.List) r11
            kotlin.e.n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.m6317unboximpl()
            return r11
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.e.n(r14)
            c40.m0 r14 = r10.f26183f
            com.baicizhan.main.word_book.data.impl.g r2 = new com.baicizhan.main.word_book.data.impl.g
            r2.<init>()
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$j r4 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$j
            r9 = 0
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r6, r8, r9)
            java.lang.Object r11 = l00.k.a(r8)
            r0.f26335b = r11
            r0.f26334a = r6
            r0.f26338e = r3
            java.lang.Object r11 = com.baicizhan.main.word_book.data.impl.c.c(r14, r2, r4, r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.m0(long, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n0(@m80.k j00.c<? super kotlin.Result<ij.a>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x
            if (r0 == 0) goto L14
            r0 = r8
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$x r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.x) r0
            int r1 = r0.f26516c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26516c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$x r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$x
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f26514a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26516c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$y r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$y
            r8 = 0
            r3.<init>(r8)
            r4.f26516c = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.n0(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(long r12, @m80.k java.lang.String r14, @m80.k j00.c<? super kotlin.Result<kj.a>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.b1
            if (r0 == 0) goto L14
            r0 = r15
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$b1 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.b1) r0
            int r1 = r0.f26237e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26237e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$b1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$b1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.f26235c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26237e
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r12 = r4.f26234b
            java.lang.String r12 = (java.lang.String) r12
            kotlin.e.n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.m6317unboximpl()
            return r12
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            kotlin.e.n(r15)
            c40.m0 r1 = r11.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$c1 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$c1
            r10 = 0
            r6 = r11
            r7 = r12
            r9 = r14
            r5 = r3
            r5.<init>(r7, r9, r10)
            java.lang.Object r12 = l00.k.a(r9)
            r4.f26234b = r12
            r4.f26233a = r7
            r4.f26237e = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r12 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L60
            return r0
        L60:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.p(long, java.lang.String, j00.c):java.lang.Object");
    }

    @Override // ij.m
    public void q(@m80.k ij.h topics) {
        kotlin.jvm.internal.g0.p(topics, "topics");
        this.f26181d.q(topics);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(long r8, @m80.k j00.c<? super kotlin.Result<? extends java.util.Set<java.lang.Long>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.r
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$r r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.r) r0
            int r1 = r0.f26443d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26443d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$r r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$r
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26441b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26443d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$s r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$s
            r10 = 0
            r3.<init>(r8, r10)
            r4.f26440a = r8
            r4.f26443d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.r(long, j00.c):java.lang.Object");
    }

    @Override // ij.m
    public void reset() {
        this.f26181d.reset();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(long r8, @m80.k j00.c<? super kotlin.Result<ij.z>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.b0
            if (r0 == 0) goto L14
            r0 = r10
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$b0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.b0) r0
            int r1 = r0.f26232d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26232d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$b0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$b0
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f26230b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26232d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r8 = r10.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r10)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$c0 r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$c0
            r10 = 0
            r3.<init>(r8, r10)
            r4.f26229a = r8
            r4.f26232d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.t(long, j00.c):java.lang.Object");
    }

    @Override // ij.g
    @m80.l
    public Object u(@m80.k j00.c<? super g2> cVar) {
        Object g11 = com.baicizhan.main.word_book.data.impl.c.g(this.f26183f, null, new f0(null), cVar, 2, null);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(int r8, @m80.k j00.c<? super kotlin.Result<? extends java.util.Set<java.lang.Long>>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.t
            if (r0 == 0) goto L14
            r0 = r9
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$t r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.t) r0
            int r1 = r0.f26464d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26464d = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$t r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$t
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f26462b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f26464d
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.e.n(r9)
            c40.m0 r1 = r7.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$u r3 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$u
            r9 = 0
            r3.<init>(r8, r9)
            r4.f26461a = r8
            r4.f26464d = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.v(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(long r12, @m80.k java.lang.String r14, @m80.k java.util.List<java.lang.Integer> r15, @m80.k j00.c<? super kotlin.Result<kj.a>> r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r2 = r0 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.z0
            if (r2 == 0) goto L16
            r2 = r0
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$z0 r2 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.z0) r2
            int r3 = r2.f26551f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f26551f = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$z0 r2 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$z0
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f26549d
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r7.f26551f
            r8 = 1
            if (r2 == 0) goto L43
            if (r2 != r8) goto L3b
            java.lang.Object r2 = r7.f26548c
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r7.f26547b
            java.lang.String r2 = (java.lang.String) r2
            kotlin.e.n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.m6317unboximpl()
            return r0
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L43:
            kotlin.e.n(r0)
            c40.m0 r10 = r11.f26183f
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$a1 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$a1
            r6 = 0
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r0.<init>(r2, r4, r5, r6)
            java.lang.Object r1 = l00.k.a(r14)
            r7.f26547b = r1
            java.lang.Object r1 = l00.k.a(r15)
            r7.f26548c = r1
            r7.f26546a = r12
            r7.f26551f = r8
            r4 = 0
            r6 = r7
            r7 = 2
            r8 = 0
            r5 = r0
            r3 = r10
            java.lang.Object r0 = com.baicizhan.main.word_book.data.impl.c.d(r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L6f
            return r9
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.y(long, java.lang.String, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ij.q
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(long r11, @m80.k java.util.List<java.lang.Long> r13, @m80.k j00.c<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0
            if (r0 == 0) goto L13
            r0 = r14
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$w0 r0 = (com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.w0) r0
            int r1 = r0.f26513e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26513e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$w0 r0 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$w0
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26511c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26513e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.f26510b
            java.util.List r11 = (java.util.List) r11
            kotlin.e.n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.m6317unboximpl()
            return r11
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.e.n(r14)
            c40.m0 r14 = r10.f26183f
            com.baicizhan.main.word_book.data.impl.h r2 = new com.baicizhan.main.word_book.data.impl.h
            r2.<init>()
            com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$x0 r4 = new com.baicizhan.main.word_book.data.impl.WordBookManagerImpl$x0
            r9 = 0
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r6, r8, r9)
            java.lang.Object r11 = l00.k.a(r8)
            r0.f26510b = r11
            r0.f26509a = r6
            r0.f26513e = r3
            java.lang.Object r11 = com.baicizhan.main.word_book.data.impl.c.c(r14, r2, r4, r0)
            if (r11 != r1) goto L5f
            return r1
        L5f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.WordBookManagerImpl.z(long, java.util.List, j00.c):java.lang.Object");
    }

    public /* synthetic */ WordBookManagerImpl(WordBookDatabase wordBookDatabase, ij.j jVar, oj.b bVar, ij.v vVar, ij.w wVar, c40.m0 m0Var, int i11, kotlin.jvm.internal.v vVar2) {
        this(wordBookDatabase, jVar, bVar, (i11 & 8) != 0 ? new com.baicizhan.main.word_book.data.impl.m(wordBookDatabase) : vVar, (i11 & 16) != 0 ? new com.baicizhan.main.word_book.data.impl.o() : wVar, (i11 & 32) != 0 ? c40.h1.c() : m0Var);
    }
}
