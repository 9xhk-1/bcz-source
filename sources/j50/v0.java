package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements p0<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f50.i<T> f63481a;

        public a(f50.i<T> iVar) {
            this.f63481a = iVar;
        }

        @Override // f50.i, f50.b0, f50.e
        public h50.f a() {
            throw new IllegalStateException("unsupported");
        }

        @Override // f50.b0
        public void b(i50.h encoder, T t11) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // j50.p0
        public f50.i<?>[] c() {
            return super.c();
        }

        @Override // f50.e
        public T e(i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        public f50.i<?>[] f() {
            return new f50.i[]{this.f63481a};
        }
    }

    @f50.h
    @m80.k
    public static final <T> h50.f a(@m80.k String name, @m80.k f50.i<T> primitiveSerializer) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(primitiveSerializer, "primitiveSerializer");
        return new u0(name, new a(primitiveSerializer));
    }
}
