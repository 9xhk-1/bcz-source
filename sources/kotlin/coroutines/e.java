package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    @y0(version = "1.3")
    @kotlin.c
    public static final <E extends d.b> E a(@k d.b bVar, @k d.c<E> key) {
        E e11;
        g0.p(bVar, "<this>");
        g0.p(key, "key");
        if (!(key instanceof b)) {
            if (bVar.getKey() == key) {
                return bVar;
            }
            return null;
        }
        b bVar2 = (b) key;
        if (!bVar2.a(bVar.getKey()) || (e11 = (E) bVar2.b(bVar)) == null) {
            return null;
        }
        return e11;
    }

    @y0(version = "1.3")
    @kotlin.c
    @k
    public static final d b(@k d.b bVar, @k d.c<?> key) {
        g0.p(bVar, "<this>");
        g0.p(key, "key");
        if (!(key instanceof b)) {
            return bVar.getKey() == key ? EmptyCoroutineContext.INSTANCE : bVar;
        }
        b bVar2 = (b) key;
        return (!bVar2.a(bVar.getKey()) || bVar2.b(bVar) == null) ? bVar : EmptyCoroutineContext.INSTANCE;
    }
}
