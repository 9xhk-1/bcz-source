package com.meizu.cloud.pushsdk.d.c;

import com.meizu.cloud.pushsdk.d.a.c;
import com.meizu.cloud.pushsdk.d.f.d;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.meizu.cloud.pushsdk.d.a.b> f39743a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39744b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39745c;

    /* renamed from: com.meizu.cloud.pushsdk.d.c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0477a<T extends AbstractC0477a<T>> {

        /* renamed from: a, reason: collision with root package name */
        private List<com.meizu.cloud.pushsdk.d.a.b> f39746a = new LinkedList();

        /* renamed from: b, reason: collision with root package name */
        private long f39747b = System.currentTimeMillis();

        /* renamed from: c, reason: collision with root package name */
        private String f39748c = e.b();

        public abstract T a();

        public T a(long j11) {
            this.f39747b = j11;
            return a();
        }
    }

    public a(AbstractC0477a<?> abstractC0477a) {
        d.a(((AbstractC0477a) abstractC0477a).f39746a);
        d.a(((AbstractC0477a) abstractC0477a).f39748c);
        d.a(!((AbstractC0477a) abstractC0477a).f39748c.isEmpty(), "eventId cannot be empty");
        this.f39743a = ((AbstractC0477a) abstractC0477a).f39746a;
        this.f39744b = ((AbstractC0477a) abstractC0477a).f39747b;
        this.f39745c = ((AbstractC0477a) abstractC0477a).f39748c;
    }

    public c a(c cVar) {
        cVar.a(NotificationStyle.EXPANDABLE_IMAGE_URL, c());
        cVar.a("ts", Long.toString(b()));
        return cVar;
    }

    public long b() {
        return this.f39744b;
    }

    public String c() {
        return this.f39745c;
    }

    public List<com.meizu.cloud.pushsdk.d.a.b> a() {
        return new ArrayList(this.f39743a);
    }
}
