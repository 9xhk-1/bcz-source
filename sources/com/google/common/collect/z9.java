package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b
@go.a
@Deprecated
@u3
/* loaded from: classes7.dex */
public abstract class z9<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends z9<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ho.r f34162a;

        public a(final ho.r val$nodeToChildrenFunction) {
            this.f34162a = val$nodeToChildrenFunction;
        }

        @Override // com.google.common.collect.z9
        public Iterable<T> b(T root) {
            return (Iterable) this.f34162a.apply(root);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f34163b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z9 f34164c;

        public b(final z9 this$0, final Object val$root) {
            this.f34163b = val$root;
            this.f34164c = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public aa<T> iterator() {
            return this.f34164c.e(this.f34163b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f34165b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z9 f34166c;

        public c(final z9 this$0, final Object val$root) {
            this.f34165b = val$root;
            this.f34166c = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Iterable
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public aa<T> iterator() {
            return this.f34166c.c(this.f34165b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends i4<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f34167b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z9 f34168c;

        public d(final z9 this$0, final Object val$root) {
            this.f34167b = val$root;
            this.f34168c = this$0;
        }

        @Override // java.lang.Iterable
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public aa<T> iterator() {
            return new e(this.f34167b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends aa<T> implements u7<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<T> f34169a;

        public e(T root) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f34169a = arrayDeque;
            arrayDeque.add(root);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f34169a.isEmpty();
        }

        @Override // java.util.Iterator, com.google.common.collect.u7
        public T next() {
            T remove = this.f34169a.remove();
            k6.a(this.f34169a, z9.this.b(remove));
            return remove;
        }

        @Override // com.google.common.collect.u7
        public T peek() {
            return this.f34169a.element();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class f extends com.google.common.collect.c<T> {

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque<g<T>> f34171c;

        public f(T root) {
            ArrayDeque<g<T>> arrayDeque = new ArrayDeque<>();
            this.f34171c = arrayDeque;
            arrayDeque.addLast(d(root));
        }

        @Override // com.google.common.collect.c
        @CheckForNull
        public T a() {
            while (!this.f34171c.isEmpty()) {
                g<T> last = this.f34171c.getLast();
                if (!last.f34174b.hasNext()) {
                    this.f34171c.removeLast();
                    return last.f34173a;
                }
                this.f34171c.addLast(d(last.f34174b.next()));
            }
            return b();
        }

        public final g<T> d(T t11) {
            return new g<>(t11, z9.this.b(t11).iterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f34173a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<T> f34174b;

        public g(T t11, Iterator<T> it) {
            this.f34173a = (T) Preconditions.checkNotNull(t11);
            this.f34174b = (Iterator) Preconditions.checkNotNull(it);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class h extends aa<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Deque<Iterator<T>> f34175a;

        public h(T root) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f34175a = arrayDeque;
            arrayDeque.addLast(l6.X(Preconditions.checkNotNull(root)));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f34175a.isEmpty();
        }

        @Override // java.util.Iterator
        public T next() {
            Iterator<T> last = this.f34175a.getLast();
            T t11 = (T) Preconditions.checkNotNull(last.next());
            if (!last.hasNext()) {
                this.f34175a.removeLast();
            }
            Iterator<T> it = z9.this.b(t11).iterator();
            if (it.hasNext()) {
                this.f34175a.addLast(it);
            }
            return t11;
        }
    }

    @Deprecated
    public static <T> z9<T> g(final ho.r<T, ? extends Iterable<T>> nodeToChildrenFunction) {
        Preconditions.checkNotNull(nodeToChildrenFunction);
        return new a(nodeToChildrenFunction);
    }

    @Deprecated
    public final i4<T> a(final T root) {
        Preconditions.checkNotNull(root);
        return new d(this, root);
    }

    public abstract Iterable<T> b(T root);

    public aa<T> c(T root) {
        return new f(root);
    }

    @Deprecated
    public final i4<T> d(final T root) {
        Preconditions.checkNotNull(root);
        return new c(this, root);
    }

    public aa<T> e(T root) {
        return new h(root);
    }

    @Deprecated
    public final i4<T> f(final T root) {
        Preconditions.checkNotNull(root);
        return new b(this, root);
    }
}
