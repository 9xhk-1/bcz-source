package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.PathSegment;
import androidx.compose.ui.graphics.vector.PathParser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathSvg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSvg.kt\nandroidx/compose/ui/graphics/PathSvgKt\n+ 2 Rect.kt\nandroidx/compose/ui/geometry/Rect\n*L\n1#1,128:1\n56#2,6:129\n*S KotlinDebug\n*F\n+ 1 PathSvg.kt\nandroidx/compose/ui/graphics/PathSvgKt\n*L\n64#1:129,6\n*E\n"})
/* loaded from: classes.dex */
public final class PathSvgKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void addSvg(@m80.k Path path, @m80.k String str) {
        new PathParser().parsePathString(str).toPath(path);
    }

    private static final String command(PathSegment.Type type, PathSegment.Type type2) {
        if (type == type2) {
            return " ";
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 5 ? i11 != 6 ? "" : "Z" : "C" : "Q" : "L" : "M";
    }

    @m80.k
    public static final String toSvg(@m80.k Path path, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        Rect bounds = path.getBounds();
        if (z11) {
            sb2.append("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
            sb2.append("viewBox=\"" + bounds.getLeft() + ' ' + bounds.getTop() + ' ' + (bounds.getRight() - bounds.getLeft()) + ' ' + (bounds.getBottom() - bounds.getTop()) + "\">");
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            sb2.append('\n');
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
        }
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type type = PathSegment.Type.Done;
        if (it.hasNext()) {
            if (z11) {
                if (PathFillType.m2787equalsimpl0(path.mo2400getFillTypeRgk1Os(), PathFillType.Companion.m2791getEvenOddRgk1Os())) {
                    sb2.append("  <path fill-rule=\"evenodd\" d=\"");
                } else {
                    sb2.append("  <path d=\"");
                }
            }
            while (it.hasNext()) {
                PathSegment.Type next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                switch (WhenMappings.$EnumSwitchMapping$0[next$default.ordinal()]) {
                    case 1:
                        sb2.append(command(PathSegment.Type.Move, type) + fArr[0] + ' ' + fArr[1]);
                        type = next$default;
                        break;
                    case 2:
                        sb2.append(command(PathSegment.Type.Line, type) + fArr[2] + ' ' + fArr[3]);
                        type = next$default;
                        break;
                    case 3:
                        sb2.append(command(PathSegment.Type.Quadratic, type));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(fArr[2]);
                        sb3.append(' ');
                        sb3.append(fArr[3]);
                        sb3.append(' ');
                        sb3.append(fArr[4]);
                        sb3.append(' ');
                        sb3.append(fArr[5]);
                        sb2.append(sb3.toString());
                        type = next$default;
                        break;
                    case 4:
                    case 7:
                        break;
                    case 5:
                        sb2.append(command(PathSegment.Type.Cubic, type));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(fArr[2]);
                        sb4.append(' ');
                        sb4.append(fArr[3]);
                        sb4.append(' ');
                        sb2.append(sb4.toString());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(fArr[4]);
                        sb5.append(' ');
                        sb5.append(fArr[5]);
                        sb5.append(' ');
                        sb2.append(sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(fArr[6]);
                        sb6.append(' ');
                        sb6.append(fArr[7]);
                        sb2.append(sb6.toString());
                        type = next$default;
                        break;
                    case 6:
                        sb2.append(command(PathSegment.Type.Close, type));
                        type = next$default;
                        break;
                    default:
                        type = next$default;
                        break;
                }
            }
            if (z11) {
                sb2.append("\"/>");
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
                sb2.append('\n');
                kotlin.jvm.internal.g0.o(sb2, "append(...)");
            }
        }
        if (z11) {
            sb2.append("</svg>");
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
            sb2.append('\n');
            kotlin.jvm.internal.g0.o(sb2, "append(...)");
        }
        String sb7 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb7, "toString(...)");
        return sb7;
    }

    public static /* synthetic */ String toSvg$default(Path path, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return toSvg(path, z11);
    }
}
