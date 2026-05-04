package h40;

import com.google.common.util.concurrent.s2;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f58191a = 16;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x0 f58192b = new x0("CLOSED");

    public static final /* synthetic */ boolean b(AtomicIntegerArray atomicIntegerArray, int i11, int i12, x00.l<? super Integer, Boolean> lVar) {
        int i13;
        do {
            i13 = atomicIntegerArray.get(i11);
            if (!lVar.invoke(Integer.valueOf(i13)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i11, i13, i13 + i12));
        return true;
    }

    public static final /* synthetic */ boolean c(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, int i11, x00.l<? super Integer, Boolean> lVar) {
        int i12;
        do {
            i12 = atomicIntegerFieldUpdater.get(obj);
            if (!lVar.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i12, i12 + i11));
        return true;
    }

    public static final /* synthetic */ boolean d(AtomicInteger atomicInteger, int i11, x00.l<? super Integer, Boolean> lVar) {
        int i12;
        do {
            i12 = atomicInteger.get();
            if (!lVar.invoke(Integer.valueOf(i12)).booleanValue()) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i12, i12 + i11));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [h40.f] */
    @m80.k
    public static final <N extends f<N>> N e(@m80.k N n11) {
        while (true) {
            Object g11 = n11.g();
            if (g11 == f58192b) {
                return n11;
            }
            ?? r02 = (f) g11;
            if (r02 != 0) {
                n11 = r02;
            } else if (n11.o()) {
                return n11;
            }
        }
    }

    public static final /* synthetic */ <S extends u0<S>> Object f(AtomicReferenceArray atomicReferenceArray, int i11, long j11, S s11, x00.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object i12 = i(s11, j11, pVar);
            if (v0.h(i12)) {
                return i12;
            }
            u0 f11 = v0.f(i12);
            while (true) {
                u0 u0Var = (u0) atomicReferenceArray.get(i11);
                if (u0Var.f58276c >= f11.f58276c) {
                    return i12;
                }
                if (!f11.C()) {
                    break;
                }
                if (s2.a(atomicReferenceArray, i11, u0Var, f11)) {
                    if (u0Var.v()) {
                        u0Var.q();
                    }
                    return i12;
                }
                if (f11.v()) {
                    f11.q();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends u0<S>> Object g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, long j11, S s11, x00.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object i11 = i(s11, j11, pVar);
            if (v0.h(i11)) {
                return i11;
            }
            u0 f11 = v0.f(i11);
            while (true) {
                u0 u0Var = (u0) atomicReferenceFieldUpdater.get(obj);
                if (u0Var.f58276c >= f11.f58276c) {
                    return i11;
                }
                if (!f11.C()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, u0Var, f11)) {
                    if (u0Var.v()) {
                        u0Var.q();
                    }
                    return i11;
                }
                if (f11.v()) {
                    f11.q();
                }
            }
        }
    }

    public static final /* synthetic */ <S extends u0<S>> Object h(AtomicReference atomicReference, long j11, S s11, x00.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            Object i11 = i(s11, j11, pVar);
            if (v0.h(i11)) {
                return i11;
            }
            u0 f11 = v0.f(i11);
            while (true) {
                u0 u0Var = (u0) atomicReference.get();
                if (u0Var.f58276c >= f11.f58276c) {
                    return i11;
                }
                if (!f11.C()) {
                    break;
                }
                if (androidx.camera.view.q.a(atomicReference, u0Var, f11)) {
                    if (u0Var.v()) {
                        u0Var.q();
                    }
                    return i11;
                }
                if (f11.v()) {
                    f11.q();
                }
            }
        }
    }

    @m80.k
    public static final <S extends u0<S>> Object i(@m80.k S s11, long j11, @m80.k x00.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s11.f58276c >= j11 && !s11.m()) {
                return v0.b(s11);
            }
            Object g11 = s11.g();
            if (g11 == f58192b) {
                return v0.b(f58192b);
            }
            S s12 = (S) ((f) g11);
            if (s12 == null) {
                s12 = pVar.invoke(Long.valueOf(s11.f58276c + 1), s11);
                if (s11.t(s12)) {
                    if (s11.m()) {
                        s11.q();
                    }
                }
            }
            s11 = s12;
        }
    }

    public static final /* synthetic */ <S extends u0<S>> boolean m(AtomicReferenceArray atomicReferenceArray, int i11, S s11) {
        while (true) {
            u0 u0Var = (u0) atomicReferenceArray.get(i11);
            if (u0Var.f58276c >= s11.f58276c) {
                return true;
            }
            if (!s11.C()) {
                return false;
            }
            if (s2.a(atomicReferenceArray, i11, u0Var, s11)) {
                if (u0Var.v()) {
                    u0Var.q();
                }
                return true;
            }
            if (s11.v()) {
                s11.q();
            }
        }
    }

    public static final /* synthetic */ <S extends u0<S>> boolean n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, S s11) {
        while (true) {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(obj);
            if (u0Var.f58276c >= s11.f58276c) {
                return true;
            }
            if (!s11.C()) {
                return false;
            }
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, obj, u0Var, s11)) {
                if (u0Var.v()) {
                    u0Var.q();
                }
                return true;
            }
            if (s11.v()) {
                s11.q();
            }
        }
    }

    public static final /* synthetic */ <S extends u0<S>> boolean o(AtomicReference atomicReference, S s11) {
        while (true) {
            u0 u0Var = (u0) atomicReference.get();
            if (u0Var.f58276c >= s11.f58276c) {
                return true;
            }
            if (!s11.C()) {
                return false;
            }
            if (androidx.camera.view.q.a(atomicReference, u0Var, s11)) {
                if (u0Var.v()) {
                    u0Var.q();
                }
                return true;
            }
            if (s11.v()) {
                s11.q();
            }
        }
    }
}
