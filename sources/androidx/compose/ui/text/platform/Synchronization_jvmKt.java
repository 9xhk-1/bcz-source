package androidx.compose.ui.text.platform;

import kotlin.jvm.internal.d0;
import m80.k;
import m80.l;
import w00.j;
import x00.a;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "Synchronization_jvmKt")
/* loaded from: classes2.dex */
public final class Synchronization_jvmKt {
    @k
    public static final SynchronizedObject makeSynchronizedObject(@l Object obj) {
        return new SynchronizedObject();
    }

    public static /* synthetic */ SynchronizedObject makeSynchronizedObject$default(Object obj, int i11, Object obj2) {
        return new SynchronizedObject();
    }

    @v0
    /* renamed from: synchronized, reason: not valid java name */
    public static final <R> R m4828synchronized(@k SynchronizedObject synchronizedObject, @k a<? extends R> aVar) {
        R invoke;
        synchronized (synchronizedObject) {
            try {
                invoke = aVar.invoke();
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        return invoke;
    }
}
