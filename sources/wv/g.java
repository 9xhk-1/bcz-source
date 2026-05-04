package wv;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@wv.a
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g f96920a = new g();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final AnimationSpec<Float> f96921b = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final x00.l<i, Float> f96922c = a.f96924a;

    /* renamed from: d, reason: collision with root package name */
    public static final int f96923d = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<i, Float> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f96924a = new a();

        public a() {
            super(1);
        }

        @Override // x00.l
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(@m80.k i it) {
            g0.p(it, "it");
            return Float.valueOf(Float.MAX_VALUE);
        }
    }

    @m80.k
    public final x00.l<i, Float> a() {
        return f96922c;
    }

    @m80.k
    public final AnimationSpec<Float> b() {
        return f96921b;
    }
}
