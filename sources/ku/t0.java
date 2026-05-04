package ku;

import com.typesafe.config.ConfigException;
import java.util.Stack;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final Stack<String> f68813a = new Stack<>();

    /* renamed from: b, reason: collision with root package name */
    public s0 f68814b;

    public void a(String str) {
        c();
        this.f68813a.push(str);
    }

    public void b(s0 s0Var) {
        c();
        String b11 = s0Var.b();
        s0 j11 = s0Var.j();
        while (true) {
            this.f68813a.push(b11);
            if (j11 == null) {
                return;
            }
            b11 = j11.b();
            j11 = j11.j();
        }
    }

    public final void c() {
        if (this.f68814b != null) {
            throw new ConfigException.BugOrBroken("Adding to PathBuilder after getting result");
        }
    }

    public s0 d() {
        if (this.f68814b == null) {
            s0 s0Var = null;
            while (!this.f68813a.isEmpty()) {
                s0Var = new s0(this.f68813a.pop(), s0Var);
            }
            this.f68814b = s0Var;
        }
        return this.f68814b;
    }
}
