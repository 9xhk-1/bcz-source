package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Synchronizer extends Delegator {
    private Object syncObject;

    public Synchronizer(Scriptable scriptable) {
        super(scriptable);
    }

    @Override // org.mozilla.javascript.Delegator, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object call;
        Object obj = this.syncObject;
        if (obj == null) {
            obj = scriptable2;
        }
        if (obj instanceof Wrapper) {
            obj = ((Wrapper) obj).unwrap();
        }
        synchronized (obj) {
            call = ((Function) this.obj).call(context, scriptable, scriptable2, objArr);
        }
        return call;
    }

    public Synchronizer(Scriptable scriptable, Object obj) {
        super(scriptable);
        this.syncObject = obj;
    }
}
