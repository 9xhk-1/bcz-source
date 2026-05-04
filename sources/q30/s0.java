package q30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s0<T, R> implements m<R> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m<T> f81629a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.p<Integer, T, R> f81630b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<R>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<T> f81631a;

        /* renamed from: b, reason: collision with root package name */
        public int f81632b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s0<T, R> f81633c;

        public a(s0<T, R> s0Var) {
            this.f81633c = s0Var;
            this.f81631a = s0Var.f81629a.iterator();
        }

        public final int a() {
            return this.f81632b;
        }

        public final Iterator<T> b() {
            return this.f81631a;
        }

        public final void c(int i11) {
            this.f81632b = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81631a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            x00.p pVar = this.f81633c.f81630b;
            int i11 = this.f81632b;
            this.f81632b = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            return (R) pVar.invoke(Integer.valueOf(i11), this.f81631a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(@m80.k m<? extends T> sequence, @m80.k x00.p<? super Integer, ? super T, ? extends R> transformer) {
        kotlin.jvm.internal.g0.p(sequence, "sequence");
        kotlin.jvm.internal.g0.p(transformer, "transformer");
        this.f81629a = sequence;
        this.f81630b = transformer;
    }

    @Override // q30.m
    @m80.k
    public Iterator<R> iterator() {
        return new a(this);
    }
}
