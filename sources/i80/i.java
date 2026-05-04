package i80;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final List<i> f60313d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public Object f60314a;

    /* renamed from: b, reason: collision with root package name */
    public p f60315b;

    /* renamed from: c, reason: collision with root package name */
    public i f60316c;

    public i(Object obj, p pVar) {
        this.f60314a = obj;
        this.f60315b = pVar;
    }

    public static i a(p pVar, Object obj) {
        List<i> list = f60313d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new i(obj, pVar);
                }
                i remove = list.remove(size - 1);
                remove.f60314a = obj;
                remove.f60315b = pVar;
                remove.f60316c = null;
                return remove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(i iVar) {
        iVar.f60314a = null;
        iVar.f60315b = null;
        iVar.f60316c = null;
        List<i> list = f60313d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
