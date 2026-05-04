package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,329:1\n254#1,7:330\n254#1,7:337\n254#1,7:344\n254#1,7:351\n254#1,7:358\n254#1,7:365\n254#1,7:372\n254#1,7:379\n254#1,7:386\n254#1,7:393\n254#1,7:400\n254#1,7:407\n254#1,7:414\n254#1,7:421\n254#1,7:428\n254#1,7:435\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n130#1:330,7\n134#1:337,7\n138#1:344,7\n142#1:351,7\n146#1:358,7\n150#1:365,7\n154#1:372,7\n165#1:379,7\n176#1:386,7\n185#1:393,7\n194#1:400,7\n203#1:407,7\n212#1:414,7\n216#1:421,7\n220#1:428,7\n232#1:435,7\n*E\n"})
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c11, @k ArrayList<PathNode> arrayList, @k float[] fArr, int i11) {
        int i12 = 0;
        switch (c11) {
            case 'A':
                int i13 = i11 - 7;
                for (int i14 = 0; i14 <= i13; i14 += 7) {
                    arrayList.add(new PathNode.ArcTo(fArr[i14], fArr[i14 + 1], fArr[i14 + 2], Float.compare(fArr[i14 + 3], 0.0f) != 0, Float.compare(fArr[i14 + 4], 0.0f) != 0, fArr[i14 + 5], fArr[i14 + 6]));
                }
                return;
            case 'C':
                int i15 = i11 - 6;
                while (i12 <= i15) {
                    arrayList.add(new PathNode.CurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]));
                    i12 += 6;
                }
                return;
            case 'H':
                int i16 = i11 - 1;
                while (i12 <= i16) {
                    arrayList.add(new PathNode.HorizontalTo(fArr[i12]));
                    i12++;
                }
                return;
            case 'L':
                int i17 = i11 - 2;
                while (i12 <= i17) {
                    arrayList.add(new PathNode.LineTo(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'M':
                pathMoveNodeFromArgs(arrayList, fArr, i11);
                return;
            case 'Q':
                int i18 = i11 - 4;
                while (i12 <= i18) {
                    arrayList.add(new PathNode.QuadTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 'S':
                int i19 = i11 - 4;
                while (i12 <= i19) {
                    arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 'T':
                int i21 = i11 - 2;
                while (i12 <= i21) {
                    arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'V':
                int i22 = i11 - 1;
                while (i12 <= i22) {
                    arrayList.add(new PathNode.VerticalTo(fArr[i12]));
                    i12++;
                }
                return;
            case 'Z':
            case 'z':
                arrayList.add(PathNode.Close.INSTANCE);
                return;
            case 'a':
                int i23 = i11 - 7;
                for (int i24 = 0; i24 <= i23; i24 += 7) {
                    arrayList.add(new PathNode.RelativeArcTo(fArr[i24], fArr[i24 + 1], fArr[i24 + 2], Float.compare(fArr[i24 + 3], 0.0f) != 0, Float.compare(fArr[i24 + 4], 0.0f) != 0, fArr[i24 + 5], fArr[i24 + 6]));
                }
                return;
            case 'c':
                int i25 = i11 - 6;
                while (i12 <= i25) {
                    arrayList.add(new PathNode.RelativeCurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]));
                    i12 += 6;
                }
                return;
            case 'h':
                int i26 = i11 - 1;
                while (i12 <= i26) {
                    arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i12]));
                    i12++;
                }
                return;
            case 'l':
                int i27 = i11 - 2;
                while (i12 <= i27) {
                    arrayList.add(new PathNode.RelativeLineTo(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'm':
                pathRelativeMoveNodeFromArgs(arrayList, fArr, i11);
                return;
            case 'q':
                int i28 = i11 - 4;
                while (i12 <= i28) {
                    arrayList.add(new PathNode.RelativeQuadTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 's':
                int i29 = i11 - 4;
                while (i12 <= i29) {
                    arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                    i12 += 4;
                }
                return;
            case 't':
                int i31 = i11 - 2;
                while (i12 <= i31) {
                    arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i12], fArr[i12 + 1]));
                    i12 += 2;
                }
                return;
            case 'v':
                int i32 = i11 - 1;
                while (i12 <= i32) {
                    arrayList.add(new PathNode.RelativeVerticalTo(fArr[i12]));
                    i12++;
                }
                return;
            default:
                throw new IllegalArgumentException("Unknown command for: " + c11);
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i11) {
        int i12 = i11 - 2;
        if (i12 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i13 = 2; i13 <= i12; i13 += 2) {
                list.add(new PathNode.LineTo(fArr[i13], fArr[i13 + 1]));
            }
        }
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i11, int i12, p<? super float[], ? super Integer, ? extends PathNode> pVar) {
        int i13 = i11 - i12;
        int i14 = 0;
        while (i14 <= i13) {
            list.add(pVar.invoke(fArr, Integer.valueOf(i14)));
            i14 += i12;
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i11) {
        int i12 = i11 - 2;
        if (i12 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i13 = 2; i13 <= i12; i13 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i13], fArr[i13 + 1]));
            }
        }
    }
}
