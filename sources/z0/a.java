package z0;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    public final d<K> f100478c;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public k1.j<A> f100480e;

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f100476a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f100477b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f100479d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public A f100481f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f100482g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f100483h = -1.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void e();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements d<T> {
        public c() {
        }

        @Override // z0.a.d
        public k1.a<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // z0.a.d
        public float b() {
            return 0.0f;
        }

        @Override // z0.a.d
        public boolean c(float f11) {
            throw new IllegalStateException("not implemented");
        }

        @Override // z0.a.d
        public boolean d(float f11) {
            return false;
        }

        @Override // z0.a.d
        public float e() {
            return 1.0f;
        }

        @Override // z0.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<T> {
        k1.a<T> a();

        @FloatRange(from = 0.0d, to = 1.0d)
        float b();

        boolean c(float f11);

        boolean d(float f11);

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends k1.a<T>> f100484a;

        /* renamed from: c, reason: collision with root package name */
        public k1.a<T> f100486c = null;

        /* renamed from: d, reason: collision with root package name */
        public float f100487d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public k1.a<T> f100485b = f(0.0f);

        public e(List<? extends k1.a<T>> list) {
            this.f100484a = list;
        }

        @Override // z0.a.d
        @NonNull
        public k1.a<T> a() {
            return this.f100485b;
        }

        @Override // z0.a.d
        public float b() {
            return this.f100484a.get(0).e();
        }

        @Override // z0.a.d
        public boolean c(float f11) {
            k1.a<T> aVar = this.f100486c;
            k1.a<T> aVar2 = this.f100485b;
            if (aVar == aVar2 && this.f100487d == f11) {
                return true;
            }
            this.f100486c = aVar2;
            this.f100487d = f11;
            return false;
        }

        @Override // z0.a.d
        public boolean d(float f11) {
            if (this.f100485b.a(f11)) {
                return !this.f100485b.h();
            }
            this.f100485b = f(f11);
            return true;
        }

        @Override // z0.a.d
        public float e() {
            return this.f100484a.get(r0.size() - 1).b();
        }

        public final k1.a<T> f(float f11) {
            List<? extends k1.a<T>> list = this.f100484a;
            k1.a<T> aVar = list.get(list.size() - 1);
            if (f11 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f100484a.size() - 2; size >= 1; size--) {
                k1.a<T> aVar2 = this.f100484a.get(size);
                if (this.f100485b != aVar2 && aVar2.a(f11)) {
                    return aVar2;
                }
            }
            return this.f100484a.get(0);
        }

        @Override // z0.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final k1.a<T> f100488a;

        /* renamed from: b, reason: collision with root package name */
        public float f100489b = -1.0f;

        public f(List<? extends k1.a<T>> list) {
            this.f100488a = list.get(0);
        }

        @Override // z0.a.d
        public k1.a<T> a() {
            return this.f100488a;
        }

        @Override // z0.a.d
        public float b() {
            return this.f100488a.e();
        }

        @Override // z0.a.d
        public boolean c(float f11) {
            if (this.f100489b == f11) {
                return true;
            }
            this.f100489b = f11;
            return false;
        }

        @Override // z0.a.d
        public boolean d(float f11) {
            return !this.f100488a.h();
        }

        @Override // z0.a.d
        public float e() {
            return this.f100488a.b();
        }

        @Override // z0.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends k1.a<K>> list) {
        this.f100478c = o(list);
    }

    public static <T> d<T> o(List<? extends k1.a<T>> list) {
        return list.isEmpty() ? new c() : list.size() == 1 ? new f(list) : new e(list);
    }

    public void a(b bVar) {
        this.f100476a.add(bVar);
    }

    public k1.a<K> b() {
        com.airbnb.lottie.e.a("BaseKeyframeAnimation#getCurrentKeyframe");
        k1.a<K> a11 = this.f100478c.a();
        com.airbnb.lottie.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return a11;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float c() {
        if (this.f100483h == -1.0f) {
            this.f100483h = this.f100478c.e();
        }
        return this.f100483h;
    }

    public float d() {
        k1.a<K> b11 = b();
        if (b11 == null || b11.h()) {
            return 0.0f;
        }
        return b11.f64878d.getInterpolation(e());
    }

    public float e() {
        if (this.f100477b) {
            return 0.0f;
        }
        k1.a<K> b11 = b();
        if (b11.h()) {
            return 0.0f;
        }
        return (this.f100479d - b11.e()) / (b11.b() - b11.e());
    }

    public float f() {
        return this.f100479d;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float g() {
        if (this.f100482g == -1.0f) {
            this.f100482g = this.f100478c.b();
        }
        return this.f100482g;
    }

    public A h() {
        float e11 = e();
        if (this.f100480e == null && this.f100478c.c(e11)) {
            return this.f100481f;
        }
        k1.a<K> b11 = b();
        Interpolator interpolator = b11.f64879e;
        A i11 = (interpolator == null || b11.f64880f == null) ? i(b11, d()) : j(b11, e11, interpolator.getInterpolation(e11), b11.f64880f.getInterpolation(e11));
        this.f100481f = i11;
        return i11;
    }

    public abstract A i(k1.a<K> aVar, float f11);

    public A j(k1.a<K> aVar, float f11, float f12, float f13) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i11 = 0; i11 < this.f100476a.size(); i11++) {
            this.f100476a.get(i11).e();
        }
    }

    public void l() {
        this.f100477b = true;
    }

    public void m(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (this.f100478c.isEmpty()) {
            return;
        }
        if (f11 < g()) {
            f11 = g();
        } else if (f11 > c()) {
            f11 = c();
        }
        if (f11 == this.f100479d) {
            return;
        }
        this.f100479d = f11;
        if (this.f100478c.d(f11)) {
            k();
        }
    }

    public void n(@Nullable k1.j<A> jVar) {
        k1.j<A> jVar2 = this.f100480e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f100480e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
