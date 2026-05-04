package q30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c<T, K> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81491a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<T, K> f81492b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@m80.k m<? extends T> source, @m80.k x00.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(keySelector, "keySelector");
        this.f81491a = source;
        this.f81492b = keySelector;
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new b(this.f81491a.iterator(), this.f81492b);
    }
}
