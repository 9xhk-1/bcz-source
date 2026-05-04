package coil.compose;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final int f9654d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Object f9655a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f f9656b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final b0.f f9657c;

    public b(@m80.l Object obj, @m80.k f fVar, @m80.k b0.f fVar2) {
        this.f9655a = obj;
        this.f9656b = fVar;
        this.f9657c = fVar2;
    }

    @m80.k
    public final b0.f a() {
        return this.f9657c;
    }

    @m80.l
    public final Object b() {
        return this.f9655a;
    }

    @m80.k
    public final f c() {
        return this.f9656b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9656b.equals(this.f9655a, bVar.f9655a) && g0.g(this.f9657c, bVar.f9657c);
    }

    public int hashCode() {
        return (this.f9656b.hashCode(this.f9655a) * 31) + this.f9657c.hashCode();
    }
}
