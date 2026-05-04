package l60;

import java.util.ArrayList;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f70488a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70489b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final okio.f f70490c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Long f70491d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Long f70492e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final Long f70493f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final Long f70494g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, Object> f70495h;

    public s() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ s b(s sVar, boolean z11, boolean z12, okio.f fVar, Long l11, Long l12, Long l13, Long l14, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sVar.f70488a;
        }
        if ((i11 & 2) != 0) {
            z12 = sVar.f70489b;
        }
        if ((i11 & 4) != 0) {
            fVar = sVar.f70490c;
        }
        if ((i11 & 8) != 0) {
            l11 = sVar.f70491d;
        }
        if ((i11 & 16) != 0) {
            l12 = sVar.f70492e;
        }
        if ((i11 & 32) != 0) {
            l13 = sVar.f70493f;
        }
        if ((i11 & 64) != 0) {
            l14 = sVar.f70494g;
        }
        if ((i11 & 128) != 0) {
            map = sVar.f70495h;
        }
        Long l15 = l14;
        Map map2 = map;
        Long l16 = l12;
        Long l17 = l13;
        return sVar.a(z11, z12, fVar, l11, l16, l17, l15, map2);
    }

    @m80.k
    public final s a(boolean z11, boolean z12, @m80.l okio.f fVar, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l Long l14, @m80.k Map<h10.d<?>, ? extends Object> extras) {
        kotlin.jvm.internal.g0.p(extras, "extras");
        return new s(z11, z12, fVar, l11, l12, l13, l14, extras);
    }

    @m80.l
    public final <T> T c(@m80.k h10.d<? extends T> type) {
        kotlin.jvm.internal.g0.p(type, "type");
        Object obj = this.f70495h.get(type);
        if (obj == null) {
            return null;
        }
        return (T) h10.e.a(type, obj);
    }

    @m80.l
    public final Long d() {
        return this.f70492e;
    }

    @m80.k
    public final Map<h10.d<?>, Object> e() {
        return this.f70495h;
    }

    @m80.l
    public final Long f() {
        return this.f70494g;
    }

    @m80.l
    public final Long g() {
        return this.f70493f;
    }

    @m80.l
    public final Long h() {
        return this.f70491d;
    }

    @m80.l
    public final okio.f i() {
        return this.f70490c;
    }

    public final boolean j() {
        return this.f70489b;
    }

    public final boolean k() {
        return this.f70488a;
    }

    @m80.k
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f70488a) {
            arrayList.add("isRegularFile");
        }
        if (this.f70489b) {
            arrayList.add("isDirectory");
        }
        if (this.f70491d != null) {
            arrayList.add("byteCount=" + this.f70491d.longValue());
        }
        if (this.f70492e != null) {
            arrayList.add("createdAt=" + this.f70492e.longValue());
        }
        if (this.f70493f != null) {
            arrayList.add("lastModifiedAt=" + this.f70493f.longValue());
        }
        if (this.f70494g != null) {
            arrayList.add("lastAccessedAt=" + this.f70494g.longValue());
        }
        if (!this.f70495h.isEmpty()) {
            arrayList.add("extras=" + this.f70495h);
        }
        return a00.r0.r3(arrayList, j2.O, "FileMetadata(", pn.j.f81007d, 0, null, null, 56, null);
    }

    public s(boolean z11, boolean z12, @m80.l okio.f fVar, @m80.l Long l11, @m80.l Long l12, @m80.l Long l13, @m80.l Long l14, @m80.k Map<h10.d<?>, ? extends Object> extras) {
        kotlin.jvm.internal.g0.p(extras, "extras");
        this.f70488a = z11;
        this.f70489b = z12;
        this.f70490c = fVar;
        this.f70491d = l11;
        this.f70492e = l12;
        this.f70493f = l13;
        this.f70494g = l14;
        this.f70495h = a00.l1.D0(extras);
    }

    public /* synthetic */ s(boolean z11, boolean z12, okio.f fVar, Long l11, Long l12, Long l13, Long l14, Map map, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? null : fVar, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : l13, (i11 & 64) != 0 ? null : l14, (i11 & 128) != 0 ? a00.l1.z() : map);
    }
}
