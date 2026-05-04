package com.baicizhan.main.word_book.data.impl;

import a00.a0;
import a00.i0;
import a00.l1;
import a00.r0;
import a00.w1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.RoomDatabaseKt;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
import com.baicizhan.main.word_book.data.db.WordBookDatabase;
import com.jiongji.andriod.card.R;
import com.squareup.picasso.h0;
import ij.v;
import ij.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordBookRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookRepositoryImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,301:1\n1#2:302\n1#2:371\n1#2:409\n1869#3,2:303\n1563#3:317\n1634#3,3:318\n774#3:321\n865#3,2:322\n1563#3:326\n1634#3,3:327\n774#3:330\n865#3,2:331\n1563#3:333\n1634#3,3:334\n1563#3:339\n1634#3,3:340\n774#3:345\n865#3,2:346\n1563#3:348\n1634#3,3:349\n1563#3:352\n1634#3,3:353\n1869#3:356\n1563#3:357\n1634#3,3:358\n1617#3,9:361\n1869#3:370\n1870#3:372\n1626#3:373\n1870#3:376\n1563#3:377\n1634#3,3:378\n774#3:383\n865#3,2:384\n1563#3:386\n1634#3,3:387\n1563#3:390\n1634#3,3:391\n1869#3:394\n1563#3:395\n1634#3,3:396\n1617#3,9:399\n1869#3:408\n1870#3:410\n1626#3:411\n1870#3:414\n1563#3:415\n1634#3,3:416\n1869#3,2:419\n1869#3:421\n1563#3:422\n1634#3,3:423\n1869#3,2:426\n1870#3:428\n1869#3:429\n1563#3:430\n1634#3,3:431\n774#3:434\n865#3,2:435\n1563#3:437\n1634#3,3:438\n1870#3:441\n774#3:442\n865#3,2:443\n1563#3:445\n1634#3,3:446\n11601#4:305\n11936#4,3:306\n11601#4:311\n11936#4,3:312\n37#5,2:309\n37#5,2:315\n37#5,2:324\n37#5,2:337\n37#5,2:343\n37#5,2:374\n37#5,2:381\n37#5,2:412\n37#5,2:449\n*S KotlinDebug\n*F\n+ 1 WordBookRepositoryImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookRepositoryImpl\n*L\n116#1:371\n148#1:409\n44#1:303,2\n97#1:317\n97#1:318,3\n98#1:321\n98#1:322,2\n100#1:326\n100#1:327,3\n101#1:330\n101#1:331,2\n101#1:333\n101#1:334,3\n104#1:339\n104#1:340,3\n106#1:345\n106#1:346,2\n107#1:348\n107#1:349,3\n109#1:352\n109#1:353,3\n114#1:356\n116#1:357\n116#1:358,3\n116#1:361,9\n116#1:370\n116#1:372\n116#1:373\n114#1:376\n136#1:377\n136#1:378,3\n138#1:383\n138#1:384,2\n139#1:386\n139#1:387,3\n141#1:390\n141#1:391,3\n146#1:394\n148#1:395\n148#1:396,3\n148#1:399,9\n148#1:408\n148#1:410\n148#1:411\n146#1:414\n173#1:415\n173#1:416,3\n178#1:419,2\n227#1:421\n228#1:422\n228#1:423,3\n228#1:426,2\n227#1:428\n265#1:429\n268#1:430\n268#1:431,3\n269#1:434\n269#1:435,2\n270#1:437\n270#1:438,3\n265#1:441\n273#1:442\n273#1:443,2\n273#1:445\n273#1:446,3\n78#1:305\n78#1:306,3\n79#1:311\n79#1:312,3\n78#1:309,2\n79#1:315,2\n99#1:324,2\n101#1:337,2\n104#1:343,2\n129#1:374,2\n136#1:381,2\n161#1:412,2\n275#1:449,2\n*E\n"})
/* loaded from: classes5.dex */
public final class m implements v {

