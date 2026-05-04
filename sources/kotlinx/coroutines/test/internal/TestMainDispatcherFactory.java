package kotlinx.coroutines.test.internal;

import c40.m0;
import c40.v2;
import h40.h0;
import h40.j0;
import h40.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;
import m80.k;
import m80.l;
import p40.h;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestMainDispatcherJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n774#2:54\n865#2,2:55\n1971#2,14:57\n*S KotlinDebug\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n*L\n9#1:54\n9#1:55,2\n10#1:57,14\n*E\n"})
/* loaded from: classes8.dex */
public final class TestMainDispatcherFactory implements h0 {
    public static final m0 f(h0 h0Var, List list, TestMainDispatcherFactory testMainDispatcherFactory) {
        Object m6308constructorimpl;
        try {
            v2 f11 = j0.f(h0Var, list);
            if (!j0.d(f11)) {
                return f11;
            }
            try {
                Result.a aVar = Result.Companion;
                f11.dispatch(f11, new Runnable() { // from class: p40.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        TestMainDispatcherFactory.g();
                    }
                });
                m6308constructorimpl = Result.m6308constructorimpl(g2.f100423a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
            }
            h.c(Result.m6311exceptionOrNullimpl(m6308constructorimpl));
            throw new KotlinNothingValueException();
        } catch (Throwable th3) {
            h.c(th3);
            throw new KotlinNothingValueException();
        }
    }

    @Override // h40.h0
    public int a() {
        return Integer.MAX_VALUE;
    }

    @Override // h40.h0
    @l
    public String b() {
        return h0.a.a(this);
    }

    @Override // h40.h0
    @k
    public v2 c(@k List<? extends h0> list) {
        Object obj;
        final ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((h0) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int a11 = ((h0) next).a();
                do {
                    Object next2 = it.next();
                    int a12 = ((h0) next2).a();
                    if (a11 < a12) {
                        next = next2;
                        a11 = a12;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        final h0 h0Var = (h0) obj;
        if (h0Var == null) {
            h0Var = l0.f58244a;
        }
        return new p40.e((a<? extends m0>) new a() { // from class: p40.g
            @Override // x00.a
            public final Object invoke() {
                m0 f11;
                f11 = TestMainDispatcherFactory.f(h0.this, arrayList, this);
                return f11;
            }
        });
    }

    public static final void g() {
    }
}
