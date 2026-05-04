package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import ix.l1;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class TransitionParser {
    private static int map(String str, String... strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11].equals(str)) {
                return i11;
            }
        }
        return 0;
    }

    @Deprecated
    public static void parse(CLObject cLObject, Transition transition, CorePixelDp corePixelDp) throws CLParsingException {
        parse(cLObject, transition);
    }

    private static void parseKeyAttribute(CLObject cLObject, Transition transition) throws CLParsingException {
        CLArray arrayOrNull;
        CustomVariable[][] customVariableArr;
        CLObject cLObject2;
        int i11;
        String[] strArr;
        CLArray arrayOrNull2 = cLObject.getArrayOrNull(TypedValues.AttributesType.S_TARGET);
        if (arrayOrNull2 == null || (arrayOrNull = cLObject.getArrayOrNull("frames")) == null) {
            return;
        }
        String stringOrNull = cLObject.getStringOrNull("transitionEasing");
        String[] strArr2 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
        boolean[] zArr = {false, false, true, true, true, false, false, false, false};
        int size = arrayOrNull.size();
        TypedBundle[] typedBundleArr = new TypedBundle[size];
        for (int i12 = 0; i12 < arrayOrNull.size(); i12++) {
            typedBundleArr[i12] = new TypedBundle();
        }
        int i13 = 0;
        for (int i14 = 9; i13 < i14; i14 = 9) {
            String str = strArr2[i13];
            int i15 = iArr[i13];
            boolean z11 = zArr[i13];
            CLArray arrayOrNull3 = cLObject.getArrayOrNull(str);
            if (arrayOrNull3 != null && arrayOrNull3.size() != size) {
                throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", cLObject);
            }
            if (arrayOrNull3 != null) {
                int i16 = 0;
                while (i16 < size) {
                    float f11 = arrayOrNull3.getFloat(i16);
                    String[] strArr3 = strArr2;
                    if (z11) {
                        f11 = transition.mToPixel.toPixels(f11);
                    }
                    typedBundleArr[i16].add(i15, f11);
                    i16++;
                    strArr2 = strArr3;
                }
                strArr = strArr2;
            } else {
                strArr = strArr2;
                float floatOrNaN = cLObject.getFloatOrNaN(str);
                if (!Float.isNaN(floatOrNaN)) {
                    if (z11) {
                        floatOrNaN = transition.mToPixel.toPixels(floatOrNaN);
                    }
                    for (int i17 = 0; i17 < size; i17++) {
                        typedBundleArr[i17].add(i15, floatOrNaN);
                    }
                }
            }
            i13++;
            strArr2 = strArr;
        }
        int i18 = 0;
        CLElement orNull = cLObject.getOrNull("custom");
        if (orNull == null || !(orNull instanceof CLObject)) {
            customVariableArr = null;
        } else {
            CLObject cLObject3 = (CLObject) orNull;
            int size2 = cLObject3.size();
            customVariableArr = (CustomVariable[][]) Array.newInstance((Class<?>) CustomVariable.class, arrayOrNull.size(), size2);
            int i19 = 0;
            while (i19 < size2) {
                CLKey cLKey = (CLKey) cLObject3.get(i19);
                String content = cLKey.content();
                if (cLKey.getValue() instanceof CLArray) {
                    CLArray cLArray = (CLArray) cLKey.getValue();
                    int size3 = cLArray.size();
                    if (size3 == size && size3 > 0) {
                        int i21 = i18;
                        if (cLArray.get(i21) instanceof CLNumber) {
                            int i22 = i21;
                            while (i22 < size) {
                                customVariableArr[i22][i19] = new CustomVariable(content, 901, cLArray.get(i22).getFloat());
                                i22++;
                                cLObject3 = cLObject3;
                            }
                        } else {
                            cLObject2 = cLObject3;
                            int i23 = 0;
                            while (i23 < size) {
                                long parseColorString = ConstraintSetParser.parseColorString(cLArray.get(i23).content());
                                if (parseColorString != -1) {
                                    i11 = i23;
                                    customVariableArr[i23][i19] = new CustomVariable(content, 902, (int) parseColorString);
                                } else {
                                    i11 = i23;
                                }
                                i23 = i11 + 1;
                            }
                        }
                    }
                    cLObject2 = cLObject3;
                } else {
                    cLObject2 = cLObject3;
                    CLElement value = cLKey.getValue();
                    if (value instanceof CLNumber) {
                        float f12 = value.getFloat();
                        for (int i24 = 0; i24 < size; i24++) {
                            customVariableArr[i24][i19] = new CustomVariable(content, 901, f12);
                        }
                    } else {
                        long parseColorString2 = ConstraintSetParser.parseColorString(value.content());
                        if (parseColorString2 != -1) {
                            int i25 = 0;
                            while (i25 < size) {
                                customVariableArr[i25][i19] = new CustomVariable(content, 902, (int) parseColorString2);
                                i25++;
                                size2 = size2;
                                parseColorString2 = parseColorString2;
                            }
                        }
                    }
                }
                i19++;
                size2 = size2;
                cLObject3 = cLObject2;
                i18 = 0;
            }
        }
        String stringOrNull2 = cLObject.getStringOrNull("curveFit");
        for (int i26 = 0; i26 < arrayOrNull2.size(); i26++) {
            for (int i27 = 0; i27 < size; i27++) {
                String string = arrayOrNull2.getString(i26);
                TypedBundle typedBundle = typedBundleArr[i27];
                if (stringOrNull2 != null) {
                    typedBundle.add(TypedValues.PositionType.TYPE_CURVE_FIT, map(stringOrNull2, "spline", "linear"));
                }
                typedBundle.addIfNotNull(501, stringOrNull);
                typedBundle.add(100, arrayOrNull.getInt(i27));
                transition.addKeyAttribute(string, typedBundle, customVariableArr != null ? customVariableArr[i27] : null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseKeyCycle(androidx.constraintlayout.core.parser.CLObject r19, androidx.constraintlayout.core.state.Transition r20) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.parseKeyCycle(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }

    public static void parseKeyFrames(CLObject cLObject, Transition transition) throws CLParsingException {
        CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull == null) {
            return;
        }
        CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
        if (arrayOrNull != null) {
            for (int i11 = 0; i11 < arrayOrNull.size(); i11++) {
                CLElement cLElement = arrayOrNull.get(i11);
                if (cLElement instanceof CLObject) {
                    parseKeyPosition((CLObject) cLElement, transition);
                }
            }
        }
        CLArray arrayOrNull2 = objectOrNull.getArrayOrNull(TypedValues.AttributesType.NAME);
        if (arrayOrNull2 != null) {
            for (int i12 = 0; i12 < arrayOrNull2.size(); i12++) {
                CLElement cLElement2 = arrayOrNull2.get(i12);
                if (cLElement2 instanceof CLObject) {
                    parseKeyAttribute((CLObject) cLElement2, transition);
                }
            }
        }
        CLArray arrayOrNull3 = objectOrNull.getArrayOrNull("KeyCycles");
        if (arrayOrNull3 != null) {
            for (int i13 = 0; i13 < arrayOrNull3.size(); i13++) {
                CLElement cLElement3 = arrayOrNull3.get(i13);
                if (cLElement3 instanceof CLObject) {
                    parseKeyCycle((CLObject) cLElement3, transition);
                }
            }
        }
    }

    private static void parseKeyPosition(CLObject cLObject, Transition transition) throws CLParsingException {
        TypedBundle typedBundle = new TypedBundle();
        CLArray array = cLObject.getArray(TypedValues.AttributesType.S_TARGET);
        CLArray array2 = cLObject.getArray("frames");
        CLArray arrayOrNull = cLObject.getArrayOrNull("percentX");
        CLArray arrayOrNull2 = cLObject.getArrayOrNull("percentY");
        CLArray arrayOrNull3 = cLObject.getArrayOrNull("percentWidth");
        CLArray arrayOrNull4 = cLObject.getArrayOrNull("percentHeight");
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String stringOrNull2 = cLObject.getStringOrNull("transitionEasing");
        String stringOrNull3 = cLObject.getStringOrNull("curveFit");
        String stringOrNull4 = cLObject.getStringOrNull("type");
        if (stringOrNull4 == null) {
            stringOrNull4 = "parentRelative";
        }
        if (arrayOrNull == null || array2.size() == arrayOrNull.size()) {
            if (arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) {
                int i11 = 0;
                while (i11 < array.size()) {
                    String string = array.getString(i11);
                    int map = map(stringOrNull4, "deltaRelative", "pathRelative", "parentRelative");
                    typedBundle.clear();
                    typedBundle.add(TypedValues.PositionType.TYPE_POSITION_TYPE, map);
                    if (stringOrNull3 != null) {
                        map(typedBundle, TypedValues.PositionType.TYPE_CURVE_FIT, stringOrNull3, "spline", "linear");
                    }
                    typedBundle.addIfNotNull(501, stringOrNull2);
                    if (stringOrNull != null) {
                        map(typedBundle, 509, stringOrNull, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i12 = 0;
                    while (i12 < array2.size()) {
                        typedBundle.add(100, array2.getInt(i12));
                        set(typedBundle, TypedValues.PositionType.TYPE_PERCENT_X, arrayOrNull, i12);
                        set(typedBundle, 507, arrayOrNull2, i12);
                        set(typedBundle, 503, arrayOrNull3, i12);
                        set(typedBundle, 504, arrayOrNull4, i12);
                        transition.addKeyPosition(string, typedBundle);
                        i12++;
                        stringOrNull4 = stringOrNull4;
                    }
                    i11++;
                    stringOrNull4 = stringOrNull4;
                }
            }
        }
    }

    private static void parseOnSwipe(CLContainer cLContainer, Transition transition) {
        String stringOrNull = cLContainer.getStringOrNull(l1.a.f62925c);
        int map = map(cLContainer.getStringOrNull("side"), Transition.OnSwipe.SIDES);
        int map2 = map(cLContainer.getStringOrNull(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION), Transition.OnSwipe.DIRECTIONS);
        float floatOrNaN = cLContainer.getFloatOrNaN("scale");
        float floatOrNaN2 = cLContainer.getFloatOrNaN("threshold");
        float floatOrNaN3 = cLContainer.getFloatOrNaN("maxVelocity");
        float floatOrNaN4 = cLContainer.getFloatOrNaN("maxAccel");
        String stringOrNull2 = cLContainer.getStringOrNull("limitBounds");
        int map3 = map(cLContainer.getStringOrNull("mode"), Transition.OnSwipe.MODE);
        int map4 = map(cLContainer.getStringOrNull("touchUp"), Transition.OnSwipe.TOUCH_UP);
        float floatOrNaN5 = cLContainer.getFloatOrNaN("springMass");
        float floatOrNaN6 = cLContainer.getFloatOrNaN("springStiffness");
        float floatOrNaN7 = cLContainer.getFloatOrNaN("springDamping");
        float floatOrNaN8 = cLContainer.getFloatOrNaN("stopThreshold");
        int map5 = map(cLContainer.getStringOrNull("springBoundary"), Transition.OnSwipe.BOUNDARY);
        String stringOrNull3 = cLContainer.getStringOrNull("around");
        Transition.OnSwipe createOnSwipe = transition.createOnSwipe();
        createOnSwipe.setAnchorId(stringOrNull);
        createOnSwipe.setAnchorSide(map);
        createOnSwipe.setDragDirection(map2);
        createOnSwipe.setDragScale(floatOrNaN);
        createOnSwipe.setDragThreshold(floatOrNaN2);
        createOnSwipe.setMaxVelocity(floatOrNaN3);
        createOnSwipe.setMaxAcceleration(floatOrNaN4);
        createOnSwipe.setLimitBoundsTo(stringOrNull2);
        createOnSwipe.setAutoCompleteMode(map3);
        createOnSwipe.setOnTouchUp(map4);
        createOnSwipe.setSpringMass(floatOrNaN5);
        createOnSwipe.setSpringStiffness(floatOrNaN6);
        createOnSwipe.setSpringDamping(floatOrNaN7);
        createOnSwipe.setSpringStopThreshold(floatOrNaN8);
        createOnSwipe.setSpringBoundary(map5);
        createOnSwipe.setRotationCenterId(stringOrNull3);
    }

    private static void set(TypedBundle typedBundle, int i11, CLArray cLArray, int i12) throws CLParsingException {
        if (cLArray != null) {
            typedBundle.add(i11, cLArray.getFloat(i12));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void parse(@NonNull CLObject cLObject, @NonNull Transition transition) throws CLParsingException {
        transition.resetProperties();
        String stringOrNull = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        TypedBundle typedBundle = new TypedBundle();
        boolean z11 = true;
        boolean z12 = false;
        if (stringOrNull != null) {
            switch (stringOrNull) {
                case "startVertical":
                    typedBundle.add(509, 1);
                    break;
                case "startHorizontal":
                    typedBundle.add(509, 2);
                    break;
                case "flip":
                    typedBundle.add(509, 3);
                    break;
                case "none":
                    typedBundle.add(509, 0);
                    break;
                case "above":
                    typedBundle.add(509, 5);
                    break;
                case "below":
                    typedBundle.add(509, 4);
                    break;
            }
            z12 = true;
        }
        String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
            z12 = true;
        }
        float floatOrNaN = cLObject.getFloatOrNaN(TypedValues.TransitionType.S_STAGGERED);
        if (Float.isNaN(floatOrNaN)) {
            z11 = z12;
        } else {
            typedBundle.add(TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        }
        if (z11) {
            transition.setTransitionProperties(typedBundle);
        }
        CLObject objectOrNull = cLObject.getObjectOrNull("onSwipe");
        if (objectOrNull != null) {
            parseOnSwipe(objectOrNull, transition);
        }
        parseKeyFrames(cLObject, transition);
    }

    private static void map(TypedBundle typedBundle, int i11, String str, String... strArr) {
        for (int i12 = 0; i12 < strArr.length; i12++) {
            if (strArr[i12].equals(str)) {
                typedBundle.add(i11, i12);
            }
        }
    }
}
