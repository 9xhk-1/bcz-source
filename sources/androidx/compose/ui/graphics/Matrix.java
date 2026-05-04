package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@kotlin.jvm.internal.u0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n1#1,681:1\n49#1:682\n49#1:683\n49#1:684\n49#1:685\n49#1:686\n49#1:687\n49#1:688\n49#1:689\n49#1:690\n49#1:702\n49#1:703\n49#1:704\n49#1:705\n49#1:706\n49#1:707\n49#1:708\n49#1:709\n49#1:710\n49#1:719\n49#1:720\n49#1:721\n49#1:722\n49#1:723\n49#1:724\n49#1:725\n49#1:726\n49#1:727\n49#1:737\n49#1:742\n49#1:747\n49#1:752\n49#1:757\n49#1:762\n49#1:767\n49#1:772\n49#1:777\n49#1:782\n49#1:787\n49#1:792\n49#1:797\n49#1:802\n49#1:807\n49#1:812\n49#1:816\n49#1:817\n49#1:818\n49#1:819\n49#1:820\n49#1:821\n49#1:822\n49#1:823\n49#1:824\n49#1:825\n49#1:826\n49#1:827\n49#1:828\n49#1:829\n49#1:830\n49#1:831\n49#1:832\n49#1:833\n49#1:834\n49#1:835\n52#1,2:836\n52#1,2:838\n52#1,2:840\n52#1,2:842\n52#1,2:844\n52#1,2:846\n52#1,2:848\n52#1,2:850\n52#1,2:852\n52#1,2:854\n52#1,2:856\n52#1,2:858\n52#1,2:860\n52#1,2:862\n52#1,2:864\n52#1,2:866\n49#1:868\n49#1:869\n49#1:870\n49#1:871\n49#1:872\n49#1:873\n49#1:874\n49#1:875\n52#1,2:876\n52#1,2:878\n52#1,2:880\n52#1,2:882\n52#1,2:884\n52#1,2:886\n52#1,2:888\n52#1,2:890\n49#1:892\n49#1:893\n49#1:894\n49#1:895\n49#1:896\n49#1:897\n49#1:898\n49#1:899\n52#1,2:900\n52#1,2:902\n52#1,2:904\n52#1,2:906\n52#1,2:908\n52#1,2:910\n52#1,2:912\n52#1,2:914\n49#1:916\n49#1:917\n49#1:918\n49#1:919\n49#1:920\n49#1:921\n49#1:922\n49#1:923\n52#1,2:924\n52#1,2:926\n52#1,2:928\n52#1,2:930\n52#1,2:932\n52#1,2:934\n52#1,2:936\n52#1,2:938\n49#1,5:940\n49#1,5:945\n49#1,5:950\n49#1,5:955\n49#1,5:960\n49#1,5:965\n49#1,5:970\n49#1,5:975\n49#1,5:980\n49#1,5:985\n49#1,5:990\n49#1,5:995\n49#1:1000\n49#1:1001\n49#1:1002\n49#1:1003\n52#1,2:1004\n52#1,2:1006\n52#1,2:1008\n52#1,2:1010\n52#1,2:1012\n52#1,2:1014\n52#1,2:1016\n52#1,2:1018\n52#1,2:1020\n52#1,2:1022\n52#1,2:1024\n52#1,2:1026\n52#1,2:1028\n52#1,2:1030\n52#1,2:1032\n52#1,2:1034\n52#1,2:1036\n52#1,2:1038\n52#1,2:1040\n52#1,2:1042\n65#2:691\n69#2:694\n60#3:692\n70#3:695\n53#3,3:699\n22#4:693\n22#4:696\n139#5:697\n139#5:711\n139#5:712\n139#5:713\n139#5:714\n46#5:715\n46#5:716\n56#5:717\n56#5:718\n139#5:728\n139#5:729\n139#5:730\n139#5:731\n46#5:732\n46#5:733\n56#5:734\n56#5:735\n30#6:698\n653#7:736\n654#7,3:738\n653#7:741\n654#7,3:743\n653#7:746\n654#7,3:748\n653#7:751\n654#7,3:753\n653#7:756\n654#7,3:758\n653#7:761\n654#7,3:763\n653#7:766\n654#7,3:768\n653#7:771\n654#7,3:773\n653#7:776\n654#7,3:778\n653#7:781\n654#7,3:783\n653#7:786\n654#7,3:788\n653#7:791\n654#7,3:793\n653#7:796\n654#7,3:798\n653#7:801\n654#7,3:803\n653#7:806\n654#7,3:808\n653#7:811\n654#7,3:813\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n60#1:682\n61#1:683\n62#1:684\n63#1:685\n64#1:686\n65#1:687\n66#1:688\n67#1:689\n68#1:690\n84#1:702\n85#1:703\n86#1:704\n87#1:705\n88#1:706\n89#1:707\n90#1:708\n91#1:709\n92#1:710\n140#1:719\n141#1:720\n142#1:721\n143#1:722\n144#1:723\n145#1:724\n146#1:725\n147#1:726\n148#1:727\n196#1:737\n197#1:742\n198#1:747\n199#1:752\n200#1:757\n201#1:762\n202#1:767\n203#1:772\n204#1:777\n205#1:782\n206#1:787\n207#1:792\n208#1:797\n209#1:802\n210#1:807\n211#1:812\n233#1:816\n234#1:817\n235#1:818\n236#1:819\n246#1:820\n247#1:821\n248#1:822\n249#1:823\n250#1:824\n251#1:825\n252#1:826\n253#1:827\n254#1:828\n255#1:829\n256#1:830\n257#1:831\n258#1:832\n259#1:833\n260#1:834\n261#1:835\n282#1:836,2\n283#1:838,2\n284#1:840,2\n285#1:842,2\n286#1:844,2\n287#1:846,2\n288#1:848,2\n289#1:850,2\n290#1:852,2\n291#1:854,2\n292#1:856,2\n293#1:858,2\n294#1:860,2\n295#1:862,2\n296#1:864,2\n297#1:866,2\n359#1:868\n360#1:869\n364#1:870\n365#1:871\n369#1:872\n370#1:873\n374#1:874\n375#1:875\n379#1:876,2\n380#1:878,2\n381#1:880,2\n382#1:882,2\n383#1:884,2\n384#1:886,2\n385#1:888,2\n386#1:890,2\n398#1:892\n399#1:893\n403#1:894\n404#1:895\n408#1:896\n409#1:897\n413#1:898\n414#1:899\n418#1:900,2\n419#1:902,2\n420#1:904,2\n421#1:906,2\n422#1:908,2\n423#1:910,2\n424#1:912,2\n425#1:914,2\n437#1:916\n438#1:917\n442#1:918\n443#1:919\n447#1:920\n448#1:921\n452#1:922\n453#1:923\n457#1:924,2\n458#1:926,2\n459#1:928,2\n460#1:930,2\n461#1:932,2\n462#1:934,2\n463#1:936,2\n464#1:938,2\n471#1:940,5\n472#1:945,5\n473#1:950,5\n474#1:955,5\n475#1:960,5\n476#1:965,5\n477#1:970,5\n478#1:975,5\n479#1:980,5\n480#1:985,5\n481#1:990,5\n482#1:995,5\n489#1:1000\n490#1:1001\n491#1:1002\n492#1:1003\n493#1:1004,2\n494#1:1006,2\n495#1:1008,2\n496#1:1010,2\n598#1:1012,2\n599#1:1014,2\n600#1:1016,2\n601#1:1018,2\n602#1:1020,2\n603#1:1022,2\n604#1:1024,2\n605#1:1026,2\n606#1:1028,2\n607#1:1030,2\n608#1:1032,2\n609#1:1034,2\n610#1:1036,2\n611#1:1038,2\n612#1:1040,2\n613#1:1042,2\n70#1:691\n71#1:694\n70#1:692\n71#1:695\n76#1:699,3\n70#1:693\n71#1:696\n74#1:697\n102#1:711\n109#1:712\n116#1:713\n123#1:714\n128#1:715\n129#1:716\n130#1:717\n131#1:718\n158#1:728\n165#1:729\n172#1:730\n179#1:731\n183#1:732\n184#1:733\n185#1:734\n186#1:735\n76#1:698\n196#1:736\n196#1:738,3\n197#1:741\n197#1:743,3\n198#1:746\n198#1:748,3\n199#1:751\n199#1:753,3\n200#1:756\n200#1:758,3\n201#1:761\n201#1:763,3\n202#1:766\n202#1:768,3\n203#1:771\n203#1:773,3\n204#1:776\n204#1:778,3\n205#1:781\n205#1:783,3\n206#1:786\n206#1:788,3\n207#1:791\n207#1:793,3\n208#1:796\n208#1:798,3\n209#1:801\n209#1:803,3\n210#1:806\n210#1:808,3\n211#1:811\n211#1:813,3\n*E\n"})
/* loaded from: classes.dex */
public final class Matrix {

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;

