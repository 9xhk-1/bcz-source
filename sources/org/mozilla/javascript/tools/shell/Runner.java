package org.mozilla.javascript.tools.shell;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class Runner implements Runnable, ContextAction {
    private Object[] args;

    /* renamed from: f, reason: collision with root package name */
    private Function f78413f;
    ContextFactory factory;

    /* renamed from: s, reason: collision with root package name */
    private Script f78414s;
    private Scriptable scope;

    public Runner(Scriptable scriptable, Function function, Object[] objArr) {
        this.scope = scriptable;
        this.f78413f = function;
        this.args = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.factory.call(this);
    }

    @Override // org.mozilla.javascript.ContextAction
    public Object run(Context context) {
        Function function = this.f78413f;
        if (function == null) {
            return this.f78414s.exec(context, this.scope);
        }
        Scriptable scriptable = this.scope;
        return function.call(context, scriptable, scriptable, this.args);
    }

    public Runner(Scriptable scriptable, Script script) {
        this.scope = scriptable;
        this.f78414s = script;
    }
}
