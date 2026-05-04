package p40;

import c40.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nExceptionCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionCollector.kt\nkotlinx/coroutines/test/internal/ExceptionCollector\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n29#2:98\n29#2:102\n29#2:104\n16#3:99\n16#3:103\n16#3:105\n1863#4,2:100\n*S KotlinDebug\n*F\n+ 1 ExceptionCollector.kt\nkotlinx/coroutines/test/internal/ExceptionCollector\n*L\n29#1:98\n41#1:102\n54#1:104\n29#1:99\n41#1:103\n54#1:105\n34#1:100,2\n*E\n"})
/* loaded from: classes8.dex */
public final class a extends kotlin.coroutines.a implements n0 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f78905c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f78903a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Object f78904b = new Object();

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<Throwable> f78906d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Map<Object, l<Throwable, g2>> f78907e = new LinkedHashMap();

    public a() {
        super(n0.f7891d0);
    }

    private final boolean H(Throwable th2) {
        Iterator<l<Throwable, g2>> it = f78907e.values().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            it.next().invoke(th2);
            z11 = true;
        }
        return z11;
    }

    public final void E(@k Object obj) {
        synchronized (f78904b) {
            try {
                if (f78905c && f78907e.remove(obj) == null) {
                    throw new IllegalStateException("Check failed.");
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof a) || (obj instanceof b);
    }

    @Override // c40.n0
    public void handleException(@k kotlin.coroutines.d dVar, @k Throwable th2) {
        if (w(th2)) {
            throw ExceptionSuccessfullyProcessed.INSTANCE;
        }
    }

    public final void q(@k Object obj, @k l<? super Throwable, g2> lVar) {
        synchronized (f78904b) {
            try {
                f78905c = true;
                if (f78907e.put(obj, lVar) != null) {
                    throw new IllegalStateException("Check failed.");
                }
                Iterator<T> it = f78906d.iterator();
                while (it.hasNext()) {
                    f78903a.H((Throwable) it.next());
                }
                f78906d.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean w(@k Throwable th2) {
        synchronized (f78904b) {
            if (!f78905c) {
                return false;
            }
            if (f78903a.H(th2)) {
                return true;
            }
            f78906d.add(th2);
            return false;
        }
    }
}
