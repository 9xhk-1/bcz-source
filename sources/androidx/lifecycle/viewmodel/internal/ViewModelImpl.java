package androidx.lifecycle.viewmodel.internal;

import a00.m0;
import androidx.annotation.MainThread;
import androidx.documentfile.provider.a;
import c40.r0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,136:1\n36#2,2:137\n36#2,2:140\n36#2,2:143\n36#2,2:146\n23#3:139\n23#3:142\n23#3:145\n23#3:148\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n83#1:137,2\n106#1:140,2\n120#1:143,2\n126#1:146,2\n83#1:139\n106#1:142\n120#1:145\n126#1:148\n*E\n"})
/* loaded from: classes2.dex */
public final class ViewModelImpl {

    @k
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;

    @k
    private final Map<String, AutoCloseable> keyToCloseables;

    @k
    private final SynchronizedObject lock;

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithRuntimeException(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                a.a(autoCloseable);
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final void addCloseable(@k String key, @k AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        g0.p(key, "key");
        g0.p(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        closeWithRuntimeException(autoCloseable);
    }

    @MainThread
    public final void clear() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l
    public final <T extends AutoCloseable> T getCloseable(@k String key) {
        T t11;
        g0.p(key, "key");
        synchronized (this.lock) {
            t11 = (T) this.keyToCloseables.get(key);
        }
        return t11;
    }

    public ViewModelImpl(@k r0 viewModelScope) {
        g0.p(viewModelScope, "viewModelScope");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
    }

    public final void addCloseable(@k AutoCloseable closeable) {
        g0.p(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            g2 g2Var = g2.f100423a;
        }
    }

    public ViewModelImpl(@k AutoCloseable... closeables) {
        g0.p(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        m0.u0(linkedHashSet, closeables);
    }

    public ViewModelImpl(@k r0 viewModelScope, @k AutoCloseable... closeables) {
        g0.p(viewModelScope, "viewModelScope");
        g0.p(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
        m0.u0(linkedHashSet, closeables);
    }
}
