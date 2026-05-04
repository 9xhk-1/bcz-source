package io.ktor.server.engine;

import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s1 extends io.ktor.util.pipeline.c<yz.g2, zx.k0> {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final a f61434j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f61435k = new io.ktor.util.pipeline.h(TtmlNode.ANNOTATION_POSITION_BEFORE);

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final io.ktor.util.pipeline.h f61436l = new io.ktor.util.pipeline.h(NotificationCompat.CATEGORY_CALL);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f61437g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final py.c f61438h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final qy.m f61439i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final io.ktor.util.pipeline.h a() {
            return s1.f61435k;
        }

        @m80.k
        public final io.ktor.util.pipeline.h b() {
            return s1.f61436l;
        }

        public a() {
        }
    }

    public s1() {
        this(false, 1, null);
    }

    @m80.k
    public final py.c Z() {
        return this.f61438h;
    }

    @m80.k
    public final qy.m b0() {
        return this.f61439i;
    }

    @Override // io.ktor.util.pipeline.c
    public boolean u() {
        return this.f61437g;
    }

    public /* synthetic */ s1(boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public s1(boolean z11) {
        super(f61435k, f61436l);
        this.f61437g = z11;
        this.f61438h = new py.c(u());
        this.f61439i = new qy.m(u());
    }
}
