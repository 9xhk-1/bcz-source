package h40;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1790#2,6:211\n12567#2,2:221\n1682#2,6:223\n12567#2,2:229\n1682#2,6:232\n37#3:217\n36#3,3:218\n1#4:231\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n39#1:211,6\n127#1:221,2\n137#1:223,6\n169#1:229,2\n190#1:232,6\n102#1:217\n102#1:218,3\n*E\n"})
/* loaded from: classes8.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f58279a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f58280b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final StackTraceElement f58281c = new b.a().a();

    /* renamed from: d, reason: collision with root package name */
    public static final String f58282d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f58283e;

    static {
        Object m6308constructorimpl;
        Object m6308constructorimpl2;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl) != null) {
            m6308constructorimpl = f58279a;
        }
        f58282d = (String) m6308constructorimpl;
        try {
            Result.a aVar3 = Result.Companion;
            m6308constructorimpl2 = Result.m6308constructorimpl(w0.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.a aVar4 = Result.Companion;
            m6308constructorimpl2 = Result.m6308constructorimpl(kotlin.e.a(th3));
        }
        if (Result.m6311exceptionOrNullimpl(m6308constructorimpl2) != null) {
            m6308constructorimpl2 = f58280b;
        }
        f58283e = (String) m6308constructorimpl2;
    }

    public static final <E extends Throwable> Pair<E, StackTraceElement[]> b(E e11) {
        Throwable cause = e11.getCause();
        if (cause == null || !kotlin.jvm.internal.g0.g(cause.getClass(), e11.getClass())) {
            return yz.h1.a(e11, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e11.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (h(stackTraceElement)) {
                return yz.h1.a(cause, stackTrace);
            }
        }
        return yz.h1.a(e11, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E c(E e11, E e12, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(f58281c);
        StackTraceElement[] stackTrace = e11.getStackTrace();
        int f11 = f(stackTrace, f58282d);
        int i11 = 0;
        if (f11 == -1) {
            e12.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e12;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + f11];
        for (int i12 = 0; i12 < f11; i12++) {
            stackTraceElementArr[i12] = stackTrace[i12];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i11 + f11] = (StackTraceElement) it.next();
            i11++;
        }
        e12.setStackTrace(stackTraceElementArr);
        return e12;
    }

    public static final ArrayDeque<StackTraceElement> d(l00.c cVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = cVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            cVar = cVar.getCallerFrame();
            if (cVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = cVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    public static final boolean e(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.g0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.g0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.g0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    public static final int f(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (kotlin.jvm.internal.g0.g(str, stackTraceElementArr[i11].getClassName())) {
                return i11;
            }
        }
        return -1;
    }

    public static final void g(@m80.k Throwable th2, @m80.k Throwable th3) {
        th2.initCause(th3);
    }

    public static final boolean h(@m80.k StackTraceElement stackTraceElement) {
        return u30.f0.J2(stackTraceElement.getClassName(), b.b.c(), false, 2, null);
    }

    public static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (h(stackTraceElementArr[i11])) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = i11 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i12 > length2) {
            return;
        }
        while (true) {
            if (e(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i12) {
                return;
            } else {
                length2--;
            }
        }
    }

    public static final <E extends Throwable> E l(E e11, l00.c cVar) {
        Pair b11 = b(e11);
        Throwable th2 = (Throwable) b11.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b11.component2();
        Throwable q11 = s.q(th2);
        if (q11 != null) {
            ArrayDeque<StackTraceElement> d11 = d(cVar);
            if (!d11.isEmpty()) {
                if (th2 != e11) {
                    i(stackTraceElementArr, d11);
                }
                return (E) c(th2, q11, d11);
            }
        }
        return e11;
    }

    public static final <E extends Throwable> E o(E e11) {
        StackTraceElement[] stackTrace = e11.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (kotlin.jvm.internal.g0.g(f58283e, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length2 = i11;
            }
        }
        length2 = -1;
        int i12 = length2 + 1;
        int f11 = f(stackTrace, f58282d);
        int i13 = 0;
        int i14 = (length - length2) - (f11 == -1 ? 0 : length - f11);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i14];
        while (i13 < i14) {
            stackTraceElementArr[i13] = i13 == 0 ? f58281c : stackTrace[(i12 + i13) - 1];
            i13++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    @yz.v0
    @m80.k
    public static final <E extends Throwable> E q(@m80.k E e11) {
        E e12 = (E) e11.getCause();
        if (e12 != null && kotlin.jvm.internal.g0.g(e12.getClass(), e11.getClass())) {
            for (StackTraceElement stackTraceElement : e11.getStackTrace()) {
                if (h(stackTraceElement)) {
                    return e12;
                }
            }
        }
        return e11;
    }

    @m80.k
    public static final <E extends Throwable> E m(@m80.k E e11) {
        return e11;
    }

    @yz.v0
    @m80.k
    public static final <E extends Throwable> E p(@m80.k E e11) {
        return e11;
    }

    @m80.l
    public static final Object j(@m80.k Throwable th2, @m80.k j00.c<?> cVar) {
        throw th2;
    }

    public static final Object k(Throwable th2, j00.c<?> cVar) {
        throw th2;
    }

    @m80.k
    public static final <E extends Throwable> E n(@m80.k E e11, @m80.k j00.c<?> cVar) {
        return e11;
    }
}
