package yz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.InitializedLazyImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x0<T> implements c0<T>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f100459d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<x0<?>, Object> f100460e = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, yr.e.f100279a);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public volatile x00.a<? extends T> f100461a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public volatile Object f100462b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Object f100463c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public x0(@m80.k x00.a<? extends T> initializer) {
        kotlin.jvm.internal.g0.p(initializer, "initializer");
        this.f100461a = initializer;
        a2 a2Var = a2.f100409a;
        this.f100462b = a2Var;
        this.f100463c = a2Var;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // yz.c0
    public T getValue() {
        T t11 = (T) this.f100462b;
        a2 a2Var = a2.f100409a;
        if (t11 != a2Var) {
            return t11;
        }
        x00.a<? extends T> aVar = this.f100461a;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (androidx.concurrent.futures.a.a(f100460e, this, a2Var, invoke)) {
                this.f100461a = null;
                return invoke;
            }
        }
        return (T) this.f100462b;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return this.f100462b != a2.f100409a;
    }

    @m80.k
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public static /* synthetic */ void a() {
    }
}
