package kc;

import android.content.Context;
import androidx.annotation.StringRes;
import kc.d;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class e extends d {

    @m80.k
    public static final String A = "title";

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public static final b f66380z = new b(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<T extends a<T, R>, R extends e> extends d.a<T, R> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Context context) {
            super(context);
            g0.p(context, "context");
        }

        @m80.k
        public final T L(@StringRes int i11) {
            return M(i().getString(i11));
        }

        @m80.k
        public final T M(@m80.l String str) {
            h().putString("title", str);
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }
}
