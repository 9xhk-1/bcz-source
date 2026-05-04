package yz;

import java.io.Serializable;
import kotlin.InitializedLazyImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f1<T> implements c0<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public x00.a<? extends T> f100420a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public volatile Object f100421b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Object f100422c;

    public f1(@m80.k x00.a<? extends T> initializer, @m80.l Object obj) {
        kotlin.jvm.internal.g0.p(initializer, "initializer");
        this.f100420a = initializer;
        this.f100421b = a2.f100409a;
        this.f100422c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // yz.c0
    public T getValue() {
        T t11;
        T t12 = (T) this.f100421b;
        a2 a2Var = a2.f100409a;
        if (t12 != a2Var) {
            return t12;
        }
        synchronized (this.f100422c) {
            t11 = (T) this.f100421b;
            if (t11 == a2Var) {
                x00.a<? extends T> aVar = this.f100420a;
                kotlin.jvm.internal.g0.m(aVar);
                t11 = aVar.invoke();
                this.f100421b = t11;
                this.f100420a = null;
            }
        }
        return t11;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return this.f100421b != a2.f100409a;
    }

    @m80.k
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ f1(x00.a aVar, Object obj, int i11, kotlin.jvm.internal.v vVar) {
        this(aVar, (i11 & 2) != 0 ? null : obj);
    }
}
