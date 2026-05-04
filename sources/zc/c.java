package zc;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f102545c = new c();

    /* renamed from: a, reason: collision with root package name */
    public Scriptable f102546a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f102547b = -1;

    public static final c d() {
        return f102545c;
    }

    public Context b() {
        Context enter = Context.enter();
        enter.setOptimizationLevel(this.f102547b);
        return enter;
    }

    public Scriptable c() {
        return this.f102546a;
    }

    public void e(int i11) {
        this.f102547b = i11;
        try {
            Context enter = Context.enter();
            enter.setOptimizationLevel(i11);
            this.f102546a = enter.initStandardObjects();
        } finally {
            Context.exit();
        }
    }

    public void a() {
    }
}
