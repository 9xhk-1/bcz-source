package j50;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public abstract class y<E, C extends Collection<? extends E>, B> extends x<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@m80.k f50.i<E> element) {
        super(element, null);
        kotlin.jvm.internal.g0.p(element, "element");
    }

    @Override // j50.a
    @m80.k
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterator<E> j(@m80.k C c11) {
        kotlin.jvm.internal.g0.p(c11, "<this>");
        return c11.iterator();
    }

    @Override // j50.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int k(@m80.k C c11) {
        kotlin.jvm.internal.g0.p(c11, "<this>");
        return c11.size();
    }
}
