package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class k implements p, BoxScope {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final BoxScope f9685a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final AsyncImagePainter f9686b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f9687c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Alignment f9688d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ContentScale f9689e;

    /* renamed from: f, reason: collision with root package name */
    public final float f9690f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final ColorFilter f9691g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9692h;

    public k(@m80.k BoxScope boxScope, @m80.k AsyncImagePainter asyncImagePainter, @m80.l String str, @m80.k Alignment alignment, @m80.k ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, boolean z11) {
        this.f9685a = boxScope;
        this.f9686b = asyncImagePainter;
        this.f9687c = str;
        this.f9688d = alignment;
        this.f9689e = contentScale;
        this.f9690f = f11;
        this.f9691g = colorFilter;
        this.f9692h = z11;
    }

    public static /* synthetic */ k l(k kVar, BoxScope boxScope, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            boxScope = kVar.f9685a;
        }
        if ((i11 & 2) != 0) {
            asyncImagePainter = kVar.f9686b;
        }
        if ((i11 & 4) != 0) {
            str = kVar.f9687c;
        }
        if ((i11 & 8) != 0) {
            alignment = kVar.f9688d;
        }
        if ((i11 & 16) != 0) {
            contentScale = kVar.f9689e;
        }
        if ((i11 & 32) != 0) {
            f11 = kVar.f9690f;
        }
        if ((i11 & 64) != 0) {
            colorFilter = kVar.f9691g;
        }
        if ((i11 & 128) != 0) {
            z11 = kVar.f9692h;
        }
        ColorFilter colorFilter2 = colorFilter;
        boolean z12 = z11;
        ContentScale contentScale2 = contentScale;
        float f12 = f11;
        return kVar.k(boxScope, asyncImagePainter, str, alignment, contentScale2, f12, colorFilter2, z12);
    }

    @Override // coil.compose.p
    @m80.k
    public ContentScale a() {
        return this.f9689e;
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @m80.k
    public Modifier align(@m80.k Modifier modifier, @m80.k Alignment alignment) {
        return this.f9685a.align(modifier, alignment);
    }

    @Override // coil.compose.p
    @m80.k
    public AsyncImagePainter b() {
        return this.f9686b;
    }

    public final BoxScope c() {
        return this.f9685a;
    }

    @m80.k
    public final AsyncImagePainter d() {
        return this.f9686b;
    }

    @m80.l
    public final String e() {
        return this.f9687c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return g0.g(this.f9685a, kVar.f9685a) && g0.g(this.f9686b, kVar.f9686b) && g0.g(this.f9687c, kVar.f9687c) && g0.g(this.f9688d, kVar.f9688d) && g0.g(this.f9689e, kVar.f9689e) && Float.compare(this.f9690f, kVar.f9690f) == 0 && g0.g(this.f9691g, kVar.f9691g) && this.f9692h == kVar.f9692h;
    }

    @m80.k
    public final Alignment f() {
        return this.f9688d;
    }

    @m80.k
    public final ContentScale g() {
        return this.f9689e;
    }

    @Override // coil.compose.p
    @m80.k
    public Alignment getAlignment() {
        return this.f9688d;
    }

    @Override // coil.compose.p
    public float getAlpha() {
        return this.f9690f;
    }

    @Override // coil.compose.p
    public boolean getClipToBounds() {
        return this.f9692h;
    }

    @Override // coil.compose.p
    @m80.l
    public ColorFilter getColorFilter() {
        return this.f9691g;
    }

    @Override // coil.compose.p
    @m80.l
    public String getContentDescription() {
        return this.f9687c;
    }

    public final float h() {
        return this.f9690f;
    }

    public int hashCode() {
        int hashCode = ((this.f9685a.hashCode() * 31) + this.f9686b.hashCode()) * 31;
        String str = this.f9687c;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f9688d.hashCode()) * 31) + this.f9689e.hashCode()) * 31) + Float.hashCode(this.f9690f)) * 31;
        ColorFilter colorFilter = this.f9691g;
        return ((hashCode2 + (colorFilter != null ? colorFilter.hashCode() : 0)) * 31) + Boolean.hashCode(this.f9692h);
    }

    @m80.l
    public final ColorFilter i() {
        return this.f9691g;
    }

    public final boolean j() {
        return this.f9692h;
    }

    @m80.k
    public final k k(@m80.k BoxScope boxScope, @m80.k AsyncImagePainter asyncImagePainter, @m80.l String str, @m80.k Alignment alignment, @m80.k ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, boolean z11) {
        return new k(boxScope, asyncImagePainter, str, alignment, contentScale, f11, colorFilter, z11);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @m80.k
    public Modifier matchParentSize(@m80.k Modifier modifier) {
        return this.f9685a.matchParentSize(modifier);
    }

    @m80.k
    public String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.f9685a + ", painter=" + this.f9686b + ", contentDescription=" + this.f9687c + ", alignment=" + this.f9688d + ", contentScale=" + this.f9689e + ", alpha=" + this.f9690f + ", colorFilter=" + this.f9691g + ", clipToBounds=" + this.f9692h + ')';
    }
}
