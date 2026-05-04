package io.ktor.network.selector;

import c40.n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInterestSuspensionsMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,79:1\n1#2:80\n11165#3:81\n11500#3,3:82\n37#4,2:85\n*S KotlinDebug\n*F\n+ 1 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n*L\n59#1:81\n59#1:82,3\n71#1:85,2\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f61023a = new e(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final AtomicReferenceFieldUpdater<a, n<g2>>[] f61024b;

    @l
    private volatile n<? super g2> acceptHandlerReference;

    @l
    private volatile n<? super g2> connectHandlerReference;

    @l
    private volatile n<? super g2> readHandlerReference;

    @l
    private volatile n<? super g2> writeHandlerReference;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e {
        public /* synthetic */ e(v vVar) {
            this();
        }

        public final AtomicReferenceFieldUpdater<a, n<g2>> c(SelectInterest selectInterest) {
            return a.f61024b[selectInterest.ordinal()];
        }

        public e() {
        }

        public static /* synthetic */ void b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61029a;

        static {
            int[] iArr = new int[SelectInterest.values().length];
            try {
                iArr[SelectInterest.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectInterest.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectInterest.ACCEPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelectInterest.CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61029a = iArr;
        }
    }

    static {
        h10.c cVar;
        SelectInterest[] a11 = SelectInterest.Companion.a();
        ArrayList arrayList = new ArrayList(a11.length);
        for (SelectInterest selectInterest : a11) {
            int i11 = f.f61029a[selectInterest.ordinal()];
            if (i11 == 1) {
                cVar = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.a.a
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
                    public Object get(Object obj) {
                        return ((a) obj).readHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
                    public void set(Object obj, Object obj2) {
                        ((a) obj).readHandlerReference = (n) obj2;
                    }
                };
            } else if (i11 == 2) {
                cVar = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.a.b
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
                    public Object get(Object obj) {
                        return ((a) obj).writeHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
                    public void set(Object obj, Object obj2) {
                        ((a) obj).writeHandlerReference = (n) obj2;
                    }
                };
            } else if (i11 == 3) {
                cVar = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.a.c
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
                    public Object get(Object obj) {
                        return ((a) obj).acceptHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
                    public void set(Object obj, Object obj2) {
                        ((a) obj).acceptHandlerReference = (n) obj2;
                    }
                };
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new MutablePropertyReference1Impl() { // from class: io.ktor.network.selector.a.d
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
                    public Object get(Object obj) {
                        return ((a) obj).connectHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
                    public void set(Object obj, Object obj2) {
                        ((a) obj).connectHandlerReference = (n) obj2;
                    }
                };
            }
            AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(a.class, n.class, cVar.getName());
            g0.n(newUpdater, "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
            arrayList.add(newUpdater);
        }
        f61024b = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final void j(@k SelectInterest interest, @k n<? super g2> continuation) {
        g0.p(interest, "interest");
        g0.p(continuation, "continuation");
        if (androidx.concurrent.futures.a.a(f61023a.c(interest), this, null, continuation)) {
            return;
        }
        throw new IllegalStateException(("Handler for " + interest.name() + " is already registered").toString());
    }

    public final void k(int i11, @k x00.l<? super n<? super g2>, g2> block) {
        n<g2> m11;
        g0.p(block, "block");
        int[] b11 = SelectInterest.Companion.b();
        int length = b11.length;
        for (int i12 = 0; i12 < length; i12++) {
            if ((b11[i12] & i11) != 0 && (m11 = m(i12)) != null) {
                block.invoke(m11);
            }
        }
    }

    public final void l(@k p<? super n<? super g2>, ? super SelectInterest, g2> block) {
        g0.p(block, "block");
        for (SelectInterest selectInterest : SelectInterest.Companion.a()) {
            n<g2> n11 = n(selectInterest);
            if (n11 != null) {
                block.invoke(n11, selectInterest);
            }
        }
    }

    @l
    public final n<g2> m(int i11) {
        return f61024b[i11].getAndSet(this, null);
    }

    @l
    public final n<g2> n(@k SelectInterest interest) {
        g0.p(interest, "interest");
        return (n) f61023a.c(interest).getAndSet(this, null);
    }

    @k
    public String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
