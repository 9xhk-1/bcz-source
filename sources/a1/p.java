package a1;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class p<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f1361d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final T f1362a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c1.d f1363b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<k1.b<T>, T> f1364c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<k1.b<T>, T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f1365a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t11) {
            super(1);
            this.f1365a = t11;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(@m80.k k1.b<T> it) {
            g0.p(it, "it");
            return this.f1365a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(T t11, @m80.k c1.d keyPath, @m80.k x00.l<? super k1.b<T>, ? extends T> callback) {
        g0.p(keyPath, "keyPath");
        g0.p(callback, "callback");
        this.f1362a = t11;
        this.f1363b = keyPath;
        this.f1364c = callback;
    }

    @m80.k
    public final x00.l<k1.b<T>, T> a() {
        return this.f1364c;
    }

    @m80.k
    public final c1.d b() {
        return this.f1363b;
    }

    public final T c() {
        return this.f1362a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(T t11, @m80.k c1.d keyPath, T t12) {
        this((Object) t11, keyPath, (x00.l) new a(t12));
        g0.p(keyPath, "keyPath");
    }
}
