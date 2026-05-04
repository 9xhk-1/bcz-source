package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathGeometry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n+ 2 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n1#1,316:1\n456#2:317\n*S KotlinDebug\n*F\n+ 1 PathGeometry.kt\nandroidx/compose/ui/graphics/PathGeometryKt\n*L\n127#1:317\n*E\n"})
/* loaded from: classes.dex */
public final class PathGeometryKt {

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

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.Path.Direction computeDirection(@m80.k androidx.compose.ui.graphics.Path r32) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.PathGeometryKt.computeDirection(androidx.compose.ui.graphics.Path):androidx.compose.ui.graphics.Path$Direction");
    }

    @m80.k
    public static final List<Path> divide(@m80.k Path path, @m80.k List<Path> list) {
        Path Path = AndroidPath_androidKt.Path();
        PathIterator it = path.iterator();
        float[] fArr = new float[8];
        PathSegment.Type next$default = PathIterator.next$default(it, fArr, 0, 2, null);
        Path path2 = Path;
        boolean z11 = true;
        boolean z12 = true;
        while (next$default != PathSegment.Type.Done) {
            switch (WhenMappings.$EnumSwitchMapping$0[next$default.ordinal()]) {
                case 1:
                    if (!z11 && !z12) {
                        list.add(path2);
                        path2 = AndroidPath_androidKt.Path();
                    }
                    path2.moveTo(fArr[0], fArr[1]);
                    z11 = false;
                    z12 = true;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 2:
                    path2.lineTo(fArr[2], fArr[3]);
                    z12 = false;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 3:
                    path2.quadraticTo(fArr[2], fArr[3], fArr[4], fArr[5]);
                    z12 = false;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 4:
                case 7:
                    break;
                case 5:
                    path2.cubicTo(fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]);
                    z12 = false;
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                case 6:
                    path2.close();
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
                default:
                    next$default = PathIterator.next$default(it, fArr, 0, 2, null);
                    break;
            }
        }
        if (!z11 && !z12) {
            list.add(path2);
        }
        return list;
    }

    public static /* synthetic */ List divide$default(Path path, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return divide(path, list);
    }

    private static final int floatCountForType(PathSegment.Type type) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
            case 5:
                return 8;
            case 6:
            case 7:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @m80.k
    public static final Path reverse(@m80.k Path path, @m80.k Path path2) {
        boolean z11;
        float[] fArr;
        PathIterator it = path.iterator();
        int calculateSize = it.calculateSize(false);
        ArrayList arrayList = new ArrayList(calculateSize);
        ArrayList arrayList2 = new ArrayList(calculateSize);
        float[] fArr2 = new float[8];
        for (PathSegment.Type next$default = PathIterator.next$default(it, fArr2, 0, 2, null); next$default != PathSegment.Type.Done; next$default = PathIterator.next$default(it, fArr2, 0, 2, null)) {
            arrayList.add(next$default);
            if (next$default != PathSegment.Type.Close) {
                float[] copyOf = Arrays.copyOf(fArr2, floatCountForType(next$default));
                kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
                arrayList2.add(copyOf);
            }
        }
        int size = arrayList2.size();
        boolean z12 = false;
        boolean z13 = true;
        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
            if (z13) {
                size--;
                fArr = (float[]) arrayList2.get(size);
                int Le = a00.a0.Le(fArr);
                path2.moveTo(fArr[Le - 1], fArr[Le]);
                z11 = false;
            } else {
                z11 = z13;
                fArr = (float[]) arrayList2.get(size);
            }
            int i11 = size;
            int i12 = WhenMappings.$EnumSwitchMapping$0[((PathSegment.Type) arrayList.get(size2)).ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    float[] fArr3 = fArr;
                    path2.lineTo(fArr3[0], fArr3[1]);
                } else if (i12 == 3) {
                    float[] fArr4 = fArr;
                    path2.quadraticTo(fArr4[2], fArr4[3], fArr4[0], fArr4[1]);
                } else if (i12 != 5) {
                    if (i12 == 6) {
                        z12 = true;
                    }
                    size = i11;
                    z13 = z11;
                } else {
                    float[] fArr5 = fArr;
                    path2.cubicTo(fArr[4], fArr[5], fArr[2], fArr5[3], fArr5[0], fArr5[1]);
                }
                i11--;
                size = i11;
                z13 = z11;
            } else {
                if (z12) {
                    path2.close();
                    z12 = false;
                }
                z13 = true;
                size = i11;
            }
        }
        if (z12) {
            path2.close();
        }
        return path2;
    }

    public static /* synthetic */ Path reverse$default(Path path, Path path2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            path2 = AndroidPath_androidKt.Path();
        }
        return reverse(path, path2);
    }
}
