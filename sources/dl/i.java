package dl;

import com.bumptech.glide.load.DataSource;
import dl.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    public final j.a f48039a;

    /* renamed from: b, reason: collision with root package name */
    public j<R> f48040b;

    public i(j.a aVar) {
        this.f48039a = aVar;
    }

    @Override // dl.g
    public f<R> a(DataSource dataSource, boolean z11) {
        if (dataSource == DataSource.MEMORY_CACHE || !z11) {
            return e.b();
        }
        if (this.f48040b == null) {
            this.f48040b = new j<>(this.f48039a);
        }
        return this.f48040b;
    }
}
