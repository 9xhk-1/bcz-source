package pw;

import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.g1;
import l60.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStreamRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamRequestBody.kt\nio/ktor/client/engine/okhttp/StreamRequestBody\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,37:1\n66#2:38\n52#2,22:39\n*S KotlinDebug\n*F\n+ 1 StreamRequestBody.kt\nio/ktor/client/engine/okhttp/StreamRequestBody\n*L\n23#1:38\n23#1:39,22\n*E\n"})
/* loaded from: classes8.dex */
public final class u extends okhttp3.m {

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Long f81294b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.a<io.ktor.utils.io.g> f81295c;

    /* JADX WARN: Multi-variable type inference failed */
    public u(@m80.l Long l11, @m80.k x00.a<? extends io.ktor.utils.io.g> block) {
        g0.p(block, "block");
        this.f81294b = l11;
        this.f81295c = block;
    }

    @Override // okhttp3.m
    public long a() {
        Long l11 = this.f81294b;
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.m
    @m80.l
    public okhttp3.j b() {
        return null;
    }

    @Override // okhttp3.m
    public boolean q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // okhttp3.m
    public void r(@m80.k l60.l sink) {
        g0.p(sink, "sink");
        try {
            Long th2 = null;
            g1 v11 = r0.v(mz.a.b(this.f81295c.invoke(), null, 1, null));
            try {
                Long valueOf = Long.valueOf(sink.V2(v11));
                if (v11 != null) {
                    try {
                        v11.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                Long l11 = th2;
                th2 = valueOf;
                th = l11;
            } catch (Throwable th4) {
                th = th4;
                if (v11 != null) {
                    try {
                        v11.close();
                    } catch (Throwable th5) {
                        yz.r.a(th, th5);
                    }
                }
            }
            if (th != 0) {
                throw th;
            }
            th2.longValue();
        } catch (IOException e11) {
            throw e11;
        } catch (Throwable th6) {
            throw new StreamAdapterIOException(th6);
        }
    }
}
