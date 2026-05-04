package f40;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p<T> extends WeakReference<T> {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f50961a;

    public p(T t11, @m80.l ReferenceQueue<T> referenceQueue) {
        super(t11, referenceQueue);
        this.f50961a = t11 != null ? t11.hashCode() : 0;
    }
}
