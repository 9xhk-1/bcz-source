package h40;

import java.util.ArrayList;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes8.dex */
public final class v<E> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Object f58277a;

    public /* synthetic */ v(Object obj) {
        this.f58277a = obj;
    }

    public static final /* synthetic */ v a(Object obj) {
        return new v(obj);
    }

    public static /* synthetic */ Object c(Object obj, int i11, kotlin.jvm.internal.v vVar) {
        if ((i11 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof v) && kotlin.jvm.internal.g0.g(obj, ((v) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.g0.g(obj, obj2);
    }

    public static final void f(Object obj, @m80.k x00.l<? super E, g2> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.invoke(obj);
            return;
        }
        kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                lVar.invoke((Object) arrayList.get(size));
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @m80.k
    public static final Object h(Object obj, E e11) {
        if (obj == null) {
            return b(e11);
        }
        if (obj instanceof ArrayList) {
            kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e11);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e11);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f58277a, obj);
    }

    public int hashCode() {
        return g(this.f58277a);
    }

    public final /* synthetic */ Object j() {
        return this.f58277a;
    }

    public String toString() {
        return i(this.f58277a);
    }

    @m80.k
    public static <E> Object b(@m80.l Object obj) {
        return obj;
    }
}
