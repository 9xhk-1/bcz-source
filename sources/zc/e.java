package zc;

import com.baicizhan.learning_strategy.util.L;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public String f102548a;

    public e(String str) {
        this.f102548a = str;
    }

    @Override // zc.d
    public synchronized ad.a load() {
        Scriptable c11 = c.d().c();
        Context b11 = c.d().b();
        try {
            com.baicizhan.learning_strategy.util.c.b(b11, c11, this.f102548a);
            Object b12 = com.baicizhan.learning_strategy.util.c.b(b11, c11, "new LearningManager()");
            if (!(b12 instanceof NativeObject)) {
                return null;
            }
            return new bd.a((NativeObject) b12);
        } catch (Throwable th2) {
            try {
                L.log.error("load script error", th2);
                return null;
            } finally {
                Context.exit();
            }
        }
    }
}
