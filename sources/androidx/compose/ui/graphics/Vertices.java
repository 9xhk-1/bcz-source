package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,68:1\n102#2,2:69\n34#2,6:71\n104#2:77\n65#3:78\n69#3:81\n60#4:79\n70#4:82\n22#5:80\n22#5:83\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n41#1:69,2\n41#1:71,6\n41#1:77\n61#1:78\n63#1:81\n61#1:79\n63#1:82\n61#1:80\n63#1:83\n*E\n"})
/* loaded from: classes.dex */
public final class Vertices {

    @m80.k
    private final int[] colors;

    @m80.k
    private final short[] indices;

    @m80.k
    private final float[] positions;

    @m80.k
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int i11, List list, List list2, List list3, List list4, kotlin.jvm.internal.v vVar) {
        this(i11, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = ColorKt.m2563toArgb8_81llA(list.get(i11).m2519unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            long m2278unboximpl = list.get(i11 / 2).m2278unboximpl();
            fArr[i11] = i11 % 2 == 0 ? Float.intBitsToFloat((int) (m2278unboximpl >> 32)) : Float.intBitsToFloat((int) (m2278unboximpl & 4294967295L));
        }
        return fArr;
    }

    @m80.k
    public final int[] getColors() {
        return this.colors;
    }

    @m80.k
    public final short[] getIndices() {
        return this.indices;
    }

    @m80.k
    public final float[] getPositions() {
        return this.positions;
    }

    @m80.k
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m2911getVertexModec2xauaI() {
        return this.vertexMode;
    }

    private Vertices(int i11, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        this.vertexMode = i11;
        if (list2.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            InlineClassHelperKt.throwIllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i12 = 0; i12 < size; i12++) {
            int intValue = list4.get(i12).intValue();
            if (intValue < 0 || intValue >= list.size()) {
                InlineClassHelperKt.throwIllegalArgumentException("indices values must be valid indices in the positions list.");
                break;
            }
        }
        this.positions = encodePointList(list);
        this.textureCoordinates = encodePointList(list2);
        this.colors = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i13 = 0; i13 < size2; i13++) {
            sArr[i13] = (short) list4.get(i13).intValue();
        }
        this.indices = sArr;
    }
}
