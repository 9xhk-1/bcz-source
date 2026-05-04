package androidx.compose.ui.graphics.vector;

import a00.h0;
import a00.q;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,546:1\n152#1,6:550\n41#2:547\n43#2:548\n22#3:549\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n135#1:550,6\n129#1:547\n130#1:548\n130#1:549\n*E\n"})
/* loaded from: classes.dex */
public final class PathParser {

    @k
    private float[] nodeData = new float[64];

    @l
    private ArrayList<PathNode> nodes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser pathParser, String str, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.pathStringToNodes(str, arrayList);
    }

    private final void resizeNodeData(int i11) {
        float[] fArr = this.nodeData;
        if (i11 >= fArr.length) {
            float[] fArr2 = new float[i11 * 2];
            this.nodeData = fArr2;
            q.y0(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    @k
    public final PathParser addPathNodes(@k List<? extends PathNode> list) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        }
        arrayList.addAll(list);
        return this;
    }

    public final void clear() {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @k
    public final PathParser parsePathString(@k String str) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(str, arrayList);
        return this;
    }

    @k
    public final ArrayList<PathNode> pathStringToNodes(@k String str, @k ArrayList<PathNode> arrayList) {
        int i11;
        char charAt;
        int i12;
        int length = str.length();
        int i13 = 0;
        while (i13 < length && g0.t(str.charAt(i13), 32) <= 0) {
            i13++;
        }
        while (length > i13 && g0.t(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i14 = 0;
        while (i13 < length) {
            while (true) {
                i11 = i13 + 1;
                charAt = str.charAt(i13);
                int i15 = charAt | ' ';
                if ((i15 - 97) * (i15 - 122) <= 0 && i15 != 101) {
                    break;
                }
                if (i11 >= length) {
                    charAt = 0;
                    break;
                }
                i13 = i11;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i14 = 0;
                    while (true) {
                        if (i11 >= length || g0.t(str.charAt(i11), 32) > 0) {
                            long nextFloat = FastFloatParserKt.nextFloat(str, i11, length);
                            i12 = (int) (nextFloat >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i16 = i14 + 1;
                                fArr[i14] = intBitsToFloat;
                                if (i16 >= fArr.length) {
                                    float[] fArr2 = new float[i16 * 2];
                                    this.nodeData = fArr2;
                                    q.y0(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i14 = i16;
                            }
                            while (i12 < length && str.charAt(i12) == ',') {
                                i12++;
                            }
                            if (i12 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            i11++;
                        }
                    }
                    i11 = i12;
                }
                PathNodeKt.addPathNodes(charAt, arrayList, this.nodeData, i14);
            }
            i13 = i11;
        }
        return arrayList;
    }

    @k
    public final List<PathNode> toNodes() {
        ArrayList<PathNode> arrayList = this.nodes;
        return arrayList != null ? arrayList : h0.J();
    }

    @k
    public final Path toPath(@k Path path) {
        Path path2;
        ArrayList<PathNode> arrayList = this.nodes;
        return (arrayList == null || (path2 = PathParserKt.toPath(arrayList, path)) == null) ? AndroidPath_androidKt.Path() : path2;
    }
}
