package p;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import o00.i;
import p.a;
import x00.l;
import x00.p;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNonFatalCatching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFatalCatching.kt\nat/asitplus/NonFatalCatchingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NonFatal.jvm.kt\nat/asitplus/NonFatal_jvmKt\n*L\n1#1,203:1\n36#1,4:217\n47#1,4:225\n80#1,3:233\n36#1,4:236\n80#1,3:244\n47#1,4:247\n80#1,3:255\n36#1,4:258\n91#1:266\n80#1,3:267\n47#1,4:270\n91#1:278\n80#1,3:279\n105#1:282\n36#1,4:283\n80#1,3:291\n117#1:294\n47#1,4:295\n80#1,3:303\n128#1:306\n36#1,4:307\n91#1:315\n80#1,3:316\n139#1:319\n47#1,4:320\n91#1:328\n80#1,3:329\n153#1:332\n105#1:333\n36#1,4:334\n80#1,3:342\n162#1:345\n117#1:346\n47#1,4:347\n80#1,3:355\n1#2:204\n6#3,4:205\n6#3,4:209\n6#3,4:213\n6#3,4:221\n6#3,4:229\n6#3,4:240\n6#3,4:251\n6#3,4:262\n6#3,4:274\n6#3,4:287\n6#3,4:299\n6#3,4:311\n6#3,4:324\n6#3,4:338\n6#3,4:351\n*S KotlinDebug\n*F\n+ 1 NonFatalCatching.kt\nat/asitplus/NonFatalCatchingKt\n*L\n62#1:217,4\n68#1:225,4\n91#1:233,3\n105#1:236,4\n105#1:244,3\n117#1:247,4\n117#1:255,3\n128#1:258,4\n128#1:266\n128#1:267,3\n139#1:270,4\n139#1:278\n139#1:279,3\n153#1:282\n153#1:283,4\n153#1:291,3\n162#1:294\n162#1:295,4\n162#1:303,3\n173#1:306\n173#1:307,4\n173#1:315\n173#1:316,3\n183#1:319\n183#1:320,4\n183#1:328\n183#1:329,3\n192#1:332\n192#1:333\n192#1:334,4\n192#1:342,3\n201#1:345\n201#1:346\n201#1:347,4\n201#1:355,3\n25#1:205,4\n39#1:209,4\n50#1:213,4\n62#1:221,4\n68#1:229,4\n105#1:240,4\n117#1:251,4\n128#1:262,4\n139#1:274,4\n153#1:287,4\n162#1:299,4\n173#1:311,4\n183#1:324,4\n192#1:338,4\n201#1:351,4\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    @k
    public static final <T, R> a<T> a(R r11, @k l<? super R, ? extends T> block) {
        Object m6308constructorimpl;
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke(r11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        return c0965a.c(m6308constructorimpl);
    }

    @k
    public static final <T> a<T> b(@k x00.a<? extends T> block) {
        Object m6308constructorimpl;
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        return c0965a.c(m6308constructorimpl);
    }

    @i
    public static final /* synthetic */ <E extends Throwable, T, R> a<T> c(R r11, l<? super Throwable, ? extends E> a11, l<? super R, ? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke(r11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return c0965a.c(m6308constructorimpl);
    }

    public static final /* synthetic */ <E extends Throwable, T, R> a<T> d(R r11, p<? super String, ? super Throwable, ? extends E> a11, l<? super R, ? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke(r11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return c0965a.c(m6308constructorimpl);
    }

    @i
    public static final /* synthetic */ <E extends Throwable, T> a<T> e(l<? super Throwable, ? extends E> a11, x00.a<? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return c0965a.c(m6308constructorimpl);
    }

    public static final /* synthetic */ <E extends Throwable, T> a<T> f(p<? super String, ? super Throwable, ? extends E> a11, x00.a<? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return c0965a.c(m6308constructorimpl);
    }

    @k
    public static final <T, R> Object g(T t11, @k l<? super T, ? extends R> block) {
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(block.invoke(t11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            return Result.m6308constructorimpl(e.a(th2));
        }
    }

    @k
    public static final <T> Object h(@k x00.a<? extends T> block) {
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            return Result.m6308constructorimpl(e.a(th2));
        }
    }

    @i
    public static final /* synthetic */ <E extends Throwable, T, R> Object i(R r11, l<? super Throwable, ? extends E> a11, l<? super R, ? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke(r11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return m6308constructorimpl;
    }

    public static final /* synthetic */ <E extends Throwable, T, R> Object j(R r11, p<? super String, ? super Throwable, ? extends E> a11, l<? super R, ? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke(r11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return m6308constructorimpl;
    }

    @i
    public static final /* synthetic */ <E extends Throwable, T> Object k(l<? super Throwable, ? extends E> a11, x00.a<? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return m6308constructorimpl;
    }

    public static final /* synthetic */ <E extends Throwable, T> Object l(p<? super String, ? super Throwable, ? extends E> a11, x00.a<? extends T> block) {
        Object m6308constructorimpl;
        g0.p(a11, "a");
        g0.p(block, "block");
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return m6308constructorimpl;
    }

    @k
    public static final <T> Object m(@k Object obj) {
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(obj);
        if (m6311exceptionOrNullimpl != null) {
            if (m6311exceptionOrNullimpl instanceof VirtualMachineError) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof ThreadDeath) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof InterruptedException) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof LinkageError) {
                throw m6311exceptionOrNullimpl;
            }
            if (m6311exceptionOrNullimpl instanceof CancellationException) {
                throw m6311exceptionOrNullimpl;
            }
        }
        return obj;
    }

    @i
    public static final /* synthetic */ <E extends Throwable, R> Object n(Object obj, l<? super Throwable, ? extends E> a11) {
        g0.p(a11, "a");
        if (Result.m6311exceptionOrNullimpl(obj) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return obj;
    }

    public static final /* synthetic */ <E extends Throwable, T> Object o(Object obj, p<? super String, ? super Throwable, ? extends E> a11) {
        g0.p(a11, "a");
        if (Result.m6311exceptionOrNullimpl(obj) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return obj;
    }

    @n(message = "Function name was misleading", replaceWith = @w0(expression = "catchingAs(asA, block)", imports = {}))
    public static final /* synthetic */ <E extends Throwable, T, R> a<T> p(R r11, p<? super String, ? super Throwable, ? extends E> asA, l<? super R, ? extends T> block) {
        Object m6308constructorimpl;
        g0.p(asA, "asA");
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke(r11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return c0965a.c(m6308constructorimpl);
    }

    @n(message = "Function name was misleading", replaceWith = @w0(expression = "catchingAs(asA, block)", imports = {}))
    public static final /* synthetic */ <E extends Throwable, R> a<R> q(p<? super String, ? super Throwable, ? extends E> asA, x00.a<? extends R> block) {
        Object m6308constructorimpl;
        g0.p(asA, "asA");
        g0.p(block, "block");
        a.C0965a c0965a = a.f78545b;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError) || (th2 instanceof CancellationException)) {
                throw th2;
            }
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            g0.y(3, ExifInterface.LONGITUDE_EAST);
        }
        return c0965a.c(m6308constructorimpl);
    }
}
