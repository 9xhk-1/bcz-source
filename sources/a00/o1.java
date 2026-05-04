package a00;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o1<E> extends d<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<E> f1118a;

    /* renamed from: b, reason: collision with root package name */
    public int f1119b;

    /* renamed from: c, reason: collision with root package name */
    public int f1120c;

    /* JADX WARN: Multi-variable type inference failed */
    public o1(@m80.k List<? extends E> list) {
        kotlin.jvm.internal.g0.p(list, "list");
        this.f1118a = list;
    }

    public final void d(int i11, int i12) {
        d.Companion.d(i11, i12, this.f1118a.size());
        this.f1119b = i11;
        this.f1120c = i12 - i11;
    }

    @Override // a00.d, java.util.List
    public E get(int i11) {
        d.Companion.b(i11, this.f1120c);
        return this.f1118a.get(this.f1119b + i11);
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.f1120c;
    }
}
