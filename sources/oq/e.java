package oq;

import android.content.Context;
import java.io.InputStream;

@Deprecated
/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f77639a;

    /* renamed from: b, reason: collision with root package name */
    public InputStream f77640b;

    public e(Context context) {
        this.f77639a = context;
    }

    public final void a() {
        pq.b.a(this.f77640b);
    }

    public abstract InputStream b(Context context);

    public InputStream c() {
        if (this.f77640b == null) {
            this.f77640b = b(this.f77639a);
        }
        return this.f77640b;
    }
}
