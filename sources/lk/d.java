package lk;

import java.util.Queue;
import lk.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class d<T extends m> {

    /* renamed from: b, reason: collision with root package name */
    public static final int f71443b = 20;

    /* renamed from: a, reason: collision with root package name */
    public final Queue<T> f71444a = fl.o.g(20);

    public abstract T a();

    public T b() {
        T poll = this.f71444a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t11) {
        if (this.f71444a.size() < 20) {
            this.f71444a.offer(t11);
        }
    }
}
