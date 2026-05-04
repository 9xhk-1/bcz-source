package coil.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class ContentPainterElement extends ModifierNodeElement<d> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f9597f = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Painter f9598a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Alignment f9599b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ContentScale f9600c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9601d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final ColorFilter f9602e;

    public ContentPainterElement(@m80.k Painter painter, @m80.k Alignment alignment, @m80.k ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter) {
        this.f9598a = painter;
        this.f9599b = alignment;
        this.f9600c = contentScale;
        this.f9601d = f11;
        this.f9602e = colorFilter;
    }

    private final Painter component1() {
        return this.f9598a;
    }

    private final Alignment component2() {
        return this.f9599b;
    }

    private final float component4() {
        return this.f9601d;
    }

    public static /* synthetic */ ContentPainterElement d(ContentPainterElement contentPainterElement, Painter painter, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            painter = contentPainterElement.f9598a;
        }
        if ((i11 & 2) != 0) {
            alignment = contentPainterElement.f9599b;
        }
        if ((i11 & 4) != 0) {
            contentScale = contentPainterElement.f9600c;
        }
        if ((i11 & 8) != 0) {
            f11 = contentPainterElement.f9601d;
        }
        if ((i11 & 16) != 0) {
            colorFilter = contentPainterElement.f9602e;
        }
        ColorFilter colorFilter2 = colorFilter;
        ContentScale contentScale2 = contentScale;
        return contentPainterElement.c(painter, alignment, contentScale2, f11, colorFilter2);
    }

    public final ContentScale a() {
        return this.f9600c;
    }

    public final ColorFilter b() {
        return this.f9602e;
    }

    @m80.k
    public final ContentPainterElement c(@m80.k Painter painter, @m80.k Alignment alignment, @m80.k ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter) {
        return new ContentPainterElement(painter, alignment, contentScale, f11, colorFilter);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d create() {
        return new d(this.f9598a, this.f9599b, this.f9600c, this.f9601d, this.f9602e);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return g0.g(this.f9598a, contentPainterElement.f9598a) && g0.g(this.f9599b, contentPainterElement.f9599b) && g0.g(this.f9600c, contentPainterElement.f9600c) && Float.compare(this.f9601d, contentPainterElement.f9601d) == 0 && g0.g(this.f9602e, contentPainterElement.f9602e);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void update(@m80.k d dVar) {
        boolean m2333equalsimpl0 = Size.m2333equalsimpl0(dVar.getPainter().mo3180getIntrinsicSizeNHjbRc(), this.f9598a.mo3180getIntrinsicSizeNHjbRc());
        dVar.setPainter(this.f9598a);
        dVar.setAlignment(this.f9599b);
        dVar.setContentScale(this.f9600c);
        dVar.setAlpha(this.f9601d);
        dVar.setColorFilter(this.f9602e);
        if (!m2333equalsimpl0) {
            LayoutModifierNodeKt.invalidateMeasurement(dVar);
        }
        DrawModifierNodeKt.invalidateDraw(dVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((((((this.f9598a.hashCode() * 31) + this.f9599b.hashCode()) * 31) + this.f9600c.hashCode()) * 31) + Float.hashCode(this.f9601d)) * 31;
        ColorFilter colorFilter = this.f9602e;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("content");
        inspectorInfo.getProperties().set("painter", this.f9598a);
        inspectorInfo.getProperties().set("alignment", this.f9599b);
        inspectorInfo.getProperties().set("contentScale", this.f9600c);
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.f9601d));
        inspectorInfo.getProperties().set("colorFilter", this.f9602e);
    }

    @m80.k
    public String toString() {
        return "ContentPainterElement(painter=" + this.f9598a + ", alignment=" + this.f9599b + ", contentScale=" + this.f9600c + ", alpha=" + this.f9601d + ", colorFilter=" + this.f9602e + ')';
    }
}
