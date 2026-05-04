package e9;

import com.baicizhan.client.framework.asynctask.LAsyncTask;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends LAsyncTask<Void, Void, a> {

    /* renamed from: p, reason: collision with root package name */
    public final d f49601p;

    public b(d handler) {
        N(U(handler.getClass()));
        A(1);
        this.f49601p = handler;
    }

    public static final String U(Class<?> cl2) {
        return xb.f.o(b.class.getName() + " : " + cl2.getName());
    }

    public static final b V(d handler) {
        String U = U(handler.getClass());
        LAsyncTask<?, ?, ?> K = LAsyncTask.K(U);
        if (K != null) {
            K.d();
            LAsyncTask.G(0, U);
        }
        return new b(handler);
    }

    @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public a f(Void... params) {
        return f.a();
    }

    @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void w(a token) {
        d dVar = this.f49601p;
        if (dVar == null || token == null) {
            dVar.a(null);
        } else {
            dVar.onSuccess(token);
        }
    }
}
