package l8;

import com.baicizhan.biz.online.structs.BELogicException;
import com.baicizhan.biz.online.structs.BESystemException;
import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import ws.i;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c extends com.microsoft.thrifty.service.b implements l8.b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<g2> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k xs.e<g2> callback) {
            super("cancel_pi", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        public /* bridge */ /* synthetic */ g2 receive(i iVar, ws.h hVar) {
            receive2(iVar, hVar);
            return g2.f100423a;
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }

        /* renamed from: receive, reason: avoid collision after fix types in other method */
        public void receive2(@k i protocol, @k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 12) {
                        bELogicException = BELogicException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    bESystemException = BESystemException.ADAPTER.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends xs.d<l8.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k xs.e<l8.a> callback) {
            super("get_vocab_init_info", (byte) 1, callback);
            g0.p(callback, "callback");
        }

        @Override // xs.d
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l8.a receive(@k i protocol, @k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            l8.a aVar = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    aVar = l8.a.f70730d.read(protocol);
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (aVar != null) {
                return aVar;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l8.c$c, reason: collision with other inner class name */
    public static final class C0848c extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f70735a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70736b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f70737c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f70738d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0848c(int i11, int i12, @k String test_vocab_info, @k String test_vocab_count_range, @k xs.e<Integer> callback) {
            super("save_vocab_info", (byte) 1, callback);
            g0.p(test_vocab_info, "test_vocab_info");
            g0.p(test_vocab_count_range, "test_vocab_count_range");
            g0.p(callback, "callback");
            this.f70735a = i11;
            this.f70736b = i12;
            this.f70737c = test_vocab_info;
            this.f70738d = test_vocab_count_range;
        }

        @Override // xs.d
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@k i protocol, @k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("count", 1, (byte) 8);
            protocol.l5(this.f70735a);
            protocol.N2();
            protocol.Q6("steps", 2, (byte) 8);
            protocol.l5(this.f70736b);
            protocol.N2();
            protocol.Q6("test_vocab_info", 3, (byte) 11);
            protocol.p1(this.f70737c);
            protocol.N2();
            protocol.Q6("test_vocab_count_range", 4, (byte) 11);
            protocol.p1(this.f70738d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final int f70739a;

        /* renamed from: b, reason: collision with root package name */
        public final int f70740b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f70741c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f70742d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f70743e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, int i12, @k String test_vocab_info, @k String test_vocab_count_range, boolean z11, @k xs.e<Integer> callback) {
            super("save_vocab_info_v2", (byte) 1, callback);
            g0.p(test_vocab_info, "test_vocab_info");
            g0.p(test_vocab_count_range, "test_vocab_count_range");
            g0.p(callback, "callback");
            this.f70739a = i11;
            this.f70740b = i12;
            this.f70741c = test_vocab_info;
            this.f70742d = test_vocab_count_range;
            this.f70743e = z11;
        }

        @Override // xs.d
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@k i protocol, @k ws.h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            BESystemException bESystemException = null;
            BELogicException bELogicException = null;
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                short s11 = a62.f96797c;
                if (s11 != 0) {
                    if (s11 != 1) {
                        if (s11 != 2) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 12) {
                            bELogicException = BELogicException.ADAPTER.read(protocol);
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        bESystemException = BESystemException.ADAPTER.read(protocol);
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (bESystemException != null) {
                throw bESystemException;
            }
            if (bELogicException != null) {
                throw bELogicException;
            }
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("count", 1, (byte) 8);
            protocol.l5(this.f70739a);
            protocol.N2();
            protocol.Q6("steps", 2, (byte) 8);
            protocol.l5(this.f70740b);
            protocol.N2();
            protocol.Q6("test_vocab_info", 3, (byte) 11);
            protocol.p1(this.f70741c);
            protocol.N2();
            protocol.Q6("test_vocab_count_range", 4, (byte) 11);
            protocol.p1(this.f70742d);
            protocol.N2();
            protocol.Q6("isValid", 5, (byte) 2);
            protocol.a4(this.f70743e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements xs.e<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<g2> f70744a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(j00.c<? super g2> cVar) {
            this.f70744a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@k g2 result) {
            g0.p(result, "result");
            j00.c<g2> cVar = this.f70744a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<g2> cVar = this.f70744a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements xs.e<l8.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<l8.a> f70745a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(j00.c<? super l8.a> cVar) {
            this.f70745a = cVar;
        }

        @Override // xs.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(@k l8.a result) {
            g0.p(result, "result");
            j00.c<l8.a> cVar = this.f70745a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(result));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<l8.a> cVar = this.f70745a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f70746a;

        /* JADX WARN: Multi-variable type inference failed */
        public g(j00.c<? super Integer> cVar) {
            this.f70746a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f70746a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f70746a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements xs.e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f70747a;

        /* JADX WARN: Multi-variable type inference failed */
        public h(j00.c<? super Integer> cVar) {
            this.f70747a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f70747a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f70747a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@k i protocol, @k a.InterfaceC0480a listener) {
        super(protocol, listener);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
    }

    @Override // l8.b
    @l
    public Object H0(@k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(new e(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // l8.b
    @l
    public Object J7(int i11, int i12, @k String str, @k String str2, boolean z11, @k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new d(i11, i12, str, str2, z11, new h(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // l8.b
    @l
    public Object l7(@k j00.c<? super l8.a> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new b(new f(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    @Override // l8.b
    @l
    public Object n6(int i11, int i12, @k String str, @k String str2, @k j00.c<? super Integer> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C0848c(i11, i12, str, str2, new g(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }
}
