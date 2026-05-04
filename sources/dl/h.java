package dl;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;
import dl.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h<R> implements g<R> {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f48035a;

    /* renamed from: b, reason: collision with root package name */
    public f<R> f48036b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements k.a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f48037a;

        public a(Animation animation) {
            this.f48037a = animation;
        }

        @Override // dl.k.a
        public Animation a(Context context) {
            return this.f48037a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements k.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f48038a;

        public b(int i11) {
            this.f48038a = i11;
        }

        @Override // dl.k.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f48038a);
        }
    }

    public h(Animation animation) {
        this(new a(animation));
    }

    @Override // dl.g
    public f<R> a(DataSource dataSource, boolean z11) {
        if (dataSource == DataSource.MEMORY_CACHE || !z11) {
            return e.b();
        }
        if (this.f48036b == null) {
            this.f48036b = new k(this.f48035a);
        }
        return this.f48036b;
    }

    public h(int i11) {
        this(new b(i11));
    }

    public h(k.a aVar) {
        this.f48035a = aVar;
    }
}
