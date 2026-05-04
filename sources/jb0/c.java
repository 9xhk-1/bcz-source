package jb0;

import a00.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.koin.core.logger.Level;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKoinPlatformTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinPlatformTools.kt\norg/koin/mp/KoinPlatformTools\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,39:1\n5298#2,7:40\n*S KotlinDebug\n*F\n+ 1 KoinPlatformTools.kt\norg/koin/mp/KoinPlatformTools\n*L\n30#1:40,7\n*E\n"})
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f64013a = new c();

    public static /* synthetic */ ua0.b d(c cVar, Level level, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            level = Level.INFO;
        }
        return cVar.c(level);
    }

    @k
    public final qa0.c a() {
        return qa0.b.f82022a;
    }

    @k
    public final LazyThreadSafetyMode b() {
        return LazyThreadSafetyMode.SYNCHRONIZED;
    }

    @k
    public final ua0.b c(@k Level level) {
        g0.p(level, "level");
        return new ua0.d(level);
    }

    @l
    public final String e(@k h10.d<?> kClass) {
        g0.p(kClass, "kClass");
        return kClass.x();
    }

    @k
    public final String f(@k h10.d<?> kClass) {
        g0.p(kClass, "kClass");
        String name = w00.b.d(kClass).getName();
        g0.o(name, "getName(...)");
        return name;
    }

    @k
    public final String g(@k Exception e11) {
        g0.p(e11, "e");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e11);
        sb2.append(ta0.b.f90407c);
        StackTraceElement[] stackTrace = e11.getStackTrace();
        g0.o(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            g0.o(className, "getClassName(...)");
            if (k0.n3(className, "sun.reflect", false, 2, null)) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb2.append(r0.r3(arrayList, ta0.b.f90407c, null, null, 0, null, null, 62, null));
        return sb2.toString();
    }

    @k
    public final <K, V> Map<K, V> h() {
        return new ConcurrentHashMap();
    }

    @k
    public final <K> Set<K> i() {
        Set<K> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        g0.o(newSetFromMap, "newSetFromMap(...)");
        return newSetFromMap;
    }

    public final <R> R j(@k Object lock, @k x00.a<? extends R> block) {
        R invoke;
        g0.p(lock, "lock");
        g0.p(block, "block");
        synchronized (lock) {
            invoke = block.invoke();
        }
        return invoke;
    }
}
