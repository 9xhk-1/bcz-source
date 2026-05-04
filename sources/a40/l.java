package a40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f1930a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f1931b;

    public l(@m80.k m trace, @m80.k String name) {
        g0.p(trace, "trace");
        g0.p(name, "name");
        this.f1930a = trace;
        this.f1931b = name;
    }

    @Override // a40.m
    public void a(@m80.k Object event) {
        g0.p(event, "event");
        this.f1930a.a(this.f1931b + '.' + event);
    }

    @Override // a40.m
    public void b(@m80.k Object event1, @m80.k Object event2) {
        g0.p(event1, "event1");
        g0.p(event2, "event2");
        this.f1930a.b(this.f1931b + '.' + event1, this.f1931b + '.' + event2);
    }

    @Override // a40.m
    public void c(@m80.k Object event1, @m80.k Object event2, @m80.k Object event3) {
        g0.p(event1, "event1");
        g0.p(event2, "event2");
        g0.p(event3, "event3");
        this.f1930a.c(this.f1931b + '.' + event1, this.f1931b + '.' + event2, this.f1931b + '.' + event3);
    }

    @Override // a40.m
    public void d(@m80.k Object event1, @m80.k Object event2, @m80.k Object event3, @m80.k Object event4) {
        g0.p(event1, "event1");
        g0.p(event2, "event2");
        g0.p(event3, "event3");
        g0.p(event4, "event4");
        this.f1930a.d(this.f1931b + '.' + event1, this.f1931b + '.' + event2, this.f1931b + '.' + event3, this.f1931b + '.' + event4);
    }

    @m80.k
    public String toString() {
        return this.f1930a.toString();
    }
}
