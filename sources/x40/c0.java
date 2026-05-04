package x40;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements f50.i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final h50.f f97417a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f97418b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s40.e0<T> f97419c;

        public a(String str, s40.e0<T> e0Var) {
            this.f97418b = str;
            this.f97419c = e0Var;
            this.f97417a = h50.l.c(str, e.i.f58519a);
        }

        @Override // f50.i, f50.b0, f50.e
        public h50.f a() {
            return this.f97417a;
        }

        @Override // f50.b0
        public void b(i50.h encoder, T t11) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            encoder.encodeString(this.f97419c.c(t11));
        }

        @Override // f50.e
        public T e(i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return this.f97419c.d(decoder.decodeString());
        }

        public String toString() {
            return this.f97418b;
        }
    }

    @m80.k
    public static final <T> f50.i<T> a(@m80.k s40.e0<T> e0Var, @m80.k String serialName) {
        kotlin.jvm.internal.g0.p(e0Var, "<this>");
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        return new a(serialName, e0Var);
    }
}
