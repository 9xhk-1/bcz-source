package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class WidgetFrame {
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    private final HashMap<String, CustomVariable> mCustom;
    TypedBundle mMotionProperties;
    public String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public ConstraintWidget widget;

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
    }

    private static void add(StringBuilder sb2, String str, int i11) {
        sb2.append(str);
        sb2.append(": ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    public static void interpolate(int i11, int i12, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, WidgetFrame widgetFrame3, Transition transition, float f11) {
        int i13;
        int i14;
        int i15;
        float f12;
        int i16;
        float f13;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        float f14 = 100.0f * f11;
        int i23 = (int) f14;
        int i24 = widgetFrame2.left;
        int i25 = widgetFrame2.top;
        int i26 = widgetFrame3.left;
        int i27 = widgetFrame3.top;
        int i28 = widgetFrame2.right - i24;
        int i29 = widgetFrame2.bottom - i25;
        int i31 = widgetFrame3.right - i26;
        int i32 = widgetFrame3.bottom - i27;
        int i33 = i24;
        float f15 = widgetFrame2.alpha;
        float f16 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            int i34 = i33 - ((int) (i31 / 2.0f));
            i15 = i25 - ((int) (i32 / 2.0f));
            if (Float.isNaN(f15)) {
                i13 = i32;
                i33 = i34;
                i14 = i31;
                f12 = 0.0f;
            } else {
                i33 = i34;
                i14 = i31;
                f12 = f15;
                i13 = i32;
            }
        } else {
            i13 = i32;
            i32 = i29;
            i14 = i28;
            i15 = i25;
            f12 = f15;
        }
        if (widgetFrame3.visibility == 8) {
            i26 -= (int) (i14 / 2.0f);
            i27 -= (int) (i32 / 2.0f);
            if (Float.isNaN(f16)) {
                i16 = i32;
                i31 = i14;
                f16 = 0.0f;
            } else {
                i16 = i32;
                i31 = i14;
            }
        } else {
            i16 = i13;
        }
        if (Float.isNaN(f12) && !Float.isNaN(f16)) {
            f12 = 1.0f;
        }
        if (!Float.isNaN(f12) && Float.isNaN(f16)) {
            f16 = 1.0f;
        }
        int i35 = i26;
        float f17 = widgetFrame2.visibility == 4 ? 0.0f : f12;
        int i36 = i27;
        float f18 = widgetFrame3.visibility == 4 ? 0.0f : f16;
        if (widgetFrame.widget == null || !transition.hasPositionKeyframes()) {
            f13 = f11;
            i17 = i35;
            i18 = i36;
            i19 = i15;
        } else {
            Transition.KeyPosition findPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i23);
            int i37 = i15;
            Transition.KeyPosition findNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i23);
            if (findPreviousPosition == findNextPosition) {
                findNextPosition = null;
            }
            if (findPreviousPosition != null) {
                i33 = (int) (findPreviousPosition.mX * i11);
                i19 = (int) (findPreviousPosition.mY * i12);
                i21 = findPreviousPosition.mFrame;
            } else {
                i21 = 0;
                i19 = i37;
            }
            if (findNextPosition != null) {
                i17 = (int) (findNextPosition.mX * i11);
                i18 = (int) (findNextPosition.mY * i12);
                i22 = findNextPosition.mFrame;
            } else {
                i22 = 100;
                i17 = i35;
                i18 = i36;
            }
            f13 = (f14 - i21) / (i22 - i21);
        }
        int i38 = i33;
        widgetFrame.widget = widgetFrame2.widget;
        int i39 = (int) (i38 + ((i17 - i38) * f13));
        widgetFrame.left = i39;
        int i41 = (int) (i19 + (f13 * (i18 - i19)));
        widgetFrame.top = i41;
        float f19 = 1.0f - f11;
        widgetFrame.right = i39 + ((int) ((i14 * f19) + (i31 * f11)));
        widgetFrame.bottom = i41 + ((int) ((f19 * i32) + (i16 * f11)));
        widgetFrame.pivotX = interpolate(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f11);
        widgetFrame.pivotY = interpolate(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f11);
        widgetFrame.rotationX = interpolate(widgetFrame2.rotationX, widgetFrame3.rotationX, 0.0f, f11);
        widgetFrame.rotationY = interpolate(widgetFrame2.rotationY, widgetFrame3.rotationY, 0.0f, f11);
        widgetFrame.rotationZ = interpolate(widgetFrame2.rotationZ, widgetFrame3.rotationZ, 0.0f, f11);
        widgetFrame.scaleX = interpolate(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f11);
        widgetFrame.scaleY = interpolate(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f11);
        widgetFrame.translationX = interpolate(widgetFrame2.translationX, widgetFrame3.translationX, 0.0f, f11);
        widgetFrame.translationY = interpolate(widgetFrame2.translationY, widgetFrame3.translationY, 0.0f, f11);
        widgetFrame.translationZ = interpolate(widgetFrame2.translationZ, widgetFrame3.translationZ, 0.0f, f11);
        widgetFrame.alpha = interpolate(f17, f18, 1.0f, f11);
        Set<String> keySet = widgetFrame3.mCustom.keySet();
        widgetFrame.mCustom.clear();
        for (String str : keySet) {
            if (widgetFrame2.mCustom.containsKey(str)) {
                CustomVariable customVariable = widgetFrame2.mCustom.get(str);
                CustomVariable customVariable2 = widgetFrame3.mCustom.get(str);
                CustomVariable customVariable3 = new CustomVariable(customVariable);
                widgetFrame.mCustom.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(Float.valueOf(interpolate(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), 0.0f, f11)));
                } else {
                    int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[numberOfInterpolatedValues];
                    float[] fArr2 = new float[numberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i42 = 0; i42 < numberOfInterpolatedValues; i42++) {
                        fArr[i42] = interpolate(fArr[i42], fArr2[i42], 0.0f, f11);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    private void serializeAnchor(StringBuilder sb2, ConstraintAnchor.Type type) {
        ConstraintAnchor anchor = this.widget.getAnchor(type);
        if (anchor == null || anchor.mTarget == null) {
            return;
        }
        sb2.append("Anchor");
        sb2.append(type.name());
        sb2.append(": ['");
        String str = anchor.mTarget.getOwner().stringId;
        if (str == null) {
            str = "#PARENT";
        }
        sb2.append(str);
        sb2.append("', '");
        sb2.append(anchor.mTarget.getType().name());
        sb2.append("', '");
        sb2.append(anchor.mMargin);
        sb2.append("'],\n");
    }

    public void addCustomColor(String str, int i11) {
        setCustomAttribute(str, 902, i11);
    }

    public void addCustomFloat(String str, float f11) {
        setCustomAttribute(str, 901, f11);
    }

    public float centerX() {
        return this.left + ((this.right - r0) / 2.0f);
    }

    public float centerY() {
        return this.top + ((this.bottom - r0) / 2.0f);
    }

    public boolean containsCustom(@NonNull String str) {
        return this.mCustom.containsKey(str);
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.mCustom.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.mCustom.keySet();
    }

    public int getCustomColor(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getColorValue();
        }
        return -21880;
    }

    public float getCustomFloat(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public String getId() {
        ConstraintWidget constraintWidget = this.widget;
        return constraintWidget == null ? "unknown" : constraintWidget.stringId;
    }

    public TypedBundle getMotionProperties() {
        return this.mMotionProperties;
    }

    public int height() {
        return Math.max(0, this.bottom - this.top);
    }

    public boolean isDefaultTransform() {
        return Float.isNaN(this.rotationX) && Float.isNaN(this.rotationY) && Float.isNaN(this.rotationZ) && Float.isNaN(this.translationX) && Float.isNaN(this.translationY) && Float.isNaN(this.translationZ) && Float.isNaN(this.scaleX) && Float.isNaN(this.scaleY) && Float.isNaN(this.alpha);
    }

    public void logv(String str) {
        String str2;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str3 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            str2 = str3 + "/" + (this.widget.hashCode() % 1000);
        } else {
            str2 = str3 + "/NULL";
        }
        System.out.println(str2 + " " + str);
    }

    public void parseCustom(CLElement cLElement) throws CLParsingException {
        CLObject cLObject = (CLObject) cLElement;
        int size = cLObject.size();
        for (int i11 = 0; i11 < size; i11++) {
            CLElement value = ((CLKey) cLObject.get(i11)).getValue();
            String content = value.content();
            if (content.matches("#[0-9a-fA-F]+")) {
                setCustomAttribute(this.name, 902, Integer.parseInt(content.substring(1), 16));
            } else if (value instanceof CLNumber) {
                setCustomAttribute(this.name, 901, value.getFloat());
            } else {
                setCustomAttribute(this.name, TypedValues.Custom.TYPE_STRING, content);
            }
        }
    }

    public void printCustomAttributes() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        String str2 = this.widget != null ? str + "/" + (this.widget.hashCode() % 1000) + " " : str + "/NULL ";
        HashMap<String, CustomVariable> hashMap = this.mCustom;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                System.out.println(str2 + this.mCustom.get(str3).toString());
            }
        }
    }

    public StringBuilder serialize(StringBuilder sb2) {
        return serialize(sb2, false);
    }

    public void setCustomAttribute(String str, int i11, float f11) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setFloatValue(f11);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i11, f11));
        }
    }

    public void setMotionAttributes(TypedBundle typedBundle) {
        this.mMotionProperties = typedBundle;
    }

    public boolean setValue(String str, CLElement cLElement) throws CLParsingException {
        str.getClass();
        switch (str) {
            case "phone_orientation":
                phone_orientation = cLElement.getFloat();
                return true;
            case "bottom":
                this.bottom = cLElement.getInt();
                return true;
            case "custom":
                parseCustom(cLElement);
                return true;
            case "rotationX":
                this.rotationX = cLElement.getFloat();
                return true;
            case "rotationY":
                this.rotationY = cLElement.getFloat();
                return true;
            case "rotationZ":
                this.rotationZ = cLElement.getFloat();
                return true;
            case "translationX":
                this.translationX = cLElement.getFloat();
                return true;
            case "translationY":
                this.translationY = cLElement.getFloat();
                return true;
            case "translationZ":
                this.translationZ = cLElement.getFloat();
                return true;
            case "pivotX":
                this.pivotX = cLElement.getFloat();
                return true;
            case "pivotY":
                this.pivotY = cLElement.getFloat();
                return true;
            case "scaleX":
                this.scaleX = cLElement.getFloat();
                return true;
            case "scaleY":
                this.scaleY = cLElement.getFloat();
                return true;
            case "top":
                this.top = cLElement.getInt();
                return true;
            case "left":
                this.left = cLElement.getInt();
                return true;
            case "alpha":
                this.alpha = cLElement.getFloat();
                return true;
            case "right":
                this.right = cLElement.getInt();
                return true;
            case "interpolatedPos":
                this.interpolatedPos = cLElement.getFloat();
                return true;
            default:
                return false;
        }
    }

    public WidgetFrame update() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public void updateAttributes(WidgetFrame widgetFrame) {
        if (widgetFrame == null) {
            return;
        }
        this.pivotX = widgetFrame.pivotX;
        this.pivotY = widgetFrame.pivotY;
        this.rotationX = widgetFrame.rotationX;
        this.rotationY = widgetFrame.rotationY;
        this.rotationZ = widgetFrame.rotationZ;
        this.translationX = widgetFrame.translationX;
        this.translationY = widgetFrame.translationY;
        this.translationZ = widgetFrame.translationZ;
        this.scaleX = widgetFrame.scaleX;
        this.scaleY = widgetFrame.scaleY;
        this.alpha = widgetFrame.alpha;
        this.visibility = widgetFrame.visibility;
        setMotionAttributes(widgetFrame.mMotionProperties);
        this.mCustom.clear();
        for (CustomVariable customVariable : widgetFrame.mCustom.values()) {
            this.mCustom.put(customVariable.getName(), customVariable.copy());
        }
    }

    public int width() {
        return Math.max(0, this.right - this.left);
    }

    public StringBuilder serialize(StringBuilder sb2, boolean z11) {
        sb2.append("{\n");
        add(sb2, TtmlNode.LEFT, this.left);
        add(sb2, "top", this.top);
        add(sb2, TtmlNode.RIGHT, this.right);
        add(sb2, "bottom", this.bottom);
        add(sb2, "pivotX", this.pivotX);
        add(sb2, "pivotY", this.pivotY);
        add(sb2, "rotationX", this.rotationX);
        add(sb2, "rotationY", this.rotationY);
        add(sb2, "rotationZ", this.rotationZ);
        add(sb2, "translationX", this.translationX);
        add(sb2, "translationY", this.translationY);
        add(sb2, "translationZ", this.translationZ);
        add(sb2, "scaleX", this.scaleX);
        add(sb2, "scaleY", this.scaleY);
        add(sb2, "alpha", this.alpha);
        add(sb2, "visibility", this.visibility);
        add(sb2, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                serializeAnchor(sb2, type);
            }
        }
        if (z11) {
            add(sb2, "phone_orientation", phone_orientation);
        }
        if (z11) {
            add(sb2, "phone_orientation", phone_orientation);
        }
        if (this.mCustom.size() != 0) {
            sb2.append("custom : {\n");
            for (String str : this.mCustom.keySet()) {
                CustomVariable customVariable = this.mCustom.get(str);
                sb2.append(str);
                sb2.append(": ");
                switch (customVariable.getType()) {
                    case 900:
                        sb2.append(customVariable.getIntegerValue());
                        sb2.append(",\n");
                        break;
                    case 901:
                    case TypedValues.Custom.TYPE_DIMENSION /* 905 */:
                        sb2.append(customVariable.getFloatValue());
                        sb2.append(",\n");
                        break;
                    case 902:
                        sb2.append("'");
                        sb2.append(CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb2.append("',\n");
                        break;
                    case TypedValues.Custom.TYPE_STRING /* 903 */:
                        sb2.append("'");
                        sb2.append(customVariable.getStringValue());
                        sb2.append("',\n");
                        break;
                    case TypedValues.Custom.TYPE_BOOLEAN /* 904 */:
                        sb2.append("'");
                        sb2.append(customVariable.getBooleanValue());
                        sb2.append("',\n");
                        break;
                }
            }
            sb2.append("}\n");
        }
        sb2.append("}\n");
        return sb2;
    }

    public void setCustomAttribute(String str, int i11, int i12) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setIntValue(i12);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i11, i12));
        }
    }

    private static void add(StringBuilder sb2, String str, float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f11);
        sb2.append(",\n");
    }

    public void setCustomAttribute(String str, int i11, boolean z11) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setBooleanValue(z11);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i11, z11));
        }
    }

    public WidgetFrame update(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public void setCustomAttribute(String str, int i11, String str2) {
        if (this.mCustom.containsKey(str)) {
            this.mCustom.get(str).setStringValue(str2);
        } else {
            this.mCustom.put(str, new CustomVariable(str, i11, str2));
        }
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = constraintWidget;
    }

    public void setCustomValue(CustomAttribute customAttribute, float[] fArr) {
    }

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }

    private static float interpolate(float f11, float f12, float f13, float f14) {
        boolean isNaN = Float.isNaN(f11);
        boolean isNaN2 = Float.isNaN(f12);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f11 = f13;
        }
        if (isNaN2) {
            f12 = f13;
        }
        return f11 + (f14 * (f12 - f11));
    }
}
