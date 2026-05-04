package rm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import rm.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g extends h.a {

    /* renamed from: e, reason: collision with root package name */
    public static h<g> f84263e;

    /* renamed from: f, reason: collision with root package name */
    public static final Parcelable.Creator<g> f84264f;

    /* renamed from: c, reason: collision with root package name */
    public float f84265c;

    /* renamed from: d, reason: collision with root package name */
    public float f84266d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            g gVar = new g(0.0f, 0.0f);
            gVar.g(parcel);
            return gVar;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    static {
        h<g> a11 = h.a(32, new g(0.0f, 0.0f));
        f84263e = a11;
        a11.l(0.5f);
        f84264f = new a();
    }

    public g() {
    }

    public static g b() {
        return f84263e.b();
    }

    public static g c(float f11, float f12) {
        g b11 = f84263e.b();
        b11.f84265c = f11;
        b11.f84266d = f12;
        return b11;
    }

    public static g d(g gVar) {
        g b11 = f84263e.b();
        b11.f84265c = gVar.f84265c;
        b11.f84266d = gVar.f84266d;
        return b11;
    }

    public static void h(g gVar) {
        f84263e.h(gVar);
    }

    public static void i(List<g> list) {
        f84263e.g(list);
    }

    @Override // rm.h.a
    public h.a a() {
        return new g(0.0f, 0.0f);
    }

    public float e() {
        return this.f84265c;
    }

    public float f() {
        return this.f84266d;
    }

    public void g(Parcel parcel) {
        this.f84265c = parcel.readFloat();
        this.f84266d = parcel.readFloat();
    }

    public g(float f11, float f12) {
        this.f84265c = f11;
        this.f84266d = f12;
    }
}
