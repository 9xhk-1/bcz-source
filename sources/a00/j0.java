package a00;

import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j0 extends i0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f1108a;

        public a(Enumeration<T> enumeration) {
            this.f1108a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1108a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f1108a.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @m80.k
    public static <T> Iterator<T> h0(@m80.k Enumeration<T> enumeration) {
        kotlin.jvm.internal.g0.p(enumeration, "<this>");
        return new a(enumeration);
    }
}
