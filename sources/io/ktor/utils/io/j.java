package io.ktor.utils.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c40.l2;
import c40.r0;
import com.jiongji.andriod.card.R;
import io.ktor.utils.io.g;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteReadChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,614:1\n1#2:615\n1#2:620\n15#3,3:616\n99#4:619\n100#4,8:621\n*S KotlinDebug\n*F\n+ 1 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt\n*L\n440#1:620\n187#1:616,3\n440#1:619\n440#1:621,8\n*E\n"})
/* loaded from: classes8.dex */
public final class j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 1, 1}, l = {73, 74}, m = "awaitUntilReadable", n = {"$this$awaitUntilReadable", "numberOfBytes", "$this$awaitUntilReadable", "numberOfBytes"}, s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62119a;

        /* renamed from: b, reason: collision with root package name */
        public int f62120b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62121c;

        /* renamed from: d, reason: collision with root package name */
        public int f62122d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62121c = obj;
            this.f62122d |= Integer.MIN_VALUE;
            return j.d(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {594, 595}, m = "skipIfFound", n = {"$this$skipIfFound", "byteString"}, s = {"L$0", "L$1"})
    public static final class a0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62123a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62124b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62125c;

        /* renamed from: d, reason: collision with root package name */
        public int f62126d;

        public a0(j00.c<? super a0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62125c = obj;
            this.f62126d |= Integer.MIN_VALUE;
            return j.X(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {115, 116, 125, 125}, m = "copyAndClose", n = {"$this$copyAndClose", "channel", "result", "$this$copyAndClose", "channel", "result", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62127a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62128b;

        /* renamed from: c, reason: collision with root package name */
        public long f62129c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62130d;

        /* renamed from: e, reason: collision with root package name */
        public int f62131e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62130d = obj;
            this.f62131e |= Integer.MIN_VALUE;
            return j.f(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {}, l = {38}, m = "toByteArray", n = {}, s = {})
    public static final class b0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f62132a;

        /* renamed from: b, reason: collision with root package name */
        public int f62133b;

        public b0(j00.c<? super b0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62132a = obj;
            this.f62133b |= Integer.MIN_VALUE;
            return j.Y(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 2}, l = {151, 152, 159, 159}, m = "copyTo", n = {"$this$copyTo", "channel", "result", "$this$copyTo", "channel", "result", "result"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "J$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62134a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62135b;

        /* renamed from: c, reason: collision with root package name */
        public long f62136c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62137d;

        /* renamed from: e, reason: collision with root package name */
        public int f62138e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62137d = obj;
            this.f62138e |= Integer.MIN_VALUE;
            return j.h(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {170, 174, 181, 181}, m = "copyTo", n = {"$this$copyTo", "channel", "limit", "remaining", "$this$copyTo", "channel", "limit", "remaining", "limit", "remaining"}, s = {"L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "J$0", "J$1"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62139a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62140b;

        /* renamed from: c, reason: collision with root package name */
        public long f62141c;

        /* renamed from: d, reason: collision with root package name */
        public long f62142d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f62143e;

        /* renamed from: f, reason: collision with root package name */
        public int f62144f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62143e = obj;
            this.f62144f |= Integer.MIN_VALUE;
            return j.g(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {349}, m = "discard", n = {"$this$discard", "max", "remaining"}, s = {"L$0", "J$0", "J$1"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62145a;

        /* renamed from: b, reason: collision with root package name */
        public long f62146b;

        /* renamed from: c, reason: collision with root package name */
        public long f62147c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62148d;

        /* renamed from: e, reason: collision with root package name */
        public int f62149e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62148d = obj;
            this.f62149e |= Integer.MIN_VALUE;
            return j.i(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {341}, m = "discardExact", n = {"value"}, s = {"J$0"})
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f62150a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62151b;

        /* renamed from: c, reason: collision with root package name */
        public int f62152c;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62151b = obj;
            this.f62152c |= Integer.MIN_VALUE;
            return j.k(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {33}, m = "exhausted", n = {"$this$exhausted"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62153a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62154b;

        /* renamed from: c, reason: collision with root package name */
        public int f62155c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62154b = obj;
            this.f62155c |= Integer.MIN_VALUE;
            return j.l(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m = "peek", n = {"$this$peek", "count"}, s = {"L$0", "I$0"})
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62156a;

        /* renamed from: b, reason: collision with root package name */
        public int f62157b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62158c;

        /* renamed from: d, reason: collision with root package name */
        public int f62159d;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62158c = obj;
            this.f62159d |= Integer.MIN_VALUE;
            return j.q(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 1, 1, 1}, l = {436, 441}, m = "read", n = {"$this$read", "block", "result", "buffer$iv", "head$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62160a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62161b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62162c;

        /* renamed from: d, reason: collision with root package name */
        public Object f62163d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f62164e;

        /* renamed from: f, reason: collision with root package name */
        public int f62165f;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62164e = obj;
            this.f62165f |= Integer.MIN_VALUE;
            return j.r(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {R.styleable.Theme_drawable_tab_mall_1111}, m = "readAvailable", n = {"$this$readAvailable", "buffer", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: io.ktor.utils.io.j$j, reason: collision with other inner class name */
    public static final class C0725j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62166a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62167b;

        /* renamed from: c, reason: collision with root package name */
        public int f62168c;

        /* renamed from: d, reason: collision with root package name */
        public int f62169d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f62170e;

        /* renamed from: f, reason: collision with root package name */
        public int f62171f;

        public C0725j(j00.c<? super C0725j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62170e = obj;
            this.f62171f |= Integer.MIN_VALUE;
            return j.u(null, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {85}, m = "readBuffer", n = {"$this$readBuffer", "result"}, s = {"L$0", "L$1"})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62172a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62173b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62174c;

        /* renamed from: d, reason: collision with root package name */
        public int f62175d;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62174c = obj;
            this.f62175d |= Integer.MIN_VALUE;
            return j.x(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {99}, m = "readBuffer", n = {"$this$readBuffer", "result", "remaining"}, s = {"L$0", "L$1", "I$0"})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62176a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62177b;

        /* renamed from: c, reason: collision with root package name */
        public int f62178c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62179d;

        /* renamed from: e, reason: collision with root package name */
        public int f62180e;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62179d = obj;
            this.f62180e |= Integer.MIN_VALUE;
            return j.w(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {44}, m = "readByte", n = {"$this$readByte"}, s = {"L$0"})
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62181a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62182b;

        /* renamed from: c, reason: collision with root package name */
        public int f62183c;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62182b = obj;
            this.f62183c |= Integer.MIN_VALUE;
            return j.y(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {189}, m = "readByteArray", n = {"$this$readByteArray", "builder$iv", "$this$readByteArray_u24lambda_u242", "count"}, s = {"L$0", "L$1", "L$2", "I$0"})
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62184a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62185b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62186c;

        /* renamed from: d, reason: collision with root package name */
        public int f62187d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f62188e;

        /* renamed from: f, reason: collision with root package name */
        public int f62189f;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62188e = obj;
            this.f62189f |= Integer.MIN_VALUE;
            return j.z(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0}, l = {468}, m = "readFully", n = {"$this$readFully", "out", TtmlNode.END, "offset"}, s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62190a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62191b;

        /* renamed from: c, reason: collision with root package name */
        public int f62192c;

        /* renamed from: d, reason: collision with root package name */
        public int f62193d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f62194e;

        /* renamed from: f, reason: collision with root package name */
        public int f62195f;

        public o(j00.c<? super o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62194e = obj;
            this.f62195f |= Integer.MIN_VALUE;
            return j.A(null, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {62}, m = "readInt", n = {"$this$readInt"}, s = {"L$0"})
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62196a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62197b;

        /* renamed from: c, reason: collision with root package name */
        public int f62198c;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62197b = obj;
            this.f62198c |= Integer.MIN_VALUE;
            return j.C(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {68}, m = "readLong", n = {"$this$readLong"}, s = {"L$0"})
    public static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62199a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62200b;

        /* renamed from: c, reason: collision with root package name */
        public int f62201c;

        public q(j00.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62200b = obj;
            this.f62201c |= Integer.MIN_VALUE;
            return j.D(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {324}, m = "readPacket", n = {"$this$readPacket", "result", "packet"}, s = {"L$0", "L$1", "I$0"})
    public static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62202a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62203b;

        /* renamed from: c, reason: collision with root package name */
        public int f62204c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62205d;

        /* renamed from: e, reason: collision with root package name */
        public int f62206e;

        public r(j00.c<? super r> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62205d = obj;
            this.f62206e |= Integer.MIN_VALUE;
            return j.E(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {199}, m = "readRemaining", n = {"$this$readRemaining", "result"}, s = {"L$0", "L$1"})
    public static final class s extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62207a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62208b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62209c;

        /* renamed from: d, reason: collision with root package name */
        public int f62210d;

        public s(j00.c<? super s> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62209c = obj;
            this.f62210d |= Integer.MIN_VALUE;
            return j.G(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0}, l = {R.styleable.Theme_drawable_searchwords}, m = "readRemaining", n = {"$this$readRemaining", "result", "remaining"}, s = {"L$0", "L$1", "J$0"})
    public static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62211a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62212b;

        /* renamed from: c, reason: collision with root package name */
        public long f62213c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62214d;

        /* renamed from: e, reason: collision with root package name */
        public int f62215e;

        public t(j00.c<? super t> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62214d = obj;
            this.f62215e |= Integer.MIN_VALUE;
            return j.F(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {56}, m = "readShort", n = {"$this$readShort"}, s = {"L$0"})
    public static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62216a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62217b;

        /* renamed from: c, reason: collision with root package name */
        public int f62218c;

        public u(j00.c<? super u> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62217b = obj;
            this.f62218c |= Integer.MIN_VALUE;
            return j.H(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {141}, m = "readUTF8Line", n = {"result"}, s = {"L$0"})
    public static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62219a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62220b;

        /* renamed from: c, reason: collision with root package name */
        public int f62221c;

        public v(j00.c<? super v> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62220b = obj;
            this.f62221c |= Integer.MIN_VALUE;
            return j.I(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 1, 1, 1, 1, 2}, l = {372, 377, 413}, m = "readUTF8LineTo", n = {"$this$readUTF8LineTo", "out", "max", "$this$readUTF8LineTo", "out", "max", "consumed", "$this$readUTF8LineTo"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1", "L$0"})
    public static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62222a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62223b;

        /* renamed from: c, reason: collision with root package name */
        public int f62224c;

        /* renamed from: d, reason: collision with root package name */
        public int f62225d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f62226e;

        /* renamed from: f, reason: collision with root package name */
        public int f62227f;

        public w(j00.c<? super w> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62226e = obj;
            this.f62227f |= Integer.MIN_VALUE;
            return j.K(null, null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 4}, l = {532, 535, 545, 555, 556}, m = "readUntil", n = {"$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "byte", "$this$readUntil", "matchString", "writeChannel", "partialMatchTable", "matchIndex", "matchBuffer", "rc", "limit", "ignoreMissing", "writeChannel", "rc", "rc"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "B$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$0"})
    public static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62228a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62229b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62230c;

        /* renamed from: d, reason: collision with root package name */
        public Object f62231d;

        /* renamed from: e, reason: collision with root package name */
        public Object f62232e;

        /* renamed from: f, reason: collision with root package name */
        public Object f62233f;

        /* renamed from: g, reason: collision with root package name */
        public Object f62234g;

        /* renamed from: h, reason: collision with root package name */
        public long f62235h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f62236i;

        /* renamed from: j, reason: collision with root package name */
        public byte f62237j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f62238k;

        /* renamed from: l, reason: collision with root package name */
        public int f62239l;

        public x(j00.c<? super x> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62238k = obj;
            this.f62239l |= Integer.MIN_VALUE;
            return j.M(null, null, null, 0L, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0, 0}, l = {520}, m = "readUntil$appendPartialMatch", n = {"matchIndex", "rc"}, s = {"L$0", "L$1"})
    public static final class y extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62240a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62241b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62242c;

        /* renamed from: d, reason: collision with root package name */
        public int f62243d;

        public y(j00.c<? super y> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62242c = obj;
            this.f62243d |= Integer.MIN_VALUE;
            return j.N(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt$reader$job$1", f = "ByteReadChannelOperations.kt", i = {0, 0, 1, 3, 5}, l = {291, 301, 302, 301, 302, 301, 302}, m = "invokeSuspend", n = {"$this$launch", "nested", "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
    @u0({"SMAP\nByteReadChannelOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadChannelOperations.kt\nio/ktor/utils/io/ByteReadChannelOperationsKt$reader$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,614:1\n1#2:615\n*E\n"})
    public static final class z extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62244a;

        /* renamed from: b, reason: collision with root package name */
        public int f62245b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62246c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.p<j0, j00.c<? super g2>, Object> f62247d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f62248e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(x00.p<? super j0, ? super j00.c<? super g2>, ? extends Object> pVar, io.ktor.utils.io.b bVar, j00.c<? super z> cVar) {
            super(2, cVar);
            this.f62247d = pVar;
            this.f62248e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            z zVar = new z(this.f62247d, this.f62248e, cVar);
            zVar.f62246c = obj;
            return zVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((z) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
        
            if (r1.K0(r8) != r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
        
            if (r1.K0(r8) != r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0118, code lost:
        
            if (r1.K0(r8) != r0) goto L59;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009e A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:45:0x0052, B:46:0x008d, B:48:0x009e, B:53:0x006d), top: B:2:0x0007 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [c40.l2] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v9, types: [c40.a0, c40.l2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:11:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(@m80.k io.ktor.utils.io.g r8, @m80.k byte[] r9, int r10, int r11, @m80.k j00.c<? super yz.g2> r12) {
        /*
            boolean r0 = r12 instanceof io.ktor.utils.io.j.o
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.j$o r0 = (io.ktor.utils.io.j.o) r0
            int r1 = r0.f62195f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62195f = r1
            goto L18
        L13:
            io.ktor.utils.io.j$o r0 = new io.ktor.utils.io.j$o
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f62194e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62195f
            java.lang.String r3 = "Channel is already closed"
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            int r8 = r0.f62193d
            int r9 = r0.f62192c
            java.lang.Object r10 = r0.f62191b
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r0.f62190a
            io.ktor.utils.io.g r11 = (io.ktor.utils.io.g) r11
            kotlin.e.n(r12)
            goto L6c
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            kotlin.e.n(r12)
            boolean r12 = r8.f()
            if (r12 != 0) goto L99
        L48:
            if (r10 >= r11) goto L96
            y40.c0 r12 = r8.e()
            boolean r12 = r12.J()
            if (r12 == 0) goto L71
            r0.f62190a = r8
            r0.f62191b = r9
            r0.f62192c = r11
            r0.f62193d = r10
            r0.f62195f = r4
            r12 = 0
            r2 = 0
            java.lang.Object r12 = io.ktor.utils.io.g.b.a(r8, r12, r0, r4, r2)
            if (r12 != r1) goto L67
            return r1
        L67:
            r7 = r11
            r11 = r8
            r8 = r10
            r10 = r9
            r9 = r7
        L6c:
            r7 = r10
            r10 = r8
            r8 = r11
            r11 = r9
            r9 = r7
        L71:
            boolean r12 = r8.f()
            if (r12 != 0) goto L90
            int r12 = r11 - r10
            y40.c0 r2 = r8.e()
            long r5 = jz.j.j(r2)
            int r2 = (int) r5
            int r12 = java.lang.Math.min(r12, r2)
            y40.c0 r2 = r8.e()
            int r12 = r12 + r10
            y40.g0.o(r2, r9, r10, r12)
            r10 = r12
            goto L48
        L90:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        L96:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        L99:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.A(io.ktor.utils.io.g, byte[], int, int, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object B(io.ktor.utils.io.g gVar, byte[] bArr, int i11, int i12, j00.c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return A(gVar, bArr, i11, i12, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(@m80.k io.ktor.utils.io.g r4, @m80.k j00.c<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.j.p
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j$p r0 = (io.ktor.utils.io.j.p) r0
            int r1 = r0.f62198c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62198c = r1
            goto L18
        L13:
            io.ktor.utils.io.j$p r0 = new io.ktor.utils.io.j$p
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62197b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62198c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f62196a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            r0.f62196a = r4
            r0.f62198c = r3
            r5 = 4
            java.lang.Object r5 = d(r4, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            y40.c0 r4 = r4.e()
            int r4 = r4.readInt()
            java.lang.Integer r4 = l00.a.f(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.C(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(@m80.k io.ktor.utils.io.g r4, @m80.k j00.c<? super java.lang.Long> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.j.q
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j$q r0 = (io.ktor.utils.io.j.q) r0
            int r1 = r0.f62201c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62201c = r1
            goto L18
        L13:
            io.ktor.utils.io.j$q r0 = new io.ktor.utils.io.j$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62200b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62201c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f62199a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r5)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            r0.f62199a = r4
            r0.f62201c = r3
            r5 = 8
            java.lang.Object r5 = d(r4, r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            y40.c0 r4 = r4.e()
            long r4 = r4.readLong()
            java.lang.Long r4 = l00.a.g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.D(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006a -> B:10:0x006c). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(@m80.k io.ktor.utils.io.g r11, int r12, @m80.k j00.c<? super y40.c0> r13) {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.j.r
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.j$r r0 = (io.ktor.utils.io.j.r) r0
            int r1 = r0.f62206e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62206e = r1
            goto L18
        L13:
            io.ktor.utils.io.j$r r0 = new io.ktor.utils.io.j$r
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f62205d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62206e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r11 = r0.f62204c
            java.lang.Object r12 = r0.f62203b
            y40.b r12 = (y40.b) r12
            java.lang.Object r2 = r0.f62202a
            io.ktor.utils.io.g r2 = (io.ktor.utils.io.g) r2
            kotlin.e.n(r13)
            goto L6c
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.e.n(r13)
            y40.b r13 = new y40.b
            r13.<init>()
            r10 = r13
            r13 = r12
            r12 = r10
        L46:
            long r4 = r12.r()
            long r6 = (long) r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto La0
            y40.c0 r2 = r11.e()
            boolean r2 = r2.J()
            if (r2 == 0) goto L6e
            r0.f62202a = r11
            r0.f62203b = r12
            r0.f62204c = r13
            r0.f62206e = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.g.b.a(r11, r2, r0, r3, r4)
            if (r2 != r1) goto L6a
            return r1
        L6a:
            r2 = r11
            r11 = r13
        L6c:
            r13 = r11
            r11 = r2
        L6e:
            boolean r2 = r11.f()
            if (r2 != 0) goto La0
            y40.c0 r2 = r11.e()
            long r4 = jz.j.j(r2)
            long r6 = (long) r13
            long r8 = r12.r()
            long r8 = r6 - r8
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L94
            y40.c0 r2 = r11.e()
            long r4 = r12.r()
            long r6 = r6 - r4
            r2.R2(r12, r6)
            goto L46
        L94:
            y40.c0 r2 = r11.e()
            long r4 = r2.S1(r12)
            l00.a.g(r4)
            goto L46
        La0:
            long r0 = r12.r()
            long r2 = (long) r13
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto Laa
            return r12
        Laa:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not enough data available, required "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = " bytes but only "
            r0.append(r13)
            long r12 = r12.r()
            r0.append(r12)
            java.lang.String r12 = " available"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.E(io.ktor.utils.io.g, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(@m80.k io.ktor.utils.io.g r8, long r9, @m80.k j00.c<? super y40.c0> r11) {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.j.t
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.j$t r0 = (io.ktor.utils.io.j.t) r0
            int r1 = r0.f62215e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62215e = r1
            goto L18
        L13:
            io.ktor.utils.io.j$t r0 = new io.ktor.utils.io.j$t
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f62214d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62215e
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r8 = r0.f62213c
            java.lang.Object r10 = r0.f62212b
            y40.x r10 = (y40.x) r10
            java.lang.Object r2 = r0.f62211a
            io.ktor.utils.io.g r2 = (io.ktor.utils.io.g) r2
            kotlin.e.n(r11)
            r11 = r10
            r9 = r8
            r8 = r2
            goto L45
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.e.n(r11)
            y40.x r11 = jz.h.a()
        L45:
            boolean r2 = r8.f()
            if (r2 != 0) goto L8d
            r4 = 0
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L8d
            y40.c0 r2 = r8.e()
            long r6 = jz.j.j(r2)
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 < 0) goto L73
            y40.c0 r2 = r8.e()
            long r4 = jz.j.j(r2)
            long r4 = r9 - r4
            y40.c0 r9 = r8.e()
            long r9 = r9.S1(r11)
            l00.a.g(r9)
            goto L7a
        L73:
            y40.c0 r2 = r8.e()
            r2.R2(r11, r9)
        L7a:
            r0.f62211a = r8
            r0.f62212b = r11
            r0.f62213c = r4
            r0.f62215e = r3
            r9 = 0
            r10 = 0
            java.lang.Object r9 = io.ktor.utils.io.g.b.a(r8, r9, r0, r3, r10)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            r9 = r4
            goto L45
        L8d:
            y40.b r8 = r11.getBuffer()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.F(io.ktor.utils.io.g, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(@m80.k io.ktor.utils.io.g r5, @m80.k j00.c<? super y40.c0> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.j.s
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.j$s r0 = (io.ktor.utils.io.j.s) r0
            int r1 = r0.f62210d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62210d = r1
            goto L18
        L13:
            io.ktor.utils.io.j$s r0 = new io.ktor.utils.io.j$s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f62209c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62210d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f62208b
            y40.x r5 = (y40.x) r5
            java.lang.Object r2 = r0.f62207a
            io.ktor.utils.io.g r2 = (io.ktor.utils.io.g) r2
            kotlin.e.n(r6)
            r6 = r5
            r5 = r2
            goto L42
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e.n(r6)
            y40.x r6 = jz.h.a()
        L42:
            boolean r2 = r5.f()
            if (r2 != 0) goto L5e
            y40.c0 r2 = r5.e()
            r6.T(r2)
            r0.f62207a = r5
            r0.f62208b = r6
            r0.f62210d = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.g.b.a(r5, r2, r0, r3, r4)
            if (r2 != r1) goto L42
            return r1
        L5e:
            V(r5)
            y40.b r5 = r6.getBuffer()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.G(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(@m80.k io.ktor.utils.io.g r4, @m80.k j00.c<? super java.lang.Short> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.j.u
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j$u r0 = (io.ktor.utils.io.j.u) r0
            int r1 = r0.f62218c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62218c = r1
            goto L18
        L13:
            io.ktor.utils.io.j$u r0 = new io.ktor.utils.io.j$u
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62217b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62218c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f62216a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            r0.f62216a = r4
            r0.f62218c = r3
            r5 = 2
            java.lang.Object r5 = d(r4, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            y40.c0 r4 = r4.e()
            short r4 = r4.readShort()
            java.lang.Short r4 = l00.a.h(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.H(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(@m80.k io.ktor.utils.io.g r5, int r6, @m80.k j00.c<? super java.lang.String> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.j.v
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.j$v r0 = (io.ktor.utils.io.j.v) r0
            int r1 = r0.f62221c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62221c = r1
            goto L18
        L13:
            io.ktor.utils.io.j$v r0 = new io.ktor.utils.io.j$v
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62220b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62221c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f62219a
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            kotlin.e.n(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e.n(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r0.f62219a = r7
            r0.f62221c = r3
            java.lang.Object r5 = K(r5, r7, r6, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r4 = r7
            r7 = r5
            r5 = r4
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L55
            r5 = 0
            return r5
        L55:
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.I(io.ktor.utils.io.g, int, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object J(io.ktor.utils.io.g gVar, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return I(gVar, i11, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (io.ktor.utils.io.g.b.a(r14, r12, r2, r13, null) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0084, code lost:
    
        if (io.ktor.utils.io.g.b.a(r26, 0, r2, 1, null) == r3) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00af -> B:22:0x00b3). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(@m80.k io.ktor.utils.io.g r26, @m80.k java.lang.Appendable r27, int r28, @m80.k j00.c<? super java.lang.Boolean> r29) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.K(io.ktor.utils.io.g, java.lang.Appendable, int, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object L(io.ktor.utils.io.g gVar, Appendable appendable, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return K(gVar, appendable, i11, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
    
        if (N(r14, r11, r12, r5, r1) != r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0186 -> B:26:0x0192). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01b3 -> B:25:0x01b6). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(@m80.k io.ktor.utils.io.g r21, @m80.k z40.c r22, @m80.k io.ktor.utils.io.m r23, long r24, boolean r26, @m80.k j00.c<? super java.lang.Long> r27) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.M(io.ktor.utils.io.g, z40.c, io.ktor.utils.io.m, long, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(io.ktor.utils.io.m r5, byte[] r6, kotlin.jvm.internal.Ref.IntRef r7, kotlin.jvm.internal.Ref.LongRef r8, j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.j.y
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.j$y r0 = (io.ktor.utils.io.j.y) r0
            int r1 = r0.f62243d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62243d = r1
            goto L18
        L13:
            io.ktor.utils.io.j$y r0 = new io.ktor.utils.io.j$y
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62242c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62243d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r5 = r0.f62241b
            r8 = r5
            kotlin.jvm.internal.Ref$LongRef r8 = (kotlin.jvm.internal.Ref.LongRef) r8
            java.lang.Object r5 = r0.f62240a
            r7 = r5
            kotlin.jvm.internal.Ref$IntRef r7 = (kotlin.jvm.internal.Ref.IntRef) r7
            kotlin.e.n(r9)
            goto L4e
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.e.n(r9)
            int r9 = r7.element
            r0.f62240a = r7
            r0.f62241b = r8
            r0.f62243d = r4
            java.lang.Object r5 = io.ktor.utils.io.q.r(r5, r6, r3, r9, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            long r5 = r8.element
            int r9 = r7.element
            long r0 = (long) r9
            long r5 = r5 + r0
            r8.element = r5
            r7.element = r3
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.N(io.ktor.utils.io.m, byte[], kotlin.jvm.internal.Ref$IntRef, kotlin.jvm.internal.Ref$LongRef, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object O(io.ktor.utils.io.g gVar, z40.c cVar, io.ktor.utils.io.m mVar, long j11, boolean z11, j00.c cVar2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return M(gVar, cVar, mVar, j12, z11, cVar2);
    }

    public static final void P(Ref.IntRef intRef, z40.c cVar, int[] iArr, byte b11) {
        while (true) {
            int i11 = intRef.element;
            if (i11 <= 0 || b11 == cVar.e(i11)) {
                return;
            } else {
                intRef.element = iArr[intRef.element - 1];
            }
        }
    }

    @m80.k
    public static final i0 Q(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d coroutineContext, @m80.k final io.ktor.utils.io.b channel, @m80.k x00.p<? super j0, ? super j00.c<? super g2>, ? extends Object> block) {
        l2 f11;
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(block, "block");
        f11 = c40.k.f(r0Var, coroutineContext, null, new z(block, channel, null), 2, null);
        f11.z0(new x00.l() { // from class: io.ktor.utils.io.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 T;
                T = j.T(b.this, (Throwable) obj);
                return T;
            }
        });
        return new i0(channel, f11);
    }

    @m80.k
    public static final i0 R(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d coroutineContext, boolean z11, @m80.k x00.p<? super j0, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(block, "block");
        return Q(r0Var, coroutineContext, new io.ktor.utils.io.b(false, 1, null), block);
    }

    public static /* synthetic */ i0 S(r0 r0Var, kotlin.coroutines.d dVar, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return R(r0Var, dVar, z11, pVar);
    }

    public static final g2 T(io.ktor.utils.io.b bVar, Throwable th2) {
        if (th2 != null && !bVar.f()) {
            bVar.a(th2);
        }
        return g2.f100423a;
    }

    @io.ktor.utils.io.b0
    public static final void U(@m80.k io.ktor.utils.io.b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        Throwable b11 = bVar.b();
        if (b11 != null) {
            throw b11;
        }
    }

    @io.ktor.utils.io.b0
    public static final void V(@m80.k io.ktor.utils.io.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        Throwable b11 = gVar.b();
        if (b11 != null) {
            throw b11;
        }
    }

    @io.ktor.utils.io.b0
    public static final void W(@m80.k io.ktor.utils.io.m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Throwable b11 = mVar.b();
        if (b11 != null) {
            throw b11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (i(r5, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X(@m80.k io.ktor.utils.io.g r5, @m80.k z40.c r6, @m80.k j00.c<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.j.a0
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.j$a0 r0 = (io.ktor.utils.io.j.a0) r0
            int r1 = r0.f62126d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62126d = r1
            goto L18
        L13:
            io.ktor.utils.io.j$a0 r0 = new io.ktor.utils.io.j$a0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62125c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62126d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f62124b
            r6 = r5
            z40.c r6 = (z40.c) r6
            java.lang.Object r5 = r0.f62123a
            io.ktor.utils.io.g r5 = (io.ktor.utils.io.g) r5
            kotlin.e.n(r7)
            goto L55
        L41:
            kotlin.e.n(r7)
            int r7 = r6.g()
            r0.f62123a = r5
            r0.f62124b = r6
            r0.f62126d = r4
            java.lang.Object r7 = q(r5, r7, r0)
            if (r7 != r1) goto L55
            goto L6d
        L55:
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r6)
            if (r7 == 0) goto L73
            int r6 = r6.g()
            long r6 = (long) r6
            r2 = 0
            r0.f62123a = r2
            r0.f62124b = r2
            r0.f62126d = r3
            java.lang.Object r5 = i(r5, r6, r0)
            if (r5 != r1) goto L6e
        L6d:
            return r1
        L6e:
            java.lang.Boolean r5 = l00.a.a(r4)
            return r5
        L73:
            r5 = 0
            java.lang.Boolean r5 = l00.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.X(io.ktor.utils.io.g, z40.c, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(@m80.k io.ktor.utils.io.g r4, @m80.k j00.c<? super byte[]> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.j.b0
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j$b0 r0 = (io.ktor.utils.io.j.b0) r0
            int r1 = r0.f62133b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62133b = r1
            goto L18
        L13:
            io.ktor.utils.io.j$b0 r0 = new io.ktor.utils.io.j$b0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62132a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62133b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r5)
            r0.f62133b = r3
            java.lang.Object r5 = x(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            y40.b r5 = (y40.b) r5
            r4 = 0
            r0 = 0
            byte[] r4 = jz.d.c(r5, r4, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.Y(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public static final String Z(z40.c cVar) {
        return u30.f0.z2(z40.g.e(cVar), "\n", "\\n", false, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (c40.b4.a(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(io.ktor.utils.io.g r6, int r7, j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.j.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.j$a r0 = (io.ktor.utils.io.j.a) r0
            int r1 = r0.f62122d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62122d = r1
            goto L18
        L13:
            io.ktor.utils.io.j$a r0 = new io.ktor.utils.io.j$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f62121c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62122d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.f62120b
            java.lang.Object r7 = r0.f62119a
            io.ktor.utils.io.g r7 = (io.ktor.utils.io.g) r7
            kotlin.e.n(r8)
        L31:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4a
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            int r6 = r0.f62120b
            java.lang.Object r7 = r0.f62119a
            io.ktor.utils.io.g r7 = (io.ktor.utils.io.g) r7
            kotlin.e.n(r8)
            goto L60
        L47:
            kotlin.e.n(r8)
        L4a:
            int r8 = m(r6)
            if (r8 >= r7) goto L78
            r0.f62119a = r6
            r0.f62120b = r7
            r0.f62122d = r4
            java.lang.Object r8 = r6.d(r7, r0)
            if (r8 != r1) goto L5d
            goto L74
        L5d:
            r5 = r7
            r7 = r6
            r6 = r5
        L60:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L75
            r0.f62119a = r7
            r0.f62120b = r6
            r0.f62122d = r3
            java.lang.Object r8 = c40.b4.a(r0)
            if (r8 != r1) goto L31
        L74:
            return r1
        L75:
            r5 = r7
            r7 = r6
            r6 = r5
        L78:
            int r6 = m(r6)
            if (r6 < r7) goto L81
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L81:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "Not enough data available"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.d(io.ktor.utils.io.g, int, j00.c):java.lang.Object");
    }

    public static final int[] e(z40.c cVar) {
        int[] iArr = new int[cVar.g()];
        int g11 = cVar.g();
        int i11 = 0;
        for (int i12 = 1; i12 < g11; i12++) {
            while (i11 > 0 && cVar.e(i12) != cVar.e(i11)) {
                i11 = iArr[i11 - 1];
            }
            if (cVar.e(i12) == cVar.e(i11)) {
                i11++;
            }
            iArr[i12] = i11;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:25:0x0073, B:27:0x0079, B:34:0x00af, B:39:0x00ca), top: B:24:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: all -> 0x00a9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:25:0x0073, B:27:0x0079, B:34:0x00af, B:39:0x00ca), top: B:24:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r14v0, types: [io.ktor.utils.io.g] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.g] */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a6 -> B:23:0x0056). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(@m80.k io.ktor.utils.io.g r14, @m80.k io.ktor.utils.io.m r15, @m80.k j00.c<? super java.lang.Long> r16) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.f(io.ktor.utils.io.g, io.ktor.utils.io.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (io.ktor.utils.io.g.b.a(r1, 0, r13, r7, null) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        if (r0 != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.m, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d9 -> B:23:0x005a). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@m80.k io.ktor.utils.io.g r17, @m80.k io.ktor.utils.io.m r18, long r19, @m80.k j00.c<? super java.lang.Long> r21) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.g(io.ktor.utils.io.g, io.ktor.utils.io.m, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (io.ktor.utils.io.g.b.a(r11, 0, r1, 1, null) != r2) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #2 {all -> 0x00ad, blocks: (B:25:0x0077, B:27:0x007d), top: B:24:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.m] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.m, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00aa -> B:23:0x0056). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(@m80.k io.ktor.utils.io.g r16, @m80.k io.ktor.utils.io.m r17, @m80.k j00.c<? super java.lang.Long> r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.h(io.ktor.utils.io.g, io.ktor.utils.io.m, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:11:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(@m80.k io.ktor.utils.io.g r10, long r11, @m80.k j00.c<? super java.lang.Long> r13) {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.j.e
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.j$e r0 = (io.ktor.utils.io.j.e) r0
            int r1 = r0.f62149e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62149e = r1
            goto L18
        L13:
            io.ktor.utils.io.j$e r0 = new io.ktor.utils.io.j$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f62148d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62149e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r10 = r0.f62147c
            long r4 = r0.f62146b
            java.lang.Object r12 = r0.f62145a
            io.ktor.utils.io.g r12 = (io.ktor.utils.io.g) r12
            kotlin.e.n(r13)
            goto L63
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.e.n(r13)
            r4 = r11
        L3d:
            r6 = 0
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 <= 0) goto L7b
            boolean r13 = r10.f()
            if (r13 != 0) goto L7b
            int r13 = m(r10)
            if (r13 != 0) goto L66
            r0.f62145a = r10
            r0.f62146b = r4
            r0.f62147c = r11
            r0.f62149e = r3
            r13 = 0
            r2 = 0
            java.lang.Object r13 = io.ktor.utils.io.g.b.a(r10, r13, r0, r3, r2)
            if (r13 != r1) goto L60
            return r1
        L60:
            r8 = r11
            r12 = r10
            r10 = r8
        L63:
            r8 = r10
            r10 = r12
            r11 = r8
        L66:
            y40.c0 r13 = r10.e()
            long r6 = jz.j.j(r13)
            long r6 = java.lang.Math.min(r11, r6)
            y40.c0 r13 = r10.e()
            jz.j.g(r13, r6)
            long r11 = r11 - r6
            goto L3d
        L7b:
            long r4 = r4 - r11
            java.lang.Long r10 = l00.a.g(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.i(io.ktor.utils.io.g, long, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object j(io.ktor.utils.io.g gVar, long j11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return i(gVar, j11, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(@m80.k io.ktor.utils.io.g r4, long r5, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.j.f
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.j$f r0 = (io.ktor.utils.io.j.f) r0
            int r1 = r0.f62152c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62152c = r1
            goto L18
        L13:
            io.ktor.utils.io.j$f r0 = new io.ktor.utils.io.j$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62151b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62152c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r5 = r0.f62150a
            kotlin.e.n(r7)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.e.n(r7)
            r0.f62150a = r5
            r0.f62152c = r3
            java.lang.Object r7 = i(r4, r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L4e
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L4e:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unable to discard "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = " bytes"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.k(io.ktor.utils.io.g, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(@m80.k io.ktor.utils.io.g r4, @m80.k j00.c<? super java.lang.Boolean> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.j.g
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j$g r0 = (io.ktor.utils.io.j.g) r0
            int r1 = r0.f62155c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62155c = r1
            goto L18
        L13:
            io.ktor.utils.io.j$g r0 = new io.ktor.utils.io.j$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62154b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62155c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f62153a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            y40.c0 r5 = r4.e()
            boolean r5 = r5.J()
            if (r5 == 0) goto L4f
            r0.f62153a = r4
            r0.f62155c = r3
            r5 = 0
            r2 = 0
            java.lang.Object r5 = io.ktor.utils.io.g.b.a(r4, r5, r0, r3, r2)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            y40.c0 r4 = r4.e()
            boolean r4 = r4.J()
            java.lang.Boolean r4 = l00.a.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.l(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    public static final int m(@m80.k io.ktor.utils.io.g gVar) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        return (int) gVar.e().getBuffer().r();
    }

    public static final int o(@m80.k io.ktor.utils.io.m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return 1048576 - jz.h.f(mVar.i());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(@m80.k io.ktor.utils.io.g r5, int r6, @m80.k j00.c<? super z40.c> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.j.h
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.j$h r0 = (io.ktor.utils.io.j.h) r0
            int r1 = r0.f62159d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62159d = r1
            goto L18
        L13:
            io.ktor.utils.io.j$h r0 = new io.ktor.utils.io.j$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f62158c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62159d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.f62157b
            java.lang.Object r5 = r0.f62156a
            io.ktor.utils.io.g r5 = (io.ktor.utils.io.g) r5
            kotlin.e.n(r7)
            goto L4f
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.e.n(r7)
            boolean r7 = r5.f()
            if (r7 == 0) goto L42
            return r3
        L42:
            r0.f62156a = r5
            r0.f62157b = r6
            r0.f62159d = r4
            java.lang.Object r7 = r5.d(r6, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L58
            return r3
        L58:
            y40.c0 r5 = r5.e()
            y40.c0 r5 = r5.peek()
            z40.c r5 = y40.f.f(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.q(io.ktor.utils.io.g, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0077, code lost:
    
        if (io.ktor.utils.io.g.b.a(r7, 0, r0, 1, null) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(@m80.k io.ktor.utils.io.g r7, @m80.k x00.r<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, ? super j00.c<? super java.lang.Integer>, ? extends java.lang.Object> r8, @m80.k j00.c<? super java.lang.Integer> r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.r(io.ktor.utils.io.g, x00.r, j00.c):java.lang.Object");
    }

    public static final Object s(io.ktor.utils.io.g gVar, x00.r<? super byte[], ? super Integer, ? super Integer, ? super j00.c<? super Integer>, ? extends Object> rVar, j00.c<? super Integer> cVar) {
        if (gVar.f()) {
            return -1;
        }
        if (gVar.e().J()) {
            kotlin.jvm.internal.d0.e(0);
            g.b.a(gVar, 0, cVar, 1, null);
            kotlin.jvm.internal.d0.e(1);
        }
        if (gVar.f()) {
            return -1;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        d50.d dVar = d50.d.f47268a;
        y40.b buffer = gVar.e().getBuffer();
        if (buffer.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        y40.t k11 = buffer.k();
        kotlin.jvm.internal.g0.m(k11);
        byte[] b11 = k11.b(true);
        Integer valueOf = Integer.valueOf(k11.h());
        int intValue = Integer.valueOf(k11.d()).intValue();
        Integer valueOf2 = Integer.valueOf(valueOf.intValue());
        Integer valueOf3 = Integer.valueOf(intValue);
        kotlin.jvm.internal.d0.e(3);
        int intValue2 = ((Number) rVar.invoke(b11, valueOf2, valueOf3, null)).intValue();
        intRef.element = intValue2;
        int intValue3 = Integer.valueOf(intValue2).intValue();
        if (intValue3 != 0) {
            if (intValue3 < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (intValue3 > k11.n()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(intValue3);
        }
        return Integer.valueOf(intRef.element);
    }

    public static final int t(@m80.k io.ktor.utils.io.g gVar, int i11, @m80.k x00.l<? super y40.b, Integer> block) {
        kotlin.jvm.internal.g0.p(gVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        if (i11 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i11 <= 1048576) {
            if (m(gVar) < i11) {
                return -1;
            }
            return block.invoke(gVar.e().getBuffer()).intValue();
        }
        throw new IllegalArgumentException(("Min(" + i11 + ") shouldn't be greater than 1048576").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(@m80.k io.ktor.utils.io.g r5, @m80.k byte[] r6, int r7, int r8, @m80.k j00.c<? super java.lang.Integer> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.utils.io.j.C0725j
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.j$j r0 = (io.ktor.utils.io.j.C0725j) r0
            int r1 = r0.f62171f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62171f = r1
            goto L18
        L13:
            io.ktor.utils.io.j$j r0 = new io.ktor.utils.io.j$j
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62170e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62171f
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            int r8 = r0.f62169d
            int r7 = r0.f62168c
            java.lang.Object r5 = r0.f62167b
            r6 = r5
            byte[] r6 = (byte[]) r6
            java.lang.Object r5 = r0.f62166a
            io.ktor.utils.io.g r5 = (io.ktor.utils.io.g) r5
            kotlin.e.n(r9)
            goto L6a
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.e.n(r9)
            boolean r9 = r5.f()
            if (r9 == 0) goto L4d
            java.lang.Integer r5 = l00.a.f(r3)
            return r5
        L4d:
            y40.c0 r9 = r5.e()
            boolean r9 = r9.J()
            if (r9 == 0) goto L6a
            r0.f62166a = r5
            r0.f62167b = r6
            r0.f62168c = r7
            r0.f62169d = r8
            r0.f62171f = r4
            r9 = 0
            r2 = 0
            java.lang.Object r9 = io.ktor.utils.io.g.b.a(r5, r9, r0, r4, r2)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            boolean r9 = r5.f()
            if (r9 == 0) goto L75
            java.lang.Integer r5 = l00.a.f(r3)
            return r5
        L75:
            y40.c0 r5 = r5.e()
            int r5 = jz.n.b(r5, r6, r7, r8)
            java.lang.Integer r5 = l00.a.f(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.u(io.ktor.utils.io.g, byte[], int, int, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object v(io.ktor.utils.io.g gVar, byte[] bArr, int i11, int i12, j00.c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length - i11;
        }
        return u(gVar, bArr, i11, i12, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:11:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0066 -> B:10:0x0069). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(@m80.k io.ktor.utils.io.g r8, int r9, @m80.k j00.c<? super y40.b> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.utils.io.j.l
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.j$l r0 = (io.ktor.utils.io.j.l) r0
            int r1 = r0.f62180e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62180e = r1
            goto L18
        L13:
            io.ktor.utils.io.j$l r0 = new io.ktor.utils.io.j$l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f62179d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62180e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.f62178c
            java.lang.Object r9 = r0.f62177b
            y40.b r9 = (y40.b) r9
            java.lang.Object r2 = r0.f62176a
            io.ktor.utils.io.g r2 = (io.ktor.utils.io.g) r2
            kotlin.e.n(r10)
            goto L69
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.e.n(r10)
            y40.b r10 = new y40.b
            r10.<init>()
        L43:
            if (r9 <= 0) goto L83
            boolean r2 = r8.f()
            if (r2 != 0) goto L83
            y40.c0 r2 = r8.e()
            boolean r2 = r2.J()
            if (r2 == 0) goto L6c
            r0.f62176a = r8
            r0.f62177b = r10
            r0.f62178c = r9
            r0.f62180e = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.g.b.a(r8, r2, r0, r3, r4)
            if (r2 != r1) goto L66
            return r1
        L66:
            r2 = r8
            r8 = r9
            r9 = r10
        L69:
            r10 = r9
            r9 = r8
            r8 = r2
        L6c:
            long r4 = (long) r9
            y40.c0 r2 = r8.e()
            long r6 = jz.j.j(r2)
            long r4 = java.lang.Math.min(r4, r6)
            y40.c0 r2 = r8.e()
            r2.R2(r10, r4)
            int r2 = (int) r4
            int r9 = r9 - r2
            goto L43
        L83:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.w(io.ktor.utils.io.g, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(@m80.k io.ktor.utils.io.g r5, @m80.k j00.c<? super y40.b> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.j.k
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.j$k r0 = (io.ktor.utils.io.j.k) r0
            int r1 = r0.f62175d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62175d = r1
            goto L18
        L13:
            io.ktor.utils.io.j$k r0 = new io.ktor.utils.io.j$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f62174c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62175d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f62173b
            y40.b r5 = (y40.b) r5
            java.lang.Object r2 = r0.f62172a
            io.ktor.utils.io.g r2 = (io.ktor.utils.io.g) r2
            kotlin.e.n(r6)
            r6 = r5
            r5 = r2
            goto L43
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.e.n(r6)
            y40.b r6 = new y40.b
            r6.<init>()
        L43:
            boolean r2 = r5.f()
            if (r2 != 0) goto L5f
            y40.c0 r2 = r5.e()
            r6.T(r2)
            r0.f62172a = r5
            r0.f62173b = r6
            r0.f62175d = r3
            r2 = 0
            r4 = 0
            java.lang.Object r2 = io.ktor.utils.io.g.b.a(r5, r2, r0, r3, r4)
            if (r2 != r1) goto L43
            return r1
        L5f:
            java.lang.Throwable r5 = r5.b()
            if (r5 != 0) goto L66
            return r6
        L66:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.x(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(@m80.k io.ktor.utils.io.g r4, @m80.k j00.c<? super java.lang.Byte> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.j.m
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j$m r0 = (io.ktor.utils.io.j.m) r0
            int r1 = r0.f62183c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62183c = r1
            goto L18
        L13:
            io.ktor.utils.io.j$m r0 = new io.ktor.utils.io.j$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62182b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62183c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f62181a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            y40.c0 r5 = r4.e()
            boolean r5 = r5.J()
            if (r5 == 0) goto L4f
            r0.f62181a = r4
            r0.f62183c = r3
            r5 = 0
            r2 = 0
            java.lang.Object r5 = io.ktor.utils.io.g.b.a(r4, r5, r0, r3, r2)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            y40.c0 r5 = r4.e()
            boolean r5 = r5.J()
            if (r5 != 0) goto L66
            y40.c0 r4 = r4.e()
            byte r4 = r4.readByte()
            java.lang.Byte r4 = l00.a.b(r4)
            return r4
        L66:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r5 = "Not enough data available"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.y(io.ktor.utils.io.g, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006c -> B:10:0x0039). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(@m80.k io.ktor.utils.io.g r6, int r7, @m80.k j00.c<? super byte[]> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.j.n
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.j$n r0 = (io.ktor.utils.io.j.n) r0
            int r1 = r0.f62189f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62189f = r1
            goto L18
        L13:
            io.ktor.utils.io.j$n r0 = new io.ktor.utils.io.j$n
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f62188e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62189f
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            int r6 = r0.f62187d
            java.lang.Object r7 = r0.f62186c
            y40.x r7 = (y40.x) r7
            java.lang.Object r2 = r0.f62185b
            y40.b r2 = (y40.b) r2
            java.lang.Object r4 = r0.f62184a
            io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
            kotlin.e.n(r8)
            r5 = r0
            r0 = r6
            r6 = r4
        L39:
            r4 = r2
            r2 = r5
            goto L70
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L44:
            kotlin.e.n(r8)
            y40.b r8 = new y40.b
            r8.<init>()
            r2 = r8
            r8 = r7
            r7 = r2
        L4f:
            int r4 = jz.h.f(r7)
            if (r4 >= r8) goto L79
            int r4 = jz.h.f(r7)
            int r4 = r8 - r4
            r0.f62184a = r6
            r0.f62185b = r2
            r0.f62186c = r7
            r0.f62187d = r8
            r0.f62189f = r3
            java.lang.Object r4 = E(r6, r4, r0)
            if (r4 != r1) goto L6c
            return r1
        L6c:
            r5 = r0
            r0 = r8
            r8 = r4
            goto L39
        L70:
            y40.c0 r8 = (y40.c0) r8
            jz.h.j(r7, r8)
            r8 = r0
            r0 = r2
            r2 = r4
            goto L4f
        L79:
            byte[] r6 = y40.g0.c(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.j.z(io.ktor.utils.io.g, int, j00.c):java.lang.Object");
    }

    public static /* synthetic */ void n(io.ktor.utils.io.g gVar) {
    }

    public static /* synthetic */ void p(io.ktor.utils.io.m mVar) {
    }
}
