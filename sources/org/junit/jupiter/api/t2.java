package org.junit.jupiter.api;

import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.8", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface t2<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t2<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f77995a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f77996b;

        public a(final String val$name, final Object val$payload) {
            this.f77995a = val$name;
            this.f77996b = val$payload;
        }

        @Override // org.junit.jupiter.api.t2
        public T a() {
            return (T) this.f77996b;
        }

        @Override // org.junit.jupiter.api.t2
        public String getName() {
            return this.f77995a;
        }

        public String toString() {
            return this.f77995a;
        }
    }

    static <T> t2<T> b(String name, T payload) {
        ba0.c2.k(name, "name must not be null or blank");
        return new a(name, payload);
    }

    static <T> t2<T> c(String name, T payload) {
        return b(name, payload);
    }

    T a();

    String getName();
}
