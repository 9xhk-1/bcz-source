package tv;

import javax.inject.Provider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a<T> implements t<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Provider f90979a;

        public a(final Provider val$provider) {
            this.f90979a = val$provider;
        }

        @Override // javax.inject.Provider, vz.c
        public T get() {
            return (T) this.f90979a.get();
        }
    }

    public static <T> t<T> a(final Provider<T> provider) {
        s.b(provider);
        return provider instanceof t ? (t) provider : new a(provider);
    }
}
