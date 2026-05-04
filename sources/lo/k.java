package lo;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final f f71566a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f71567b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f71568c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f71569d;

    public k(f eventBus, Object event, Object subscriber, Method subscriberMethod) {
        this.f71566a = (f) Preconditions.checkNotNull(eventBus);
        this.f71567b = Preconditions.checkNotNull(event);
        this.f71568c = Preconditions.checkNotNull(subscriber);
        this.f71569d = (Method) Preconditions.checkNotNull(subscriberMethod);
    }

    public Object a() {
        return this.f71567b;
    }

    public f b() {
        return this.f71566a;
    }

    public Object c() {
        return this.f71568c;
    }

    public Method d() {
        return this.f71569d;
    }
}
