package b3;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Future<T> f5753a;

    public b(Future<T> future) {
        this.f5753a = future;
    }

    public T a() {
        try {
            return this.f5753a.get();
        } catch (InterruptedException unused) {
            return null;
        } catch (ExecutionException e11) {
            throw new GdxRuntimeException(e11.getCause());
        }
    }

    public boolean b() {
        return this.f5753a.isDone();
    }
}
