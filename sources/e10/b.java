package e10;

import java.util.Random;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends e10.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f48323a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // e10.a
    @k
    public Random a() {
        Random random = this.f48323a.get();
        g0.o(random, "get(...)");
        return random;
    }
}
