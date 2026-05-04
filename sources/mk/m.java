package mk;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import fl.o;
import gl.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final fl.j<ik.b, String> f73476a = new fl.j<>(1000);

    /* renamed from: b, reason: collision with root package name */
    public final Pools.Pool<b> f73477b = gl.a.e(10, new a());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.d<b> {
        public a() {
        }

        @Override // gl.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final MessageDigest f73479a;

        /* renamed from: b, reason: collision with root package name */
        public final gl.c f73480b = gl.c.a();

        public b(MessageDigest messageDigest) {
            this.f73479a = messageDigest;
        }

        @Override // gl.a.f
        @NonNull
        public gl.c d() {
            return this.f73480b;
        }
    }

    public final String a(ik.b bVar) {
        b bVar2 = (b) fl.m.e(this.f73477b.acquire());
        try {
            bVar.a(bVar2.f73479a);
            return o.B(bVar2.f73479a.digest());
        } finally {
            this.f73477b.release(bVar2);
        }
    }

    public String b(ik.b bVar) {
        String j11;
        synchronized (this.f73476a) {
            j11 = this.f73476a.j(bVar);
        }
        if (j11 == null) {
            j11 = a(bVar);
        }
        synchronized (this.f73476a) {
            this.f73476a.n(bVar, j11);
        }
        return j11;
    }
}
