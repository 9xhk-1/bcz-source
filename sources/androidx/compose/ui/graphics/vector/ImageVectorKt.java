package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,705:1\n73#2,4:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n654#1:706,4\n*E\n"})
/* loaded from: classes.dex */
public final class ImageVectorKt {
    @k
    public static final ImageVector.Builder group(@k ImageVector.Builder builder, @k String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, @k List<? extends PathNode> list, @k l<? super ImageVector.Builder, g2> lVar) {
        builder.addGroup(str, f11, f12, f13, f14, f15, f16, f17, list);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        builder.addGroup(str2, f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 1.0f : f14, (i11 & 32) != 0 ? 1.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) != 0 ? VectorKt.getEmptyPath() : list);
        lVar.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @k
    /* renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m3196pathR_LF3I(@k ImageVector.Builder builder, @k String str, @m80.l Brush brush, float f11, @m80.l Brush brush2, float f12, float f13, int i11, int i12, float f14, int i13, @k l<? super PathBuilder, g2> lVar) {
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), i13, str, brush, f11, brush2, f12, f13, i11, i12, f14, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m3197pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f11, Brush brush2, float f12, float f13, int i11, int i12, float f14, int i13, l lVar, int i14, Object obj) {
        String str2 = (i14 & 1) != 0 ? "" : str;
        Brush brush3 = (i14 & 2) != 0 ? null : brush;
        float f15 = (i14 & 4) != 0 ? 1.0f : f11;
        Brush brush4 = (i14 & 8) != 0 ? null : brush2;
        float f16 = (i14 & 16) != 0 ? 1.0f : f12;
        float f17 = (i14 & 32) != 0 ? 0.0f : f13;
        int defaultStrokeLineCap = (i14 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i11;
        int defaultStrokeLineJoin = (i14 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i12;
        float f18 = (i14 & 256) != 0 ? 4.0f : f14;
        int defaultFillType = (i14 & 512) != 0 ? VectorKt.getDefaultFillType() : i13;
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, str2, brush3, f15, brush4, f16, f17, defaultStrokeLineCap, defaultStrokeLineJoin, f18, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t11) {
        return arrayList.add(t11);
    }
}
