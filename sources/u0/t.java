package u0;

import coil.decode.ExifOrientationPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91480a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f91481b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f91482c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91483d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ExifOrientationPolicy f91484e;

    public t() {
        this(false, false, false, 0, null, 31, null);
    }

    public static /* synthetic */ t b(t tVar, boolean z11, boolean z12, boolean z13, int i11, ExifOrientationPolicy exifOrientationPolicy, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = tVar.f91480a;
        }
        if ((i12 & 2) != 0) {
            z12 = tVar.f91481b;
        }
        if ((i12 & 4) != 0) {
            z13 = tVar.f91482c;
        }
        if ((i12 & 8) != 0) {
            i11 = tVar.f91483d;
        }
        if ((i12 & 16) != 0) {
            exifOrientationPolicy = tVar.f91484e;
        }
        ExifOrientationPolicy exifOrientationPolicy2 = exifOrientationPolicy;
        boolean z14 = z13;
        return tVar.a(z11, z12, z14, i11, exifOrientationPolicy2);
    }

    @m80.k
    public final t a(boolean z11, boolean z12, boolean z13, int i11, @m80.k ExifOrientationPolicy exifOrientationPolicy) {
        return new t(z11, z12, z13, i11, exifOrientationPolicy);
    }

    public final boolean c() {
        return this.f91480a;
    }

    @m80.k
    public final ExifOrientationPolicy d() {
        return this.f91484e;
    }

    public final int e() {
        return this.f91483d;
    }

    public final boolean f() {
        return this.f91481b;
    }

    public final boolean g() {
        return this.f91482c;
    }

    public t(boolean z11, boolean z12, boolean z13, int i11, @m80.k ExifOrientationPolicy exifOrientationPolicy) {
        this.f91480a = z11;
        this.f91481b = z12;
        this.f91482c = z13;
        this.f91483d = i11;
        this.f91484e = exifOrientationPolicy;
    }

    public /* synthetic */ t(boolean z11, boolean z12, boolean z13, int i11, ExifOrientationPolicy exifOrientationPolicy, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? true : z11, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13, (i12 & 8) != 0 ? 4 : i11, (i12 & 16) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }
}
