package mo;

import com.google.common.base.Preconditions;
import com.google.common.collect.aa;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e0
/* loaded from: classes7.dex */
public abstract class x0<E> extends AbstractSet<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<E, ?> f73605a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f73606b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.google.common.collect.c<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f73607c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0 f73608d;

        public a(final x0 this$0, final Iterator val$entries) {
            this.f73607c = val$entries;
            this.f73608d = this$0;
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        public E a() {
            while (this.f73607c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f73607c.next();
                if (this.f73608d.f73606b.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return b();
        }
    }

    public x0(Map<E, ?> outEdgeToNode, Object targetNode) {
        this.f73605a = (Map) Preconditions.checkNotNull(outEdgeToNode);
        this.f73606b = Preconditions.checkNotNull(targetNode);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public aa<E> iterator() {
        return new a(this, this.f73605a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object edge) {
        return this.f73606b.equals(this.f73605a.get(edge));
    }
}
