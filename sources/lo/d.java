package lo;

import com.google.common.base.Preconditions;
import com.google.common.collect.w7;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
/* loaded from: classes7.dex */
public abstract class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f71543a = new b();

        @Override // lo.d
        public void a(Object event, Iterator<j> subscribers) {
            Preconditions.checkNotNull(event);
            while (subscribers.hasNext()) {
                subscribers.next().d(event);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue<a> f71544a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final Object f71545a;

            /* renamed from: b, reason: collision with root package name */
            public final j f71546b;

            public a(Object event, j subscriber) {
                this.f71545a = event;
                this.f71546b = subscriber;
            }
        }

        public c() {
            this.f71544a = w7.f();
        }

        @Override // lo.d
        public void a(Object event, Iterator<j> subscribers) {
            Preconditions.checkNotNull(event);
            while (subscribers.hasNext()) {
                this.f71544a.add(new a(event, subscribers.next()));
            }
            while (true) {
                a poll = this.f71544a.poll();
                if (poll == null) {
                    return;
                } else {
                    poll.f71546b.d(poll.f71545a);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: lo.d$d, reason: collision with other inner class name */
    public static final class C0863d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadLocal<Queue<c>> f71547a;

        /* renamed from: b, reason: collision with root package name */
        public final ThreadLocal<Boolean> f71548b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lo.d$d$a */
        public class a extends ThreadLocal<Queue<c>> {
            public a() {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Queue<c> initialValue() {
                return w7.d();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lo.d$d$b */
        public class b extends ThreadLocal<Boolean> {
            public b() {
            }

            @Override // java.lang.ThreadLocal
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: lo.d$d$c */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public final Object f71551a;

            /* renamed from: b, reason: collision with root package name */
            public final Iterator<j> f71552b;

            public c(Object event, Iterator<j> subscribers) {
                this.f71551a = event;
                this.f71552b = subscribers;
            }
        }

        public C0863d() {
            this.f71547a = new a();
            this.f71548b = new b();
        }

        @Override // lo.d
        public void a(Object event, Iterator<j> subscribers) {
            Preconditions.checkNotNull(event);
            Preconditions.checkNotNull(subscribers);
            Queue<c> queue = this.f71547a.get();
            Objects.requireNonNull(queue);
            Queue<c> queue2 = queue;
            queue2.offer(new c(event, subscribers));
            if (this.f71548b.get().booleanValue()) {
                return;
            }
            this.f71548b.set(Boolean.TRUE);
            while (true) {
                try {
                    c poll = queue2.poll();
                    if (poll == null) {
                        return;
                    }
                    while (poll.f71552b.hasNext()) {
                        ((j) poll.f71552b.next()).d(poll.f71551a);
                    }
                } finally {
                    this.f71548b.remove();
                    this.f71547a.remove();
                }
            }
        }
    }

    public static d b() {
        return b.f71543a;
    }

    public static d c() {
        return new c();
    }

    public static d d() {
        return new C0863d();
    }

    public abstract void a(Object event, Iterator<j> subscribers);
}
