package androidx.datastore.core;

import android.os.FileObserver;
import androidx.annotation.CheckResult;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.MulticastFileObserver;
import c40.k1;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.flow.i;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1855#2,2:146\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver\n*L\n50#1:146,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MulticastFileObserver extends FileObserver {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Object LOCK = new Object();

    @k
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();

    @k
    private final CopyOnWriteArrayList<l<String, g2>> delegates;

    @k
    private final String path;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMulticastFileObserver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n372#2,7:146\n1855#3,2:153\n*S KotlinDebug\n*F\n+ 1 MulticastFileObserver.android.kt\nandroidx/datastore/core/MulticastFileObserver$Companion\n*L\n103#1:146,7\n137#1:153,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$4(String str, l observer) {
            g0.p(observer, "$observer");
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Companion companion = MulticastFileObserver.Companion;
                    MulticastFileObserver multicastFileObserver = companion.getFileObservers$datastore_core_release().get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.delegates.remove(observer);
                        if (multicastFileObserver.delegates.isEmpty()) {
                            companion.getFileObservers$datastore_core_release().remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @k
        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core_release() {
            return MulticastFileObserver.fileObservers;
        }

        @CheckResult
        @k
        public final i<g2> observe(@k File file) {
            g0.p(file, "file");
            return kotlinx.coroutines.flow.k.x(new MulticastFileObserver$Companion$observe$1(file, null));
        }

        @VisibleForTesting
        public final void removeAllObservers$datastore_core_release() {
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Iterator<T> it = MulticastFileObserver.Companion.getFileObservers$datastore_core_release().values().iterator();
                    while (it.hasNext()) {
                        ((MulticastFileObserver) it.next()).stopWatching();
                    }
                    MulticastFileObserver.Companion.getFileObservers$datastore_core_release().clear();
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public final k1 observe(File file, final l<? super String, g2> lVar) {
            final String key = file.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Map<String, MulticastFileObserver> fileObservers$datastore_core_release = MulticastFileObserver.Companion.getFileObservers$datastore_core_release();
                    g0.o(key, "key");
                    MulticastFileObserver multicastFileObserver = fileObservers$datastore_core_release.get(key);
                    if (multicastFileObserver == null) {
                        multicastFileObserver = new MulticastFileObserver(key, null);
                        fileObservers$datastore_core_release.put(key, multicastFileObserver);
                    }
                    MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                    multicastFileObserver2.delegates.add(lVar);
                    if (multicastFileObserver2.delegates.size() == 1) {
                        multicastFileObserver2.startWatching();
                    }
                    g2 g2Var = g2.f100423a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new k1() { // from class: androidx.datastore.core.a
                @Override // c40.k1
                public final void dispose() {
                    MulticastFileObserver.Companion.observe$lambda$4(key, lVar);
                }
            };
        }

        @VisibleForTesting
        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, v vVar) {
        this(str);
    }

    @k
    public final String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i11, @m80.l String str) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(str);
        }
    }

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }
}
