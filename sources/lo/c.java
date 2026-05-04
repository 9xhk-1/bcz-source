package lo;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import ho.b0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f71541a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f71542b;

    public c(Object source, Object event) {
        this.f71541a = Preconditions.checkNotNull(source);
        this.f71542b = Preconditions.checkNotNull(event);
    }

    public Object a() {
        return this.f71542b;
    }

    public Object b() {
        return this.f71541a;
    }

    public String toString() {
        return b0.c(this).f("source", this.f71541a).f(NotificationCompat.CATEGORY_EVENT, this.f71542b).toString();
    }
}
