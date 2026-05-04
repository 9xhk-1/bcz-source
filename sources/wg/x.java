package wg;

import w30.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f96358a;

        /* renamed from: b, reason: collision with root package name */
        public final int f96359b = b.C1273b.f94770b.a().getNanosecondsOfSecond();

        public a(T t11) {
            this.f96358a = t11;
        }

        @Override // wg.w
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a() {
            return Integer.valueOf(this.f96359b);
        }

        @Override // wg.w
        public T getValue() {
            return this.f96358a;
        }
    }

    @m80.k
    public static final <T> w<T> a(T t11) {
        return new a(t11);
    }
}
