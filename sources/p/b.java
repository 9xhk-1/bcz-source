package p;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import p.a;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKmmResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KmmResult.kt\nat/asitplus/KmmResultKt\n+ 2 NonFatalCatching.kt\nat/asitplus/NonFatalCatchingKt\n+ 3 NonFatal.jvm.kt\nat/asitplus/NonFatal_jvmKt\n*L\n1#1,267:1\n68#2:268\n47#2,4:269\n6#3,4:273\n*S KotlinDebug\n*F\n+ 1 KmmResult.kt\nat/asitplus/KmmResultKt\n*L\n264#1:268\n264#1:269,4\n264#1:273,4\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <R, T extends R> a<R> a(@k a<? extends T> aVar, @k l<? super Throwable, ? extends R> block) {
        Object m6308constructorimpl;
        g0.p(aVar, "<this>");
        g0.p(block, "block");
        Throwable a11 = aVar.a();
        if (a11 == null) {
            return aVar;
        }
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke(a11));
        } catch (Throwable th2) {
            Result.a aVar3 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        return c0965a.c(m6308constructorimpl);
    }
}
