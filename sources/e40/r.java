package e40;

import e40.s;
import kotlin.DeprecationLevel;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ o a(int i11) {
        return d(i11, null, null, 6, null);
    }

    @m80.k
    public static final <E> o<E> b(int i11, @m80.k BufferOverflow bufferOverflow, @m80.l x00.l<? super E, g2> lVar) {
        if (i11 == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new m(o.f49142n0.a(), lVar) : new c0(1, bufferOverflow, lVar);
        }
        if (i11 != -1) {
            return i11 != 0 ? i11 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new m(i11, lVar) : new c0(i11, bufferOverflow, lVar) : new m(Integer.MAX_VALUE, lVar) : bufferOverflow == BufferOverflow.SUSPEND ? new m(0, lVar) : new c0(1, bufferOverflow, lVar);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new c0(1, BufferOverflow.DROP_OLDEST, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ o c(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return a(i11);
    }

    public static /* synthetic */ o d(int i11, BufferOverflow bufferOverflow, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        return b(i11, bufferOverflow, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@m80.k Object obj, @m80.k x00.l<? super Throwable, ? extends T> lVar) {
        return obj instanceof s.c ? lVar.invoke(s.f(obj)) : obj;
    }

    @m80.k
    public static final <T> Object f(@m80.k Object obj, @m80.k x00.l<? super Throwable, g2> lVar) {
        if (obj instanceof s.a) {
            lVar.invoke(s.f(obj));
        }
        return obj;
    }

    @m80.k
    public static final <T> Object g(@m80.k Object obj, @m80.k x00.l<? super Throwable, g2> lVar) {
        if (obj instanceof s.c) {
            lVar.invoke(s.f(obj));
        }
        return obj;
    }

    @m80.k
    public static final <T> Object h(@m80.k Object obj, @m80.k x00.l<? super T, g2> lVar) {
        if (!(obj instanceof s.c)) {
            lVar.invoke(obj);
        }
        return obj;
    }
}