    @m80.k
    private final float[] values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m2737boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m2739constructorimpl$default(float[] fArr, int i11, kotlin.jvm.internal.v vVar) {
        if ((i11 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m2738constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2740equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && kotlin.jvm.internal.g0.g(fArr, ((Matrix) obj).m2762unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2741equalsimpl0(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.g0.g(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m2742getimpl(float[] fArr, int i11, int i12) {
        return fArr[(i11 * 4) + i12];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2743hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m2744invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        float f21 = fArr[9];
        float f22 = fArr[10];
        float f23 = fArr[11];
        float f24 = fArr[12];
        float f25 = fArr[13];
        float f26 = fArr[14];
        float f27 = fArr[15];
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f11 * f17) - (f13 * f15);
        float f31 = (f11 * f18) - (f14 * f15);
        float f32 = (f12 * f17) - (f13 * f16);
        float f33 = (f12 * f18) - (f14 * f16);
        float f34 = (f13 * f18) - (f14 * f17);
        float f35 = (f19 * f25) - (f21 * f24);
        float f36 = (f19 * f26) - (f22 * f24);
        float f37 = (f19 * f27) - (f23 * f24);
        float f38 = (f21 * f26) - (f22 * f25);
        float f39 = (f21 * f27) - (f23 * f25);
        float f41 = (f22 * f27) - (f23 * f26);
        float f42 = (((((f28 * f41) - (f29 * f39)) + (f31 * f38)) + (f32 * f37)) - (f33 * f36)) + (f34 * f35);
        if (f42 == 0.0f) {
            return;
        }
        float f43 = 1.0f / f42;
        fArr[0] = (((f16 * f41) - (f17 * f39)) + (f18 * f38)) * f43;
        fArr[1] = ((((-f12) * f41) + (f13 * f39)) - (f14 * f38)) * f43;
        fArr[2] = (((f25 * f34) - (f26 * f33)) + (f27 * f32)) * f43;
        fArr[3] = ((((-f21) * f34) + (f22 * f33)) - (f23 * f32)) * f43;
        float f44 = -f15;
        fArr[4] = (((f44 * f41) + (f17 * f37)) - (f18 * f36)) * f43;
        fArr[5] = (((f41 * f11) - (f13 * f37)) + (f14 * f36)) * f43;
        float f45 = -f24;
        fArr[6] = (((f45 * f34) + (f26 * f31)) - (f27 * f29)) * f43;
        fArr[7] = (((f34 * f19) - (f22 * f31)) + (f23 * f29)) * f43;
        fArr[8] = (((f15 * f39) - (f16 * f37)) + (f18 * f35)) * f43;
        fArr[9] = ((((-f11) * f39) + (f37 * f12)) - (f14 * f35)) * f43;
        fArr[10] = (((f24 * f33) - (f25 * f31)) + (f27 * f28)) * f43;
        fArr[11] = ((((-f19) * f33) + (f31 * f21)) - (f23 * f28)) * f43;
        fArr[12] = (((f44 * f38) + (f16 * f36)) - (f17 * f35)) * f43;
        fArr[13] = (((f11 * f38) - (f12 * f36)) + (f13 * f35)) * f43;
        fArr[14] = (((f45 * f32) + (f25 * f29)) - (f26 * f28)) * f43;
        fArr[15] = (((f19 * f32) - (f21 * f29)) + (f22 * f28)) * f43;
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m2745mapMKHz9U(float[] fArr, long j11) {
        if (fArr.length < 16) {
            return j11;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[7];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float f21 = 1 / (((f13 * intBitsToFloat) + (f16 * intBitsToFloat2)) + f19);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = ((f11 * intBitsToFloat) + (f14 * intBitsToFloat2) + f17) * f21;
        float f23 = f21 * ((f12 * intBitsToFloat) + (f15 * intBitsToFloat2) + f18);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(f22) << 32) | (Float.floatToRawIntBits(f23) & 4294967295L));
    }

    @m80.k
    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m2746mapimpl(float[] fArr, @m80.k Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[7];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = fArr[15];
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f21 = f13 * left;
        float f22 = f16 * top;
        float f23 = 1.0f / ((f21 + f22) + f19);
        if ((Float.floatToRawIntBits(f23) & Integer.MAX_VALUE) >= 2139095040) {
            f23 = 0.0f;
        }
        float f24 = f11 * left;
        float f25 = f14 * top;
        float f26 = f23 * (f24 + f25 + f17);
        float f27 = left * f12;
        float f28 = top * f15;
        float f29 = f23 * (f27 + f28 + f18);
        float f31 = f16 * bottom;
        float f32 = 1.0f / ((f21 + f31) + f19);
        if ((Float.floatToRawIntBits(f32) & Integer.MAX_VALUE) >= 2139095040) {
            f32 = 0.0f;
        }
        float f33 = f14 * bottom;
        float f34 = (f24 + f33 + f17) * f32;
        float f35 = f15 * bottom;
        float f36 = f32 * (f27 + f35 + f18);
        float f37 = f13 * right;
        float f38 = 1.0f / ((f22 + f37) + f19);
        if ((Float.floatToRawIntBits(f38) & Integer.MAX_VALUE) >= 2139095040) {
            f38 = 0.0f;
        }
        float f39 = f11 * right;
        float f41 = f38 * (f39 + f25 + f17);
        float f42 = right * f12;
        float f43 = f38 * (f28 + f42 + f18);
        float f44 = 1.0f / ((f37 + f31) + f19);
        float f45 = (Float.floatToRawIntBits(f44) & Integer.MAX_VALUE) < 2139095040 ? f44 : 0.0f;
        float f46 = (f39 + f33 + f17) * f45;
        float f47 = f45 * (f42 + f35 + f18);
        return new Rect(Math.min(f26, Math.min(f34, Math.min(f41, f46))), Math.min(f29, Math.min(f36, Math.min(f43, f47))), Math.max(f26, Math.max(f34, Math.max(f41, f46))), Math.max(f29, Math.max(f36, Math.max(f43, f47))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m2748resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m2749resetToPivotedTransformimpl(float[] fArr, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22) {
        double d11 = f16 * 0.017453292519943295d;
        float sin = (float) Math.sin(d11);
        float cos = (float) Math.cos(d11);
        float f23 = -sin;
        float f24 = (f14 * cos) - (f15 * sin);
        float f25 = (f14 * sin) + (f15 * cos);
        double d12 = f17 * 0.017453292519943295d;
        float sin2 = (float) Math.sin(d12);
        float cos2 = (float) Math.cos(d12);
        float f26 = -sin2;
        float f27 = sin * sin2;
        float f28 = sin * cos2;
        float f29 = cos * sin2;
        float f31 = cos * cos2;
        float f32 = (f13 * cos2) + (f25 * sin2);
        float f33 = ((-f13) * sin2) + (f25 * cos2);
        double d13 = f18 * 0.017453292519943295d;
        float sin3 = (float) Math.sin(d13);
        float cos3 = (float) Math.cos(d13);
        float f34 = -sin3;
        float f35 = (f34 * cos2) + (cos3 * f27);
        float f36 = cos * cos3;
        float f37 = (f34 * f26) + (cos3 * f28);
        float f38 = ((cos2 * cos3) + (f27 * sin3)) * f19;
        float f39 = sin3 * cos * f19;
        float f41 = ((cos3 * f26) + (sin3 * f28)) * f19;
        float f42 = f35 * f21;
        float f43 = f36 * f21;
        float f44 = f37 * f21;
        float f45 = f29 * f22;
        float f46 = f23 * f22;
        float f47 = f31 * f22;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f38;
        fArr[1] = f39;
        fArr[2] = f41;
        fArr[3] = 0.0f;
        fArr[4] = f42;
        fArr[5] = f43;
        fArr[6] = f44;
        fArr[7] = 0.0f;
        fArr[8] = f45;
        fArr[9] = f46;
        fArr[10] = f47;
        fArr[11] = 0.0f;
        float f48 = -f11;
        fArr[12] = ((f38 * f48) - (f42 * f12)) + f32 + f11;
        fArr[13] = ((f39 * f48) - (f43 * f12)) + f24 + f12;
        fArr[14] = ((f48 * f41) - (f12 * f44)) + f33;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2750resetToPivotedTransformimpl$default(float[] fArr, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f14 = 0.0f;
        }
        if ((i11 & 16) != 0) {
            f15 = 0.0f;
        }
        if ((i11 & 32) != 0) {
            f16 = 0.0f;
        }
        if ((i11 & 64) != 0) {
            f17 = 0.0f;
        }
        if ((i11 & 128) != 0) {
            f18 = 0.0f;
        }
        if ((i11 & 256) != 0) {
            f19 = 1.0f;
        }
        if ((i11 & 512) != 0) {
            f21 = 1.0f;
        }
        if ((i11 & 1024) != 0) {
            f22 = 1.0f;
        }
        m2749resetToPivotedTransformimpl(fArr, f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22);
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m2751rotateXimpl(float[] fArr, float f11) {
        if (fArr.length < 16) {
            return;
        }
        double d11 = f11 * 0.017453292519943295d;
        float sin = (float) Math.sin(d11);
        float cos = (float) Math.cos(d11);
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[9];
        float f17 = fArr[10];
        float f18 = fArr[13];
        float f19 = fArr[14];
        fArr[1] = (f12 * cos) - (f13 * sin);
        fArr[2] = (f12 * sin) + (f13 * cos);
        fArr[5] = (f14 * cos) - (f15 * sin);
        fArr[6] = (f14 * sin) + (f15 * cos);
        fArr[9] = (f16 * cos) - (f17 * sin);
        fArr[10] = (f16 * sin) + (f17 * cos);
        fArr[13] = (f18 * cos) - (f19 * sin);
        fArr[14] = (f18 * sin) + (f19 * cos);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m2752rotateYimpl(float[] fArr, float f11) {
        if (fArr.length < 16) {
            return;
        }
        double d11 = f11 * 0.017453292519943295d;
        float sin = (float) Math.sin(d11);
        float cos = (float) Math.cos(d11);
        float f12 = fArr[0];
        float f13 = fArr[2];
        float f14 = fArr[4];
        float f15 = fArr[6];
        float f16 = fArr[8];
        float f17 = fArr[10];
        float f18 = fArr[12];
        float f19 = fArr[14];
        fArr[0] = (f12 * cos) + (f13 * sin);
        fArr[2] = ((-f12) * sin) + (f13 * cos);
        fArr[4] = (f14 * cos) + (f15 * sin);
        fArr[6] = ((-f14) * sin) + (f15 * cos);
        fArr[8] = (f16 * cos) + (f17 * sin);
        fArr[10] = ((-f16) * sin) + (f17 * cos);
        fArr[12] = (f18 * cos) + (f19 * sin);
        fArr[14] = ((-f18) * sin) + (f19 * cos);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m2753rotateZimpl(float[] fArr, float f11) {
        if (fArr.length < 16) {
            return;
        }
        double d11 = f11 * 0.017453292519943295d;
        float sin = (float) Math.sin(d11);
        float cos = (float) Math.cos(d11);
        float f12 = fArr[0];
        float f13 = fArr[4];
        float f14 = -sin;
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = fArr[2];
        float f18 = fArr[6];
        float f19 = fArr[3];
        float f21 = fArr[7];
        fArr[0] = (cos * f12) + (sin * f13);
        fArr[1] = (cos * f15) + (sin * f16);
        fArr[2] = (cos * f17) + (sin * f18);
        fArr[3] = (cos * f19) + (sin * f21);
        fArr[4] = (f12 * f14) + (f13 * cos);
        fArr[5] = (f15 * f14) + (f16 * cos);
        fArr[6] = (f17 * f14) + (f18 * cos);
        fArr[7] = (f14 * f19) + (cos * f21);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m2754scaleimpl(float[] fArr, float f11, float f12, float f13) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f11;
        fArr[1] = fArr[1] * f11;
        fArr[2] = fArr[2] * f11;
        fArr[3] = fArr[3] * f11;
        fArr[4] = fArr[4] * f12;
        fArr[5] = fArr[5] * f12;
        fArr[6] = fArr[6] * f12;
        fArr[7] = fArr[7] * f12;
        fArr[8] = fArr[8] * f13;
        fArr[9] = fArr[9] * f13;
        fArr[10] = fArr[10] * f13;
        fArr[11] = fArr[11] * f13;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2755scaleimpl$default(float[] fArr, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 1.0f;
        }
        m2754scaleimpl(fArr, f11, f12, f13);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m2756setimpl(float[] fArr, int i11, int i12, float f11) {
        fArr[(i11 * 4) + i12] = f11;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m2757setFrom58bKbWc(float[] fArr, @m80.k float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m2758timesAssign58bKbWc(float[] fArr, @m80.k float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f11 = fArr[0];
            float f12 = fArr2[0];
            float f13 = fArr[1];
            float f14 = fArr2[4];
            float f15 = fArr[2];
            float f16 = fArr2[8];
            float f17 = fArr[3];
            float f18 = fArr2[12];
            float f19 = (f11 * f12) + (f13 * f14) + (f15 * f16) + (f17 * f18);
            float f21 = fArr2[1];
            float f22 = fArr2[5];
            float f23 = fArr2[9];
            float f24 = fArr2[13];
            float f25 = (f11 * f21) + (f13 * f22) + (f15 * f23) + (f17 * f24);
            float f26 = fArr2[2];
            float f27 = fArr2[6];
            float f28 = fArr2[10];
            float f29 = fArr2[14];
            float f31 = (f11 * f26) + (f13 * f27) + (f15 * f28) + (f17 * f29);
            float f32 = fArr2[3];
            float f33 = fArr2[7];
            float f34 = fArr2[11];
            float f35 = fArr2[15];
            float f36 = (f11 * f32) + (f13 * f33) + (f15 * f34) + (f17 * f35);
            float f37 = fArr[4];
            float f38 = fArr[5];
            float f39 = fArr[6];
            float f41 = fArr[7];
            float f42 = (f37 * f12) + (f38 * f14) + (f39 * f16) + (f41 * f18);
            float f43 = (f37 * f21) + (f38 * f22) + (f39 * f23) + (f41 * f24);
            float f44 = (f37 * f26) + (f38 * f27) + (f39 * f28) + (f41 * f29);
            float f45 = (f37 * f32) + (f38 * f33) + (f39 * f34) + (f41 * f35);
            float f46 = fArr[8];
            float f47 = fArr[9];
            float f48 = fArr[10];
            float f49 = fArr[11];
            float f51 = (f46 * f12) + (f47 * f14) + (f48 * f16) + (f49 * f18);
            float f52 = (f46 * f21) + (f47 * f22) + (f48 * f23) + (f49 * f24);
            float f53 = (f46 * f26) + (f47 * f27) + (f48 * f28) + (f49 * f29);
            float f54 = (f46 * f32) + (f47 * f33) + (f48 * f34) + (f49 * f35);
            float f55 = fArr[12];
            float f56 = fArr[13];
            float f57 = (f12 * f55) + (f14 * f56);
            float f58 = fArr[14];
            float f59 = f57 + (f16 * f58);
            float f61 = fArr[15];
            fArr[0] = f19;
            fArr[1] = f25;
            fArr[2] = f31;
            fArr[3] = f36;
            fArr[4] = f42;
            fArr[5] = f43;
            fArr[6] = f44;
            fArr[7] = f45;
            fArr[8] = f51;
            fArr[9] = f52;
            fArr[10] = f53;
            fArr[11] = f54;
            fArr[12] = f59 + (f18 * f61);
            fArr[13] = (f21 * f55) + (f22 * f56) + (f23 * f58) + (f24 * f61);
            fArr[14] = (f26 * f55) + (f27 * f56) + (f28 * f58) + (f29 * f61);
            fArr[15] = (f55 * f32) + (f56 * f33) + (f58 * f34) + (f61 * f35);
        }
    }

    @m80.k
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2759toStringimpl(float[] fArr) {
        return u30.y.v("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m2760translateimpl(float[] fArr, float f11, float f12, float f13) {
        if (fArr.length < 16) {
            return;
        }
        float f14 = (fArr[0] * f11) + (fArr[4] * f12) + (fArr[8] * f13) + fArr[12];
        float f15 = (fArr[1] * f11) + (fArr[5] * f12) + (fArr[9] * f13) + fArr[13];
        float f16 = (fArr[2] * f11) + (fArr[6] * f12) + (fArr[10] * f13) + fArr[14];
        float f17 = (fArr[3] * f11) + (fArr[7] * f12) + (fArr[11] * f13) + fArr[15];
        fArr[12] = f14;
        fArr[13] = f15;
        fArr[14] = f16;
        fArr[15] = f17;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m2761translateimpl$default(float[] fArr, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        m2760translateimpl(fArr, f11, f12, f13);
    }

    public boolean equals(Object obj) {
        return m2740equalsimpl(this.values, obj);
    }

    @m80.k
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m2743hashCodeimpl(this.values);
    }

    @m80.k
    public String toString() {
        return m2759toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m2762unboximpl() {
        return this.values;
    }

    @m80.k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m2738constructorimpl(@m80.k float[] fArr) {
        return fArr;
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m2747mapimpl(float[] fArr, @m80.k MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[7];
        float f17 = fArr[12];
        float f18 = fArr[13];
        float f19 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f21 = f13 * left;
        float f22 = f16 * top;
        float f23 = 1.0f / ((f21 + f22) + f19);
        if ((Float.floatToRawIntBits(f23) & Integer.MAX_VALUE) >= 2139095040) {
            f23 = 0.0f;
        }
        float f24 = f11 * left;
        float f25 = f14 * top;
        float f26 = f23 * (f24 + f25 + f17);
        float f27 = left * f12;
        float f28 = top * f15;
        float f29 = f23 * (f27 + f28 + f18);
        float f31 = f16 * bottom;
        float f32 = 1.0f / ((f21 + f31) + f19);
        if ((Float.floatToRawIntBits(f32) & Integer.MAX_VALUE) >= 2139095040) {
            f32 = 0.0f;
        }
        float f33 = f14 * bottom;
        float f34 = (f24 + f33 + f17) * f32;
        float f35 = f15 * bottom;
        float f36 = f32 * (f27 + f35 + f18);
        float f37 = f13 * right;
        float f38 = 1.0f / ((f22 + f37) + f19);
        if ((Float.floatToRawIntBits(f38) & Integer.MAX_VALUE) >= 2139095040) {
            f38 = 0.0f;
        }
        float f39 = f11 * right;
        float f41 = f38 * (f39 + f25 + f17);
        float f42 = right * f12;
        float f43 = f38 * (f28 + f42 + f18);
        float f44 = 1.0f / ((f37 + f31) + f19);
        float f45 = (Float.floatToRawIntBits(f44) & Integer.MAX_VALUE) < 2139095040 ? f44 : 0.0f;
        float f46 = (f39 + f33 + f17) * f45;
        float f47 = f45 * (f42 + f35 + f18);
        mutableRect.setLeft(Math.min(f26, Math.min(f34, Math.min(f41, f46))));
        mutableRect.setTop(Math.min(f29, Math.min(f36, Math.min(f43, f47))));
        mutableRect.setRight(Math.max(f26, Math.max(f34, Math.max(f41, f46))));
        mutableRect.setBottom(Math.max(f29, Math.max(f36, Math.max(f43, f47))));
    }
}
