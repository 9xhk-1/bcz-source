package c40;

import c40.v1;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class v1 extends m0 implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f8001a = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.c
    public static final class a extends kotlin.coroutines.b<m0, v1> {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static final v1 d(d.b bVar) {
            if (bVar instanceof v1) {
                return (v1) bVar;
            }
            return null;
        }

        public a() {
            super(m0.Key, new x00.l() { // from class: c40.u1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    v1 d11;
                    d11 = v1.a.d((d.b) obj);
                    return d11;
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @m80.k
    public abstract Executor q();
}
