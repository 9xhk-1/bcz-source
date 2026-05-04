package oy;

import c40.h1;
import c40.r0;
import com.baicizhan.client.framework.network.http.HttpRequest;
import g10.o;
import io.ktor.http.RangeUnits;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.q;
import ix.y0;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final byte[] f78499a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f78500b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.plugins.partialcontent.MultipleRangeWriterKt$writeMultipleRangesImpl$1", f = "MultipleRangeWriter.kt", i = {0, 0, 1, 2, 3}, l = {27, 28, 29, 32, 33}, m = "invokeSuspend", n = {"$this$writer", "current", "$this$writer", "$this$writer", "$this$writer"}, s = {"L$0", "L$2", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<m0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f78501a;

        /* renamed from: b, reason: collision with root package name */
        public Object f78502b;

        /* renamed from: c, reason: collision with root package name */
        public int f78503c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f78504d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<o> f78505e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<o, io.ktor.utils.io.g> f78506f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f78507g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f78508h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Long f78509i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<o> list, x00.l<? super o, ? extends io.ktor.utils.io.g> lVar, String str, String str2, Long l11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f78505e = list;
            this.f78506f = lVar;
            this.f78507g = str;
            this.f78508h = str2;
            this.f78509i = l11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f78505e, this.f78506f, this.f78507g, this.f78508h, this.f78509i, cVar);
            aVar.f78504d = obj;
            return aVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m0 m0Var, j00.c<? super g2> cVar) {
            return ((a) create(m0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0122, code lost:
        
            if (io.ktor.utils.io.q.s(r0, r1, 0, 0, r4, 6, null) != r7) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d4 -> B:19:0x006c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        byte[] bytes = "\r\n".getBytes(u30.d.f91604g);
        g0.o(bytes, "getBytes(...)");
        f78499a = bytes;
        y0 y0Var = y0.f63006a;
        f78500b = y0Var.C().length() + 14 + y0Var.B().length();
    }

    public static final int c(o oVar, String str, String str2, Long l11) {
        return str.length() + str2.length() + ix.j.a(oVar, l11, RangeUnits.Bytes).length() + f78500b;
    }

    public static final long d(@m80.k List<o> ranges, @m80.l Long l11, @m80.k String boundary, @m80.k String contentType) {
        g0.p(ranges, "ranges");
        g0.p(boundary, "boundary");
        g0.p(contentType, "contentType");
        long j11 = 0;
        for (o oVar : ranges) {
            j11 += ((c(oVar, boundary, contentType, l11) + oVar.f()) - oVar.d()) + 3;
        }
        return j11 + boundary.length() + 6;
    }

    public static final Object e(io.ktor.utils.io.m mVar, o oVar, String str, String str2, Long l11, j00.c<? super g2> cVar) {
        String a11 = ix.j.a(oVar, l11, RangeUnits.Bytes);
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + a11.length() + f78500b);
        sb2.append(HttpRequest.f17578o);
        sb2.append(str);
        sb2.append("\r\n");
        y0 y0Var = y0.f63006a;
        sb2.append(y0Var.C());
        sb2.append(": ");
        sb2.append(str2);
        sb2.append("\r\n");
        sb2.append(y0Var.B());
        sb2.append(": ");
        sb2.append(a11);
        sb2.append("\r\n");
        sb2.append("\r\n");
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        byte[] bytes = sb3.getBytes(u30.d.f91604g);
        g0.o(bytes, "getBytes(...)");
        Object s11 = q.s(mVar, bytes, 0, 0, cVar, 6, null);
        return s11 == kotlin.coroutines.intrinsics.b.l() ? s11 : g2.f100423a;
    }

    @m80.k
    public static final io.ktor.utils.io.g f(@m80.k r0 r0Var, @m80.k x00.l<? super o, ? extends io.ktor.utils.io.g> channelProducer, @m80.k List<o> ranges, @m80.l Long l11, @m80.k String boundary, @m80.k String contentType) {
        g0.p(r0Var, "<this>");
        g0.p(channelProducer, "channelProducer");
        g0.p(ranges, "ranges");
        g0.p(boundary, "boundary");
        g0.p(contentType, "contentType");
        return q.C(r0Var, h1.g(), true, new a(ranges, channelProducer, boundary, contentType, l11, null)).b();
    }
}
