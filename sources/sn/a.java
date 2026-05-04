package sn;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f88844a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1163a f88845b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88846c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: sn.a$a, reason: collision with other inner class name */
    public interface InterfaceC1163a {
        void a(Typeface typeface);
    }

    public a(InterfaceC1163a interfaceC1163a, Typeface typeface) {
        this.f88844a = typeface;
        this.f88845b = interfaceC1163a;
    }

    @Override // sn.f
    public void a(int i11) {
        d(this.f88844a);
    }

    @Override // sn.f
    public void b(Typeface typeface, boolean z11) {
        d(typeface);
    }

    public void c() {
        this.f88846c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f88846c) {
            return;
        }
        this.f88845b.a(typeface);
    }
}
