package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81506a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81507b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<T, Boolean> f81508c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81509a;

        /* renamed from: b, reason: collision with root package name */
        public int f81510b = -1;

        /* renamed from: c, reason: collision with root package name */
        public T f81511c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h<T> f81512d;

        public a(h<T> hVar) {
            this.f81512d = hVar;
            this.f81509a = hVar.f81506a.iterator();
        }

        public final void a() {
            while (this.f81509a.hasNext()) {
                T next = this.f81509a.next();
                if (((Boolean) this.f81512d.f81508c.invoke(next)).booleanValue() == this.f81512d.f81507b) {
                    this.f81511c = next;
                    this.f81510b = 1;
                    return;
                }
            }
            this.f81510b = 0;
        }

        public final Iterator<T> b() {
            return this.f81509a;
        }

        public final T c() {
            return this.f81511c;
        }

        public final int d() {
            return this.f81510b;
        }

        public final void e(T t11) {
            this.f81511c = t11;
        }

        public final void f(int i11) {
            this.f81510b = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f81510b == -1) {
                a();
            }
            return this.f81510b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f81510b == -1) {
                a();
            }
            if (this.f81510b == 0) {
                throw new NoSuchElementException();
            }
            T t11 = this.f81511c;
            this.f81511c = null;
            this.f81510b = -1;
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@m80.k m<? extends T> sequence, boolean z11, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        this.f81506a = sequence;
        this.f81507b = z11;
        this.f81508c = predicate;
    }

    @Override // q30.m
    @m80.k
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ h(m mVar, boolean z11, x00.l lVar, int i11, kotlin.jvm.internal.v vVar) {
        this(mVar, (i11 & 2) != 0 ? true : z11, lVar);
    }
}
