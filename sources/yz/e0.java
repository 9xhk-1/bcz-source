package yz;

import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UnsafeLazyImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100419a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100419a = iArr;
        }
    }

    @m80.k
    public static final <T> c0<T> a(@m80.l Object obj, @m80.k x00.a<? extends T> initializer) {
        kotlin.jvm.internal.g0.p(initializer, "initializer");
        return new f1(initializer, obj);
    }

    @m80.k
    public static <T> c0<T> b(@m80.k LazyThreadSafetyMode mode, @m80.k x00.a<? extends T> initializer) {
        kotlin.jvm.internal.g0.p(mode, "mode");
        kotlin.jvm.internal.g0.p(initializer, "initializer");
        int i11 = a.f100419a[mode.ordinal()];
        int i12 = 2;
        if (i11 == 1) {
            kotlin.jvm.internal.v vVar = null;
            return new f1(initializer, vVar, i12, vVar);
        }
        if (i11 == 2) {
            return new x0(initializer);
        }
        if (i11 == 3) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public static <T> c0<T> c(@m80.k x00.a<? extends T> initializer) {
        kotlin.jvm.internal.g0.p(initializer, "initializer");
        kotlin.jvm.internal.v vVar = null;
        return new f1(initializer, vVar, 2, vVar);
    }
}
