package sh;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static String f88612b = "user.problem_enable";

    /* renamed from: c, reason: collision with root package name */
    public static g f88613c;

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f88614a = new HashMap();

    public static g b() {
        g gVar;
        synchronized (g.class) {
            try {
                gVar = f88613c;
                if (gVar == null) {
                    gVar = new g();
                    f88613c = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public final int a(int bookId) {
        Integer num = this.f88614a.get(Integer.valueOf(bookId));
        if (num == null) {
            num = Integer.valueOf(i9.f.d(pb.a.a(), i9.f.h(f88612b, Integer.valueOf(bookId).toString())));
            this.f88614a.put(Integer.valueOf(bookId), num);
        }
        return num.intValue();
    }

    public boolean c(int bookId) {
        return (a(bookId) & 4) > 0;
    }

    public boolean d(int bookId) {
        return (a(bookId) & 2) > 0;
    }

    public boolean e(int bookId) {
        return (a(bookId) & 1) > 0;
    }

    public void f(int bookId, int enableMask) {
        i9.f.k(pb.a.a(), i9.f.h(f88612b, Integer.valueOf(bookId).toString()), enableMask);
        this.f88614a.put(Integer.valueOf(bookId), Integer.valueOf(enableMask));
        qb.c.b("ProblemEnabler", "setEnableMask(" + bookId + j2.O + enableMask + pn.j.f81007d, new Object[0]);
    }
}
