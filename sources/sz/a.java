package sz;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import io.ktor.utils.io.b0;
import io.ktor.websocket.j0;
import j00.c;
import java.nio.charset.Charset;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebsocketChannelSerialization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebsocketChannelSerialization.kt\nio/ktor/websocket/serialization/WebsocketChannelSerializationKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,125:1\n58#2,16:126\n58#2,16:142\n*S KotlinDebug\n*F\n+ 1 WebsocketChannelSerialization.kt\nio/ktor/websocket/serialization/WebsocketChannelSerializationKt\n*L\n30#1:126,16\n75#1:142,16\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0, 0, 0, 1, 1}, l = {96, 105}, m = "receiveDeserializedBase", n = {"typeInfo", "converter", "charset", "typeInfo", TypedValues.AttributesType.S_FRAME}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: sz.a$a, reason: collision with other inner class name */
    public static final class C1167a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89052a;

        /* renamed from: b, reason: collision with root package name */
        public Object f89053b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89054c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f89055d;

        /* renamed from: e, reason: collision with root package name */
        public int f89056e;

        public C1167a(c<? super C1167a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f89055d = obj;
            this.f89056e |= Integer.MIN_VALUE;
            return a.a(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", i = {0}, l = {51, 56}, m = "sendSerializedBase", n = {"$this$sendSerializedBase"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f89057a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f89058b;

        /* renamed from: c, reason: collision with root package name */
        public int f89059c;

        public b(c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f89058b = obj;
            this.f89059c |= Integer.MIN_VALUE;
            return a.c(null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
    
        if (r0 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @m80.l
    @io.ktor.utils.io.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k io.ktor.websocket.j0 r16, @m80.k gz.a r17, @m80.k io.ktor.serialization.d r18, @m80.k java.nio.charset.Charset r19, @m80.k j00.c<java.lang.Object> r20) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.a.a(io.ktor.websocket.j0, gz.a, io.ktor.serialization.d, java.nio.charset.Charset, j00.c):java.lang.Object");
    }

    @b0
    public static final /* synthetic */ <T> Object b(j0 j0Var, io.ktor.serialization.d dVar, Charset charset, c<Object> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object a11 = a(j0Var, aVar, dVar, charset, cVar);
        d0.e(1);
        return a11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r5.b((io.ktor.websocket.d) r10, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    @io.ktor.utils.io.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(@m80.k io.ktor.websocket.j0 r5, @m80.l java.lang.Object r6, @m80.k gz.a r7, @m80.k io.ktor.serialization.d r8, @m80.k java.nio.charset.Charset r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            boolean r0 = r10 instanceof sz.a.b
            if (r0 == 0) goto L13
            r0 = r10
            sz.a$b r0 = (sz.a.b) r0
            int r1 = r0.f89059c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89059c = r1
            goto L18
        L13:
            sz.a$b r0 = new sz.a$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f89058b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f89059c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r10)
            goto L5c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f89057a
            io.ktor.websocket.j0 r5 = (io.ktor.websocket.j0) r5
            kotlin.e.n(r10)
            goto L4a
        L3c:
            kotlin.e.n(r10)
            r0.f89057a = r5
            r0.f89059c = r4
            java.lang.Object r10 = r8.a(r9, r7, r6, r0)
            if (r10 != r1) goto L4a
            goto L5b
        L4a:
            io.ktor.websocket.d r10 = (io.ktor.websocket.d) r10
            e40.l0 r5 = r5.q()
            r6 = 0
            r0.f89057a = r6
            r0.f89059c = r3
            java.lang.Object r5 = r5.b(r10, r0)
            if (r5 != r1) goto L5c
        L5b:
            return r1
        L5c:
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.a.c(io.ktor.websocket.j0, java.lang.Object, gz.a, io.ktor.serialization.d, java.nio.charset.Charset, j00.c):java.lang.Object");
    }

    @b0
    public static final /* synthetic */ <T> Object d(j0 j0Var, Object obj, io.ktor.serialization.d dVar, Charset charset, c<? super g2> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        c(j0Var, obj, aVar, dVar, charset, cVar);
        d0.e(1);
        return g2.f100423a;
    }
}
