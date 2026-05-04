package f40;

import android.annotation.SuppressLint;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({TtmlNode.COMBINE_ALL})
@IgnoreJRERequirement
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f50894a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f50895b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ClassFileTransformer {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f50896a = new a();

        @m80.l
        public byte[] a(@m80.l ClassLoader classLoader, @m80.k String str, @m80.l Class<?> cls, @m80.k ProtectionDomain protectionDomain, @m80.l byte[] bArr) {
            if (classLoader == null || !g0.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            f40.a.f50892a.b(true);
            return r00.a.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object m6308constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            m6308constructorimpl = Result.m6308constructorimpl(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        Boolean bool = (Boolean) (Result.m6314isFailureimpl(m6308constructorimpl) ? null : m6308constructorimpl);
        f50895b = bool != null ? bool.booleanValue() : m.f50946a.w();
    }

    public static final void c(Signal signal) {
        m mVar = m.f50946a;
        if (mVar.E()) {
            mVar.g(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @w00.o
    public static final void d(@m80.l String str, @m80.k Instrumentation instrumentation) {
        f40.a.f50892a.b(true);
        instrumentation.addTransformer(a.f50896a);
        m mVar = m.f50946a;
        mVar.P(f50895b);
        mVar.C();
        f50894a.b();
    }

    public final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: f40.b
                public final void a(Signal signal) {
                    c.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
