package z0;

import androidx.annotation.Nullable;
import java.util.Collections;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    public final A f100539i;

    public q(k1.j<A> jVar) {
        this(jVar, null);
    }

    @Override // z0.a
    public float c() {
        return 1.0f;
    }

    @Override // z0.a
    public A h() {
        k1.j<A> jVar = this.f100480e;
        A a11 = this.f100539i;
        return jVar.b(0.0f, 0.0f, a11, a11, f(), f(), f());
    }

    @Override // z0.a
    public A i(k1.a<K> aVar, float f11) {
        return h();
    }

    @Override // z0.a
    public void k() {
        if (this.f100480e != null) {
            super.k();
        }
    }

    @Override // z0.a
    public void m(float f11) {
        this.f100479d = f11;
    }

    public q(k1.j<A> jVar, @Nullable A a11) {
        super(Collections.EMPTY_LIST);
        n(jVar);
        this.f100539i = a11;
    }
}
