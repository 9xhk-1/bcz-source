package zb0;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface a<T> extends qb0.c<T>, qb0.h {
    a<T> A(T t11);

    a<T> B();

    a<T> F(T... tArr);

    int G();

    a<T> J(long j11);

    a<T> K(Class<? extends Throwable> cls, String str, T... tArr);

    Thread M();

    a<T> N(Class<? extends Throwable> cls);

    a<T> O();

    a<T> P();

    a<T> R();

    List<T> T();

    a<T> W(int i11);

    a<T> X(long j11, TimeUnit timeUnit);

    a<T> Y(Class<? extends Throwable> cls, T... tArr);

    int getValueCount();

    @Override // qb0.h
    boolean isUnsubscribed();

    a<T> l();

    a<T> m(wb0.a aVar);

    a<T> o(T t11, T... tArr);

    void onStart();

    a<T> p(T... tArr);

    a<T> s();

    void setProducer(qb0.d dVar);

    a<T> t();

    List<Throwable> u();

    @Override // qb0.h
    void unsubscribe();

    a<T> v(long j11, TimeUnit timeUnit);

    a<T> w(int i11, long j11, TimeUnit timeUnit);

    a<T> x();

    a<T> y(List<T> list);

    a<T> z(Throwable th2);
}
