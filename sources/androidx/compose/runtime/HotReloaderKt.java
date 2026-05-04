package androidx.compose.runtime;

import a00.i0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.o;
import yz.h1;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHotReloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1603#2,9:119\n1855#2:128\n1856#2:130\n1612#2:131\n1549#2:132\n1620#2,3:133\n1#3:129\n*S KotlinDebug\n*F\n+ 1 HotReloader.kt\nandroidx/compose/runtime/HotReloaderKt\n*L\n97#1:119,9\n97#1:128\n97#1:130\n97#1:131\n112#1:132\n112#1:133,3\n97#1:129\n*E\n"})
/* loaded from: classes.dex */
public final class HotReloaderKt {
    @o
    public static final void clearCompositionErrors() {
        HotReloader.Companion.clearErrors$runtime_release();
    }

    @n(message = "currentCompositionErrors only reports errors that extend from Exception. This method is unsupported outside of Compose runtime tests. Internally, getCurrentCompositionErrors should be used instead.")
    @k
    @o
    public static final List<Pair<Exception, Boolean>> currentCompositionErrors() {
        List<Pair<Throwable, Boolean>> currentCompositionErrors = getCurrentCompositionErrors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = currentCompositionErrors.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Throwable th2 = (Throwable) pair.component1();
            Boolean bool = (Boolean) pair.component2();
            bool.booleanValue();
            Exception exc = th2 instanceof Exception ? (Exception) th2 : null;
            Pair a11 = exc != null ? h1.a(exc, bool) : null;
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    @o
    public static final List<Pair<Throwable, Boolean>> getCurrentCompositionErrors() {
        List<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.Companion.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(i0.d0(currentErrors$runtime_release, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(h1.a(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    @o
    public static final void invalidateGroupsWithKey(int i11) {
        HotReloader.Companion.invalidateGroupsWithKey$runtime_release(i11);
    }

    @o
    public static final void simulateHotReload(@k Object obj) {
        HotReloader.Companion.simulateHotReload$runtime_release(obj);
    }
}
