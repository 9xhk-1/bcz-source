package xb0;

import java.util.List;
import java.util.concurrent.TimeUnit;
import qb0.d;
import qb0.g;
import zb0.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a<T> extends g<T> implements zb0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final j<T> f97998a;

    public a(j<T> jVar) {
        this.f97998a = jVar;
    }

    public static <T> a<T> q(long j11) {
        j jVar = new j(j11);
        a<T> aVar = new a<>(jVar);
        aVar.add(jVar);
        return aVar;
    }

    @Override // zb0.a
    public zb0.a<T> A(T t11) {
        this.f97998a.Z(t11);
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> B() {
        this.f97998a.V();
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> F(T... tArr) {
        this.f97998a.b0(tArr);
        return this;
    }

    @Override // zb0.a
    public final int G() {
        return this.f97998a.G();
    }

    @Override // zb0.a
    public zb0.a<T> J(long j11) {
        this.f97998a.o0(j11);
        return this;
    }

    @Override // zb0.a
    public final zb0.a<T> K(Class<? extends Throwable> cls, String str, T... tArr) {
        this.f97998a.b0(tArr);
        this.f97998a.C(cls);
        this.f97998a.Q();
        String message = this.f97998a.u().get(0).getMessage();
        if (message == str || (str != null && str.equals(message))) {
            return this;
        }
        throw new AssertionError("Error message differs. Expected: '" + str + "', Received: '" + message + "'");
    }

    @Override // zb0.a
    public Thread M() {
        return this.f97998a.M();
    }

    @Override // zb0.a
    public zb0.a<T> N(Class<? extends Throwable> cls) {
        this.f97998a.C(cls);
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> O() {
        this.f97998a.L();
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> P() {
        this.f97998a.q();
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> R() {
        this.f97998a.I();
        return this;
    }

    @Override // zb0.a
    public List<T> T() {
        return this.f97998a.T();
    }

    @Override // zb0.a
    public zb0.a<T> W(int i11) {
        this.f97998a.a0(i11);
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> X(long j11, TimeUnit timeUnit) {
        this.f97998a.f0(j11, timeUnit);
        return this;
    }

    @Override // zb0.a
    public final zb0.a<T> Y(Class<? extends Throwable> cls, T... tArr) {
        this.f97998a.b0(tArr);
        this.f97998a.C(cls);
        this.f97998a.Q();
        return this;
    }

    @Override // zb0.a
    public final int getValueCount() {
        return this.f97998a.getValueCount();
    }

    @Override // zb0.a
    public zb0.a<T> l() {
        this.f97998a.e0();
        return this;
    }

    @Override // zb0.a
    public final zb0.a<T> m(wb0.a aVar) {
        aVar.call();
        return this;
    }

    @Override // zb0.a
    public final zb0.a<T> o(T t11, T... tArr) {
        this.f97998a.c0(t11, tArr);
        return this;
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f97998a.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f97998a.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f97998a.onNext(t11);
    }

    @Override // qb0.g
    public void onStart() {
        this.f97998a.onStart();
    }

    @Override // zb0.a
    public final zb0.a<T> p(T... tArr) {
        this.f97998a.b0(tArr);
        this.f97998a.H();
        this.f97998a.q();
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> s() {
        this.f97998a.U();
        return this;
    }

    @Override // qb0.g
    public void setProducer(d dVar) {
        this.f97998a.setProducer(dVar);
    }

    @Override // zb0.a
    public zb0.a<T> t() {
        this.f97998a.H();
        return this;
    }

    public String toString() {
        return this.f97998a.toString();
    }

    @Override // zb0.a
    public List<Throwable> u() {
        return this.f97998a.u();
    }

    @Override // zb0.a
    public zb0.a<T> v(long j11, TimeUnit timeUnit) {
        this.f97998a.g0(j11, timeUnit);
        return this;
    }

    @Override // zb0.a
    public final zb0.a<T> w(int i11, long j11, TimeUnit timeUnit) {
        if (this.f97998a.h0(i11, j11, timeUnit)) {
            return this;
        }
        throw new AssertionError("Did not receive enough values in time. Expected: " + i11 + ", Actual: " + this.f97998a.getValueCount());
    }

    @Override // zb0.a
    public zb0.a<T> x() {
        this.f97998a.Q();
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> y(List<T> list) {
        this.f97998a.S(list);
        return this;
    }

    @Override // zb0.a
    public zb0.a<T> z(Throwable th2) {
        this.f97998a.D(th2);
        return this;
    }
}
