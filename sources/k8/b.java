package k8;

import com.microsoft.thrifty.ThriftException;
import com.microsoft.thrifty.service.a;
import j00.g;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import l00.f;
import m80.k;
import m80.l;
import okio.ByteString;
import ws.h;
import ws.i;
import xs.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b extends com.microsoft.thrifty.service.b implements k8.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ByteString f65999a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f66000b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f66001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k ByteString gzip, @k String checkcode, @k String logid, @k e<Integer> callback) {
            super("submit_gzip_json_array", (byte) 1, callback);
            g0.p(gzip, "gzip");
            g0.p(checkcode, "checkcode");
            g0.p(logid, "logid");
            g0.p(callback, "callback");
            this.f65999a = gzip;
            this.f66000b = checkcode;
            this.f66001c = logid;
        }

        @Override // xs.d
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@k i protocol, @k h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                if (a62.f96797c != 0) {
                    at.b.a(protocol, b11);
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("gzip", 1, (byte) 11);
            protocol.z1(this.f65999a);
            protocol.N2();
            protocol.Q6("checkcode", 2, (byte) 11);
            protocol.p1(this.f66000b);
            protocol.N2();
            protocol.Q6("logid", 3, (byte) 11);
            protocol.p1(this.f66001c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: k8.b$b, reason: collision with other inner class name */
    public static final class C0762b extends xs.d<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f66002a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f66003b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f66004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0762b(@k String jsons, @k String checkcode, @k String logid, @k e<Integer> callback) {
            super("submit_text_json_array", (byte) 1, callback);
            g0.p(jsons, "jsons");
            g0.p(checkcode, "checkcode");
            g0.p(logid, "logid");
            g0.p(callback, "callback");
            this.f66002a = jsons;
            this.f66003b = checkcode;
            this.f66004c = logid;
        }

        @Override // xs.d
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer receive(@k i protocol, @k h metadata) throws Exception {
            g0.p(protocol, "protocol");
            g0.p(metadata, "metadata");
            protocol.u0();
            Integer num = null;
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    break;
                }
                if (a62.f96797c != 0) {
                    at.b.a(protocol, b11);
                } else if (b11 == 8) {
                    num = Integer.valueOf(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
            protocol.I4();
            if (num != null) {
                return num;
            }
            throw new ThriftException(ThriftException.Kind.MISSING_RESULT, "Missing result");
        }

        @Override // xs.d
        public void send(@k i protocol) throws IOException {
            g0.p(protocol, "protocol");
            protocol.g6("args");
            protocol.Q6("jsons", 1, (byte) 11);
            protocol.p1(this.f66002a);
            protocol.N2();
            protocol.Q6("checkcode", 2, (byte) 11);
            protocol.p1(this.f66003b);
            protocol.N2();
            protocol.Q6("logid", 3, (byte) 11);
            protocol.p1(this.f66004c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f66005a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(j00.c<? super Integer> cVar) {
            this.f66005a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f66005a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f66005a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements e<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<Integer> f66006a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(j00.c<? super Integer> cVar) {
            this.f66006a = cVar;
        }

        public void a(int i11) {
            j00.c<Integer> cVar = this.f66006a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(Integer.valueOf(i11)));
        }

        @Override // xs.e
        public void onError(@k Throwable error) {
            g0.p(error, "error");
            j00.c<Integer> cVar = this.f66006a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(error)));
        }

        @Override // xs.e
        public /* bridge */ /* synthetic */ void onSuccess(Integer num) {
            a(num.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k i protocol, @k a.InterfaceC0480a listener) {
        super(protocol, listener);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
    }

    @Override // k8.a
    @l
    public Object B7(@k String str, @k String str2, @k String str3, @k j00.c<? super Integer> cVar) {
        g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new C0762b(str, str2, str3, new d(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11;
    }

    @Override // k8.a
    @l
    public Object u8(@k ByteString byteString, @k String str, @k String str2, @k j00.c<? super Integer> cVar) {
        g gVar = new g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        enqueue(new a(byteString, str, str2, new c(gVar)));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return b11;
    }
}