    /* renamed from: i, reason: collision with root package name */
    public static final int f26578i = 200;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WordBookDatabase f26580a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f26581b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f26582c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final byte[] f26583d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public Set<Integer> f26584e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<ij.h> f26585f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final a f26576g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f26577h = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f26579j = m.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 0}, l = {206}, m = "addFavorite", n = {"word", "books"}, s = {"L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26586a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26587b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f26588c;

        /* renamed from: e, reason: collision with root package name */
        public int f26590e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26588c = obj;
            this.f26590e |= Integer.MIN_VALUE;
            return m.this.J(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {96, 99, 101, 104, 116, 129}, m = "addWords", n = {xd.a.f98002r, "bookId", "replace", xd.a.f98002r, TtmlNode.COMBINE_ALL, "addingIds", "removedCompletely", "bookId", "replace", xd.a.f98002r, TtmlNode.COMBINE_ALL, "addingIds", "removedCompletely", "bookId", "replace", xd.a.f98002r, "bookId", "replace", xd.a.f98002r, "result", "added", "$this$addWords_u24lambda_u2411", "$this$forEach$iv", "element$iv", "sub", "bookId", "replace", "$i$a$-with-WordBookRepositoryImpl$addWords$6", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$addWords$6$2", xd.a.f98002r, "result", "added", "$this$addWords_u24lambda_u2411", "$this$forEach$iv", "element$iv", "sub", WordErrorFeedbackActivity.f18460k, "bookId", "replace", "$i$a$-with-WordBookRepositoryImpl$addWords$6", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$addWords$6$2"}, s = {"L$0", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "J$0", "Z$0", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "J$0", "Z$0", "I$0", "I$1", "I$2"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26591a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26592b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26593c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26594d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26595e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26596f;

        /* renamed from: g, reason: collision with root package name */
        public Object f26597g;

        /* renamed from: h, reason: collision with root package name */
        public Object f26598h;

        /* renamed from: i, reason: collision with root package name */
        public Object f26599i;

        /* renamed from: j, reason: collision with root package name */
        public Object f26600j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f26601k;

        /* renamed from: l, reason: collision with root package name */
        public int f26602l;

        /* renamed from: m, reason: collision with root package name */
        public int f26603m;

        /* renamed from: n, reason: collision with root package name */
        public int f26604n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f26605o;

        /* renamed from: q, reason: collision with root package name */
        public int f26607q;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26605o = obj;
            this.f26607q |= Integer.MIN_VALUE;
            return m.this.e0(0L, null, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {136, 148, 161}, m = "addWords", n = {"bookIds", xd.a.f98002r, "bookIds", xd.a.f98002r, "result", "added", "$this$addWords_u24lambda_u2418", "$this$forEach$iv", "element$iv", "sub", "$i$a$-with-WordBookRepositoryImpl$addWords$9", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$addWords$9$2", "bookIds", xd.a.f98002r, "result", "added", "$this$addWords_u24lambda_u2418", "$this$forEach$iv", "element$iv", "sub", WordErrorFeedbackActivity.f18460k, "$i$a$-with-WordBookRepositoryImpl$addWords$9", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$addWords$9$2"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26608a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26609b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26610c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26611d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26612e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26613f;

        /* renamed from: g, reason: collision with root package name */
        public Object f26614g;

        /* renamed from: h, reason: collision with root package name */
        public Object f26615h;

        /* renamed from: i, reason: collision with root package name */
        public Object f26616i;

        /* renamed from: j, reason: collision with root package name */
        public Object f26617j;

        /* renamed from: k, reason: collision with root package name */
        public int f26618k;

        /* renamed from: l, reason: collision with root package name */
        public int f26619l;

        /* renamed from: m, reason: collision with root package name */
        public int f26620m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f26621n;

        /* renamed from: p, reason: collision with root package name */
        public int f26623p;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26621n = obj;
            this.f26623p |= Integer.MIN_VALUE;
            return m.this.e(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {}, l = {41}, m = "initialize", n = {}, s = {}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f26624a;

        /* renamed from: c, reason: collision with root package name */
        public int f26626c;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26624a = obj;
            this.f26626c |= Integer.MIN_VALUE;
            return m.this.u(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 1, 2}, l = {284, 285, 285}, m = "removeBook", n = {"bookId", "bookId", "bookId"}, s = {"J$0", "J$0", "J$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26627a;

        /* renamed from: b, reason: collision with root package name */
        public long f26628b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26629c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f26630d;

        /* renamed from: f, reason: collision with root package name */
        public int f26632f;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26630d = obj;
            this.f26632f |= Integer.MIN_VALUE;
            return m.this.h(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0}, l = {279}, m = "removeWord", n = {"universalId"}, s = {"J$0"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26633a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26634b;

        /* renamed from: d, reason: collision with root package name */
        public int f26636d;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26634b = obj;
            this.f26636d |= Integer.MIN_VALUE;
            return m.this.j(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3}, l = {267, 268, e3.a.A, e3.a.A}, m = "removeWords", n = {"universalIds", "$this$forEach$iv", "element$iv", "subs", "bookId", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$removeWords$2", "universalIds", "$this$forEach$iv", "element$iv", "subs", "bookId", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$removeWords$2", "universalIds", "bookId", "universalIds", "bookId"}, s = {"L$0", "L$1", "L$3", "L$4", "J$0", "I$0", "I$1", "L$0", "L$1", "L$3", "L$4", "J$0", "I$0", "I$1", "L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26637a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26638b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26639c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26640d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26641e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26642f;

        /* renamed from: g, reason: collision with root package name */
        public int f26643g;

        /* renamed from: h, reason: collision with root package name */
        public int f26644h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f26645i;

        /* renamed from: k, reason: collision with root package name */
        public int f26647k;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26645i = obj;
            this.f26647k |= Integer.MIN_VALUE;
            return m.this.g(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 0, 0}, l = {259}, m = "updateBookWordCount", n = {"bookId", h0.f41872n, "updatedAt"}, s = {"J$0", "I$0", "J$1"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26648a;

        /* renamed from: b, reason: collision with root package name */
        public long f26649b;

        /* renamed from: c, reason: collision with root package name */
        public int f26650c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f26651d;

        /* renamed from: f, reason: collision with root package name */
        public int f26653f;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26651d = obj;
            this.f26653f |= Integer.MIN_VALUE;
            return m.this.n(0L, 0, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {R.styleable.Theme_drawable_syncview_error, R.styleable.Theme_drawable_syncview_update}, m = "updateFavoriteBasics", n = {WordErrorFeedbackActivity.f18460k, "$this$forEach$iv", "element$iv", "subs", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$updateFavoriteBasics$2", WordErrorFeedbackActivity.f18460k, "$this$forEach$iv", "element$iv", "subs", "element$iv", "it", "$this$forEach$iv", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$updateFavoriteBasics$2", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$updateFavoriteBasics$2$2"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$3", "L$4", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f26654a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26655b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26656c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26657d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26658e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26659f;

        /* renamed from: g, reason: collision with root package name */
        public Object f26660g;

        /* renamed from: h, reason: collision with root package name */
        public Object f26661h;

        /* renamed from: i, reason: collision with root package name */
        public Object f26662i;

        /* renamed from: j, reason: collision with root package name */
        public int f26663j;

        /* renamed from: k, reason: collision with root package name */
        public int f26664k;

        /* renamed from: l, reason: collision with root package name */
        public int f26665l;

        /* renamed from: m, reason: collision with root package name */
        public int f26666m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f26667n;

        /* renamed from: p, reason: collision with root package name */
        public int f26669p;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26667n = obj;
            this.f26669p |= Integer.MIN_VALUE;
            return m.this.U(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl", f = "WordBookRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {R.styleable.Theme_drawable_test_nodate, R.styleable.Theme_drawable_time}, m = "updateFavoriteScore", n = {"universalId", "bookId", a.b.C0242a.f16107c, "item", "universalId", "bookId", a.b.C0242a.f16107c}, s = {"J$0", "J$1", "I$0", "L$0", "J$0", "J$1", "I$0"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f26670a;

        /* renamed from: b, reason: collision with root package name */
        public long f26671b;

        /* renamed from: c, reason: collision with root package name */
        public int f26672c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26673d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f26674e;

        /* renamed from: g, reason: collision with root package name */
        public int f26676g;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f26674e = obj;
            this.f26676g |= Integer.MIN_VALUE;
            return m.this.G(0L, 0L, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.data.impl.WordBookRepositoryImpl$updateWords$4", f = "WordBookRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {188, 188, 189, 195, 198}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "$i$f$forEach", "it", "$i$a$-forEach-WordBookRepositoryImpl$updateWords$4$1", "$this$forEach$iv", "element$iv", "$i$f$forEach", "it", "$i$a$-forEach-WordBookRepositoryImpl$updateWords$4$1", "it", "$this$invokeSuspend_u24lambda_u242_u241", "$this$forEach$iv", "element$iv", "sub", "$i$a$-let-WordBookRepositoryImpl$updateWords$4$3", "$i$a$-with-WordBookRepositoryImpl$updateWords$4$3$2", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$updateWords$4$3$2$2", "it", "$this$invokeSuspend_u24lambda_u242_u241", "$this$forEach$iv", "element$iv", "sub", "subs", "$i$a$-let-WordBookRepositoryImpl$updateWords$4$3", "$i$a$-with-WordBookRepositoryImpl$updateWords$4$3$2", "$i$f$forEach", "$i$a$-forEach-WordBookRepositoryImpl$updateWords$4$3$2$2"}, s = {"L$0", "L$3", "I$0", "J$0", "I$1", "L$0", "L$3", "I$0", "J$0", "I$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3"}, v = 1)
    @u0({"SMAP\nWordBookRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookRepositoryImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookRepositoryImpl$updateWords$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1869#2,2:302\n774#2:306\n865#2,2:307\n1563#2:309\n1634#2,3:310\n1869#2:313\n1617#2,9:314\n1869#2:323\n1870#2:325\n1626#2:326\n1870#2:329\n37#3,2:304\n37#3,2:327\n1#4:324\n*S KotlinDebug\n*F\n+ 1 WordBookRepositoryImpl.kt\ncom/baicizhan/main/word_book/data/impl/WordBookRepositoryImpl$updateWords$4\n*L\n188#1:302,2\n189#1:306\n189#1:307,2\n190#1:309\n190#1:310,3\n194#1:313\n195#1:314,9\n195#1:323\n195#1:325\n195#1:326\n194#1:329\n189#1:304,2\n198#1:327,2\n195#1:324\n*E\n"})
    public static final class l extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26677a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26678b;

        /* renamed from: c, reason: collision with root package name */
        public Object f26679c;

        /* renamed from: d, reason: collision with root package name */
        public Object f26680d;

        /* renamed from: e, reason: collision with root package name */
        public Object f26681e;

        /* renamed from: f, reason: collision with root package name */
        public Object f26682f;

        /* renamed from: g, reason: collision with root package name */
        public Object f26683g;

        /* renamed from: h, reason: collision with root package name */
        public Object f26684h;

        /* renamed from: i, reason: collision with root package name */
        public Object f26685i;

        /* renamed from: j, reason: collision with root package name */
        public int f26686j;

        /* renamed from: k, reason: collision with root package name */
        public int f26687k;

        /* renamed from: l, reason: collision with root package name */
        public int f26688l;

        /* renamed from: m, reason: collision with root package name */
        public int f26689m;

        /* renamed from: n, reason: collision with root package name */
        public long f26690n;

        /* renamed from: o, reason: collision with root package name */
        public long f26691o;

        /* renamed from: p, reason: collision with root package name */
        public int f26692p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Map<Long, List<z>> f26693q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f26694r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Map<Long, kj.b> f26695s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Map<Long, ? extends List<z>> map, m mVar, Map<Long, kj.b> map2, j00.c<? super l> cVar) {
            super(1, cVar);
            this.f26693q = map;
            this.f26694r = mVar;
            this.f26695s = map2;
        }

        public static final boolean j(List list, long j11) {
            return list.contains(Long.valueOf(j11));
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new l(this.f26693q, this.f26694r, this.f26695s, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((l) create(cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
        
            if (r2 == r1) goto L60;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x02a4  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0346  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0355  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
        /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r12v22, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0346 -> B:9:0x034e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x015b -> B:48:0x015f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 856
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public m(@m80.k WordBookDatabase db2) {
        g0.p(db2, "db");
        this.f26580a = db2;
        this.f26581b = e0.c(new x00.a() { // from class: com.baicizhan.main.word_book.data.impl.i
            @Override // x00.a
            public final Object invoke() {
                jj.a C0;
                C0 = m.C0(m.this);
                return C0;
            }
        });
        this.f26582c = e0.c(new x00.a() { // from class: com.baicizhan.main.word_book.data.impl.j
            @Override // x00.a
            public final Object invoke() {
                jj.k D0;
                D0 = m.D0(m.this);
                return D0;
            }
        });
        this.f26583d = new byte[0];
        this.f26585f = new ArrayList();
    }

    public static final jj.a C0(m mVar) {
        return mVar.f26580a.g();
    }

    public static final jj.k D0(m mVar) {
        return mVar.f26580a.h();
    }

    public static final boolean w0(Set set, z it) {
        g0.p(it, "it");
        return set.contains(Long.valueOf(it.y()));
    }

    public static final boolean x0(Set set, z it) {
        g0.p(it, "it");
        return set.contains(Long.valueOf(it.y()));
    }

    public final jj.k A0() {
        return (jj.k) this.f26582c.getValue();
    }

    public final Boolean B0(Set<Integer> set) {
        Boolean bool;
        synchronized (this.f26583d) {
            Set<Integer> set2 = this.f26584e;
            if (set2 != null) {
                bool = Boolean.valueOf(set2.removeAll(set));
                qb.c.b(f26579j, "remove topics: size = " + set.size(), new Object[0]);
            } else {
                bool = null;
            }
        }
        return bool;
    }

    @Override // ij.m
    @m80.k
    public Set<Integer> C() {
        Set<Integer> set;
        synchronized (this.f26583d) {
            set = this.f26584e;
            if (set == null) {
                set = w1.k();
            }
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r2.b(r4, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(long r6, long r8, int r10, @m80.k j00.c<? super yz.g2> r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof com.baicizhan.main.word_book.data.impl.m.k
            if (r0 == 0) goto L13
            r0 = r11
            com.baicizhan.main.word_book.data.impl.m$k r0 = (com.baicizhan.main.word_book.data.impl.m.k) r0
            int r1 = r0.f26676g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26676g = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.m$k r0 = new com.baicizhan.main.word_book.data.impl.m$k
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f26674e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26676g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f26673d
            kj.b r6 = (kj.b) r6
            kotlin.e.n(r11)
            goto L7f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            int r10 = r0.f26672c
            long r8 = r0.f26671b
            long r6 = r0.f26670a
            kotlin.e.n(r11)
            goto L58
        L42:
            kotlin.e.n(r11)
            jj.k r11 = r5.A0()
            r0.f26670a = r6
            r0.f26671b = r8
            r0.f26672c = r10
            r0.f26676g = r4
            java.lang.Object r11 = r11.e(r6, r0)
            if (r11 != r1) goto L58
            goto L7e
        L58:
            kj.b r11 = (kj.b) r11
            if (r11 == 0) goto L82
            jj.k r2 = r5.A0()
            jj.k$a r4 = jj.k.f64248a
            kj.b r4 = r4.i(r11, r8, r10)
            kj.b[] r4 = new kj.b[]{r4}
            java.lang.Object r11 = l00.k.a(r11)
            r0.f26673d = r11
            r0.f26670a = r6
            r0.f26671b = r8
            r0.f26672c = r10
            r0.f26676g = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L7f
        L7e:
            return r1
        L7f:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L82:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Not found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.G(long, long, int, j00.c):java.lang.Object");
    }

    @Override // ij.v
    @m80.l
    public Object H(@m80.k j00.c<? super List<Integer>> cVar) {
        return A0().h(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(@m80.k ij.z r5, @m80.k java.util.Set<java.lang.Long> r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.baicizhan.main.word_book.data.impl.m.b
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.main.word_book.data.impl.m$b r0 = (com.baicizhan.main.word_book.data.impl.m.b) r0
            int r1 = r0.f26590e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26590e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.m$b r0 = new com.baicizhan.main.word_book.data.impl.m$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26588c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26590e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.f26587b
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r5 = r0.f26586a
            ij.z r5 = (ij.z) r5
            kotlin.e.n(r7)
            goto L56
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            kotlin.e.n(r7)
            jj.k r7 = r4.A0()
            kj.b r2 = ij.c.c(r5, r6)
            kj.b[] r2 = new kj.b[]{r2}
            r0.f26586a = r5
            r0.f26587b = r6
            r0.f26590e = r3
            java.lang.Object r7 = r7.f(r2, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            byte[] r7 = r4.f26583d
            monitor-enter(r7)
            java.util.Set<java.lang.Integer> r0 = r4.f26584e     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L63
            yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L61
            monitor-exit(r7)
            return r5
        L61:
            r5 = move-exception
            goto Lcf
        L63:
            int r1 = r5.x()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r1 = l00.a.f(r1)     // Catch: java.lang.Throwable -> L61
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L83
            boolean r1 = r6.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L83
            int r5 = r5.x()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r5 = l00.a.f(r5)     // Catch: java.lang.Throwable -> L61
            r0.remove(r5)     // Catch: java.lang.Throwable -> L61
            goto Lcb
        L83:
            int r1 = r5.x()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r1 = l00.a.f(r1)     // Catch: java.lang.Throwable -> L61
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L61
            if (r1 != 0) goto La7
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L61
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r6 != 0) goto La7
            int r6 = r5.x()     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r6 = l00.a.f(r6)     // Catch: java.lang.Throwable -> L61
            r0.add(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = "add"
            goto La9
        La7:
            java.lang.String r6 = "non-op"
        La9:
            java.lang.String r0 = com.baicizhan.main.word_book.data.impl.m.f26579j     // Catch: java.lang.Throwable -> L61
            int r5 = r5.x()     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            r1.append(r6)     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = " fav "
            r1.append(r6)     // Catch: java.lang.Throwable -> L61
            r1.append(r5)     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L61
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L61
            qb.c.b(r0, r5, r6)     // Catch: java.lang.Throwable -> L61
            yz.g2 r5 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L61
        Lcb:
            monitor-exit(r7)
            yz.g2 r5 = yz.g2.f100423a
            return r5
        Lcf:
            monitor-exit(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.J(ij.z, java.util.Set, j00.c):java.lang.Object");
    }

    @Override // ij.v
    @m80.l
    public Object N(long j11, @m80.k j00.c<? super kj.a> cVar) {
        return z0().d(j11, cVar);
    }

    @Override // ij.u
    @m80.k
    public kotlinx.coroutines.flow.i<List<kj.a>> O() {
        return z0().c();
    }

    @Override // ij.v
    @m80.l
    public Object R(@m80.k kj.a aVar, @m80.k j00.c<? super g2> cVar) {
        Object f11 = z0().f(aVar, cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }

    @Override // ij.v
    @m80.l
    public Object T(long j11, @m80.k j00.c<? super kj.b> cVar) {
        return A0().e(j11, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x01bf -> B:11:0x01c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x01cc -> B:12:0x01d0). Please report as a decompilation issue!!! */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U(@m80.k kj.c[] r31, @m80.k j00.c<? super yz.g2> r32) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.U(kj.c[], j00.c):java.lang.Object");
    }

    @Override // ij.v
    @m80.l
    public Object a(long j11, @m80.k j00.c<? super List<kj.b>> cVar) {
        return A0().g(j11, cVar);
    }

    @Override // ij.u
    @m80.k
    public kotlinx.coroutines.flow.i<List<kj.b>> b(long j11) {
        return A0().k(j11);
    }

    @Override // ij.u
    @m80.k
    public kotlinx.coroutines.flow.i<List<kj.b>> c() {
        return A0().o();
    }

    @Override // ij.v
    @m80.l
    public Object d(@m80.k j00.c<? super List<kj.a>> cVar) {
        return z0().b(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0145, code lost:
    
        if (r3 == r5) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4 A[LOOP:4: B:72:0x01be->B:74:0x01c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f8 A[LOOP:5: B:77:0x01f2->B:79:0x01f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x03d8 -> B:12:0x03e0). Please report as a decompilation issue!!! */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k java.util.Set<java.lang.Long> r30, @m80.k java.util.List<ij.z> r31, @m80.k j00.c<? super yz.g2> r32) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.e(java.util.Set, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0291, code lost:
    
        if (r4.b(r8, r5) != r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0134, code lost:
    
        if (r4 == r6) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252 A[LOOP:9: B:107:0x024c->B:109:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0377 A[LOOP:4: B:69:0x0371->B:71:0x0377, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ab A[LOOP:5: B:74:0x03a5->B:76:0x03ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ba A[LOOP:6: B:82:0x02b4->B:84:0x02ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb A[LOOP:7: B:91:0x01e5->B:93:0x01eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x05b3 -> B:12:0x05c5). Please report as a decompilation issue!!! */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e0(long r31, @m80.k java.util.List<ij.z> r33, boolean r34, @m80.k j00.c<? super yz.g2> r35) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.e0(long, java.util.List, boolean, j00.c):java.lang.Object");
    }

    @Override // ij.u
    @m80.k
    public kotlinx.coroutines.flow.i<kj.a> f(long j11) {
        return z0().e(j11);
    }

    @Override // ij.v
    @m80.l
    public Object f0(@m80.k Map<Long, ? extends List<z>> map, @m80.k j00.c<? super g2> cVar) {
        List a62 = r0.a6(map.entrySet());
        if (a62.isEmpty()) {
            return g2.f100423a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map.Entry entry = (Map.Entry) a62.get(0);
        qb.c.b(f26579j, "to add init: [" + entry.getKey() + j2.O + ((List) entry.getValue()).size() + "]", new Object[0]);
        Iterable<z> iterable = (Iterable) entry.getValue();
        ArrayList arrayList = new ArrayList(i0.d0(iterable, 10));
        for (z zVar : iterable) {
            arrayList.add(h1.a(l00.a.g(zVar.y()), y0(zVar, ((Number) entry.getKey()).longValue())));
        }
        l1.w0(linkedHashMap, arrayList);
        int size = a62.size();
        for (int i11 = 1; i11 < size; i11++) {
            Map.Entry entry2 = (Map.Entry) a62.get(i11);
            qb.c.b(f26579j, "to add [" + entry2.getKey() + j2.O + ((List) entry2.getValue()).size() + "]", new Object[0]);
            for (z zVar2 : (Iterable) entry2.getValue()) {
                kj.b bVar = (kj.b) linkedHashMap.get(l00.a.g(zVar2.y()));
                if (bVar != null) {
                    linkedHashMap.put(l00.a.g(bVar.u()), jj.k.f64248a.j(bVar, ((Number) entry2.getKey()).longValue(), zVar2.s()));
                } else {
                    linkedHashMap.put(l00.a.g(zVar2.y()), y0(zVar2, ((Number) entry2.getKey()).longValue()));
                }
            }
        }
        Object withTransaction = RoomDatabaseKt.withTransaction(this.f26580a, new l(map, this, linkedHashMap, null), cVar);
        return withTransaction == kotlin.coroutines.intrinsics.b.l() ? withTransaction : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x02b1, code lost:
    
        if (r4.b(r1, r2) != r3) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0264 A[LOOP:1: B:31:0x025e->B:33:0x0264, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0186 A[LOOP:2: B:41:0x0180->B:43:0x0186, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8 A[LOOP:4: B:57:0x01d2->B:59:0x01d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x016b -> B:33:0x006b). Please report as a decompilation issue!!! */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r19, @m80.k java.util.List<java.lang.Long> r21, @m80.k j00.c<? super yz.g2> r22) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.g(long, java.util.List, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (r2.g(r8, (java.util.List) r10, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r10.h(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(long r8, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.data.impl.m.f
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.main.word_book.data.impl.m$f r0 = (com.baicizhan.main.word_book.data.impl.m.f) r0
            int r1 = r0.f26632f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26632f = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.m$f r0 = new com.baicizhan.main.word_book.data.impl.m$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f26630d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26632f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e.n(r10)
            goto L80
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            long r8 = r0.f26628b
            long r4 = r0.f26627a
            java.lang.Object r2 = r0.f26629c
            com.baicizhan.main.word_book.data.impl.m r2 = (com.baicizhan.main.word_book.data.impl.m) r2
            kotlin.e.n(r10)
            goto L70
        L43:
            long r8 = r0.f26627a
            kotlin.e.n(r10)
            goto L5b
        L49:
            kotlin.e.n(r10)
            jj.a r10 = r7.z0()
            r0.f26627a = r8
            r0.f26632f = r5
            java.lang.Object r10 = r10.h(r8, r0)
            if (r10 != r1) goto L5b
            goto L7f
        L5b:
            jj.k r10 = r7.A0()
            r0.f26629c = r7
            r0.f26627a = r8
            r0.f26628b = r8
            r0.f26632f = r4
            java.lang.Object r10 = r10.a(r8, r0)
            if (r10 != r1) goto L6e
            goto L7f
        L6e:
            r2 = r7
            r4 = r8
        L70:
            java.util.List r10 = (java.util.List) r10
            r6 = 0
            r0.f26629c = r6
            r0.f26627a = r4
            r0.f26632f = r3
            java.lang.Object r8 = r2.g(r8, r10, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.h(long, j00.c):java.lang.Object");
    }

    @Override // ij.v
    @m80.l
    public Object i0(@m80.k kj.a aVar, @m80.k j00.c<? super g2> cVar) {
        Object g11 = z0().g(aVar, cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(long r6, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.main.word_book.data.impl.m.g
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.main.word_book.data.impl.m$g r0 = (com.baicizhan.main.word_book.data.impl.m.g) r0
            int r1 = r0.f26636d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26636d = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.m$g r0 = new com.baicizhan.main.word_book.data.impl.m$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26634b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26636d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r6 = r0.f26633a
            kotlin.e.n(r8)
            goto L4a
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.e.n(r8)
            jj.k r8 = r5.A0()
            long[] r2 = new long[r3]
            r4 = 0
            r2[r4] = r6
            r0.f26633a = r6
            r0.f26636d = r3
            java.lang.Object r8 = r8.p(r2, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            ij.z$a r8 = ij.z.f60671m
            int r6 = r8.b(r6)
            java.lang.Integer r6 = l00.a.f(r6)
            java.util.Set r6 = a00.v1.f(r6)
            r5.B0(r6)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.j(long, j00.c):java.lang.Object");
    }

    @Override // ij.v
    @m80.l
    public Object l(int i11, @m80.k j00.c<? super List<kj.b>> cVar) {
        return A0().d(i11, cVar);
    }

    @Override // ij.v
    @m80.l
    public Object l0(@m80.k kj.b[] bVarArr, @m80.k j00.c<? super g2> cVar) {
        Object b11 = A0().b((kj.b[]) Arrays.copyOf(bVarArr, bVarArr.length), cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ij.v
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(long r9, int r11, long r12, @m80.k j00.c<? super yz.g2> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.baicizhan.main.word_book.data.impl.m.i
            if (r0 == 0) goto L14
            r0 = r14
            com.baicizhan.main.word_book.data.impl.m$i r0 = (com.baicizhan.main.word_book.data.impl.m.i) r0
            int r1 = r0.f26653f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26653f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.baicizhan.main.word_book.data.impl.m$i r0 = new com.baicizhan.main.word_book.data.impl.m$i
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f26651d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.f26653f
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            int r11 = r7.f26650c
            long r9 = r7.f26648a
            kotlin.e.n(r14)
            goto L52
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.e.n(r14)
            jj.a r1 = r8.z0()
            r7.f26648a = r9
            r7.f26650c = r11
            r7.f26649b = r12
            r7.f26653f = r2
            r2 = r9
            r4 = r11
            r5 = r12
            java.lang.Object r9 = r1.i(r2, r4, r5, r7)
            if (r9 != r0) goto L50
            return r0
        L50:
            r9 = r2
            r11 = r4
        L52:
            yz.g2 r12 = yz.g2.f100423a
            java.lang.String r13 = com.baicizhan.main.word_book.data.impl.m.f26579j
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "updateBookWordCount ["
            r14.append(r0)
            r14.append(r9)
            java.lang.String r9 = "]: "
            r14.append(r9)
            r14.append(r11)
            java.lang.String r9 = r14.toString()
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            qb.c.i(r13, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.n(long, int, long, j00.c):java.lang.Object");
    }

    @Override // ij.m
    public void q(@m80.k ij.h topics) {
        g0.p(topics, "topics");
        synchronized (this.f26583d) {
            try {
                String str = f26579j;
                Set<Integer> set = this.f26584e;
                qb.c.i(str, "observeFavorites: cur " + (set != null ? Integer.valueOf(set.size()) : null), new Object[0]);
                Set<Integer> set2 = this.f26584e;
                if (set2 == null) {
                    this.f26585f.add(topics);
                } else {
                    g0.m(set2);
                    topics.a(set2);
                    g2 g2Var = g2.f100423a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ij.m
    public void reset() {
        qb.c.i(f26579j, "reset", new Object[0]);
        synchronized (this.f26583d) {
            try {
                Set<Integer> set = this.f26584e;
                if (set != null) {
                    set.clear();
                }
                this.f26584e = null;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ij.v
    @m80.l
    public Object s(@m80.k j00.c<? super List<kj.b>> cVar) {
        return A0().c(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[LOOP:0: B:11:0x0076->B:13:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ij.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.main.word_book.data.impl.m.e
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.main.word_book.data.impl.m$e r0 = (com.baicizhan.main.word_book.data.impl.m.e) r0
            int r1 = r0.f26626c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26626c = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.data.impl.m$e r0 = new com.baicizhan.main.word_book.data.impl.m$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26624a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f26626c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.e.n(r6)
            r0.f26626c = r3
            java.lang.Object r6 = r5.H(r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r6 = a00.r0.e6(r6)
            java.lang.String r0 = com.baicizhan.main.word_book.data.impl.m.f26579j
            int r1 = r6.size()
            java.util.List<ij.h> r2 = r5.f26585f
            int r2 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "initialize [size = "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "] -> observers: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            qb.c.i(r0, r1, r2)
            java.util.List<ij.h> r0 = r5.f26585f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L76:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r0.next()
            ij.h r1 = (ij.h) r1
            r1.a(r6)
            goto L76
        L86:
            java.util.List<ij.h> r0 = r5.f26585f
            r0.clear()
            byte[] r0 = r5.f26583d
            monitor-enter(r0)
            r5.f26584e = r6     // Catch: java.lang.Throwable -> L94
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L94
            monitor-exit(r0)
            return r6
        L94:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.data.impl.m.u(j00.c):java.lang.Object");
    }

    public final Boolean v0(Set<Integer> set) {
        Boolean bool;
        synchronized (this.f26583d) {
            Set<Integer> set2 = this.f26584e;
            if (set2 != null) {
                bool = Boolean.valueOf(set2.addAll(set));
                qb.c.b(f26579j, "add topics: size = " + set.size(), new Object[0]);
            } else {
                bool = null;
            }
        }
        return bool;
    }

    @Override // ij.v
    @m80.l
    public Object x(long j11, @m80.k j00.c<? super Integer> cVar) {
        return A0().i(j11, cVar);
    }

    public final kj.b y0(z zVar, long... jArr) {
        long y11 = zVar.y();
        Set<Long> Ez = a0.Ez(jArr);
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j11 : jArr) {
            arrayList.add(h1.a(Long.valueOf(j11), Long.valueOf(zVar.s())));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        Map W = l1.W((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        ArrayList arrayList2 = new ArrayList(jArr.length);
        for (long j12 : jArr) {
            arrayList2.add(h1.a(Long.valueOf(j12), 0));
        }
        Pair[] pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
        return new kj.b(y11, Ez, W, l1.W((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)), zVar.z(), zVar.t(), zVar.o(), zVar.q(), zVar.p());
    }

    public final jj.a z0() {
        return (jj.a) this.f26581b.getValue();
    }
}
