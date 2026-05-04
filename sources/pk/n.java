package pk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class n<A, B> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f80721b = 250;

    /* renamed from: a, reason: collision with root package name */
    public final fl.j<b<A>, B> f80722a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends fl.j<b<A>, B> {
        public a(long j11) {
            super(j11);
        }

        @Override // fl.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(@NonNull b<A> bVar, @Nullable B b11) {
            bVar.c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        public static final Queue<b<?>> f80724d = fl.o.g(0);

        /* renamed from: a, reason: collision with root package name */
        public int f80725a;

        /* renamed from: b, reason: collision with root package name */
        public int f80726b;

        /* renamed from: c, reason: collision with root package name */
        public A f80727c;

        public static <A> b<A> a(A a11, int i11, int i12) {
            b<A> bVar;
            Queue<b<?>> queue = f80724d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a11, i11, i12);
            return bVar;
        }

        public final void b(A a11, int i11, int i12) {
            this.f80727c = a11;
            this.f80726b = i11;
            this.f80725a = i12;
        }

        public void c() {
            Queue<b<?>> queue = f80724d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f80726b == bVar.f80726b && this.f80725a == bVar.f80725a && this.f80727c.equals(bVar.f80727c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f80725a * 31) + this.f80726b) * 31) + this.f80727c.hashCode();
        }
    }

    public n() {
        this(250L);
    }

    public void a() {
        this.f80722a.c();
    }

    @Nullable
    public B b(A a11, int i11, int i12) {
        b<A> a12 = b.a(a11, i11, i12);
        B j11 = this.f80722a.j(a12);
        a12.c();
        return j11;
    }

    public void c(A a11, int i11, int i12, B b11) {
        this.f80722a.n(b.a(a11, i11, i12), b11);
    }

    public n(long j11) {
        this.f80722a = new a(j11);
    }
}
