package h40;

import c40.g2;
import h40.l1;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@g2
@kotlin.jvm.internal.u0({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n29#2:160\n29#2:162\n29#2:164\n29#2:166\n29#2:168\n29#2:170\n29#2:172\n16#3:161\n16#3:163\n16#3:165\n16#3:167\n16#3:169\n16#3:171\n16#3:173\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160\n41#1:162\n43#1:164\n51#1:166\n60#1:168\n63#1:170\n72#1:172\n33#1:161\n41#1:163\n43#1:165\n51#1:167\n60#1:169\n63#1:171\n72#1:173\n*E\n"})
/* loaded from: classes8.dex */
public class k1<T extends l1 & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f58237b = AtomicIntegerFieldUpdater.newUpdater(k1.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public T[] f58238a;

    @yz.v0
    public final void a(@m80.k T t11) {
        t11.b(this);
        T[] k11 = k();
        int f11 = f();
        p(f11 + 1);
        k11[f11] = t11;
        t11.setIndex(f11);
        s(f11);
    }

    public final void b(@m80.k T t11) {
        synchronized (this) {
            a(t11);
            yz.g2 g2Var = yz.g2.f100423a;
        }
    }

    public final boolean c(@m80.k T t11, @m80.k x00.l<? super T, Boolean> lVar) {
        boolean z11;
        synchronized (this) {
            try {
                if (lVar.invoke(e()).booleanValue()) {
                    a(t11);
                    z11 = true;
                } else {
                    z11 = false;
                }
                kotlin.jvm.internal.d0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.d0.d(1);
                kotlin.jvm.internal.d0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.d0.c(1);
        return z11;
    }

    @m80.l
    public final T d(@m80.k x00.l<? super T, Boolean> lVar) {
        T t11;
        synchronized (this) {
            try {
                int f11 = f();
                int i11 = 0;
                while (true) {
                    t11 = null;
                    if (i11 >= f11) {
                        break;
                    }
                    T[] tArr = this.f58238a;
                    if (tArr != null) {
                        t11 = (Object) tArr[i11];
                    }
                    kotlin.jvm.internal.g0.m(t11);
                    if (lVar.invoke(t11).booleanValue()) {
                        break;
                    }
                    i11++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    @m80.l
    @yz.v0
    public final T e() {
        T[] tArr = this.f58238a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int f() {
        return f58237b.get(this);
    }

    public final /* synthetic */ int g() {
        return this._size$volatile;
    }

    public final boolean i() {
        return f() == 0;
    }

    @m80.l
    public final T j() {
        T e11;
        synchronized (this) {
            e11 = e();
        }
        return e11;
    }

    public final T[] k() {
        T[] tArr = this.f58238a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new l1[4];
            this.f58238a = tArr2;
            return tArr2;
        }
        if (f() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, f() * 2);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((l1[]) copyOf);
        this.f58238a = tArr3;
        return tArr3;
    }

    public final boolean l(@m80.k T t11) {
        boolean z11;
        synchronized (this) {
            if (t11.a() == null) {
                z11 = false;
            } else {
                m(t11.getIndex());
                z11 = true;
            }
        }
        return z11;
    }

    @yz.v0
    @m80.k
    public final T m(int i11) {
        T[] tArr = this.f58238a;
        kotlin.jvm.internal.g0.m(tArr);
        p(f() - 1);
        if (i11 < f()) {
            t(i11, f());
            int i12 = (i11 - 1) / 2;
            if (i11 > 0) {
                T t11 = tArr[i11];
                kotlin.jvm.internal.g0.m(t11);
                T t12 = tArr[i12];
                kotlin.jvm.internal.g0.m(t12);
                if (((Comparable) t11).compareTo(t12) < 0) {
                    t(i11, i12);
                    s(i12);
                }
            }
            r(i11);
        }
        T t13 = tArr[f()];
        kotlin.jvm.internal.g0.m(t13);
        t13.b(null);
        t13.setIndex(-1);
        tArr[f()] = null;
        return t13;
    }

    @m80.l
    public final T n(@m80.k x00.l<? super T, Boolean> lVar) {
        synchronized (this) {
            try {
                T e11 = e();
                if (e11 == null) {
                    kotlin.jvm.internal.d0.d(2);
                    kotlin.jvm.internal.d0.c(2);
                    return null;
                }
                T m11 = lVar.invoke(e11).booleanValue() ? m(0) : null;
                kotlin.jvm.internal.d0.d(1);
                kotlin.jvm.internal.d0.c(1);
                return m11;
            } catch (Throwable th2) {
                kotlin.jvm.internal.d0.d(1);
                kotlin.jvm.internal.d0.c(1);
                throw th2;
            }
        }
    }

    @m80.l
    public final T o() {
        T m11;
        synchronized (this) {
            m11 = f() > 0 ? m(0) : null;
        }
        return m11;
    }

    public final void p(int i11) {
        f58237b.set(this, i11);
    }

    public final /* synthetic */ void q(int i11) {
        this._size$volatile = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.f()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            T extends h40.l1 & java.lang.Comparable<? super T>[] r2 = r5.f58238a
            kotlin.jvm.internal.g0.m(r2)
            int r0 = r0 + 2
            int r3 = r5.f()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.g0.m(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.g0.m(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.g0.m(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.g0.m(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.t(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: h40.k1.r(int):void");
    }

    public final void s(int i11) {
        while (i11 > 0) {
            T[] tArr = this.f58238a;
            kotlin.jvm.internal.g0.m(tArr);
            int i12 = (i11 - 1) / 2;
            T t11 = tArr[i12];
            kotlin.jvm.internal.g0.m(t11);
            T t12 = tArr[i11];
            kotlin.jvm.internal.g0.m(t12);
            if (((Comparable) t11).compareTo(t12) <= 0) {
                return;
            }
            t(i11, i12);
            i11 = i12;
        }
    }

    public final void t(int i11, int i12) {
        T[] tArr = this.f58238a;
        kotlin.jvm.internal.g0.m(tArr);
        T t11 = tArr[i12];
        kotlin.jvm.internal.g0.m(t11);
        T t12 = tArr[i11];
        kotlin.jvm.internal.g0.m(t12);
        tArr[i11] = t11;
        tArr[i12] = t12;
        t11.setIndex(i11);
        t12.setIndex(i12);
    }
}
