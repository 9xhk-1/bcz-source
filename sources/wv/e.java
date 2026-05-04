package wv;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@wv.a
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e f96881a = new e();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final p<i, j, Integer> f96882b = c.f96888a;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final p<i, j, Integer> f96883c = a.f96886a;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final p<i, j, Integer> f96884d = b.f96887a;

    /* renamed from: e, reason: collision with root package name */
    public static final int f96885e = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements p<i, j, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f96886a = new a();

        public a() {
            super(2);
        }

        @Override // x00.p
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@m80.k i layout, @m80.k j item) {
            g0.p(layout, "layout");
            g0.p(item, "item");
            return Integer.valueOf(layout.g() + (((layout.f() - layout.g()) - item.c()) / 2));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements p<i, j, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f96887a = new b();

        public b() {
            super(2);
        }

        @Override // x00.p
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@m80.k i layout, @m80.k j item) {
            g0.p(layout, "layout");
            g0.p(item, "item");
            return Integer.valueOf(layout.f() - item.c());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements p<i, j, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f96888a = new c();

        public c() {
            super(2);
        }

        @Override // x00.p
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@m80.k i layout, @m80.k j noName_1) {
            g0.p(layout, "layout");
            g0.p(noName_1, "$noName_1");
            return Integer.valueOf(layout.g());
        }
    }

    @m80.k
    public final p<i, j, Integer> a() {
        return f96883c;
    }

    @m80.k
    public final p<i, j, Integer> b() {
        return f96884d;
    }

    @m80.k
    public final p<i, j, Integer> c() {
        return f96882b;
    }
}
